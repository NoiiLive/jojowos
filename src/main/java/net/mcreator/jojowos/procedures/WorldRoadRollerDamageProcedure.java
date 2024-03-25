package net.mcreator.jojowos.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;

public class WorldRoadRollerDamageProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u00A76\u00A7lRoad Roller: \u00A7f"
				+ new java.text.DecimalFormat("##").format(Math.ceil((2.5 + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower / 65) * Math.sqrt(5) + 6))
				+ " DMG";
	}
}
