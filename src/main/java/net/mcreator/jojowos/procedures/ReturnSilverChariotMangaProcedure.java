package net.mcreator.jojowos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.init.JojowosModEntities;
import net.mcreator.jojowos.entity.ChariotDisplayMangaEntity;

public class ReturnSilverChariotMangaProcedure {
	public static Entity execute(LevelAccessor world) {
		return world instanceof Level _level ? new ChariotDisplayMangaEntity(JojowosModEntities.CHARIOT_DISPLAY_MANGA.get(), _level) : null;
	}
}
