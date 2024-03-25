package net.mcreator.jojowos.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;

public class JosephYellIconDisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCIcon).equals("JosephYell")) {
			return true;
		}
		return false;
	}
}
