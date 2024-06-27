
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jojowos.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.jojowos.client.gui.TheWorldStandSkins2Screen;
import net.mcreator.jojowos.client.gui.TheWorldStandSkins1Screen;
import net.mcreator.jojowos.client.gui.TheFoolStandSkins1Screen;
import net.mcreator.jojowos.client.gui.StarPlatinumStandSkins2Screen;
import net.mcreator.jojowos.client.gui.StarPlatinumStandSkins1Screen;
import net.mcreator.jojowos.client.gui.StandStatScreen;
import net.mcreator.jojowos.client.gui.StandSkillTreeOddScreen;
import net.mcreator.jojowos.client.gui.StandSkillTreeEvenScreen;
import net.mcreator.jojowos.client.gui.SilverChariotStandSkins1Screen;
import net.mcreator.jojowos.client.gui.SideQuestGUIScreen;
import net.mcreator.jojowos.client.gui.PolnareffChatboxScreen;
import net.mcreator.jojowos.client.gui.MainQuestGUIScreen;
import net.mcreator.jojowos.client.gui.MagiciansRedStandSkins2Screen;
import net.mcreator.jojowos.client.gui.MagiciansRedStandSkins1Screen;
import net.mcreator.jojowos.client.gui.KakyoinChatboxScreen;
import net.mcreator.jojowos.client.gui.JotaroChatboxScreen;
import net.mcreator.jojowos.client.gui.JosephChatboxScreen;
import net.mcreator.jojowos.client.gui.HierophantGreenStandSkins1Screen;
import net.mcreator.jojowos.client.gui.HermitPurpleStandSkins2Screen;
import net.mcreator.jojowos.client.gui.HermitPurpleStandSkins1Screen;
import net.mcreator.jojowos.client.gui.DioChatboxScreen;
import net.mcreator.jojowos.client.gui.AvdolChatboxScreen;
import net.mcreator.jojowos.client.gui.AbilityWheelScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class JojowosModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(JojowosModMenus.STAND_STAT.get(), StandStatScreen::new);
			MenuScreens.register(JojowosModMenus.JOTARO_CHATBOX.get(), JotaroChatboxScreen::new);
			MenuScreens.register(JojowosModMenus.MAIN_QUEST_GUI.get(), MainQuestGUIScreen::new);
			MenuScreens.register(JojowosModMenus.SIDE_QUEST_GUI.get(), SideQuestGUIScreen::new);
			MenuScreens.register(JojowosModMenus.DIO_CHATBOX.get(), DioChatboxScreen::new);
			MenuScreens.register(JojowosModMenus.JOSEPH_CHATBOX.get(), JosephChatboxScreen::new);
			MenuScreens.register(JojowosModMenus.POLNAREFF_CHATBOX.get(), PolnareffChatboxScreen::new);
			MenuScreens.register(JojowosModMenus.KAKYOIN_CHATBOX.get(), KakyoinChatboxScreen::new);
			MenuScreens.register(JojowosModMenus.AVDOL_CHATBOX.get(), AvdolChatboxScreen::new);
			MenuScreens.register(JojowosModMenus.STAR_PLATINUM_STAND_SKINS_1.get(), StarPlatinumStandSkins1Screen::new);
			MenuScreens.register(JojowosModMenus.STAR_PLATINUM_STAND_SKINS_2.get(), StarPlatinumStandSkins2Screen::new);
			MenuScreens.register(JojowosModMenus.MAGICIANS_RED_STAND_SKINS_1.get(), MagiciansRedStandSkins1Screen::new);
			MenuScreens.register(JojowosModMenus.MAGICIANS_RED_STAND_SKINS_2.get(), MagiciansRedStandSkins2Screen::new);
			MenuScreens.register(JojowosModMenus.HIEROPHANT_GREEN_STAND_SKINS_1.get(), HierophantGreenStandSkins1Screen::new);
			MenuScreens.register(JojowosModMenus.SILVER_CHARIOT_STAND_SKINS_1.get(), SilverChariotStandSkins1Screen::new);
			MenuScreens.register(JojowosModMenus.HERMIT_PURPLE_STAND_SKINS_1.get(), HermitPurpleStandSkins1Screen::new);
			MenuScreens.register(JojowosModMenus.HERMIT_PURPLE_STAND_SKINS_2.get(), HermitPurpleStandSkins2Screen::new);
			MenuScreens.register(JojowosModMenus.THE_FOOL_STAND_SKINS_1.get(), TheFoolStandSkins1Screen::new);
			MenuScreens.register(JojowosModMenus.THE_WORLD_STAND_SKINS_1.get(), TheWorldStandSkins1Screen::new);
			MenuScreens.register(JojowosModMenus.THE_WORLD_STAND_SKINS_2.get(), TheWorldStandSkins2Screen::new);
			MenuScreens.register(JojowosModMenus.STAND_SKILL_TREE_EVEN.get(), StandSkillTreeEvenScreen::new);
			MenuScreens.register(JojowosModMenus.STAND_SKILL_TREE_ODD.get(), StandSkillTreeOddScreen::new);
			MenuScreens.register(JojowosModMenus.ABILITY_WHEEL.get(), AbilityWheelScreen::new);
		});
	}
}
