package net.mcreator.jojowos.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.jojowos.world.inventory.MainQuestGUIMenu;
import net.mcreator.jojowos.procedures.ReturnMainQuestProcedure;
import net.mcreator.jojowos.procedures.ReturnKarmaProcedure;
import net.mcreator.jojowos.network.MainQuestGUIButtonMessage;
import net.mcreator.jojowos.JojowosMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class MainQuestGUIScreen extends AbstractContainerScreen<MainQuestGUIMenu> {
	private final static HashMap<String, Object> guistate = MainQuestGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_skillgui_button;
	ImageButton imagebutton_questmenu1_button;

	public MainQuestGUIScreen(MainQuestGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 1;
		this.imageHeight = 1;
	}

	private static final ResourceLocation texture = new ResourceLocation("jojowos:textures/screens/main_quest_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 108 && mouseX < leftPos + 132 && mouseY > topPos + 69 && mouseY < topPos + 93)
			guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.main_quest_gui.tooltip_open_stand_stats"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/questmenu1.png"), this.leftPos + -109, this.topPos + -75, 0, 0, 220, 170, 220, 170);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.jojowos.main_quest_gui.label_main"), -78, -60, -11184811, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.jojowos.main_quest_gui.label_side_quests"), 24, -60, -1, false);
		guiGraphics.drawString(this.font,

				ReturnMainQuestProcedure.execute(entity), -98, -33, -1, false);
		guiGraphics.drawString(this.font,

				ReturnKarmaProcedure.execute(entity), -101, 96, -1, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_skillgui_button = new ImageButton(this.leftPos + 109, this.topPos + 70, 22, 22, 0, 0, 22, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_skillgui_button.png"), 22, 44, e -> {
			if (true) {
				JojowosMod.PACKET_HANDLER.sendToServer(new MainQuestGUIButtonMessage(0, x, y, z));
				MainQuestGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_skillgui_button", imagebutton_skillgui_button);
		this.addRenderableWidget(imagebutton_skillgui_button);
		imagebutton_questmenu1_button = new ImageButton(this.leftPos + -1, this.topPos + -73, 110, 32, 0, 0, 32, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_questmenu1_button.png"), 110, 64, e -> {
			if (true) {
				JojowosMod.PACKET_HANDLER.sendToServer(new MainQuestGUIButtonMessage(1, x, y, z));
				MainQuestGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_questmenu1_button", imagebutton_questmenu1_button);
		this.addRenderableWidget(imagebutton_questmenu1_button);
	}
}
