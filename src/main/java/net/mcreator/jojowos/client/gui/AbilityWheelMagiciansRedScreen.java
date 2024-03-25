package net.mcreator.jojowos.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.jojowos.world.inventory.AbilityWheelMagiciansRedMenu;
import net.mcreator.jojowos.procedures.RedBindUnlockDisplayProcedure;
import net.mcreator.jojowos.procedures.LifeDetectorUnlockDisplayProcedure;
import net.mcreator.jojowos.procedures.CrossfireSpecialUnlockDisplayProcedure;
import net.mcreator.jojowos.procedures.CrossfireHurricaneDisplayProcedure;
import net.mcreator.jojowos.network.AbilityWheelMagiciansRedButtonMessage;
import net.mcreator.jojowos.JojowosMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class AbilityWheelMagiciansRedScreen extends AbstractContainerScreen<AbilityWheelMagiciansRedMenu> {
	private final static HashMap<String, Object> guistate = AbilityWheelMagiciansRedMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_magiciansred_lifedetector_h;
	ImageButton imagebutton_magiciansred_crossfire_h;
	ImageButton imagebutton_magiciansred_crossfirespecial_h;
	ImageButton imagebutton_magiciansred_redbind_h;

	public AbilityWheelMagiciansRedScreen(AbilityWheelMagiciansRedMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("jojowos:textures/screens/ability_wheel_magicians_red.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (CrossfireHurricaneDisplayProcedure.execute(entity))
			if (mouseX > leftPos + -16 && mouseX < leftPos + 14 && mouseY > topPos + -48 && mouseY < topPos + -18)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.ability_wheel_magicians_red.tooltip_cross_fire_hurricane"), mouseX, mouseY);
		if (CrossfireSpecialUnlockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + 18 && mouseX < leftPos + 48 && mouseY > topPos + -14 && mouseY < topPos + 16)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.ability_wheel_magicians_red.tooltip_cross_fire_hurricane_special"), mouseX, mouseY);
		if (LifeDetectorUnlockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + -50 && mouseX < leftPos + -20 && mouseY > topPos + -14 && mouseY < topPos + 16)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.ability_wheel_magicians_red.tooltip_life_detector"), mouseX, mouseY);
		if (RedBindUnlockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + -16 && mouseX < leftPos + 14 && mouseY > topPos + 20 && mouseY < topPos + 50)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.ability_wheel_magicians_red.tooltip_red_bind"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/ability_grid.png"), this.leftPos + -53, this.topPos + -51, 0, 0, 104, 104, 104, 104);

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
		imagebutton_magiciansred_lifedetector_h = new ImageButton(this.leftPos + -53, this.topPos + -17, 36, 36, 0, 0, 36, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_magiciansred_lifedetector_h.png"), 36, 72, e -> {
			if (LifeDetectorUnlockDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new AbilityWheelMagiciansRedButtonMessage(0, x, y, z));
				AbilityWheelMagiciansRedButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (LifeDetectorUnlockDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_magiciansred_lifedetector_h", imagebutton_magiciansred_lifedetector_h);
		this.addRenderableWidget(imagebutton_magiciansred_lifedetector_h);
		imagebutton_magiciansred_crossfire_h = new ImageButton(this.leftPos + -19, this.topPos + -51, 36, 36, 0, 0, 36, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_magiciansred_crossfire_h.png"), 36, 72, e -> {
			if (CrossfireHurricaneDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new AbilityWheelMagiciansRedButtonMessage(1, x, y, z));
				AbilityWheelMagiciansRedButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (CrossfireHurricaneDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_magiciansred_crossfire_h", imagebutton_magiciansred_crossfire_h);
		this.addRenderableWidget(imagebutton_magiciansred_crossfire_h);
		imagebutton_magiciansred_crossfirespecial_h = new ImageButton(this.leftPos + 16, this.topPos + -17, 36, 36, 0, 0, 36, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_magiciansred_crossfirespecial_h.png"), 36, 72, e -> {
			if (CrossfireSpecialUnlockDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new AbilityWheelMagiciansRedButtonMessage(2, x, y, z));
				AbilityWheelMagiciansRedButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (CrossfireSpecialUnlockDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_magiciansred_crossfirespecial_h", imagebutton_magiciansred_crossfirespecial_h);
		this.addRenderableWidget(imagebutton_magiciansred_crossfirespecial_h);
		imagebutton_magiciansred_redbind_h = new ImageButton(this.leftPos + -19, this.topPos + 17, 36, 36, 0, 0, 36, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_magiciansred_redbind_h.png"), 36, 72, e -> {
			if (RedBindUnlockDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new AbilityWheelMagiciansRedButtonMessage(3, x, y, z));
				AbilityWheelMagiciansRedButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (RedBindUnlockDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_magiciansred_redbind_h", imagebutton_magiciansred_redbind_h);
		this.addRenderableWidget(imagebutton_magiciansred_redbind_h);
	}
}
