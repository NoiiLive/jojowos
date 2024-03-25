package net.mcreator.jojowos.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.jojowos.world.inventory.HermitCameraMenu;
import net.mcreator.jojowos.network.HermitCameraButtonMessage;
import net.mcreator.jojowos.JojowosMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class HermitCameraScreen extends AbstractContainerScreen<HermitCameraMenu> {
	private final static HashMap<String, Object> guistate = HermitCameraMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox PlayerName;
	Button button_search;

	public HermitCameraScreen(HermitCameraMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("jojowos:textures/screens/hermit_camera.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		PlayerName.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/hermit_purple_polaroid.png"), this.leftPos + -91, this.topPos + -100, 0, 0, 180, 200, 180, 200);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (PlayerName.isFocused())
			return PlayerName.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		PlayerName.tick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.jojowos.hermit_camera.label_who_do_you_desire_to_see"), -66, -76, -6710887, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		PlayerName = new EditBox(this.font, this.leftPos + -60, this.topPos + 32, 118, 18, Component.translatable("gui.jojowos.hermit_camera.PlayerName"));
		PlayerName.setMaxLength(32767);
		guistate.put("text:PlayerName", PlayerName);
		this.addWidget(this.PlayerName);
		button_search = Button.builder(Component.translatable("gui.jojowos.hermit_camera.button_search"), e -> {
			if (true) {
				JojowosMod.PACKET_HANDLER.sendToServer(new HermitCameraButtonMessage(0, x, y, z));
				HermitCameraButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + -29, this.topPos + 63, 56, 20).build();
		guistate.put("button:button_search", button_search);
		this.addRenderableWidget(button_search);
	}
}
