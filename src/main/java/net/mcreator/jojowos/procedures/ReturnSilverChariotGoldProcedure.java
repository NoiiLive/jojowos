package net.mcreator.jojowos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.init.JojowosModEntities;
import net.mcreator.jojowos.entity.ChariotDisplayGoldEntity;

public class ReturnSilverChariotGoldProcedure {
	public static Entity execute(LevelAccessor world) {
		return world instanceof Level _level ? new ChariotDisplayGoldEntity(JojowosModEntities.CHARIOT_DISPLAY_GOLD.get(), _level) : null;
	}
}
