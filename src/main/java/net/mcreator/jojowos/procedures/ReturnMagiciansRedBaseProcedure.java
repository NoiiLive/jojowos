package net.mcreator.jojowos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.init.JojowosModEntities;
import net.mcreator.jojowos.entity.MagiciansRedEntity;

public class ReturnMagiciansRedBaseProcedure {
	public static Entity execute(LevelAccessor world) {
		return world instanceof Level _level ? new MagiciansRedEntity(JojowosModEntities.MAGICIANS_RED.get(), _level) : null;
	}
}
