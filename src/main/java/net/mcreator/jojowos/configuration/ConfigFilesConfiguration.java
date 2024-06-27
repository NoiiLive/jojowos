package net.mcreator.jojowos.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class ConfigFilesConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	public static final ForgeConfigSpec.ConfigValue<Double> EXPMULTIPLIER;
	public static final ForgeConfigSpec.ConfigValue<Double> LEVELSKILLPOINTS;
	public static final ForgeConfigSpec.ConfigValue<Boolean> REUSABLEARROWS;
	public static final ForgeConfigSpec.ConfigValue<Boolean> METEORITESPAWNING;
	public static final ForgeConfigSpec.ConfigValue<Boolean> NPCSPAWNING;
	public static final ForgeConfigSpec.ConfigValue<Boolean> NPCTIMEMANIPULATION;
	public static final ForgeConfigSpec.ConfigValue<Boolean> BOSSARROWS;
	public static final ForgeConfigSpec.ConfigValue<Double> STANDARROWCHANCE;
	public static final ForgeConfigSpec.ConfigValue<Double> SHINYARROWCHANCE;
	public static final ForgeConfigSpec.ConfigValue<Boolean> DISCDROPS;
	public static final ForgeConfigSpec.ConfigValue<Double> DISCDROPCHANCE;
	public static final ForgeConfigSpec.ConfigValue<Boolean> STANDBLOCKBREAKING;
	public static final ForgeConfigSpec.ConfigValue<Boolean> LOSESTANDONDEATH;
	public static final ForgeConfigSpec.ConfigValue<Boolean> SINGLEPLAYERSTAND;
	public static final ForgeConfigSpec.ConfigValue<Boolean> NATURALSTANDUSERS;
	public static final ForgeConfigSpec.ConfigValue<Double> NATURALSTANDCHANCE;
	public static final ForgeConfigSpec.ConfigValue<Double> HAMONHP;
	public static final ForgeConfigSpec.ConfigValue<Double> VAMPIRETW;
	public static final ForgeConfigSpec.ConfigValue<Double> MINIMUMBLOCK;
	public static final ForgeConfigSpec.ConfigValue<Double> SKINCOST;
	public static final ForgeConfigSpec.ConfigValue<Boolean> RARESKINSUNLOCKED;
	public static final ForgeConfigSpec.ConfigValue<Boolean> EVOLVETIMESTOP;
	static {
		BUILDER.push("Player Configuration");
		EXPMULTIPLIER = BUILDER.comment("Changes how much EXP is added per level-up, high values may make leveling difficult (Default: 25)").define("EXP Multiplier", (double) 25);
		LEVELSKILLPOINTS = BUILDER.comment("Changes how many Skill Points are given per level-up (Default: 5)").define("Skill Points Per Level", (double) 5);
		REUSABLEARROWS = BUILDER.comment("Allows stand arrows to be re-usable (Default: false)").define("Re-useable Arrows", false);
		BUILDER.pop();
		BUILDER.push("World / NPC Configuration");
		METEORITESPAWNING = BUILDER.comment("Enables or Disables spawning for Stand Meteorites (Default: true)").define("Meteorite Spawning", true);
		NPCSPAWNING = BUILDER.comment("Enables or Disables spawning for NPCs (Default: true)").define("NPC Spawning", true);
		NPCTIMEMANIPULATION = BUILDER.comment("Allows NPC's to manipulate time when fighting other NPCs (Will always be true against players) (Default: true)").define("NPC Time Manipulation", true);
		BOSSARROWS = BUILDER.comment("Allows Boss NPCs to have a chance to drop regular or shiny arrows on death (Default: true)").define("Boss Arrows", true);
		STANDARROWCHANCE = BUILDER.comment("The percentage chance for a boss to drop any stand arrow upon death (Default: 25)").define("Stand Arrow Chance", (double) 25);
		SHINYARROWCHANCE = BUILDER.comment("The percentage chance for a boss to drop shiny arrow upon death (Default: 10)").define("Shiny Arrow Chance", (double) 10);
		DISCDROPS = BUILDER.comment("Allows NPCs to have a chance to drop their stand disc on death (Default: true)").define("Disc Drops", true);
		DISCDROPCHANCE = BUILDER.comment("The percentage chance for a stand user to drop their stand disc on death (Default: 1)").define("Disc Drop Chance", (double) 1);
		BUILDER.pop();
		BUILDER.push("Stand Configuration");
		STANDBLOCKBREAKING = BUILDER.comment("Enables stands to break blocks/be destructive (Default: true)").define("Stand Block Breaking", true);
		LOSESTANDONDEATH = BUILDER.comment("Allows the losing of Stands on death (Default: false)").define("Lose Stand On Death", false);
		SINGLEPLAYERSTAND = BUILDER.comment("Allows only one player to have a certain Stand at a time, disables Stand Disc crafting. (Default: false)").define("Single Stand Per Player", false);
		NATURALSTANDUSERS = BUILDER.comment("Allows players to rarely spawn with a stand (Default: true)").define("Natural Stand Users", true);
		NATURALSTANDCHANCE = BUILDER.comment("Percentage chance of a player spawning with a stand (Default: 5)").define("Natural Stand Chance", (double) 5);
		HAMONHP = BUILDER.comment("Percentage chance of a Hamon User recieving Hermit Purple (Default: 25)").define("Hamon Hermit Purple Chance", (double) 25);
		VAMPIRETW = BUILDER.comment("Percentage chance of a Vampire recieving The World (Default: 25)").define("Vampire The World Chance", (double) 25);
		MINIMUMBLOCK = BUILDER.comment("The minimum amount of attacks a Stand User can block with 0 durability (Default: 5)").define("Minimum Block", (double) 5);
		SKINCOST = BUILDER.comment("The amount of Skill Points it costs to change stand skins (Default: 3)").define("Skin Cost", (double) 3);
		RARESKINSUNLOCKED = BUILDER.comment("Allows rare skins to be available to everyone without unlocking (Default: false)").define("Rare Skins Unlocked", false);
		EVOLVETIMESTOP = BUILDER.comment("Allows a stand with the time stop/time skip skill to evolve it by experiencing frozen time. (Default: true)").define("Evolveable Time Stop", true);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
