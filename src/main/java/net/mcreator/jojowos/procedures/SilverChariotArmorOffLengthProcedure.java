package net.mcreator.jojowos.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;

public class SilverChariotArmorOffLengthProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u00A76\u00A7lArmor Off: \u00A7f"
				+ new java.text.DecimalFormat("##").format(Math.round((200 + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPotential * 5) / 20)) + " Seconds";
	}
}
