package net.mcreator.jojowos.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;

public class ReturnCompleteSideQuest4Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SideQuest4).equals("None") == false) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SideQuestObjective4 == (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new JojowosModVariables.PlayerVariables())).SideQuestTotalObjective4) {
				return true;
			}
		}
		return false;
	}
}
