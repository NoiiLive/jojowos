package net.mcreator.jojowos.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.jojowos.world.inventory.AbilityWheelTheWorldMenu;
import net.mcreator.jojowos.procedures.WorldTimeStopUnlockDisplayProcedure;
import net.mcreator.jojowos.procedures.WorldTimeSkipUnlockDisplayProcedure;
import net.mcreator.jojowos.procedures.RoadRollerUnlockDisplayProcedure;
import net.mcreator.jojowos.procedures.MudaKickUnlockDisplayProcedure;
import net.mcreator.jojowos.procedures.MudaBarrageDisplayProcedure;
import net.mcreator.jojowos.procedures.KnifeTossUnlockDisplayProcedure;
import net.mcreator.jojowos.network.AbilityWheelTheWorldButtonMessage;
import net.mcreator.jojowos.JojowosMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class AbilityWheelTheWorldScreen extends AbstractContainerScreen<AbilityWheelTheWorldMenu> {
	private final static HashMap<String, Object> guistate = AbilityWheelTheWorldMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_theworld_barrage_h;
	ImageButton imagebutton_theworld_knifetoss_h;
	ImageButton imagebutton_theworld_kickbarrage_h;
	ImageButton imagebutton_theworld_timeskip_h;
	ImageButton imagebutton_theworld_timestop_h;
	ImageButton imagebutton_theworld_roadroller_h;

	public AbilityWheelTheWorldScreen(AbilityWheelTheWorldMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("jojowos:textures/screens/ability_wheel_the_world.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (MudaBarrageDisplayProcedure.execute(entity))
			if (mouseX > leftPos + -50 && mouseX < leftPos + -20 && mouseY > topPos + -48 && mouseY < topPos + -18)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.ability_wheel_the_world.tooltip_muda_barrage"), mouseX, mouseY);
		if (KnifeTossUnlockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + -16 && mouseX < leftPos + 14 && mouseY > topPos + -48 && mouseY < topPos + -18)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.ability_wheel_the_world.tooltip_knife_toss"), mouseX, mouseY);
		if (MudaKickUnlockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + -50 && mouseX < leftPos + -20 && mouseY > topPos + -14 && mouseY < topPos + 16)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.ability_wheel_the_world.tooltip_muda_kick_barrage"), mouseX, mouseY);
		if (WorldTimeSkipUnlockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + 18 && mouseX < leftPos + 48 && mouseY > topPos + -14 && mouseY < topPos + 16)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.ability_wheel_the_world.tooltip_time_skip1"), mouseX, mouseY);
		if (WorldTimeStopUnlockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + -16 && mouseX < leftPos + 14 && mouseY > topPos + 20 && mouseY < topPos + 50)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.ability_wheel_the_world.tooltip_time_stop1"), mouseX, mouseY);
		if (RoadRollerUnlockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + 18 && mouseX < leftPos + 48 && mouseY > topPos + 20 && mouseY < topPos + 50)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.ability_wheel_the_world.tooltip_road_roller"), mouseX, mouseY);
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
		imagebutton_theworld_barrage_h = new ImageButton(this.leftPos + -53, this.topPos + -51, 36, 36, 0, 0, 36, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_theworld_barrage_h.png"), 36, 72, e -> {
			if (MudaBarrageDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new AbilityWheelTheWorldButtonMessage(0, x, y, z));
				AbilityWheelTheWorldButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (MudaBarrageDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_theworld_barrage_h", imagebutton_theworld_barrage_h);
		this.addRenderableWidget(imagebutton_theworld_barrage_h);
		imagebutton_theworld_knifetoss_h = new ImageButton(this.leftPos + -19, this.topPos + -51, 36, 36, 0, 0, 36, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_theworld_knifetoss_h.png"), 36, 72, e -> {
			if (KnifeTossUnlockDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new AbilityWheelTheWorldButtonMessage(1, x, y, z));
				AbilityWheelTheWorldButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (KnifeTossUnlockDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_theworld_knifetoss_h", imagebutton_theworld_knifetoss_h);
		this.addRenderableWidget(imagebutton_theworld_knifetoss_h);
		imagebutton_theworld_kickbarrage_h = new ImageButton(this.leftPos + -53, this.topPos + -17, 36, 36, 0, 0, 36, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_theworld_kickbarrage_h.png"), 36, 72, e -> {
			if (MudaKickUnlockDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new AbilityWheelTheWorldButtonMessage(2, x, y, z));
				AbilityWheelTheWorldButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (MudaKickUnlockDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_theworld_kickbarrage_h", imagebutton_theworld_kickbarrage_h);
		this.addRenderableWidget(imagebutton_theworld_kickbarrage_h);
		imagebutton_theworld_timeskip_h = new ImageButton(this.leftPos + 16, this.topPos + -17, 36, 36, 0, 0, 36, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_theworld_timeskip_h.png"), 36, 72, e -> {
			if (WorldTimeSkipUnlockDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new AbilityWheelTheWorldButtonMessage(3, x, y, z));
				AbilityWheelTheWorldButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (WorldTimeSkipUnlockDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_theworld_timeskip_h", imagebutton_theworld_timeskip_h);
		this.addRenderableWidget(imagebutton_theworld_timeskip_h);
		imagebutton_theworld_timestop_h = new ImageButton(this.leftPos + -19, this.topPos + 17, 36, 36, 0, 0, 36, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_theworld_timestop_h.png"), 36, 72, e -> {
			if (WorldTimeStopUnlockDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new AbilityWheelTheWorldButtonMessage(4, x, y, z));
				AbilityWheelTheWorldButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (WorldTimeStopUnlockDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_theworld_timestop_h", imagebutton_theworld_timestop_h);
		this.addRenderableWidget(imagebutton_theworld_timestop_h);
		imagebutton_theworld_roadroller_h = new ImageButton(this.leftPos + 16, this.topPos + 17, 36, 36, 0, 0, 36, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_theworld_roadroller_h.png"), 36, 72, e -> {
			if (RoadRollerUnlockDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new AbilityWheelTheWorldButtonMessage(5, x, y, z));
				AbilityWheelTheWorldButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (RoadRollerUnlockDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_theworld_roadroller_h", imagebutton_theworld_roadroller_h);
		this.addRenderableWidget(imagebutton_theworld_roadroller_h);
	}
}
