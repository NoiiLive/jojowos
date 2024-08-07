package net.mcreator.jojowos.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.jojowos.world.inventory.PolnareffChatboxMenu;
import net.mcreator.jojowos.procedures.PolnareffSmileIconDisplayProcedure;
import net.mcreator.jojowos.procedures.PolnareffMadIconDisplayProcedure;
import net.mcreator.jojowos.procedures.PolnareffIconDisplayProcedure;
import net.mcreator.jojowos.procedures.PolnareffChatLevelButtonProcedure;
import net.mcreator.jojowos.procedures.PolnareffChatLevelButton2Procedure;
import net.mcreator.jojowos.procedures.ChatboxDisplay4Procedure;
import net.mcreator.jojowos.procedures.ChatboxDisplay3Procedure;
import net.mcreator.jojowos.procedures.ChatboxDisplay2Procedure;
import net.mcreator.jojowos.procedures.ChatboxDisplay1Procedure;
import net.mcreator.jojowos.procedures.ChatButtonDisplay2Procedure;
import net.mcreator.jojowos.procedures.ChatButtonDisplay1Procedure;
import net.mcreator.jojowos.network.PolnareffChatboxButtonMessage;
import net.mcreator.jojowos.JojowosMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class PolnareffChatboxScreen extends AbstractContainerScreen<PolnareffChatboxMenu> {
	private final static HashMap<String, Object> guistate = PolnareffChatboxMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_textbutton;
	ImageButton imagebutton_textbutton1;

	public PolnareffChatboxScreen(PolnareffChatboxMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("jojowos:textures/screens/polnareff_chatbox.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/chatbox.png"), this.leftPos + -129, this.topPos + 15, 0, 0, 256, 60, 256, 60);

		if (PolnareffIconDisplayProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/polnareff.png"), this.leftPos + -115, this.topPos + 29, 0, 0, 32, 32, 32, 32);
		}
		if (PolnareffMadIconDisplayProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/polnareffmad.png"), this.leftPos + -115, this.topPos + 29, 0, 0, 32, 32, 32, 32);
		}
		if (PolnareffSmileIconDisplayProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/polnareffsmile.png"), this.leftPos + -115, this.topPos + 29, 0, 0, 32, 32, 32, 32);
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
		guiGraphics.drawString(this.font,

				ChatboxDisplay1Procedure.execute(entity), -74, 24, -1, false);
		guiGraphics.drawString(this.font,

				ChatboxDisplay2Procedure.execute(entity), -74, 35, -1, false);
		guiGraphics.drawString(this.font,

				ChatboxDisplay3Procedure.execute(entity), -74, 46, -1, false);
		guiGraphics.drawString(this.font,

				ChatboxDisplay4Procedure.execute(entity), -74, 57, -1, false);
		if (PolnareffChatLevelButtonProcedure.execute(entity))
			guiGraphics.drawString(this.font,

					ChatButtonDisplay1Procedure.execute(entity), -12, 82, -1, false);
		if (PolnareffChatLevelButton2Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					ChatButtonDisplay2Procedure.execute(entity), 60, 82, -1, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_textbutton = new ImageButton(this.leftPos + -19, this.topPos + 76, 64, 21, 0, 0, 21, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_textbutton.png"), 64, 42, e -> {
			if (PolnareffChatLevelButtonProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new PolnareffChatboxButtonMessage(0, x, y, z));
				PolnareffChatboxButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (PolnareffChatLevelButtonProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_textbutton", imagebutton_textbutton);
		this.addRenderableWidget(imagebutton_textbutton);
		imagebutton_textbutton1 = new ImageButton(this.leftPos + 53, this.topPos + 76, 64, 21, 0, 0, 21, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_textbutton1.png"), 64, 42, e -> {
			if (PolnareffChatLevelButton2Procedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new PolnareffChatboxButtonMessage(1, x, y, z));
				PolnareffChatboxButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (PolnareffChatLevelButton2Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_textbutton1", imagebutton_textbutton1);
		this.addRenderableWidget(imagebutton_textbutton1);
	}
}
