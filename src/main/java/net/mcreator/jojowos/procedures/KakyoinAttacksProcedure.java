package net.mcreator.jojowos.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.jojowos.init.JojowosModMobEffects;
import net.mcreator.jojowos.init.JojowosModEntities;
import net.mcreator.jojowos.entity.NoriakiKakyoinEntity;
import net.mcreator.jojowos.entity.EmeraldSplashItemProjectileEntity;
import net.mcreator.jojowos.JojowosMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class KakyoinAttacksProcedure {
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
		if (immediatesourceentity instanceof NoriakiKakyoinEntity) {
			randomnumber = Mth.nextInt(RandomSource.create(), 1, 12);
			if (immediatesourceentity.getPersistentData().getDouble("AttackCooldown") == 0) {
				if (randomnumber >= 1 && randomnumber <= 4) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:kakyoin_atk_1")), SoundSource.HOSTILE, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:kakyoin_atk_1")), SoundSource.HOSTILE, 1, 1, false);
						}
					}
					if (immediatesourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 15, 9, false, false));
					JojowosMod.queueServerWork(10, () -> {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:hierophant_atk_1")), SoundSource.HOSTILE, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:hierophant_atk_1")), SoundSource.HOSTILE, 1, 1, false);
							}
						}
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
							}, 4);
					});
					if (immediatesourceentity instanceof NoriakiKakyoinEntity) {
						((NoriakiKakyoinEntity) immediatesourceentity).setAnimation("attack1");
					}
					immediatesourceentity.getPersistentData().putDouble("AttackCooldown", 20);
				}
				if (randomnumber >= 5 && randomnumber <= 8) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:kakyoin_atk_2")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:kakyoin_atk_2")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (immediatesourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 15, 9, false, false));
					JojowosMod.queueServerWork(10, () -> {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:hierophant_atk_2")), SoundSource.HOSTILE, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:hierophant_atk_2")), SoundSource.HOSTILE, 1, 1, false);
							}
						}
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
							}, 4);
					});
					if (immediatesourceentity instanceof NoriakiKakyoinEntity) {
						((NoriakiKakyoinEntity) immediatesourceentity).setAnimation("attack2");
					}
					immediatesourceentity.getPersistentData().putDouble("AttackCooldown", 20);
				}
				if (randomnumber >= 9 && randomnumber <= 11) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:hierophant_emeraldsplash")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:hierophant_emeraldsplash")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
					if (immediatesourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 2, false, false));
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
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
						}.getArrow(projectileLevel, immediatesourceentity, 1, 1, (byte) 1);
						_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
						_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (immediatesourceentity.getLookAngle().y),
								(immediatesourceentity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
						}.getArrow(projectileLevel, immediatesourceentity, 1, 1, (byte) 1);
						_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
						_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (immediatesourceentity.getLookAngle().y),
								(immediatesourceentity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
						}.getArrow(projectileLevel, immediatesourceentity, 1, 1, (byte) 1);
						_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
						_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x), (immediatesourceentity.getLookAngle().y), (immediatesourceentity.getLookAngle().z), 3, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
					JojowosMod.queueServerWork(5, () -> {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.splash")), SoundSource.PLAYERS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.splash")), SoundSource.PLAYERS, 1, 1, false);
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
							}.getArrow(projectileLevel, immediatesourceentity, 1, 1, (byte) 1);
							_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
							_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (immediatesourceentity.getLookAngle().y),
									(immediatesourceentity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
							}.getArrow(projectileLevel, immediatesourceentity, 1, 1, (byte) 1);
							_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
							_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (immediatesourceentity.getLookAngle().y),
									(immediatesourceentity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
							}.getArrow(projectileLevel, immediatesourceentity, 1, 1, (byte) 1);
							_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
							_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x), (immediatesourceentity.getLookAngle().y), (immediatesourceentity.getLookAngle().z), 3, 0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
						JojowosMod.queueServerWork(5, () -> {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.splash")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.splash")), SoundSource.PLAYERS, 1, 1, false);
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
								}.getArrow(projectileLevel, immediatesourceentity, 1, 1, (byte) 1);
								_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
								_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (immediatesourceentity.getLookAngle().y),
										(immediatesourceentity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
								}.getArrow(projectileLevel, immediatesourceentity, 1, 1, (byte) 1);
								_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
								_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (immediatesourceentity.getLookAngle().y),
										(immediatesourceentity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
								}.getArrow(projectileLevel, immediatesourceentity, 1, 1, (byte) 1);
								_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
								_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x), (immediatesourceentity.getLookAngle().y), (immediatesourceentity.getLookAngle().z), 3, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
							JojowosMod.queueServerWork(5, () -> {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.splash")), SoundSource.PLAYERS, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.splash")), SoundSource.PLAYERS, 1, 1, false);
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
									}.getArrow(projectileLevel, immediatesourceentity, 1, 1, (byte) 1);
									_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
									_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (immediatesourceentity.getLookAngle().y),
											(immediatesourceentity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
									}.getArrow(projectileLevel, immediatesourceentity, 1, 1, (byte) 1);
									_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
									_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (immediatesourceentity.getLookAngle().y),
											(immediatesourceentity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
									}.getArrow(projectileLevel, immediatesourceentity, 1, 1, (byte) 1);
									_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
									_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x), (immediatesourceentity.getLookAngle().y), (immediatesourceentity.getLookAngle().z), 3, 0);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
								JojowosMod.queueServerWork(5, () -> {
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
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
										}.getArrow(projectileLevel, immediatesourceentity, 1, 1, (byte) 1);
										_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
										_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (immediatesourceentity.getLookAngle().y),
												(immediatesourceentity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
										}.getArrow(projectileLevel, immediatesourceentity, 1, 1, (byte) 1);
										_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
										_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (immediatesourceentity.getLookAngle().y),
												(immediatesourceentity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
										}.getArrow(projectileLevel, immediatesourceentity, 1, 1, (byte) 1);
										_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
										_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x), (immediatesourceentity.getLookAngle().y), (immediatesourceentity.getLookAngle().z), 3, 0);
										projectileLevel.addFreshEntity(_entityToSpawn);
									}
									JojowosMod.queueServerWork(5, () -> {
										if (world instanceof Level _level) {
											if (!_level.isClientSide()) {
												_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.splash")), SoundSource.PLAYERS, 1, 1);
											} else {
												_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.splash")), SoundSource.PLAYERS, 1, 1, false);
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
											}.getArrow(projectileLevel, immediatesourceentity, 1, 1, (byte) 1);
											_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
											_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (immediatesourceentity.getLookAngle().y),
													(immediatesourceentity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
											}.getArrow(projectileLevel, immediatesourceentity, 1, 1, (byte) 1);
											_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
											_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (immediatesourceentity.getLookAngle().y),
													(immediatesourceentity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
											}.getArrow(projectileLevel, immediatesourceentity, 1, 1, (byte) 1);
											_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
											_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x), (immediatesourceentity.getLookAngle().y), (immediatesourceentity.getLookAngle().z), 3, 0);
											projectileLevel.addFreshEntity(_entityToSpawn);
										}
										JojowosMod.queueServerWork(5, () -> {
											if (world instanceof Level _level) {
												if (!_level.isClientSide()) {
													_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.splash")), SoundSource.PLAYERS, 1, 1);
												} else {
													_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.splash")), SoundSource.PLAYERS, 1, 1, false);
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
												}.getArrow(projectileLevel, immediatesourceentity, 1, 1, (byte) 1);
												_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
												_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (immediatesourceentity.getLookAngle().y),
														(immediatesourceentity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
												}.getArrow(projectileLevel, immediatesourceentity, 1, 1, (byte) 1);
												_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
												_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (immediatesourceentity.getLookAngle().y),
														(immediatesourceentity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
												}.getArrow(projectileLevel, immediatesourceentity, 1, 1, (byte) 1);
												_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
												_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x), (immediatesourceentity.getLookAngle().y), (immediatesourceentity.getLookAngle().z), 3, 0);
												projectileLevel.addFreshEntity(_entityToSpawn);
											}
											JojowosMod.queueServerWork(5, () -> {
												if (world instanceof Level _level) {
													if (!_level.isClientSide()) {
														_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.splash")), SoundSource.PLAYERS, 1, 1);
													} else {
														_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.splash")), SoundSource.PLAYERS, 1, 1, false);
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
													}.getArrow(projectileLevel, immediatesourceentity, 1, 1, (byte) 1);
													_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
													_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (immediatesourceentity.getLookAngle().y),
															(immediatesourceentity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
													}.getArrow(projectileLevel, immediatesourceentity, 1, 1, (byte) 1);
													_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
													_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (immediatesourceentity.getLookAngle().y),
															(immediatesourceentity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
													}.getArrow(projectileLevel, immediatesourceentity, 1, 1, (byte) 1);
													_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
													_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x), (immediatesourceentity.getLookAngle().y), (immediatesourceentity.getLookAngle().z), 3, 0);
													projectileLevel.addFreshEntity(_entityToSpawn);
												}
												JojowosMod.queueServerWork(5, () -> {
													if (world instanceof ServerLevel _level)
														_level.getServer().getCommands().performPrefixedCommand(
																new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
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
														}.getArrow(projectileLevel, immediatesourceentity, 1, 1, (byte) 1);
														_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
														_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (immediatesourceentity.getLookAngle().y),
																(immediatesourceentity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
														}.getArrow(projectileLevel, immediatesourceentity, 1, 1, (byte) 1);
														_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
														_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (immediatesourceentity.getLookAngle().y),
																(immediatesourceentity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
														}.getArrow(projectileLevel, immediatesourceentity, 1, 1, (byte) 1);
														_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
														_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x), (immediatesourceentity.getLookAngle().y), (immediatesourceentity.getLookAngle().z), 3, 0);
														projectileLevel.addFreshEntity(_entityToSpawn);
													}
													JojowosMod.queueServerWork(5, () -> {
														if (world instanceof Level _level) {
															if (!_level.isClientSide()) {
																_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.splash")), SoundSource.PLAYERS, 1, 1);
															} else {
																_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.splash")), SoundSource.PLAYERS, 1, 1, false);
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
															}.getArrow(projectileLevel, immediatesourceentity, 1, 1, (byte) 1);
															_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
															_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (immediatesourceentity.getLookAngle().y),
																	(immediatesourceentity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
															}.getArrow(projectileLevel, immediatesourceentity, 1, 1, (byte) 1);
															_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
															_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (immediatesourceentity.getLookAngle().y),
																	(immediatesourceentity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
															}.getArrow(projectileLevel, immediatesourceentity, 1, 1, (byte) 1);
															_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
															_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x), (immediatesourceentity.getLookAngle().y), (immediatesourceentity.getLookAngle().z), 3, 0);
															projectileLevel.addFreshEntity(_entityToSpawn);
														}
														JojowosMod.queueServerWork(5, () -> {
															if (world instanceof Level _level) {
																if (!_level.isClientSide()) {
																	_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.splash")), SoundSource.PLAYERS, 1, 1);
																} else {
																	_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.splash")), SoundSource.PLAYERS, 1, 1, false);
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
																}.getArrow(projectileLevel, immediatesourceentity, 1, 1, (byte) 1);
																_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
																_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (immediatesourceentity.getLookAngle().y),
																		(immediatesourceentity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
																}.getArrow(projectileLevel, immediatesourceentity, 1, 1, (byte) 1);
																_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
																_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (immediatesourceentity.getLookAngle().y),
																		(immediatesourceentity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
																}.getArrow(projectileLevel, immediatesourceentity, 1, 1, (byte) 1);
																_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
																_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x), (immediatesourceentity.getLookAngle().y), (immediatesourceentity.getLookAngle().z), 3, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															JojowosMod.queueServerWork(5, () -> {
																if (world instanceof Level _level) {
																	if (!_level.isClientSide()) {
																		_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.splash")), SoundSource.PLAYERS, 1, 1);
																	} else {
																		_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.splash")), SoundSource.PLAYERS, 1, 1, false);
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
																	}.getArrow(projectileLevel, immediatesourceentity, 1, 1, (byte) 1);
																	_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
																	_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (immediatesourceentity.getLookAngle().y),
																			(immediatesourceentity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
																	}.getArrow(projectileLevel, immediatesourceentity, 1, 1, (byte) 1);
																	_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
																	_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (immediatesourceentity.getLookAngle().y),
																			(immediatesourceentity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), 3, 0);
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
																	}.getArrow(projectileLevel, immediatesourceentity, 1, 1, (byte) 1);
																	_entityToSpawn.setPos((immediatesourceentity.getX()), (immediatesourceentity.getY() + 1.5), (immediatesourceentity.getZ()));
																	_entityToSpawn.shoot((immediatesourceentity.getLookAngle().x), (immediatesourceentity.getLookAngle().y), (immediatesourceentity.getLookAngle().z), 3, 0);
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
					immediatesourceentity.getPersistentData().putDouble("AttackCooldown", 60);
				}
			}
		}
		if (entity instanceof NoriakiKakyoinEntity) {
			randomnumber2 = Mth.nextInt(RandomSource.create(), 1, 20);
			randomnumber3 = Mth.nextInt(RandomSource.create(), 1, 100);
			if (entity.getPersistentData().getDouble("PassiveCooldown") == 0) {
				if (randomnumber2 >= 19 && randomnumber2 <= 20) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:kakyoin_evade")), SoundSource.BLOCKS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:kakyoin_evade")), SoundSource.BLOCKS, 1, 1, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:hierophant_grapple")), SoundSource.HOSTILE, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:hierophant_grapple")), SoundSource.HOSTILE, 1, 1, false);
						}
					}
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(JojowosModMobEffects.STAND_JUMP_EFFECT.get(), 60, 0, false, false));
					entity.setDeltaMovement(new Vec3(
							((entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(30)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getX() - x)
									* 0.15),
							((entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(30)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getY() - y)
									* 0.15),
							((entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(30)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ() - z)
									* 0.15)));
					entity.getPersistentData().putDouble("PassiveCooldown", 400);
				}
			}
			if (randomnumber3 >= 80 && randomnumber3 <= 85) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:kakyoin_hurt_1")), SoundSource.HOSTILE, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:kakyoin_hurt_1")), SoundSource.HOSTILE, 1, 1, false);
					}
				}
			}
			if (randomnumber3 >= 86 && randomnumber3 <= 90) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:kakyoin_hurt_2")), SoundSource.HOSTILE, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:kakyoin_hurt_2")), SoundSource.HOSTILE, 1, 1, false);
					}
				}
			}
			if (randomnumber3 >= 91 && randomnumber3 <= 95) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:kakyoin_hurt_3")), SoundSource.HOSTILE, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:kakyoin_hurt_3")), SoundSource.HOSTILE, 1, 1, false);
					}
				}
			}
			if (randomnumber3 >= 96 && randomnumber3 <= 100) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:kakyoin_hurt_4")), SoundSource.HOSTILE, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:kakyoin_hurt_4")), SoundSource.HOSTILE, 1, 1, false);
					}
				}
			}
		}
	}
}
