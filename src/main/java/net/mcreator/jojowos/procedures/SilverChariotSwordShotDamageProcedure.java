package net.mcreator.jojowos.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;

public class SilverChariotSwordShotDamageProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u00A76\u00A7lSword Launch: \u00A7f"
				+ new java.text.DecimalFormat("##").format(Math.ceil((1 + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower / 50) * Math.sqrt(4))) + " DMG";
	}
}
