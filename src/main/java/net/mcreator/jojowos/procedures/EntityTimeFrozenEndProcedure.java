package net.mcreator.jojowos.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

import net.mcreator.jojowos.init.JojowosModMobEffects;

public class EntityTimeFrozenEndProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setNoGravity(false);
		entity.setDeltaMovement(new Vec3((entity.getPersistentData().getDouble("TimeX")), (entity.getPersistentData().getDouble("TimeY")), (entity.getPersistentData().getDouble("TimeZ"))));
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(JojowosModMobEffects.STOPPED_TIME.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(JojowosModMobEffects.TIME_STOPPED.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(JojowosModMobEffects.TIME_STOP_VISUAL.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.BLINDNESS);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.DARKNESS);
	}
}
