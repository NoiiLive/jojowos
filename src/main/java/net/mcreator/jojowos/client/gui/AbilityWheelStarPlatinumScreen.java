package net.mcreator.jojowos.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.jojowos.world.inventory.AbilityWheelStarPlatinumMenu;
import net.mcreator.jojowos.procedures.WheelSwitchDisplayProcedure;
import net.mcreator.jojowos.procedures.StarTimeStopUnlockDisplayProcedure;
import net.mcreator.jojowos.procedures.StarTimeSkipUnlockDisplayProcedure;
import net.mcreator.jojowos.procedures.StarFingerUnlockDisplayProcedure;
import net.mcreator.jojowos.procedures.OraBarrageDisplayProcedure;
import net.mcreator.jojowos.procedures.InhaleUnlockDisplayProcedure;
import net.mcreator.jojowos.procedures.BearingShotUnlockDisplayProcedure;
import net.mcreator.jojowos.network.AbilityWheelStarPlatinumButtonMessage;
import net.mcreator.jojowos.JojowosMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class AbilityWheelStarPlatinumScreen extends AbstractContainerScreen<AbilityWheelStarPlatinumMenu> {
	private final static HashMap<String, Object> guistate = AbilityWheelStarPlatinumMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_starplatinum_starfinger;
	ImageButton imagebutton_starplatinum_bearingshot;
	ImageButton imagebutton_starplatinum_inhale;
	ImageButton imagebutton_starplatinum_timeskip;
	ImageButton imagebutton_starplatinum_timestop;
	ImageButton imagebutton_starplatinum_barrage;
	ImageButton imagebutton_guiarrow_up;

	public AbilityWheelStarPlatinumScreen(AbilityWheelStarPlatinumMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("jojowos:textures/screens/ability_wheel_star_platinum.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (OraBarrageDisplayProcedure.execute(entity))
			if (mouseX > leftPos + -16 && mouseX < leftPos + 14 && mouseY > topPos + -48 && mouseY < topPos + -18)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.ability_wheel_star_platinum.tooltip_ora_barrage"), mouseX, mouseY);
		if (InhaleUnlockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + -50 && mouseX < leftPos + -20 && mouseY > topPos + -48 && mouseY < topPos + -18)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.ability_wheel_star_platinum.tooltip_inhale"), mouseX, mouseY);
		if (BearingShotUnlockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + -50 && mouseX < leftPos + -20 && mouseY > topPos + -14 && mouseY < topPos + 16)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.ability_wheel_star_platinum.tooltip_bearing_shot"), mouseX, mouseY);
		if (StarFingerUnlockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + 18 && mouseX < leftPos + 48 && mouseY > topPos + -14 && mouseY < topPos + 16)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.ability_wheel_star_platinum.tooltip_star_finger"), mouseX, mouseY);
		if (StarTimeSkipUnlockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + 18 && mouseX < leftPos + 48 && mouseY > topPos + 20 && mouseY < topPos + 50)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.ability_wheel_star_platinum.tooltip_time_skip"), mouseX, mouseY);
		if (StarTimeStopUnlockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + -16 && mouseX < leftPos + 14 && mouseY > topPos + 20 && mouseY < topPos + 50)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.ability_wheel_star_platinum.tooltip_time_stop"), mouseX, mouseY);
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
		imagebutton_starplatinum_starfinger = new ImageButton(this.leftPos + 16, this.topPos + -17, 36, 36, 0, 0, 36, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_starplatinum_starfinger.png"), 36, 72, e -> {
			if (StarFingerUnlockDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new AbilityWheelStarPlatinumButtonMessage(0, x, y, z));
				AbilityWheelStarPlatinumButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (StarFingerUnlockDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_starplatinum_starfinger", imagebutton_starplatinum_starfinger);
		this.addRenderableWidget(imagebutton_starplatinum_starfinger);
		imagebutton_starplatinum_bearingshot = new ImageButton(this.leftPos + -53, this.topPos + -17, 36, 36, 0, 0, 36, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_starplatinum_bearingshot.png"), 36, 72, e -> {
			if (BearingShotUnlockDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new AbilityWheelStarPlatinumButtonMessage(1, x, y, z));
				AbilityWheelStarPlatinumButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (BearingShotUnlockDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_starplatinum_bearingshot", imagebutton_starplatinum_bearingshot);
		this.addRenderableWidget(imagebutton_starplatinum_bearingshot);
		imagebutton_starplatinum_inhale = new ImageButton(this.leftPos + -53, this.topPos + -51, 36, 36, 0, 0, 36, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_starplatinum_inhale.png"), 36, 72, e -> {
			if (InhaleUnlockDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new AbilityWheelStarPlatinumButtonMessage(2, x, y, z));
				AbilityWheelStarPlatinumButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (InhaleUnlockDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_starplatinum_inhale", imagebutton_starplatinum_inhale);
		this.addRenderableWidget(imagebutton_starplatinum_inhale);
		imagebutton_starplatinum_timeskip = new ImageButton(this.leftPos + 16, this.topPos + 17, 36, 36, 0, 0, 36, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_starplatinum_timeskip.png"), 36, 72, e -> {
			if (StarTimeSkipUnlockDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new AbilityWheelStarPlatinumButtonMessage(3, x, y, z));
				AbilityWheelStarPlatinumButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (StarTimeSkipUnlockDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_starplatinum_timeskip", imagebutton_starplatinum_timeskip);
		this.addRenderableWidget(imagebutton_starplatinum_timeskip);
		imagebutton_starplatinum_timestop = new ImageButton(this.leftPos + -19, this.topPos + 17, 36, 36, 0, 0, 36, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_starplatinum_timestop.png"), 36, 72, e -> {
			if (StarTimeStopUnlockDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new AbilityWheelStarPlatinumButtonMessage(4, x, y, z));
				AbilityWheelStarPlatinumButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (StarTimeStopUnlockDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_starplatinum_timestop", imagebutton_starplatinum_timestop);
		this.addRenderableWidget(imagebutton_starplatinum_timestop);
		imagebutton_starplatinum_barrage = new ImageButton(this.leftPos + -19, this.topPos + -51, 36, 36, 0, 0, 36, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_starplatinum_barrage.png"), 36, 72, e -> {
			if (OraBarrageDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new AbilityWheelStarPlatinumButtonMessage(5, x, y, z));
				AbilityWheelStarPlatinumButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (OraBarrageDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_starplatinum_barrage", imagebutton_starplatinum_barrage);
		this.addRenderableWidget(imagebutton_starplatinum_barrage);
		imagebutton_guiarrow_up = new ImageButton(this.leftPos + -10, this.topPos + -66, 19, 13, 0, 0, 13, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_guiarrow_up.png"), 19, 26, e -> {
			if (WheelSwitchDisplayProcedure.execute(world, entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new AbilityWheelStarPlatinumButtonMessage(6, x, y, z));
				AbilityWheelStarPlatinumButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (WheelSwitchDisplayProcedure.execute(world, entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_guiarrow_up", imagebutton_guiarrow_up);
		this.addRenderableWidget(imagebutton_guiarrow_up);
	}
}
