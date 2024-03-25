package net.mcreator.jojowos.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;

public class ReturnSideQuestGiver1Procedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Return to " + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SideQuestGiver1 + " to Complete";
	}
}
