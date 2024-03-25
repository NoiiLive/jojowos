package net.mcreator.jojowos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.init.JojowosModEntities;
import net.mcreator.jojowos.entity.TheWorldOVAEntity;

public class ReturnTheWorldOVAProcedure {
	public static Entity execute(LevelAccessor world) {
		return world instanceof Level _level ? new TheWorldOVAEntity(JojowosModEntities.THE_WORLD_OVA.get(), _level) : null;
	}
}
