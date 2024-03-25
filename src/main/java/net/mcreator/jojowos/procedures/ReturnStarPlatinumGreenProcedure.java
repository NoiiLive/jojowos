package net.mcreator.jojowos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.init.JojowosModEntities;
import net.mcreator.jojowos.entity.StarPlatinumGreenEntity;

public class ReturnStarPlatinumGreenProcedure {
	public static Entity execute(LevelAccessor world) {
		return world instanceof Level _level ? new StarPlatinumGreenEntity(JojowosModEntities.STAR_PLATINUM_GREEN.get(), _level) : null;
	}
}
