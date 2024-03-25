package net.mcreator.jojowos.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.jojowos.world.inventory.MagiciansRedSkillTreeMenu;
import net.mcreator.jojowos.procedures.RedBindUnlockDisplayProcedure;
import net.mcreator.jojowos.procedures.RedBindLockDisplayProcedure;
import net.mcreator.jojowos.procedures.MagiciansRedOVAIconProcedure;
import net.mcreator.jojowos.procedures.MagiciansRedMangaIconProcedure;
import net.mcreator.jojowos.procedures.MagiciansRedLifeDetectRangeProcedure;
import net.mcreator.jojowos.procedures.MagiciansRedGreenIconProcedure;
import net.mcreator.jojowos.procedures.MagiciansRedCrossfireSpecialDamageProcedure;
import net.mcreator.jojowos.procedures.MagiciansRedBindRangeProcedure;
import net.mcreator.jojowos.procedures.MagiciansRedBaseIconProcedure;
import net.mcreator.jojowos.procedures.MagiciansRedASBIconProcedure;
import net.mcreator.jojowos.procedures.MagiciansAttackStatsProcedure;
import net.mcreator.jojowos.procedures.LifeDetectorUnlockDisplayProcedure;
import net.mcreator.jojowos.procedures.LifeDetectorLockDisplayProcedure;
import net.mcreator.jojowos.procedures.CrossfireSpecialUnlockDisplayProcedure;
import net.mcreator.jojowos.procedures.CrossfireSpecialLockDisplayProcedure;
import net.mcreator.jojowos.network.MagiciansRedSkillTreeButtonMessage;
import net.mcreator.jojowos.JojowosMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class MagiciansRedSkillTreeScreen extends AbstractContainerScreen<MagiciansRedSkillTreeMenu> {
	private final static HashMap<String, Object> guistate = MagiciansRedSkillTreeMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_skilltree_lock;
	ImageButton imagebutton_skilltree_lock1;
	ImageButton imagebutton_skilltree_lock2;
	ImageButton imagebutton_skillgui_button;

	public MagiciansRedSkillTreeScreen(MagiciansRedSkillTreeMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("jojowos:textures/screens/magicians_red_skill_tree.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (RedBindLockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + 27 && mouseX < leftPos + 51 && mouseY > topPos + -13 && mouseY < topPos + 11)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.magicians_red_skill_tree.tooltip_red_bind_10_potential_3_skill"), mouseX, mouseY);
		if (LifeDetectorLockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + -52 && mouseX < leftPos + -28 && mouseY > topPos + -13 && mouseY < topPos + 11)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.magicians_red_skill_tree.tooltip_life_detector_10_potential_3"), mouseX, mouseY);
		if (CrossfireSpecialLockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + -13 && mouseX < leftPos + 11 && mouseY > topPos + 26 && mouseY < topPos + 50)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.magicians_red_skill_tree.tooltip_crossfire_hurricane_special_40"), mouseX, mouseY);
		if (RedBindUnlockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + -52 && mouseX < leftPos + -28 && mouseY > topPos + -13 && mouseY < topPos + 11)
				guiGraphics.renderTooltip(font, Component.literal(MagiciansRedLifeDetectRangeProcedure.execute()), mouseX, mouseY);
		if (RedBindUnlockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + 27 && mouseX < leftPos + 51 && mouseY > topPos + -13 && mouseY < topPos + 11)
				guiGraphics.renderTooltip(font, Component.literal(MagiciansRedBindRangeProcedure.execute(entity)), mouseX, mouseY);
		if (CrossfireSpecialUnlockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + -13 && mouseX < leftPos + 11 && mouseY > topPos + 26 && mouseY < topPos + 50)
				guiGraphics.renderTooltip(font, Component.literal(MagiciansRedCrossfireSpecialDamageProcedure.execute()), mouseX, mouseY);
		if (mouseX > leftPos + -13 && mouseX < leftPos + 11 && mouseY > topPos + -13 && mouseY < topPos + 11)
			guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.magicians_red_skill_tree.tooltip_open_stand_stats"), mouseX, mouseY);
		if (mouseX > leftPos + -17 && mouseX < leftPos + 15 && mouseY > topPos + -56 && mouseY < topPos + -24)
			guiGraphics.renderTooltip(font, Component.literal(MagiciansAttackStatsProcedure.execute(entity)), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_default.png"), this.leftPos + -30, this.topPos + 9, 0, 0, 58, 58, 58, 58);

		guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_default.png"), this.leftPos + 10, this.topPos + -30, 0, 0, 58, 58, 58, 58);

		guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_default.png"), this.leftPos + -69, this.topPos + -30, 0, 0, 58, 58, 58, 58);

		if (MagiciansRedASBIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_orange.png"), this.leftPos + -30, this.topPos + -69, 0, 0, 58, 58, 58, 58);
		}
		if (MagiciansRedASBIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/magiciansredicon_asb.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (MagiciansRedMangaIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_red.png"), this.leftPos + -30, this.topPos + -69, 0, 0, 58, 58, 58, 58);
		}
		if (MagiciansRedMangaIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/magiciansredicon_manga.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (MagiciansRedOVAIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_red.png"), this.leftPos + -30, this.topPos + -69, 0, 0, 58, 58, 58, 58);
		}
		if (MagiciansRedOVAIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/magiciansredicon_ova.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (MagiciansRedGreenIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_green.png"), this.leftPos + -30, this.topPos + -69, 0, 0, 58, 58, 58, 58);
		}
		if (MagiciansRedGreenIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/magiciansredicon_green.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (MagiciansRedBaseIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_red.png"), this.leftPos + -30, this.topPos + -69, 0, 0, 58, 58, 58, 58);
		}
		if (MagiciansRedBaseIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/magiciansred.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (CrossfireSpecialUnlockDisplayProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/magiciansred_crossfirespecial.png"), this.leftPos + -19, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (LifeDetectorUnlockDisplayProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/magiciansred_lifedetector.png"), this.leftPos + -58, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (RedBindUnlockDisplayProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/magiciansred_redbind.png"), this.leftPos + 21, this.topPos + -19, 0, 0, 36, 36, 36, 36);
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
		imagebutton_skilltree_lock = new ImageButton(this.leftPos + 28, this.topPos + -14, 22, 26, 0, 0, 26, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_skilltree_lock.png"), 22, 52, e -> {
			if (RedBindLockDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new MagiciansRedSkillTreeButtonMessage(0, x, y, z));
				MagiciansRedSkillTreeButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (RedBindLockDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_lock", imagebutton_skilltree_lock);
		this.addRenderableWidget(imagebutton_skilltree_lock);
		imagebutton_skilltree_lock1 = new ImageButton(this.leftPos + -12, this.topPos + 25, 22, 26, 0, 0, 26, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_skilltree_lock1.png"), 22, 52, e -> {
			if (CrossfireSpecialLockDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new MagiciansRedSkillTreeButtonMessage(1, x, y, z));
				MagiciansRedSkillTreeButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (CrossfireSpecialLockDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_lock1", imagebutton_skilltree_lock1);
		this.addRenderableWidget(imagebutton_skilltree_lock1);
		imagebutton_skilltree_lock2 = new ImageButton(this.leftPos + -51, this.topPos + -14, 22, 26, 0, 0, 26, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_skilltree_lock2.png"), 22, 52, e -> {
			if (LifeDetectorLockDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new MagiciansRedSkillTreeButtonMessage(2, x, y, z));
				MagiciansRedSkillTreeButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (LifeDetectorLockDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_lock2", imagebutton_skilltree_lock2);
		this.addRenderableWidget(imagebutton_skilltree_lock2);
		imagebutton_skillgui_button = new ImageButton(this.leftPos + -12, this.topPos + -12, 22, 22, 0, 0, 22, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_skillgui_button.png"), 22, 44, e -> {
			if (true) {
				JojowosMod.PACKET_HANDLER.sendToServer(new MagiciansRedSkillTreeButtonMessage(3, x, y, z));
				MagiciansRedSkillTreeButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_skillgui_button", imagebutton_skillgui_button);
		this.addRenderableWidget(imagebutton_skillgui_button);
	}
}
