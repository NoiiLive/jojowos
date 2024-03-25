
package net.mcreator.jojowos.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.jojowos.procedures.RedBindEffectProcedure;

public class RedBindedMobEffect extends MobEffect {
	public RedBindedMobEffect() {
		super(MobEffectCategory.NEUTRAL, -26368);
	}

	@Override
	public String getDescriptionId() {
		return "effect.jojowos.red_binded";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		RedBindEffectProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
