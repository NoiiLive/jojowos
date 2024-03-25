package net.mcreator.jojowos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.init.JojowosModEntities;
import net.mcreator.jojowos.entity.TheFoolDisplayOVAEntity;

public class ReturnTheFoolOVAProcedure {
	public static Entity execute(LevelAccessor world) {
		return world instanceof Level _level ? new TheFoolDisplayOVAEntity(JojowosModEntities.THE_FOOL_DISPLAY_OVA.get(), _level) : null;
	}
}
