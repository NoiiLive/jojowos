package net.mcreator.jojowos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.init.JojowosModEntities;
import net.mcreator.jojowos.entity.HierophantGreenOVAEntity;

public class ReturnHierophantGreenOVAProcedure {
	public static Entity execute(LevelAccessor world) {
		return world instanceof Level _level ? new HierophantGreenOVAEntity(JojowosModEntities.HIEROPHANT_GREEN_OVA.get(), _level) : null;
	}
}
