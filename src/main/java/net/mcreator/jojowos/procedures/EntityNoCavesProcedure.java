package net.mcreator.jojowos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.jojowos.configuration.ConfigFilesConfiguration;

public class EntityNoCavesProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (ConfigFilesConfiguration.NPCSPAWNING.get() == false) {
			return false;
		}
		if (world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1, z)) == false) {
			return false;
		}
		return true;
	}
}
