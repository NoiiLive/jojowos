package net.mcreator.jojowos.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.jojowos.init.JojowosModEntities;
import net.mcreator.jojowos.entity.IggySittingEntity;
import net.mcreator.jojowos.entity.IggyEntity;

import java.util.List;
import java.util.Comparator;

public class IggySitProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		boolean gate = false;
		if (sourceentity.isShiftKeyDown()) {
			if (entity instanceof IggyEntity) {
				if (entity instanceof TamableAnimal _tamIsTamedBy && sourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) {
					if (!entity.level().isClientSide())
						entity.discard();
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = JojowosModEntities.IGGY_SITTING.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if (entityiterator instanceof IggySittingEntity) {
								entityiterator.getPersistentData().putString("Owner", (sourceentity.getDisplayName().getString()));
							}
						}
					}
					if (sourceentity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Iggy is now staying"), true);
				}
			}
			if (entity instanceof IggySittingEntity) {
				if ((entity.getPersistentData().getString("Owner")).equals(sourceentity.getDisplayName().getString())) {
					if (!entity.level().isClientSide())
						entity.discard();
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = JojowosModEntities.IGGY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if (entityiterator instanceof IggyEntity) {
								if (entityiterator instanceof TamableAnimal _toTame && sourceentity instanceof Player _owner)
									_toTame.tame(_owner);
							}
						}
					}
					if (sourceentity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Iggy is no longer staying"), true);
				}
			}
		}
	}
}
