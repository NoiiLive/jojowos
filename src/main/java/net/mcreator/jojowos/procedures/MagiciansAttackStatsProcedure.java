package net.mcreator.jojowos.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.configuration.ConfigFilesConfiguration;

public class MagiciansAttackStatsProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u00A76\u00A7lAttack: \u00A7f" + new java.text.DecimalFormat("##").format(1 + Math.round((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower / 25))
				+ " DMG \u00A7e\u00A7l| " + "\u00A76\u00A7lBlocks: \u00A7f"
				+ new java.text.DecimalFormat("##")
						.format((double) ConfigFilesConfiguration.MINIMUMBLOCK.get() + Math.round((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandDurability / 10))
				+ " \u00A7e\u00A7l| " + "\u00A76\u00A7lCrossfire Hurricane: \u00A7f"
				+ new java.text.DecimalFormat("##").format(Math.ceil((1.5 + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower / 40)
						* Math.sqrt(1 + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPrecision / 60)))
				+ " DMG";
	}
}