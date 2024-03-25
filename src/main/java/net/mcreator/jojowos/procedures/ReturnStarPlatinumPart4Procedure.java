package net.mcreator.jojowos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.init.JojowosModEntities;
import net.mcreator.jojowos.entity.StarPlatinumP4Entity;

public class ReturnStarPlatinumPart4Procedure {
	public static Entity execute(LevelAccessor world) {
		return world instanceof Level _level ? new StarPlatinumP4Entity(JojowosModEntities.STAR_PLATINUM_P_4.get(), _level) : null;
	}
}
