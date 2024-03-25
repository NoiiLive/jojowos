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

import net.mcreator.jojowos.world.inventory.HierophantGreenStandSkins1Menu;
import net.mcreator.jojowos.procedures.ReturnSkinHierophantGreenOVAProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinHierophantGreenNotEquippedOVAProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinHierophantGreenNotEquippedMangaProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinHierophantGreenNotEquippedBlueProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinHierophantGreenNotEquippedBaseProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinHierophantGreenNoOVAProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinHierophantGreenNoMangaProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinHierophantGreenNoBlueProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinHierophantGreenMangaProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinHierophantGreenEquippedOVAProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinHierophantGreenEquippedMangaProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinHierophantGreenEquippedBlueProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinHierophantGreenEquippedBaseProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinHierophantGreenBlueProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinHierophantGreenBaseProcedure;
import net.mcreator.jojowos.procedures.ReturnNoSkinEntityProcedure;
import net.mcreator.jojowos.procedures.ReturnHierophantGreenOVAProcedure;
import net.mcreator.jojowos.procedures.ReturnHierophantGreenMangaProcedure;
import net.mcreator.jojowos.procedures.ReturnHierophantGreenBlueProcedure;
import net.mcreator.jojowos.procedures.ReturnHierophantGreenBaseProcedure;
import net.mcreator.jojowos.procedures.ReturnCostHierophantGreenOVAProcedure;
import net.mcreator.jojowos.procedures.ReturnCostHierophantGreenMangaProcedure;
import net.mcreator.jojowos.procedures.ReturnCostHierophantGreenBlueProcedure;
import net.mcreator.jojowos.procedures.ReturnCostHierophantGreenBaseProcedure;
import net.mcreator.jojowos.network.HierophantGreenStandSkins1ButtonMessage;
import net.mcreator.jojowos.JojowosMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class HierophantGreenStandSkins1Screen extends AbstractContainerScreen<HierophantGreenStandSkins1Menu> {
	private final static HashMap<String, Object> guistate = HierophantGreenStandSkins1Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_standskin_equip;
	ImageButton imagebutton_standskin_equip1;
	ImageButton imagebutton_standskin_equip2;
	ImageButton imagebutton_standskin_equip3;

	public HierophantGreenStandSkins1Screen(HierophantGreenStandSkins1Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 1;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("jojowos:textures/screens/hierophant_green_stand_skins_1.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		if (ReturnHierophantGreenBaseProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinHierophantGreenBaseProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + -145, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + -145 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0),
						livingEntity);
		}
		if (ReturnHierophantGreenMangaProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinHierophantGreenMangaProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + -48, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + -48 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0),
						livingEntity);
		}
		if (ReturnNoSkinEntityProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinHierophantGreenNoMangaProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + -48, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + -48 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0),
						livingEntity);
		}
		if (ReturnHierophantGreenOVAProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinHierophantGreenOVAProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 48, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + 48 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0),
						livingEntity);
		}
		if (ReturnNoSkinEntityProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinHierophantGreenNoOVAProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 48, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + 48 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0),
						livingEntity);
		}
		if (ReturnHierophantGreenBlueProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinHierophantGreenBlueProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 144, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + 144 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0),
						livingEntity);
		}
		if (ReturnNoSkinEntityProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinHierophantGreenNoBlueProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 144, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + 144 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0),
						livingEntity);
		}
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (ReturnSkinHierophantGreenEquippedBaseProcedure.execute(entity))
			if (mouseX > leftPos + -172 && mouseX < leftPos + -116 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.hierophant_green_stand_skins_1.tooltip_equipped_base"), mouseX, mouseY);
		if (ReturnSkinHierophantGreenNotEquippedBaseProcedure.execute(entity))
			if (mouseX > leftPos + -172 && mouseX < leftPos + -116 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.literal(ReturnCostHierophantGreenBaseProcedure.execute()), mouseX, mouseY);
		if (ReturnSkinHierophantGreenEquippedMangaProcedure.execute(entity))
			if (mouseX > leftPos + -76 && mouseX < leftPos + -20 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.hierophant_green_stand_skins_1.tooltip_equipped_manga"), mouseX, mouseY);
		if (ReturnSkinHierophantGreenNotEquippedMangaProcedure.execute(entity))
			if (mouseX > leftPos + -76 && mouseX < leftPos + -20 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.literal(ReturnCostHierophantGreenMangaProcedure.execute()), mouseX, mouseY);
		if (ReturnSkinHierophantGreenNoMangaProcedure.execute(entity))
			if (mouseX > leftPos + -58 && mouseX < leftPos + -38 && mouseY > topPos + 78 && mouseY < topPos + 101)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.hierophant_green_stand_skins_1.tooltip_locked_manga"), mouseX, mouseY);
		if (ReturnSkinHierophantGreenEquippedOVAProcedure.execute(entity))
			if (mouseX > leftPos + 20 && mouseX < leftPos + 76 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.hierophant_green_stand_skins_1.tooltip_equipped_ova"), mouseX, mouseY);
		if (ReturnSkinHierophantGreenNotEquippedOVAProcedure.execute(entity))
			if (mouseX > leftPos + 20 && mouseX < leftPos + 76 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.literal(ReturnCostHierophantGreenOVAProcedure.execute()), mouseX, mouseY);
		if (ReturnSkinHierophantGreenNoOVAProcedure.execute(entity))
			if (mouseX > leftPos + 38 && mouseX < leftPos + 58 && mouseY > topPos + 77 && mouseY < topPos + 101)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.hierophant_green_stand_skins_1.tooltip_locked_ova"), mouseX, mouseY);
		if (ReturnSkinHierophantGreenEquippedBlueProcedure.execute(entity))
			if (mouseX > leftPos + 116 && mouseX < leftPos + 172 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.hierophant_green_stand_skins_1.tooltip_equipped_blue"), mouseX, mouseY);
		if (ReturnSkinHierophantGreenNotEquippedBlueProcedure.execute(entity))
			if (mouseX > leftPos + 116 && mouseX < leftPos + 172 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.literal(ReturnCostHierophantGreenBlueProcedure.execute()), mouseX, mouseY);
		if (ReturnSkinHierophantGreenNoBlueProcedure.execute(entity))
			if (mouseX > leftPos + 134 && mouseX < leftPos + 154 && mouseY > topPos + 77 && mouseY < topPos + 101)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.hierophant_green_stand_skins_1.tooltip_locked_blue"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standskin_maingui.png"), this.leftPos + -213, this.topPos + -120, 0, 0, 427, 240, 427, 240);

		if (ReturnSkinHierophantGreenEquippedBaseProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standskin_equipped.png"), this.leftPos + -174, this.topPos + 80, 0, 0, 60, 19, 60, 19);
		}
		if (ReturnSkinHierophantGreenEquippedMangaProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standskin_equipped.png"), this.leftPos + -78, this.topPos + 80, 0, 0, 60, 19, 60, 19);
		}
		if (ReturnSkinHierophantGreenEquippedOVAProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standskin_equipped.png"), this.leftPos + 18, this.topPos + 80, 0, 0, 60, 19, 60, 19);
		}
		if (ReturnSkinHierophantGreenEquippedBlueProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standskin_equipped.png"), this.leftPos + 114, this.topPos + 80, 0, 0, 60, 19, 60, 19);
		}
		if (ReturnSkinHierophantGreenNoMangaProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skilltree_lock.png"), this.leftPos + -59, this.topPos + 76, 0, 0, 22, 26, 22, 26);
		}
		if (ReturnSkinHierophantGreenNoOVAProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skilltree_lock.png"), this.leftPos + 37, this.topPos + 76, 0, 0, 22, 26, 22, 26);
		}
		if (ReturnSkinHierophantGreenNoBlueProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skilltree_lock.png"), this.leftPos + 133, this.topPos + 76, 0, 0, 22, 26, 22, 26);
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
		imagebutton_standskin_equip = new ImageButton(this.leftPos + -174, this.topPos + 80, 60, 19, 0, 0, 19, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_standskin_equip.png"), 60, 38, e -> {
			if (ReturnSkinHierophantGreenNotEquippedBaseProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new HierophantGreenStandSkins1ButtonMessage(0, x, y, z));
				HierophantGreenStandSkins1ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnSkinHierophantGreenNotEquippedBaseProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_standskin_equip", imagebutton_standskin_equip);
		this.addRenderableWidget(imagebutton_standskin_equip);
		imagebutton_standskin_equip1 = new ImageButton(this.leftPos + -78, this.topPos + 80, 60, 19, 0, 0, 19, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_standskin_equip1.png"), 60, 38, e -> {
			if (ReturnSkinHierophantGreenNotEquippedMangaProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new HierophantGreenStandSkins1ButtonMessage(1, x, y, z));
				HierophantGreenStandSkins1ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnSkinHierophantGreenNotEquippedMangaProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_standskin_equip1", imagebutton_standskin_equip1);
		this.addRenderableWidget(imagebutton_standskin_equip1);
		imagebutton_standskin_equip2 = new ImageButton(this.leftPos + 18, this.topPos + 80, 60, 19, 0, 0, 19, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_standskin_equip2.png"), 60, 38, e -> {
			if (ReturnSkinHierophantGreenNotEquippedOVAProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new HierophantGreenStandSkins1ButtonMessage(2, x, y, z));
				HierophantGreenStandSkins1ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnSkinHierophantGreenNotEquippedOVAProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_standskin_equip2", imagebutton_standskin_equip2);
		this.addRenderableWidget(imagebutton_standskin_equip2);
		imagebutton_standskin_equip3 = new ImageButton(this.leftPos + 114, this.topPos + 80, 60, 19, 0, 0, 19, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_standskin_equip3.png"), 60, 38, e -> {
			if (ReturnSkinHierophantGreenNotEquippedBlueProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new HierophantGreenStandSkins1ButtonMessage(3, x, y, z));
				HierophantGreenStandSkins1ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnSkinHierophantGreenNotEquippedBlueProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_standskin_equip3", imagebutton_standskin_equip3);
		this.addRenderableWidget(imagebutton_standskin_equip3);
	}
}
