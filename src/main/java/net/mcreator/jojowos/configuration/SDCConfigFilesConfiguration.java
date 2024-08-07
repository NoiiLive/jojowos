package net.mcreator.jojowos.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class SDCConfigFilesConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	public static final ForgeConfigSpec.ConfigValue<String> CREATORNOTE1;
	public static final ForgeConfigSpec.ConfigValue<String> CREATORNOTE2;
	public static final ForgeConfigSpec.ConfigValue<Double> STARPLATINUMSTRENGTH;
	public static final ForgeConfigSpec.ConfigValue<Double> STARPLATINUMDURABILITY;
	public static final ForgeConfigSpec.ConfigValue<Double> STARPLATINUMPRECISION;
	public static final ForgeConfigSpec.ConfigValue<Double> STARPLATINUMPOTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<String> STARPLATINUMABILITY1;
	public static final ForgeConfigSpec.ConfigValue<String> STARPLATINUMABILITY2;
	public static final ForgeConfigSpec.ConfigValue<String> STARPLATINUMABILITY3;
	public static final ForgeConfigSpec.ConfigValue<String> STARPLATINUMABILITY4;
	public static final ForgeConfigSpec.ConfigValue<String> STARPLATINUMABILITY5;
	public static final ForgeConfigSpec.ConfigValue<String> STARPLATINUMABILITY6;
	public static final ForgeConfigSpec.ConfigValue<String> STARPLATINUMABILITY7;
	public static final ForgeConfigSpec.ConfigValue<String> STARPLATINUMABILITY8;
	public static final ForgeConfigSpec.ConfigValue<String> STARPLATINUMABILITY9;
	public static final ForgeConfigSpec.ConfigValue<Double> MAGICIANSREDSTRENGTH;
	public static final ForgeConfigSpec.ConfigValue<Double> MAGICIANSREDDURABILITY;
	public static final ForgeConfigSpec.ConfigValue<Double> MAGICIANSREDPRECISION;
	public static final ForgeConfigSpec.ConfigValue<Double> MAGICIANSREDPOTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<String> MAGICIANSREDABILITY1;
	public static final ForgeConfigSpec.ConfigValue<String> MAGICIANSREDABILITY2;
	public static final ForgeConfigSpec.ConfigValue<String> MAGICIANSREDABILITY3;
	public static final ForgeConfigSpec.ConfigValue<String> MAGICIANSREDABILITY4;
	public static final ForgeConfigSpec.ConfigValue<String> MAGICIANSREDABILITY5;
	public static final ForgeConfigSpec.ConfigValue<String> MAGICIANSREDABILITY6;
	public static final ForgeConfigSpec.ConfigValue<String> MAGICIANSREDABILITY7;
	public static final ForgeConfigSpec.ConfigValue<String> MAGICIANSREDABILITY8;
	public static final ForgeConfigSpec.ConfigValue<String> MAGICIANSREDABILITY9;
	public static final ForgeConfigSpec.ConfigValue<Double> HIEROPHANTGREENSTRENGTH;
	public static final ForgeConfigSpec.ConfigValue<Double> HIEROPHANTGREENDURABILITY;
	public static final ForgeConfigSpec.ConfigValue<Double> HIEROPHANTGREENPRECISION;
	public static final ForgeConfigSpec.ConfigValue<Double> HIEROPHANTGREENPOTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<String> HIEROPHANTGREENABILITY1;
	public static final ForgeConfigSpec.ConfigValue<String> HIEROPHANTGREENABILITY2;
	public static final ForgeConfigSpec.ConfigValue<String> HIEROPHANTGREENABILITY3;
	public static final ForgeConfigSpec.ConfigValue<String> HIEROPHANTGREENABILITY4;
	public static final ForgeConfigSpec.ConfigValue<String> HIEROPHANTGREENABILITY5;
	public static final ForgeConfigSpec.ConfigValue<String> HIEROPHANTGREENABILITY6;
	public static final ForgeConfigSpec.ConfigValue<String> HIEROPHANTGREENABILITY7;
	public static final ForgeConfigSpec.ConfigValue<String> HIEROPHANTGREENABILITY8;
	public static final ForgeConfigSpec.ConfigValue<String> HIEROPHANTGREENABILITY9;
	public static final ForgeConfigSpec.ConfigValue<Double> SILVERCHARIOTSTRENGTH;
	public static final ForgeConfigSpec.ConfigValue<Double> SILVERCHARIOTDURABILITY;
	public static final ForgeConfigSpec.ConfigValue<Double> SILVERCHARIOTPRECISION;
	public static final ForgeConfigSpec.ConfigValue<Double> SILVERCHARIOTPOTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<String> SILVERCHARIOTABILITY1;
	public static final ForgeConfigSpec.ConfigValue<String> SILVERCHARIOTABILITY2;
	public static final ForgeConfigSpec.ConfigValue<String> SILVERCHARIOTABILITY3;
	public static final ForgeConfigSpec.ConfigValue<String> SILVERCHARIOTABILITY4;
	public static final ForgeConfigSpec.ConfigValue<String> SILVERCHARIOTABILITY5;
	public static final ForgeConfigSpec.ConfigValue<String> SILVERCHARIOTABILITY6;
	public static final ForgeConfigSpec.ConfigValue<String> SILVERCHARIOTABILITY7;
	public static final ForgeConfigSpec.ConfigValue<String> SILVERCHARIOTABILITY8;
	public static final ForgeConfigSpec.ConfigValue<String> SILVERCHARIOTABILITY9;
	public static final ForgeConfigSpec.ConfigValue<Double> HERMITPURPLESTRENGTH;
	public static final ForgeConfigSpec.ConfigValue<Double> HERMITPURPLEDURABILITY;
	public static final ForgeConfigSpec.ConfigValue<Double> HERMITPURPLEPRECISION;
	public static final ForgeConfigSpec.ConfigValue<Double> HERMITPURPLEPOTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<Double> THEFOOLSTRENGTH;
	public static final ForgeConfigSpec.ConfigValue<Double> THEFOOLDURABILITY;
	public static final ForgeConfigSpec.ConfigValue<Double> THEFOOLPRECISION;
	public static final ForgeConfigSpec.ConfigValue<Double> THEFOOLPOTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<String> THEFOOLABILITY1;
	public static final ForgeConfigSpec.ConfigValue<String> THEFOOLABILITY2;
	public static final ForgeConfigSpec.ConfigValue<String> THEFOOLABILITY3;
	public static final ForgeConfigSpec.ConfigValue<String> THEFOOLABILITY4;
	public static final ForgeConfigSpec.ConfigValue<String> THEFOOLABILITY5;
	public static final ForgeConfigSpec.ConfigValue<String> THEFOOLABILITY6;
	public static final ForgeConfigSpec.ConfigValue<String> THEFOOLABILITY7;
	public static final ForgeConfigSpec.ConfigValue<String> THEFOOLABILITY8;
	public static final ForgeConfigSpec.ConfigValue<String> THEFOOLABILITY9;
	public static final ForgeConfigSpec.ConfigValue<Double> THEWORLDSTRENGTH;
	public static final ForgeConfigSpec.ConfigValue<Double> THEWORLDDURABILITY;
	public static final ForgeConfigSpec.ConfigValue<Double> THEWORLDPRECISION;
	public static final ForgeConfigSpec.ConfigValue<Double> THEWORLDPOTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<String> THEWORLDABILITY1;
	public static final ForgeConfigSpec.ConfigValue<String> THEWORLDABILITY2;
	public static final ForgeConfigSpec.ConfigValue<String> THEWORLDABILITY3;
	public static final ForgeConfigSpec.ConfigValue<String> THEWORLDABILITY4;
	public static final ForgeConfigSpec.ConfigValue<String> THEWORLDABILITY5;
	public static final ForgeConfigSpec.ConfigValue<String> THEWORLDABILITY6;
	public static final ForgeConfigSpec.ConfigValue<String> THEWORLDABILITY7;
	public static final ForgeConfigSpec.ConfigValue<String> THEWORLDABILITY8;
	public static final ForgeConfigSpec.ConfigValue<String> THEWORLDABILITY9;
	static {
		BUILDER.push("Creator's Note");
		CREATORNOTE1 = BUILDER.define("Stand Stats", "Values over 100 may have unintend effects on gameplay.");
		CREATORNOTE2 = BUILDER.define("Stand Abilities", "Ability 1 will always been automatically unlocked. Make sure the names are typed properly, refer to the move directory config.");
		BUILDER.pop();
		BUILDER.push("Star Platinum");
		STARPLATINUMSTRENGTH = BUILDER.comment("Increases the Power of your Stand's Moves (Default: 100)").define("Strength", (double) 100);
		STARPLATINUMDURABILITY = BUILDER.comment("Increases your Health, and Decreases Damage Taken (Default: 100)").define("Durability", (double) 100);
		STARPLATINUMPRECISION = BUILDER.comment("Increases the Effectiveness of your Stand's Moves (Default: 100)").define("Precision", (double) 100);
		STARPLATINUMPOTENTIAL = BUILDER.comment("Allows your Stand to Acquire More Moves and EXP (Default: 100)").define("Potential", (double) 100);
		STARPLATINUMABILITY1 = BUILDER.define("Ability 1", "Fist Barrage");
		STARPLATINUMABILITY2 = BUILDER.define("Ability 2", "Zoom");
		STARPLATINUMABILITY3 = BUILDER.define("Ability 3", "Inhale");
		STARPLATINUMABILITY4 = BUILDER.define("Ability 4", "Bearing Shot");
		STARPLATINUMABILITY5 = BUILDER.define("Ability 5", "Star Finger");
		STARPLATINUMABILITY6 = BUILDER.define("Ability 6", "Time Skip");
		STARPLATINUMABILITY7 = BUILDER.define("Ability 7", "Short Timestop");
		STARPLATINUMABILITY8 = BUILDER.define("Ability 8", "");
		STARPLATINUMABILITY9 = BUILDER.define("Ability 9", "");
		BUILDER.pop();
		BUILDER.push("Magician's Red");
		MAGICIANSREDSTRENGTH = BUILDER.comment("Increases the Power of your Stand's Moves (Default: 80)").define("Strength", (double) 80);
		MAGICIANSREDDURABILITY = BUILDER.comment("Increases your Health, and Decreases Damage Taken (Default: 80)").define("Durability", (double) 80);
		MAGICIANSREDPRECISION = BUILDER.comment("Increases the Effectiveness of your Stand's Moves (Default: 60)").define("Precision", (double) 60);
		MAGICIANSREDPOTENTIAL = BUILDER.comment("Allows your Stand to Acquire More Moves and EXP (Default: 40)").define("Potential", (double) 40);
		MAGICIANSREDABILITY1 = BUILDER.define("Ability 1", "Crossfire Hurricane");
		MAGICIANSREDABILITY2 = BUILDER.define("Ability 2", "Life Detector");
		MAGICIANSREDABILITY3 = BUILDER.define("Ability 3", "Red Bind");
		MAGICIANSREDABILITY4 = BUILDER.define("Ability 4", "Crossfire: Special");
		MAGICIANSREDABILITY5 = BUILDER.define("Ability 5", "");
		MAGICIANSREDABILITY6 = BUILDER.define("Ability 6", "");
		MAGICIANSREDABILITY7 = BUILDER.define("Ability 7", "");
		MAGICIANSREDABILITY8 = BUILDER.define("Ability 8", "");
		MAGICIANSREDABILITY9 = BUILDER.define("Ability 9", "");
		BUILDER.pop();
		BUILDER.push("Hierophant Green");
		HIEROPHANTGREENSTRENGTH = BUILDER.comment("Increases the Power of your Stand's Moves (Default: 60)").define("Strength", (double) 60);
		HIEROPHANTGREENDURABILITY = BUILDER.comment("Increases your Health, and Decreases Damage Taken (Default: 80)").define("Durability", (double) 80);
		HIEROPHANTGREENPRECISION = BUILDER.comment("Increases the Effectiveness of your Stand's Moves (Default: 60)").define("Precision", (double) 60);
		HIEROPHANTGREENPOTENTIAL = BUILDER.comment("Allows your Stand to Acquire More Moves and EXP (Default: 40)").define("Potential", (double) 40);
		HIEROPHANTGREENABILITY1 = BUILDER.define("Ability 1", "Emerald Splash");
		HIEROPHANTGREENABILITY2 = BUILDER.define("Ability 2", "Grapple");
		HIEROPHANTGREENABILITY3 = BUILDER.define("Ability 3", "Emerald Barrier");
		HIEROPHANTGREENABILITY4 = BUILDER.define("Ability 4", "Body Control");
		HIEROPHANTGREENABILITY5 = BUILDER.define("Ability 5", "");
		HIEROPHANTGREENABILITY6 = BUILDER.define("Ability 6", "");
		HIEROPHANTGREENABILITY7 = BUILDER.define("Ability 7", "");
		HIEROPHANTGREENABILITY8 = BUILDER.define("Ability 8", "");
		HIEROPHANTGREENABILITY9 = BUILDER.define("Ability 9", "");
		BUILDER.pop();
		BUILDER.push("Silver Chariot");
		SILVERCHARIOTSTRENGTH = BUILDER.comment("Increases the Power of your Stand's Moves (Default: 60)").define("Strength", (double) 60);
		SILVERCHARIOTDURABILITY = BUILDER.comment("Increases your Health, and Decreases Damage Taken (Default: 80)").define("Durability", (double) 80);
		SILVERCHARIOTPRECISION = BUILDER.comment("Increases the Effectiveness of your Stand's Moves (Default: 80)").define("Precision", (double) 80);
		SILVERCHARIOTPOTENTIAL = BUILDER.comment("Allows your Stand to Acquire More Moves and EXP (Default: 60)").define("Potential", (double) 60);
		SILVERCHARIOTABILITY1 = BUILDER.define("Ability 1", "Sword Barrage");
		SILVERCHARIOTABILITY2 = BUILDER.define("Ability 2", "Sword Launch");
		SILVERCHARIOTABILITY3 = BUILDER.define("Ability 3", "Blade Cyclone");
		SILVERCHARIOTABILITY4 = BUILDER.define("Ability 4", "Armor Off");
		SILVERCHARIOTABILITY5 = BUILDER.define("Ability 5", "");
		SILVERCHARIOTABILITY6 = BUILDER.define("Ability 6", "");
		SILVERCHARIOTABILITY7 = BUILDER.define("Ability 7", "");
		SILVERCHARIOTABILITY8 = BUILDER.define("Ability 8", "");
		SILVERCHARIOTABILITY9 = BUILDER.define("Ability 9", "");
		BUILDER.pop();
		BUILDER.push("Hermit Purple");
		HERMITPURPLESTRENGTH = BUILDER.comment("Increases the Power of your Stand's Moves (Default: 40)").define("Strength", (double) 40);
		HERMITPURPLEDURABILITY = BUILDER.comment("Increases your Health, and Decreases Damage Taken (Default: 100)").define("Durability", (double) 100);
		HERMITPURPLEPRECISION = BUILDER.comment("Increases the Effectiveness of your Stand's Moves (Default: 40)").define("Precision", (double) 40);
		HERMITPURPLEPOTENTIAL = BUILDER.comment("Allows your Stand to Acquire More Moves and EXP (Default: 20)").define("Potential", (double) 20);
		BUILDER.pop();
		BUILDER.push("The Fool");
		THEFOOLSTRENGTH = BUILDER.comment("Increases the Power of your Stand's Moves (Default: 80)").define("Strength", (double) 80);
		THEFOOLDURABILITY = BUILDER.comment("Increases your Health, and Decreases Damage Taken (Default: 60)").define("Durability", (double) 60);
		THEFOOLPRECISION = BUILDER.comment("Increases the Effectiveness of your Stand's Moves (Default: 40)").define("Precision", (double) 40);
		THEFOOLPOTENTIAL = BUILDER.comment("Allows your Stand to Acquire More Moves and EXP (Default: 60)").define("Potential", (double) 60);
		THEFOOLABILITY1 = BUILDER.define("Ability 1", "Quicksand");
		THEFOOLABILITY2 = BUILDER.define("Ability 2", "Sand Glider");
		THEFOOLABILITY3 = BUILDER.define("Ability 3", "Sand Dome");
		THEFOOLABILITY4 = BUILDER.define("Ability 4", "");
		THEFOOLABILITY5 = BUILDER.define("Ability 5", "");
		THEFOOLABILITY6 = BUILDER.define("Ability 6", "");
		THEFOOLABILITY7 = BUILDER.define("Ability 7", "");
		THEFOOLABILITY8 = BUILDER.define("Ability 8", "");
		THEFOOLABILITY9 = BUILDER.define("Ability 9", "");
		BUILDER.pop();
		BUILDER.push("The World");
		THEWORLDSTRENGTH = BUILDER.comment("Increases the Power of your Stand's Moves (Default: 100)").define("Strength", (double) 100);
		THEWORLDDURABILITY = BUILDER.comment("Increases your Health, and Decreases Damage Taken (Default: 100)").define("Durability", (double) 100);
		THEWORLDPRECISION = BUILDER.comment("Increases the Effectiveness of your Stand's Moves (Default: 80)").define("Precision", (double) 80);
		THEWORLDPOTENTIAL = BUILDER.comment("Allows your Stand to Acquire More Moves and EXP (Default: 80)").define("Potential", (double) 80);
		THEWORLDABILITY1 = BUILDER.define("Ability 1", "Fist Barrage");
		THEWORLDABILITY2 = BUILDER.define("Ability 2", "Knife Throw");
		THEWORLDABILITY3 = BUILDER.define("Ability 3", "Kick Barrage");
		THEWORLDABILITY4 = BUILDER.define("Ability 4", "Time Skip");
		THEWORLDABILITY5 = BUILDER.define("Ability 5", "Time Stop");
		THEWORLDABILITY6 = BUILDER.define("Ability 6", "Timestop Counter");
		THEWORLDABILITY7 = BUILDER.define("Ability 7", "Road Roller");
		THEWORLDABILITY8 = BUILDER.define("Ability 8", "");
		THEWORLDABILITY9 = BUILDER.define("Ability 9", "");
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
