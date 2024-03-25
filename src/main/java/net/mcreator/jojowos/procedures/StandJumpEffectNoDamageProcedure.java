package net.mcreator.jojowos.procedures;

import net.minecraft.world.entity.Entity;

public class StandJumpEffectNoDamageProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.fallDistance = 0;
	}
}
