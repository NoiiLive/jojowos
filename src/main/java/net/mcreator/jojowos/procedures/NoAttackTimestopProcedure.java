package net.mcreator.jojowos.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.init.JojowosModMobEffects;

public class NoAttackTimestopProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(JojowosModMobEffects.TIME_STOPPED.get())) {
			return false;
		}
		return true;
	}
}
