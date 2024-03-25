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

import net.mcreator.jojowos.world.inventory.MagiciansRedStandSkins1Menu;
import net.mcreator.jojowos.procedures.ReturnSkinMagiciansRedOVAProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinMagiciansRedNotEquippedOVAProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinMagiciansRedNotEquippedMangaProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinMagiciansRedNotEquippedBaseProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinMagiciansRedNoOVAProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinMagiciansRedNoMangaProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinMagiciansRedMangaProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinMagiciansRedEquippedOVAProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinMagiciansRedEquippedMangaProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinMagiciansRedEquippedBaseProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinMagiciansRedBaseProcedure;
import net.mcreator.jojowos.procedures.ReturnNoSkinEntityProcedure;
import net.mcreator.jojowos.procedures.ReturnMagiciansRedOVAProcedure;
import net.mcreator.jojowos.procedures.ReturnMagiciansRedMangaProcedure;
import net.mcreator.jojowos.procedures.ReturnMagiciansRedBaseProcedure;
import net.mcreator.jojowos.procedures.ReturnCostMagiciansRedOVAProcedure;
import net.mcreator.jojowos.procedures.ReturnCostMagiciansRedMangaProcedure;
import net.mcreator.jojowos.procedures.ReturnCostMagiciansRedBaseProcedure;
import net.mcreator.jojowos.network.MagiciansRedStandSkins1ButtonMessage;
import net.mcreator.jojowos.JojowosMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class MagiciansRedStandSkins1Screen extends AbstractContainerScreen<MagiciansRedStandSkins1Menu> {
	private final static HashMap<String, Object> guistate = MagiciansRedStandSkins1Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_standskin_equip;
	ImageButton imagebutton_standskin_equip1;
	ImageButton imagebutton_standskin_equip2;
	ImageButton imagebutton_guiarrow_left;
	ImageButton imagebutton_guiarrow;

	public MagiciansRedStandSkins1Screen(MagiciansRedStandSkins1Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 1;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("jojowos:textures/screens/magicians_red_stand_skins_1.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		if (ReturnMagiciansRedBaseProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinMagiciansRedBaseProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + -96, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + -96 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0),
						livingEntity);
		}
		if (ReturnMagiciansRedMangaProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinMagiciansRedMangaProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 0, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + 0 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0), livingEntity);
		}
		if (ReturnNoSkinEntityProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinMagiciansRedNoMangaProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 0, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + 0 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0), livingEntity);
		}
		if (ReturnMagiciansRedOVAProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinMagiciansRedOVAProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 96, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + 96 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0),
						livingEntity);
		}
		if (ReturnNoSkinEntityProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinMagiciansRedNoOVAProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 96, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + 96 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0),
						livingEntity);
		}
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (ReturnSkinMagiciansRedEquippedBaseProcedure.execute(entity))
			if (mouseX > leftPos + -124 && mouseX < leftPos + -68 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.magicians_red_stand_skins_1.tooltip_equipped_base"), mouseX, mouseY);
		if (ReturnSkinMagiciansRedNotEquippedBaseProcedure.execute(entity))
			if (mouseX > leftPos + -124 && mouseX < leftPos + -68 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.literal(ReturnCostMagiciansRedBaseProcedure.execute()), mouseX, mouseY);
		if (ReturnSkinMagiciansRedEquippedMangaProcedure.execute(entity))
			if (mouseX > leftPos + -28 && mouseX < leftPos + 28 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.magicians_red_stand_skins_1.tooltip_equipped_manga"), mouseX, mouseY);
		if (ReturnSkinMagiciansRedNotEquippedMangaProcedure.execute(entity))
			if (mouseX > leftPos + -28 && mouseX < leftPos + 28 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.literal(ReturnCostMagiciansRedMangaProcedure.execute()), mouseX, mouseY);
		if (ReturnSkinMagiciansRedNoMangaProcedure.execute(entity))
			if (mouseX > leftPos + -10 && mouseX < leftPos + 10 && mouseY > topPos + 77 && mouseY < topPos + 101)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.magicians_red_stand_skins_1.tooltip_locked_manga"), mouseX, mouseY);
		if (ReturnSkinMagiciansRedEquippedOVAProcedure.execute(entity))
			if (mouseX > leftPos + 68 && mouseX < leftPos + 124 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.magicians_red_stand_skins_1.tooltip_equipped_ova"), mouseX, mouseY);
		if (ReturnSkinMagiciansRedNotEquippedOVAProcedure.execute(entity))
			if (mouseX > leftPos + 68 && mouseX < leftPos + 124 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.literal(ReturnCostMagiciansRedOVAProcedure.execute()), mouseX, mouseY);
		if (ReturnSkinMagiciansRedNoOVAProcedure.execute(entity))
			if (mouseX > leftPos + 86 && mouseX < leftPos + 106 && mouseY > topPos + 77 && mouseY < topPos + 101)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.magicians_red_stand_skins_1.tooltip_locked_ova"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standskin_gui_3.png"), this.leftPos + -213, this.topPos + -120, 0, 0, 427, 240, 427, 240);

		if (ReturnSkinMagiciansRedEquippedBaseProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standskin_equipped.png"), this.leftPos + -126, this.topPos + 80, 0, 0, 60, 19, 60, 19);
		}
		if (ReturnSkinMagiciansRedEquippedMangaProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standskin_equipped.png"), this.leftPos + -30, this.topPos + 80, 0, 0, 60, 19, 60, 19);
		}
		if (ReturnSkinMagiciansRedEquippedOVAProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standskin_equipped.png"), this.leftPos + 66, this.topPos + 80, 0, 0, 60, 19, 60, 19);
		}
		if (ReturnSkinMagiciansRedNoOVAProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skilltree_lock.png"), this.leftPos + 85, this.topPos + 76, 0, 0, 22, 26, 22, 26);
		}
		if (ReturnSkinMagiciansRedNoMangaProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skilltree_lock.png"), this.leftPos + -11, this.topPos + 76, 0, 0, 22, 26, 22, 26);
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
		imagebutton_standskin_equip = new ImageButton(this.leftPos + -126, this.topPos + 80, 60, 19, 0, 0, 19, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_standskin_equip.png"), 60, 38, e -> {
			if (ReturnSkinMagiciansRedNotEquippedBaseProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new MagiciansRedStandSkins1ButtonMessage(0, x, y, z));
				MagiciansRedStandSkins1ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnSkinMagiciansRedNotEquippedBaseProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_standskin_equip", imagebutton_standskin_equip);
		this.addRenderableWidget(imagebutton_standskin_equip);
		imagebutton_standskin_equip1 = new ImageButton(this.leftPos + -30, this.topPos + 80, 60, 19, 0, 0, 19, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_standskin_equip1.png"), 60, 38, e -> {
			if (ReturnSkinMagiciansRedNotEquippedMangaProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new MagiciansRedStandSkins1ButtonMessage(1, x, y, z));
				MagiciansRedStandSkins1ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnSkinMagiciansRedNotEquippedMangaProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_standskin_equip1", imagebutton_standskin_equip1);
		this.addRenderableWidget(imagebutton_standskin_equip1);
		imagebutton_standskin_equip2 = new ImageButton(this.leftPos + 66, this.topPos + 80, 60, 19, 0, 0, 19, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_standskin_equip2.png"), 60, 38, e -> {
			if (ReturnSkinMagiciansRedNotEquippedOVAProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new MagiciansRedStandSkins1ButtonMessage(2, x, y, z));
				MagiciansRedStandSkins1ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnSkinMagiciansRedNotEquippedOVAProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_standskin_equip2", imagebutton_standskin_equip2);
		this.addRenderableWidget(imagebutton_standskin_equip2);
		imagebutton_guiarrow_left = new ImageButton(this.leftPos + -156, this.topPos + -10, 13, 19, 0, 0, 19, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_guiarrow_left.png"), 13, 38, e -> {
			if (true) {
				JojowosMod.PACKET_HANDLER.sendToServer(new MagiciansRedStandSkins1ButtonMessage(3, x, y, z));
				MagiciansRedStandSkins1ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_guiarrow_left", imagebutton_guiarrow_left);
		this.addRenderableWidget(imagebutton_guiarrow_left);
		imagebutton_guiarrow = new ImageButton(this.leftPos + 143, this.topPos + -10, 13, 19, 0, 0, 19, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_guiarrow.png"), 13, 38, e -> {
			if (true) {
				JojowosMod.PACKET_HANDLER.sendToServer(new MagiciansRedStandSkins1ButtonMessage(4, x, y, z));
				MagiciansRedStandSkins1ButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_guiarrow", imagebutton_guiarrow);
		this.addRenderableWidget(imagebutton_guiarrow);
	}
}
