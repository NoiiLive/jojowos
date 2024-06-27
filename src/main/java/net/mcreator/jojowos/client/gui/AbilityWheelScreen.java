package net.mcreator.jojowos.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.jojowos.world.inventory.AbilityWheelMenu;
import net.mcreator.jojowos.procedures.ZoomUnlocked9Procedure;
import net.mcreator.jojowos.procedures.ZoomUnlocked8Procedure;
import net.mcreator.jojowos.procedures.ZoomUnlocked7Procedure;
import net.mcreator.jojowos.procedures.ZoomUnlocked6Procedure;
import net.mcreator.jojowos.procedures.ZoomUnlocked5Procedure;
import net.mcreator.jojowos.procedures.ZoomUnlocked4Procedure;
import net.mcreator.jojowos.procedures.ZoomUnlocked3Procedure;
import net.mcreator.jojowos.procedures.ZoomUnlocked2Procedure;
import net.mcreator.jojowos.procedures.ZoomUnlocked1Procedure;
import net.mcreator.jojowos.procedures.WheelSwitchDisplayProcedure;
import net.mcreator.jojowos.procedures.TimestopCounterUnlocked9Procedure;
import net.mcreator.jojowos.procedures.TimestopCounterUnlocked8Procedure;
import net.mcreator.jojowos.procedures.TimestopCounterUnlocked7Procedure;
import net.mcreator.jojowos.procedures.TimestopCounterUnlocked6Procedure;
import net.mcreator.jojowos.procedures.TimestopCounterUnlocked5Procedure;
import net.mcreator.jojowos.procedures.TimestopCounterUnlocked4Procedure;
import net.mcreator.jojowos.procedures.TimestopCounterUnlocked3Procedure;
import net.mcreator.jojowos.procedures.TimestopCounterUnlocked2Procedure;
import net.mcreator.jojowos.procedures.TimestopCounterUnlocked1Procedure;
import net.mcreator.jojowos.procedures.TimeStopUnlocked9Procedure;
import net.mcreator.jojowos.procedures.TimeStopUnlocked8Procedure;
import net.mcreator.jojowos.procedures.TimeStopUnlocked7Procedure;
import net.mcreator.jojowos.procedures.TimeStopUnlocked6Procedure;
import net.mcreator.jojowos.procedures.TimeStopUnlocked5Procedure;
import net.mcreator.jojowos.procedures.TimeStopUnlocked4Procedure;
import net.mcreator.jojowos.procedures.TimeStopUnlocked3Procedure;
import net.mcreator.jojowos.procedures.TimeStopUnlocked2Procedure;
import net.mcreator.jojowos.procedures.TimeStopUnlocked1Procedure;
import net.mcreator.jojowos.procedures.TimeSkipUnlocked9Procedure;
import net.mcreator.jojowos.procedures.TimeSkipUnlocked8Procedure;
import net.mcreator.jojowos.procedures.TimeSkipUnlocked7Procedure;
import net.mcreator.jojowos.procedures.TimeSkipUnlocked6Procedure;
import net.mcreator.jojowos.procedures.TimeSkipUnlocked5Procedure;
import net.mcreator.jojowos.procedures.TimeSkipUnlocked4Procedure;
import net.mcreator.jojowos.procedures.TimeSkipUnlocked3Procedure;
import net.mcreator.jojowos.procedures.TimeSkipUnlocked2Procedure;
import net.mcreator.jojowos.procedures.TimeSkipUnlocked1Procedure;
import net.mcreator.jojowos.procedures.TangleUnlocked9Procedure;
import net.mcreator.jojowos.procedures.TangleUnlocked8Procedure;
import net.mcreator.jojowos.procedures.TangleUnlocked7Procedure;
import net.mcreator.jojowos.procedures.TangleUnlocked6Procedure;
import net.mcreator.jojowos.procedures.TangleUnlocked5Procedure;
import net.mcreator.jojowos.procedures.TangleUnlocked4Procedure;
import net.mcreator.jojowos.procedures.TangleUnlocked3Procedure;
import net.mcreator.jojowos.procedures.TangleUnlocked2Procedure;
import net.mcreator.jojowos.procedures.TangleUnlocked1Procedure;
import net.mcreator.jojowos.procedures.SwordLaunchUnlocked9Procedure;
import net.mcreator.jojowos.procedures.SwordLaunchUnlocked8Procedure;
import net.mcreator.jojowos.procedures.SwordLaunchUnlocked7Procedure;
import net.mcreator.jojowos.procedures.SwordLaunchUnlocked6Procedure;
import net.mcreator.jojowos.procedures.SwordLaunchUnlocked5Procedure;
import net.mcreator.jojowos.procedures.SwordLaunchUnlocked4Procedure;
import net.mcreator.jojowos.procedures.SwordLaunchUnlocked3Procedure;
import net.mcreator.jojowos.procedures.SwordLaunchUnlocked2Procedure;
import net.mcreator.jojowos.procedures.SwordLaunchUnlocked1Procedure;
import net.mcreator.jojowos.procedures.SwordBarrageUnlocked9Procedure;
import net.mcreator.jojowos.procedures.SwordBarrageUnlocked8Procedure;
import net.mcreator.jojowos.procedures.SwordBarrageUnlocked7Procedure;
import net.mcreator.jojowos.procedures.SwordBarrageUnlocked6Procedure;
import net.mcreator.jojowos.procedures.SwordBarrageUnlocked5Procedure;
import net.mcreator.jojowos.procedures.SwordBarrageUnlocked4Procedure;
import net.mcreator.jojowos.procedures.SwordBarrageUnlocked3Procedure;
import net.mcreator.jojowos.procedures.SwordBarrageUnlocked2Procedure;
import net.mcreator.jojowos.procedures.SwordBarrageUnlocked1Procedure;
import net.mcreator.jojowos.procedures.StarFingerUnlocked9Procedure;
import net.mcreator.jojowos.procedures.StarFingerUnlocked8Procedure;
import net.mcreator.jojowos.procedures.StarFingerUnlocked7Procedure;
import net.mcreator.jojowos.procedures.StarFingerUnlocked6Procedure;
import net.mcreator.jojowos.procedures.StarFingerUnlocked5Procedure;
import net.mcreator.jojowos.procedures.StarFingerUnlocked4Procedure;
import net.mcreator.jojowos.procedures.StarFingerUnlocked3Procedure;
import net.mcreator.jojowos.procedures.StarFingerUnlocked2Procedure;
import net.mcreator.jojowos.procedures.StarFingerUnlocked1Procedure;
import net.mcreator.jojowos.procedures.ShortTimestopUnlocked9Procedure;
import net.mcreator.jojowos.procedures.ShortTimestopUnlocked8Procedure;
import net.mcreator.jojowos.procedures.ShortTimestopUnlocked7Procedure;
import net.mcreator.jojowos.procedures.ShortTimestopUnlocked6Procedure;
import net.mcreator.jojowos.procedures.ShortTimestopUnlocked5Procedure;
import net.mcreator.jojowos.procedures.ShortTimestopUnlocked4Procedure;
import net.mcreator.jojowos.procedures.ShortTimestopUnlocked3Procedure;
import net.mcreator.jojowos.procedures.ShortTimestopUnlocked2Procedure;
import net.mcreator.jojowos.procedures.ShortTimestopUnlocked1Procedure;
import net.mcreator.jojowos.procedures.SandGliderUnlocked9Procedure;
import net.mcreator.jojowos.procedures.SandGliderUnlocked8Procedure;
import net.mcreator.jojowos.procedures.SandGliderUnlocked7Procedure;
import net.mcreator.jojowos.procedures.SandGliderUnlocked6Procedure;
import net.mcreator.jojowos.procedures.SandGliderUnlocked5Procedure;
import net.mcreator.jojowos.procedures.SandGliderUnlocked4Procedure;
import net.mcreator.jojowos.procedures.SandGliderUnlocked3Procedure;
import net.mcreator.jojowos.procedures.SandGliderUnlocked2Procedure;
import net.mcreator.jojowos.procedures.SandGliderUnlocked1Procedure;
import net.mcreator.jojowos.procedures.SandDomeUnlocked9Procedure;
import net.mcreator.jojowos.procedures.SandDomeUnlocked8Procedure;
import net.mcreator.jojowos.procedures.SandDomeUnlocked7Procedure;
import net.mcreator.jojowos.procedures.SandDomeUnlocked6Procedure;
import net.mcreator.jojowos.procedures.SandDomeUnlocked5Procedure;
import net.mcreator.jojowos.procedures.SandDomeUnlocked4Procedure;
import net.mcreator.jojowos.procedures.SandDomeUnlocked3Procedure;
import net.mcreator.jojowos.procedures.SandDomeUnlocked2Procedure;
import net.mcreator.jojowos.procedures.SandDomeUnlocked1Procedure;
import net.mcreator.jojowos.procedures.RoadRollerUnlocked9Procedure;
import net.mcreator.jojowos.procedures.RoadRollerUnlocked8Procedure;
import net.mcreator.jojowos.procedures.RoadRollerUnlocked7Procedure;
import net.mcreator.jojowos.procedures.RoadRollerUnlocked6Procedure;
import net.mcreator.jojowos.procedures.RoadRollerUnlocked5Procedure;
import net.mcreator.jojowos.procedures.RoadRollerUnlocked4Procedure;
import net.mcreator.jojowos.procedures.RoadRollerUnlocked3Procedure;
import net.mcreator.jojowos.procedures.RoadRollerUnlocked2Procedure;
import net.mcreator.jojowos.procedures.RoadRollerUnlocked1Procedure;
import net.mcreator.jojowos.procedures.ReturnMove9Procedure;
import net.mcreator.jojowos.procedures.ReturnMove8Procedure;
import net.mcreator.jojowos.procedures.ReturnMove7Procedure;
import net.mcreator.jojowos.procedures.ReturnMove6Procedure;
import net.mcreator.jojowos.procedures.ReturnMove5Procedure;
import net.mcreator.jojowos.procedures.ReturnMove4Procedure;
import net.mcreator.jojowos.procedures.ReturnMove3Procedure;
import net.mcreator.jojowos.procedures.ReturnMove2Procedure;
import net.mcreator.jojowos.procedures.ReturnMove1Procedure;
import net.mcreator.jojowos.procedures.ReturnAbilityUnlocked9Procedure;
import net.mcreator.jojowos.procedures.ReturnAbilityUnlocked8Procedure;
import net.mcreator.jojowos.procedures.ReturnAbilityUnlocked7Procedure;
import net.mcreator.jojowos.procedures.ReturnAbilityUnlocked6Procedure;
import net.mcreator.jojowos.procedures.ReturnAbilityUnlocked5Procedure;
import net.mcreator.jojowos.procedures.ReturnAbilityUnlocked4Procedure;
import net.mcreator.jojowos.procedures.ReturnAbilityUnlocked3Procedure;
import net.mcreator.jojowos.procedures.ReturnAbilityUnlocked2Procedure;
import net.mcreator.jojowos.procedures.ReturnAbilityUnlocked1Procedure;
import net.mcreator.jojowos.procedures.RedBindUnlocked9Procedure;
import net.mcreator.jojowos.procedures.RedBindUnlocked8Procedure;
import net.mcreator.jojowos.procedures.RedBindUnlocked7Procedure;
import net.mcreator.jojowos.procedures.RedBindUnlocked6Procedure;
import net.mcreator.jojowos.procedures.RedBindUnlocked5Procedure;
import net.mcreator.jojowos.procedures.RedBindUnlocked4Procedure;
import net.mcreator.jojowos.procedures.RedBindUnlocked3Procedure;
import net.mcreator.jojowos.procedures.RedBindUnlocked2Procedure;
import net.mcreator.jojowos.procedures.RedBindUnlocked1Procedure;
import net.mcreator.jojowos.procedures.QuicksandUnlocked9Procedure;
import net.mcreator.jojowos.procedures.QuicksandUnlocked8Procedure;
import net.mcreator.jojowos.procedures.QuicksandUnlocked7Procedure;
import net.mcreator.jojowos.procedures.QuicksandUnlocked6Procedure;
import net.mcreator.jojowos.procedures.QuicksandUnlocked5Procedure;
import net.mcreator.jojowos.procedures.QuicksandUnlocked4Procedure;
import net.mcreator.jojowos.procedures.QuicksandUnlocked3Procedure;
import net.mcreator.jojowos.procedures.QuicksandUnlocked2Procedure;
import net.mcreator.jojowos.procedures.QuicksandUnlocked1Procedure;
import net.mcreator.jojowos.procedures.LifeDetectorUnlocked9Procedure;
import net.mcreator.jojowos.procedures.LifeDetectorUnlocked8Procedure;
import net.mcreator.jojowos.procedures.LifeDetectorUnlocked7Procedure;
import net.mcreator.jojowos.procedures.LifeDetectorUnlocked6Procedure;
import net.mcreator.jojowos.procedures.LifeDetectorUnlocked5Procedure;
import net.mcreator.jojowos.procedures.LifeDetectorUnlocked4Procedure;
import net.mcreator.jojowos.procedures.LifeDetectorUnlocked3Procedure;
import net.mcreator.jojowos.procedures.LifeDetectorUnlocked2Procedure;
import net.mcreator.jojowos.procedures.LifeDetectorUnlocked1Procedure;
import net.mcreator.jojowos.procedures.KnifeThrowUnlocked9Procedure;
import net.mcreator.jojowos.procedures.KnifeThrowUnlocked8Procedure;
import net.mcreator.jojowos.procedures.KnifeThrowUnlocked7Procedure;
import net.mcreator.jojowos.procedures.KnifeThrowUnlocked6Procedure;
import net.mcreator.jojowos.procedures.KnifeThrowUnlocked5Procedure;
import net.mcreator.jojowos.procedures.KnifeThrowUnlocked4Procedure;
import net.mcreator.jojowos.procedures.KnifeThrowUnlocked3Procedure;
import net.mcreator.jojowos.procedures.KnifeThrowUnlocked2Procedure;
import net.mcreator.jojowos.procedures.KnifeThrowUnlocked1Procedure;
import net.mcreator.jojowos.procedures.KickBarrageUnlocked9Procedure;
import net.mcreator.jojowos.procedures.KickBarrageUnlocked8Procedure;
import net.mcreator.jojowos.procedures.KickBarrageUnlocked7Procedure;
import net.mcreator.jojowos.procedures.KickBarrageUnlocked6Procedure;
import net.mcreator.jojowos.procedures.KickBarrageUnlocked5Procedure;
import net.mcreator.jojowos.procedures.KickBarrageUnlocked4Procedure;
import net.mcreator.jojowos.procedures.KickBarrageUnlocked3Procedure;
import net.mcreator.jojowos.procedures.KickBarrageUnlocked2Procedure;
import net.mcreator.jojowos.procedures.KickBarrageUnlocked1Procedure;
import net.mcreator.jojowos.procedures.InhaleUnlocked9Procedure;
import net.mcreator.jojowos.procedures.InhaleUnlocked8Procedure;
import net.mcreator.jojowos.procedures.InhaleUnlocked7Procedure;
import net.mcreator.jojowos.procedures.InhaleUnlocked6Procedure;
import net.mcreator.jojowos.procedures.InhaleUnlocked5Procedure;
import net.mcreator.jojowos.procedures.InhaleUnlocked4Procedure;
import net.mcreator.jojowos.procedures.InhaleUnlocked3Procedure;
import net.mcreator.jojowos.procedures.InhaleUnlocked2Procedure;
import net.mcreator.jojowos.procedures.InhaleUnlocked1Procedure;
import net.mcreator.jojowos.procedures.GrappleUnlocked9Procedure;
import net.mcreator.jojowos.procedures.GrappleUnlocked8Procedure;
import net.mcreator.jojowos.procedures.GrappleUnlocked7Procedure;
import net.mcreator.jojowos.procedures.GrappleUnlocked6Procedure;
import net.mcreator.jojowos.procedures.GrappleUnlocked5Procedure;
import net.mcreator.jojowos.procedures.GrappleUnlocked4Procedure;
import net.mcreator.jojowos.procedures.GrappleUnlocked3Procedure;
import net.mcreator.jojowos.procedures.GrappleUnlocked2Procedure;
import net.mcreator.jojowos.procedures.GrappleUnlocked1Procedure;
import net.mcreator.jojowos.procedures.FistBarrageUnlocked9Procedure;
import net.mcreator.jojowos.procedures.FistBarrageUnlocked8Procedure;
import net.mcreator.jojowos.procedures.FistBarrageUnlocked7Procedure;
import net.mcreator.jojowos.procedures.FistBarrageUnlocked6Procedure;
import net.mcreator.jojowos.procedures.FistBarrageUnlocked5Procedure;
import net.mcreator.jojowos.procedures.FistBarrageUnlocked4Procedure;
import net.mcreator.jojowos.procedures.FistBarrageUnlocked3Procedure;
import net.mcreator.jojowos.procedures.FistBarrageUnlocked2Procedure;
import net.mcreator.jojowos.procedures.FistBarrageUnlocked1Procedure;
import net.mcreator.jojowos.procedures.EmeraldSplashUnlocked9Procedure;
import net.mcreator.jojowos.procedures.EmeraldSplashUnlocked8Procedure;
import net.mcreator.jojowos.procedures.EmeraldSplashUnlocked7Procedure;
import net.mcreator.jojowos.procedures.EmeraldSplashUnlocked6Procedure;
import net.mcreator.jojowos.procedures.EmeraldSplashUnlocked5Procedure;
import net.mcreator.jojowos.procedures.EmeraldSplashUnlocked4Procedure;
import net.mcreator.jojowos.procedures.EmeraldSplashUnlocked3Procedure;
import net.mcreator.jojowos.procedures.EmeraldSplashUnlocked2Procedure;
import net.mcreator.jojowos.procedures.EmeraldSplashUnlocked1Procedure;
import net.mcreator.jojowos.procedures.EmeraldBarrierUnlocked9Procedure;
import net.mcreator.jojowos.procedures.EmeraldBarrierUnlocked8Procedure;
import net.mcreator.jojowos.procedures.EmeraldBarrierUnlocked7Procedure;
import net.mcreator.jojowos.procedures.EmeraldBarrierUnlocked6Procedure;
import net.mcreator.jojowos.procedures.EmeraldBarrierUnlocked5Procedure;
import net.mcreator.jojowos.procedures.EmeraldBarrierUnlocked4Procedure;
import net.mcreator.jojowos.procedures.EmeraldBarrierUnlocked3Procedure;
import net.mcreator.jojowos.procedures.EmeraldBarrierUnlocked2Procedure;
import net.mcreator.jojowos.procedures.EmeraldBarrierUnlocked1Procedure;
import net.mcreator.jojowos.procedures.CrossfireSpecialUnlocked9Procedure;
import net.mcreator.jojowos.procedures.CrossfireSpecialUnlocked8Procedure;
import net.mcreator.jojowos.procedures.CrossfireSpecialUnlocked7Procedure;
import net.mcreator.jojowos.procedures.CrossfireSpecialUnlocked6Procedure;
import net.mcreator.jojowos.procedures.CrossfireSpecialUnlocked5Procedure;
import net.mcreator.jojowos.procedures.CrossfireSpecialUnlocked4Procedure;
import net.mcreator.jojowos.procedures.CrossfireSpecialUnlocked3Procedure;
import net.mcreator.jojowos.procedures.CrossfireSpecialUnlocked2Procedure;
import net.mcreator.jojowos.procedures.CrossfireSpecialUnlocked1Procedure;
import net.mcreator.jojowos.procedures.CrossfireHurricaneUnlocked9Procedure;
import net.mcreator.jojowos.procedures.CrossfireHurricaneUnlocked8Procedure;
import net.mcreator.jojowos.procedures.CrossfireHurricaneUnlocked7Procedure;
import net.mcreator.jojowos.procedures.CrossfireHurricaneUnlocked6Procedure;
import net.mcreator.jojowos.procedures.CrossfireHurricaneUnlocked5Procedure;
import net.mcreator.jojowos.procedures.CrossfireHurricaneUnlocked4Procedure;
import net.mcreator.jojowos.procedures.CrossfireHurricaneUnlocked3Procedure;
import net.mcreator.jojowos.procedures.CrossfireHurricaneUnlocked2Procedure;
import net.mcreator.jojowos.procedures.CrossfireHurricaneUnlocked1Procedure;
import net.mcreator.jojowos.procedures.BodyControlUnlocked9Procedure;
import net.mcreator.jojowos.procedures.BodyControlUnlocked8Procedure;
import net.mcreator.jojowos.procedures.BodyControlUnlocked7Procedure;
import net.mcreator.jojowos.procedures.BodyControlUnlocked6Procedure;
import net.mcreator.jojowos.procedures.BodyControlUnlocked5Procedure;
import net.mcreator.jojowos.procedures.BodyControlUnlocked4Procedure;
import net.mcreator.jojowos.procedures.BodyControlUnlocked3Procedure;
import net.mcreator.jojowos.procedures.BodyControlUnlocked2Procedure;
import net.mcreator.jojowos.procedures.BodyControlUnlocked1Procedure;
import net.mcreator.jojowos.procedures.BladeCycloneUnlocked9Procedure;
import net.mcreator.jojowos.procedures.BladeCycloneUnlocked8Procedure;
import net.mcreator.jojowos.procedures.BladeCycloneUnlocked7Procedure;
import net.mcreator.jojowos.procedures.BladeCycloneUnlocked6Procedure;
import net.mcreator.jojowos.procedures.BladeCycloneUnlocked5Procedure;
import net.mcreator.jojowos.procedures.BladeCycloneUnlocked4Procedure;
import net.mcreator.jojowos.procedures.BladeCycloneUnlocked3Procedure;
import net.mcreator.jojowos.procedures.BladeCycloneUnlocked2Procedure;
import net.mcreator.jojowos.procedures.BladeCycloneUnlocked1Procedure;
import net.mcreator.jojowos.procedures.BearingShotUnlocked9Procedure;
import net.mcreator.jojowos.procedures.BearingShotUnlocked8Procedure;
import net.mcreator.jojowos.procedures.BearingShotUnlocked7Procedure;
import net.mcreator.jojowos.procedures.BearingShotUnlocked6Procedure;
import net.mcreator.jojowos.procedures.BearingShotUnlocked5Procedure;
import net.mcreator.jojowos.procedures.BearingShotUnlocked4Procedure;
import net.mcreator.jojowos.procedures.BearingShotUnlocked3Procedure;
import net.mcreator.jojowos.procedures.BearingShotUnlocked2Procedure;
import net.mcreator.jojowos.procedures.BearingShotUnlocked1Procedure;
import net.mcreator.jojowos.procedures.ArmorOffUnlocked9Procedure;
import net.mcreator.jojowos.procedures.ArmorOffUnlocked8Procedure;
import net.mcreator.jojowos.procedures.ArmorOffUnlocked7Procedure;
import net.mcreator.jojowos.procedures.ArmorOffUnlocked6Procedure;
import net.mcreator.jojowos.procedures.ArmorOffUnlocked5Procedure;
import net.mcreator.jojowos.procedures.ArmorOffUnlocked4Procedure;
import net.mcreator.jojowos.procedures.ArmorOffUnlocked3Procedure;
import net.mcreator.jojowos.procedures.ArmorOffUnlocked2Procedure;
import net.mcreator.jojowos.procedures.ArmorOffUnlocked1Procedure;
import net.mcreator.jojowos.network.AbilityWheelButtonMessage;
import net.mcreator.jojowos.JojowosMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class AbilityWheelScreen extends AbstractContainerScreen<AbilityWheelMenu> {
	private final static HashMap<String, Object> guistate = AbilityWheelMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_guiarrow_up;
	ImageButton imagebutton_ability_select_blank;
	ImageButton imagebutton_ability_select;
	ImageButton imagebutton_ability_select1;
	ImageButton imagebutton_ability_select2;
	ImageButton imagebutton_ability_select3;
	ImageButton imagebutton_ability_select4;
	ImageButton imagebutton_ability_select5;
	ImageButton imagebutton_ability_select6;
	ImageButton imagebutton_ability_select7;

	public AbilityWheelScreen(AbilityWheelMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("jojowos:textures/screens/ability_wheel.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + -51 && mouseX < leftPos + -19 && mouseY > topPos + -49 && mouseY < topPos + -17)
			guiGraphics.renderTooltip(font, Component.literal(ReturnMove1Procedure.execute(entity)), mouseX, mouseY);
		if (mouseX > leftPos + -17 && mouseX < leftPos + 15 && mouseY > topPos + -49 && mouseY < topPos + -17)
			guiGraphics.renderTooltip(font, Component.literal(ReturnMove2Procedure.execute(entity)), mouseX, mouseY);
		if (mouseX > leftPos + 17 && mouseX < leftPos + 49 && mouseY > topPos + -49 && mouseY < topPos + -17)
			guiGraphics.renderTooltip(font, Component.literal(ReturnMove3Procedure.execute(entity)), mouseX, mouseY);
		if (mouseX > leftPos + -51 && mouseX < leftPos + -19 && mouseY > topPos + -15 && mouseY < topPos + 17)
			guiGraphics.renderTooltip(font, Component.literal(ReturnMove4Procedure.execute(entity)), mouseX, mouseY);
		if (mouseX > leftPos + -17 && mouseX < leftPos + 15 && mouseY > topPos + -15 && mouseY < topPos + 17)
			guiGraphics.renderTooltip(font, Component.literal(ReturnMove5Procedure.execute(entity)), mouseX, mouseY);
		if (mouseX > leftPos + 17 && mouseX < leftPos + 49 && mouseY > topPos + -15 && mouseY < topPos + 17)
			guiGraphics.renderTooltip(font, Component.literal(ReturnMove6Procedure.execute(entity)), mouseX, mouseY);
		if (mouseX > leftPos + -51 && mouseX < leftPos + -19 && mouseY > topPos + 19 && mouseY < topPos + 51)
			guiGraphics.renderTooltip(font, Component.literal(ReturnMove7Procedure.execute(entity)), mouseX, mouseY);
		if (mouseX > leftPos + -17 && mouseX < leftPos + 15 && mouseY > topPos + 19 && mouseY < topPos + 51)
			guiGraphics.renderTooltip(font, Component.literal(ReturnMove8Procedure.execute(entity)), mouseX, mouseY);
		if (mouseX > leftPos + 17 && mouseX < leftPos + 49 && mouseY > topPos + 19 && mouseY < topPos + 51)
			guiGraphics.renderTooltip(font, Component.literal(ReturnMove9Procedure.execute(entity)), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/ability_grid.png"), this.leftPos + -53, this.topPos + -51, 0, 0, 104, 104, 104, 104);

		if (FistBarrageUnlocked1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_fistbarrage.png"), this.leftPos + -53, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (FistBarrageUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_fistbarrage.png"), this.leftPos + -19, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (FistBarrageUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_fistbarrage.png"), this.leftPos + 15, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (FistBarrageUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_fistbarrage.png"), this.leftPos + -53, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (FistBarrageUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_fistbarrage.png"), this.leftPos + -19, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (FistBarrageUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_fistbarrage.png"), this.leftPos + 15, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (FistBarrageUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_fistbarrage.png"), this.leftPos + -53, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (FistBarrageUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_fistbarrage.png"), this.leftPos + -19, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (FistBarrageUnlocked9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_fistbarrage.png"), this.leftPos + 15, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (KickBarrageUnlocked1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_kickbarrage.png"), this.leftPos + -53, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (KickBarrageUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_kickbarrage.png"), this.leftPos + -19, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (KickBarrageUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_kickbarrage.png"), this.leftPos + 15, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (KickBarrageUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_kickbarrage.png"), this.leftPos + -53, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (KickBarrageUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_kickbarrage.png"), this.leftPos + -19, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (KickBarrageUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_kickbarrage.png"), this.leftPos + 15, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (KickBarrageUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_kickbarrage.png"), this.leftPos + -53, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (KickBarrageUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_kickbarrage.png"), this.leftPos + -19, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (KickBarrageUnlocked9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_kickbarrage.png"), this.leftPos + 15, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (BearingShotUnlocked1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bearingshot.png"), this.leftPos + -53, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (BearingShotUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bearingshot.png"), this.leftPos + -19, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (BearingShotUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bearingshot.png"), this.leftPos + 15, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (BearingShotUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bearingshot.png"), this.leftPos + -53, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (BearingShotUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bearingshot.png"), this.leftPos + -19, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (BearingShotUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bearingshot.png"), this.leftPos + 15, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (BearingShotUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bearingshot.png"), this.leftPos + -53, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (BearingShotUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bearingshot.png"), this.leftPos + -19, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (BearingShotUnlocked9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bearingshot.png"), this.leftPos + 15, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (InhaleUnlocked1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_inhale.png"), this.leftPos + -53, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (InhaleUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_inhale.png"), this.leftPos + -19, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (InhaleUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_inhale.png"), this.leftPos + 15, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (InhaleUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_inhale.png"), this.leftPos + -53, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (InhaleUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_inhale.png"), this.leftPos + -19, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (InhaleUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_inhale.png"), this.leftPos + 15, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (InhaleUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_inhale.png"), this.leftPos + -53, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (InhaleUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_inhale.png"), this.leftPos + -19, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (InhaleUnlocked9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_inhale.png"), this.leftPos + 15, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (StarFingerUnlocked1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_starfinger.png"), this.leftPos + -53, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (StarFingerUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_starfinger.png"), this.leftPos + -19, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (StarFingerUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_starfinger.png"), this.leftPos + 15, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (StarFingerUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_starfinger.png"), this.leftPos + -53, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (StarFingerUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_starfinger.png"), this.leftPos + -19, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (StarFingerUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_starfinger.png"), this.leftPos + 15, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (StarFingerUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_starfinger.png"), this.leftPos + -53, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (StarFingerUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_starfinger.png"), this.leftPos + -19, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (StarFingerUnlocked9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_starfinger.png"), this.leftPos + 15, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (TimeSkipUnlocked1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timeskip.png"), this.leftPos + -53, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (TimeSkipUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timeskip.png"), this.leftPos + -19, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (TimeSkipUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timeskip.png"), this.leftPos + 15, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (TimeSkipUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timeskip.png"), this.leftPos + -53, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (TimeSkipUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timeskip.png"), this.leftPos + -19, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (TimeSkipUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timeskip.png"), this.leftPos + 15, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (TimeSkipUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timeskip.png"), this.leftPos + -53, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (TimeSkipUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timeskip.png"), this.leftPos + -19, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (TimeSkipUnlocked9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timeskip.png"), this.leftPos + 15, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (ShortTimestopUnlocked1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_shorttimestop.png"), this.leftPos + -53, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (ShortTimestopUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_shorttimestop.png"), this.leftPos + -19, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (ShortTimestopUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_shorttimestop.png"), this.leftPos + 15, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (ShortTimestopUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_shorttimestop.png"), this.leftPos + -53, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (ShortTimestopUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_shorttimestop.png"), this.leftPos + -19, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (ShortTimestopUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_shorttimestop.png"), this.leftPos + 15, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (ShortTimestopUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_shorttimestop.png"), this.leftPos + -53, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (ShortTimestopUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_shorttimestop.png"), this.leftPos + -19, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (ShortTimestopUnlocked9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_shorttimestop.png"), this.leftPos + 15, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (ZoomUnlocked1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_zoom.png"), this.leftPos + -51, this.topPos + -49, 0, 0, 32, 32, 32, 32);
		}
		if (ZoomUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_zoom.png"), this.leftPos + -17, this.topPos + -49, 0, 0, 32, 32, 32, 32);
		}
		if (ZoomUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_zoom.png"), this.leftPos + 17, this.topPos + -49, 0, 0, 32, 32, 32, 32);
		}
		if (ZoomUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_zoom.png"), this.leftPos + -51, this.topPos + -15, 0, 0, 32, 32, 32, 32);
		}
		if (ZoomUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_zoom.png"), this.leftPos + -17, this.topPos + -15, 0, 0, 32, 32, 32, 32);
		}
		if (ZoomUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_zoom.png"), this.leftPos + 17, this.topPos + -15, 0, 0, 32, 32, 32, 32);
		}
		if (ZoomUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_zoom.png"), this.leftPos + -51, this.topPos + 19, 0, 0, 32, 32, 32, 32);
		}
		if (ZoomUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_zoom.png"), this.leftPos + -17, this.topPos + 19, 0, 0, 32, 32, 32, 32);
		}
		if (ZoomUnlocked9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_zoom.png"), this.leftPos + 17, this.topPos + 19, 0, 0, 32, 32, 32, 32);
		}
		if (TimestopCounterUnlocked1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timestopcounter.png"), this.leftPos + -53, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (TimestopCounterUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timestopcounter.png"), this.leftPos + -19, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (TimestopCounterUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timestopcounter.png"), this.leftPos + 15, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (TimestopCounterUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timestopcounter.png"), this.leftPos + -53, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (TimestopCounterUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timestopcounter.png"), this.leftPos + -19, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (TimestopCounterUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timestopcounter.png"), this.leftPos + 15, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (TimestopCounterUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timestopcounter.png"), this.leftPos + -53, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (TimestopCounterUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timestopcounter.png"), this.leftPos + -19, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (TimestopCounterUnlocked9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timestopcounter.png"), this.leftPos + 15, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (TimeStopUnlocked1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timestop.png"), this.leftPos + -53, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (TimeStopUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timestop.png"), this.leftPos + -19, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (TimeStopUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timestop.png"), this.leftPos + 15, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (TimeStopUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timestop.png"), this.leftPos + -53, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (TimeStopUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timestop.png"), this.leftPos + -19, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (TimeStopUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timestop.png"), this.leftPos + 15, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (TimeStopUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timestop.png"), this.leftPos + -53, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (TimeStopUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timestop.png"), this.leftPos + -19, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (TimeStopUnlocked9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_timestop.png"), this.leftPos + 15, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (KnifeThrowUnlocked1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_knifethrow.png"), this.leftPos + -53, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (KnifeThrowUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_knifethrow.png"), this.leftPos + -19, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (KnifeThrowUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_knifethrow.png"), this.leftPos + 15, this.topPos + -52, 0, 0, 36, 36, 36, 36);
		}
		if (KnifeThrowUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_knifethrow.png"), this.leftPos + -53, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (KnifeThrowUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_knifethrow.png"), this.leftPos + -19, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (KnifeThrowUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_knifethrow.png"), this.leftPos + 15, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (KnifeThrowUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_knifethrow.png"), this.leftPos + -53, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (KnifeThrowUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_knifethrow.png"), this.leftPos + -19, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (KnifeThrowUnlocked9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_knifethrow.png"), this.leftPos + 15, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (RoadRollerUnlocked1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_roadroller.png"), this.leftPos + -53, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (RoadRollerUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_roadroller.png"), this.leftPos + -19, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (RoadRollerUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_roadroller.png"), this.leftPos + 15, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (RoadRollerUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_roadroller.png"), this.leftPos + -53, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (RoadRollerUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_roadroller.png"), this.leftPos + -19, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (RoadRollerUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_roadroller.png"), this.leftPos + 15, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (RoadRollerUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_roadroller.png"), this.leftPos + -53, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (RoadRollerUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_roadroller.png"), this.leftPos + -19, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (RoadRollerUnlocked9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_roadroller.png"), this.leftPos + 15, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (CrossfireHurricaneUnlocked1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_crossfire.png"), this.leftPos + -53, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (CrossfireHurricaneUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_crossfire.png"), this.leftPos + -19, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (CrossfireHurricaneUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_crossfire.png"), this.leftPos + 15, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (CrossfireHurricaneUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_crossfire.png"), this.leftPos + -53, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (CrossfireHurricaneUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_crossfire.png"), this.leftPos + -19, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (CrossfireHurricaneUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_crossfire.png"), this.leftPos + 15, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (CrossfireHurricaneUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_crossfire.png"), this.leftPos + -53, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (CrossfireHurricaneUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_crossfire.png"), this.leftPos + -19, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (CrossfireHurricaneUnlocked9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_crossfire.png"), this.leftPos + 15, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (CrossfireSpecialUnlocked1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_crossfirespecial.png"), this.leftPos + -53, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (CrossfireSpecialUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_crossfirespecial.png"), this.leftPos + -19, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (CrossfireSpecialUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_crossfirespecial.png"), this.leftPos + 15, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (CrossfireSpecialUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_crossfirespecial.png"), this.leftPos + -53, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (CrossfireSpecialUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_crossfirespecial.png"), this.leftPos + -19, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (CrossfireSpecialUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_crossfirespecial.png"), this.leftPos + 15, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (CrossfireSpecialUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_crossfirespecial.png"), this.leftPos + -53, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (CrossfireSpecialUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_crossfirespecial.png"), this.leftPos + -19, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (CrossfireSpecialUnlocked9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_crossfirespecial.png"), this.leftPos + 15, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (RedBindUnlocked1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/magiciansred_redbind.png"), this.leftPos + -53, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (RedBindUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/magiciansred_redbind.png"), this.leftPos + -19, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (RedBindUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/magiciansred_redbind.png"), this.leftPos + 15, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (RedBindUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/magiciansred_redbind.png"), this.leftPos + -53, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (RedBindUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/magiciansred_redbind.png"), this.leftPos + -19, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (RedBindUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/magiciansred_redbind.png"), this.leftPos + 15, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (RedBindUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/magiciansred_redbind.png"), this.leftPos + -53, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (RedBindUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/magiciansred_redbind.png"), this.leftPos + -19, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (RedBindUnlocked9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/magiciansred_redbind.png"), this.leftPos + 15, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (LifeDetectorUnlocked1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_lifedetect.png"), this.leftPos + -53, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (LifeDetectorUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_lifedetect.png"), this.leftPos + -19, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (LifeDetectorUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_lifedetect.png"), this.leftPos + 15, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (LifeDetectorUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_lifedetect.png"), this.leftPos + -53, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (LifeDetectorUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_lifedetect.png"), this.leftPos + -19, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (LifeDetectorUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_lifedetect.png"), this.leftPos + 15, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (LifeDetectorUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_lifedetect.png"), this.leftPos + -53, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (LifeDetectorUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_lifedetect.png"), this.leftPos + -19, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (LifeDetectorUnlocked9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_lifedetect.png"), this.leftPos + 15, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (TangleUnlocked1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_tangle.png"), this.leftPos + -53, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (TangleUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_tangle.png"), this.leftPos + -19, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (TangleUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_tangle.png"), this.leftPos + 15, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (TangleUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_tangle.png"), this.leftPos + -53, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (TangleUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_tangle.png"), this.leftPos + -19, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (TangleUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_tangle.png"), this.leftPos + 15, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (TangleUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_tangle.png"), this.leftPos + -53, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (TangleUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_tangle.png"), this.leftPos + -19, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (TangleUnlocked9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_tangle.png"), this.leftPos + 15, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (GrappleUnlocked1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_grapple.png"), this.leftPos + -53, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (GrappleUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_grapple.png"), this.leftPos + -19, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (GrappleUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_grapple.png"), this.leftPos + 15, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (GrappleUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_grapple.png"), this.leftPos + -53, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (GrappleUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_grapple.png"), this.leftPos + -19, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (GrappleUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_grapple.png"), this.leftPos + 15, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (GrappleUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_grapple.png"), this.leftPos + -53, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (GrappleUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_grapple.png"), this.leftPos + -19, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (GrappleUnlocked9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_grapple.png"), this.leftPos + 15, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (EmeraldSplashUnlocked1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_emeraldsplash.png"), this.leftPos + -53, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (EmeraldSplashUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_emeraldsplash.png"), this.leftPos + -19, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (EmeraldSplashUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_emeraldsplash.png"), this.leftPos + 15, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (EmeraldSplashUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_emeraldsplash.png"), this.leftPos + -53, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (EmeraldSplashUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_emeraldsplash.png"), this.leftPos + -19, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (EmeraldSplashUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_emeraldsplash.png"), this.leftPos + 15, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (EmeraldSplashUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_emeraldsplash.png"), this.leftPos + -53, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (EmeraldSplashUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_emeraldsplash.png"), this.leftPos + -19, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (EmeraldSplashUnlocked9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_emeraldsplash.png"), this.leftPos + 15, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (EmeraldBarrierUnlocked1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_emeraldbarrier.png"), this.leftPos + -51, this.topPos + -49, 0, 0, 32, 32, 32, 32);
		}
		if (EmeraldBarrierUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_emeraldbarrier.png"), this.leftPos + -17, this.topPos + -49, 0, 0, 32, 32, 32, 32);
		}
		if (EmeraldBarrierUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_emeraldbarrier.png"), this.leftPos + 17, this.topPos + -49, 0, 0, 32, 32, 32, 32);
		}
		if (EmeraldBarrierUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_emeraldbarrier.png"), this.leftPos + -51, this.topPos + -15, 0, 0, 32, 32, 32, 32);
		}
		if (EmeraldBarrierUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_emeraldbarrier.png"), this.leftPos + -17, this.topPos + -15, 0, 0, 32, 32, 32, 32);
		}
		if (EmeraldBarrierUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_emeraldbarrier.png"), this.leftPos + 17, this.topPos + -15, 0, 0, 32, 32, 32, 32);
		}
		if (EmeraldBarrierUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_emeraldbarrier.png"), this.leftPos + -51, this.topPos + 19, 0, 0, 32, 32, 32, 32);
		}
		if (EmeraldBarrierUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_emeraldbarrier.png"), this.leftPos + -17, this.topPos + 19, 0, 0, 32, 32, 32, 32);
		}
		if (EmeraldBarrierUnlocked9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_emeraldbarrier.png"), this.leftPos + 17, this.topPos + 19, 0, 0, 32, 32, 32, 32);
		}
		if (BodyControlUnlocked1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bodycontrol.png"), this.leftPos + -53, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (BodyControlUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bodycontrol.png"), this.leftPos + -19, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (BodyControlUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bodycontrol.png"), this.leftPos + 15, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (BodyControlUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bodycontrol.png"), this.leftPos + -53, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (BodyControlUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bodycontrol.png"), this.leftPos + -19, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (BodyControlUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bodycontrol.png"), this.leftPos + 15, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (BodyControlUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bodycontrol.png"), this.leftPos + -53, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (BodyControlUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bodycontrol.png"), this.leftPos + -19, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (BodyControlUnlocked9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bodycontrol.png"), this.leftPos + 15, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (SwordBarrageUnlocked1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_swordbarrage.png"), this.leftPos + -53, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (SwordBarrageUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_swordbarrage.png"), this.leftPos + -19, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (SwordBarrageUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_swordbarrage.png"), this.leftPos + 15, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (SwordBarrageUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_swordbarrage.png"), this.leftPos + -53, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (SwordBarrageUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_swordbarrage.png"), this.leftPos + -19, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (SwordBarrageUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_swordbarrage.png"), this.leftPos + 15, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (SwordBarrageUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_swordbarrage.png"), this.leftPos + -53, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (SwordBarrageUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_swordbarrage.png"), this.leftPos + -19, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (SwordBarrageUnlocked9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_swordbarrage.png"), this.leftPos + 15, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (SwordLaunchUnlocked1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_swordlaunch.png"), this.leftPos + -53, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (SwordLaunchUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_swordlaunch.png"), this.leftPos + -19, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (SwordLaunchUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_swordlaunch.png"), this.leftPos + 15, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (SwordLaunchUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_swordlaunch.png"), this.leftPos + -53, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (SwordLaunchUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_swordlaunch.png"), this.leftPos + -19, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (SwordLaunchUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_swordlaunch.png"), this.leftPos + 15, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (SwordLaunchUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_swordlaunch.png"), this.leftPos + -53, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (SwordLaunchUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_swordlaunch.png"), this.leftPos + -19, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (SwordLaunchUnlocked9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_swordlaunch.png"), this.leftPos + 15, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (BladeCycloneUnlocked1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bladecyclone.png"), this.leftPos + -53, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (BladeCycloneUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bladecyclone.png"), this.leftPos + -19, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (BladeCycloneUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bladecyclone.png"), this.leftPos + 15, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (BladeCycloneUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bladecyclone.png"), this.leftPos + -53, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (BladeCycloneUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bladecyclone.png"), this.leftPos + -19, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (BladeCycloneUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bladecyclone.png"), this.leftPos + 15, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (BladeCycloneUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bladecyclone.png"), this.leftPos + -53, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (BladeCycloneUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bladecyclone.png"), this.leftPos + -19, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (BladeCycloneUnlocked9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_bladecyclone.png"), this.leftPos + 15, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (ArmorOffUnlocked1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_armoroff.png"), this.leftPos + -53, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (ArmorOffUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_armoroff.png"), this.leftPos + -19, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (ArmorOffUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_armoroff.png"), this.leftPos + 15, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (ArmorOffUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_armoroff.png"), this.leftPos + -53, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (ArmorOffUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_armoroff.png"), this.leftPos + -19, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (ArmorOffUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_armoroff.png"), this.leftPos + 15, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (ArmorOffUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_armoroff.png"), this.leftPos + -53, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (ArmorOffUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_armoroff.png"), this.leftPos + -19, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (ArmorOffUnlocked9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_armoroff.png"), this.leftPos + 15, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (QuicksandUnlocked1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_quicksand.png"), this.leftPos + -53, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (QuicksandUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_quicksand.png"), this.leftPos + -19, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (QuicksandUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_quicksand.png"), this.leftPos + 15, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (QuicksandUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_quicksand.png"), this.leftPos + -53, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (QuicksandUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_quicksand.png"), this.leftPos + -19, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (QuicksandUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_quicksand.png"), this.leftPos + 15, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (QuicksandUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_quicksand.png"), this.leftPos + -53, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (QuicksandUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_quicksand.png"), this.leftPos + -19, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (QuicksandUnlocked9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_quicksand.png"), this.leftPos + 15, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (SandDomeUnlocked1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_sanddome.png"), this.leftPos + -53, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (SandDomeUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_sanddome.png"), this.leftPos + -19, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (SandDomeUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_sanddome.png"), this.leftPos + 15, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (SandDomeUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_sanddome.png"), this.leftPos + -53, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (SandDomeUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_sanddome.png"), this.leftPos + -19, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (SandDomeUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_sanddome.png"), this.leftPos + 15, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (SandDomeUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_sanddome.png"), this.leftPos + -53, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (SandDomeUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_sanddome.png"), this.leftPos + -19, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (SandDomeUnlocked9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_sanddome.png"), this.leftPos + 15, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (SandGliderUnlocked1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_sandglider.png"), this.leftPos + -53, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (SandGliderUnlocked2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_sandglider.png"), this.leftPos + -19, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (SandGliderUnlocked3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_sandglider.png"), this.leftPos + 15, this.topPos + -51, 0, 0, 36, 36, 36, 36);
		}
		if (SandGliderUnlocked4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_sandglider.png"), this.leftPos + -53, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (SandGliderUnlocked5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_sandglider.png"), this.leftPos + -19, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (SandGliderUnlocked6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_sandglider.png"), this.leftPos + 15, this.topPos + -17, 0, 0, 36, 36, 36, 36);
		}
		if (SandGliderUnlocked7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_sandglider.png"), this.leftPos + -53, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (SandGliderUnlocked8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_sandglider.png"), this.leftPos + -19, this.topPos + 17, 0, 0, 36, 36, 36, 36);
		}
		if (SandGliderUnlocked9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/stand_ability_sandglider.png"), this.leftPos + 15, this.topPos + 17, 0, 0, 36, 36, 36, 36);
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
		imagebutton_guiarrow_up = new ImageButton(this.leftPos + -10, this.topPos + -66, 19, 13, 0, 0, 13, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_guiarrow_up.png"), 19, 26, e -> {
			if (WheelSwitchDisplayProcedure.execute(world, entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new AbilityWheelButtonMessage(0, x, y, z));
				AbilityWheelButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (WheelSwitchDisplayProcedure.execute(world, entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_guiarrow_up", imagebutton_guiarrow_up);
		this.addRenderableWidget(imagebutton_guiarrow_up);
		imagebutton_ability_select_blank = new ImageButton(this.leftPos + -53, this.topPos + -51, 36, 36, 0, 0, 36, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_ability_select_blank.png"), 36, 72, e -> {
			if (ReturnAbilityUnlocked1Procedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new AbilityWheelButtonMessage(1, x, y, z));
				AbilityWheelButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnAbilityUnlocked1Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_ability_select_blank", imagebutton_ability_select_blank);
		this.addRenderableWidget(imagebutton_ability_select_blank);
		imagebutton_ability_select = new ImageButton(this.leftPos + -19, this.topPos + -51, 36, 36, 0, 0, 36, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_ability_select.png"), 36, 72, e -> {
			if (ReturnAbilityUnlocked2Procedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new AbilityWheelButtonMessage(2, x, y, z));
				AbilityWheelButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnAbilityUnlocked2Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_ability_select", imagebutton_ability_select);
		this.addRenderableWidget(imagebutton_ability_select);
		imagebutton_ability_select1 = new ImageButton(this.leftPos + 15, this.topPos + -51, 36, 36, 0, 0, 36, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_ability_select1.png"), 36, 72, e -> {
			if (ReturnAbilityUnlocked3Procedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new AbilityWheelButtonMessage(3, x, y, z));
				AbilityWheelButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnAbilityUnlocked3Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_ability_select1", imagebutton_ability_select1);
		this.addRenderableWidget(imagebutton_ability_select1);
		imagebutton_ability_select2 = new ImageButton(this.leftPos + -53, this.topPos + -17, 36, 36, 0, 0, 36, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_ability_select2.png"), 36, 72, e -> {
			if (ReturnAbilityUnlocked4Procedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new AbilityWheelButtonMessage(4, x, y, z));
				AbilityWheelButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnAbilityUnlocked4Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_ability_select2", imagebutton_ability_select2);
		this.addRenderableWidget(imagebutton_ability_select2);
		imagebutton_ability_select3 = new ImageButton(this.leftPos + -19, this.topPos + -17, 36, 36, 0, 0, 36, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_ability_select3.png"), 36, 72, e -> {
			if (ReturnAbilityUnlocked5Procedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new AbilityWheelButtonMessage(5, x, y, z));
				AbilityWheelButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnAbilityUnlocked5Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_ability_select3", imagebutton_ability_select3);
		this.addRenderableWidget(imagebutton_ability_select3);
		imagebutton_ability_select4 = new ImageButton(this.leftPos + 15, this.topPos + -17, 36, 36, 0, 0, 36, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_ability_select4.png"), 36, 72, e -> {
			if (ReturnAbilityUnlocked6Procedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new AbilityWheelButtonMessage(6, x, y, z));
				AbilityWheelButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnAbilityUnlocked6Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_ability_select4", imagebutton_ability_select4);
		this.addRenderableWidget(imagebutton_ability_select4);
		imagebutton_ability_select5 = new ImageButton(this.leftPos + -53, this.topPos + 17, 36, 36, 0, 0, 36, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_ability_select5.png"), 36, 72, e -> {
			if (ReturnAbilityUnlocked7Procedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new AbilityWheelButtonMessage(7, x, y, z));
				AbilityWheelButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnAbilityUnlocked7Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_ability_select5", imagebutton_ability_select5);
		this.addRenderableWidget(imagebutton_ability_select5);
		imagebutton_ability_select6 = new ImageButton(this.leftPos + -19, this.topPos + 17, 36, 36, 0, 0, 36, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_ability_select6.png"), 36, 72, e -> {
			if (ReturnAbilityUnlocked8Procedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new AbilityWheelButtonMessage(8, x, y, z));
				AbilityWheelButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnAbilityUnlocked8Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_ability_select6", imagebutton_ability_select6);
		this.addRenderableWidget(imagebutton_ability_select6);
		imagebutton_ability_select7 = new ImageButton(this.leftPos + 15, this.topPos + 17, 36, 36, 0, 0, 36, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_ability_select7.png"), 36, 72, e -> {
			if (ReturnAbilityUnlocked9Procedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new AbilityWheelButtonMessage(9, x, y, z));
				AbilityWheelButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnAbilityUnlocked9Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_ability_select7", imagebutton_ability_select7);
		this.addRenderableWidget(imagebutton_ability_select7);
	}
}
