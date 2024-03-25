package net.mcreator.jojowos.procedures;

import net.mcreator.jojowos.configuration.ConfigFilesConfiguration;

public class ReturnCostStarPlatinumGreenProcedure {
	public static String execute() {
		if ((double) ConfigFilesConfiguration.SKINCOST.get() > 0) {
			return "Equip - Green (" + new java.text.DecimalFormat("##").format((double) ConfigFilesConfiguration.SKINCOST.get()) + " Skill Points)";
		}
		return "Equip - Green";
	}
}
