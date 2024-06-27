package net.mcreator.jojowos.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.configuration.ConfigFilesConfiguration;

public class StandStatsDisplayProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("StarPlatinum")) {
			return "\u00A76\u00A7lAttack: \u00A7f"
					+ new java.text.DecimalFormat("##").format(1 + Math.round((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower / 25)) + " DMG \u00A7e\u00A7l| "
					+ "\u00A76\u00A7lBarrage: \u00A7f"
					+ new java.text.DecimalFormat("##")
							.format(Math.ceil((2 + Math.round((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower / 35)) * Math.sqrt(1.2)))
					+ " DMG \u00A7e\u00A7l| " + "\u00A76\u00A7lBlocks: \u00A7f" + new java.text.DecimalFormat("##").format(
							(double) ConfigFilesConfiguration.MINIMUMBLOCK.get() + Math.round((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandDurability / 10));
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("HierophantGreen")) {
			return "\u00A76\u00A7lAttack: \u00A7f"
					+ new java.text.DecimalFormat("##").format(1 + Math.round((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower / 25)) + " DMG \u00A7e\u00A7l| "
					+ "\u00A76\u00A7lBlocks: \u00A7f"
					+ new java.text.DecimalFormat("##").format(
							(double) ConfigFilesConfiguration.MINIMUMBLOCK.get() + Math.round((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandDurability / 10))
					+ " \u00A7e\u00A7l| " + "\u00A76\u00A7lEmerald Splash: \u00A7f" + new java.text.DecimalFormat("##").format(Math.ceil(1 * Math.sqrt(3))) + " DMG";
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("SilverChariot")) {
			return "\u00A76\u00A7lAttack: \u00A7f"
					+ new java.text.DecimalFormat("##").format(1 + Math.round((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower / 25)) + " DMG \u00A7e\u00A7l| "
					+ "\u00A76\u00A7lBarrage: \u00A7f"
					+ new java.text.DecimalFormat("##")
							.format(Math.ceil((2 + Math.round((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower / 35)) * Math.sqrt(1.2)))
					+ " DMG \u00A7e\u00A7l| " + "\u00A76\u00A7lBlocks: \u00A7f" + new java.text.DecimalFormat("##").format(
							(double) ConfigFilesConfiguration.MINIMUMBLOCK.get() + Math.round((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandDurability / 10));
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("MagiciansRed")) {
			return "\u00A76\u00A7lAttack: \u00A7f"
					+ new java.text.DecimalFormat("##").format(1 + Math.round((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower / 25)) + " DMG \u00A7e\u00A7l| "
					+ "\u00A76\u00A7lBlocks: \u00A7f"
					+ new java.text.DecimalFormat("##").format(
							(double) ConfigFilesConfiguration.MINIMUMBLOCK.get() + Math.round((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandDurability / 10))
					+ " \u00A7e\u00A7l| " + "\u00A76\u00A7lCrossfire Hurricane: \u00A7f"
					+ new java.text.DecimalFormat("##").format(Math.ceil((1.5 + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower / 40)
							* Math.sqrt(1 + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPrecision / 60)))
					+ " DMG";
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("HermitPurple")) {
			return "\u00A76\u00A7lAttack: \u00A7f" + new java.text.DecimalFormat("##").format(4) + " DMG \u00A7e\u00A7l| " + "\u00A76\u00A7lGrapple: \u00A7f" + new java.text.DecimalFormat("##").format(30) + " Blocks";
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("TheWorld")) {
			return "\u00A76\u00A7lAttack: \u00A7f"
					+ new java.text.DecimalFormat("##").format(1 + Math.round((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower / 25)) + " DMG \u00A7e\u00A7l| "
					+ "\u00A76\u00A7lBarrage: \u00A7f"
					+ new java.text.DecimalFormat("##")
							.format(Math.ceil((2 + Math.round((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower / 35)) * Math.sqrt(1.2)))
					+ " DMG \u00A7e\u00A7l| " + "\u00A76\u00A7lBlocks: \u00A7f" + new java.text.DecimalFormat("##").format(
							(double) ConfigFilesConfiguration.MINIMUMBLOCK.get() + Math.round((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandDurability / 10));
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("TheFool")) {
			return "\u00A76\u00A7lAttack: \u00A7f"
					+ new java.text.DecimalFormat("##").format(1 + Math.round((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower / 25)) + " DMG \u00A7e\u00A7l| "
					+ "\u00A76\u00A7lBlocks: \u00A7f"
					+ new java.text.DecimalFormat("##").format(
							(double) ConfigFilesConfiguration.MINIMUMBLOCK.get() + Math.round((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandDurability / 10))
					+ " \u00A7e\u00A7l| " + "\u00A76\u00A7lQuicksand: \u00A7f" + new java.text.DecimalFormat("##").format(Math.round(100 / 20)) + " Seconds";
		}
		return "";
	}
}
