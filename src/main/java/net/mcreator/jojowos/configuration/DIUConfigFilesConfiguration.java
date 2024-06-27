package net.mcreator.jojowos.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class DIUConfigFilesConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	public static final ForgeConfigSpec.ConfigValue<String> CREATORNOTE1;
	public static final ForgeConfigSpec.ConfigValue<String> CREATORNOTE2;
	public static final ForgeConfigSpec.ConfigValue<Double> CRAZYDIAMONDSTRENGTH;
	public static final ForgeConfigSpec.ConfigValue<Double> CRAZYDIAMONDDURABILITY;
	public static final ForgeConfigSpec.ConfigValue<Double> CRAZYDIAMONDPRECISION;
	public static final ForgeConfigSpec.ConfigValue<Double> CRAZYDIAMONDPOTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<Double> THEHANDSTRENGTH;
	public static final ForgeConfigSpec.ConfigValue<Double> THEHANDDURABILITY;
	public static final ForgeConfigSpec.ConfigValue<Double> THEHANDPRECISION;
	public static final ForgeConfigSpec.ConfigValue<Double> THEHANDPOTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<Double> HEAVENSDOORSTRENGTH;
	public static final ForgeConfigSpec.ConfigValue<Double> HEAVENSDOORDURABILITY;
	public static final ForgeConfigSpec.ConfigValue<Double> HEAVENSDOORPRECISION;
	public static final ForgeConfigSpec.ConfigValue<Double> HEAVENSDOORPOTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<Double> ECHOES0STRENGTH;
	public static final ForgeConfigSpec.ConfigValue<Double> ECHOES0DURABILITY;
	public static final ForgeConfigSpec.ConfigValue<Double> ECHOES0PRECISION;
	public static final ForgeConfigSpec.ConfigValue<Double> ECHOES0POTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<Double> ECHOES1STRENGTH;
	public static final ForgeConfigSpec.ConfigValue<Double> ECHOES1DURABILITY;
	public static final ForgeConfigSpec.ConfigValue<Double> ECHOES1PRECISION;
	public static final ForgeConfigSpec.ConfigValue<Double> ECHOES1POTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<Double> ECHOES2STRENGTH;
	public static final ForgeConfigSpec.ConfigValue<Double> ECHOES2DURABILITY;
	public static final ForgeConfigSpec.ConfigValue<Double> ECHOES2PRECISION;
	public static final ForgeConfigSpec.ConfigValue<Double> ECHOES2POTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<Double> ECHOES3STRENGTHSTRENGTH;
	public static final ForgeConfigSpec.ConfigValue<Double> ECHOES3DURABILITY;
	public static final ForgeConfigSpec.ConfigValue<Double> ECHOES3PRECISION;
	public static final ForgeConfigSpec.ConfigValue<Double> ECHOES3POTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<Double> HARVESTSTRENGTH;
	public static final ForgeConfigSpec.ConfigValue<Double> HARVESTDURABILITY;
	public static final ForgeConfigSpec.ConfigValue<Double> HARVESTPRECISION;
	public static final ForgeConfigSpec.ConfigValue<Double> HARVESTPOTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<Double> LOVEDELUXESTRENGTH;
	public static final ForgeConfigSpec.ConfigValue<Double> LOVEDELUXEDURABILITY;
	public static final ForgeConfigSpec.ConfigValue<Double> LOVEDELUXEPRECISION;
	public static final ForgeConfigSpec.ConfigValue<Double> LOVEDELUXEPOTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<Double> CHILIPEPPERSSTRENGTH;
	public static final ForgeConfigSpec.ConfigValue<Double> CHILIPEPPERSDURABILITY;
	public static final ForgeConfigSpec.ConfigValue<Double> CHILIPEPPERSPRECISION;
	public static final ForgeConfigSpec.ConfigValue<Double> CHILIPEPPERSPOTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<Double> KILLERQUEENSTRENGTH;
	public static final ForgeConfigSpec.ConfigValue<Double> KILLERQUEENDURABILITY;
	public static final ForgeConfigSpec.ConfigValue<Double> KILLERQUEENPRECISION;
	public static final ForgeConfigSpec.ConfigValue<Double> KILLERQUEENPOTENTIAL;
	static {
		BUILDER.push("Creator's Note");
		CREATORNOTE1 = BUILDER.define("Stand Stats", "Values over 100 may have unintend effects on gameplay!");
		CREATORNOTE2 = BUILDER.define("Stand Abilities", "Ability 1 will always been automatically unlocked. Make sure the names are typed properly, refer to the move directory config.");
		BUILDER.pop();
		BUILDER.push("Crazy Diamond");
		CRAZYDIAMONDSTRENGTH = BUILDER.comment("Increases the Power of your Stand's Moves (Default: 100)").define("Strength", (double) 100);
		CRAZYDIAMONDDURABILITY = BUILDER.comment("Increases your Block, and Guard (Default: 80)").define("Durability", (double) 80);
		CRAZYDIAMONDPRECISION = BUILDER.comment("Increases the Effectiveness of your Stand's Moves (Default: 80)").define("Precision", (double) 80);
		CRAZYDIAMONDPOTENTIAL = BUILDER.comment("Allows your Stand to Acquire More Moves and EXP (Default: 60)").define("Potential", (double) 60);
		BUILDER.pop();
		BUILDER.push("The Hand");
		THEHANDSTRENGTH = BUILDER.comment("Increases the Power of your Stand's Moves (Default: 80)").define("Strength", (double) 80);
		THEHANDDURABILITY = BUILDER.comment("Increases your Block, and Guard (Default: 60)").define("Durability", (double) 60);
		THEHANDPRECISION = BUILDER.comment("Increases the Effectiveness of your Stand's Moves (Default: 60)").define("Precision", (double) 60);
		THEHANDPOTENTIAL = BUILDER.comment("Allows your Stand to Acquire More Moves and EXP (Default: 60)").define("Potential", (double) 60);
		BUILDER.pop();
		BUILDER.push("Heaven's Door");
		HEAVENSDOORSTRENGTH = BUILDER.comment("Increases the Power of your Stand's Moves (Default: 40)").define("Strength", (double) 40);
		HEAVENSDOORDURABILITY = BUILDER.comment("Increases your Block, and Guard (Default: 80)").define("Durability", (double) 80);
		HEAVENSDOORPRECISION = BUILDER.comment("Increases the Effectiveness of your Stand's Moves (Default: 60)").define("Precision", (double) 60);
		HEAVENSDOORPOTENTIAL = BUILDER.comment("Allows your Stand to Acquire More Moves and EXP (Default: 100)").define("Potential", (double) 100);
		BUILDER.pop();
		BUILDER.push("Echoes Act 0");
		ECHOES0STRENGTH = BUILDER.comment("Increases the Power of your Stand's Moves (Default: 20)").define("Strength", (double) 20);
		ECHOES0DURABILITY = BUILDER.comment("Increases your Block, and Guard (Default: 80)").define("Durability", (double) 80);
		ECHOES0PRECISION = BUILDER.comment("Increases the Effectiveness of your Stand's Moves (Default: 60)").define("Precision", (double) 60);
		ECHOES0POTENTIAL = BUILDER.comment("Allows your Stand to Acquire More Moves and EXP (Default: 100)").define("Potential", (double) 100);
		BUILDER.pop();
		BUILDER.push("Echoes Act 1");
		ECHOES1STRENGTH = BUILDER.comment("Increases the Power of your Stand's Moves (Default: 20)").define("Strength", (double) 20);
		ECHOES1DURABILITY = BUILDER.comment("Increases your Block, and Guard (Default: 80)").define("Durability", (double) 80);
		ECHOES1PRECISION = BUILDER.comment("Increases the Effectiveness of your Stand's Moves (Default: 60)").define("Precision", (double) 60);
		ECHOES1POTENTIAL = BUILDER.comment("Allows your Stand to Acquire More Moves and EXP (Default: 100)").define("Potential", (double) 100);
		BUILDER.pop();
		BUILDER.push("Echoes Act 2");
		ECHOES2STRENGTH = BUILDER.comment("Increases the Power of your Stand's Moves (Default: 60)").define("Strength", (double) 60);
		ECHOES2DURABILITY = BUILDER.comment("Increases your Block, and Guard (Default: 80)").define("Durability", (double) 80);
		ECHOES2PRECISION = BUILDER.comment("Increases the Effectiveness of your Stand's Moves (Default: 60)").define("Precision", (double) 60);
		ECHOES2POTENTIAL = BUILDER.comment("Allows your Stand to Acquire More Moves and EXP (Default: 100)").define("Potential", (double) 100);
		BUILDER.pop();
		BUILDER.push("Echoes Act 3");
		ECHOES3STRENGTHSTRENGTH = BUILDER.comment("Increases the Power of your Stand's Moves (Default: 80)").define("Strength", (double) 80);
		ECHOES3DURABILITY = BUILDER.comment("Increases your Block, and Guard (Default: 80)").define("Durability", (double) 80);
		ECHOES3PRECISION = BUILDER.comment("Increases the Effectiveness of your Stand's Moves (Default: 60)").define("Precision", (double) 60);
		ECHOES3POTENTIAL = BUILDER.comment("Allows your Stand to Acquire More Moves and EXP (Default: 100)").define("Potential", (double) 100);
		BUILDER.pop();
		BUILDER.push("Harvest");
		HARVESTSTRENGTH = BUILDER.comment("Increases the Power of your Stand's Moves (Default: 20)").define("Strength", (double) 20);
		HARVESTDURABILITY = BUILDER.comment("Increases your Block, and Guard (Default: 100)").define("Durability", (double) 100);
		HARVESTPRECISION = BUILDER.comment("Increases the Effectiveness of your Stand's Moves (Default: 20)").define("Precision", (double) 20);
		HARVESTPOTENTIAL = BUILDER.comment("Allows your Stand to Acquire More Moves and EXP (Default: 60)").define("Potential", (double) 60);
		BUILDER.pop();
		BUILDER.push("Love Deluxe");
		LOVEDELUXESTRENGTH = BUILDER.comment("Increases the Power of your Stand's Moves (Default: 80)").define("Strength", (double) 80);
		LOVEDELUXEDURABILITY = BUILDER.comment("Increases your Block, and Guard (Default: 100)").define("Durability", (double) 100);
		LOVEDELUXEPRECISION = BUILDER.comment("Increases the Effectiveness of your Stand's Moves (Default: 20)").define("Precision", (double) 20);
		LOVEDELUXEPOTENTIAL = BUILDER.comment("Allows your Stand to Acquire More Moves and EXP (Default: 80)").define("Potential", (double) 80);
		BUILDER.pop();
		BUILDER.push("Red Hot Chili Peppers");
		CHILIPEPPERSSTRENGTH = BUILDER.comment("Increases the Power of your Stand's Moves (Default: 100)").define("Strength", (double) 100);
		CHILIPEPPERSDURABILITY = BUILDER.comment("Increases your Block, and Guard (Default: 100)").define("Durability", (double) 100);
		CHILIPEPPERSPRECISION = BUILDER.comment("Increases the Effectiveness of your Stand's Moves (Default: 60)").define("Precision", (double) 60);
		CHILIPEPPERSPOTENTIAL = BUILDER.comment("Allows your Stand to Acquire More Moves and EXP (Default: 100)").define("Potential", (double) 100);
		BUILDER.pop();
		BUILDER.push("Killer Queen");
		KILLERQUEENSTRENGTH = BUILDER.comment("Increases the Power of your Stand's Moves (Default: 100)").define("Strength", (double) 100);
		KILLERQUEENDURABILITY = BUILDER.comment("Increases your Block, and Guard (Default: 80)").define("Durability", (double) 80);
		KILLERQUEENPRECISION = BUILDER.comment("Increases the Effectiveness of your Stand's Moves (Default: 80)").define("Precision", (double) 80);
		KILLERQUEENPOTENTIAL = BUILDER.comment("Allows your Stand to Acquire More Moves and EXP (Default: 100)").define("Potential", (double) 100);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}