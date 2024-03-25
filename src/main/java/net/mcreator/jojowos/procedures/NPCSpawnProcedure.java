package net.mcreator.jojowos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.jojowos.init.JojowosModEntities;
import net.mcreator.jojowos.entity.JotaroKujoPart3Entity;
import net.mcreator.jojowos.entity.JeanPierrePolnareffEntity;
import net.mcreator.jojowos.entity.DIOEntity;
import net.mcreator.jojowos.entity.DIOCapedEntity;
import net.mcreator.jojowos.entity.DIOAwakenedEntity;

public class NPCSpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof JotaroKujoPart3Entity) {
			entity.getPersistentData().putDouble("TimeStopLength", 60);
		}
		if (entity instanceof DIOCapedEntity) {
			entity.getPersistentData().putDouble("TimeStopLength", 100);
		}
		if (entity instanceof DIOEntity) {
			entity.getPersistentData().putDouble("TimeStopLength", 100);
		}
		if (entity instanceof DIOAwakenedEntity) {
			entity.getPersistentData().putDouble("TimeStopLength", 180);
		}
		if (entity instanceof JeanPierrePolnareffEntity) {
			if (Math.random() >= 0.7) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = JojowosModEntities.IGGY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
			}
		}
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 60, 1, true, false));
	}
}
