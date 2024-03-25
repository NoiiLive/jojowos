package net.mcreator.jojowos.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.jojowos.world.inventory.AbilityWheelHierophantGreenMenu;
import net.mcreator.jojowos.procedures.MeterUnlockDisplayProcedure;
import net.mcreator.jojowos.procedures.HieroGrappleUnlockDisplayProcedure;
import net.mcreator.jojowos.procedures.EmeraldSplashDisplayProcedure;
import net.mcreator.jojowos.procedures.BodyControlUnlockDisplayProcedure;
import net.mcreator.jojowos.network.AbilityWheelHierophantGreenButtonMessage;
import net.mcreator.jojowos.JojowosMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class AbilityWheelHierophantGreenScreen extends AbstractContainerScreen<AbilityWheelHierophantGreenMenu> {
	private final static HashMap<String, Object> guistate = AbilityWheelHierophantGreenMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_hierophant_emeraldsplash;
	ImageButton imagebutton_hierophant_grapple;
	ImageButton imagebutton_hierophant_20meter;
	ImageButton imagebutton_hierophant_bodycontrol;

	public AbilityWheelHierophantGreenScreen(AbilityWheelHierophantGreenMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("jojowos:textures/screens/ability_wheel_hierophant_green.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (EmeraldSplashDisplayProcedure.execute(entity))
			if (mouseX > leftPos + -16 && mouseX < leftPos + 13 && mouseY > topPos + -48 && mouseY < topPos + -18)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.ability_wheel_hierophant_green.tooltip_emerald_splash"), mouseX, mouseY);
		if (HieroGrappleUnlockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + 18 && mouseX < leftPos + 48 && mouseY > topPos + -14 && mouseY < topPos + 16)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.ability_wheel_hierophant_green.tooltip_grapple"), mouseX, mouseY);
		if (BodyControlUnlockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + -16 && mouseX < leftPos + 14 && mouseY > topPos + 20 && mouseY < topPos + 50)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.ability_wheel_hierophant_green.tooltip_body_control"), mouseX, mouseY);
		if (MeterUnlockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + -50 && mouseX < leftPos + -20 && mouseY > topPos + -14 && mouseY < topPos + 16)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.ability_wheel_hierophant_green.tooltip_20meter_emerald_splash"), mouseX, mouseY);
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
		imagebutton_hierophant_emeraldsplash = new ImageButton(this.leftPos + -19, this.topPos + -51, 36, 36, 0, 0, 36, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_hierophant_emeraldsplash.png"), 36, 72, e -> {
			if (EmeraldSplashDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new AbilityWheelHierophantGreenButtonMessage(0, x, y, z));
				AbilityWheelHierophantGreenButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (EmeraldSplashDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_hierophant_emeraldsplash", imagebutton_hierophant_emeraldsplash);
		this.addRenderableWidget(imagebutton_hierophant_emeraldsplash);
		imagebutton_hierophant_grapple = new ImageButton(this.leftPos + 16, this.topPos + -17, 36, 36, 0, 0, 36, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_hierophant_grapple.png"), 36, 72, e -> {
			if (HieroGrappleUnlockDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new AbilityWheelHierophantGreenButtonMessage(1, x, y, z));
				AbilityWheelHierophantGreenButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (HieroGrappleUnlockDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_hierophant_grapple", imagebutton_hierophant_grapple);
		this.addRenderableWidget(imagebutton_hierophant_grapple);
		imagebutton_hierophant_20meter = new ImageButton(this.leftPos + -53, this.topPos + -17, 36, 36, 0, 0, 36, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_hierophant_20meter.png"), 36, 72, e -> {
			if (MeterUnlockDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new AbilityWheelHierophantGreenButtonMessage(2, x, y, z));
				AbilityWheelHierophantGreenButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (MeterUnlockDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_hierophant_20meter", imagebutton_hierophant_20meter);
		this.addRenderableWidget(imagebutton_hierophant_20meter);
		imagebutton_hierophant_bodycontrol = new ImageButton(this.leftPos + -19, this.topPos + 17, 36, 36, 0, 0, 36, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_hierophant_bodycontrol.png"), 36, 72, e -> {
			if (BodyControlUnlockDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new AbilityWheelHierophantGreenButtonMessage(3, x, y, z));
				AbilityWheelHierophantGreenButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (BodyControlUnlockDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_hierophant_bodycontrol", imagebutton_hierophant_bodycontrol);
		this.addRenderableWidget(imagebutton_hierophant_bodycontrol);
	}
}
