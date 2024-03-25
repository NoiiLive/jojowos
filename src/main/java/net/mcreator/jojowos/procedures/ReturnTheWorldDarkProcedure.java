package net.mcreator.jojowos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.init.JojowosModEntities;
import net.mcreator.jojowos.entity.TheWorldSilverEntity;

public class ReturnTheWorldDarkProcedure {
	public static Entity execute(LevelAccessor world) {
		return world instanceof Level _level ? new TheWorldSilverEntity(JojowosModEntities.THE_WORLD_SILVER.get(), _level) : null;
	}
}
