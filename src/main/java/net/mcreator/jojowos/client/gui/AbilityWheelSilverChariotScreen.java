package net.mcreator.jojowos.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.jojowos.world.inventory.AbilityWheelSilverChariotMenu;
import net.mcreator.jojowos.procedures.SwordLaunchUnlockDisplayProcedure;
import net.mcreator.jojowos.procedures.SwordCycloneUnlockDisplayProcedure;
import net.mcreator.jojowos.procedures.HoraRushDisplayProcedure;
import net.mcreator.jojowos.procedures.ArmorOffUnlockDisplayProcedure;
import net.mcreator.jojowos.network.AbilityWheelSilverChariotButtonMessage;
import net.mcreator.jojowos.JojowosMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class AbilityWheelSilverChariotScreen extends AbstractContainerScreen<AbilityWheelSilverChariotMenu> {
	private final static HashMap<String, Object> guistate = AbilityWheelSilverChariotMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_silverchariot_horarush;
	ImageButton imagebutton_silverchariot_swordlaunch;
	ImageButton imagebutton_silverchariot_armoroff;
	ImageButton imagebutton_silverchariot_bladecyclone;

	public AbilityWheelSilverChariotScreen(AbilityWheelSilverChariotMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("jojowos:textures/screens/ability_wheel_silver_chariot.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (HoraRushDisplayProcedure.execute(entity))
			if (mouseX > leftPos + -16 && mouseX < leftPos + 14 && mouseY > topPos + -48 && mouseY < topPos + -18)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.ability_wheel_silver_chariot.tooltip_hora_rush"), mouseX, mouseY);
		if (SwordLaunchUnlockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + 18 && mouseX < leftPos + 48 && mouseY > topPos + -14 && mouseY < topPos + 16)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.ability_wheel_silver_chariot.tooltip_sword_launch"), mouseX, mouseY);
		if (SwordCycloneUnlockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + -50 && mouseX < leftPos + -20 && mouseY > topPos + -14 && mouseY < topPos + 16)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.ability_wheel_silver_chariot.tooltip_blade_cyclone"), mouseX, mouseY);
		if (ArmorOffUnlockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + -16 && mouseX < leftPos + 14 && mouseY > topPos + 20 && mouseY < topPos + 50)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.ability_wheel_silver_chariot.tooltip_armor_off"), mouseX, mouseY);
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
		imagebutton_silverchariot_horarush = new ImageButton(this.leftPos + -19, this.topPos + -51, 36, 36, 0, 0, 36, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_silverchariot_horarush.png"), 36, 72, e -> {
			if (HoraRushDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new AbilityWheelSilverChariotButtonMessage(0, x, y, z));
				AbilityWheelSilverChariotButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (HoraRushDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_silverchariot_horarush", imagebutton_silverchariot_horarush);
		this.addRenderableWidget(imagebutton_silverchariot_horarush);
		imagebutton_silverchariot_swordlaunch = new ImageButton(this.leftPos + 16, this.topPos + -17, 36, 36, 0, 0, 36, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_silverchariot_swordlaunch.png"), 36, 72, e -> {
			if (SwordLaunchUnlockDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new AbilityWheelSilverChariotButtonMessage(1, x, y, z));
				AbilityWheelSilverChariotButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (SwordLaunchUnlockDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_silverchariot_swordlaunch", imagebutton_silverchariot_swordlaunch);
		this.addRenderableWidget(imagebutton_silverchariot_swordlaunch);
		imagebutton_silverchariot_armoroff = new ImageButton(this.leftPos + -19, this.topPos + 17, 36, 36, 0, 0, 36, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_silverchariot_armoroff.png"), 36, 72, e -> {
			if (ArmorOffUnlockDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new AbilityWheelSilverChariotButtonMessage(2, x, y, z));
				AbilityWheelSilverChariotButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ArmorOffUnlockDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_silverchariot_armoroff", imagebutton_silverchariot_armoroff);
		this.addRenderableWidget(imagebutton_silverchariot_armoroff);
		imagebutton_silverchariot_bladecyclone = new ImageButton(this.leftPos + -53, this.topPos + -17, 36, 36, 0, 0, 36, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_silverchariot_bladecyclone.png"), 36, 72, e -> {
			if (SwordCycloneUnlockDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new AbilityWheelSilverChariotButtonMessage(3, x, y, z));
				AbilityWheelSilverChariotButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (SwordCycloneUnlockDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_silverchariot_bladecyclone", imagebutton_silverchariot_bladecyclone);
		this.addRenderableWidget(imagebutton_silverchariot_bladecyclone);
	}
}
