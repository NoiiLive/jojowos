package net.mcreator.jojowos.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;

public class WorldMudaKickBarrageDamageProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u00A76\u00A7lMuda Kick Barrage: \u00A7f"
				+ new java.text.DecimalFormat("##").format(Math.ceil((2 + Math.round((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower / 35)) * Math.sqrt(1.2)))
				+ " DMG";
	}
}
