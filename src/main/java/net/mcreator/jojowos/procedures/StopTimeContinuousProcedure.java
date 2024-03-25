package net.mcreator.jojowos.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.init.JojowosModMobEffects;
import net.mcreator.jojowos.entity.JotaroKujoPart3Entity;
import net.mcreator.jojowos.entity.DIOEntity;
import net.mcreator.jojowos.entity.DIOCapedEntity;
import net.mcreator.jojowos.entity.DIOAwakenedEntity;

import java.util.List;
import java.util.Comparator;

public class StopTimeContinuousProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(200 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if ((entityiterator == entity) == false && entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("jojowos:stand_mob"))) == false) {
					if (entityiterator instanceof Player) {
						if ((entityiterator.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).TimeStopLength > 0) {
							if (((entityiterator.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("StarPlatinum")) {
								if ((entityiterator instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(JojowosModMobEffects.STOPPED_TIME.get())) == false) {
									if (entityiterator.getPersistentData().getDouble("Ability6Cooldown") == 0) {
										if ((entityiterator.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).TimeStopLength < (entity
												.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).TimeStopLength
												|| (entityiterator.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).TimeStopLength < entity.getPersistentData()
														.getDouble("TimeStopLength")) {
											if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(JojowosModMobEffects.STOPPED_TIME.get())
													? _livEnt.getEffect(JojowosModMobEffects.STOPPED_TIME.get()).getDuration()
													: 0) <= (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).TimeStopLength
															- (entityiterator.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).TimeStopLength
													|| (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(JojowosModMobEffects.STOPPED_TIME.get()) ? _livEnt.getEffect(JojowosModMobEffects.STOPPED_TIME.get()).getDuration() : 0) <= entity
															.getPersistentData().getDouble("TimeStopLength")
															- (entityiterator.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).TimeStopLength) {
												if ((entityiterator instanceof LivingEntity _livEnt9 && _livEnt9.hasEffect(JojowosModMobEffects.TIME_STOPPED.get())) == false) {
													entity.getPersistentData().putDouble("tsPitch", (entity.getXRot()));
													entity.getPersistentData().putDouble("tsYaw", (entity.getYRot()));
													if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
														_entity.addEffect(new MobEffectInstance(JojowosModMobEffects.TIME_STOPPED.get(),
																entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(JojowosModMobEffects.STOPPED_TIME.get()) ? _livEnt.getEffect(JojowosModMobEffects.STOPPED_TIME.get()).getDuration() : 0, 0,
																false, false));
													entityiterator.getPersistentData().putDouble("TimeFreezeEffect",
															(entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(JojowosModMobEffects.STOPPED_TIME.get()) ? _livEnt.getEffect(JojowosModMobEffects.STOPPED_TIME.get()).getDuration() : 0));
												}
											}
										}
									} else {
										if ((entityiterator instanceof LivingEntity _livEnt18 && _livEnt18.hasEffect(JojowosModMobEffects.TIME_STOPPED.get())) == false) {
											entity.getPersistentData().putDouble("tsPitch", (entity.getXRot()));
											entity.getPersistentData().putDouble("tsYaw", (entity.getYRot()));
											if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
												_entity.addEffect(new MobEffectInstance(JojowosModMobEffects.TIME_STOPPED.get(),
														entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(JojowosModMobEffects.STOPPED_TIME.get()) ? _livEnt.getEffect(JojowosModMobEffects.STOPPED_TIME.get()).getDuration() : 0, 0, false,
														false));
											entityiterator.getPersistentData().putDouble("TimeFreezeEffect",
													(entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(JojowosModMobEffects.STOPPED_TIME.get()) ? _livEnt.getEffect(JojowosModMobEffects.STOPPED_TIME.get()).getDuration() : 0));
										}
									}
								}
							}
							if (((entityiterator.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("TheWorld")) {
								if ((entityiterator instanceof LivingEntity _livEnt27 && _livEnt27.hasEffect(JojowosModMobEffects.STOPPED_TIME.get())) == false) {
									if (entityiterator.getPersistentData().getDouble("Ability5Cooldown") == 0) {
										if ((entityiterator.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).TimeStopLength < (entity
												.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).TimeStopLength
												|| (entityiterator.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).TimeStopLength < entity.getPersistentData()
														.getDouble("TimeStopLength")) {
											if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(JojowosModMobEffects.STOPPED_TIME.get())
													? _livEnt.getEffect(JojowosModMobEffects.STOPPED_TIME.get()).getDuration()
													: 0) <= (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).TimeStopLength
															- (entityiterator.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).TimeStopLength
													|| (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(JojowosModMobEffects.STOPPED_TIME.get()) ? _livEnt.getEffect(JojowosModMobEffects.STOPPED_TIME.get()).getDuration() : 0) <= entity
															.getPersistentData().getDouble("TimeStopLength")
															- (entityiterator.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).TimeStopLength) {
												if ((entityiterator instanceof LivingEntity _livEnt33 && _livEnt33.hasEffect(JojowosModMobEffects.TIME_STOPPED.get())) == false) {
													entity.getPersistentData().putDouble("tsPitch", (entity.getXRot()));
													entity.getPersistentData().putDouble("tsYaw", (entity.getYRot()));
													if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
														_entity.addEffect(new MobEffectInstance(JojowosModMobEffects.TIME_STOPPED.get(),
																entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(JojowosModMobEffects.STOPPED_TIME.get()) ? _livEnt.getEffect(JojowosModMobEffects.STOPPED_TIME.get()).getDuration() : 0, 0,
																false, false));
													entityiterator.getPersistentData().putDouble("TimeFreezeEffect",
															(entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(JojowosModMobEffects.STOPPED_TIME.get()) ? _livEnt.getEffect(JojowosModMobEffects.STOPPED_TIME.get()).getDuration() : 0));
												}
											}
										}
									} else {
										if ((entityiterator instanceof LivingEntity _livEnt42 && _livEnt42.hasEffect(JojowosModMobEffects.TIME_STOPPED.get())) == false) {
											entity.getPersistentData().putDouble("tsPitch", (entity.getXRot()));
											entity.getPersistentData().putDouble("tsYaw", (entity.getYRot()));
											if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
												_entity.addEffect(new MobEffectInstance(JojowosModMobEffects.TIME_STOPPED.get(),
														entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(JojowosModMobEffects.STOPPED_TIME.get()) ? _livEnt.getEffect(JojowosModMobEffects.STOPPED_TIME.get()).getDuration() : 0, 0, false,
														false));
											entityiterator.getPersistentData().putDouble("TimeFreezeEffect",
													(entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(JojowosModMobEffects.STOPPED_TIME.get()) ? _livEnt.getEffect(JojowosModMobEffects.STOPPED_TIME.get()).getDuration() : 0));
										}
									}
								}
							}
						} else {
							if ((entityiterator instanceof LivingEntity _livEnt51 && _livEnt51.hasEffect(JojowosModMobEffects.TIME_STOPPED.get())) == false) {
								entity.getPersistentData().putDouble("tsPitch", (entity.getXRot()));
								entity.getPersistentData().putDouble("tsYaw", (entity.getYRot()));
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(JojowosModMobEffects.TIME_STOPPED.get(),
											entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(JojowosModMobEffects.STOPPED_TIME.get()) ? _livEnt.getEffect(JojowosModMobEffects.STOPPED_TIME.get()).getDuration() : 0, 0, false, false));
								if (entityiterator instanceof Player) {
									entityiterator.getPersistentData().putDouble("TimeFreezeEffect",
											(entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(JojowosModMobEffects.STOPPED_TIME.get()) ? _livEnt.getEffect(JojowosModMobEffects.STOPPED_TIME.get()).getDuration() : 0));
								}
							}
						}
					} else if (entityiterator instanceof JotaroKujoPart3Entity || entityiterator instanceof DIOEntity || entityiterator instanceof DIOAwakenedEntity || entityiterator instanceof DIOCapedEntity) {
						if ((entityiterator instanceof LivingEntity _livEnt65 && _livEnt65.hasEffect(JojowosModMobEffects.STOPPED_TIME.get())) == false) {
							if (entityiterator.getPersistentData().getDouble("Ability1Cooldown") == 0) {
								if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(JojowosModMobEffects.STOPPED_TIME.get())
										? _livEnt.getEffect(JojowosModMobEffects.STOPPED_TIME.get()).getDuration()
										: 0) <= (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).TimeStopLength
												- entityiterator.getPersistentData().getDouble("TimeStopLength")) {
									if ((entityiterator instanceof LivingEntity _livEnt69 && _livEnt69.hasEffect(JojowosModMobEffects.TIME_STOPPED.get())) == false) {
										entity.getPersistentData().putDouble("tsPitch", (entity.getXRot()));
										entity.getPersistentData().putDouble("tsYaw", (entity.getYRot()));
										if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
											_entity.addEffect(new MobEffectInstance(JojowosModMobEffects.TIME_STOPPED.get(),
													entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(JojowosModMobEffects.STOPPED_TIME.get()) ? _livEnt.getEffect(JojowosModMobEffects.STOPPED_TIME.get()).getDuration() : 0, 0, false,
													false));
									}
								}
							} else {
								if ((entityiterator instanceof LivingEntity _livEnt76 && _livEnt76.hasEffect(JojowosModMobEffects.TIME_STOPPED.get())) == false) {
									entity.getPersistentData().putDouble("tsPitch", (entity.getXRot()));
									entity.getPersistentData().putDouble("tsYaw", (entity.getYRot()));
									if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(JojowosModMobEffects.TIME_STOPPED.get(),
												entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(JojowosModMobEffects.STOPPED_TIME.get()) ? _livEnt.getEffect(JojowosModMobEffects.STOPPED_TIME.get()).getDuration() : 0, 0, false, false));
								}
							}
						}
					} else {
						if (entityiterator.getPersistentData().getBoolean("InitialStop") == false) {
							entityiterator.getPersistentData().putDouble("TimeX", (entityiterator.getDeltaMovement().x()));
							entityiterator.getPersistentData().putDouble("TimeY", (entityiterator.getDeltaMovement().y()));
							entityiterator.getPersistentData().putDouble("TimeZ", (entityiterator.getDeltaMovement().z()));
							entityiterator.getPersistentData().putBoolean("InitialStop", true);
						} else {
							entityiterator.setDeltaMovement(new Vec3(0, 0, 0));
						}
						if ((entityiterator instanceof LivingEntity _livEnt92 && _livEnt92.hasEffect(JojowosModMobEffects.TIME_STOPPED.get())) == false) {
							entity.getPersistentData().putDouble("tsPitch", (entity.getXRot()));
							entity.getPersistentData().putDouble("tsYaw", (entity.getYRot()));
							if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(JojowosModMobEffects.TIME_STOPPED.get(),
										entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(JojowosModMobEffects.STOPPED_TIME.get()) ? _livEnt.getEffect(JojowosModMobEffects.STOPPED_TIME.get()).getDuration() : 0, 0, false, false));
						}
					}
				}
				if ((entityiterator instanceof LivingEntity _livEnt99 && _livEnt99.hasEffect(JojowosModMobEffects.TIME_STOP_VISUAL.get())) == false) {
					if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(JojowosModMobEffects.TIME_STOP_VISUAL.get(),
								entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(JojowosModMobEffects.STOPPED_TIME.get()) ? _livEnt.getEffect(JojowosModMobEffects.STOPPED_TIME.get()).getDuration() : 0, 0, false, false));
				}
			}
		}
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"particle minecraft:dust 0.263 0.278 0.29 1 ^0 ^1 ^ 10 10 10 0.05 10 force @a");
	}
}
