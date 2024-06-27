package net.mcreator.jojowos.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.configuration.MoveDirectoryConfiguration;

public class ReturnSkillCost5Procedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5).equals("Fist Barrage")) {
			return (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5 + " : "
					+ new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.FISTBARRAGEPOTENTIAL.get()) + " Potential, " + new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.FISTBARRAGECOST.get())
					+ " Skill Points";
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5).equals("Kick Barrage")) {
			return (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5 + " : "
					+ new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.KICKBARRAGEPOTENTIAL.get()) + " Potential, " + new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.KICKBARRAGECOST.get())
					+ " Skill Points";
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5).equals("Sword Barrage")) {
			return (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5 + " : "
					+ new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.SWORDBARRAGEPOTENTIAL.get()) + " Potential, " + new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.SWORDBARRAGECOST.get())
					+ " Skill Points";
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5).equals("Bearing Shot")) {
			return (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5 + " : "
					+ new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.BEARINGSHOTPOTENTIAL.get()) + " Potential, " + new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.BEARINGSHOTCOST.get())
					+ " Skill Points";
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5).equals("Inhale")) {
			return (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5 + " : "
					+ new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.INHALEPOTENTIAL.get()) + " Potential, " + new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.INHALECOST.get())
					+ " Skill Points";
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5).equals("Star Finger")) {
			return (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5 + " : "
					+ new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.STARFINGERPOTENTIAL.get()) + " Potential, " + new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.STARFINGERCOST.get())
					+ " Skill Points";
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5).equals("Time Skip")) {
			return (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5 + " : "
					+ new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.TIMESKIPPOTENTIAL.get()) + " Potential, " + new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.TIMESKIPCOST.get())
					+ " Skill Points";
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5).equals("Short Timestop")) {
			return (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5 + " : "
					+ new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.SHORTTIMESTOPPOTENTIAL.get()) + " Potential, " + new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.SHORTTIMESTOPCOST.get())
					+ " Skill Points";
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5).equals("Time Stop")) {
			return (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5 + " : "
					+ new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.TIMESTOPPOTENTIAL.get()) + " Potential, " + new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.TIMESTOPCOST.get())
					+ " Skill Points";
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5).equals("Knife Throw")) {
			return (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5 + " : "
					+ new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.KNIFETHROWPOTENTIAL.get()) + " Potential, " + new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.KNIFETHROWCOST.get())
					+ " Skill Points";
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5).equals("Road Roller")) {
			return (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5 + " : "
					+ new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.ROADROLLERPOTENTIAL.get()) + " Potential, " + new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.ROADROLLERCOST.get())
					+ " Skill Points";
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5).equals("Crossfire Hurricane")) {
			return (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5 + " : "
					+ new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.CROSSFIREHURRICANEPOTENTIAL.get()) + " Potential, "
					+ new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.CROSSFIREHURRICANECOST.get()) + " Skill Points";
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5).equals("Crossfire: Special")) {
			return (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5 + " : "
					+ new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.CROSSFIRESPECIALPOTENTIAL.get()) + " Potential, "
					+ new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.CROSSFIRESPECIALCOST.get()) + " Skill Points";
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5).equals("Red Bind")) {
			return (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5 + " : "
					+ new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.REDBINDPOTENTIAL.get()) + " Potential, " + new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.REDBINDCOST.get())
					+ " Skill Points";
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5).equals("Life Detector")) {
			return (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5 + " : "
					+ new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.LIFEDETECTORPOTENTIAL.get()) + " Potential, " + new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.LIFEDETECTORCOST.get())
					+ " Skill Points";
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5).equals("Tangle")) {
			return (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5 + " : "
					+ new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.TANGLEPOTENTIAL.get()) + " Potential, " + new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.TANGLECOST.get())
					+ " Skill Points";
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5).equals("Grapple")) {
			return (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5 + " : "
					+ new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.GRAPPLEPOTENTIAL.get()) + " Potential, " + new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.GRAPPLECOST.get())
					+ " Skill Points";
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5).equals("Emerald Splash")) {
			return (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5 + " : "
					+ new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.EMERALDSPLASHPOTENTIAL.get()) + " Potential, " + new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.EMERALDSPLASHCOST.get())
					+ " Skill Points";
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5).equals("Emerald Barrier")) {
			return (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5 + " : "
					+ new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.EMERALDBARRIERPOTENTIAL.get()) + " Potential, "
					+ new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.EMERALDBARRIERCOST.get()) + " Skill Points";
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5).equals("Body Control")) {
			return (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5 + " : "
					+ new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.BODYCONTROLPOTENTIAL.get()) + " Potential, " + new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.BODYCONTROLCOST.get())
					+ " Skill Points";
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5).equals("Sword Launch")) {
			return (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5 + " : "
					+ new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.SWORDLAUNCHPOTENTIAL.get()) + " Potential, " + new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.SWORDLAUNCHCOST.get())
					+ " Skill Points";
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5).equals("Blade Cyclone")) {
			return (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5 + " : "
					+ new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.BLADECYCLONEPOTENTIAL.get()) + " Potential, " + new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.BLADECYCLONECOST.get())
					+ " Skill Points";
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5).equals("Armor Off")) {
			return (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5 + " : "
					+ new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.ARMOROFFPOTENTIAL.get()) + " Potential, " + new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.ARMOROFFCOST.get())
					+ " Skill Points";
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5).equals("Quicksand")) {
			return (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5 + " : "
					+ new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.QUICKSANDPOTENTIAL.get()) + " Potential, " + new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.QUICKSANDCOST.get())
					+ " Skill Points";
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5).equals("Sand Dome")) {
			return (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5 + " : "
					+ new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.SANDDOMEPOTENTIAL.get()) + " Potential, " + new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.SANDDOMECOST.get())
					+ " Skill Points";
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5).equals("Sand Glider")) {
			return (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5 + " : "
					+ new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.SANDGLIDERPOTENTIAL.get()) + " Potential, " + new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.SANDGLIDERCOST.get())
					+ " Skill Points";
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5).equals("Divination")) {
			return (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5 + " : "
					+ new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.DIVINATIONPOTENTIAL.get()) + " Potential, " + new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.DIVINATIONCOST.get())
					+ " Skill Points";
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5).equals("Zoom")) {
			return (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5 + " : "
					+ new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.ZOOMPOTENTIAL.get()) + " Potential, " + new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.ZOOMCOST.get()) + " Skill Points";
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5).equals("Timestop Counter")) {
			return (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility5 + " : "
					+ new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.TIMESTOPCOUNTERPOTENTIAL.get()) + " Potential, "
					+ new java.text.DecimalFormat("##").format((double) MoveDirectoryConfiguration.TIMESTOPCOUNTERCOST.get()) + " Skill Points";
		}
		return "";
	}
}
