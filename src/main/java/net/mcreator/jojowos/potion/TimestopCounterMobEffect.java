
package net.mcreator.jojowos.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class TimestopCounterMobEffect extends MobEffect {
	public TimestopCounterMobEffect() {
		super(MobEffectCategory.NEUTRAL, -13261);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
