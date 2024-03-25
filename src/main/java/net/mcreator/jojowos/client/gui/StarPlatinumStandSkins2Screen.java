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

import net.mcreator.jojowos.world.inventory.StarPlatinumStandSkins2Menu;
import net.mcreator.jojowos.procedures.ReturnStarPlatinumOVAProcedure;
import net.mcreator.jojowos.procedures.ReturnStarPlatinumGreenProcedure;
import net.mcreator.jojowos.procedures.ReturnStarPlatinumBlueProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinStarPlatinumOVAProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinStarPlatinumNotEquippedOVAProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinStarPlatinumNotEquippedGreenProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinStarPlatinumNotEquippedBlueProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinStarPlatinumNoOVAProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinStarPlatinumNoGreenProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinStarPlatinumNoBlueProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinStarPlatinumGreenProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinStarPlatinumEquippedOVAProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinStarPlatinumEquippedGreenProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinStarPlatinumEquippedBlueProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinStarPlatinumBlueProcedure;
import net.mcreator.jojowos.procedures.ReturnNoSkinEntityProcedure;
import net.mcreator.jojowos.procedures.ReturnCostStarPlatinumOVAProcedure;
import net.mcreator.jojowos.procedures.ReturnCostStarPlatinumGreenProcedure;
import net.mcreator.jojowos.procedures.ReturnCostStarPlatinumBlueProcedure;
import net.mcreator.jojowos.network.StarPlatinumStandSkins2ButtonMessage;
import net.mcreator.jojowos.JojowosMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class StarPlatinumStandSkins2Screen extends AbstractContainerScreen<StarPlatinumStandSkins2Menu> {
	private final static HashMap<String, Object> guistate = StarPlatinumStandSkins2Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_standskin_equip1;
	ImageButton imagebutton_standskin_equip2;
	ImageButton imagebutton_standskin_equip3;
	ImageButton imagebutton_guiarrow_left;
	ImageButton imagebutton_guiarrow;

	public StarPlatinumStandSkins2Screen(StarPlatinumStandSkins2Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 1;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("jojowos:textures/screens/star_platinum_stand_skins_2.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		if (ReturnStarPlatinumOVAProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinStarPlatinumOVAProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + -96, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + -96 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0),
						livingEntity);
		}
		if (ReturnStarPlatinumBlueProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinStarPlatinumBlueProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 0, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + 0 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0), livingEntity);
		}
		if (ReturnStarPlatinumGreenProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinStarPlatinumGreenProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 96, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + 96 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0),
						livingEntity);
		}
		if (ReturnNoSkinEntityProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinStarPlatinumNoOVAProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + -96, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + -96 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0),
						livingEntity);
		}
		if (ReturnNoSkinEntityProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinStarPlatinumNoBlueProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 0, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + 0 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0), livingEntity);
		}
		if (ReturnNoSkinEntityProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinStarPlatinumNoGreenProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 96, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + 96 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0),
						livingEntity);
		}
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (ReturnSkinStarPlatinumNoOVAProcedure.execute(entity))
			if (mouseX > leftPos + -106 && mouseX < leftPos + -86 && mouseY > topPos + 77 && mouseY < topPos + 101)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.star_platinum_stand_skins_2.tooltip_locked_ova"), mouseX, mouseY);
		if (ReturnSkinStarPlatinumNotEquippedOVAProcedure.execute(entity))
			if (mouseX > leftPos + -124 && mouseX < leftPos + -68 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.literal(ReturnCostStarPlatinumOVAProcedure.execute()), mouseX, mouseY);
		if (ReturnSkinStarPlatinumEquippedOVAProcedure.execute(entity))
			if (mouseX > leftPos + -124 && mouseX < leftPos + -68 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.star_platinum_stand_skins_2.tooltip_equipped_ova"), mouseX, mouseY);
		if (ReturnSkinStarPlatinumNoBlueProcedure.execute(entity))
			if (mouseX > leftPos + -10 && mouseX < leftPos + 10 && mouseY > topPos + 77 && mouseY < topPos + 101)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.star_platinum_stand_skins_2.tooltip_locked_blue"), mouseX, mouseY);
		if (ReturnSkinStarPlatinumNotEquippedBlueProcedure.execute(entity))
			if (mouseX > leftPos + -28 && mouseX < leftPos + 28 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.literal(ReturnCostStarPlatinumBlueProcedure.execute()), mouseX, mouseY);
		if (ReturnSkinStarPlatinumEquippedBlueProcedure.execute(entity))
			if (mouseX > leftPos + -28 && mouseX < leftPos + 28 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.star_platinum_stand_skins_2.tooltip_equipped_blue"), mouseX, mouseY);
		if (ReturnSkinStarPlatinumNoGreenProcedure.execute(entity))
			if (mouseX > leftPos + 86 && mouseX < leftPos + 106 && mouseY > topPos + 77 && mouseY < topPos + 101)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.star_platinum_stand_skins_2.tooltip_locked_green"), mouseX, mouseY);
		if (ReturnSkinStarPlatinumNotEquippedGreenProcedure.execute(entity))
			if (mouseX > leftPos + 68 && mouseX < leftPos + 124 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.literal(ReturnCostStarPlatinumGreenProcedure.execute()), mouseX, mouseY);
		if (ReturnSkinStarPlatinumEquippedGreenProcedure.execute(entity))
			if (mouseX > leftPos + 68 && mouseX < leftPos + 124 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.star_platinum_stand_skins_2.tooltip_equipped_green"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standskin_gui_3.png"), this.leftPos + -213, this.topPos + -120, 0, 0, 427, 240, 427, 240);

		if (ReturnSkinStarPlatinumEquippedOVAProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standskin_equipped.png"), this.leftPos + -126, this.topPos + 80, 0, 0, 60, 19, 60, 19);
		}
		if (ReturnSkinStarPlatinumEquippedBlueProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standskin_equipped.png"), this.leftPos + -30, this.topPos + 80, 0, 0, 60, 19, 60, 19);
		}
		if (ReturnSkinStarPlatinumEquippedGreenProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standskin_equipped.png"), this.leftPos + 66, this.topPos + 80, 0, 0, 60, 19, 60, 19);
		}
		if (ReturnSkinStarPlatinumNoOVAProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skilltree_lock.png"), this.leftPos + -107, this.topPos + 76, 0, 0, 22, 26, 22, 26);
		}
		if (ReturnSkinStarPlatinumNoBlueProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skilltree_lock.png"), this.leftPos + -11, this.topPos + 76, 0, 0, 22, 26, 22, 26);
		}
		if (ReturnSkinStarPlatinumNoGreenProcedure.execute(entity)) {
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
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_standskin_equip1 = new ImageButton(this.leftPos + -126, this.topPos + 80, 60, 19, 0, 0, 19, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_standskin_equip1.png"), 60, 38, e -> {
			if (ReturnSkinStarPlatinumNotEquippedOVAProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new StarPlatinumStandSkins2ButtonMessage(0, x, y, z));
				StarPlatinumStandSkins2ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnSkinStarPlatinumNotEquippedOVAProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_standskin_equip1", imagebutton_standskin_equip1);
		this.addRenderableWidget(imagebutton_standskin_equip1);
		imagebutton_standskin_equip2 = new ImageButton(this.leftPos + -30, this.topPos + 80, 60, 19, 0, 0, 19, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_standskin_equip2.png"), 60, 38, e -> {
			if (ReturnSkinStarPlatinumNotEquippedBlueProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new StarPlatinumStandSkins2ButtonMessage(1, x, y, z));
				StarPlatinumStandSkins2ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnSkinStarPlatinumNotEquippedBlueProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_standskin_equip2", imagebutton_standskin_equip2);
		this.addRenderableWidget(imagebutton_standskin_equip2);
		imagebutton_standskin_equip3 = new ImageButton(this.leftPos + 66, this.topPos + 80, 60, 19, 0, 0, 19, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_standskin_equip3.png"), 60, 38, e -> {
			if (ReturnSkinStarPlatinumNotEquippedGreenProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new StarPlatinumStandSkins2ButtonMessage(2, x, y, z));
				StarPlatinumStandSkins2ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnSkinStarPlatinumNotEquippedGreenProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_standskin_equip3", imagebutton_standskin_equip3);
		this.addRenderableWidget(imagebutton_standskin_equip3);
		imagebutton_guiarrow_left = new ImageButton(this.leftPos + -156, this.topPos + -11, 13, 19, 0, 0, 19, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_guiarrow_left.png"), 13, 38, e -> {
			if (true) {
				JojowosMod.PACKET_HANDLER.sendToServer(new StarPlatinumStandSkins2ButtonMessage(3, x, y, z));
				StarPlatinumStandSkins2ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_guiarrow_left", imagebutton_guiarrow_left);
		this.addRenderableWidget(imagebutton_guiarrow_left);
		imagebutton_guiarrow = new ImageButton(this.leftPos + 143, this.topPos + -10, 13, 19, 0, 0, 19, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_guiarrow.png"), 13, 38, e -> {
			if (true) {
				JojowosMod.PACKET_HANDLER.sendToServer(new StarPlatinumStandSkins2ButtonMessage(4, x, y, z));
				StarPlatinumStandSkins2ButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_guiarrow", imagebutton_guiarrow);
		this.addRenderableWidget(imagebutton_guiarrow);
	}
}
