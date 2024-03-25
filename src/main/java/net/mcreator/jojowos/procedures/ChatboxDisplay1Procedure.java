package net.mcreator.jojowos.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;

public class ChatboxDisplay1Procedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextLine1;
	}
}
