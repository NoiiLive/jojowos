package net.mcreator.jojowos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.init.JojowosModEntities;
import net.mcreator.jojowos.entity.HermitPurpleDisplayBlueEntity;

public class ReturnHermitPurpleBlueProcedure {
	public static Entity execute(LevelAccessor world) {
		return world instanceof Level _level ? new HermitPurpleDisplayBlueEntity(JojowosModEntities.HERMIT_PURPLE_DISPLAY_BLUE.get(), _level) : null;
	}
}
