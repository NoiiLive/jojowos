
package net.mcreator.jojowos.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.jojowos.procedures.StopTimeContinuousProcedure;

public class StoppedTimeMobEffect extends MobEffect {
	public StoppedTimeMobEffect() {
		super(MobEffectCategory.NEUTRAL, -13312);
	}

	@Override
	public String getDescriptionId() {
		return "effect.jojowos.stopped_time";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		StopTimeContinuousProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
