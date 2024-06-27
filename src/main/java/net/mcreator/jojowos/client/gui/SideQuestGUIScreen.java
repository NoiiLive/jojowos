package net.mcreator.jojowos.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.jojowos.world.inventory.SideQuestGUIMenu;
import net.mcreator.jojowos.procedures.ReturnSideQuestReward4Procedure;
import net.mcreator.jojowos.procedures.ReturnSideQuestReward3Procedure;
import net.mcreator.jojowos.procedures.ReturnSideQuestReward2Procedure;
import net.mcreator.jojowos.procedures.ReturnSideQuestReward1Procedure;
import net.mcreator.jojowos.procedures.ReturnSideQuestGiver4Procedure;
import net.mcreator.jojowos.procedures.ReturnSideQuestGiver3Procedure;
import net.mcreator.jojowos.procedures.ReturnSideQuestGiver2Procedure;
import net.mcreator.jojowos.procedures.ReturnSideQuestGiver1Procedure;
import net.mcreator.jojowos.procedures.ReturnSideQuest4Procedure;
import net.mcreator.jojowos.procedures.ReturnSideQuest3Procedure;
import net.mcreator.jojowos.procedures.ReturnSideQuest2Procedure;
import net.mcreator.jojowos.procedures.ReturnSideQuest1Procedure;
import net.mcreator.jojowos.procedures.ReturnKarmaProcedure;
import net.mcreator.jojowos.procedures.ReturnCompleteSideQuest4Procedure;
import net.mcreator.jojowos.procedures.ReturnCompleteSideQuest3Procedure;
import net.mcreator.jojowos.procedures.ReturnCompleteSideQuest2Procedure;
import net.mcreator.jojowos.procedures.ReturnCompleteSideQuest1Procedure;
import net.mcreator.jojowos.procedures.ReturnActiveSQ4Procedure;
import net.mcreator.jojowos.procedures.ReturnActiveSQ3Procedure;
import net.mcreator.jojowos.procedures.ReturnActiveSQ2Procedure;
import net.mcreator.jojowos.procedures.ReturnActiveSQ1Procedure;
import net.mcreator.jojowos.network.SideQuestGUIButtonMessage;
import net.mcreator.jojowos.JojowosMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SideQuestGUIScreen extends AbstractContainerScreen<SideQuestGUIMenu> {
	private final static HashMap<String, Object> guistate = SideQuestGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_skillgui_button;
	ImageButton imagebutton_questmenu2_button;
	ImageButton imagebutton_trashicon;
	ImageButton imagebutton_trashicon1;
	ImageButton imagebutton_trashicon2;
	ImageButton imagebutton_trashicon3;

	public SideQuestGUIScreen(SideQuestGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 1;
		this.imageHeight = 1;
	}

	private static final ResourceLocation texture = new ResourceLocation("jojowos:textures/screens/side_quest_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 108 && mouseX < leftPos + 132 && mouseY > topPos + 69 && mouseY < topPos + 93)
			guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.side_quest_gui.tooltip_open_stand_stats"), mouseX, mouseY);
		if (ReturnActiveSQ1Procedure.execute(entity))
			if (mouseX > leftPos + 78 && mouseX < leftPos + 102 && mouseY > topPos + -17 && mouseY < topPos + 7)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.side_quest_gui.tooltip_discard_quest"), mouseX, mouseY);
		if (ReturnActiveSQ2Procedure.execute(entity))
			if (mouseX > leftPos + 78 && mouseX < leftPos + 102 && mouseY > topPos + 9 && mouseY < topPos + 33)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.side_quest_gui.tooltip_discard_quest1"), mouseX, mouseY);
		if (ReturnActiveSQ3Procedure.execute(entity))
			if (mouseX > leftPos + 78 && mouseX < leftPos + 102 && mouseY > topPos + 35 && mouseY < topPos + 59)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.side_quest_gui.tooltip_discard_quest2"), mouseX, mouseY);
		if (ReturnActiveSQ4Procedure.execute(entity))
			if (mouseX > leftPos + 78 && mouseX < leftPos + 102 && mouseY > topPos + 61 && mouseY < topPos + 85)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.side_quest_gui.tooltip_discard_quest3"), mouseX, mouseY);
		if (ReturnCompleteSideQuest1Procedure.execute(entity))
			if (mouseX > leftPos + -123 && mouseX < leftPos + -105 && mouseY > topPos + -14 && mouseY < topPos + 4)
				guiGraphics.renderTooltip(font, Component.literal(ReturnSideQuestGiver1Procedure.execute(entity)), mouseX, mouseY);
		if (ReturnCompleteSideQuest2Procedure.execute(entity))
			if (mouseX > leftPos + -123 && mouseX < leftPos + -105 && mouseY > topPos + 12 && mouseY < topPos + 30)
				guiGraphics.renderTooltip(font, Component.literal(ReturnSideQuestGiver2Procedure.execute(entity)), mouseX, mouseY);
		if (ReturnCompleteSideQuest3Procedure.execute(entity))
			if (mouseX > leftPos + -123 && mouseX < leftPos + -105 && mouseY > topPos + 38 && mouseY < topPos + 56)
				guiGraphics.renderTooltip(font, Component.literal(ReturnSideQuestGiver3Procedure.execute(entity)), mouseX, mouseY);
		if (ReturnCompleteSideQuest4Procedure.execute(entity))
			if (mouseX > leftPos + -123 && mouseX < leftPos + -105 && mouseY > topPos + 64 && mouseY < topPos + 82)
				guiGraphics.renderTooltip(font, Component.literal(ReturnSideQuestGiver4Procedure.execute(entity)), mouseX, mouseY);
		if (ReturnActiveSQ1Procedure.execute(entity))
			if (mouseX > leftPos + -99 && mouseX < leftPos + 32 && mouseY > topPos + -16 && mouseY < topPos + 6)
				guiGraphics.renderTooltip(font, Component.literal(ReturnSideQuestReward1Procedure.execute(entity)), mouseX, mouseY);
		if (ReturnActiveSQ2Procedure.execute(entity))
			if (mouseX > leftPos + -99 && mouseX < leftPos + 32 && mouseY > topPos + 10 && mouseY < topPos + 32)
				guiGraphics.renderTooltip(font, Component.literal(ReturnSideQuestReward2Procedure.execute(entity)), mouseX, mouseY);
		if (ReturnActiveSQ3Procedure.execute(entity))
			if (mouseX > leftPos + -99 && mouseX < leftPos + 32 && mouseY > topPos + 36 && mouseY < topPos + 58)
				guiGraphics.renderTooltip(font, Component.literal(ReturnSideQuestReward3Procedure.execute(entity)), mouseX, mouseY);
		if (ReturnActiveSQ4Procedure.execute(entity))
			if (mouseX > leftPos + -99 && mouseX < leftPos + 32 && mouseY > topPos + 62 && mouseY < topPos + 84)
				guiGraphics.renderTooltip(font, Component.literal(ReturnSideQuestReward4Procedure.execute(entity)), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/questmenu2.png"), this.leftPos + -109, this.topPos + -75, 0, 0, 220, 170, 220, 170);

		if (ReturnCompleteSideQuest1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/checkmark.png"), this.leftPos + -123, this.topPos + -14, 0, 0, 18, 18, 18, 18);
		}
		if (ReturnCompleteSideQuest2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/checkmark.png"), this.leftPos + -123, this.topPos + 12, 0, 0, 18, 18, 18, 18);
		}
		if (ReturnCompleteSideQuest3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/checkmark.png"), this.leftPos + -123, this.topPos + 38, 0, 0, 18, 18, 18, 18);
		}
		if (ReturnCompleteSideQuest4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/checkmark.png"), this.leftPos + -123, this.topPos + 64, 0, 0, 18, 18, 18, 18);
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
		guiGraphics.drawString(this.font, Component.translatable("gui.jojowos.side_quest_gui.label_main"), -78, -60, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.jojowos.side_quest_gui.label_side_quests"), 24, -60, -11184811, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.jojowos.side_quest_gui.label_active_side_quests"), -98, -33, -11184811, false);
		guiGraphics.drawString(this.font,

				ReturnSideQuest1Procedure.execute(entity), -95, -9, -1, false);
		guiGraphics.drawString(this.font,

				ReturnSideQuest2Procedure.execute(entity), -95, 18, -1, false);
		guiGraphics.drawString(this.font,

				ReturnSideQuest3Procedure.execute(entity), -95, 44, -1, false);
		guiGraphics.drawString(this.font,

				ReturnSideQuest4Procedure.execute(entity), -95, 70, -1, false);
		guiGraphics.drawString(this.font,

				ReturnKarmaProcedure.execute(entity), -101, 96, -1, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_skillgui_button = new ImageButton(this.leftPos + 109, this.topPos + 70, 22, 22, 0, 0, 22, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_skillgui_button.png"), 22, 44, e -> {
			if (true) {
				JojowosMod.PACKET_HANDLER.sendToServer(new SideQuestGUIButtonMessage(0, x, y, z));
				SideQuestGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_skillgui_button", imagebutton_skillgui_button);
		this.addRenderableWidget(imagebutton_skillgui_button);
		imagebutton_questmenu2_button = new ImageButton(this.leftPos + -107, this.topPos + -73, 110, 32, 0, 0, 32, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_questmenu2_button.png"), 110, 64, e -> {
			if (true) {
				JojowosMod.PACKET_HANDLER.sendToServer(new SideQuestGUIButtonMessage(1, x, y, z));
				SideQuestGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_questmenu2_button", imagebutton_questmenu2_button);
		this.addRenderableWidget(imagebutton_questmenu2_button);
		imagebutton_trashicon = new ImageButton(this.leftPos + 81, this.topPos + -14, 18, 18, 0, 0, 18, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_trashicon.png"), 18, 36, e -> {
			if (ReturnActiveSQ1Procedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new SideQuestGUIButtonMessage(2, x, y, z));
				SideQuestGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnActiveSQ1Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_trashicon", imagebutton_trashicon);
		this.addRenderableWidget(imagebutton_trashicon);
		imagebutton_trashicon1 = new ImageButton(this.leftPos + 81, this.topPos + 12, 18, 18, 0, 0, 18, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_trashicon1.png"), 18, 36, e -> {
			if (ReturnActiveSQ2Procedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new SideQuestGUIButtonMessage(3, x, y, z));
				SideQuestGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnActiveSQ2Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_trashicon1", imagebutton_trashicon1);
		this.addRenderableWidget(imagebutton_trashicon1);
		imagebutton_trashicon2 = new ImageButton(this.leftPos + 81, this.topPos + 38, 18, 18, 0, 0, 18, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_trashicon2.png"), 18, 36, e -> {
			if (ReturnActiveSQ3Procedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new SideQuestGUIButtonMessage(4, x, y, z));
				SideQuestGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnActiveSQ3Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_trashicon2", imagebutton_trashicon2);
		this.addRenderableWidget(imagebutton_trashicon2);
		imagebutton_trashicon3 = new ImageButton(this.leftPos + 81, this.topPos + 64, 18, 18, 0, 0, 18, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_trashicon3.png"), 18, 36, e -> {
			if (ReturnActiveSQ4Procedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new SideQuestGUIButtonMessage(5, x, y, z));
				SideQuestGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnActiveSQ4Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_trashicon3", imagebutton_trashicon3);
		this.addRenderableWidget(imagebutton_trashicon3);
	}
}
