package net.mcreator.jojowos.procedures;

import net.mcreator.jojowos.configuration.ConfigFilesConfiguration;

public class ReturnCostStarPlatinumOVAProcedure {
	public static String execute() {
		if ((double) ConfigFilesConfiguration.SKINCOST.get() > 0) {
			return "Equip - OVA (" + new java.text.DecimalFormat("##").format((double) ConfigFilesConfiguration.SKINCOST.get()) + " Skill Points)";
		}
		return "Equip - OVA";
	}
}
