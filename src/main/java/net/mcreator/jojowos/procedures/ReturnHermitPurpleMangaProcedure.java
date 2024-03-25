package net.mcreator.jojowos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.init.JojowosModEntities;
import net.mcreator.jojowos.entity.HermitPurpleDisplayMangaEntity;

public class ReturnHermitPurpleMangaProcedure {
	public static Entity execute(LevelAccessor world) {
		return world instanceof Level _level ? new HermitPurpleDisplayMangaEntity(JojowosModEntities.HERMIT_PURPLE_DISPLAY_MANGA.get(), _level) : null;
	}
}
