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
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
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
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandFunction;

import net.mcreator.jojowos.init.JojowosModMobEffects;
import net.mcreator.jojowos.init.JojowosModEntities;
import net.mcreator.jojowos.entity.SmallCrossfireProjectileEntity;
import net.mcreator.jojowos.entity.MuhammedAvdolEntity;
import net.mcreator.jojowos.entity.LargeCrossfireProjectileEntity;
import net.mcreator.jojowos.JojowosMod;

import javax.annotation.Nullable;

import java.util.Optional;
import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class AvdolAttacksProcedure {
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
		if (immediatesourceentity instanceof MuhammedAvdolEntity) {
			randomnumber = Mth.nextInt(RandomSource.create(), 1, 14);
			if (immediatesourceentity.getPersistentData().getDouble("AttackCooldown") == 0) {
				if (randomnumber >= 1 && randomnumber <= 4) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:avdol_atk_1")), SoundSource.HOSTILE, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:avdol_atk_1")), SoundSource.HOSTILE, 1, 1, false);
						}
					}
					if (immediatesourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 15, 9, false, false));
					JojowosMod.queueServerWork(10, () -> {
						if (entity instanceof LivingEntity _entity)
							_entity.hurt(new DamageSource(_entity.level().registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)) {
								@Override
								public Component getLocalizedDeathMessage(LivingEntity _msgEntity) {
									String _translatekey = "death.attack." + "stand";
									if (this.getEntity() == null && this.getDirectEntity() == null) {
										return _msgEntity.getKillCredit() != null
												? Component.translatable(_translatekey + ".player", _msgEntity.getDisplayName(), _msgEntity.getKillCredit().getDisplayName())
												: Component.translatable(_translatekey, _msgEntity.getDisplayName());
									} else {
										Component _component = this.getEntity() == null ? this.getDirectEntity().getDisplayName() : this.getEntity().getDisplayName();
										ItemStack _itemstack = ItemStack.EMPTY;
										if (this.getEntity() instanceof LivingEntity _livingentity)
											_itemstack = _livingentity.getMainHandItem();
										return !_itemstack.isEmpty() && _itemstack.hasCustomHoverName()
												? Component.translatable(_translatekey + ".item", _msgEntity.getDisplayName(), _component, _itemstack.getDisplayName())
												: Component.translatable(_translatekey, _msgEntity.getDisplayName(), _component);
									}
								}
							}, 6);
					});
					if (immediatesourceentity instanceof MuhammedAvdolEntity) {
						((MuhammedAvdolEntity) immediatesourceentity).setAnimation("attack1");
					}
					immediatesourceentity.getPersistentData().putDouble("AttackCooldown", 20);
				}
				if (randomnumber >= 5 && randomnumber <= 8) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:avdol_atk_2")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:avdol_atk_2")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (immediatesourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 15, 9, false, false));
					JojowosMod.queueServerWork(10, () -> {
						if (entity instanceof LivingEntity _entity)
							_entity.hurt(new DamageSource(_entity.level().registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)) {
								@Override
								public Component getLocalizedDeathMessage(LivingEntity _msgEntity) {
									String _translatekey = "death.attack." + "stand";
									if (this.getEntity() == null && this.getDirectEntity() == null) {
										return _msgEntity.getKillCredit() != null
												? Component.translatable(_translatekey + ".player", _msgEntity.getDisplayName(), _msgEntity.getKillCredit().getDisplayName())
												: Component.translatable(_translatekey, _msgEntity.getDisplayName());
									} else {
										Component _component = this.getEntity() == null ? this.getDirectEntity().getDisplayName() : this.getEntity().getDisplayName();
										ItemStack _itemstack = ItemStack.EMPTY;
										if (this.getEntity() instanceof LivingEntity _livingentity)
											_itemstack = _livingentity.getMainHandItem();
										return !_itemstack.isEmpty() && _itemstack.hasCustomHoverName()
												? Component.translatable(_translatekey + ".item", _msgEntity.getDisplayName(), _component, _itemstack.getDisplayName())
												: Component.translatable(_translatekey, _msgEntity.getDisplayName(), _component);
									}
								}
							}, 6);
					});
					if (immediatesourceentity instanceof MuhammedAvdolEntity) {
						((MuhammedAvdolEntity) immediatesourceentity).setAnimation("attack2");
					}
					immediatesourceentity.getPersistentData().putDouble("AttackCooldown", 20);
				}
				if (randomnumber >= 9 && randomnumber <= 10) {
					if (immediatesourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 15, 9, false, false));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:magiciansred_redbind")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:magiciansred_redbind")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
					JojowosMod.queueServerWork(10, () -> {
						if (world instanceof ServerLevel _level && _level.getServer() != null) {
							Optional<CommandFunction> _fopt = _level.getServer().getFunctions().get(new ResourceLocation("jojowos:flame_circle"));
							if (_fopt.isPresent())
								_level.getServer().getFunctions().execute(_fopt.get(), new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null));
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.PLAYERS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.PLAYERS, 1, 1, false);
							}
						}
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if ((entityiterator == immediatesourceentity) == false && entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("jojowos:stand_mob"))) == false) {
									if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(JojowosModMobEffects.RED_BINDED.get(), 60, 0, false, false));
								}
							}
						}
					});
					immediatesourceentity.getPersistentData().putDouble("AttackCooldown", 60);
				}
				if (randomnumber >= 11 && randomnumber <= 12) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:magiciansred_crossfire")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:magiciansred_crossfire")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
					if (immediatesourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 9, false, false));
					JojowosMod.queueServerWork(16, () -> {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"particle minecraft:flame ^0 ^1 ^ 1 1 1 0.05 40 force @a");
						if (world instanceof ServerLevel projectileLevel) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
									AbstractArrow entityToSpawn = new LargeCrossfireProjectileEntity(JojowosModEntities.LARGE_CROSSFIRE_PROJECTILE.get(), level);
									entityToSpawn.setOwner(shooter);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									entityToSpawn.setPierceLevel(piercing);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, immediatesourceentity, 3, 1, (byte) 1);
							_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
							_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x), (immediatesourceentity.getLookAngle().y), (immediatesourceentity.getLookAngle().z), 2, 0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					});
					immediatesourceentity.getPersistentData().putDouble("AttackCooldown", 40);
				}
				if (randomnumber >= 13 && randomnumber <= 14) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:magiciansred_crossfirespecial")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:magiciansred_crossfirespecial")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
					if (immediatesourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 50, 9, false, false));
					JojowosMod.queueServerWork(50, () -> {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"particle minecraft:flame ^0 ^1 ^ 1 1 1 0.05 40 force @a");
						if (world instanceof ServerLevel projectileLevel) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
									AbstractArrow entityToSpawn = new SmallCrossfireProjectileEntity(JojowosModEntities.SMALL_CROSSFIRE_PROJECTILE.get(), level);
									entityToSpawn.setOwner(shooter);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									entityToSpawn.setPierceLevel(piercing);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, immediatesourceentity, 3, 1, (byte) 1);
							_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
							_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x), (immediatesourceentity.getLookAngle().y), (immediatesourceentity.getLookAngle().z), 1, 0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
						if (world instanceof ServerLevel projectileLevel) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
									AbstractArrow entityToSpawn = new SmallCrossfireProjectileEntity(JojowosModEntities.SMALL_CROSSFIRE_PROJECTILE.get(), level);
									entityToSpawn.setOwner(shooter);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									entityToSpawn.setPierceLevel(piercing);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, immediatesourceentity, 3, 1, (byte) 1);
							_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
							_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x + 0.5), (immediatesourceentity.getLookAngle().y), (immediatesourceentity.getLookAngle().z + 0.5), 1, 0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
						if (world instanceof ServerLevel projectileLevel) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
									AbstractArrow entityToSpawn = new SmallCrossfireProjectileEntity(JojowosModEntities.SMALL_CROSSFIRE_PROJECTILE.get(), level);
									entityToSpawn.setOwner(shooter);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									entityToSpawn.setPierceLevel(piercing);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, immediatesourceentity, 3, 1, (byte) 1);
							_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
							_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x + 0.5), (immediatesourceentity.getLookAngle().y), (immediatesourceentity.getLookAngle().z + 0.5), 1, 0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
						if (world instanceof ServerLevel projectileLevel) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
									AbstractArrow entityToSpawn = new SmallCrossfireProjectileEntity(JojowosModEntities.SMALL_CROSSFIRE_PROJECTILE.get(), level);
									entityToSpawn.setOwner(shooter);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									entityToSpawn.setPierceLevel(piercing);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, immediatesourceentity, 3, 1, (byte) 1);
							_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
							_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x + 0.5), (immediatesourceentity.getLookAngle().y), (immediatesourceentity.getLookAngle().z + 0.5), 1, 0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
						if (world instanceof ServerLevel projectileLevel) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
									AbstractArrow entityToSpawn = new SmallCrossfireProjectileEntity(JojowosModEntities.SMALL_CROSSFIRE_PROJECTILE.get(), level);
									entityToSpawn.setOwner(shooter);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									entityToSpawn.setPierceLevel(piercing);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, immediatesourceentity, 3, 1, (byte) 1);
							_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
							_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x + 0.5), (immediatesourceentity.getLookAngle().y), (immediatesourceentity.getLookAngle().z + 0.5), 1, 0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					});
					immediatesourceentity.getPersistentData().putDouble("AttackCooldown", 60);
				}
			}
			if (immediatesourceentity.getPersistentData().getDouble("Ability1Cooldown") == 0) {
				if (randomnumber >= 1 && randomnumber <= 8) {
					immediatesourceentity.getPersistentData().putDouble("Ability1Cooldown", 200);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:magiciansred_atkbasic")), SoundSource.HOSTILE, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:magiciansred_atkbasic")), SoundSource.HOSTILE, 1, 1, false);
						}
					}
					entity.setSecondsOnFire(5);
				}
			}
		}
		if (entity instanceof MuhammedAvdolEntity) {
			randomnumber2 = Mth.nextInt(RandomSource.create(), 1, 20);
			randomnumber3 = Mth.nextInt(RandomSource.create(), 1, 100);
			if (entity.getPersistentData().getDouble("PassiveCooldown") == 0) {
				if (randomnumber2 >= 18 && randomnumber2 <= 20) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(JojowosModMobEffects.STAND_JUMP_EFFECT.get(), 60, 0, false, false));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:avdol_notyet")), SoundSource.HOSTILE, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:avdol_notyet")), SoundSource.HOSTILE, 1, 1, false);
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
			}
			if (randomnumber3 >= 80 && randomnumber3 <= 85) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:avdol_hurt_1")), SoundSource.HOSTILE, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:avdol_hurt_1")), SoundSource.HOSTILE, 1, 1, false);
					}
				}
			}
			if (randomnumber3 >= 86 && randomnumber3 <= 90) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:avdol_hurt_2")), SoundSource.HOSTILE, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:avdol_hurt_2")), SoundSource.HOSTILE, 1, 1, false);
					}
				}
			}
			if (randomnumber3 >= 91 && randomnumber3 <= 95) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:avdol_hurt_3")), SoundSource.HOSTILE, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:avdol_hurt_3")), SoundSource.HOSTILE, 1, 1, false);
					}
				}
			}
			if (randomnumber3 >= 96 && randomnumber3 <= 100) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:avdol_hurt_4")), SoundSource.HOSTILE, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:avdol_hurt_4")), SoundSource.HOSTILE, 1, 1, false);
					}
				}
			}
		}
	}
}
