
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jojowos.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.jojowos.world.inventory.TheWorldStandSkins2Menu;
import net.mcreator.jojowos.world.inventory.TheWorldStandSkins1Menu;
import net.mcreator.jojowos.world.inventory.TheFoolStandSkins1Menu;
import net.mcreator.jojowos.world.inventory.StarPlatinumStandSkins2Menu;
import net.mcreator.jojowos.world.inventory.StarPlatinumStandSkins1Menu;
import net.mcreator.jojowos.world.inventory.StandStatMenu;
import net.mcreator.jojowos.world.inventory.StandSkillTreeOddMenu;
import net.mcreator.jojowos.world.inventory.StandSkillTreeEvenMenu;
import net.mcreator.jojowos.world.inventory.SilverChariotStandSkins1Menu;
import net.mcreator.jojowos.world.inventory.SideQuestGUIMenu;
import net.mcreator.jojowos.world.inventory.PolnareffChatboxMenu;
import net.mcreator.jojowos.world.inventory.MainQuestGUIMenu;
import net.mcreator.jojowos.world.inventory.MagiciansRedStandSkins2Menu;
import net.mcreator.jojowos.world.inventory.MagiciansRedStandSkins1Menu;
import net.mcreator.jojowos.world.inventory.KakyoinChatboxMenu;
import net.mcreator.jojowos.world.inventory.JotaroChatboxMenu;
import net.mcreator.jojowos.world.inventory.JosephChatboxMenu;
import net.mcreator.jojowos.world.inventory.HierophantGreenStandSkins1Menu;
import net.mcreator.jojowos.world.inventory.HermitPurpleStandSkins2Menu;
import net.mcreator.jojowos.world.inventory.HermitPurpleStandSkins1Menu;
import net.mcreator.jojowos.world.inventory.DioChatboxMenu;
import net.mcreator.jojowos.world.inventory.AvdolChatboxMenu;
import net.mcreator.jojowos.world.inventory.AbilityWheelMenu;
import net.mcreator.jojowos.JojowosMod;

public class JojowosModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, JojowosMod.MODID);
	public static final RegistryObject<MenuType<StandStatMenu>> STAND_STAT = REGISTRY.register("stand_stat", () -> IForgeMenuType.create(StandStatMenu::new));
	public static final RegistryObject<MenuType<JotaroChatboxMenu>> JOTARO_CHATBOX = REGISTRY.register("jotaro_chatbox", () -> IForgeMenuType.create(JotaroChatboxMenu::new));
	public static final RegistryObject<MenuType<MainQuestGUIMenu>> MAIN_QUEST_GUI = REGISTRY.register("main_quest_gui", () -> IForgeMenuType.create(MainQuestGUIMenu::new));
	public static final RegistryObject<MenuType<SideQuestGUIMenu>> SIDE_QUEST_GUI = REGISTRY.register("side_quest_gui", () -> IForgeMenuType.create(SideQuestGUIMenu::new));
	public static final RegistryObject<MenuType<DioChatboxMenu>> DIO_CHATBOX = REGISTRY.register("dio_chatbox", () -> IForgeMenuType.create(DioChatboxMenu::new));
	public static final RegistryObject<MenuType<JosephChatboxMenu>> JOSEPH_CHATBOX = REGISTRY.register("joseph_chatbox", () -> IForgeMenuType.create(JosephChatboxMenu::new));
	public static final RegistryObject<MenuType<PolnareffChatboxMenu>> POLNAREFF_CHATBOX = REGISTRY.register("polnareff_chatbox", () -> IForgeMenuType.create(PolnareffChatboxMenu::new));
	public static final RegistryObject<MenuType<KakyoinChatboxMenu>> KAKYOIN_CHATBOX = REGISTRY.register("kakyoin_chatbox", () -> IForgeMenuType.create(KakyoinChatboxMenu::new));
	public static final RegistryObject<MenuType<AvdolChatboxMenu>> AVDOL_CHATBOX = REGISTRY.register("avdol_chatbox", () -> IForgeMenuType.create(AvdolChatboxMenu::new));
	public static final RegistryObject<MenuType<StarPlatinumStandSkins1Menu>> STAR_PLATINUM_STAND_SKINS_1 = REGISTRY.register("star_platinum_stand_skins_1", () -> IForgeMenuType.create(StarPlatinumStandSkins1Menu::new));
	public static final RegistryObject<MenuType<StarPlatinumStandSkins2Menu>> STAR_PLATINUM_STAND_SKINS_2 = REGISTRY.register("star_platinum_stand_skins_2", () -> IForgeMenuType.create(StarPlatinumStandSkins2Menu::new));
	public static final RegistryObject<MenuType<MagiciansRedStandSkins1Menu>> MAGICIANS_RED_STAND_SKINS_1 = REGISTRY.register("magicians_red_stand_skins_1", () -> IForgeMenuType.create(MagiciansRedStandSkins1Menu::new));
	public static final RegistryObject<MenuType<MagiciansRedStandSkins2Menu>> MAGICIANS_RED_STAND_SKINS_2 = REGISTRY.register("magicians_red_stand_skins_2", () -> IForgeMenuType.create(MagiciansRedStandSkins2Menu::new));
	public static final RegistryObject<MenuType<HierophantGreenStandSkins1Menu>> HIEROPHANT_GREEN_STAND_SKINS_1 = REGISTRY.register("hierophant_green_stand_skins_1", () -> IForgeMenuType.create(HierophantGreenStandSkins1Menu::new));
	public static final RegistryObject<MenuType<SilverChariotStandSkins1Menu>> SILVER_CHARIOT_STAND_SKINS_1 = REGISTRY.register("silver_chariot_stand_skins_1", () -> IForgeMenuType.create(SilverChariotStandSkins1Menu::new));
	public static final RegistryObject<MenuType<HermitPurpleStandSkins1Menu>> HERMIT_PURPLE_STAND_SKINS_1 = REGISTRY.register("hermit_purple_stand_skins_1", () -> IForgeMenuType.create(HermitPurpleStandSkins1Menu::new));
	public static final RegistryObject<MenuType<HermitPurpleStandSkins2Menu>> HERMIT_PURPLE_STAND_SKINS_2 = REGISTRY.register("hermit_purple_stand_skins_2", () -> IForgeMenuType.create(HermitPurpleStandSkins2Menu::new));
	public static final RegistryObject<MenuType<TheFoolStandSkins1Menu>> THE_FOOL_STAND_SKINS_1 = REGISTRY.register("the_fool_stand_skins_1", () -> IForgeMenuType.create(TheFoolStandSkins1Menu::new));
	public static final RegistryObject<MenuType<TheWorldStandSkins1Menu>> THE_WORLD_STAND_SKINS_1 = REGISTRY.register("the_world_stand_skins_1", () -> IForgeMenuType.create(TheWorldStandSkins1Menu::new));
	public static final RegistryObject<MenuType<TheWorldStandSkins2Menu>> THE_WORLD_STAND_SKINS_2 = REGISTRY.register("the_world_stand_skins_2", () -> IForgeMenuType.create(TheWorldStandSkins2Menu::new));
	public static final RegistryObject<MenuType<StandSkillTreeEvenMenu>> STAND_SKILL_TREE_EVEN = REGISTRY.register("stand_skill_tree_even", () -> IForgeMenuType.create(StandSkillTreeEvenMenu::new));
	public static final RegistryObject<MenuType<StandSkillTreeOddMenu>> STAND_SKILL_TREE_ODD = REGISTRY.register("stand_skill_tree_odd", () -> IForgeMenuType.create(StandSkillTreeOddMenu::new));
	public static final RegistryObject<MenuType<AbilityWheelMenu>> ABILITY_WHEEL = REGISTRY.register("ability_wheel", () -> IForgeMenuType.create(AbilityWheelMenu::new));
}
