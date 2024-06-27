package net.mcreator.jojowos.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.jojowos.world.inventory.StandSkillTreeEvenMenu;
import net.mcreator.jojowos.procedures.ZoomUnlocked8Procedure;
import net.mcreator.jojowos.procedures.ZoomUnlocked7Procedure;
import net.mcreator.jojowos.procedures.ZoomUnlocked6Procedure;
import net.mcreator.jojowos.procedures.ZoomUnlocked5Procedure;
import net.mcreator.jojowos.procedures.ZoomUnlocked4Procedure;
import net.mcreator.jojowos.procedures.ZoomUnlocked3Procedure;
import net.mcreator.jojowos.procedures.ZoomUnlocked2Procedure;
import net.mcreator.jojowos.procedures.TimestopCounterUnlocked8Procedure;
import net.mcreator.jojowos.procedures.TimestopCounterUnlocked7Procedure;
import net.mcreator.jojowos.procedures.TimestopCounterUnlocked6Procedure;
import net.mcreator.jojowos.procedures.TimestopCounterUnlocked5Procedure;
import net.mcreator.jojowos.procedures.TimestopCounterUnlocked4Procedure;
import net.mcreator.jojowos.procedures.TimestopCounterUnlocked3Procedure;
import net.mcreator.jojowos.procedures.TimestopCounterUnlocked2Procedure;
import net.mcreator.jojowos.procedures.TimeStopUnlocked8Procedure;
import net.mcreator.jojowos.procedures.TimeStopUnlocked7Procedure;
import net.mcreator.jojowos.procedures.TimeStopUnlocked6Procedure;
import net.mcreator.jojowos.procedures.TimeStopUnlocked5Procedure;
import net.mcreator.jojowos.procedures.TimeStopUnlocked4Procedure;
import net.mcreator.jojowos.procedures.TimeStopUnlocked3Procedure;
import net.mcreator.jojowos.procedures.TimeStopUnlocked2Procedure;
import net.mcreator.jojowos.procedures.TimeSkipUnlocked8Procedure;
import net.mcreator.jojowos.procedures.TimeSkipUnlocked7Procedure;
import net.mcreator.jojowos.procedures.TimeSkipUnlocked6Procedure;
import net.mcreator.jojowos.procedures.TimeSkipUnlocked5Procedure;
import net.mcreator.jojowos.procedures.TimeSkipUnlocked4Procedure;
import net.mcreator.jojowos.procedures.TimeSkipUnlocked3Procedure;
import net.mcreator.jojowos.procedures.TimeSkipUnlocked2Procedure;
import net.mcreator.jojowos.procedures.TheWorldSilverIconProcedure;
import net.mcreator.jojowos.procedures.TheWorldShadowIconProcedure;
import net.mcreator.jojowos.procedures.TheWorldOVAIconProcedure;
import net.mcreator.jojowos.procedures.TheWorldMangaIconProcedure;
import net.mcreator.jojowos.procedures.TheWorldImposterIconProcedure;
import net.mcreator.jojowos.procedures.TheWorldBlackIconProcedure;
import net.mcreator.jojowos.procedures.TheWorldBaseIconProcedure;
import net.mcreator.jojowos.procedures.TheFoolOVAIconProcedure;
import net.mcreator.jojowos.procedures.TheFoolMangaIconProcedure;
import net.mcreator.jojowos.procedures.TheFoolBaseIconProcedure;
import net.mcreator.jojowos.procedures.TangleUnlocked8Procedure;
import net.mcreator.jojowos.procedures.TangleUnlocked7Procedure;
import net.mcreator.jojowos.procedures.TangleUnlocked6Procedure;
import net.mcreator.jojowos.procedures.TangleUnlocked5Procedure;
import net.mcreator.jojowos.procedures.TangleUnlocked4Procedure;
import net.mcreator.jojowos.procedures.TangleUnlocked3Procedure;
import net.mcreator.jojowos.procedures.TangleUnlocked2Procedure;
import net.mcreator.jojowos.procedures.SwordLaunchUnlocked8Procedure;
import net.mcreator.jojowos.procedures.SwordLaunchUnlocked7Procedure;
import net.mcreator.jojowos.procedures.SwordLaunchUnlocked6Procedure;
import net.mcreator.jojowos.procedures.SwordLaunchUnlocked5Procedure;
import net.mcreator.jojowos.procedures.SwordLaunchUnlocked4Procedure;
import net.mcreator.jojowos.procedures.SwordLaunchUnlocked3Procedure;
import net.mcreator.jojowos.procedures.SwordLaunchUnlocked2Procedure;
import net.mcreator.jojowos.procedures.SwordBarrageUnlocked8Procedure;
import net.mcreator.jojowos.procedures.SwordBarrageUnlocked7Procedure;
import net.mcreator.jojowos.procedures.SwordBarrageUnlocked6Procedure;
import net.mcreator.jojowos.procedures.SwordBarrageUnlocked5Procedure;
import net.mcreator.jojowos.procedures.SwordBarrageUnlocked4Procedure;
import net.mcreator.jojowos.procedures.SwordBarrageUnlocked3Procedure;
import net.mcreator.jojowos.procedures.SwordBarrageUnlocked2Procedure;
import net.mcreator.jojowos.procedures.StarPlatinumPart6IconProcedure;
import net.mcreator.jojowos.procedures.StarPlatinumPart4IconProcedure;
import net.mcreator.jojowos.procedures.StarPlatinumOVAIconProcedure;
import net.mcreator.jojowos.procedures.StarPlatinumMangaIconProcedure;
import net.mcreator.jojowos.procedures.StarPlatinumGreenIconProcedure;
import net.mcreator.jojowos.procedures.StarPlatinumBlueIconProcedure;
import net.mcreator.jojowos.procedures.StarPlatinumBaseIconProcedure;
import net.mcreator.jojowos.procedures.StarFingerUnlocked8Procedure;
import net.mcreator.jojowos.procedures.StarFingerUnlocked7Procedure;
import net.mcreator.jojowos.procedures.StarFingerUnlocked6Procedure;
import net.mcreator.jojowos.procedures.StarFingerUnlocked5Procedure;
import net.mcreator.jojowos.procedures.StarFingerUnlocked4Procedure;
import net.mcreator.jojowos.procedures.StarFingerUnlocked3Procedure;
import net.mcreator.jojowos.procedures.StarFingerUnlocked2Procedure;
import net.mcreator.jojowos.procedures.StandStatsDisplayProcedure;
import net.mcreator.jojowos.procedures.SilverChariotOVAIconProcedure;
import net.mcreator.jojowos.procedures.SilverChariotMangaIconProcedure;
import net.mcreator.jojowos.procedures.SilverChariotGoldIconProcedure;
import net.mcreator.jojowos.procedures.SilverChariotBaseIconProcedure;
import net.mcreator.jojowos.procedures.ShortTimestopUnlocked8Procedure;
import net.mcreator.jojowos.procedures.ShortTimestopUnlocked7Procedure;
import net.mcreator.jojowos.procedures.ShortTimestopUnlocked6Procedure;
import net.mcreator.jojowos.procedures.ShortTimestopUnlocked5Procedure;
import net.mcreator.jojowos.procedures.ShortTimestopUnlocked4Procedure;
import net.mcreator.jojowos.procedures.ShortTimestopUnlocked3Procedure;
import net.mcreator.jojowos.procedures.ShortTimestopUnlocked2Procedure;
import net.mcreator.jojowos.procedures.SandGliderUnlocked8Procedure;
import net.mcreator.jojowos.procedures.SandGliderUnlocked7Procedure;
import net.mcreator.jojowos.procedures.SandGliderUnlocked6Procedure;
import net.mcreator.jojowos.procedures.SandGliderUnlocked5Procedure;
import net.mcreator.jojowos.procedures.SandGliderUnlocked4Procedure;
import net.mcreator.jojowos.procedures.SandGliderUnlocked3Procedure;
import net.mcreator.jojowos.procedures.SandGliderUnlocked2Procedure;
import net.mcreator.jojowos.procedures.SandDomeUnlocked8Procedure;
import net.mcreator.jojowos.procedures.SandDomeUnlocked7Procedure;
import net.mcreator.jojowos.procedures.SandDomeUnlocked6Procedure;
import net.mcreator.jojowos.procedures.SandDomeUnlocked5Procedure;
import net.mcreator.jojowos.procedures.SandDomeUnlocked4Procedure;
import net.mcreator.jojowos.procedures.SandDomeUnlocked3Procedure;
import net.mcreator.jojowos.procedures.SandDomeUnlocked2Procedure;
import net.mcreator.jojowos.procedures.RoadRollerUnlocked8Procedure;
import net.mcreator.jojowos.procedures.RoadRollerUnlocked7Procedure;
import net.mcreator.jojowos.procedures.RoadRollerUnlocked6Procedure;
import net.mcreator.jojowos.procedures.RoadRollerUnlocked5Procedure;
import net.mcreator.jojowos.procedures.RoadRollerUnlocked4Procedure;
import net.mcreator.jojowos.procedures.RoadRollerUnlocked3Procedure;
import net.mcreator.jojowos.procedures.RoadRollerUnlocked2Procedure;
import net.mcreator.jojowos.procedures.ReturnSkillCost8Procedure;
import net.mcreator.jojowos.procedures.ReturnSkillCost7Procedure;
import net.mcreator.jojowos.procedures.ReturnSkillCost6Procedure;
import net.mcreator.jojowos.procedures.ReturnSkillCost5Procedure;
import net.mcreator.jojowos.procedures.ReturnSkillCost4Procedure;
import net.mcreator.jojowos.procedures.ReturnSkillCost3Procedure;
import net.mcreator.jojowos.procedures.ReturnSkillCost2Procedure;
import net.mcreator.jojowos.procedures.ReturnNoAbility8Procedure;
import net.mcreator.jojowos.procedures.ReturnNoAbility7Procedure;
import net.mcreator.jojowos.procedures.ReturnNoAbility6Procedure;
import net.mcreator.jojowos.procedures.ReturnNoAbility5Procedure;
import net.mcreator.jojowos.procedures.ReturnNoAbility4Procedure;
import net.mcreator.jojowos.procedures.ReturnNoAbility3Procedure;
import net.mcreator.jojowos.procedures.ReturnNoAbility2Procedure;
import net.mcreator.jojowos.procedures.ReturnColorYellowProcedure;
import net.mcreator.jojowos.procedures.ReturnColorWhiteProcedure;
import net.mcreator.jojowos.procedures.ReturnColorRedProcedure;
import net.mcreator.jojowos.procedures.ReturnColorPurpleProcedure;
import net.mcreator.jojowos.procedures.ReturnColorPinkProcedure;
import net.mcreator.jojowos.procedures.ReturnColorOrangeProcedure;
import net.mcreator.jojowos.procedures.ReturnColorGreenProcedure;
import net.mcreator.jojowos.procedures.ReturnColorBlueProcedure;
import net.mcreator.jojowos.procedures.ReturnAbilityLocked8Procedure;
import net.mcreator.jojowos.procedures.ReturnAbilityLocked7Procedure;
import net.mcreator.jojowos.procedures.ReturnAbilityLocked6Procedure;
import net.mcreator.jojowos.procedures.ReturnAbilityLocked5Procedure;
import net.mcreator.jojowos.procedures.ReturnAbilityLocked4Procedure;
import net.mcreator.jojowos.procedures.ReturnAbilityLocked3Procedure;
import net.mcreator.jojowos.procedures.ReturnAbilityLocked2Procedure;
import net.mcreator.jojowos.procedures.RedBindUnlocked8Procedure;
import net.mcreator.jojowos.procedures.RedBindUnlocked7Procedure;
import net.mcreator.jojowos.procedures.RedBindUnlocked6Procedure;
import net.mcreator.jojowos.procedures.RedBindUnlocked5Procedure;
import net.mcreator.jojowos.procedures.RedBindUnlocked4Procedure;
import net.mcreator.jojowos.procedures.RedBindUnlocked3Procedure;
import net.mcreator.jojowos.procedures.RedBindUnlocked2Procedure;
import net.mcreator.jojowos.procedures.QuicksandUnlocked8Procedure;
import net.mcreator.jojowos.procedures.QuicksandUnlocked7Procedure;
import net.mcreator.jojowos.procedures.QuicksandUnlocked6Procedure;
import net.mcreator.jojowos.procedures.QuicksandUnlocked5Procedure;
import net.mcreator.jojowos.procedures.QuicksandUnlocked4Procedure;
import net.mcreator.jojowos.procedures.QuicksandUnlocked3Procedure;
import net.mcreator.jojowos.procedures.QuicksandUnlocked2Procedure;
import net.mcreator.jojowos.procedures.MagiciansRedOVAIconProcedure;
import net.mcreator.jojowos.procedures.MagiciansRedMangaIconProcedure;
import net.mcreator.jojowos.procedures.MagiciansRedGreenIconProcedure;
import net.mcreator.jojowos.procedures.MagiciansRedBaseIconProcedure;
import net.mcreator.jojowos.procedures.MagiciansRedASBIconProcedure;
import net.mcreator.jojowos.procedures.LifeDetectorUnlocked8Procedure;
import net.mcreator.jojowos.procedures.LifeDetectorUnlocked7Procedure;
import net.mcreator.jojowos.procedures.LifeDetectorUnlocked6Procedure;
import net.mcreator.jojowos.procedures.LifeDetectorUnlocked5Procedure;
import net.mcreator.jojowos.procedures.LifeDetectorUnlocked4Procedure;
import net.mcreator.jojowos.procedures.LifeDetectorUnlocked3Procedure;
import net.mcreator.jojowos.procedures.LifeDetectorUnlocked2Procedure;
import net.mcreator.jojowos.procedures.KnifeThrowUnlocked8Procedure;
import net.mcreator.jojowos.procedures.KnifeThrowUnlocked7Procedure;
import net.mcreator.jojowos.procedures.KnifeThrowUnlocked6Procedure;
import net.mcreator.jojowos.procedures.KnifeThrowUnlocked5Procedure;
import net.mcreator.jojowos.procedures.KnifeThrowUnlocked4Procedure;
import net.mcreator.jojowos.procedures.KnifeThrowUnlocked3Procedure;
import net.mcreator.jojowos.procedures.KnifeThrowUnlocked2Procedure;
import net.mcreator.jojowos.procedures.KickBarrageUnlocked9Procedure;
import net.mcreator.jojowos.procedures.KickBarrageUnlocked7Procedure;
import net.mcreator.jojowos.procedures.KickBarrageUnlocked6Procedure;
import net.mcreator.jojowos.procedures.KickBarrageUnlocked5Procedure;
import net.mcreator.jojowos.procedures.KickBarrageUnlocked4Procedure;
import net.mcreator.jojowos.procedures.KickBarrageUnlocked3Procedure;
import net.mcreator.jojowos.procedures.KickBarrageUnlocked2Procedure;
import net.mcreator.jojowos.procedures.InhaleUnlocked8Procedure;
import net.mcreator.jojowos.procedures.InhaleUnlocked7Procedure;
import net.mcreator.jojowos.procedures.InhaleUnlocked6Procedure;
import net.mcreator.jojowos.procedures.InhaleUnlocked5Procedure;
import net.mcreator.jojowos.procedures.InhaleUnlocked4Procedure;
import net.mcreator.jojowos.procedures.InhaleUnlocked3Procedure;
import net.mcreator.jojowos.procedures.InhaleUnlocked2Procedure;
import net.mcreator.jojowos.procedures.HierophantGreenOVAIconProcedure;
import net.mcreator.jojowos.procedures.HierophantGreenMangaIconProcedure;
import net.mcreator.jojowos.procedures.HierophantGreenBlueIconProcedure;
import net.mcreator.jojowos.procedures.HierophantGreenBaseIconProcedure;
import net.mcreator.jojowos.procedures.HermitPurpleRedIconProcedure;
import net.mcreator.jojowos.procedures.HermitPurplePart4IconProcedure;
import net.mcreator.jojowos.procedures.HermitPurpleMangaIconProcedure;
import net.mcreator.jojowos.procedures.HermitPurpleGoldIconProcedure;
import net.mcreator.jojowos.procedures.HermitPurpleBlueIconProcedure;
import net.mcreator.jojowos.procedures.HermitPurpleBaseIconProcedure;
import net.mcreator.jojowos.procedures.GrappleUnlocked8Procedure;
import net.mcreator.jojowos.procedures.GrappleUnlocked7Procedure;
import net.mcreator.jojowos.procedures.GrappleUnlocked6Procedure;
import net.mcreator.jojowos.procedures.GrappleUnlocked5Procedure;
import net.mcreator.jojowos.procedures.GrappleUnlocked4Procedure;
import net.mcreator.jojowos.procedures.GrappleUnlocked3Procedure;
import net.mcreator.jojowos.procedures.GrappleUnlocked2Procedure;
import net.mcreator.jojowos.procedures.FistBarrageUnlocked8Procedure;
import net.mcreator.jojowos.procedures.FistBarrageUnlocked7Procedure;
import net.mcreator.jojowos.procedures.FistBarrageUnlocked6Procedure;
import net.mcreator.jojowos.procedures.FistBarrageUnlocked5Procedure;
import net.mcreator.jojowos.procedures.FistBarrageUnlocked4Procedure;
import net.mcreator.jojowos.procedures.FistBarrageUnlocked3Procedure;
import net.mcreator.jojowos.procedures.FistBarrageUnlocked2Procedure;
import net.mcreator.jojowos.procedures.EmeraldSplashUnlocked9Procedure;
import net.mcreator.jojowos.procedures.EmeraldSplashUnlocked7Procedure;
import net.mcreator.jojowos.procedures.EmeraldSplashUnlocked6Procedure;
import net.mcreator.jojowos.procedures.EmeraldSplashUnlocked5Procedure;
import net.mcreator.jojowos.procedures.EmeraldSplashUnlocked4Procedure;
import net.mcreator.jojowos.procedures.EmeraldSplashUnlocked3Procedure;
import net.mcreator.jojowos.procedures.EmeraldSplashUnlocked2Procedure;
import net.mcreator.jojowos.procedures.EmeraldBarrierUnlocked8Procedure;
import net.mcreator.jojowos.procedures.EmeraldBarrierUnlocked7Procedure;
import net.mcreator.jojowos.procedures.EmeraldBarrierUnlocked6Procedure;
import net.mcreator.jojowos.procedures.EmeraldBarrierUnlocked5Procedure;
import net.mcreator.jojowos.procedures.EmeraldBarrierUnlocked4Procedure;
import net.mcreator.jojowos.procedures.EmeraldBarrierUnlocked3Procedure;
import net.mcreator.jojowos.procedures.EmeraldBarrierUnlocked2Procedure;
import net.mcreator.jojowos.procedures.CrossfireSpecialUnlocked8Procedure;
import net.mcreator.jojowos.procedures.CrossfireSpecialUnlocked7Procedure;
import net.mcreator.jojowos.procedures.CrossfireSpecialUnlocked6Procedure;
import net.mcreator.jojowos.procedures.CrossfireSpecialUnlocked5Procedure;
import net.mcreator.jojowos.procedures.CrossfireSpecialUnlocked4Procedure;
import net.mcreator.jojowos.procedures.CrossfireSpecialUnlocked3Procedure;
import net.mcreator.jojowos.procedures.CrossfireSpecialUnlocked2Procedure;
import net.mcreator.jojowos.procedures.CrossfireHurricaneUnlocked8Procedure;
import net.mcreator.jojowos.procedures.CrossfireHurricaneUnlocked7Procedure;
import net.mcreator.jojowos.procedures.CrossfireHurricaneUnlocked6Procedure;
import net.mcreator.jojowos.procedures.CrossfireHurricaneUnlocked5Procedure;
import net.mcreator.jojowos.procedures.CrossfireHurricaneUnlocked4Procedure;
import net.mcreator.jojowos.procedures.CrossfireHurricaneUnlocked3Procedure;
import net.mcreator.jojowos.procedures.CrossfireHurricaneUnlocked2Procedure;
import net.mcreator.jojowos.procedures.BodyControlUnlocked8Procedure;
import net.mcreator.jojowos.procedures.BodyControlUnlocked7Procedure;
import net.mcreator.jojowos.procedures.BodyControlUnlocked6Procedure;
import net.mcreator.jojowos.procedures.BodyControlUnlocked5Procedure;
import net.mcreator.jojowos.procedures.BodyControlUnlocked4Procedure;
import net.mcreator.jojowos.procedures.BodyControlUnlocked3Procedure;
import net.mcreator.jojowos.procedures.BodyControlUnlocked2Procedure;
import net.mcreator.jojowos.procedures.BladeCycloneUnlocked8Procedure;
import net.mcreator.jojowos.procedures.BladeCycloneUnlocked7Procedure;
import net.mcreator.jojowos.procedures.BladeCycloneUnlocked6Procedure;
import net.mcreator.jojowos.procedures.BladeCycloneUnlocked5Procedure;
import net.mcreator.jojowos.procedures.BladeCycloneUnlocked4Procedure;
import net.mcreator.jojowos.procedures.BladeCycloneUnlocked3Procedure;
import net.mcreator.jojowos.procedures.BladeCycloneUnlocked2Procedure;
import net.mcreator.jojowos.procedures.BearingShotUnlocked8Procedure;
import net.mcreator.jojowos.procedures.BearingShotUnlocked7Procedure;
import net.mcreator.jojowos.procedures.BearingShotUnlocked6Procedure;
import net.mcreator.jojowos.procedures.BearingShotUnlocked5Procedure;
import net.mcreator.jojowos.procedures.BearingShotUnlocked4Procedure;
import net.mcreator.jojowos.procedures.BearingShotUnlocked3Procedure;
import net.mcreator.jojowos.procedures.BearingShotUnlocked2Procedure;
import net.mcreator.jojowos.procedures.ArmorOffUnlocked8Procedure;
import net.mcreator.jojowos.procedures.ArmorOffUnlocked7Procedure;
import net.mcreator.jojowos.procedures.ArmorOffUnlocked6Procedure;
import net.mcreator.jojowos.procedures.ArmorOffUnlocked5Procedure;
import net.mcreator.jojowos.procedures.ArmorOffUnlocked4Procedure;
import net.mcreator.jojowos.procedures.ArmorOffUnlocked3Procedure;
import net.mcreator.jojowos.procedures.ArmorOffUnlocked2Procedure;
import net.mcreator.jojowos.network.StandSkillTreeEvenButtonMessage;
import net.mcreator.jojowos.JojowosMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class StandSkillTreeEvenScreen extends AbstractContainerScreen<StandSkillTreeEvenMenu> {
	private final static HashMap<String, Object> guistate = StandSkillTreeEvenMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_skillgui_button;
	ImageButton imagebutton_skilltree_lock;
	ImageButton imagebutton_skilltree_lock1;
	ImageButton imagebutton_skilltree_lock2;
	ImageButton imagebutton_skilltree_lock3;
	ImageButton imagebutton_skilltree_lock4;
	ImageButton imagebutton_skilltree_lock5;
	ImageButton imagebutton_skilltree_lock6;

	public StandSkillTreeEvenScreen(StandSkillTreeEvenMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("jojowos:textures/screens/stand_skill_tree_even.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (ReturnAbilityLocked2Procedure.execute(entity))
			if (mouseX > leftPos + -52 && mouseX < leftPos + -28 && mouseY > topPos + -13 && mouseY < topPos + 11)
				guiGraphics.renderTooltip(font, Component.literal(ReturnSkillCost2Procedure.execute(entity)), mouseX, mouseY);
		if (ReturnAbilityLocked3Procedure.execute(entity))
			if (mouseX > leftPos + 26 && mouseX < leftPos + 50 && mouseY > topPos + -13 && mouseY < topPos + 11)
				guiGraphics.renderTooltip(font, Component.literal(ReturnSkillCost3Procedure.execute(entity)), mouseX, mouseY);
		if (ReturnAbilityLocked4Procedure.execute(entity))
			if (mouseX > leftPos + -13 && mouseX < leftPos + 11 && mouseY > topPos + 26 && mouseY < topPos + 50)
				guiGraphics.renderTooltip(font, Component.literal(ReturnSkillCost4Procedure.execute(entity)), mouseX, mouseY);
		if (ReturnAbilityLocked5Procedure.execute(entity))
			if (mouseX > leftPos + -91 && mouseX < leftPos + -67 && mouseY > topPos + 26 && mouseY < topPos + 50)
				guiGraphics.renderTooltip(font, Component.literal(ReturnSkillCost5Procedure.execute(entity)), mouseX, mouseY);
		if (ReturnAbilityLocked6Procedure.execute(entity))
			if (mouseX > leftPos + 65 && mouseX < leftPos + 89 && mouseY > topPos + 26 && mouseY < topPos + 50)
				guiGraphics.renderTooltip(font, Component.literal(ReturnSkillCost6Procedure.execute(entity)), mouseX, mouseY);
		if (ReturnAbilityLocked7Procedure.execute(entity))
			if (mouseX > leftPos + 65 && mouseX < leftPos + 89 && mouseY > topPos + -52 && mouseY < topPos + -28)
				guiGraphics.renderTooltip(font, Component.literal(ReturnSkillCost7Procedure.execute(entity)), mouseX, mouseY);
		if (ReturnAbilityLocked8Procedure.execute(entity))
			if (mouseX > leftPos + -91 && mouseX < leftPos + -67 && mouseY > topPos + -52 && mouseY < topPos + -28)
				guiGraphics.renderTooltip(font, Component.literal(ReturnSkillCost8Procedure.execute(entity)), mouseX, mouseY);
		if (mouseX > leftPos + -19 && mouseX < leftPos + 17 && mouseY > topPos + -58 && mouseY < topPos + -22)
			guiGraphics.renderTooltip(font, Component.literal(StandStatsDisplayProcedure.execute(entity)), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		if (ReturnNoAbility4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_default.png"), this.leftPos + -30, this.topPos + 9, 0, 0, 58, 58, 58, 58);
		}
		if (ReturnNoAbility3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_default.png"), this.leftPos + 9, this.topPos + -30, 0, 0, 58, 58, 58, 58);
		}
		if (ReturnNoAbility2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_default.png"), this.leftPos + -69, this.topPos + -30, 0, 0, 58, 58, 58, 58);
		}
		if (ReturnNoAbility6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_default.png"), this.leftPos + 48, this.topPos + 9, 0, 0, 58, 58, 58, 58);
		}
		if (ReturnNoAbility5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_default.png"), this.leftPos + -108, this.topPos + 9, 0, 0, 58, 58, 58, 58);
		}
		if (ReturnNoAbility7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_default.png"), this.leftPos + 48, this.topPos + -69, 0, 0, 58, 58, 58, 58);
		}
		if (ReturnNoAbility8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_default.png"), this.leftPos + -108, this.topPos + -69, 0, 0, 58, 58, 58, 58);
		}
		if (ReturnColorWhiteProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_default.png"), this.leftPos + -30, this.topPos + -69, 0, 0, 58, 58, 58, 58);
		}
		if (ReturnColorRedProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_red.png"), this.leftPos + -30, this.topPos + -69, 0, 0, 58, 58, 58, 58);
		}
		if (ReturnColorOrangeProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_orange.png"), this.leftPos + -30, this.topPos + -69, 0, 0, 58, 58, 58, 58);
		}
		if (ReturnColorYellowProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_yellow.png"), this.leftPos + -30, this.topPos + -69, 0, 0, 58, 58, 58, 58);
		}
		if (ReturnColorGreenProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_green.png"), this.leftPos + -30, this.topPos + -69, 0, 0, 58, 58, 58, 58);
		}
		if (ReturnColorBlueProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_blue.png"), this.leftPos + -30, this.topPos + -69, 0, 0, 58, 58, 58, 58);
		}
		if (ReturnColorPurpleProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_purple.png"), this.leftPos + -30, this.topPos + -69, 0, 0, 58, 58, 58, 58);
		}
		if (ReturnColorPinkProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_pink.png"), this.leftPos + -30, this.topPos + -69, 0, 0, 58, 58, 58, 58);
		}
		if (StarPlatinumBaseIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/starplatinum.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (StarPlatinumMangaIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/starplatinumicon_manga.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (StarPlatinumOVAIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/starplatinumicon_ova.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (StarPlatinumPart4IconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/starplatinumicon_part4.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (StarPlatinumPart6IconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/starplatinumicon_part6.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (StarPlatinumGreenIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/starplatinumicon_green.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (StarPlatinumBlueIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/starplatinumicon_blue.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (TheWorldBaseIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/theworld.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (TheWorldBlackIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/theworldicon_black.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (TheWorldSilverIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/theworldicon_dark.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (TheWorldMangaIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/theworldicon_manga.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (TheWorldOVAIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/theworldicon_ova.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (MagiciansRedBaseIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/magiciansred.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (MagiciansRedASBIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/magiciansredicon_asb.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (MagiciansRedGreenIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/magiciansredicon_green.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (MagiciansRedMangaIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/magiciansredicon_manga.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (MagiciansRedOVAIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/magiciansredicon_ova.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (HermitPurpleBaseIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/hermitpurple.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (HermitPurpleBlueIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/hermitpurpleicon_blue.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (HermitPurpleGoldIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/hermitpurpleicon_gold.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (HermitPurpleMangaIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/hermitpurpleicon_manga.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (HermitPurplePart4IconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/hermitpurpleicon_part4.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (HermitPurpleRedIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/hermitpurpleicon_red.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (HierophantGreenBaseIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/hierophantgreen.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (HierophantGreenBlueIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/hierophantgreenicon_blue.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (HierophantGreenMangaIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/hierophantgreenicon_manga.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (HierophantGreenOVAIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/hierophantgreenicon_ova.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (SilverChariotBaseIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/silverchariot.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (SilverChariotGoldIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/silvercharioticon_gold.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (SilverChariotMangaIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/silvercharioticon_manga.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (SilverChariotOVAIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/silvercharioticon_ova.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (TheFoolBaseIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/thefool.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (TheFoolMangaIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/thefoolicon_manga.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (TheFoolOVAIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/thefoolicon_ova.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (TheWorldShadowIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/theworldicon_shadow.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (TheWorldImposterIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/theworldicon_imposter.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (FistBarrageUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_fistbarrage.png"), this.leftPos + -58, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (FistBarrageUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_fistbarrage.png"), this.leftPos + 20, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (FistBarrageUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_fistbarrage.png"), this.leftPos + -19, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (FistBarrageUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_fistbarrage.png"), this.leftPos + -97, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (FistBarrageUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_fistbarrage.png"), this.leftPos + 59, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (FistBarrageUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_fistbarrage.png"), this.leftPos + 59, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (FistBarrageUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_fistbarrage.png"), this.leftPos + -97, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (KickBarrageUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_kickbarrage.png"), this.leftPos + -58, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (KickBarrageUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_kickbarrage.png"), this.leftPos + 20, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (KickBarrageUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_kickbarrage.png"), this.leftPos + -19, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (KickBarrageUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_kickbarrage.png"), this.leftPos + -97, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (KickBarrageUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_kickbarrage.png"), this.leftPos + 59, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (KickBarrageUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_kickbarrage.png"), this.leftPos + 59, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (KickBarrageUnlocked9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_kickbarrage.png"), this.leftPos + -97, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (BearingShotUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bearingshot.png"), this.leftPos + -58, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (BearingShotUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bearingshot.png"), this.leftPos + 20, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (BearingShotUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bearingshot.png"), this.leftPos + -19, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (BearingShotUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bearingshot.png"), this.leftPos + -97, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (BearingShotUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bearingshot.png"), this.leftPos + 59, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (BearingShotUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bearingshot.png"), this.leftPos + 59, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (BearingShotUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bearingshot.png"), this.leftPos + -97, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (InhaleUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_inhale.png"), this.leftPos + -58, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (InhaleUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_inhale.png"), this.leftPos + 20, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (InhaleUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_inhale.png"), this.leftPos + -19, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (InhaleUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_inhale.png"), this.leftPos + -97, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (InhaleUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_inhale.png"), this.leftPos + 59, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (InhaleUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_inhale.png"), this.leftPos + 59, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (InhaleUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_inhale.png"), this.leftPos + -97, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (StarFingerUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_starfinger.png"), this.leftPos + -58, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (StarFingerUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_starfinger.png"), this.leftPos + 20, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (StarFingerUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_starfinger.png"), this.leftPos + -19, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (StarFingerUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_starfinger.png"), this.leftPos + -97, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (StarFingerUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_starfinger.png"), this.leftPos + 59, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (StarFingerUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_starfinger.png"), this.leftPos + 59, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (StarFingerUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_starfinger.png"), this.leftPos + -97, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (TimeSkipUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timeskip.png"), this.leftPos + -58, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (TimeSkipUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timeskip.png"), this.leftPos + 20, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (TimeSkipUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timeskip.png"), this.leftPos + -19, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (TimeSkipUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timeskip.png"), this.leftPos + -97, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (TimeSkipUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timeskip.png"), this.leftPos + 59, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (TimeSkipUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timeskip.png"), this.leftPos + 59, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (TimeSkipUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timeskip.png"), this.leftPos + -97, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (ShortTimestopUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_shorttimestop.png"), this.leftPos + -58, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (ShortTimestopUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_shorttimestop.png"), this.leftPos + 20, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (ShortTimestopUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_shorttimestop.png"), this.leftPos + -19, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (ShortTimestopUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_shorttimestop.png"), this.leftPos + -97, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (ShortTimestopUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_shorttimestop.png"), this.leftPos + 59, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (ShortTimestopUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_shorttimestop.png"), this.leftPos + 59, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (ShortTimestopUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_shorttimestop.png"), this.leftPos + -97, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (ZoomUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_zoom.png"), this.leftPos + -56, this.topPos + -17, 0, 0, 32, 32, 32, 32);
		}
		if (ZoomUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_zoom.png"), this.leftPos + 22, this.topPos + -17, 0, 0, 32, 32, 32, 32);
		}
		if (ZoomUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_zoom.png"), this.leftPos + -17, this.topPos + 22, 0, 0, 32, 32, 32, 32);
		}
		if (ZoomUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_zoom.png"), this.leftPos + -95, this.topPos + 22, 0, 0, 32, 32, 32, 32);
		}
		if (ZoomUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_zoom.png"), this.leftPos + 61, this.topPos + 22, 0, 0, 32, 32, 32, 32);
		}
		if (ZoomUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_zoom.png"), this.leftPos + 61, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (ZoomUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_zoom.png"), this.leftPos + -95, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (TimestopCounterUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timestopcounter.png"), this.leftPos + -58, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (TimestopCounterUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timestopcounter.png"), this.leftPos + 20, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (TimestopCounterUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timestopcounter.png"), this.leftPos + -19, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (TimestopCounterUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timestopcounter.png"), this.leftPos + -97, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (TimestopCounterUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timestopcounter.png"), this.leftPos + 59, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (TimestopCounterUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timestopcounter.png"), this.leftPos + 59, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (TimestopCounterUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timestopcounter.png"), this.leftPos + -97, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (TimeStopUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timestop.png"), this.leftPos + -58, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (TimeStopUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timestop.png"), this.leftPos + 20, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (TimeStopUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timestop.png"), this.leftPos + -19, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (TimeStopUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timestop.png"), this.leftPos + -97, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (TimeStopUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timestop.png"), this.leftPos + 59, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (TimeStopUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timestop.png"), this.leftPos + 59, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (TimeStopUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timestop.png"), this.leftPos + -97, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (KnifeThrowUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_knifethrow.png"), this.leftPos + -58, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (KnifeThrowUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_knifethrow.png"), this.leftPos + 20, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (KnifeThrowUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_knifethrow.png"), this.leftPos + -19, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (KnifeThrowUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_knifethrow.png"), this.leftPos + -97, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (KnifeThrowUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_knifethrow.png"), this.leftPos + 59, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (KnifeThrowUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_knifethrow.png"), this.leftPos + 59, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (KnifeThrowUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_knifethrow.png"), this.leftPos + -97, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (RoadRollerUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_roadroller.png"), this.leftPos + -58, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (RoadRollerUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_roadroller.png"), this.leftPos + 20, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (RoadRollerUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_roadroller.png"), this.leftPos + -19, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (RoadRollerUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_roadroller.png"), this.leftPos + -97, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (RoadRollerUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_roadroller.png"), this.leftPos + 59, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (RoadRollerUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_roadroller.png"), this.leftPos + 59, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (RoadRollerUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_roadroller.png"), this.leftPos + -97, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (CrossfireHurricaneUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_crossfire.png"), this.leftPos + -58, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (CrossfireHurricaneUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_crossfire.png"), this.leftPos + 20, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (CrossfireHurricaneUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_crossfire.png"), this.leftPos + -19, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (CrossfireHurricaneUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_crossfire.png"), this.leftPos + -97, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (CrossfireHurricaneUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_crossfire.png"), this.leftPos + 59, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (CrossfireHurricaneUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_crossfire.png"), this.leftPos + 59, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (CrossfireHurricaneUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_crossfire.png"), this.leftPos + -97, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (CrossfireSpecialUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_crossfirespecial.png"), this.leftPos + -58, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (CrossfireSpecialUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_crossfirespecial.png"), this.leftPos + 20, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (CrossfireSpecialUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_crossfirespecial.png"), this.leftPos + -19, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (CrossfireSpecialUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_crossfirespecial.png"), this.leftPos + -97, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (CrossfireSpecialUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_crossfirespecial.png"), this.leftPos + 59, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (CrossfireSpecialUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_crossfirespecial.png"), this.leftPos + 59, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (CrossfireSpecialUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_crossfirespecial.png"), this.leftPos + -97, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (RedBindUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/magiciansred_redbind.png"), this.leftPos + -58, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (RedBindUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/magiciansred_redbind.png"), this.leftPos + 20, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (RedBindUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/magiciansred_redbind.png"), this.leftPos + -19, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (RedBindUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/magiciansred_redbind.png"), this.leftPos + -97, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (RedBindUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/magiciansred_redbind.png"), this.leftPos + 59, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (RedBindUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/magiciansred_redbind.png"), this.leftPos + 59, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (RedBindUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/magiciansred_redbind.png"), this.leftPos + -97, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (LifeDetectorUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_lifedetect.png"), this.leftPos + -58, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (LifeDetectorUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_lifedetect.png"), this.leftPos + 20, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (LifeDetectorUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_lifedetect.png"), this.leftPos + -19, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (LifeDetectorUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_lifedetect.png"), this.leftPos + -97, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (LifeDetectorUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_lifedetect.png"), this.leftPos + 59, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (LifeDetectorUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_lifedetect.png"), this.leftPos + 59, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (LifeDetectorUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_lifedetect.png"), this.leftPos + -97, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (TangleUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_tangle.png"), this.leftPos + -58, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (TangleUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_tangle.png"), this.leftPos + 20, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (TangleUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_tangle.png"), this.leftPos + -19, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (TangleUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_tangle.png"), this.leftPos + -97, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (TangleUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_tangle.png"), this.leftPos + 59, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (TangleUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_tangle.png"), this.leftPos + 59, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (TangleUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_tangle.png"), this.leftPos + -97, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (GrappleUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_grapple.png"), this.leftPos + -58, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (GrappleUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_grapple.png"), this.leftPos + 20, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (GrappleUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_grapple.png"), this.leftPos + -19, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (GrappleUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_grapple.png"), this.leftPos + -97, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (GrappleUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_grapple.png"), this.leftPos + 59, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (GrappleUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_grapple.png"), this.leftPos + 59, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (GrappleUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_grapple.png"), this.leftPos + -97, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (EmeraldSplashUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_emeraldsplash.png"), this.leftPos + -58, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (EmeraldSplashUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_emeraldsplash.png"), this.leftPos + 20, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (EmeraldSplashUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_emeraldsplash.png"), this.leftPos + -19, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (EmeraldSplashUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_emeraldsplash.png"), this.leftPos + -97, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (EmeraldSplashUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_emeraldsplash.png"), this.leftPos + 59, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (EmeraldSplashUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_emeraldsplash.png"), this.leftPos + 59, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (EmeraldSplashUnlocked9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_emeraldsplash.png"), this.leftPos + -97, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (EmeraldBarrierUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_emeraldbarrier.png"), this.leftPos + -56, this.topPos + -17, 0, 0, 32, 32, 32, 32);
		}
		if (EmeraldBarrierUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_emeraldbarrier.png"), this.leftPos + 22, this.topPos + -17, 0, 0, 32, 32, 32, 32);
		}
		if (EmeraldBarrierUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_emeraldbarrier.png"), this.leftPos + -17, this.topPos + 22, 0, 0, 32, 32, 32, 32);
		}
		if (EmeraldBarrierUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_emeraldbarrier.png"), this.leftPos + -95, this.topPos + 22, 0, 0, 32, 32, 32, 32);
		}
		if (EmeraldBarrierUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_emeraldbarrier.png"), this.leftPos + 61, this.topPos + 22, 0, 0, 32, 32, 32, 32);
		}
		if (EmeraldBarrierUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_emeraldbarrier.png"), this.leftPos + 61, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (EmeraldBarrierUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_emeraldbarrier.png"), this.leftPos + -95, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (BodyControlUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bodycontrol.png"), this.leftPos + -58, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (BodyControlUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bodycontrol.png"), this.leftPos + 20, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (BodyControlUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bodycontrol.png"), this.leftPos + -19, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (BodyControlUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bodycontrol.png"), this.leftPos + -97, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (BodyControlUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bodycontrol.png"), this.leftPos + 59, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (BodyControlUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bodycontrol.png"), this.leftPos + 59, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (BodyControlUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bodycontrol.png"), this.leftPos + -97, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (SwordBarrageUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_swordbarrage.png"), this.leftPos + -58, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (SwordBarrageUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_swordbarrage.png"), this.leftPos + 20, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (SwordBarrageUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_swordbarrage.png"), this.leftPos + -19, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (SwordBarrageUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_swordbarrage.png"), this.leftPos + -97, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (SwordBarrageUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_swordbarrage.png"), this.leftPos + 59, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (SwordBarrageUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_swordbarrage.png"), this.leftPos + 59, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (SwordBarrageUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_swordbarrage.png"), this.leftPos + -97, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (SwordLaunchUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_swordlaunch.png"), this.leftPos + -58, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (SwordLaunchUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_swordlaunch.png"), this.leftPos + 20, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (SwordLaunchUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_swordlaunch.png"), this.leftPos + -19, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (SwordLaunchUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_swordlaunch.png"), this.leftPos + -97, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (SwordLaunchUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_swordlaunch.png"), this.leftPos + 59, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (SwordLaunchUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_swordlaunch.png"), this.leftPos + 59, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (SwordLaunchUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_swordlaunch.png"), this.leftPos + -97, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (BladeCycloneUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bladecyclone.png"), this.leftPos + -58, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (BladeCycloneUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bladecyclone.png"), this.leftPos + 20, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (BladeCycloneUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bladecyclone.png"), this.leftPos + -19, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (BladeCycloneUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bladecyclone.png"), this.leftPos + -97, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (BladeCycloneUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bladecyclone.png"), this.leftPos + 59, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (BladeCycloneUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bladecyclone.png"), this.leftPos + 59, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (BladeCycloneUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bladecyclone.png"), this.leftPos + -97, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (ArmorOffUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_armoroff.png"), this.leftPos + -58, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (ArmorOffUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_armoroff.png"), this.leftPos + 20, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (ArmorOffUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_armoroff.png"), this.leftPos + -19, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (ArmorOffUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_armoroff.png"), this.leftPos + -97, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (ArmorOffUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_armoroff.png"), this.leftPos + 59, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (ArmorOffUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_armoroff.png"), this.leftPos + 59, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (ArmorOffUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_armoroff.png"), this.leftPos + -97, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (QuicksandUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_quicksand.png"), this.leftPos + -58, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (QuicksandUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_quicksand.png"), this.leftPos + 20, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (QuicksandUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_quicksand.png"), this.leftPos + -19, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (QuicksandUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_quicksand.png"), this.leftPos + -97, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (QuicksandUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_quicksand.png"), this.leftPos + 59, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (QuicksandUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_quicksand.png"), this.leftPos + 59, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (QuicksandUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_quicksand.png"), this.leftPos + -97, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (SandDomeUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_sanddome.png"), this.leftPos + -58, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (SandDomeUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_sanddome.png"), this.leftPos + 20, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (SandDomeUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_sanddome.png"), this.leftPos + -19, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (SandDomeUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_sanddome.png"), this.leftPos + -97, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (SandDomeUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_sanddome.png"), this.leftPos + 59, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (SandDomeUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_sanddome.png"), this.leftPos + 59, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (SandDomeUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_sanddome.png"), this.leftPos + -97, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (SandGliderUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_sandglider.png"), this.leftPos + -58, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (SandGliderUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_sandglider.png"), this.leftPos + 20, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (SandGliderUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_sandglider.png"), this.leftPos + -19, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (SandGliderUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_sandglider.png"), this.leftPos + -97, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (SandGliderUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_sandglider.png"), this.leftPos + 59, this.topPos + 20, 0, 0, 36, 36, 36, 36);
		}
		if (SandGliderUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_sandglider.png"), this.leftPos + 59, this.topPos + -58, 0, 0, 36, 36, 36, 36);
		}
		if (SandGliderUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_sandglider.png"), this.leftPos + -97, this.topPos + -58, 0, 0, 36, 36, 36, 36);
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
	public void init() {
		super.init();
		imagebutton_skillgui_button = new ImageButton(this.leftPos + -12, this.topPos + -12, 22, 22, 0, 0, 22, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_skillgui_button.png"), 22, 44, e -> {
			if (true) {
				JojowosMod.PACKET_HANDLER.sendToServer(new StandSkillTreeEvenButtonMessage(0, x, y, z));
				StandSkillTreeEvenButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_skillgui_button", imagebutton_skillgui_button);
		this.addRenderableWidget(imagebutton_skillgui_button);
		imagebutton_skilltree_lock = new ImageButton(this.leftPos + -51, this.topPos + -14, 22, 26, 0, 0, 26, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_skilltree_lock.png"), 22, 52, e -> {
			if (ReturnAbilityLocked2Procedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new StandSkillTreeEvenButtonMessage(1, x, y, z));
				StandSkillTreeEvenButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnAbilityLocked2Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_lock", imagebutton_skilltree_lock);
		this.addRenderableWidget(imagebutton_skilltree_lock);
		imagebutton_skilltree_lock1 = new ImageButton(this.leftPos + 27, this.topPos + -14, 22, 26, 0, 0, 26, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_skilltree_lock1.png"), 22, 52, e -> {
			if (ReturnAbilityLocked3Procedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new StandSkillTreeEvenButtonMessage(2, x, y, z));
				StandSkillTreeEvenButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnAbilityLocked3Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_lock1", imagebutton_skilltree_lock1);
		this.addRenderableWidget(imagebutton_skilltree_lock1);
		imagebutton_skilltree_lock2 = new ImageButton(this.leftPos + -12, this.topPos + 25, 22, 26, 0, 0, 26, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_skilltree_lock2.png"), 22, 52, e -> {
			if (ReturnAbilityLocked4Procedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new StandSkillTreeEvenButtonMessage(3, x, y, z));
				StandSkillTreeEvenButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnAbilityLocked4Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_lock2", imagebutton_skilltree_lock2);
		this.addRenderableWidget(imagebutton_skilltree_lock2);
		imagebutton_skilltree_lock3 = new ImageButton(this.leftPos + -90, this.topPos + 25, 22, 26, 0, 0, 26, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_skilltree_lock3.png"), 22, 52, e -> {
			if (ReturnAbilityLocked5Procedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new StandSkillTreeEvenButtonMessage(4, x, y, z));
				StandSkillTreeEvenButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnAbilityLocked5Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_lock3", imagebutton_skilltree_lock3);
		this.addRenderableWidget(imagebutton_skilltree_lock3);
		imagebutton_skilltree_lock4 = new ImageButton(this.leftPos + 66, this.topPos + 25, 22, 26, 0, 0, 26, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_skilltree_lock4.png"), 22, 52, e -> {
			if (ReturnAbilityLocked6Procedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new StandSkillTreeEvenButtonMessage(5, x, y, z));
				StandSkillTreeEvenButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnAbilityLocked6Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_lock4", imagebutton_skilltree_lock4);
		this.addRenderableWidget(imagebutton_skilltree_lock4);
		imagebutton_skilltree_lock5 = new ImageButton(this.leftPos + 66, this.topPos + -53, 22, 26, 0, 0, 26, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_skilltree_lock5.png"), 22, 52, e -> {
			if (ReturnAbilityLocked7Procedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new StandSkillTreeEvenButtonMessage(6, x, y, z));
				StandSkillTreeEvenButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnAbilityLocked7Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_lock5", imagebutton_skilltree_lock5);
		this.addRenderableWidget(imagebutton_skilltree_lock5);
		imagebutton_skilltree_lock6 = new ImageButton(this.leftPos + -90, this.topPos + -53, 22, 26, 0, 0, 26, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_skilltree_lock6.png"), 22, 52, e -> {
			if (ReturnAbilityLocked8Procedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new StandSkillTreeEvenButtonMessage(7, x, y, z));
				StandSkillTreeEvenButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnAbilityLocked8Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_lock6", imagebutton_skilltree_lock6);
		this.addRenderableWidget(imagebutton_skilltree_lock6);
	}
}
