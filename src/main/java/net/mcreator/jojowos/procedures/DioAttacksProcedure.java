package net.mcreator.jojowos.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.arguments.EntityAnchorArgument;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.jojowos.init.JojowosModMobEffects;
import net.mcreator.jojowos.init.JojowosModEntities;
import net.mcreator.jojowos.entity.ThrowingKnifeProjectileEntity;
import net.mcreator.jojowos.entity.RoadRollerProjectileEntity;
import net.mcreator.jojowos.entity.InvisFistProjectileEntity;
import net.mcreator.jojowos.entity.DIOEntity;
import net.mcreator.jojowos.entity.DIOCapedEntity;
import net.mcreator.jojowos.entity.DIOAwakenedEntity;
import net.mcreator.jojowos.configuration.ConfigFilesConfiguration;
import net.mcreator.jojowos.JojowosMod;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class DioAttacksProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(), event.getSource().getDirectEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		execute(null, world, x, y, z, entity, immediatesourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		boolean gate = false;
		double randomnumber = 0;
		double randomnumber2 = 0;
		double randomnumber3 = 0;
		if (immediatesourceentity instanceof DIOCapedEntity || immediatesourceentity instanceof DIOEntity || immediatesourceentity instanceof DIOAwakenedEntity) {
			randomnumber = Mth.nextInt(RandomSource.create(), 1, 20);
			if (immediatesourceentity.getPersistentData().getDouble("AttackCooldown") == 0) {
				if (randomnumber >= 1 && randomnumber <= 4) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:dio_atk_1")), SoundSource.HOSTILE, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:dio_atk_1")), SoundSource.HOSTILE, 1, 1, false);
						}
					}
					if (immediatesourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 15, 9, false, false));
					JojowosMod.queueServerWork(10, () -> {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:the_world_atk_1")), SoundSource.HOSTILE, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:the_world_atk_1")), SoundSource.HOSTILE, 1, 1, false);
							}
						}
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 6);
					});
					if (immediatesourceentity instanceof DIOEntity) {
						((DIOEntity) immediatesourceentity).setAnimation("attack1");
					}
					if (immediatesourceentity instanceof DIOAwakenedEntity) {
						((DIOAwakenedEntity) immediatesourceentity).setAnimation("attack1");
					}
					if (immediatesourceentity instanceof DIOCapedEntity) {
						((DIOCapedEntity) immediatesourceentity).setAnimation("attack1");
					}
					immediatesourceentity.getPersistentData().putDouble("AttackCooldown", 20);
				}
				if (randomnumber >= 5 && randomnumber <= 8) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:dio_atk_2")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:dio_atk_2")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (immediatesourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 15, 9, false, false));
					JojowosMod.queueServerWork(10, () -> {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:the_world_atk_2")), SoundSource.HOSTILE, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:the_world_atk_2")), SoundSource.HOSTILE, 1, 1, false);
							}
						}
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 6);
					});
					if (immediatesourceentity instanceof DIOEntity) {
						((DIOEntity) immediatesourceentity).setAnimation("attack2");
					}
					if (immediatesourceentity instanceof DIOAwakenedEntity) {
						((DIOAwakenedEntity) immediatesourceentity).setAnimation("attack2");
					}
					if (immediatesourceentity instanceof DIOCapedEntity) {
						((DIOCapedEntity) immediatesourceentity).setAnimation("attack2");
					}
					immediatesourceentity.getPersistentData().putDouble("AttackCooldown", 20);
				}
				if (randomnumber >= 9 && randomnumber <= 12) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:dio_atk_3")), SoundSource.HOSTILE, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:dio_atk_3")), SoundSource.HOSTILE, 1, 1, false);
						}
					}
					if (immediatesourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 10, 9, false, false));
					JojowosMod.queueServerWork(10, () -> {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:the_world_atk_3")), SoundSource.HOSTILE, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:the_world_atk_3")), SoundSource.HOSTILE, 1, 1, false);
							}
						}
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 6);
					});
					if (immediatesourceentity instanceof DIOEntity) {
						((DIOEntity) immediatesourceentity).setAnimation("attack3");
					}
					if (immediatesourceentity instanceof DIOAwakenedEntity) {
						((DIOAwakenedEntity) immediatesourceentity).setAnimation("attack3");
					}
					if (immediatesourceentity instanceof DIOCapedEntity) {
						((DIOCapedEntity) immediatesourceentity).setAnimation("attack3");
					}
					immediatesourceentity.getPersistentData().putDouble("AttackCooldown", 40);
				}
				if (randomnumber >= 13 && randomnumber <= 16) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:theworld_barrage")), SoundSource.HOSTILE, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:theworld_barrage")), SoundSource.HOSTILE, 1, 1, false);
						}
					}
					if (immediatesourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 65, 9, false, false));
					if (immediatesourceentity instanceof DIOEntity) {
						((DIOEntity) immediatesourceentity).setAnimation("barrage");
					}
					if (immediatesourceentity instanceof DIOAwakenedEntity) {
						((DIOAwakenedEntity) immediatesourceentity).setAnimation("barrage");
					}
					if (immediatesourceentity instanceof DIOCapedEntity) {
						((DIOCapedEntity) immediatesourceentity).setAnimation("barrage");
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.shoot")), SoundSource.PLAYERS, 1, (float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5));
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.shoot")), SoundSource.PLAYERS, 1, (float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5), false);
						}
					}
					if (world instanceof ServerLevel projectileLevel) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
								AbstractArrow entityToSpawn = new InvisFistProjectileEntity(JojowosModEntities.INVIS_FIST_PROJECTILE.get(), level);
								entityToSpawn.setOwner(shooter);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								entityToSpawn.setPierceLevel(piercing);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, immediatesourceentity, 4, (int) 0.1, (byte) 1);
						_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
						_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x), (immediatesourceentity.getLookAngle().y), (immediatesourceentity.getLookAngle().z), (float) 1.2, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
					JojowosMod.queueServerWork(4, () -> {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"kill @e[type=jojowos:invis_fist_projectile,limit=3]");
						JojowosMod.queueServerWork(1, () -> {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")), SoundSource.PLAYERS, 1,
											(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5));
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")), SoundSource.PLAYERS, 1, (float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5), false);
								}
							}
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
										AbstractArrow entityToSpawn = new InvisFistProjectileEntity(JojowosModEntities.INVIS_FIST_PROJECTILE.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										entityToSpawn.setPierceLevel(piercing);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, immediatesourceentity, 4, (int) 0.1, (byte) 1);
								_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
								_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x), (immediatesourceentity.getLookAngle().y), (immediatesourceentity.getLookAngle().z), (float) 1.2, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
							JojowosMod.queueServerWork(4, () -> {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"kill @e[type=jojowos:invis_fist_projectile,limit=3]");
								JojowosMod.queueServerWork(1, () -> {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")), SoundSource.PLAYERS, 1,
													(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5));
										} else {
											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")), SoundSource.PLAYERS, 1, (float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5), false);
										}
									}
									if (world instanceof ServerLevel projectileLevel) {
										Projectile _entityToSpawn = new Object() {
											public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
												AbstractArrow entityToSpawn = new InvisFistProjectileEntity(JojowosModEntities.INVIS_FIST_PROJECTILE.get(), level);
												entityToSpawn.setOwner(shooter);
												entityToSpawn.setBaseDamage(damage);
												entityToSpawn.setKnockback(knockback);
												entityToSpawn.setSilent(true);
												entityToSpawn.setPierceLevel(piercing);
												return entityToSpawn;
											}
										}.getArrow(projectileLevel, immediatesourceentity, 4, (int) 0.1, (byte) 1);
										_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
										_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x), (immediatesourceentity.getLookAngle().y), (immediatesourceentity.getLookAngle().z), (float) 1.2, 0);
										projectileLevel.addFreshEntity(_entityToSpawn);
									}
									JojowosMod.queueServerWork(4, () -> {
										if (world instanceof ServerLevel _level)
											_level.getServer().getCommands().performPrefixedCommand(
													new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
													"kill @e[type=jojowos:invis_fist_projectile,limit=3]");
										JojowosMod.queueServerWork(1, () -> {
											if (world instanceof Level _level) {
												if (!_level.isClientSide()) {
													_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")), SoundSource.PLAYERS, 1,
															(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5));
												} else {
													_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")), SoundSource.PLAYERS, 1, (float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5),
															false);
												}
											}
											if (world instanceof ServerLevel projectileLevel) {
												Projectile _entityToSpawn = new Object() {
													public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
														AbstractArrow entityToSpawn = new InvisFistProjectileEntity(JojowosModEntities.INVIS_FIST_PROJECTILE.get(), level);
														entityToSpawn.setOwner(shooter);
														entityToSpawn.setBaseDamage(damage);
														entityToSpawn.setKnockback(knockback);
														entityToSpawn.setSilent(true);
														entityToSpawn.setPierceLevel(piercing);
														return entityToSpawn;
													}
												}.getArrow(projectileLevel, immediatesourceentity, 4, (int) 0.1, (byte) 1);
												_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
												_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x), (immediatesourceentity.getLookAngle().y), (immediatesourceentity.getLookAngle().z), (float) 1.2, 0);
												projectileLevel.addFreshEntity(_entityToSpawn);
											}
											JojowosMod.queueServerWork(4, () -> {
												if (world instanceof ServerLevel _level)
													_level.getServer().getCommands().performPrefixedCommand(
															new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
															"kill @e[type=jojowos:invis_fist_projectile,limit=3]");
												JojowosMod.queueServerWork(1, () -> {
													if (world instanceof Level _level) {
														if (!_level.isClientSide()) {
															_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")), SoundSource.PLAYERS, 1,
																	(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5));
														} else {
															_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")), SoundSource.PLAYERS, 1,
																	(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5), false);
														}
													}
													if (world instanceof ServerLevel projectileLevel) {
														Projectile _entityToSpawn = new Object() {
															public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
																AbstractArrow entityToSpawn = new InvisFistProjectileEntity(JojowosModEntities.INVIS_FIST_PROJECTILE.get(), level);
																entityToSpawn.setOwner(shooter);
																entityToSpawn.setBaseDamage(damage);
																entityToSpawn.setKnockback(knockback);
																entityToSpawn.setSilent(true);
																entityToSpawn.setPierceLevel(piercing);
																return entityToSpawn;
															}
														}.getArrow(projectileLevel, immediatesourceentity, 4, (int) 0.1, (byte) 1);
														_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
														_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x), (immediatesourceentity.getLookAngle().y), (immediatesourceentity.getLookAngle().z), (float) 1.2, 0);
														projectileLevel.addFreshEntity(_entityToSpawn);
													}
													JojowosMod.queueServerWork(4, () -> {
														if (world instanceof ServerLevel _level)
															_level.getServer().getCommands().performPrefixedCommand(
																	new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
																	"kill @e[type=jojowos:invis_fist_projectile,limit=3]");
														JojowosMod.queueServerWork(1, () -> {
															if (world instanceof Level _level) {
																if (!_level.isClientSide()) {
																	_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")), SoundSource.PLAYERS, 1,
																			(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5));
																} else {
																	_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")), SoundSource.PLAYERS, 1,
																			(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5), false);
																}
															}
															if (world instanceof ServerLevel projectileLevel) {
																Projectile _entityToSpawn = new Object() {
																	public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
																		AbstractArrow entityToSpawn = new InvisFistProjectileEntity(JojowosModEntities.INVIS_FIST_PROJECTILE.get(), level);
																		entityToSpawn.setOwner(shooter);
																		entityToSpawn.setBaseDamage(damage);
																		entityToSpawn.setKnockback(knockback);
																		entityToSpawn.setSilent(true);
																		entityToSpawn.setPierceLevel(piercing);
																		return entityToSpawn;
																	}
																}.getArrow(projectileLevel, immediatesourceentity, 4, (int) 0.1, (byte) 1);
																_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
																_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x), (immediatesourceentity.getLookAngle().y), (immediatesourceentity.getLookAngle().z), (float) 1.2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															JojowosMod.queueServerWork(4, () -> {
																if (world instanceof ServerLevel _level)
																	_level.getServer().getCommands().performPrefixedCommand(
																			new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
																			"kill @e[type=jojowos:invis_fist_projectile,limit=3]");
																JojowosMod.queueServerWork(1, () -> {
																	if (world instanceof Level _level) {
																		if (!_level.isClientSide()) {
																			_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")), SoundSource.PLAYERS, 1,
																					(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5));
																		} else {
																			_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")), SoundSource.PLAYERS, 1,
																					(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5), false);
																		}
																	}
																	if (world instanceof ServerLevel projectileLevel) {
																		Projectile _entityToSpawn = new Object() {
																			public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
																				AbstractArrow entityToSpawn = new InvisFistProjectileEntity(JojowosModEntities.INVIS_FIST_PROJECTILE.get(), level);
																				entityToSpawn.setOwner(shooter);
																				entityToSpawn.setBaseDamage(damage);
																				entityToSpawn.setKnockback(knockback);
																				entityToSpawn.setSilent(true);
																				entityToSpawn.setPierceLevel(piercing);
																				return entityToSpawn;
																			}
																		}.getArrow(projectileLevel, immediatesourceentity, 4, (int) 0.1, (byte) 1);
																		_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
																		_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x), (immediatesourceentity.getLookAngle().y), (immediatesourceentity.getLookAngle().z), (float) 1.2, 0);
																		projectileLevel.addFreshEntity(_entityToSpawn);
																	}
																	JojowosMod.queueServerWork(4, () -> {
																		if (world instanceof ServerLevel _level)
																			_level.getServer().getCommands().performPrefixedCommand(
																					new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
																					"kill @e[type=jojowos:invis_fist_projectile,limit=3]");
																		JojowosMod.queueServerWork(1, () -> {
																			if (world instanceof Level _level) {
																				if (!_level.isClientSide()) {
																					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")), SoundSource.PLAYERS, 1,
																							(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5));
																				} else {
																					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")), SoundSource.PLAYERS, 1,
																							(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5), false);
																				}
																			}
																			if (world instanceof ServerLevel projectileLevel) {
																				Projectile _entityToSpawn = new Object() {
																					public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
																						AbstractArrow entityToSpawn = new InvisFistProjectileEntity(JojowosModEntities.INVIS_FIST_PROJECTILE.get(), level);
																						entityToSpawn.setOwner(shooter);
																						entityToSpawn.setBaseDamage(damage);
																						entityToSpawn.setKnockback(knockback);
																						entityToSpawn.setSilent(true);
																						entityToSpawn.setPierceLevel(piercing);
																						return entityToSpawn;
																					}
																				}.getArrow(projectileLevel, immediatesourceentity, 4, (int) 0.1, (byte) 1);
																				_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
																				_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x), (immediatesourceentity.getLookAngle().y), (immediatesourceentity.getLookAngle().z), (float) 1.2, 0);
																				projectileLevel.addFreshEntity(_entityToSpawn);
																			}
																			JojowosMod.queueServerWork(4, () -> {
																				if (world instanceof ServerLevel _level)
																					_level.getServer().getCommands().performPrefixedCommand(
																							new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
																									.withSuppressedOutput(),
																							"kill @e[type=jojowos:invis_fist_projectile,limit=3]");
																				JojowosMod.queueServerWork(1, () -> {
																					if (world instanceof Level _level) {
																						if (!_level.isClientSide()) {
																							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")), SoundSource.PLAYERS,
																									1, (float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5));
																						} else {
																							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")), SoundSource.PLAYERS, 1,
																									(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5), false);
																						}
																					}
																					if (world instanceof ServerLevel projectileLevel) {
																						Projectile _entityToSpawn = new Object() {
																							public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
																								AbstractArrow entityToSpawn = new InvisFistProjectileEntity(JojowosModEntities.INVIS_FIST_PROJECTILE.get(), level);
																								entityToSpawn.setOwner(shooter);
																								entityToSpawn.setBaseDamage(damage);
																								entityToSpawn.setKnockback(knockback);
																								entityToSpawn.setSilent(true);
																								entityToSpawn.setPierceLevel(piercing);
																								return entityToSpawn;
																							}
																						}.getArrow(projectileLevel, immediatesourceentity, 4, (int) 0.1, (byte) 1);
																						_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
																						_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x), (immediatesourceentity.getLookAngle().y), (immediatesourceentity.getLookAngle().z), (float) 1.2,
																								0);
																						projectileLevel.addFreshEntity(_entityToSpawn);
																					}
																					JojowosMod.queueServerWork(4, () -> {
																						if (world instanceof ServerLevel _level)
																							_level.getServer().getCommands().performPrefixedCommand(
																									new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
																											.withSuppressedOutput(),
																									"kill @e[type=jojowos:invis_fist_projectile,limit=3]");
																						JojowosMod.queueServerWork(1, () -> {
																							if (world instanceof Level _level) {
																								if (!_level.isClientSide()) {
																									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")),
																											SoundSource.PLAYERS, 1, (float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5));
																								} else {
																									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")), SoundSource.PLAYERS, 1,
																											(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5), false);
																								}
																							}
																							if (world instanceof ServerLevel projectileLevel) {
																								Projectile _entityToSpawn = new Object() {
																									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
																										AbstractArrow entityToSpawn = new InvisFistProjectileEntity(JojowosModEntities.INVIS_FIST_PROJECTILE.get(), level);
																										entityToSpawn.setOwner(shooter);
																										entityToSpawn.setBaseDamage(damage);
																										entityToSpawn.setKnockback(knockback);
																										entityToSpawn.setSilent(true);
																										entityToSpawn.setPierceLevel(piercing);
																										return entityToSpawn;
																									}
																								}.getArrow(projectileLevel, immediatesourceentity, 4, (int) 0.1, (byte) 1);
																								_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
																								_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x), (immediatesourceentity.getLookAngle().y), (immediatesourceentity.getLookAngle().z),
																										(float) 1.2, 0);
																								projectileLevel.addFreshEntity(_entityToSpawn);
																							}
																							JojowosMod.queueServerWork(4, () -> {
																								if (world instanceof ServerLevel _level)
																									_level.getServer().getCommands().performPrefixedCommand(
																											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
																													.withSuppressedOutput(),
																											"kill @e[type=jojowos:invis_fist_projectile,limit=3]");
																								JojowosMod.queueServerWork(1, () -> {
																									if (world instanceof Level _level) {
																										if (!_level.isClientSide()) {
																											_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")),
																													SoundSource.PLAYERS, 1, (float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5));
																										} else {
																											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")), SoundSource.PLAYERS, 1,
																													(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5), false);
																										}
																									}
																									if (world instanceof ServerLevel projectileLevel) {
																										Projectile _entityToSpawn = new Object() {
																											public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
																												AbstractArrow entityToSpawn = new InvisFistProjectileEntity(JojowosModEntities.INVIS_FIST_PROJECTILE.get(), level);
																												entityToSpawn.setOwner(shooter);
																												entityToSpawn.setBaseDamage(damage);
																												entityToSpawn.setKnockback(knockback);
																												entityToSpawn.setSilent(true);
																												entityToSpawn.setPierceLevel(piercing);
																												return entityToSpawn;
																											}
																										}.getArrow(projectileLevel, immediatesourceentity, 4, (int) 0.1, (byte) 1);
																										_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
																										_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x), (immediatesourceentity.getLookAngle().y), (immediatesourceentity.getLookAngle().z),
																												(float) 1.2, 0);
																										projectileLevel.addFreshEntity(_entityToSpawn);
																									}
																									JojowosMod.queueServerWork(4, () -> {
																										if (world instanceof ServerLevel _level)
																											_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
																													"", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "kill @e[type=jojowos:invis_fist_projectile,limit=3]");
																										JojowosMod.queueServerWork(1, () -> {
																											if (world instanceof Level _level) {
																												if (!_level.isClientSide()) {
																													_level.playSound(null, BlockPos.containing(x, y, z),
																															ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")), SoundSource.PLAYERS, 1,
																															(float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5));
																												} else {
																													_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")), SoundSource.PLAYERS,
																															1, (float) Mth.nextDouble(RandomSource.create(), 0.5, 1.5), false);
																												}
																											}
																											if (world instanceof ServerLevel projectileLevel) {
																												Projectile _entityToSpawn = new Object() {
																													public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
																														AbstractArrow entityToSpawn = new InvisFistProjectileEntity(JojowosModEntities.INVIS_FIST_PROJECTILE.get(), level);
																														entityToSpawn.setOwner(shooter);
																														entityToSpawn.setBaseDamage(damage);
																														entityToSpawn.setKnockback(knockback);
																														entityToSpawn.setSilent(true);
																														entityToSpawn.setPierceLevel(piercing);
																														return entityToSpawn;
																													}
																												}.getArrow(projectileLevel, immediatesourceentity, 4, (int) 0.1, (byte) 1);
																												_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
																												_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x), (immediatesourceentity.getLookAngle().y),
																														(immediatesourceentity.getLookAngle().z), (float) 1.2, 0);
																												projectileLevel.addFreshEntity(_entityToSpawn);
																											}
																											JojowosMod.queueServerWork(4, () -> {
																												if (world instanceof ServerLevel _level)
																													_level.getServer().getCommands()
																															.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
																																	Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
																																	"kill @e[type=jojowos:invis_fist_projectile,limit=3]");
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
					});
					immediatesourceentity.getPersistentData().putDouble("AttackCooldown", 70);
				}
				if (randomnumber >= 17 && randomnumber <= 18) {
					if (immediatesourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 65, 9, false, false));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:theworld_knife_throw")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:theworld_knife_throw")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
					if (world instanceof ServerLevel projectileLevel) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
								AbstractArrow entityToSpawn = new ThrowingKnifeProjectileEntity(JojowosModEntities.THROWING_KNIFE_PROJECTILE.get(), level);
								entityToSpawn.setOwner(shooter);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								entityToSpawn.setPierceLevel(piercing);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, immediatesourceentity, 3, 1, (byte) 2);
						_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
						_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (immediatesourceentity.getLookAngle().y),
								(immediatesourceentity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 2, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
					if (world instanceof ServerLevel projectileLevel) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
								AbstractArrow entityToSpawn = new ThrowingKnifeProjectileEntity(JojowosModEntities.THROWING_KNIFE_PROJECTILE.get(), level);
								entityToSpawn.setOwner(shooter);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								entityToSpawn.setPierceLevel(piercing);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, immediatesourceentity, 3, 1, (byte) 2);
						_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
						_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (immediatesourceentity.getLookAngle().y),
								(immediatesourceentity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 2, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
					if (world instanceof ServerLevel projectileLevel) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
								AbstractArrow entityToSpawn = new ThrowingKnifeProjectileEntity(JojowosModEntities.THROWING_KNIFE_PROJECTILE.get(), level);
								entityToSpawn.setOwner(shooter);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								entityToSpawn.setPierceLevel(piercing);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, immediatesourceentity, 3, 1, (byte) 2);
						_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
						_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x), (immediatesourceentity.getLookAngle().y), (immediatesourceentity.getLookAngle().z), 2, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
					JojowosMod.queueServerWork(10, () -> {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.PLAYERS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.PLAYERS, 1, 1, false);
							}
						}
						if (world instanceof ServerLevel projectileLevel) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
									AbstractArrow entityToSpawn = new ThrowingKnifeProjectileEntity(JojowosModEntities.THROWING_KNIFE_PROJECTILE.get(), level);
									entityToSpawn.setOwner(shooter);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									entityToSpawn.setPierceLevel(piercing);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, immediatesourceentity, 3, 1, (byte) 2);
							_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
							_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (immediatesourceentity.getLookAngle().y),
									(immediatesourceentity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 2, 0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
						if (world instanceof ServerLevel projectileLevel) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
									AbstractArrow entityToSpawn = new ThrowingKnifeProjectileEntity(JojowosModEntities.THROWING_KNIFE_PROJECTILE.get(), level);
									entityToSpawn.setOwner(shooter);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									entityToSpawn.setPierceLevel(piercing);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, immediatesourceentity, 3, 1, (byte) 2);
							_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
							_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (immediatesourceentity.getLookAngle().y),
									(immediatesourceentity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 2, 0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
						if (world instanceof ServerLevel projectileLevel) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
									AbstractArrow entityToSpawn = new ThrowingKnifeProjectileEntity(JojowosModEntities.THROWING_KNIFE_PROJECTILE.get(), level);
									entityToSpawn.setOwner(shooter);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									entityToSpawn.setPierceLevel(piercing);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, immediatesourceentity, 3, 1, (byte) 2);
							_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
							_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x), (immediatesourceentity.getLookAngle().y), (immediatesourceentity.getLookAngle().z), 2, 0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
						JojowosMod.queueServerWork(10, () -> {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
										AbstractArrow entityToSpawn = new ThrowingKnifeProjectileEntity(JojowosModEntities.THROWING_KNIFE_PROJECTILE.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										entityToSpawn.setPierceLevel(piercing);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, immediatesourceentity, 3, 1, (byte) 2);
								_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
								_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (immediatesourceentity.getLookAngle().y),
										(immediatesourceentity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 2, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
										AbstractArrow entityToSpawn = new ThrowingKnifeProjectileEntity(JojowosModEntities.THROWING_KNIFE_PROJECTILE.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										entityToSpawn.setPierceLevel(piercing);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, immediatesourceentity, 3, 1, (byte) 2);
								_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
								_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (immediatesourceentity.getLookAngle().y),
										(immediatesourceentity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 2, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
										AbstractArrow entityToSpawn = new ThrowingKnifeProjectileEntity(JojowosModEntities.THROWING_KNIFE_PROJECTILE.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										entityToSpawn.setPierceLevel(piercing);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, immediatesourceentity, 3, 1, (byte) 2);
								_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
								_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x), (immediatesourceentity.getLookAngle().y), (immediatesourceentity.getLookAngle().z), 2, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						});
					});
					immediatesourceentity.getPersistentData().putDouble("AttackCooldown", 140);
				}
				if (randomnumber >= 19 && randomnumber <= 20) {
					if (immediatesourceentity instanceof LivingEntity _livEnt288 && _livEnt288.hasEffect(JojowosModMobEffects.STOPPED_TIME.get()) && immediatesourceentity instanceof DIOAwakenedEntity) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:theworld_roadroller")), SoundSource.HOSTILE, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:theworld_roadroller")), SoundSource.HOSTILE, 1, 1, false);
							}
						}
						if (immediatesourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 65, 9, false, false));
						if (immediatesourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(JojowosModMobEffects.STAND_JUMP_EFFECT.get(), 100, 0, false, false));
						immediatesourceentity.setDeltaMovement(new Vec3(0, (immediatesourceentity.getDeltaMovement().y() + 3), 0));
						JojowosMod.queueServerWork(20, () -> {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.place")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.place")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
							immediatesourceentity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(x, y, z));
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
										AbstractArrow entityToSpawn = new RoadRollerProjectileEntity(JojowosModEntities.ROAD_ROLLER_PROJECTILE.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										entityToSpawn.setPierceLevel(piercing);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, immediatesourceentity, 5, 1, (byte) 1);
								_entityToSpawn.setPos((immediatesourceentity.getX() + 1), (immediatesourceentity.getY() - 3), (immediatesourceentity.getZ()));
								_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x), (immediatesourceentity.getLookAngle().y), (immediatesourceentity.getLookAngle().z), 5, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
							JojowosMod.queueServerWork(20, () -> {
								immediatesourceentity.setDeltaMovement(new Vec3((immediatesourceentity.getLookAngle().x * 2), (immediatesourceentity.getLookAngle().y * 2 + 0.5), (immediatesourceentity.getLookAngle().z * 2)));
							});
						});
						immediatesourceentity.getPersistentData().putDouble("AttackCooldown", 100);
					}
				}
			}
			if (immediatesourceentity.getPersistentData().getDouble("Ability1Cooldown") == 0) {
				if (ConfigFilesConfiguration.NPCTIMEMANIPULATION.get() == true || entity instanceof Player) {
					if (randomnumber >= 19 && randomnumber <= 20) {
						immediatesourceentity.getPersistentData().putDouble("Ability1Cooldown", 600);
						gate = false;
						if (entity instanceof DIOEntity) {
							immediatesourceentity.getPersistentData().putDouble("TimeStopLength", 100);
						}
						if (entity instanceof DIOAwakenedEntity) {
							immediatesourceentity.getPersistentData().putDouble("TimeStopLength", 180);
						}
						if (immediatesourceentity.getPersistentData().getDouble("TimeStopLength") == 100) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:theworld_shorttimestop")), SoundSource.HOSTILE, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:theworld_shorttimestop")), SoundSource.HOSTILE, 1, 1, false);
								}
							}
							JojowosMod.queueServerWork(15, () -> {
								{
									final Vec3 _center = new Vec3(x, y, z);
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(200 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.toList();
									for (Entity entityiterator : _entfound) {
										if ((entityiterator == immediatesourceentity) == false && entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("jojowos:stand_mob"))) == false) {
											entityiterator.getPersistentData().putDouble("TimeX", (entityiterator.getDeltaMovement().x()));
											entityiterator.getPersistentData().putDouble("TimeY", (entityiterator.getDeltaMovement().y()));
											entityiterator.getPersistentData().putDouble("TimeZ", (entityiterator.getDeltaMovement().z()));
											entityiterator.getPersistentData().putDouble("LookX", (entityiterator.level().clip(new ClipContext(entityiterator.getEyePosition(1f),
													entityiterator.getEyePosition(1f).add(entityiterator.getViewVector(1f).scale(100)), ClipContext.Block.COLLIDER, ClipContext.Fluid.ANY, entityiterator)).getBlockPos().getX()));
											entityiterator.getPersistentData().putDouble("LookY", (entityiterator.level().clip(new ClipContext(entityiterator.getEyePosition(1f),
													entityiterator.getEyePosition(1f).add(entityiterator.getViewVector(1f).scale(100)), ClipContext.Block.COLLIDER, ClipContext.Fluid.ANY, entityiterator)).getBlockPos().getY()));
											entityiterator.getPersistentData().putDouble("LookZ", (entityiterator.level().clip(new ClipContext(entityiterator.getEyePosition(1f),
													entityiterator.getEyePosition(1f).add(entityiterator.getViewVector(1f).scale(100)), ClipContext.Block.COLLIDER, ClipContext.Fluid.ANY, entityiterator)).getBlockPos().getZ()));
											entityiterator.getPersistentData().putBoolean("InitialStop", true);
										}
									}
								}
							});
							JojowosMod.queueServerWork(16, () -> {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"particle minecraft:dust 0.263 0.278 0.29 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
								if (immediatesourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 10, 2, false, false));
								if (immediatesourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(JojowosModMobEffects.STOPPED_TIME.get(), (int) immediatesourceentity.getPersistentData().getDouble("TimeStopLength"), 0, false, false));
								JojowosMod.queueServerWork((int) (immediatesourceentity.getPersistentData().getDouble("TimeStopLength") - 35), () -> {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:theworld_returntime")), SoundSource.HOSTILE, 1, 1);
										} else {
											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:theworld_returntime")), SoundSource.HOSTILE, 1, 1, false);
										}
									}
								});
								JojowosMod.queueServerWork((int) immediatesourceentity.getPersistentData().getDouble("TimeStopLength"), () -> {
									if (immediatesourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 10, 2, false, false));
									{
										final Vec3 _center = new Vec3(x, y, z);
										List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(200 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
												.toList();
										for (Entity entityiterator : _entfound) {
											if ((entityiterator == immediatesourceentity) == false && entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("jojowos:stand_mob"))) == false) {
												entityiterator.setDeltaMovement(
														new Vec3((entityiterator.getPersistentData().getDouble("TimeX")), (entityiterator.getPersistentData().getDouble("TimeY")), (entityiterator.getPersistentData().getDouble("TimeZ"))));
												entityiterator.getPersistentData().putBoolean("InitialStop", false);
											}
										}
									}
								});
							});
							if (immediatesourceentity instanceof DIOEntity) {
								((DIOEntity) immediatesourceentity).setAnimation("theworld");
							}
						}
						if (immediatesourceentity.getPersistentData().getDouble("TimeStopLength") == 180) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:theworld_stoptime")), SoundSource.HOSTILE, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:theworld_stoptime")), SoundSource.HOSTILE, 1, 1, false);
								}
							}
							JojowosMod.queueServerWork(25, () -> {
								{
									final Vec3 _center = new Vec3(x, y, z);
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(200 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.toList();
									for (Entity entityiterator : _entfound) {
										if ((entityiterator == immediatesourceentity) == false && entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("jojowos:stand_mob"))) == false) {
											entityiterator.getPersistentData().putDouble("TimeX", (entityiterator.getDeltaMovement().x()));
											entityiterator.getPersistentData().putDouble("TimeY", (entityiterator.getDeltaMovement().y()));
											entityiterator.getPersistentData().putDouble("TimeZ", (entityiterator.getDeltaMovement().z()));
											entityiterator.getPersistentData().putDouble("LookX", (entityiterator.level().clip(new ClipContext(entityiterator.getEyePosition(1f),
													entityiterator.getEyePosition(1f).add(entityiterator.getViewVector(1f).scale(100)), ClipContext.Block.COLLIDER, ClipContext.Fluid.ANY, entityiterator)).getBlockPos().getX()));
											entityiterator.getPersistentData().putDouble("LookY", (entityiterator.level().clip(new ClipContext(entityiterator.getEyePosition(1f),
													entityiterator.getEyePosition(1f).add(entityiterator.getViewVector(1f).scale(100)), ClipContext.Block.COLLIDER, ClipContext.Fluid.ANY, entityiterator)).getBlockPos().getY()));
											entityiterator.getPersistentData().putDouble("LookZ", (entityiterator.level().clip(new ClipContext(entityiterator.getEyePosition(1f),
													entityiterator.getEyePosition(1f).add(entityiterator.getViewVector(1f).scale(100)), ClipContext.Block.COLLIDER, ClipContext.Fluid.ANY, entityiterator)).getBlockPos().getZ()));
											entityiterator.getPersistentData().putBoolean("InitialStop", true);
										}
									}
								}
							});
							JojowosMod.queueServerWork(26, () -> {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"particle minecraft:dust 0.263 0.278 0.29 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
								if (immediatesourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 10, 2, false, false));
								if (immediatesourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(JojowosModMobEffects.STOPPED_TIME.get(), (int) immediatesourceentity.getPersistentData().getDouble("TimeStopLength"), 0, false, false));
								JojowosMod.queueServerWork((int) (immediatesourceentity.getPersistentData().getDouble("TimeStopLength") - 30), () -> {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:theworld_returntimezero")), SoundSource.HOSTILE, 1, 1);
										} else {
											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:theworld_returntimezero")), SoundSource.HOSTILE, 1, 1, false);
										}
									}
								});
								JojowosMod.queueServerWork((int) immediatesourceentity.getPersistentData().getDouble("TimeStopLength"), () -> {
									if (immediatesourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 10, 2, false, false));
									{
										final Vec3 _center = new Vec3(x, y, z);
										List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(200 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
												.toList();
										for (Entity entityiterator : _entfound) {
											if ((entityiterator == immediatesourceentity) == false && entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("jojowos:stand_mob"))) == false) {
												entityiterator.setDeltaMovement(
														new Vec3((entityiterator.getPersistentData().getDouble("TimeX")), (entityiterator.getPersistentData().getDouble("TimeY")), (entityiterator.getPersistentData().getDouble("TimeZ"))));
												entityiterator.getPersistentData().putBoolean("InitialStop", false);
											}
										}
									}
								});
							});
							JojowosMod.queueServerWork(10, () -> {
								if (immediatesourceentity instanceof DIOAwakenedEntity) {
									((DIOAwakenedEntity) immediatesourceentity).setAnimation("theworld");
								}
							});
						}
					}
				}
			}
		}
		if (entity instanceof DIOCapedEntity || entity instanceof DIOEntity || entity instanceof DIOAwakenedEntity) {
			randomnumber2 = Mth.nextInt(RandomSource.create(), 1, 20);
			randomnumber3 = Mth.nextInt(RandomSource.create(), 1, 100);
			if (entity.getPersistentData().getDouble("PassiveCooldown") == 0) {
				if (randomnumber2 >= 17 && randomnumber2 <= 19) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(JojowosModMobEffects.STAND_JUMP_EFFECT.get(), 60, 0, false, false));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:dio_scoff")), SoundSource.HOSTILE, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:dio_scoff")), SoundSource.HOSTILE, 1, 1, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:stand_jump")), SoundSource.HOSTILE, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:stand_jump")), SoundSource.HOSTILE, 1, 1, false);
						}
					}
					entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * 2), (entity.getLookAngle().y * 2 + 0.5), (entity.getLookAngle().z * 2)));
					entity.getPersistentData().putDouble("PassiveCooldown", 100);
				}
				if (randomnumber2 == 20) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 10, 9, false, false));
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(JojowosModMobEffects.STAND_JUMP_EFFECT.get(), 30, 0, false, false));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:dio_too_slow")), SoundSource.HOSTILE, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:dio_too_slow")), SoundSource.HOSTILE, 1, 1, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:theworld_skiptime")), SoundSource.HOSTILE, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:theworld_skiptime")), SoundSource.HOSTILE, 1, 1, false);
						}
					}
					JojowosMod.queueServerWork(5, () -> {
						{
							Entity _ent = entity;
							_ent.teleportTo(
									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()
											+ 1),
									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos()
											.getZ()));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(
										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getX()),
										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getY() + 1),
										(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getZ()),
										_ent.getYRot(), _ent.getXRot());
						}
					});
					entity.getPersistentData().putDouble("PassiveCooldown", 200);
				}
			}
			if (randomnumber3 >= 80 && randomnumber3 <= 85) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:dio_hurt_1")), SoundSource.HOSTILE, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:dio_hurt_1")), SoundSource.HOSTILE, 1, 1, false);
					}
				}
			}
			if (randomnumber3 >= 86 && randomnumber3 <= 90) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:dio_hurt_2")), SoundSource.HOSTILE, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:dio_hurt_2")), SoundSource.HOSTILE, 1, 1, false);
					}
				}
			}
			if (randomnumber3 >= 91 && randomnumber3 <= 95) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:dio_hurt_3")), SoundSource.HOSTILE, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:dio_hurt_3")), SoundSource.HOSTILE, 1, 1, false);
					}
				}
			}
			if (randomnumber3 >= 96 && randomnumber3 <= 100) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:dio_hurt_4")), SoundSource.HOSTILE, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:dio_hurt_4")), SoundSource.HOSTILE, 1, 1, false);
					}
				}
			}
		}
	}
}
