package net.mcreator.jojowos.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.jojowos.world.inventory.TheWorldSkillTreeMenu;
import net.mcreator.jojowos.procedures.WorldTimestopLengthDisplayProcedure;
import net.mcreator.jojowos.procedures.WorldTimeskipDistanceProcedure;
import net.mcreator.jojowos.procedures.WorldTimeStopUnlockDisplayProcedure;
import net.mcreator.jojowos.procedures.WorldTimeStopLockDisplayProcedure;
import net.mcreator.jojowos.procedures.WorldTimeSkipUnlockDisplayProcedure;
import net.mcreator.jojowos.procedures.WorldTimeSkipLockDisplayProcedure;
import net.mcreator.jojowos.procedures.WorldRoadRollerDamageProcedure;
import net.mcreator.jojowos.procedures.WorldMudaKickBarrageDamageProcedure;
import net.mcreator.jojowos.procedures.WorldKnifeThrowDamageProcedure;
import net.mcreator.jojowos.procedures.WorldAttackStatsProcedure;
import net.mcreator.jojowos.procedures.TheWorldSilverIconProcedure;
import net.mcreator.jojowos.procedures.TheWorldOVAIconProcedure;
import net.mcreator.jojowos.procedures.TheWorldMangaIconProcedure;
import net.mcreator.jojowos.procedures.TheWorldBlackIconProcedure;
import net.mcreator.jojowos.procedures.TheWorldBaseIconProcedure;
import net.mcreator.jojowos.procedures.RoadRollerUnlockDisplayProcedure;
import net.mcreator.jojowos.procedures.RoadRollerLockDisplayProcedure;
import net.mcreator.jojowos.procedures.MudaKickUnlockDisplayProcedure;
import net.mcreator.jojowos.procedures.MudaKickLockDisplayProcedure;
import net.mcreator.jojowos.procedures.KnifeTossUnlockDisplayProcedure;
import net.mcreator.jojowos.procedures.KnifeTossLockDisplayProcedure;
import net.mcreator.jojowos.network.TheWorldSkillTreeButtonMessage;
import net.mcreator.jojowos.JojowosMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class TheWorldSkillTreeScreen extends AbstractContainerScreen<TheWorldSkillTreeMenu> {
	private final static HashMap<String, Object> guistate = TheWorldSkillTreeMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_skilltree_lock;
	ImageButton imagebutton_skilltree_lock1;
	ImageButton imagebutton_skilltree_lock2;
	ImageButton imagebutton_skilltree_lock3;
	ImageButton imagebutton_skilltree_lock4;
	ImageButton imagebutton_skillgui_button;

	public TheWorldSkillTreeScreen(TheWorldSkillTreeMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("jojowos:textures/screens/the_world_skill_tree.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (RoadRollerLockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + -13 && mouseX < leftPos + 11 && mouseY > topPos + 26 && mouseY < topPos + 50)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.the_world_skill_tree.tooltip_road_roller_80_potential_10_s"), mouseX, mouseY);
		if (WorldTimeStopLockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + 82 && mouseX < leftPos + 106 && mouseY > topPos + -13 && mouseY < topPos + 11)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.the_world_skill_tree.tooltip_time_stop_50_potential_10_ski"), mouseX, mouseY);
		if (WorldTimeSkipLockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + 27 && mouseX < leftPos + 51 && mouseY > topPos + -13 && mouseY < topPos + 11)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.the_world_skill_tree.tooltip_time_skip_40_potential_5_skil"), mouseX, mouseY);
		if (KnifeTossLockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + -107 && mouseX < leftPos + -83 && mouseY > topPos + -13 && mouseY < topPos + 11)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.the_world_skill_tree.tooltip_knife_toss_10_potential_3_ski"), mouseX, mouseY);
		if (MudaKickLockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + -52 && mouseX < leftPos + -28 && mouseY > topPos + -13 && mouseY < topPos + 11)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.the_world_skill_tree.tooltip_muda_kick_barrage_20_potential"), mouseX, mouseY);
		if (KnifeTossUnlockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + -107 && mouseX < leftPos + -83 && mouseY > topPos + -13 && mouseY < topPos + 11)
				guiGraphics.renderTooltip(font, Component.literal(WorldKnifeThrowDamageProcedure.execute(entity)), mouseX, mouseY);
		if (MudaKickUnlockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + -52 && mouseX < leftPos + -28 && mouseY > topPos + -13 && mouseY < topPos + 11)
				guiGraphics.renderTooltip(font, Component.literal(WorldMudaKickBarrageDamageProcedure.execute(entity)), mouseX, mouseY);
		if (WorldTimeSkipUnlockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + 27 && mouseX < leftPos + 51 && mouseY > topPos + -13 && mouseY < topPos + 11)
				guiGraphics.renderTooltip(font, Component.literal(WorldTimeskipDistanceProcedure.execute(entity)), mouseX, mouseY);
		if (RoadRollerUnlockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + -13 && mouseX < leftPos + 11 && mouseY > topPos + 26 && mouseY < topPos + 50)
				guiGraphics.renderTooltip(font, Component.literal(WorldRoadRollerDamageProcedure.execute(entity)), mouseX, mouseY);
		if (mouseX > leftPos + -13 && mouseX < leftPos + 11 && mouseY > topPos + -13 && mouseY < topPos + 11)
			guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.the_world_skill_tree.tooltip_open_stand_stats"), mouseX, mouseY);
		if (mouseX > leftPos + -17 && mouseX < leftPos + 15 && mouseY > topPos + -56 && mouseY < topPos + -24)
			guiGraphics.renderTooltip(font, Component.literal(WorldAttackStatsProcedure.execute(entity)), mouseX, mouseY);
		if (WorldTimeStopUnlockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + 82 && mouseX < leftPos + 106 && mouseY > topPos + -13 && mouseY < topPos + 11)
				guiGraphics.renderTooltip(font, Component.literal(WorldTimestopLengthDisplayProcedure.execute(entity)), mouseX, mouseY);
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

		if (TheWorldSilverIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_purple.png"), this.leftPos + -30, this.topPos + -69, 0, 0, 58, 58, 58, 58);
		}
		if (TheWorldSilverIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/theworldicon_dark.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (TheWorldBlackIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_default.png"), this.leftPos + -30, this.topPos + -69, 0, 0, 58, 58, 58, 58);
		}
		if (TheWorldBlackIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/theworldicon_black.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (TheWorldMangaIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_yellow.png"), this.leftPos + -30, this.topPos + -69, 0, 0, 58, 58, 58, 58);
		}
		if (TheWorldMangaIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/theworldicon_manga.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (TheWorldOVAIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_yellow.png"), this.leftPos + -30, this.topPos + -69, 0, 0, 58, 58, 58, 58);
		}
		if (TheWorldOVAIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/theworldicon_ova.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (TheWorldBaseIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_yellow.png"), this.leftPos + -30, this.topPos + -69, 0, 0, 58, 58, 58, 58);
		}
		if (TheWorldBaseIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/theworld.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (KnifeTossUnlockDisplayProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/theworld_knifetoss.png"), this.leftPos + -113, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (MudaKickUnlockDisplayProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/theworld_kickbarrage.png"), this.leftPos + -58, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (WorldTimeSkipUnlockDisplayProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/theworld_timeskip.png"), this.leftPos + 21, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (WorldTimeStopUnlockDisplayProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/theworld_timestop.png"), this.leftPos + 76, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (RoadRollerUnlockDisplayProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/theworld_roadroller.png"), this.leftPos + -19, this.topPos + 20, 0, 0, 36, 36, 36, 36);
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
		imagebutton_skilltree_lock = new ImageButton(this.leftPos + -12, this.topPos + 25, 22, 26, 0, 0, 26, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_skilltree_lock.png"), 22, 52, e -> {
			if (RoadRollerLockDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new TheWorldSkillTreeButtonMessage(0, x, y, z));
				TheWorldSkillTreeButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (RoadRollerLockDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_lock", imagebutton_skilltree_lock);
		this.addRenderableWidget(imagebutton_skilltree_lock);
		imagebutton_skilltree_lock1 = new ImageButton(this.leftPos + 28, this.topPos + -14, 22, 26, 0, 0, 26, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_skilltree_lock1.png"), 22, 52, e -> {
			if (WorldTimeSkipLockDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new TheWorldSkillTreeButtonMessage(1, x, y, z));
				TheWorldSkillTreeButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (WorldTimeSkipLockDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_lock1", imagebutton_skilltree_lock1);
		this.addRenderableWidget(imagebutton_skilltree_lock1);
		imagebutton_skilltree_lock2 = new ImageButton(this.leftPos + 83, this.topPos + -14, 22, 26, 0, 0, 26, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_skilltree_lock2.png"), 22, 52, e -> {
			if (WorldTimeStopLockDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new TheWorldSkillTreeButtonMessage(2, x, y, z));
				TheWorldSkillTreeButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (WorldTimeStopLockDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_lock2", imagebutton_skilltree_lock2);
		this.addRenderableWidget(imagebutton_skilltree_lock2);
		imagebutton_skilltree_lock3 = new ImageButton(this.leftPos + -51, this.topPos + -14, 22, 26, 0, 0, 26, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_skilltree_lock3.png"), 22, 52, e -> {
			if (MudaKickLockDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new TheWorldSkillTreeButtonMessage(3, x, y, z));
				TheWorldSkillTreeButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (MudaKickLockDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_lock3", imagebutton_skilltree_lock3);
		this.addRenderableWidget(imagebutton_skilltree_lock3);
		imagebutton_skilltree_lock4 = new ImageButton(this.leftPos + -106, this.topPos + -14, 22, 26, 0, 0, 26, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_skilltree_lock4.png"), 22, 52, e -> {
			if (KnifeTossLockDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new TheWorldSkillTreeButtonMessage(4, x, y, z));
				TheWorldSkillTreeButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (KnifeTossLockDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_lock4", imagebutton_skilltree_lock4);
		this.addRenderableWidget(imagebutton_skilltree_lock4);
		imagebutton_skillgui_button = new ImageButton(this.leftPos + -12, this.topPos + -12, 22, 22, 0, 0, 22, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_skillgui_button.png"), 22, 44, e -> {
			if (true) {
				JojowosMod.PACKET_HANDLER.sendToServer(new TheWorldSkillTreeButtonMessage(5, x, y, z));
				TheWorldSkillTreeButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_skillgui_button", imagebutton_skillgui_button);
		this.addRenderableWidget(imagebutton_skillgui_button);
	}
}
