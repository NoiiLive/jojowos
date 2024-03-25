package net.mcreator.jojowos.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;

public class WorldTimestopLengthDisplayProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u00A76\u00A7lTimestop: \u00A7f"
				+ new java.text.DecimalFormat("##").format(Math.round((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).TimeStopLength / 20)) + " Seconds";
	}
}
