
package net.mcreator.jojowos.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.jojowos.procedures.BurrowedEffectActiveProcedure;

public class BurrowedEffectMobEffect extends MobEffect {
	public BurrowedEffectMobEffect() {
		super(MobEffectCategory.NEUTRAL, -52);
	}

	@Override
	public String getDescriptionId() {
		return "effect.jojowos.burrowed_effect";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		BurrowedEffectActiveProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ());
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
