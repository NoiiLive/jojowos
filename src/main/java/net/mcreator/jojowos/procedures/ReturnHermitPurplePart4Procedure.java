package net.mcreator.jojowos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.init.JojowosModEntities;
import net.mcreator.jojowos.entity.HermitPurpleDisplayPart4Entity;

public class ReturnHermitPurplePart4Procedure {
	public static Entity execute(LevelAccessor world) {
		return world instanceof Level _level ? new HermitPurpleDisplayPart4Entity(JojowosModEntities.HERMIT_PURPLE_DISPLAY_PART_4.get(), _level) : null;
	}
}
