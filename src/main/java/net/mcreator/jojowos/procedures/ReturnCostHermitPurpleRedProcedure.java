package net.mcreator.jojowos.procedures;

import net.mcreator.jojowos.configuration.ConfigFilesConfiguration;

public class ReturnCostHermitPurpleRedProcedure {
	public static String execute() {
		if ((double) ConfigFilesConfiguration.SKINCOST.get() > 0) {
			return "Equip - Red (" + new java.text.DecimalFormat("##").format((double) ConfigFilesConfiguration.SKINCOST.get()) + " Skill Points)";
		}
		return "Equip - Red";
	}
}
