package net.mcreator.jojowos.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;

public class ReturnCompleteSideQuest3Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SideQuest3).equals("None") == false) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SideQuestObjective3 == (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new JojowosModVariables.PlayerVariables())).SideQuestTotalObjective3) {
				return true;
			}
		}
		return false;
	}
}
