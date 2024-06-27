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

import net.mcreator.jojowos.world.inventory.TheFoolStandSkins1Menu;
import net.mcreator.jojowos.procedures.ReturnTheFoolOVAProcedure;
import net.mcreator.jojowos.procedures.ReturnTheFoolMangaProcedure;
import net.mcreator.jojowos.procedures.ReturnTheFoolBaseProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinTheFoolOVAProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinTheFoolNotEquippedOVAProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinTheFoolNotEquippedMangaProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinTheFoolNotEquippedBaseProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinTheFoolNoOVAProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinTheFoolNoMangaProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinTheFoolMangaProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinTheFoolEquippedOVAProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinTheFoolEquippedMangaProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinTheFoolEquippedBaseProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinTheFoolBaseProcedure;
import net.mcreator.jojowos.procedures.ReturnNoSkinEntityProcedure;
import net.mcreator.jojowos.procedures.ReturnCostTheFoolOVAProcedure;
import net.mcreator.jojowos.procedures.ReturnCostTheFoolMangaProcedure;
import net.mcreator.jojowos.procedures.ReturnCostTheFoolBaseProcedure;
import net.mcreator.jojowos.network.TheFoolStandSkins1ButtonMessage;
import net.mcreator.jojowos.JojowosMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class TheFoolStandSkins1Screen extends AbstractContainerScreen<TheFoolStandSkins1Menu> {
	private final static HashMap<String, Object> guistate = TheFoolStandSkins1Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_standskin_equip;
	ImageButton imagebutton_standskin_equip1;
	ImageButton imagebutton_standskin_equip2;

	public TheFoolStandSkins1Screen(TheFoolStandSkins1Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 1;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("jojowos:textures/screens/the_fool_stand_skins_1.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		if (ReturnNoSkinEntityProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinTheFoolNoMangaProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 0, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + 0 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0), livingEntity);
		}
		if (ReturnNoSkinEntityProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinTheFoolNoOVAProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 96, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + 96 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0),
						livingEntity);
		}
		if (ReturnTheFoolBaseProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinTheFoolBaseProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + -97, this.topPos + 44, 35, 0f + (float) Math.atan((this.leftPos + -97 - mouseX) / 40.0), (float) Math.atan((this.topPos + -5 - mouseY) / 40.0),
						livingEntity);
		}
		if (ReturnTheFoolMangaProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinTheFoolMangaProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 0, this.topPos + 44, 35, 0f + (float) Math.atan((this.leftPos + 0 - mouseX) / 40.0), (float) Math.atan((this.topPos + -5 - mouseY) / 40.0), livingEntity);
		}
		if (ReturnTheFoolOVAProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinTheFoolOVAProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 96, this.topPos + 44, 35, 0f + (float) Math.atan((this.leftPos + 96 - mouseX) / 40.0), (float) Math.atan((this.topPos + -5 - mouseY) / 40.0),
						livingEntity);
		}
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (ReturnSkinTheFoolNoMangaProcedure.execute(entity))
			if (mouseX > leftPos + -10 && mouseX < leftPos + 10 && mouseY > topPos + 77 && mouseY < topPos + 101)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.the_fool_stand_skins_1.tooltip_locked_manga"), mouseX, mouseY);
		if (ReturnSkinTheFoolNoOVAProcedure.execute(entity))
			if (mouseX > leftPos + 86 && mouseX < leftPos + 106 && mouseY > topPos + 77 && mouseY < topPos + 101)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.the_fool_stand_skins_1.tooltip_locked_ova"), mouseX, mouseY);
		if (ReturnSkinTheFoolEquippedBaseProcedure.execute(entity))
			if (mouseX > leftPos + -124 && mouseX < leftPos + -68 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.the_fool_stand_skins_1.tooltip_equipped_base"), mouseX, mouseY);
		if (ReturnSkinTheFoolEquippedMangaProcedure.execute(entity))
			if (mouseX > leftPos + -28 && mouseX < leftPos + 28 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.the_fool_stand_skins_1.tooltip_equipped_manga"), mouseX, mouseY);
		if (ReturnSkinTheFoolEquippedOVAProcedure.execute(entity))
			if (mouseX > leftPos + 68 && mouseX < leftPos + 124 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.the_fool_stand_skins_1.tooltip_equipped_ova"), mouseX, mouseY);
		if (ReturnSkinTheFoolNotEquippedBaseProcedure.execute(entity))
			if (mouseX > leftPos + -124 && mouseX < leftPos + -68 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.literal(ReturnCostTheFoolBaseProcedure.execute()), mouseX, mouseY);
		if (ReturnSkinTheFoolNotEquippedMangaProcedure.execute(entity))
			if (mouseX > leftPos + -28 && mouseX < leftPos + 28 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.literal(ReturnCostTheFoolMangaProcedure.execute()), mouseX, mouseY);
		if (ReturnSkinTheFoolNotEquippedOVAProcedure.execute(entity))
			if (mouseX > leftPos + 68 && mouseX < leftPos + 124 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.literal(ReturnCostTheFoolOVAProcedure.execute()), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standskin_gui_3.png"), this.leftPos + -213, this.topPos + -120, 0, 0, 427, 240, 427, 240);

		if (ReturnSkinTheFoolEquippedBaseProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standskin_equipped.png"), this.leftPos + -126, this.topPos + 80, 0, 0, 60, 19, 60, 19);
		}
		if (ReturnSkinTheFoolEquippedMangaProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standskin_equipped.png"), this.leftPos + -30, this.topPos + 80, 0, 0, 60, 19, 60, 19);
		}
		if (ReturnSkinTheFoolEquippedOVAProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standskin_equipped.png"), this.leftPos + 66, this.topPos + 80, 0, 0, 60, 19, 60, 19);
		}
		if (ReturnSkinTheFoolNoMangaProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skilltree_lock.png"), this.leftPos + -11, this.topPos + 76, 0, 0, 22, 26, 22, 26);
		}
		if (ReturnSkinTheFoolNoOVAProcedure.execute(entity)) {
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
			if (ReturnSkinTheFoolNotEquippedBaseProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new TheFoolStandSkins1ButtonMessage(0, x, y, z));
				TheFoolStandSkins1ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnSkinTheFoolNotEquippedBaseProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_standskin_equip", imagebutton_standskin_equip);
		this.addRenderableWidget(imagebutton_standskin_equip);
		imagebutton_standskin_equip1 = new ImageButton(this.leftPos + -30, this.topPos + 80, 60, 19, 0, 0, 19, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_standskin_equip1.png"), 60, 38, e -> {
			if (ReturnSkinTheFoolNotEquippedMangaProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new TheFoolStandSkins1ButtonMessage(1, x, y, z));
				TheFoolStandSkins1ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnSkinTheFoolNotEquippedMangaProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_standskin_equip1", imagebutton_standskin_equip1);
		this.addRenderableWidget(imagebutton_standskin_equip1);
		imagebutton_standskin_equip2 = new ImageButton(this.leftPos + 66, this.topPos + 80, 60, 19, 0, 0, 19, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_standskin_equip2.png"), 60, 38, e -> {
			if (ReturnSkinTheFoolNotEquippedOVAProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new TheFoolStandSkins1ButtonMessage(2, x, y, z));
				TheFoolStandSkins1ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnSkinTheFoolNotEquippedOVAProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_standskin_equip2", imagebutton_standskin_equip2);
		this.addRenderableWidget(imagebutton_standskin_equip2);
	}
}
