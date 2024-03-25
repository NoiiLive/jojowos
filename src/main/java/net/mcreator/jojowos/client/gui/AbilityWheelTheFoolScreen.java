package net.mcreator.jojowos.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.jojowos.world.inventory.AbilityWheelTheFoolMenu;
import net.mcreator.jojowos.procedures.SandGlideUnlockDisplayProcedure;
import net.mcreator.jojowos.procedures.SandDomeUnlockDisplayProcedure;
import net.mcreator.jojowos.procedures.QuicksandDisplayProcedure;
import net.mcreator.jojowos.network.AbilityWheelTheFoolButtonMessage;
import net.mcreator.jojowos.JojowosMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class AbilityWheelTheFoolScreen extends AbstractContainerScreen<AbilityWheelTheFoolMenu> {
	private final static HashMap<String, Object> guistate = AbilityWheelTheFoolMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_thefool_quicksand_h;
	ImageButton imagebutton_thefool_sandglide_h;
	ImageButton imagebutton_thefool_sandddome_h;

	public AbilityWheelTheFoolScreen(AbilityWheelTheFoolMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("jojowos:textures/screens/ability_wheel_the_fool.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (QuicksandDisplayProcedure.execute(entity))
			if (mouseX > leftPos + -16 && mouseX < leftPos + 14 && mouseY > topPos + -48 && mouseY < topPos + -18)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.ability_wheel_the_fool.tooltip_quicksand"), mouseX, mouseY);
		if (SandGlideUnlockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + 18 && mouseX < leftPos + 48 && mouseY > topPos + 20 && mouseY < topPos + 50)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.ability_wheel_the_fool.tooltip_sand_glider"), mouseX, mouseY);
		if (SandDomeUnlockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + -50 && mouseX < leftPos + -20 && mouseY > topPos + 20 && mouseY < topPos + 50)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.ability_wheel_the_fool.tooltip_sand_dome"), mouseX, mouseY);
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
		imagebutton_thefool_quicksand_h = new ImageButton(this.leftPos + -19, this.topPos + -51, 36, 36, 0, 0, 36, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_thefool_quicksand_h.png"), 36, 72, e -> {
			if (QuicksandDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new AbilityWheelTheFoolButtonMessage(0, x, y, z));
				AbilityWheelTheFoolButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (QuicksandDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_thefool_quicksand_h", imagebutton_thefool_quicksand_h);
		this.addRenderableWidget(imagebutton_thefool_quicksand_h);
		imagebutton_thefool_sandglide_h = new ImageButton(this.leftPos + 16, this.topPos + 17, 36, 36, 0, 0, 36, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_thefool_sandglide_h.png"), 36, 72, e -> {
			if (SandGlideUnlockDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new AbilityWheelTheFoolButtonMessage(1, x, y, z));
				AbilityWheelTheFoolButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (SandGlideUnlockDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_thefool_sandglide_h", imagebutton_thefool_sandglide_h);
		this.addRenderableWidget(imagebutton_thefool_sandglide_h);
		imagebutton_thefool_sandddome_h = new ImageButton(this.leftPos + -53, this.topPos + 17, 36, 36, 0, 0, 36, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_thefool_sandddome_h.png"), 36, 72, e -> {
			if (SandDomeUnlockDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new AbilityWheelTheFoolButtonMessage(2, x, y, z));
				AbilityWheelTheFoolButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (SandDomeUnlockDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_thefool_sandddome_h", imagebutton_thefool_sandddome_h);
		this.addRenderableWidget(imagebutton_thefool_sandddome_h);
	}
}
