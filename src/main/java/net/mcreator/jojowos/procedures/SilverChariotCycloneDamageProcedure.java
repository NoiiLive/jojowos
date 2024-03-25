package net.mcreator.jojowos.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;

public class SilverChariotCycloneDamageProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u00A76\u00A7lBlade Cyclone: \u00A7f" + new java.text.DecimalFormat("##").format(3.5 + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower / 50 + 2
				+ (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower / 50 + 1.5
				+ (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower / 50 + 1
				+ (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower / 50) + " DMG";
	}
}
