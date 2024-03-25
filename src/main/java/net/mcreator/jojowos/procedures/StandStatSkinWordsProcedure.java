package net.mcreator.jojowos.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;

public class StandStatSkinWordsProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Skin: " + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin;
	}
}
