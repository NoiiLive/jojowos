package net.mcreator.jojowos.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.commands.arguments.EntityAnchorArgument;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.jojowos.init.JojowosModParticleTypes;
import net.mcreator.jojowos.init.JojowosModEntities;
import net.mcreator.jojowos.entity.EmeraldSplashItemProjectileEntity;
import net.mcreator.jojowos.entity.EmeraldBarrierEntity;

import java.util.List;
import java.util.Comparator;

public class EmeraldBarrierLineProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean gate = false;
		boolean triggered = false;
		double mag = 0;
		double deltaz = 0;
		double distance = 0;
		double deltax = 0;
		double deltay = 0;
		double distance2 = 0;
		double dampen = 0;
		double triggerX = 0;
		double triggerY = 0;
		double triggerZ = 0;
		triggered = false;
		if ((entity instanceof EmeraldBarrierEntity _datEntI ? _datEntI.getEntityData().get(EmeraldBarrierEntity.DATA_BarrierPos) : 0) == 1) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(42 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (!(entityiterator == entity)) {
						if (entityiterator instanceof EmeraldBarrierEntity) {
							if (entityiterator instanceof TamableAnimal _tamIsTamedBy && (entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) {
								if ((entityiterator instanceof EmeraldBarrierEntity _datEntI ? _datEntI.getEntityData().get(EmeraldBarrierEntity.DATA_BarrierCount) : 0) == (entity instanceof EmeraldBarrierEntity _datEntI
										? _datEntI.getEntityData().get(EmeraldBarrierEntity.DATA_BarrierCount)
										: 0)) {
									if ((entityiterator instanceof EmeraldBarrierEntity _datEntI ? _datEntI.getEntityData().get(EmeraldBarrierEntity.DATA_BarrierPos) : 0) == 2) {
										deltax = entityiterator.getX() - x;
										deltay = entityiterator.getY() - y;
										deltaz = entityiterator.getZ() - z;
										mag = Math.sqrt(deltax * deltax + deltay * deltay + deltaz * deltaz);
										entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ())));
										entityiterator.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getX()), (entity.getY()), (entity.getZ())));
										for (int index0 = 0; index0 < (int) (mag * 10); index0++) {
											world.addParticle((SimpleParticleType) (JojowosModParticleTypes.EMERALD_BARRIER_PARTICLE.get()), (x + entity.getLookAngle().x * distance), (y + entity.getLookAngle().y * distance),
													(z + entity.getLookAngle().z * distance), 0, 0, 0);
											distance = distance + 0.1;
										}
										if (entity.getPersistentData().getDouble("DespawnTimer") == 0) {
											entity.getPersistentData().putDouble("DespawnTimer", 1200);
											entityiterator.getPersistentData().putDouble("DespawnTimer", 1200);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		for (int index1 = 0; index1 < (int) (mag * 5); index1++) {
			{
				final Vec3 _center = new Vec3((x + entity.getLookAngle().x * distance2), (y + entity.getLookAngle().y * distance2), (z + entity.getLookAngle().z * distance2));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (!(entityiterator instanceof EmeraldBarrierEntity)) {
						if (!(entityiterator instanceof EmeraldSplashItemProjectileEntity)) {
							if (!entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("jojowos:stand_mob")))) {
								if (!(entityiterator == (entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null))) {
									entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("jojowos:stand"))),
											(entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null)), 1);
									if (triggered == false) {
										triggered = true;
										triggerX = x + entity.getLookAngle().x * distance2;
										triggerY = y + entity.getLookAngle().y * distance2;
										triggerZ = z + entity.getLookAngle().z * distance2;
									}
								}
							}
						}
					}
				}
			}
			distance2 = distance2 + 0.2;
		}
		if (triggered == true) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(triggerX, triggerY, triggerZ), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 0.137 0.439 0.29 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
						AbstractArrow entityToSpawn = new EmeraldSplashItemProjectileEntity(JojowosModEntities.EMERALD_SPLASH_ITEM_PROJECTILE.get(), level);
						entityToSpawn.setOwner(shooter);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						entityToSpawn.setPierceLevel(piercing);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, (entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null), 2, 1, (byte) 1);
				_entityToSpawn.setPos(triggerX, triggerY, triggerZ);
				_entityToSpawn.shoot((Mth.nextDouble(RandomSource.create(), -180, 180)), (Mth.nextDouble(RandomSource.create(), -5, 5)), (Mth.nextDouble(RandomSource.create(), -180, 180)), 3, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
						AbstractArrow entityToSpawn = new EmeraldSplashItemProjectileEntity(JojowosModEntities.EMERALD_SPLASH_ITEM_PROJECTILE.get(), level);
						entityToSpawn.setOwner(shooter);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						entityToSpawn.setPierceLevel(piercing);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, (entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null), 2, 1, (byte) 1);
				_entityToSpawn.setPos(triggerX, triggerY, triggerZ);
				_entityToSpawn.shoot((Mth.nextDouble(RandomSource.create(), -180, 180)), (Mth.nextDouble(RandomSource.create(), -5, 5)), (Mth.nextDouble(RandomSource.create(), -180, 180)), 3, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
						AbstractArrow entityToSpawn = new EmeraldSplashItemProjectileEntity(JojowosModEntities.EMERALD_SPLASH_ITEM_PROJECTILE.get(), level);
						entityToSpawn.setOwner(shooter);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						entityToSpawn.setPierceLevel(piercing);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, (entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null), 2, 1, (byte) 1);
				_entityToSpawn.setPos(triggerX, triggerY, triggerZ);
				_entityToSpawn.shoot((Mth.nextDouble(RandomSource.create(), -180, 180)), (Mth.nextDouble(RandomSource.create(), -5, 5)), (Mth.nextDouble(RandomSource.create(), -180, 180)), 3, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
			if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7cBarrier Triggered!"), true);
		}
	}
}
