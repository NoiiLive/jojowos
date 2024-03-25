package net.mcreator.jojowos.procedures;

import net.mcreator.jojowos.configuration.ConfigFilesConfiguration;

public class MeteoriteSpawnReturnProcedure {
	public static boolean execute() {
		if (ConfigFilesConfiguration.METEORITESPAWNING.get() == false) {
			return false;
		}
		return true;
	}
}
