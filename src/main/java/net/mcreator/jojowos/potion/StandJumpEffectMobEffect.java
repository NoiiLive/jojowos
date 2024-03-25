
package net.mcreator.jojowos.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.jojowos.procedures.StandJumpEffectNoDamageProcedure;

public class StandJumpEffectMobEffect extends MobEffect {
	public StandJumpEffectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.jojowos.stand_jump_effect";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		StandJumpEffectNoDamageProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
