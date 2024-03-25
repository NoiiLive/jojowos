package net.mcreator.jojowos.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;

public class ReturnSideQuest2Procedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SideQuest2).equals("None")) {
			return "\u00A78" + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SideQuest2;
		}
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SideQuestObjective2 == (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new JojowosModVariables.PlayerVariables())).SideQuestTotalObjective2) {
			return "\u00A7a" + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SideQuest2 + " - COMPLETE";
		}
		return (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SideQuest2 + " - "
				+ new java.text.DecimalFormat("##").format((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SideQuestObjective2) + "/"
				+ new java.text.DecimalFormat("##").format((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SideQuestTotalObjective2);
	}
}
