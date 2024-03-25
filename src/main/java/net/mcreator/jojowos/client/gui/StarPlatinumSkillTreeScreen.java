package net.mcreator.jojowos.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.jojowos.world.inventory.StarPlatinumSkillTreeMenu;
import net.mcreator.jojowos.procedures.StarTimestopLengthDisplayProcedure;
import net.mcreator.jojowos.procedures.StarTimeskipDistanceProcedure;
import net.mcreator.jojowos.procedures.StarTimeStopUnlockDisplayProcedure;
import net.mcreator.jojowos.procedures.StarTimeStopLockDisplayProcedure;
import net.mcreator.jojowos.procedures.StarTimeSkipUnlockDisplayProcedure;
import net.mcreator.jojowos.procedures.StarTimeSkipLockDisplayProcedure;
import net.mcreator.jojowos.procedures.StarPlatinumPart6IconProcedure;
import net.mcreator.jojowos.procedures.StarPlatinumPart4IconProcedure;
import net.mcreator.jojowos.procedures.StarPlatinumOVAIconProcedure;
import net.mcreator.jojowos.procedures.StarPlatinumMangaIconProcedure;
import net.mcreator.jojowos.procedures.StarPlatinumGreenIconProcedure;
import net.mcreator.jojowos.procedures.StarPlatinumBlueIconProcedure;
import net.mcreator.jojowos.procedures.StarPlatinumBaseIconProcedure;
import net.mcreator.jojowos.procedures.StarInhaleRangeProcedure;
import net.mcreator.jojowos.procedures.StarFingerUnlockDisplayProcedure;
import net.mcreator.jojowos.procedures.StarFingerLockDisplayProcedure;
import net.mcreator.jojowos.procedures.StarFingerDamageProcedure;
import net.mcreator.jojowos.procedures.StarBearingDamageProcedure;
import net.mcreator.jojowos.procedures.StarAttackStatsProcedure;
import net.mcreator.jojowos.procedures.InhaleUnlockDisplayProcedure;
import net.mcreator.jojowos.procedures.InhaleLockDisplayProcedure;
import net.mcreator.jojowos.procedures.BearingShotUnlockDisplayProcedure;
import net.mcreator.jojowos.procedures.BearingShotLockDisplayProcedure;
import net.mcreator.jojowos.network.StarPlatinumSkillTreeButtonMessage;
import net.mcreator.jojowos.JojowosMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class StarPlatinumSkillTreeScreen extends AbstractContainerScreen<StarPlatinumSkillTreeMenu> {
	private final static HashMap<String, Object> guistate = StarPlatinumSkillTreeMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_skilltree_lock;
	ImageButton imagebutton_skilltree_lock1;
	ImageButton imagebutton_skilltree_lock2;
	ImageButton imagebutton_skilltree_lock3;
	ImageButton imagebutton_skilltree_lock4;
	ImageButton imagebutton_skillgui_button;

	public StarPlatinumSkillTreeScreen(StarPlatinumSkillTreeMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("jojowos:textures/screens/star_platinum_skill_tree.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (InhaleLockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + -107 && mouseX < leftPos + -83 && mouseY > topPos + -13 && mouseY < topPos + 11)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.star_platinum_skill_tree.tooltip_inhale_10_potential_3_skill_p"), mouseX, mouseY);
		if (BearingShotLockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + -52 && mouseX < leftPos + -28 && mouseY > topPos + -13 && mouseY < topPos + 11)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.star_platinum_skill_tree.tooltip_bearing_shot_20_potential_3_s"), mouseX, mouseY);
		if (StarFingerLockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + 27 && mouseX < leftPos + 51 && mouseY > topPos + -13 && mouseY < topPos + 11)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.star_platinum_skill_tree.tooltip_star_finger_30_potential_5_sk"), mouseX, mouseY);
		if (StarTimeSkipLockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + 82 && mouseX < leftPos + 106 && mouseY > topPos + -13 && mouseY < topPos + 11)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.star_platinum_skill_tree.tooltip_time_skip_80_potential_5_skil"), mouseX, mouseY);
		if (StarTimeStopLockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + -13 && mouseX < leftPos + 11 && mouseY > topPos + 27 && mouseY < topPos + 51)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.star_platinum_skill_tree.tooltip_time_stop_100_potential_10_sk"), mouseX, mouseY);
		if (StarTimeSkipUnlockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + 82 && mouseX < leftPos + 106 && mouseY > topPos + -13 && mouseY < topPos + 11)
				guiGraphics.renderTooltip(font, Component.literal(StarTimeskipDistanceProcedure.execute(entity)), mouseX, mouseY);
		if (StarFingerUnlockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + 27 && mouseX < leftPos + 51 && mouseY > topPos + -13 && mouseY < topPos + 11)
				guiGraphics.renderTooltip(font, Component.literal(StarFingerDamageProcedure.execute(entity)), mouseX, mouseY);
		if (BearingShotUnlockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + -52 && mouseX < leftPos + -28 && mouseY > topPos + -13 && mouseY < topPos + 11)
				guiGraphics.renderTooltip(font, Component.literal(StarBearingDamageProcedure.execute(entity)), mouseX, mouseY);
		if (InhaleUnlockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + -107 && mouseX < leftPos + -83 && mouseY > topPos + -13 && mouseY < topPos + 11)
				guiGraphics.renderTooltip(font, Component.literal(StarInhaleRangeProcedure.execute(entity)), mouseX, mouseY);
		if (mouseX > leftPos + -13 && mouseX < leftPos + 11 && mouseY > topPos + -13 && mouseY < topPos + 11)
			guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.star_platinum_skill_tree.tooltip_open_stand_stats"), mouseX, mouseY);
		if (mouseX > leftPos + -17 && mouseX < leftPos + 15 && mouseY > topPos + -56 && mouseY < topPos + -24)
			guiGraphics.renderTooltip(font, Component.literal(StarAttackStatsProcedure.execute(entity)), mouseX, mouseY);
		if (StarTimeStopUnlockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + -13 && mouseX < leftPos + 11 && mouseY > topPos + 27 && mouseY < topPos + 51)
				guiGraphics.renderTooltip(font, Component.literal(StarTimestopLengthDisplayProcedure.execute(entity)), mouseX, mouseY);
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

		guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_default.png"), this.leftPos + -124, this.topPos + -30, 0, 0, 58, 58, 58, 58);

		guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_default.png"), this.leftPos + 65, this.topPos + -30, 0, 0, 58, 58, 58, 58);

		if (StarPlatinumMangaIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_purple.png"), this.leftPos + -30, this.topPos + -69, 0, 0, 58, 58, 58, 58);
		}
		if (StarPlatinumMangaIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/starplatinumicon_manga.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (StarPlatinumPart6IconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_purple.png"), this.leftPos + -30, this.topPos + -69, 0, 0, 58, 58, 58, 58);
		}
		if (StarPlatinumPart6IconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/starplatinumicon_part6.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (StarPlatinumOVAIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_blue.png"), this.leftPos + -30, this.topPos + -69, 0, 0, 58, 58, 58, 58);
		}
		if (StarPlatinumOVAIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/starplatinumicon_ova.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (StarPlatinumPart4IconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_blue.png"), this.leftPos + -30, this.topPos + -69, 0, 0, 58, 58, 58, 58);
		}
		if (StarPlatinumPart4IconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/starplatinumicon_part4.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (StarPlatinumBlueIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_blue.png"), this.leftPos + -30, this.topPos + -69, 0, 0, 58, 58, 58, 58);
		}
		if (StarPlatinumBlueIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/starplatinumicon_blue.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (StarPlatinumGreenIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_green.png"), this.leftPos + -30, this.topPos + -69, 0, 0, 58, 58, 58, 58);
		}
		if (StarPlatinumGreenIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/starplatinumicon_green.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (StarPlatinumBaseIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_purple.png"), this.leftPos + -30, this.topPos + -69, 0, 0, 58, 58, 58, 58);
		}
		if (StarPlatinumBaseIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/starplatinum.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (InhaleUnlockDisplayProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/starplatinum_inhale.png"), this.leftPos + -113, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (BearingShotUnlockDisplayProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/starplatinum_bearingshot.png"), this.leftPos + -58, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (StarFingerUnlockDisplayProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/starplatinum_starfinger.png"), this.leftPos + 21, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (StarTimeSkipUnlockDisplayProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/starplatinum_timeskip.png"), this.leftPos + 76, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (StarTimeStopUnlockDisplayProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/starplatinum_timestop.png"), this.leftPos + -19, this.topPos + 20, 0, 0, 36, 36, 36, 36);
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
		imagebutton_skilltree_lock = new ImageButton(this.leftPos + -12, this.topPos + 26, 22, 26, 0, 0, 26, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_skilltree_lock.png"), 22, 52, e -> {
			if (StarTimeStopLockDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new StarPlatinumSkillTreeButtonMessage(0, x, y, z));
				StarPlatinumSkillTreeButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (StarTimeStopLockDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_lock", imagebutton_skilltree_lock);
		this.addRenderableWidget(imagebutton_skilltree_lock);
		imagebutton_skilltree_lock1 = new ImageButton(this.leftPos + 28, this.topPos + -14, 22, 26, 0, 0, 26, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_skilltree_lock1.png"), 22, 52, e -> {
			if (StarFingerLockDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new StarPlatinumSkillTreeButtonMessage(1, x, y, z));
				StarPlatinumSkillTreeButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (StarFingerLockDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_lock1", imagebutton_skilltree_lock1);
		this.addRenderableWidget(imagebutton_skilltree_lock1);
		imagebutton_skilltree_lock2 = new ImageButton(this.leftPos + 83, this.topPos + -14, 22, 26, 0, 0, 26, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_skilltree_lock2.png"), 22, 52, e -> {
			if (StarTimeSkipLockDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new StarPlatinumSkillTreeButtonMessage(2, x, y, z));
				StarPlatinumSkillTreeButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (StarTimeSkipLockDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_lock2", imagebutton_skilltree_lock2);
		this.addRenderableWidget(imagebutton_skilltree_lock2);
		imagebutton_skilltree_lock3 = new ImageButton(this.leftPos + -51, this.topPos + -14, 22, 26, 0, 0, 26, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_skilltree_lock3.png"), 22, 52, e -> {
			if (BearingShotLockDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new StarPlatinumSkillTreeButtonMessage(3, x, y, z));
				StarPlatinumSkillTreeButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (BearingShotLockDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_lock3", imagebutton_skilltree_lock3);
		this.addRenderableWidget(imagebutton_skilltree_lock3);
		imagebutton_skilltree_lock4 = new ImageButton(this.leftPos + -106, this.topPos + -14, 22, 26, 0, 0, 26, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_skilltree_lock4.png"), 22, 52, e -> {
			if (InhaleLockDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new StarPlatinumSkillTreeButtonMessage(4, x, y, z));
				StarPlatinumSkillTreeButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (InhaleLockDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_lock4", imagebutton_skilltree_lock4);
		this.addRenderableWidget(imagebutton_skilltree_lock4);
		imagebutton_skillgui_button = new ImageButton(this.leftPos + -12, this.topPos + -12, 22, 22, 0, 0, 22, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_skillgui_button.png"), 22, 44, e -> {
			if (true) {
				JojowosMod.PACKET_HANDLER.sendToServer(new StarPlatinumSkillTreeButtonMessage(5, x, y, z));
				StarPlatinumSkillTreeButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_skillgui_button", imagebutton_skillgui_button);
		this.addRenderableWidget(imagebutton_skillgui_button);
	}
}
