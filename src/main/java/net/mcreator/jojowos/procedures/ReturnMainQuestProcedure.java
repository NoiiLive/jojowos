package net.mcreator.jojowos.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;

public class ReturnMainQuestProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "\u00A7f\u00A7n\u00A7l" + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).MainQuest;
	}
}
