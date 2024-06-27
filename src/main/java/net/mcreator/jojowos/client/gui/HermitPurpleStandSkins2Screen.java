package net.mcreator.jojowos.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.jojowos.world.inventory.HermitPurpleStandSkins2Menu;
import net.mcreator.jojowos.procedures.ReturnSkinHermitPurpleRedProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinHermitPurpleNotEquippedRedProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinHermitPurpleNotEquippedGoldProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinHermitPurpleNotEquippedBlueProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinHermitPurpleNoRedProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinHermitPurpleNoGoldProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinHermitPurpleNoBlueProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinHermitPurpleGoldProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinHermitPurpleEquippedRedProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinHermitPurpleEquippedGoldProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinHermitPurpleEquippedBlueProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinHermitPurpleBlueProcedure;
import net.mcreator.jojowos.procedures.ReturnNoSkinEntityProcedure;
import net.mcreator.jojowos.procedures.ReturnHermitPurpleRedProcedure;
import net.mcreator.jojowos.procedures.ReturnHermitPurpleGoldProcedure;
import net.mcreator.jojowos.procedures.ReturnHermitPurpleBlueProcedure;
import net.mcreator.jojowos.procedures.ReturnCostHermitPurpleRedProcedure;
import net.mcreator.jojowos.procedures.ReturnCostHermitPurpleGoldProcedure;
import net.mcreator.jojowos.procedures.ReturnCostHermitPurpleBlueProcedure;
import net.mcreator.jojowos.network.HermitPurpleStandSkins2ButtonMessage;
import net.mcreator.jojowos.JojowosMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class HermitPurpleStandSkins2Screen extends AbstractContainerScreen<HermitPurpleStandSkins2Menu> {
	private final static HashMap<String, Object> guistate = HermitPurpleStandSkins2Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_standskin_equip;
	ImageButton imagebutton_standskin_equip1;
	ImageButton imagebutton_standskin_equip2;
	ImageButton imagebutton_guiarrow_left;
	ImageButton imagebutton_guiarrow;

	public HermitPurpleStandSkins2Screen(HermitPurpleStandSkins2Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 1;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("jojowos:textures/screens/hermit_purple_stand_skins_2.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		if (ReturnNoSkinEntityProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinHermitPurpleNoRedProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + -96, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + -96 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0),
						livingEntity);
		}
		if (ReturnNoSkinEntityProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinHermitPurpleNoBlueProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 0, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + 0 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0), livingEntity);
		}
		if (ReturnNoSkinEntityProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinHermitPurpleNoGoldProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 97, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + 97 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0),
						livingEntity);
		}
		if (ReturnHermitPurpleRedProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinHermitPurpleRedProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + -96, this.topPos + 44, 100, 0f + (float) Math.atan((this.leftPos + -96 - mouseX) / 40.0), (float) Math.atan((this.topPos + -5 - mouseY) / 40.0),
						livingEntity);
		}
		if (ReturnHermitPurpleBlueProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinHermitPurpleBlueProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 0, this.topPos + 44, 100, 0f + (float) Math.atan((this.leftPos + 0 - mouseX) / 40.0), (float) Math.atan((this.topPos + -5 - mouseY) / 40.0),
						livingEntity);
		}
		if (ReturnHermitPurpleGoldProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinHermitPurpleGoldProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 96, this.topPos + 44, 100, 0f + (float) Math.atan((this.leftPos + 96 - mouseX) / 40.0), (float) Math.atan((this.topPos + -5 - mouseY) / 40.0),
						livingEntity);
		}
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (ReturnSkinHermitPurpleNoRedProcedure.execute(entity))
			if (mouseX > leftPos + -106 && mouseX < leftPos + -86 && mouseY > topPos + 77 && mouseY < topPos + 101)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.hermit_purple_stand_skins_2.tooltip_locked_red"), mouseX, mouseY);
		if (ReturnSkinHermitPurpleNoBlueProcedure.execute(entity))
			if (mouseX > leftPos + -10 && mouseX < leftPos + 10 && mouseY > topPos + 77 && mouseY < topPos + 101)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.hermit_purple_stand_skins_2.tooltip_locked_blue"), mouseX, mouseY);
		if (ReturnSkinHermitPurpleNoGoldProcedure.execute(entity))
			if (mouseX > leftPos + 86 && mouseX < leftPos + 106 && mouseY > topPos + 77 && mouseY < topPos + 101)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.hermit_purple_stand_skins_2.tooltip_locked_gold"), mouseX, mouseY);
		if (ReturnSkinHermitPurpleNotEquippedRedProcedure.execute(entity))
			if (mouseX > leftPos + -124 && mouseX < leftPos + -68 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.literal(ReturnCostHermitPurpleRedProcedure.execute()), mouseX, mouseY);
		if (ReturnSkinHermitPurpleNotEquippedBlueProcedure.execute(entity))
			if (mouseX > leftPos + -28 && mouseX < leftPos + 28 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.literal(ReturnCostHermitPurpleBlueProcedure.execute()), mouseX, mouseY);
		if (ReturnSkinHermitPurpleNotEquippedGoldProcedure.execute(entity))
			if (mouseX > leftPos + 68 && mouseX < leftPos + 124 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.literal(ReturnCostHermitPurpleGoldProcedure.execute()), mouseX, mouseY);
		if (ReturnSkinHermitPurpleEquippedRedProcedure.execute(entity))
			if (mouseX > leftPos + -124 && mouseX < leftPos + -68 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.hermit_purple_stand_skins_2.tooltip_equipped_red"), mouseX, mouseY);
		if (ReturnSkinHermitPurpleEquippedBlueProcedure.execute(entity))
			if (mouseX > leftPos + -29 && mouseX < leftPos + 27 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.hermit_purple_stand_skins_2.tooltip_equipped_blue"), mouseX, mouseY);
		if (ReturnSkinHermitPurpleEquippedGoldProcedure.execute(entity))
			if (mouseX > leftPos + 68 && mouseX < leftPos + 124 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.hermit_purple_stand_skins_2.tooltip_equipped_gold"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standskin_gui_3.png"), this.leftPos + -213, this.topPos + -120, 0, 0, 427, 240, 427, 240);

		if (ReturnSkinHermitPurpleEquippedRedProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standskin_equipped.png"), this.leftPos + -126, this.topPos + 80, 0, 0, 60, 19, 60, 19);
		}
		if (ReturnSkinHermitPurpleEquippedBlueProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standskin_equipped.png"), this.leftPos + -30, this.topPos + 80, 0, 0, 60, 19, 60, 19);
		}
		if (ReturnSkinHermitPurpleEquippedGoldProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standskin_equipped.png"), this.leftPos + 66, this.topPos + 80, 0, 0, 60, 19, 60, 19);
		}
		if (ReturnSkinHermitPurpleNoRedProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skilltree_lock.png"), this.leftPos + -107, this.topPos + 76, 0, 0, 22, 26, 22, 26);
		}
		if (ReturnSkinHermitPurpleNoBlueProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skilltree_lock.png"), this.leftPos + -11, this.topPos + 76, 0, 0, 22, 26, 22, 26);
		}
		if (ReturnSkinHermitPurpleNoGoldProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skilltree_lock.png"), this.leftPos + 85, this.topPos + 76, 0, 0, 22, 26, 22, 26);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		imagebutton_standskin_equip = new ImageButton(this.leftPos + -126, this.topPos + 80, 60, 19, 0, 0, 19, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_standskin_equip.png"), 60, 38, e -> {
			if (ReturnSkinHermitPurpleNotEquippedRedProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new HermitPurpleStandSkins2ButtonMessage(0, x, y, z));
				HermitPurpleStandSkins2ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnSkinHermitPurpleNotEquippedRedProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_standskin_equip", imagebutton_standskin_equip);
		this.addRenderableWidget(imagebutton_standskin_equip);
		imagebutton_standskin_equip1 = new ImageButton(this.leftPos + -30, this.topPos + 80, 60, 19, 0, 0, 19, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_standskin_equip1.png"), 60, 38, e -> {
			if (ReturnSkinHermitPurpleNotEquippedBlueProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new HermitPurpleStandSkins2ButtonMessage(1, x, y, z));
				HermitPurpleStandSkins2ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnSkinHermitPurpleNotEquippedBlueProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_standskin_equip1", imagebutton_standskin_equip1);
		this.addRenderableWidget(imagebutton_standskin_equip1);
		imagebutton_standskin_equip2 = new ImageButton(this.leftPos + 66, this.topPos + 80, 60, 19, 0, 0, 19, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_standskin_equip2.png"), 60, 38, e -> {
			if (ReturnSkinHermitPurpleNotEquippedGoldProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new HermitPurpleStandSkins2ButtonMessage(2, x, y, z));
				HermitPurpleStandSkins2ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnSkinHermitPurpleNotEquippedGoldProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_standskin_equip2", imagebutton_standskin_equip2);
		this.addRenderableWidget(imagebutton_standskin_equip2);
		imagebutton_guiarrow_left = new ImageButton(this.leftPos + -156, this.topPos + -10, 13, 19, 0, 0, 19, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_guiarrow_left.png"), 13, 38, e -> {
			if (true) {
				JojowosMod.PACKET_HANDLER.sendToServer(new HermitPurpleStandSkins2ButtonMessage(3, x, y, z));
				HermitPurpleStandSkins2ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_guiarrow_left", imagebutton_guiarrow_left);
		this.addRenderableWidget(imagebutton_guiarrow_left);
		imagebutton_guiarrow = new ImageButton(this.leftPos + 143, this.topPos + -10, 13, 19, 0, 0, 19, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_guiarrow.png"), 13, 38, e -> {
			if (true) {
				JojowosMod.PACKET_HANDLER.sendToServer(new HermitPurpleStandSkins2ButtonMessage(4, x, y, z));
				HermitPurpleStandSkins2ButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_guiarrow", imagebutton_guiarrow);
		this.addRenderableWidget(imagebutton_guiarrow);
	}
}
