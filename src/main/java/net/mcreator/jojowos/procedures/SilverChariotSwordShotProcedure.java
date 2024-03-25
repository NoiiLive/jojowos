package net.mcreator.jojowos.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.init.JojowosModEntities;
import net.mcreator.jojowos.entity.SilverChariotOVAEntity;
import net.mcreator.jojowos.entity.SilverChariotOVAArmorlessEntity;
import net.mcreator.jojowos.entity.SilverChariotMangaEntity;
import net.mcreator.jojowos.entity.SilverChariotMangaArmorlessEntity;
import net.mcreator.jojowos.entity.SilverChariotGoldEntity;
import net.mcreator.jojowos.entity.SilverChariotGoldArmorlessEntity;
import net.mcreator.jojowos.entity.SilverChariotEntity;
import net.mcreator.jojowos.entity.SilverChariotArmorlessEntity;
import net.mcreator.jojowos.entity.ChariotSwordProjectileEntity;
import net.mcreator.jojowos.entity.ChariotSwordGoldProjectileEntity;
import net.mcreator.jojowos.JojowosMod;

import java.util.List;
import java.util.Comparator;

public class SilverChariotSwordShotProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("Ability2Cooldown") == 0) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NoCooldown == false) {
				entity.getPersistentData().putDouble("Ability2Cooldown", (200 + Math.round((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSpeed * (-1.01))));
			}
			{
				double _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).CurrentExp + 5
						+ (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPotential / 3;
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CurrentExp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 10, 2, false, false));
			entity.getPersistentData().putBoolean("Infront", true);
			JojowosMod.queueServerWork(5, () -> {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:stand_bearingshot")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:stand_bearingshot")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				JojowosMod.queueServerWork(1, () -> {
					entity.getPersistentData().putBoolean("Infront", false);
				});
			});
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("jojowos:stand_mob"))) == true
							&& (entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) == true) {
						if (entityiterator instanceof SilverChariotEntity) {
							((SilverChariotEntity) entityiterator).setAnimation("attack3");
						}
						if (entityiterator instanceof SilverChariotArmorlessEntity) {
							((SilverChariotArmorlessEntity) entityiterator).setAnimation("attack3");
						}
						if (entityiterator instanceof SilverChariotGoldEntity) {
							((SilverChariotGoldEntity) entityiterator).setAnimation("attack3");
						}
						if (entityiterator instanceof SilverChariotGoldArmorlessEntity) {
							((SilverChariotGoldArmorlessEntity) entityiterator).setAnimation("attack3");
						}
						if (entityiterator instanceof SilverChariotMangaEntity) {
							((SilverChariotMangaEntity) entityiterator).setAnimation("attack3");
						}
						if (entityiterator instanceof SilverChariotMangaArmorlessEntity) {
							((SilverChariotMangaArmorlessEntity) entityiterator).setAnimation("attack3");
						}
						if (entityiterator instanceof SilverChariotOVAEntity) {
							((SilverChariotOVAEntity) entityiterator).setAnimation("attack3");
						}
						if (entityiterator instanceof SilverChariotOVAArmorlessEntity) {
							((SilverChariotOVAArmorlessEntity) entityiterator).setAnimation("attack3");
						}
						JojowosMod.queueServerWork(5, () -> {
							if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Gold")) {
								if (world instanceof ServerLevel projectileLevel) {
									Projectile _entityToSpawn = new Object() {
										public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
											AbstractArrow entityToSpawn = new ChariotSwordGoldProjectileEntity(JojowosModEntities.CHARIOT_SWORD_GOLD_PROJECTILE.get(), level);
											entityToSpawn.setOwner(shooter);
											entityToSpawn.setBaseDamage(damage);
											entityToSpawn.setKnockback(knockback);
											entityToSpawn.setSilent(true);
											entityToSpawn.setPierceLevel(piercing);
											return entityToSpawn;
										}
									}.getArrow(projectileLevel, entity, (float) (1 + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower / 50), 1, (byte) 2);
									_entityToSpawn.setPos((entityiterator.getX()), (entityiterator.getY() + 1.5), (entityiterator.getZ()));
									_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), 4, 0);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
							} else {
								if (world instanceof ServerLevel projectileLevel) {
									Projectile _entityToSpawn = new Object() {
										public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
											AbstractArrow entityToSpawn = new ChariotSwordProjectileEntity(JojowosModEntities.CHARIOT_SWORD_PROJECTILE.get(), level);
											entityToSpawn.setOwner(shooter);
											entityToSpawn.setBaseDamage(damage);
											entityToSpawn.setKnockback(knockback);
											entityToSpawn.setSilent(true);
											entityToSpawn.setPierceLevel(piercing);
											return entityToSpawn;
										}
									}.getArrow(projectileLevel, entity, (float) (1 + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower / 50), 1, (byte) 2);
									_entityToSpawn.setPos((entityiterator.getX()), (entityiterator.getY() + 1.5), (entityiterator.getZ()));
									_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), 4, 0);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
							}
						});
					}
				}
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Sword Launch is on Cooldown!"), true);
		}
	}
}
