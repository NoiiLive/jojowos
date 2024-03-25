package net.mcreator.jojowos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.init.JojowosModEntities;
import net.mcreator.jojowos.entity.ChariotDisplayBaseEntity;

public class ReturnSilverChariotBaseProcedure {
	public static Entity execute(LevelAccessor world) {
		return world instanceof Level _level ? new ChariotDisplayBaseEntity(JojowosModEntities.CHARIOT_DISPLAY_BASE.get(), _level) : null;
	}
}
