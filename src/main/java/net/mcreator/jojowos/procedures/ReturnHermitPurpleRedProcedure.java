package net.mcreator.jojowos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.init.JojowosModEntities;
import net.mcreator.jojowos.entity.HermitPurpleDisplayRedEntity;

public class ReturnHermitPurpleRedProcedure {
	public static Entity execute(LevelAccessor world) {
		return world instanceof Level _level ? new HermitPurpleDisplayRedEntity(JojowosModEntities.HERMIT_PURPLE_DISPLAY_RED.get(), _level) : null;
	}
}
