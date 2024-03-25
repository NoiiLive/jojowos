package net.mcreator.jojowos.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;

public class ReturnCompleteSideQuest1Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SideQuest1).equals("None") == false) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SideQuestObjective1 == (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new JojowosModVariables.PlayerVariables())).SideQuestTotalObjective1) {
				return true;
			}
		}
		return false;
	}
}
