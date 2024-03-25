
package net.mcreator.jojowos.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.jojowos.procedures.ArmorlessEffectProcedure;
import net.mcreator.jojowos.procedures.ArmorlessEffectEndProcedure;

public class NoArmorChariotMobEffect extends MobEffect {
	public NoArmorChariotMobEffect() {
		super(MobEffectCategory.NEUTRAL, -6710785);
	}

	@Override
	public String getDescriptionId() {
		return "effect.jojowos.no_armor_chariot";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		ArmorlessEffectProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		ArmorlessEffectEndProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
