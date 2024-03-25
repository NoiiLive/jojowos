
package net.mcreator.jojowos.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.jojowos.procedures.BurrowedEffectActiveProcedure;

public class SandTrappedMobEffect extends MobEffect {
	public SandTrappedMobEffect() {
		super(MobEffectCategory.NEUTRAL, -52);
	}

	@Override
	public String getDescriptionId() {
		return "effect.jojowos.sand_trapped";
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
