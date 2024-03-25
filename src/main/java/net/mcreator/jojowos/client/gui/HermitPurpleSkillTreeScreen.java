package net.mcreator.jojowos.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.jojowos.world.inventory.HermitPurpleSkillTreeMenu;
import net.mcreator.jojowos.procedures.TangleUnlockDisplayProcedure;
import net.mcreator.jojowos.procedures.TangleLockDisplayProcedure;
import net.mcreator.jojowos.procedures.HermitTangleLengthProcedure;
import net.mcreator.jojowos.procedures.HermitPurpleRedIconProcedure;
import net.mcreator.jojowos.procedures.HermitPurplePart4IconProcedure;
import net.mcreator.jojowos.procedures.HermitPurpleMangaIconProcedure;
import net.mcreator.jojowos.procedures.HermitPurpleGoldIconProcedure;
import net.mcreator.jojowos.procedures.HermitPurpleBlueIconProcedure;
import net.mcreator.jojowos.procedures.HermitPurpleBaseIconProcedure;
import net.mcreator.jojowos.procedures.HermitDivinationRangeProcedure;
import net.mcreator.jojowos.procedures.HermitAttackStatsProcedure;
import net.mcreator.jojowos.procedures.DivinationUnlockDisplayProcedure;
import net.mcreator.jojowos.procedures.DivinationLockDisplayProcedure;
import net.mcreator.jojowos.network.HermitPurpleSkillTreeButtonMessage;
import net.mcreator.jojowos.JojowosMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class HermitPurpleSkillTreeScreen extends AbstractContainerScreen<HermitPurpleSkillTreeMenu> {
	private final static HashMap<String, Object> guistate = HermitPurpleSkillTreeMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_skilltree_lock;
	ImageButton imagebutton_skilltree_lock1;
	ImageButton imagebutton_skillgui_button;

	public HermitPurpleSkillTreeScreen(HermitPurpleSkillTreeMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("jojowos:textures/screens/hermit_purple_skill_tree.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (TangleLockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + 43 && mouseX < leftPos + 67 && mouseY > topPos + -13 && mouseY < topPos + 11)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.hermit_purple_skill_tree.tooltip_tangle_20_potential_5_skill"), mouseX, mouseY);
		if (DivinationLockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + -68 && mouseX < leftPos + -44 && mouseY > topPos + -13 && mouseY < topPos + 11)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.hermit_purple_skill_tree.tooltip_divination_10_potential_3_ski"), mouseX, mouseY);
		if (TangleUnlockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + 43 && mouseX < leftPos + 67 && mouseY > topPos + -13 && mouseY < topPos + 11)
				guiGraphics.renderTooltip(font, Component.literal(HermitTangleLengthProcedure.execute()), mouseX, mouseY);
		if (DivinationUnlockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + -68 && mouseX < leftPos + -44 && mouseY > topPos + -13 && mouseY < topPos + 11)
				guiGraphics.renderTooltip(font, Component.literal(HermitDivinationRangeProcedure.execute()), mouseX, mouseY);
		if (mouseX > leftPos + -13 && mouseX < leftPos + 11 && mouseY > topPos + 26 && mouseY < topPos + 50)
			guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.hermit_purple_skill_tree.tooltip_open_stand_stats"), mouseX, mouseY);
		if (mouseX > leftPos + -13 && mouseX < leftPos + 11 && mouseY > topPos + -13 && mouseY < topPos + 11)
			guiGraphics.renderTooltip(font, Component.literal(HermitAttackStatsProcedure.execute()), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_default.png"), this.leftPos + 26, this.topPos + -30, 0, 0, 58, 58, 58, 58);

		guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_default.png"), this.leftPos + -85, this.topPos + -30, 0, 0, 58, 58, 58, 58);

		if (HermitPurpleMangaIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_purple.png"), this.leftPos + -30, this.topPos + -30, 0, 0, 58, 58, 58, 58);
		}
		if (HermitPurpleMangaIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/hermitpurpleicon_manga.png"), this.leftPos + -17, this.topPos + -17, 0, 0, 32, 32, 32, 32);
		}
		if (HermitPurplePart4IconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_purple.png"), this.leftPos + -30, this.topPos + -30, 0, 0, 58, 58, 58, 58);
		}
		if (HermitPurplePart4IconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/hermitpurpleicon_part4.png"), this.leftPos + -17, this.topPos + -17, 0, 0, 32, 32, 32, 32);
		}
		if (HermitPurpleBlueIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_blue.png"), this.leftPos + -30, this.topPos + -30, 0, 0, 58, 58, 58, 58);
		}
		if (HermitPurpleBlueIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/hermitpurpleicon_blue.png"), this.leftPos + -17, this.topPos + -17, 0, 0, 32, 32, 32, 32);
		}
		if (HermitPurpleGoldIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_yellow.png"), this.leftPos + -30, this.topPos + -30, 0, 0, 58, 58, 58, 58);
		}
		if (HermitPurpleGoldIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/hermitpurpleicon_gold.png"), this.leftPos + -17, this.topPos + -17, 0, 0, 32, 32, 32, 32);
		}
		if (HermitPurpleRedIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_red.png"), this.leftPos + -30, this.topPos + -30, 0, 0, 58, 58, 58, 58);
		}
		if (HermitPurpleRedIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/hermitpurpleicon_red.png"), this.leftPos + -17, this.topPos + -17, 0, 0, 32, 32, 32, 32);
		}
		if (HermitPurpleBaseIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_purple.png"), this.leftPos + -30, this.topPos + -30, 0, 0, 58, 58, 58, 58);
		}
		if (HermitPurpleBaseIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/hermitpurple.png"), this.leftPos + -17, this.topPos + -17, 0, 0, 32, 32, 32, 32);
		}
		if (DivinationUnlockDisplayProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/hermitpurple_cameraskill.png"), this.leftPos + -72, this.topPos + -17, 0, 0, 32, 32, 32, 32);
		}
		if (TangleUnlockDisplayProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/hermitpurple_tangleskill.png"), this.leftPos + 39, this.topPos + -17, 0, 0, 32, 32, 32, 32);
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
		imagebutton_skilltree_lock = new ImageButton(this.leftPos + -67, this.topPos + -14, 22, 26, 0, 0, 26, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_skilltree_lock.png"), 22, 52, e -> {
			if (DivinationLockDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new HermitPurpleSkillTreeButtonMessage(0, x, y, z));
				HermitPurpleSkillTreeButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (DivinationLockDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_lock", imagebutton_skilltree_lock);
		this.addRenderableWidget(imagebutton_skilltree_lock);
		imagebutton_skilltree_lock1 = new ImageButton(this.leftPos + 44, this.topPos + -14, 22, 26, 0, 0, 26, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_skilltree_lock1.png"), 22, 52, e -> {
			if (TangleLockDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new HermitPurpleSkillTreeButtonMessage(1, x, y, z));
				HermitPurpleSkillTreeButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (TangleLockDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_lock1", imagebutton_skilltree_lock1);
		this.addRenderableWidget(imagebutton_skilltree_lock1);
		imagebutton_skillgui_button = new ImageButton(this.leftPos + -12, this.topPos + 27, 22, 22, 0, 0, 22, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_skillgui_button.png"), 22, 44, e -> {
			if (true) {
				JojowosMod.PACKET_HANDLER.sendToServer(new HermitPurpleSkillTreeButtonMessage(2, x, y, z));
				HermitPurpleSkillTreeButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_skillgui_button", imagebutton_skillgui_button);
		this.addRenderableWidget(imagebutton_skillgui_button);
	}
}
