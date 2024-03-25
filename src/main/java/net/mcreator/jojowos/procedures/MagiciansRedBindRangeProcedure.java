package net.mcreator.jojowos.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;

public class MagiciansRedBindRangeProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u00A76\u00A7lRed Bind: \u00A7f"
				+ new java.text.DecimalFormat("##").format(Math.round((100 + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPrecision * 1.666) / 20)) + " Seconds";
	}
}
