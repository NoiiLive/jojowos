package net.mcreator.jojowos.procedures;

import net.mcreator.jojowos.configuration.ConfigFilesConfiguration;

public class ReturnCostStarPlatinumPart4Procedure {
	public static String execute() {
		if ((double) ConfigFilesConfiguration.SKINCOST.get() > 0) {
			return "Equip - Part 4 (" + new java.text.DecimalFormat("##").format((double) ConfigFilesConfiguration.SKINCOST.get()) + " Skill Points)";
		}
		return "Equip - Part 4";
	}
}
