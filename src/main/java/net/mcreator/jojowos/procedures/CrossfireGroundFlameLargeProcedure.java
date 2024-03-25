package net.mcreator.jojowos.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.LargeFireball;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.jojowos.configuration.ConfigFilesConfiguration;
import net.mcreator.jojowos.JojowosMod;

import java.util.List;
import java.util.Comparator;

public class CrossfireGroundFlameLargeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (ConfigFilesConfiguration.STANDBLOCKBREAKING.get() == true) {
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new LargeFireball(EntityType.FIREBALL, projectileLevel);
				_entityToSpawn.setPos(x, y, z);
				_entityToSpawn.shoot(1, 1, 1, 5, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					entityiterator.setSecondsOnFire(3);
				}
			}
			JojowosMod.queueServerWork(1, () -> {
				int horizontalRadiusSphere = (int) 5 - 1;
				int verticalRadiusSphere = (int) 5 - 1;
				int yIterationsSphere = verticalRadiusSphere;
				for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
					for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
						for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
							double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
									+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
							if (distanceSq <= 1.0) {
								if ((world.getBlockState(BlockPos.containing(x + xi, y + i, z + zi))).getBlock() == Blocks.AIR && ((world.getBlockState(BlockPos.containing(x + xi, y + i - 1, z + zi))).getBlock() == Blocks.AIR) == false) {
									if (Math.random() >= 0.7) {
										world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), Blocks.FIRE.defaultBlockState(), 3);
									}
								}
							}
						}
					}
				}
			});
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.FLAME, (x + Mth.nextInt(RandomSource.create(), -5, 5)), (y + Mth.nextInt(RandomSource.create(), -1, 5)), (z + Mth.nextInt(RandomSource.create(), -5, 5)), 15, 1.5, 1.5, 1.5, 0.2);
		} else {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.ON_FIRE)), 4);
					entityiterator.setSecondsOnFire(4);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.PLAYERS, 1, 1, false);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.ambient")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.ambient")), SoundSource.PLAYERS, 1, 1, false);
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.FLAME, (x + Mth.nextInt(RandomSource.create(), -5, 5)), (y + Mth.nextInt(RandomSource.create(), -1, 5)), (z + Mth.nextInt(RandomSource.create(), -5, 5)), 15, 1.5, 1.5, 1.5, 0.2);
		}
	}
}
