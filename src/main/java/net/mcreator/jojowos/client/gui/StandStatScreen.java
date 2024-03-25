package net.mcreator.jojowos.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.jojowos.world.inventory.StandStatMenu;
import net.mcreator.jojowos.procedures.TheWorldSilverIconProcedure;
import net.mcreator.jojowos.procedures.TheWorldOVAIconProcedure;
import net.mcreator.jojowos.procedures.TheWorldMangaIconProcedure;
import net.mcreator.jojowos.procedures.TheWorldBlackIconProcedure;
import net.mcreator.jojowos.procedures.TheWorldBaseIconProcedure;
import net.mcreator.jojowos.procedures.TheFoolOVAIconProcedure;
import net.mcreator.jojowos.procedures.TheFoolMangaIconProcedure;
import net.mcreator.jojowos.procedures.TheFoolBaseIconProcedure;
import net.mcreator.jojowos.procedures.StatStrengthDisplayProcedure;
import net.mcreator.jojowos.procedures.StatSpeedDisplayProcedure;
import net.mcreator.jojowos.procedures.StatSkillPointDisplayProcedure;
import net.mcreator.jojowos.procedures.StatPrecisionDisplayProcedure;
import net.mcreator.jojowos.procedures.StatPotentialDisplayProcedure;
import net.mcreator.jojowos.procedures.StatLevelDisplayProcedure;
import net.mcreator.jojowos.procedures.StatDurabilityDisplayProcedure;
import net.mcreator.jojowos.procedures.StarPlatinumPart6IconProcedure;
import net.mcreator.jojowos.procedures.StarPlatinumPart4IconProcedure;
import net.mcreator.jojowos.procedures.StarPlatinumOVAIconProcedure;
import net.mcreator.jojowos.procedures.StarPlatinumMangaIconProcedure;
import net.mcreator.jojowos.procedures.StarPlatinumGreenIconProcedure;
import net.mcreator.jojowos.procedures.StarPlatinumBlueIconProcedure;
import net.mcreator.jojowos.procedures.StarPlatinumBaseIconProcedure;
import net.mcreator.jojowos.procedures.StandStatStandWordsProcedure;
import net.mcreator.jojowos.procedures.StandStatSkinWordsProcedure;
import net.mcreator.jojowos.procedures.StandExp9Procedure;
import net.mcreator.jojowos.procedures.StandExp8Procedure;
import net.mcreator.jojowos.procedures.StandExp7Procedure;
import net.mcreator.jojowos.procedures.StandExp6Procedure;
import net.mcreator.jojowos.procedures.StandExp5Procedure;
import net.mcreator.jojowos.procedures.StandExp4Procedure;
import net.mcreator.jojowos.procedures.StandExp3Procedure;
import net.mcreator.jojowos.procedures.StandExp2Procedure;
import net.mcreator.jojowos.procedures.StandExp22Procedure;
import net.mcreator.jojowos.procedures.StandExp21Procedure;
import net.mcreator.jojowos.procedures.StandExp20Procedure;
import net.mcreator.jojowos.procedures.StandExp1Procedure;
import net.mcreator.jojowos.procedures.StandExp19Procedure;
import net.mcreator.jojowos.procedures.StandExp18Procedure;
import net.mcreator.jojowos.procedures.StandExp17Procedure;
import net.mcreator.jojowos.procedures.StandExp16Procedure;
import net.mcreator.jojowos.procedures.StandExp15Procedure;
import net.mcreator.jojowos.procedures.StandExp14Procedure;
import net.mcreator.jojowos.procedures.StandExp13Procedure;
import net.mcreator.jojowos.procedures.StandExp12Procedure;
import net.mcreator.jojowos.procedures.StandExp11Procedure;
import net.mcreator.jojowos.procedures.StandExp10Procedure;
import net.mcreator.jojowos.procedures.SpeedStatAddDisplayProcedure;
import net.mcreator.jojowos.procedures.SilverChariotOVAIconProcedure;
import net.mcreator.jojowos.procedures.SilverChariotMangaIconProcedure;
import net.mcreator.jojowos.procedures.SilverChariotGoldIconProcedure;
import net.mcreator.jojowos.procedures.SilverChariotBaseIconProcedure;
import net.mcreator.jojowos.procedures.PrecisionStatAddDisplayProcedure;
import net.mcreator.jojowos.procedures.PowerStatAddDisplayProcedure;
import net.mcreator.jojowos.procedures.PotentialStatAddDisplayProcedure;
import net.mcreator.jojowos.procedures.MagiciansRedOVAIconProcedure;
import net.mcreator.jojowos.procedures.MagiciansRedMangaIconProcedure;
import net.mcreator.jojowos.procedures.MagiciansRedGreenIconProcedure;
import net.mcreator.jojowos.procedures.MagiciansRedBaseIconProcedure;
import net.mcreator.jojowos.procedures.MagiciansRedASBIconProcedure;
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
import net.mcreator.jojowos.procedures.DurabilityStatAddDisplayProcedure;
import net.mcreator.jojowos.procedures.DisplayLevelTooltipProcedure;
import net.mcreator.jojowos.network.StandStatButtonMessage;
import net.mcreator.jojowos.JojowosMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class StandStatScreen extends AbstractContainerScreen<StandStatMenu> {
	private final static HashMap<String, Object> guistate = StandStatMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_skilladd;
	ImageButton imagebutton_skilladd1;
	ImageButton imagebutton_skilladd2;
	ImageButton imagebutton_skilladd3;
	ImageButton imagebutton_skilladd4;
	ImageButton imagebutton_guiarrow;
	ImageButton imagebutton_questgui_button;
	ImageButton imagebutton_standstat_skintab;

	public StandStatScreen(StandStatMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 1;
		this.imageHeight = 1;
	}

	private static final ResourceLocation texture = new ResourceLocation("jojowos:textures/screens/stand_stat.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (SpeedStatAddDisplayProcedure.execute(entity))
			if (mouseX > leftPos + 73 && mouseX < leftPos + 98 && mouseY > topPos + 14 && mouseY < topPos + 29)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.stand_stat.tooltip_decreases_the_cooldowns_of_your"), mouseX, mouseY);
		if (PowerStatAddDisplayProcedure.execute(entity))
			if (mouseX > leftPos + 73 && mouseX < leftPos + 98 && mouseY > topPos + -4 && mouseY < topPos + 11)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.stand_stat.tooltip_increases_the_power_of_your_stan"), mouseX, mouseY);
		if (DurabilityStatAddDisplayProcedure.execute(entity))
			if (mouseX > leftPos + 73 && mouseX < leftPos + 98 && mouseY > topPos + 32 && mouseY < topPos + 47)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.stand_stat.tooltip_decreases_the_damage_you_take"), mouseX, mouseY);
		if (PrecisionStatAddDisplayProcedure.execute(entity))
			if (mouseX > leftPos + 73 && mouseX < leftPos + 98 && mouseY > topPos + 50 && mouseY < topPos + 65)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.stand_stat.tooltip_increases_the_range_of_your_stan"), mouseX, mouseY);
		if (PotentialStatAddDisplayProcedure.execute(entity))
			if (mouseX > leftPos + 73 && mouseX < leftPos + 98 && mouseY > topPos + 67 && mouseY < topPos + 82)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.stand_stat.tooltip_allows_your_stand_to_acquire_mor"), mouseX, mouseY);
		if (mouseX > leftPos + -99 && mouseX < leftPos + -65 && mouseY > topPos + -2 && mouseY < topPos + 85)
			guiGraphics.renderTooltip(font, Component.literal(DisplayLevelTooltipProcedure.execute(entity)), mouseX, mouseY);
		if (mouseX > leftPos + 82 && mouseX < leftPos + 99 && mouseY > topPos + -37 && mouseY < topPos + -14)
			guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.stand_stat.tooltip_opens_skill_tree"), mouseX, mouseY);
		if (mouseX > leftPos + -130 && mouseX < leftPos + -106 && mouseY > topPos + 69 && mouseY < topPos + 93)
			guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.stand_stat.tooltip_open_quests"), mouseX, mouseY);
		if (mouseX > leftPos + 92 && mouseX < leftPos + 99 && mouseY > topPos + -63 && mouseY < topPos + -45)
			guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.stand_stat.tooltip_change_stand_skin"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standstatgui.png"), this.leftPos + -109, this.topPos + -75, 0, 0, 220, 170, 220, 170);

		if (TheFoolBaseIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/thefool.png"), this.leftPos + -98, this.topPos + -38, 0, 0, 32, 32, 32, 32);
		}
		if (StarPlatinumBaseIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/starplatinum.png"), this.leftPos + -98, this.topPos + -38, 0, 0, 32, 32, 32, 32);
		}
		if (TheWorldBaseIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/theworld.png"), this.leftPos + -98, this.topPos + -38, 0, 0, 32, 32, 32, 32);
		}
		if (SilverChariotBaseIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/silverchariot.png"), this.leftPos + -98, this.topPos + -38, 0, 0, 32, 32, 32, 32);
		}
		if (HierophantGreenBaseIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/hierophantgreen.png"), this.leftPos + -98, this.topPos + -38, 0, 0, 32, 32, 32, 32);
		}
		if (MagiciansRedBaseIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/magiciansred.png"), this.leftPos + -98, this.topPos + -38, 0, 0, 32, 32, 32, 32);
		}
		if (HermitPurpleBaseIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/hermitpurple.png"), this.leftPos + -97, this.topPos + -38, 0, 0, 32, 32, 32, 32);
		}
		if (StandExp22Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standexp__22.png"), this.leftPos + -100, this.topPos + -3, 0, 0, 36, 89, 36, 89);
		}
		if (StandExp21Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standexp__21.png"), this.leftPos + -100, this.topPos + -3, 0, 0, 36, 89, 36, 89);
		}
		if (StandExp20Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standexp__20.png"), this.leftPos + -100, this.topPos + -3, 0, 0, 36, 89, 36, 89);
		}
		if (StandExp19Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standexp__19.png"), this.leftPos + -100, this.topPos + -3, 0, 0, 36, 89, 36, 89);
		}
		if (StandExp18Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standexp__18.png"), this.leftPos + -100, this.topPos + -3, 0, 0, 36, 89, 36, 89);
		}
		if (StandExp17Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standexp__17.png"), this.leftPos + -100, this.topPos + -3, 0, 0, 36, 89, 36, 89);
		}
		if (StandExp16Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standexp__16.png"), this.leftPos + -100, this.topPos + -3, 0, 0, 36, 89, 36, 89);
		}
		if (StandExp15Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standexp__15.png"), this.leftPos + -100, this.topPos + -3, 0, 0, 36, 89, 36, 89);
		}
		if (StandExp14Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standexp__14.png"), this.leftPos + -100, this.topPos + -3, 0, 0, 36, 89, 36, 89);
		}
		if (StandExp13Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standexp__13.png"), this.leftPos + -100, this.topPos + -3, 0, 0, 36, 89, 36, 89);
		}
		if (StandExp12Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standexp__12.png"), this.leftPos + -100, this.topPos + -3, 0, 0, 36, 89, 36, 89);
		}
		if (StandExp11Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standexp__11.png"), this.leftPos + -100, this.topPos + -3, 0, 0, 36, 89, 36, 89);
		}
		if (StandExp10Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standexp__10.png"), this.leftPos + -100, this.topPos + -3, 0, 0, 36, 89, 36, 89);
		}
		if (StandExp9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standexp__9.png"), this.leftPos + -100, this.topPos + -3, 0, 0, 36, 89, 36, 89);
		}
		if (StandExp8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standexp__8.png"), this.leftPos + -100, this.topPos + -3, 0, 0, 36, 89, 36, 89);
		}
		if (StandExp7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standexp__7.png"), this.leftPos + -100, this.topPos + -3, 0, 0, 36, 89, 36, 89);
		}
		if (StandExp6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standexp__6.png"), this.leftPos + -100, this.topPos + -3, 0, 0, 36, 89, 36, 89);
		}
		if (StandExp5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standexp__5.png"), this.leftPos + -100, this.topPos + -3, 0, 0, 36, 89, 36, 89);
		}
		if (StandExp4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standexp__4.png"), this.leftPos + -100, this.topPos + -3, 0, 0, 36, 89, 36, 89);
		}
		if (StandExp3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standexp__3.png"), this.leftPos + -100, this.topPos + -3, 0, 0, 36, 89, 36, 89);
		}
		if (StandExp2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standexp__2.png"), this.leftPos + -100, this.topPos + -3, 0, 0, 36, 89, 36, 89);
		}
		if (StandExp1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standexp__1.png"), this.leftPos + -100, this.topPos + -3, 0, 0, 36, 89, 36, 89);
		}
		if (StarPlatinumBlueIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/starplatinumicon_blue.png"), this.leftPos + -98, this.topPos + -38, 0, 0, 32, 32, 32, 32);
		}
		if (StarPlatinumGreenIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/starplatinumicon_green.png"), this.leftPos + -98, this.topPos + -38, 0, 0, 32, 32, 32, 32);
		}
		if (StarPlatinumMangaIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/starplatinumicon_manga.png"), this.leftPos + -98, this.topPos + -38, 0, 0, 32, 32, 32, 32);
		}
		if (StarPlatinumOVAIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/starplatinumicon_ova.png"), this.leftPos + -98, this.topPos + -38, 0, 0, 32, 32, 32, 32);
		}
		if (StarPlatinumPart4IconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/starplatinumicon_part4.png"), this.leftPos + -98, this.topPos + -38, 0, 0, 32, 32, 32, 32);
		}
		if (StarPlatinumPart6IconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/starplatinumicon_part6.png"), this.leftPos + -98, this.topPos + -38, 0, 0, 32, 32, 32, 32);
		}
		if (TheWorldBlackIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/theworldicon_black.png"), this.leftPos + -98, this.topPos + -38, 0, 0, 32, 32, 32, 32);
		}
		if (TheWorldMangaIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/theworldicon_manga.png"), this.leftPos + -98, this.topPos + -38, 0, 0, 32, 32, 32, 32);
		}
		if (TheWorldOVAIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/theworldicon_ova.png"), this.leftPos + -98, this.topPos + -38, 0, 0, 32, 32, 32, 32);
		}
		if (TheWorldSilverIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/theworldicon_dark.png"), this.leftPos + -98, this.topPos + -38, 0, 0, 32, 32, 32, 32);
		}
		if (HermitPurpleBlueIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/hermitpurpleicon_blue.png"), this.leftPos + -98, this.topPos + -38, 0, 0, 32, 32, 32, 32);
		}
		if (HermitPurpleGoldIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/hermitpurpleicon_gold.png"), this.leftPos + -98, this.topPos + -38, 0, 0, 32, 32, 32, 32);
		}
		if (HermitPurpleMangaIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/hermitpurpleicon_manga.png"), this.leftPos + -98, this.topPos + -38, 0, 0, 32, 32, 32, 32);
		}
		if (HermitPurplePart4IconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/hermitpurpleicon_part4.png"), this.leftPos + -98, this.topPos + -38, 0, 0, 32, 32, 32, 32);
		}
		if (HermitPurpleRedIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/hermitpurpleicon_red.png"), this.leftPos + -98, this.topPos + -38, 0, 0, 32, 32, 32, 32);
		}
		if (HierophantGreenBlueIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/hierophantgreenicon_blue.png"), this.leftPos + -98, this.topPos + -38, 0, 0, 32, 32, 32, 32);
		}
		if (HierophantGreenMangaIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/hierophantgreenicon_manga.png"), this.leftPos + -98, this.topPos + -38, 0, 0, 32, 32, 32, 32);
		}
		if (HierophantGreenOVAIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/hierophantgreenicon_ova.png"), this.leftPos + -98, this.topPos + -38, 0, 0, 32, 32, 32, 32);
		}
		if (MagiciansRedASBIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/magiciansredicon_asb.png"), this.leftPos + -98, this.topPos + -38, 0, 0, 32, 32, 32, 32);
		}
		if (MagiciansRedGreenIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/magiciansredicon_green.png"), this.leftPos + -98, this.topPos + -38, 0, 0, 32, 32, 32, 32);
		}
		if (MagiciansRedMangaIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/magiciansredicon_manga.png"), this.leftPos + -98, this.topPos + -38, 0, 0, 32, 32, 32, 32);
		}
		if (MagiciansRedOVAIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/magiciansredicon_ova.png"), this.leftPos + -98, this.topPos + -38, 0, 0, 32, 32, 32, 32);
		}
		if (SilverChariotGoldIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/silvercharioticon_gold.png"), this.leftPos + -98, this.topPos + -38, 0, 0, 32, 32, 32, 32);
		}
		if (SilverChariotMangaIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/silvercharioticon_manga.png"), this.leftPos + -98, this.topPos + -38, 0, 0, 32, 32, 32, 32);
		}
		if (SilverChariotOVAIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/silvercharioticon_ova.png"), this.leftPos + -98, this.topPos + -38, 0, 0, 32, 32, 32, 32);
		}
		if (TheFoolMangaIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/thefoolicon_manga.png"), this.leftPos + -98, this.topPos + -38, 0, 0, 32, 32, 32, 32);
		}
		if (TheFoolOVAIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/thefoolicon_ova.png"), this.leftPos + -98, this.topPos + -38, 0, 0, 32, 32, 32, 32);
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

				StandStatStandWordsProcedure.execute(entity), -95, -58, -1, false);
		guiGraphics.drawString(this.font,

				StandStatSkinWordsProcedure.execute(entity), 20, -58, -1, false);
		guiGraphics.drawString(this.font,

				StatLevelDisplayProcedure.execute(entity), -57, -34, -1, false);
		guiGraphics.drawString(this.font,

				StatStrengthDisplayProcedure.execute(entity), -57, 2, -1, false);
		guiGraphics.drawString(this.font,

				StatSpeedDisplayProcedure.execute(entity), -57, 20, -1, false);
		guiGraphics.drawString(this.font,

				StatDurabilityDisplayProcedure.execute(entity), -57, 38, -1, false);
		guiGraphics.drawString(this.font,

				StatPrecisionDisplayProcedure.execute(entity), -57, 56, -1, false);
		guiGraphics.drawString(this.font,

				StatPotentialDisplayProcedure.execute(entity), -57, 73, -1, false);
		guiGraphics.drawString(this.font,

				StatSkillPointDisplayProcedure.execute(entity), -57, -16, -1, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_skilladd = new ImageButton(this.leftPos + 73, this.topPos + -4, 25, 15, 0, 0, 15, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_skilladd.png"), 25, 30, e -> {
			if (PowerStatAddDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new StandStatButtonMessage(0, x, y, z));
				StandStatButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (PowerStatAddDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilladd", imagebutton_skilladd);
		this.addRenderableWidget(imagebutton_skilladd);
		imagebutton_skilladd1 = new ImageButton(this.leftPos + 73, this.topPos + 14, 25, 15, 0, 0, 15, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_skilladd1.png"), 25, 30, e -> {
			if (SpeedStatAddDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new StandStatButtonMessage(1, x, y, z));
				StandStatButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (SpeedStatAddDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilladd1", imagebutton_skilladd1);
		this.addRenderableWidget(imagebutton_skilladd1);
		imagebutton_skilladd2 = new ImageButton(this.leftPos + 73, this.topPos + 32, 25, 15, 0, 0, 15, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_skilladd2.png"), 25, 30, e -> {
			if (DurabilityStatAddDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new StandStatButtonMessage(2, x, y, z));
				StandStatButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (DurabilityStatAddDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilladd2", imagebutton_skilladd2);
		this.addRenderableWidget(imagebutton_skilladd2);
		imagebutton_skilladd3 = new ImageButton(this.leftPos + 73, this.topPos + 50, 25, 15, 0, 0, 15, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_skilladd3.png"), 25, 30, e -> {
			if (PrecisionStatAddDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new StandStatButtonMessage(3, x, y, z));
				StandStatButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (PrecisionStatAddDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilladd3", imagebutton_skilladd3);
		this.addRenderableWidget(imagebutton_skilladd3);
		imagebutton_skilladd4 = new ImageButton(this.leftPos + 73, this.topPos + 67, 25, 15, 0, 0, 15, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_skilladd4.png"), 25, 30, e -> {
			if (PotentialStatAddDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new StandStatButtonMessage(4, x, y, z));
				StandStatButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (PotentialStatAddDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilladd4", imagebutton_skilladd4);
		this.addRenderableWidget(imagebutton_skilladd4);
		imagebutton_guiarrow = new ImageButton(this.leftPos + 84, this.topPos + -35, 13, 19, 0, 0, 19, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_guiarrow.png"), 13, 38, e -> {
			if (true) {
				JojowosMod.PACKET_HANDLER.sendToServer(new StandStatButtonMessage(5, x, y, z));
				StandStatButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_guiarrow", imagebutton_guiarrow);
		this.addRenderableWidget(imagebutton_guiarrow);
		imagebutton_questgui_button = new ImageButton(this.leftPos + -129, this.topPos + 70, 22, 22, 0, 0, 22, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_questgui_button.png"), 22, 44, e -> {
			if (true) {
				JojowosMod.PACKET_HANDLER.sendToServer(new StandStatButtonMessage(6, x, y, z));
				StandStatButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:imagebutton_questgui_button", imagebutton_questgui_button);
		this.addRenderableWidget(imagebutton_questgui_button);
		imagebutton_standstat_skintab = new ImageButton(this.leftPos + 92, this.topPos + -63, 7, 18, 0, 0, 18, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_standstat_skintab.png"), 7, 36, e -> {
			if (true) {
				JojowosMod.PACKET_HANDLER.sendToServer(new StandStatButtonMessage(7, x, y, z));
				StandStatButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});
		guistate.put("button:imagebutton_standstat_skintab", imagebutton_standstat_skintab);
		this.addRenderableWidget(imagebutton_standstat_skintab);
	}
}
