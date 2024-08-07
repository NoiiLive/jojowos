package net.mcreator.jojowos.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class MoveDirectoryConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	public static final ForgeConfigSpec.ConfigValue<String> CREATORNOTE1;
	public static final ForgeConfigSpec.ConfigValue<String> CREATORNOTE3;
	public static final ForgeConfigSpec.ConfigValue<String> CREATORNOTE2;
	public static final ForgeConfigSpec.ConfigValue<Double> FISTBARRAGECOST;
	public static final ForgeConfigSpec.ConfigValue<Double> FISTBARRAGEPOTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<Double> FISTBARRAGECDMAX;
	public static final ForgeConfigSpec.ConfigValue<Double> FISTBARRAGECDMIN;
	public static final ForgeConfigSpec.ConfigValue<Double> KICKBARRAGECOST;
	public static final ForgeConfigSpec.ConfigValue<Double> KICKBARRAGEPOTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<Double> KICKBARRAGECDMAX;
	public static final ForgeConfigSpec.ConfigValue<Double> KICKBARRAGECDMIN;
	public static final ForgeConfigSpec.ConfigValue<Double> BEARINGSHOTCOST;
	public static final ForgeConfigSpec.ConfigValue<Double> BEARINGSHOTPOTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<Double> BEARINGSHOTCDMAX;
	public static final ForgeConfigSpec.ConfigValue<Double> BEARINGSHOTCDMIN;
	public static final ForgeConfigSpec.ConfigValue<Double> INHALECOST;
	public static final ForgeConfigSpec.ConfigValue<Double> INHALEPOTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<Double> INHALECDMAX;
	public static final ForgeConfigSpec.ConfigValue<Double> INHALECDMIN;
	public static final ForgeConfigSpec.ConfigValue<Double> STARFINGERCOST;
	public static final ForgeConfigSpec.ConfigValue<Double> STARFINGERPOTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<Double> STARFINGERCDMAX;
	public static final ForgeConfigSpec.ConfigValue<Double> STARFINGERCDMIN;
	public static final ForgeConfigSpec.ConfigValue<Double> TIMESKIPCOST;
	public static final ForgeConfigSpec.ConfigValue<Double> TIMESKIPPOTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<Double> TIMESKIPCDMAX;
	public static final ForgeConfigSpec.ConfigValue<Double> TIMESKIPCDMIN;
	public static final ForgeConfigSpec.ConfigValue<Double> SHORTTIMESTOPCOST;
	public static final ForgeConfigSpec.ConfigValue<Double> SHORTTIMESTOPPOTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<Double> SHORTTIMESTOPCDMAX;
	public static final ForgeConfigSpec.ConfigValue<Double> SHORTTIMESTOPCDMIN;
	public static final ForgeConfigSpec.ConfigValue<Double> TIMESTOPCOST;
	public static final ForgeConfigSpec.ConfigValue<Double> TIMESTOPPOTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<Double> TIMESTOPCDMAX;
	public static final ForgeConfigSpec.ConfigValue<Double> TIMESTOPCDMIN;
	public static final ForgeConfigSpec.ConfigValue<Double> KNIFETHROWCOST;
	public static final ForgeConfigSpec.ConfigValue<Double> KNIFETHROWPOTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<Double> KNIFETHROWCDMAX;
	public static final ForgeConfigSpec.ConfigValue<Double> KNIFETHROWCDMIN;
	public static final ForgeConfigSpec.ConfigValue<Double> ROADROLLERCOST;
	public static final ForgeConfigSpec.ConfigValue<Double> ROADROLLERPOTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<Double> ROADROLLERCDMAX;
	public static final ForgeConfigSpec.ConfigValue<Double> ROADROLLERCDMIN;
	public static final ForgeConfigSpec.ConfigValue<Double> CROSSFIREHURRICANECOST;
	public static final ForgeConfigSpec.ConfigValue<Double> CROSSFIREHURRICANEPOTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<Double> CROSSFIREHURRICANECDMAX;
	public static final ForgeConfigSpec.ConfigValue<Double> CROSSFIREHURRICANECDMIN;
	public static final ForgeConfigSpec.ConfigValue<Double> CROSSFIRESPECIALCOST;
	public static final ForgeConfigSpec.ConfigValue<Double> CROSSFIRESPECIALPOTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<Double> CROSSFIRESPECIALCDMAX;
	public static final ForgeConfigSpec.ConfigValue<Double> CROSSFIRESPECIALCDMIN;
	public static final ForgeConfigSpec.ConfigValue<Double> REDBINDCOST;
	public static final ForgeConfigSpec.ConfigValue<Double> REDBINDPOTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<Double> REDBINDCDMAX;
	public static final ForgeConfigSpec.ConfigValue<Double> REDBINDCDMIN;
	public static final ForgeConfigSpec.ConfigValue<Double> LIFEDETECTORCOST;
	public static final ForgeConfigSpec.ConfigValue<Double> LIFEDETECTORPOTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<Double> LIFEDETECTORCDMAX;
	public static final ForgeConfigSpec.ConfigValue<Double> LIFEDETECTORCDMIN;
	public static final ForgeConfigSpec.ConfigValue<Double> TANGLECOST;
	public static final ForgeConfigSpec.ConfigValue<Double> TANGLEPOTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<Double> TANGLECDMAX;
	public static final ForgeConfigSpec.ConfigValue<Double> TANGLECDMIN;
	public static final ForgeConfigSpec.ConfigValue<Double> GRAPPLECOST;
	public static final ForgeConfigSpec.ConfigValue<Double> GRAPPLEPOTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<Double> GRAPPLECDMAX;
	public static final ForgeConfigSpec.ConfigValue<Double> GRAPPLECDMIN;
	public static final ForgeConfigSpec.ConfigValue<Double> EMERALDSPLASHCOST;
	public static final ForgeConfigSpec.ConfigValue<Double> EMERALDSPLASHPOTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<Double> EMERALDSPLASHCDMAX;
	public static final ForgeConfigSpec.ConfigValue<Double> EMERALDSPLASHCDMIN;
	public static final ForgeConfigSpec.ConfigValue<Double> EMERALDBARRIERCOST;
	public static final ForgeConfigSpec.ConfigValue<Double> EMERALDBARRIERPOTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<Double> EMERALDBARRIERCDMAX;
	public static final ForgeConfigSpec.ConfigValue<Double> EMERALDBARRIERCDMIN;
	public static final ForgeConfigSpec.ConfigValue<Double> BODYCONTROLCOST;
	public static final ForgeConfigSpec.ConfigValue<Double> BODYCONTROLPOTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<Double> BODYCONTROLCDMAX;
	public static final ForgeConfigSpec.ConfigValue<Double> BODYCONTROLCDMIN;
	public static final ForgeConfigSpec.ConfigValue<Double> SWORDLAUNCHCOST;
	public static final ForgeConfigSpec.ConfigValue<Double> SWORDLAUNCHPOTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<Double> SWORDLAUNCHCDMAX;
	public static final ForgeConfigSpec.ConfigValue<Double> SWORDLAUNCHCDMIN;
	public static final ForgeConfigSpec.ConfigValue<Double> BLADECYCLONECOST;
	public static final ForgeConfigSpec.ConfigValue<Double> BLADECYCLONEPOTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<Double> BLADECYCLONECDMAX;
	public static final ForgeConfigSpec.ConfigValue<Double> BLADECYCLONECDMIN;
	public static final ForgeConfigSpec.ConfigValue<Double> ARMOROFFCOST;
	public static final ForgeConfigSpec.ConfigValue<Double> ARMOROFFPOTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<Double> ARMOROFFCDMAX;
	public static final ForgeConfigSpec.ConfigValue<Double> ARMOROFFCDMIN;
	public static final ForgeConfigSpec.ConfigValue<Double> QUICKSANDCOST;
	public static final ForgeConfigSpec.ConfigValue<Double> QUICKSANDPOTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<Double> QUICKSANDCDMAX;
	public static final ForgeConfigSpec.ConfigValue<Double> QUICKSANDCDMIN;
	public static final ForgeConfigSpec.ConfigValue<Double> SANDDOMECOST;
	public static final ForgeConfigSpec.ConfigValue<Double> SANDDOMEPOTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<Double> SANDDOMECDMAX;
	public static final ForgeConfigSpec.ConfigValue<Double> SANDDOMECDMIN;
	public static final ForgeConfigSpec.ConfigValue<Double> SANDGLIDERCOST;
	public static final ForgeConfigSpec.ConfigValue<Double> SANDGLIDERPOTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<Double> SANDGLIDERCDMAX;
	public static final ForgeConfigSpec.ConfigValue<Double> SANDGLIDERCDMIN;
	public static final ForgeConfigSpec.ConfigValue<Double> SWORDBARRAGECOST;
	public static final ForgeConfigSpec.ConfigValue<Double> SWORDBARRAGEPOTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<Double> SWORDBARRAGECDMAX;
	public static final ForgeConfigSpec.ConfigValue<Double> SWORDBARRAGECDMIN;
	public static final ForgeConfigSpec.ConfigValue<Double> DIVINATIONCOST;
	public static final ForgeConfigSpec.ConfigValue<Double> DIVINATIONPOTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<Double> ZOOMCOST;
	public static final ForgeConfigSpec.ConfigValue<Double> ZOOMPOTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<Double> TIMESTOPCOUNTERCOST;
	public static final ForgeConfigSpec.ConfigValue<Double> TIMESTOPCOUNTERPOTENTIAL;
	public static final ForgeConfigSpec.ConfigValue<Double> TIMESTOPCOUNTERCDMAX;
	public static final ForgeConfigSpec.ConfigValue<Double> TIMESTOPCOUNTERCDMIN;
	static {
		BUILDER.push("Creator's Note");
		CREATORNOTE1 = BUILDER.define("Stand Costs", "The cost of the skill in the skill tree");
		CREATORNOTE3 = BUILDER.define("Stand Potential", "The amount of potential stat needed to unlock the move");
		CREATORNOTE2 = BUILDER.define("Stand Cooldowns", "Cooldowns are in ticks, (Seconds * 20 = ticks)");
		BUILDER.pop();
		BUILDER.push("Fist Barrage");
		FISTBARRAGECOST = BUILDER.define("Cost", (double) 1);
		FISTBARRAGEPOTENTIAL = BUILDER.define("Potential", (double) 5);
		FISTBARRAGECDMAX = BUILDER.define("Cooldown Max", (double) 400);
		FISTBARRAGECDMIN = BUILDER.define("Cooldown Min", (double) 150);
		BUILDER.pop();
		BUILDER.push("Kick Barrage");
		KICKBARRAGECOST = BUILDER.define("Cost", (double) 5);
		KICKBARRAGEPOTENTIAL = BUILDER.define("Potential", (double) 30);
		KICKBARRAGECDMAX = BUILDER.define("Cooldown Max", (double) 400);
		KICKBARRAGECDMIN = BUILDER.define("Cooldown Min", (double) 150);
		BUILDER.pop();
		BUILDER.push("Bearing Shot");
		BEARINGSHOTCOST = BUILDER.define("Cost", (double) 5);
		BEARINGSHOTPOTENTIAL = BUILDER.define("Potential", (double) 35);
		BEARINGSHOTCDMAX = BUILDER.define("Cooldown Max", (double) 200);
		BEARINGSHOTCDMIN = BUILDER.define("Cooldown Min", (double) 100);
		BUILDER.pop();
		BUILDER.push("Inhale");
		INHALECOST = BUILDER.define("Cost", (double) 3);
		INHALEPOTENTIAL = BUILDER.define("Potential", (double) 20);
		INHALECDMAX = BUILDER.define("Cooldown Max", (double) 400);
		INHALECDMIN = BUILDER.define("Cooldown Min", (double) 150);
		BUILDER.pop();
		BUILDER.push("Star Finger");
		STARFINGERCOST = BUILDER.define("Cost", (double) 5);
		STARFINGERPOTENTIAL = BUILDER.define("Potential", (double) 50);
		STARFINGERCDMAX = BUILDER.define("Cooldown Max", (double) 400);
		STARFINGERCDMIN = BUILDER.define("Cooldown Min", (double) 150);
		BUILDER.pop();
		BUILDER.push("Time Skip");
		TIMESKIPCOST = BUILDER.define("Cost", (double) 5);
		TIMESKIPPOTENTIAL = BUILDER.define("Potential", (double) 60);
		TIMESKIPCDMAX = BUILDER.define("Cooldown Max", (double) 500);
		TIMESKIPCDMIN = BUILDER.define("Cooldown Min", (double) 200);
		BUILDER.pop();
		BUILDER.push("Short Timestop");
		SHORTTIMESTOPCOST = BUILDER.define("Cost", (double) 10);
		SHORTTIMESTOPPOTENTIAL = BUILDER.define("Potential", (double) 80);
		SHORTTIMESTOPCDMAX = BUILDER.define("Cooldown Max", (double) 2400);
		SHORTTIMESTOPCDMIN = BUILDER.define("Cooldown Min", (double) 1000);
		BUILDER.pop();
		BUILDER.push("Time Stop");
		TIMESTOPCOST = BUILDER.define("Cost", (double) 10);
		TIMESTOPPOTENTIAL = BUILDER.define("Potential", (double) 70);
		TIMESTOPCDMAX = BUILDER.define("Cooldown Max", (double) 2400);
		TIMESTOPCDMIN = BUILDER.define("Cooldown Min", (double) 1200);
		BUILDER.pop();
		BUILDER.push("Knife Throw");
		KNIFETHROWCOST = BUILDER.define("Cost", (double) 3);
		KNIFETHROWPOTENTIAL = BUILDER.define("Potential", (double) 10);
		KNIFETHROWCDMAX = BUILDER.define("Cooldown Max", (double) 250);
		KNIFETHROWCDMIN = BUILDER.define("Cooldown Min", (double) 100);
		BUILDER.pop();
		BUILDER.push("Road Roller");
		ROADROLLERCOST = BUILDER.define("Cost", (double) 10);
		ROADROLLERPOTENTIAL = BUILDER.define("Potential", (double) 80);
		ROADROLLERCDMAX = BUILDER.define("Cooldown Max", (double) 200);
		ROADROLLERCDMIN = BUILDER.define("Cooldown Min", (double) 200);
		BUILDER.pop();
		BUILDER.push("Crossfire Hurricane");
		CROSSFIREHURRICANECOST = BUILDER.define("Cost", (double) 1);
		CROSSFIREHURRICANEPOTENTIAL = BUILDER.define("Potential", (double) 5);
		CROSSFIREHURRICANECDMAX = BUILDER.define("Cooldown Max", (double) 450);
		CROSSFIREHURRICANECDMIN = BUILDER.define("Cooldown Min", (double) 300);
		BUILDER.pop();
		BUILDER.push("Crossfire: Special");
		CROSSFIRESPECIALCOST = BUILDER.define("Cost", (double) 5);
		CROSSFIRESPECIALPOTENTIAL = BUILDER.define("Potential", (double) 40);
		CROSSFIRESPECIALCDMAX = BUILDER.define("Cooldown Max", (double) 350);
		CROSSFIRESPECIALCDMIN = BUILDER.define("Cooldown Min", (double) 250);
		BUILDER.pop();
		BUILDER.push("Red Bind");
		REDBINDCOST = BUILDER.define("Cost", (double) 3);
		REDBINDPOTENTIAL = BUILDER.define("Potential", (double) 25);
		REDBINDCDMAX = BUILDER.define("Cooldown Max", (double) 400);
		REDBINDCDMIN = BUILDER.define("Cooldown Min", (double) 300);
		BUILDER.pop();
		BUILDER.push("Life Detector");
		LIFEDETECTORCOST = BUILDER.define("Cost", (double) 3);
		LIFEDETECTORPOTENTIAL = BUILDER.define("Potential", (double) 10);
		LIFEDETECTORCDMAX = BUILDER.define("Cooldown Max", (double) 600);
		LIFEDETECTORCDMIN = BUILDER.define("Cooldown Min", (double) 400);
		BUILDER.pop();
		BUILDER.push("Tangle");
		TANGLECOST = BUILDER.define("Cost", (double) 5);
		TANGLEPOTENTIAL = BUILDER.define("Potential", (double) 20);
		TANGLECDMAX = BUILDER.define("Cooldown Max", (double) 400);
		TANGLECDMIN = BUILDER.define("Cooldown Min", (double) 400);
		BUILDER.pop();
		BUILDER.push("Grapple");
		GRAPPLECOST = BUILDER.define("Cost", (double) 3);
		GRAPPLEPOTENTIAL = BUILDER.define("Potential", (double) 10);
		GRAPPLECDMAX = BUILDER.define("Cooldown Max", (double) 80);
		GRAPPLECDMIN = BUILDER.define("Cooldown Min", (double) 40);
		BUILDER.pop();
		BUILDER.push("Emerald Splash");
		EMERALDSPLASHCOST = BUILDER.define("Cost", (double) 1);
		EMERALDSPLASHPOTENTIAL = BUILDER.define("Potential", (double) 5);
		EMERALDSPLASHCDMAX = BUILDER.define("Cooldown Max", (double) 300);
		EMERALDSPLASHCDMIN = BUILDER.define("Cooldown Min", (double) 200);
		BUILDER.pop();
		BUILDER.push("Emerald Barrier");
		EMERALDBARRIERCOST = BUILDER.define("Cost", (double) 3);
		EMERALDBARRIERPOTENTIAL = BUILDER.define("Potential", (double) 30);
		EMERALDBARRIERCDMAX = BUILDER.define("Cooldown Max", (double) 1200);
		EMERALDBARRIERCDMIN = BUILDER.define("Cooldown Min", (double) 1200);
		BUILDER.pop();
		BUILDER.push("Body Control");
		BODYCONTROLCOST = BUILDER.define("Cost", (double) 5);
		BODYCONTROLPOTENTIAL = BUILDER.define("Potential", (double) 40);
		BODYCONTROLCDMAX = BUILDER.define("Cooldown Max", (double) 2000);
		BODYCONTROLCDMIN = BUILDER.define("Cooldown Min", (double) 1500);
		BUILDER.pop();
		BUILDER.push("Sword Launch");
		SWORDLAUNCHCOST = BUILDER.define("Cost", (double) 3);
		SWORDLAUNCHPOTENTIAL = BUILDER.define("Potential", (double) 10);
		SWORDLAUNCHCDMAX = BUILDER.define("Cooldown Max", (double) 200);
		SWORDLAUNCHCDMIN = BUILDER.define("Cooldown Min", (double) 100);
		BUILDER.pop();
		BUILDER.push("Blade Cyclone");
		BLADECYCLONECOST = BUILDER.define("Cost", (double) 3);
		BLADECYCLONEPOTENTIAL = BUILDER.define("Potential", (double) 30);
		BLADECYCLONECDMAX = BUILDER.define("Cooldown Max", (double) 400);
		BLADECYCLONECDMIN = BUILDER.define("Cooldown Min", (double) 200);
		BUILDER.pop();
		BUILDER.push("Armor Off");
		ARMOROFFCOST = BUILDER.define("Cost", (double) 5);
		ARMOROFFPOTENTIAL = BUILDER.define("Potential", (double) 50);
		ARMOROFFCDMAX = BUILDER.define("Cooldown Max", (double) 2400);
		ARMOROFFCDMIN = BUILDER.define("Cooldown Min", (double) 1400);
		BUILDER.pop();
		BUILDER.push("Quicksand");
		QUICKSANDCOST = BUILDER.define("Cost", (double) 1);
		QUICKSANDPOTENTIAL = BUILDER.define("Potential", (double) 5);
		QUICKSANDCDMAX = BUILDER.define("Cooldown Max", (double) 300);
		QUICKSANDCDMIN = BUILDER.define("Cooldown Min", (double) 200);
		BUILDER.pop();
		BUILDER.push("Sand Dome");
		SANDDOMECOST = BUILDER.define("Cost", (double) 3);
		SANDDOMEPOTENTIAL = BUILDER.define("Potential", (double) 30);
		SANDDOMECDMAX = BUILDER.define("Cooldown Max", (double) 450);
		SANDDOMECDMIN = BUILDER.define("Cooldown Min", (double) 350);
		BUILDER.pop();
		BUILDER.push("Sand Glider");
		SANDGLIDERCOST = BUILDER.define("Cost", (double) 3);
		SANDGLIDERPOTENTIAL = BUILDER.define("Potential", (double) 10);
		SANDGLIDERCDMAX = BUILDER.define("Cooldown Max", (double) 400);
		SANDGLIDERCDMIN = BUILDER.define("Cooldown Min", (double) 300);
		BUILDER.pop();
		BUILDER.push("Sword Barrage");
		SWORDBARRAGECOST = BUILDER.define("Cost", (double) 1);
		SWORDBARRAGEPOTENTIAL = BUILDER.define("Potential", (double) 5);
		SWORDBARRAGECDMAX = BUILDER.define("Cooldown Max", (double) 400);
		SWORDBARRAGECDMIN = BUILDER.define("Cooldown Min", (double) 150);
		BUILDER.pop();
		BUILDER.push("Divination");
		DIVINATIONCOST = BUILDER.define("Cost", (double) 3);
		DIVINATIONPOTENTIAL = BUILDER.define("Potential", (double) 10);
		BUILDER.pop();
		BUILDER.push("Zoom");
		ZOOMCOST = BUILDER.define("Cost", (double) 3);
		ZOOMPOTENTIAL = BUILDER.define("Potential", (double) 10);
		BUILDER.pop();
		BUILDER.push("Timestop Counter");
		TIMESTOPCOUNTERCOST = BUILDER.define("Cost", (double) 10);
		TIMESTOPCOUNTERPOTENTIAL = BUILDER.define("Potential", (double) 80);
		TIMESTOPCOUNTERCDMAX = BUILDER.define("Cooldown Max", (double) 1200);
		TIMESTOPCOUNTERCDMIN = BUILDER.define("Cooldown Min", (double) 600);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
