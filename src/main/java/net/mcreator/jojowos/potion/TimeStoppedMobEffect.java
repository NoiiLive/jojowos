
package net.mcreator.jojowos.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.jojowos.procedures.EntityTimeFrozenTickProcedure;
import net.mcreator.jojowos.procedures.EntityTimeFrozenEndProcedure;

public class TimeStoppedMobEffect extends MobEffect {
	public TimeStoppedMobEffect() {
		super(MobEffectCategory.NEUTRAL, -13312);
	}

	@Override
	public String getDescriptionId() {
		return "effect.jojowos.time_stopped";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		EntityTimeFrozenTickProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		EntityTimeFrozenEndProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
