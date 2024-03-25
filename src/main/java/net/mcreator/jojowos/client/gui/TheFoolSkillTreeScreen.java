package net.mcreator.jojowos.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.jojowos.world.inventory.TheFoolSkillTreeMenu;
import net.mcreator.jojowos.procedures.TheFoolOVAIconProcedure;
import net.mcreator.jojowos.procedures.TheFoolMangaIconProcedure;
import net.mcreator.jojowos.procedures.TheFoolBaseIconProcedure;
import net.mcreator.jojowos.procedures.SandGlideUnlockDisplayProcedure;
import net.mcreator.jojowos.procedures.SandGlideLockDisplayProcedure;
import net.mcreator.jojowos.procedures.SandDomeUnlockDisplayProcedure;
import net.mcreator.jojowos.procedures.SandDomeLockDisplayProcedure;
import net.mcreator.jojowos.procedures.FoolSandGlideLengthProcedure;
import net.mcreator.jojowos.procedures.FoolSandDomeLengthProcedure;
import net.mcreator.jojowos.procedures.FoolAttackStatsProcedure;
import net.mcreator.jojowos.network.TheFoolSkillTreeButtonMessage;
import net.mcreator.jojowos.JojowosMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class TheFoolSkillTreeScreen extends AbstractContainerScreen<TheFoolSkillTreeMenu> {
	private final static HashMap<String, Object> guistate = TheFoolSkillTreeMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_skilltree_lock;
	ImageButton imagebutton_skilltree_lock1;
	ImageButton imagebutton_skillgui_button;

	public TheFoolSkillTreeScreen(TheFoolSkillTreeMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("jojowos:textures/screens/the_fool_skill_tree.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (SandGlideLockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + -68 && mouseX < leftPos + -44 && mouseY > topPos + -13 && mouseY < topPos + 11)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.the_fool_skill_tree.tooltip_sand_glider_20_potential_3_sk"), mouseX, mouseY);
		if (SandDomeLockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + 43 && mouseX < leftPos + 67 && mouseY > topPos + -13 && mouseY < topPos + 11)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.the_fool_skill_tree.tooltip_sand_dome_40_potential_3_skil"), mouseX, mouseY);
		if (SandGlideUnlockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + -68 && mouseX < leftPos + -44 && mouseY > topPos + -13 && mouseY < topPos + 11)
				guiGraphics.renderTooltip(font, Component.literal(FoolSandGlideLengthProcedure.execute()), mouseX, mouseY);
		if (SandDomeUnlockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + 43 && mouseX < leftPos + 67 && mouseY > topPos + -13 && mouseY < topPos + 11)
				guiGraphics.renderTooltip(font, Component.literal(FoolSandDomeLengthProcedure.execute()), mouseX, mouseY);
		if (mouseX > leftPos + -13 && mouseX < leftPos + 11 && mouseY > topPos + 26 && mouseY < topPos + 50)
			guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.the_fool_skill_tree.tooltip_open_stand_stats"), mouseX, mouseY);
		if (mouseX > leftPos + -17 && mouseX < leftPos + 15 && mouseY > topPos + -17 && mouseY < topPos + 15)
			guiGraphics.renderTooltip(font, Component.literal(FoolAttackStatsProcedure.execute(entity)), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_default.png"), this.leftPos + 26, this.topPos + -30, 0, 0, 58, 58, 58, 58);

		guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_default.png"), this.leftPos + -85, this.topPos + -30, 0, 0, 58, 58, 58, 58);

		if (TheFoolMangaIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_yellow.png"), this.leftPos + -30, this.topPos + -30, 0, 0, 58, 58, 58, 58);
		}
		if (TheFoolMangaIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/thefoolicon_manga.png"), this.leftPos + -17, this.topPos + -17, 0, 0, 32, 32, 32, 32);
		}
		if (TheFoolOVAIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_yellow.png"), this.leftPos + -30, this.topPos + -30, 0, 0, 58, 58, 58, 58);
		}
		if (TheFoolOVAIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/thefoolicon_ova.png"), this.leftPos + -17, this.topPos + -17, 0, 0, 32, 32, 32, 32);
		}
		if (TheFoolBaseIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_default.png"), this.leftPos + -30, this.topPos + -30, 0, 0, 58, 58, 58, 58);
		}
		if (TheFoolBaseIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/thefool.png"), this.leftPos + -17, this.topPos + -17, 0, 0, 32, 32, 32, 32);
		}
		if (SandGlideUnlockDisplayProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/thefool_sandglide.png"), this.leftPos + -74, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (SandDomeUnlockDisplayProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/thefool_sanddome.png"), this.leftPos + 37, this.topPos + -19, 0, 0, 36, 36, 36, 36);
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
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_skilltree_lock = new ImageButton(this.leftPos + 44, this.topPos + -14, 22, 26, 0, 0, 26, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_skilltree_lock.png"), 22, 52, e -> {
			if (SandDomeLockDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new TheFoolSkillTreeButtonMessage(0, x, y, z));
				TheFoolSkillTreeButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (SandDomeLockDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_lock", imagebutton_skilltree_lock);
		this.addRenderableWidget(imagebutton_skilltree_lock);
		imagebutton_skilltree_lock1 = new ImageButton(this.leftPos + -67, this.topPos + -14, 22, 26, 0, 0, 26, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_skilltree_lock1.png"), 22, 52, e -> {
			if (SandGlideLockDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new TheFoolSkillTreeButtonMessage(1, x, y, z));
				TheFoolSkillTreeButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (SandGlideLockDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_lock1", imagebutton_skilltree_lock1);
		this.addRenderableWidget(imagebutton_skilltree_lock1);
		imagebutton_skillgui_button = new ImageButton(this.leftPos + -12, this.topPos + 27, 22, 22, 0, 0, 22, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_skillgui_button.png"), 22, 44, e -> {
			if (true) {
				JojowosMod.PACKET_HANDLER.sendToServer(new TheFoolSkillTreeButtonMessage(2, x, y, z));
				TheFoolSkillTreeButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_skillgui_button", imagebutton_skillgui_button);
		this.addRenderableWidget(imagebutton_skillgui_button);
	}
}
