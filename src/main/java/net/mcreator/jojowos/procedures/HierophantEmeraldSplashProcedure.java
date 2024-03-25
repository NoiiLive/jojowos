package net.mcreator.jojowos.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.init.JojowosModEntities;
import net.mcreator.jojowos.entity.HierophantGreenOVAEntity;
import net.mcreator.jojowos.entity.HierophantGreenMangaEntity;
import net.mcreator.jojowos.entity.HierophantGreenEntity;
import net.mcreator.jojowos.entity.HierophantGreenBlueEntity;
import net.mcreator.jojowos.entity.EmeraldSplashItemProjectileEntity;
import net.mcreator.jojowos.JojowosMod;

import java.util.List;
import java.util.Comparator;

public class HierophantEmeraldSplashProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilityCooldown1 == 0) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NoCooldown == false) {
				{
					double _setval = 300 + Math.round((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSpeed * (-1.265));
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilityCooldown1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				{
					double _setval = 60;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilityCooldown1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			{
				double _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).CurrentExp + 10;
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CurrentExp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			entity.getPersistentData().putBoolean("Attack", true);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:hierophant_emeraldsplash")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:hierophant_emeraldsplash")), SoundSource.PLAYERS, 1, 1, false);
				}
			}
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 2, false, false));
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 0.137 0.439 0.29 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof HierophantGreenEntity) {
						if (entityiterator instanceof HierophantGreenEntity) {
							((HierophantGreenEntity) entityiterator).setAnimation("splash");
						}
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"particle minecraft:dust 0.137 0.439 0.29 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
					}
					if (entityiterator instanceof HierophantGreenMangaEntity) {
						if (entityiterator instanceof HierophantGreenMangaEntity) {
							((HierophantGreenMangaEntity) entityiterator).setAnimation("splash");
						}
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"particle minecraft:dust 0.247 0.706 0.627 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
					}
					if (entityiterator instanceof HierophantGreenOVAEntity) {
						if (entityiterator instanceof HierophantGreenOVAEntity) {
							((HierophantGreenOVAEntity) entityiterator).setAnimation("splash");
						}
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"particle minecraft:dust 0.102 0.522 0.286 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
					}
					if (entityiterator instanceof HierophantGreenBlueEntity) {
						if (entityiterator instanceof HierophantGreenBlueEntity) {
							((HierophantGreenBlueEntity) entityiterator).setAnimation("splash");
						}
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"particle minecraft:dust 0.235 0.612 0.706 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
					}
				}
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
				}.getArrow(projectileLevel, entity, 1, 1, (byte) 1);
				_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
				_entityToSpawn.shoot((entity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (entity.getLookAngle().y), (entity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
				}.getArrow(projectileLevel, entity, 1, 1, (byte) 1);
				_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
				_entityToSpawn.shoot((entity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (entity.getLookAngle().y), (entity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
				}.getArrow(projectileLevel, entity, 1, 1, (byte) 1);
				_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
				_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), 3, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
			JojowosMod.queueServerWork(5, () -> {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.fishing_bobber.splash")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.fishing_bobber.splash")), SoundSource.PLAYERS, 1, 1, false);
					}
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
					}.getArrow(projectileLevel, entity, 1, 1, (byte) 1);
					_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
					_entityToSpawn.shoot((entity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (entity.getLookAngle().y), (entity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
					}.getArrow(projectileLevel, entity, 1, 1, (byte) 1);
					_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
					_entityToSpawn.shoot((entity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (entity.getLookAngle().y), (entity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
					}.getArrow(projectileLevel, entity, 1, 1, (byte) 1);
					_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
					_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), 3, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
				JojowosMod.queueServerWork(5, () -> {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.fishing_bobber.splash")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.fishing_bobber.splash")), SoundSource.PLAYERS, 1, 1, false);
						}
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
						}.getArrow(projectileLevel, entity, 1, 1, (byte) 1);
						_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
						_entityToSpawn.shoot((entity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (entity.getLookAngle().y), (entity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
						}.getArrow(projectileLevel, entity, 1, 1, (byte) 1);
						_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
						_entityToSpawn.shoot((entity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (entity.getLookAngle().y), (entity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
						}.getArrow(projectileLevel, entity, 1, 1, (byte) 1);
						_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
						_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), 3, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
					JojowosMod.queueServerWork(5, () -> {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.fishing_bobber.splash")), SoundSource.PLAYERS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.fishing_bobber.splash")), SoundSource.PLAYERS, 1, 1, false);
							}
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
							}.getArrow(projectileLevel, entity, 1, 1, (byte) 1);
							_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
							_entityToSpawn.shoot((entity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (entity.getLookAngle().y), (entity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
							}.getArrow(projectileLevel, entity, 1, 1, (byte) 1);
							_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
							_entityToSpawn.shoot((entity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (entity.getLookAngle().y), (entity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
							}.getArrow(projectileLevel, entity, 1, 1, (byte) 1);
							_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
							_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), 3, 0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
						JojowosMod.queueServerWork(5, () -> {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"particle minecraft:dust 0.137 0.439 0.29 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.fishing_bobber.splash")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.fishing_bobber.splash")), SoundSource.PLAYERS, 1, 1, false);
								}
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
								}.getArrow(projectileLevel, entity, 1, 1, (byte) 1);
								_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
								_entityToSpawn.shoot((entity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (entity.getLookAngle().y), (entity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
								}.getArrow(projectileLevel, entity, 1, 1, (byte) 1);
								_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
								_entityToSpawn.shoot((entity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (entity.getLookAngle().y), (entity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
								}.getArrow(projectileLevel, entity, 1, 1, (byte) 1);
								_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
								_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), 3, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
							JojowosMod.queueServerWork(5, () -> {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.fishing_bobber.splash")), SoundSource.PLAYERS, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.fishing_bobber.splash")), SoundSource.PLAYERS, 1, 1, false);
									}
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
									}.getArrow(projectileLevel, entity, 1, 1, (byte) 1);
									_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
									_entityToSpawn.shoot((entity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (entity.getLookAngle().y), (entity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
									}.getArrow(projectileLevel, entity, 1, 1, (byte) 1);
									_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
									_entityToSpawn.shoot((entity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (entity.getLookAngle().y), (entity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
									}.getArrow(projectileLevel, entity, 1, 1, (byte) 1);
									_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
									_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), 3, 0);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
								JojowosMod.queueServerWork(5, () -> {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.fishing_bobber.splash")), SoundSource.PLAYERS, 1, 1);
										} else {
											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.fishing_bobber.splash")), SoundSource.PLAYERS, 1, 1, false);
										}
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
										}.getArrow(projectileLevel, entity, 1, 1, (byte) 1);
										_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
										_entityToSpawn.shoot((entity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (entity.getLookAngle().y), (entity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
										}.getArrow(projectileLevel, entity, 1, 1, (byte) 1);
										_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
										_entityToSpawn.shoot((entity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (entity.getLookAngle().y), (entity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
										}.getArrow(projectileLevel, entity, 1, 1, (byte) 1);
										_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
										_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), 3, 0);
										projectileLevel.addFreshEntity(_entityToSpawn);
									}
									JojowosMod.queueServerWork(5, () -> {
										if (world instanceof Level _level) {
											if (!_level.isClientSide()) {
												_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.fishing_bobber.splash")), SoundSource.PLAYERS, 1, 1);
											} else {
												_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.fishing_bobber.splash")), SoundSource.PLAYERS, 1, 1, false);
											}
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
											}.getArrow(projectileLevel, entity, 1, 1, (byte) 1);
											_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
											_entityToSpawn.shoot((entity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (entity.getLookAngle().y), (entity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3,
													0);
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
											}.getArrow(projectileLevel, entity, 1, 1, (byte) 1);
											_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
											_entityToSpawn.shoot((entity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (entity.getLookAngle().y), (entity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3,
													0);
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
											}.getArrow(projectileLevel, entity, 1, 1, (byte) 1);
											_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
											_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), 3, 0);
											projectileLevel.addFreshEntity(_entityToSpawn);
										}
										JojowosMod.queueServerWork(5, () -> {
											entity.getPersistentData().putBoolean("Attack", false);
											if (world instanceof ServerLevel _level)
												_level.getServer().getCommands().performPrefixedCommand(
														new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
																.withSuppressedOutput(),
														"particle minecraft:dust 0.137 0.439 0.29 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
											if (world instanceof Level _level) {
												if (!_level.isClientSide()) {
													_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.fishing_bobber.splash")), SoundSource.PLAYERS, 1, 1);
												} else {
													_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.fishing_bobber.splash")), SoundSource.PLAYERS, 1, 1, false);
												}
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
												}.getArrow(projectileLevel, entity, 1, 1, (byte) 1);
												_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
												_entityToSpawn.shoot((entity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (entity.getLookAngle().y),
														(entity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
												}.getArrow(projectileLevel, entity, 1, 1, (byte) 1);
												_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
												_entityToSpawn.shoot((entity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (entity.getLookAngle().y),
														(entity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
												}.getArrow(projectileLevel, entity, 1, 1, (byte) 1);
												_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
												_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), 3, 0);
												projectileLevel.addFreshEntity(_entityToSpawn);
											}
											JojowosMod.queueServerWork(5, () -> {
												if (world instanceof Level _level) {
													if (!_level.isClientSide()) {
														_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.fishing_bobber.splash")), SoundSource.PLAYERS, 1, 1);
													} else {
														_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.fishing_bobber.splash")), SoundSource.PLAYERS, 1, 1, false);
													}
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
													}.getArrow(projectileLevel, entity, 1, 1, (byte) 1);
													_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
													_entityToSpawn.shoot((entity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (entity.getLookAngle().y),
															(entity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
													}.getArrow(projectileLevel, entity, 1, 1, (byte) 1);
													_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
													_entityToSpawn.shoot((entity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (entity.getLookAngle().y),
															(entity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
													}.getArrow(projectileLevel, entity, 1, 1, (byte) 1);
													_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
													_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), 3, 0);
													projectileLevel.addFreshEntity(_entityToSpawn);
												}
												JojowosMod.queueServerWork(5, () -> {
													if (world instanceof Level _level) {
														if (!_level.isClientSide()) {
															_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.fishing_bobber.splash")), SoundSource.PLAYERS, 1, 1);
														} else {
															_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.fishing_bobber.splash")), SoundSource.PLAYERS, 1, 1, false);
														}
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
														}.getArrow(projectileLevel, entity, 1, 1, (byte) 1);
														_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
														_entityToSpawn.shoot((entity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (entity.getLookAngle().y),
																(entity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
														}.getArrow(projectileLevel, entity, 1, 1, (byte) 1);
														_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
														_entityToSpawn.shoot((entity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (entity.getLookAngle().y),
																(entity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
														}.getArrow(projectileLevel, entity, 1, 1, (byte) 1);
														_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
														_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), 3, 0);
														projectileLevel.addFreshEntity(_entityToSpawn);
													}
													JojowosMod.queueServerWork(5, () -> {
														if (world instanceof Level _level) {
															if (!_level.isClientSide()) {
																_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.fishing_bobber.splash")), SoundSource.PLAYERS, 1, 1);
															} else {
																_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.fishing_bobber.splash")), SoundSource.PLAYERS, 1, 1, false);
															}
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
															}.getArrow(projectileLevel, entity, 1, 1, (byte) 1);
															_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
															_entityToSpawn.shoot((entity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (entity.getLookAngle().y),
																	(entity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
															}.getArrow(projectileLevel, entity, 1, 1, (byte) 1);
															_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
															_entityToSpawn.shoot((entity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (entity.getLookAngle().y),
																	(entity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
															}.getArrow(projectileLevel, entity, 1, 1, (byte) 1);
															_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
															_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), 3, 0);
															projectileLevel.addFreshEntity(_entityToSpawn);
														}
													});
												});
											});
										});
									});
								});
							});
						});
					});
				});
			});
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Emerald Splash is on Cooldown!"), true);
		}
	}
}
