package net.mcreator.jojowos.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.configuration.ConfigFilesConfiguration;

public class SilverChariotAttackStatsProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u00A76\u00A7lAttack: \u00A7f" + new java.text.DecimalFormat("##").format(1 + Math.round((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower / 25))
				+ " DMG \u00A7e\u00A7l| " + "\u00A76\u00A7lBarrage: \u00A7f"
				+ new java.text.DecimalFormat("##").format(Math.ceil((2 + Math.round((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower / 35)) * Math.sqrt(1.2)))
				+ " DMG \u00A7e\u00A7l| " + "\u00A76\u00A7lBlocks: \u00A7f" + new java.text.DecimalFormat("##")
						.format((double) ConfigFilesConfiguration.MINIMUMBLOCK.get() + Math.round((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandDurability / 10));
	}
}
