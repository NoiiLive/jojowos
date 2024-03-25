package net.mcreator.jojowos.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameRules;
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
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.init.JojowosModMobEffects;
import net.mcreator.jojowos.entity.TheWorldSilverEntity;
import net.mcreator.jojowos.entity.TheWorldOVAEntity;
import net.mcreator.jojowos.entity.TheWorldMangaEntity;
import net.mcreator.jojowos.entity.TheWorldEntity;
import net.mcreator.jojowos.entity.TheWorldBlackEntity;
import net.mcreator.jojowos.entity.StarPlatinumUltraInstinctEntity;
import net.mcreator.jojowos.entity.StarPlatinumP6Entity;
import net.mcreator.jojowos.entity.StarPlatinumP4Entity;
import net.mcreator.jojowos.entity.StarPlatinumP3Entity;
import net.mcreator.jojowos.entity.StarPlatinumOVAEntity;
import net.mcreator.jojowos.entity.StarPlatinumMangaEntity;
import net.mcreator.jojowos.entity.StarPlatinumGreenEntity;
import net.mcreator.jojowos.entity.StarPlatinumBlueEntity;
import net.mcreator.jojowos.JojowosMod;

import java.util.List;
import java.util.Comparator;

public class StarPlatinumTimeStopProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		JojowosMod.LOGGER.info((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).TimeStopLength);
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilityCooldown6 == 0) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NoCooldown == false) {
				{
					double _setval = 2400 + Math.round(((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSpeed - 1) * (-14.141));
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilityCooldown6 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				{
					double _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).TimeStopLength;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilityCooldown6 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			{
				double _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).CurrentExp + 60
						+ (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPotential / 3;
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CurrentExp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				boolean _setval = true;
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.TimeStop = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			entity.getPersistentData().putBoolean("Infront", true);
			if (!((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Goku")) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Star Platinum : The World!"), true);
				if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).TimeStopLength >= 100) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:starplatinum_stoptime")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:starplatinum_stoptime")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
					JojowosMod.queueServerWork(24, () -> {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(200 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if ((entityiterator == entity) == false && entityiterator instanceof TheWorldEntity == false && entityiterator instanceof TheWorldSilverEntity == false && entityiterator instanceof TheWorldBlackEntity == false
										&& entityiterator instanceof TheWorldOVAEntity == false && entityiterator instanceof TheWorldMangaEntity == false && entityiterator instanceof StarPlatinumP3Entity == false
										&& entityiterator instanceof StarPlatinumP4Entity == false && entityiterator instanceof StarPlatinumP6Entity == false && entityiterator instanceof StarPlatinumOVAEntity == false
										&& entityiterator instanceof StarPlatinumGreenEntity == false && entityiterator instanceof StarPlatinumBlueEntity == false && entityiterator instanceof StarPlatinumMangaEntity == false) {
									entityiterator.getPersistentData().putDouble("TimeX", (entityiterator.getDeltaMovement().x()));
									entityiterator.getPersistentData().putDouble("TimeY", (entityiterator.getDeltaMovement().y()));
									entityiterator.getPersistentData().putDouble("TimeZ", (entityiterator.getDeltaMovement().z()));
									entityiterator.getPersistentData().putBoolean("InitialStop", true);
								}
							}
						}
					});
					JojowosMod.queueServerWork(25, () -> {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"particle minecraft:dust 0.263 0.278 0.29 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
						JojowosMod.queueServerWork(10, () -> {
							entity.getPersistentData().putBoolean("Infront", false);
						});
						if (world.getLevelData().getGameRules().getBoolean(GameRules.RULE_DAYLIGHT) == true) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"gamerule doDaylightCycle false");
							JojowosModVariables.MapVariables.get(world).DaylightChanged = true;
							JojowosModVariables.MapVariables.get(world).syncData(world);
						}
						if (world.getLevelData().getGameRules().getBoolean(GameRules.RULE_FIRE_DAMAGE) == true) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"gamerule fireDamage false");
							JojowosModVariables.MapVariables.get(world).FireDamageChanged = true;
							JojowosModVariables.MapVariables.get(world).syncData(world);
						}
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(JojowosModMobEffects.STOPPED_TIME.get(),
									(int) (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).TimeStopLength, 0, false, false));
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 10, 2, false, false));
						entity.getPersistentData().putDouble("TimeFreezeEffect", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).TimeStopLength));
						JojowosMod.queueServerWork((int) ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).TimeStopLength - 20), () -> {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:starplatinum_long_returntime")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:starplatinum_long_returntime")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
						});
						JojowosMod.queueServerWork((int) (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).TimeStopLength, () -> {
							{
								boolean _setval = false;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.TimeStop = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 10, 2, false, false));
							if (JojowosModVariables.MapVariables.get(world).DaylightChanged == true) {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "gamerule doDaylightCycle true");
								JojowosModVariables.MapVariables.get(world).DaylightChanged = false;
								JojowosModVariables.MapVariables.get(world).syncData(world);
							}
							if (JojowosModVariables.MapVariables.get(world).FireDamageChanged == true) {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "gamerule fireDamage true");
								JojowosModVariables.MapVariables.get(world).FireDamageChanged = false;
								JojowosModVariables.MapVariables.get(world).syncData(world);
							}
							{
								final Vec3 _center = new Vec3(x, y, z);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(200 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
								for (Entity entityiterator : _entfound) {
									if ((entityiterator == entity) == false && entityiterator instanceof TheWorldEntity == false && entityiterator instanceof TheWorldSilverEntity == false && entityiterator instanceof TheWorldBlackEntity == false
											&& entityiterator instanceof TheWorldOVAEntity == false && entityiterator instanceof TheWorldMangaEntity == false && entityiterator instanceof StarPlatinumP3Entity == false
											&& entityiterator instanceof StarPlatinumP4Entity == false && entityiterator instanceof StarPlatinumP6Entity == false && entityiterator instanceof StarPlatinumOVAEntity == false
											&& entityiterator instanceof StarPlatinumGreenEntity == false && entityiterator instanceof StarPlatinumBlueEntity == false && entityiterator instanceof StarPlatinumMangaEntity == false) {
										entityiterator
												.setDeltaMovement(new Vec3((entityiterator.getPersistentData().getDouble("TimeX")), (entityiterator.getPersistentData().getDouble("TimeY")), (entityiterator.getPersistentData().getDouble("TimeZ"))));
										entityiterator.getPersistentData().putBoolean("InitialStop", false);
									}
								}
							}
						});
					});
					JojowosMod.queueServerWork(10, () -> {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("jojowos:stand_mob")))) {
									if (entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) {
										if (entityiterator instanceof StarPlatinumBlueEntity) {
											((StarPlatinumBlueEntity) entityiterator).setAnimation("timestop");
										}
										if (entityiterator instanceof StarPlatinumGreenEntity) {
											((StarPlatinumGreenEntity) entityiterator).setAnimation("timestop");
										}
										if (entityiterator instanceof StarPlatinumMangaEntity) {
											((StarPlatinumMangaEntity) entityiterator).setAnimation("timestop");
										}
										if (entityiterator instanceof StarPlatinumOVAEntity) {
											((StarPlatinumOVAEntity) entityiterator).setAnimation("timestop");
										}
										if (entityiterator instanceof StarPlatinumP3Entity) {
											((StarPlatinumP3Entity) entityiterator).setAnimation("timestop");
										}
										if (entityiterator instanceof StarPlatinumP4Entity) {
											((StarPlatinumP4Entity) entityiterator).setAnimation("timestop");
										}
										if (entityiterator instanceof StarPlatinumP6Entity) {
											((StarPlatinumP6Entity) entityiterator).setAnimation("timestop");
										}
									}
								}
							}
						}
					});
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:starplatinum_timestop_short")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:starplatinum_timestop_short")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
					JojowosMod.queueServerWork(10, () -> {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(200 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if ((entityiterator == entity) == false && entityiterator instanceof TheWorldEntity == false && entityiterator instanceof TheWorldSilverEntity == false && entityiterator instanceof TheWorldBlackEntity == false
										&& entityiterator instanceof TheWorldOVAEntity == false && entityiterator instanceof TheWorldMangaEntity == false && entityiterator instanceof StarPlatinumP3Entity == false
										&& entityiterator instanceof StarPlatinumP4Entity == false && entityiterator instanceof StarPlatinumP6Entity == false && entityiterator instanceof StarPlatinumOVAEntity == false
										&& entityiterator instanceof StarPlatinumGreenEntity == false && entityiterator instanceof StarPlatinumBlueEntity == false && entityiterator instanceof StarPlatinumMangaEntity == false) {
									entityiterator.getPersistentData().putDouble("TimeX", (entityiterator.getDeltaMovement().x()));
									entityiterator.getPersistentData().putDouble("TimeY", (entityiterator.getDeltaMovement().y()));
									entityiterator.getPersistentData().putDouble("TimeZ", (entityiterator.getDeltaMovement().z()));
									entityiterator.getPersistentData().putBoolean("InitialStop", true);
								}
							}
						}
					});
					JojowosMod.queueServerWork(11, () -> {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"particle minecraft:dust 0.263 0.278 0.29 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
						JojowosMod.queueServerWork(10, () -> {
							entity.getPersistentData().putBoolean("Infront", false);
						});
						if (world.getLevelData().getGameRules().getBoolean(GameRules.RULE_DAYLIGHT) == true) {
							JojowosModVariables.MapVariables.get(world).DaylightChanged = true;
							JojowosModVariables.MapVariables.get(world).syncData(world);
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"gamerule doDaylightCycle false");
						}
						if (world.getLevelData().getGameRules().getBoolean(GameRules.RULE_FIRE_DAMAGE) == true) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"gamerule fireDamage false");
							JojowosModVariables.MapVariables.get(world).FireDamageChanged = true;
							JojowosModVariables.MapVariables.get(world).syncData(world);
						}
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 10, 2, false, false));
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(JojowosModMobEffects.STOPPED_TIME.get(),
									(int) (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).TimeStopLength, 0, false, false));
						entity.getPersistentData().putDouble("TimeFreezeEffect", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).TimeStopLength));
						JojowosMod.queueServerWork((int) ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).TimeStopLength - 10), () -> {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:starplatinum_returntime")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:starplatinum_returntime")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
						});
						JojowosMod.queueServerWork((int) (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).TimeStopLength, () -> {
							{
								boolean _setval = false;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.TimeStop = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 10, 2, false, false));
							if (JojowosModVariables.MapVariables.get(world).DaylightChanged == true) {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "gamerule doDaylightCycle true");
								JojowosModVariables.MapVariables.get(world).DaylightChanged = false;
								JojowosModVariables.MapVariables.get(world).syncData(world);
							}
							if (JojowosModVariables.MapVariables.get(world).FireDamageChanged == true) {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "gamerule fireDamage true");
								JojowosModVariables.MapVariables.get(world).FireDamageChanged = false;
								JojowosModVariables.MapVariables.get(world).syncData(world);
							}
							{
								final Vec3 _center = new Vec3(x, y, z);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(200 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
								for (Entity entityiterator : _entfound) {
									if ((entityiterator == entity) == false && entityiterator instanceof TheWorldEntity == false && entityiterator instanceof TheWorldSilverEntity == false && entityiterator instanceof TheWorldBlackEntity == false
											&& entityiterator instanceof TheWorldOVAEntity == false && entityiterator instanceof TheWorldMangaEntity == false && entityiterator instanceof StarPlatinumP3Entity == false
											&& entityiterator instanceof StarPlatinumP4Entity == false && entityiterator instanceof StarPlatinumP6Entity == false && entityiterator instanceof StarPlatinumOVAEntity == false
											&& entityiterator instanceof StarPlatinumGreenEntity == false && entityiterator instanceof StarPlatinumBlueEntity == false && entityiterator instanceof StarPlatinumMangaEntity == false) {
										entityiterator
												.setDeltaMovement(new Vec3((entityiterator.getPersistentData().getDouble("TimeX")), (entityiterator.getPersistentData().getDouble("TimeY")), (entityiterator.getPersistentData().getDouble("TimeZ"))));
										entityiterator.getPersistentData().putBoolean("InitialStop", false);
									}
								}
							}
						});
					});
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("jojowos:stand_mob")))) {
								if (entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) {
									if (entityiterator instanceof StarPlatinumBlueEntity) {
										((StarPlatinumBlueEntity) entityiterator).setAnimation("timestop");
									}
									if (entityiterator instanceof StarPlatinumGreenEntity) {
										((StarPlatinumGreenEntity) entityiterator).setAnimation("timestop");
									}
									if (entityiterator instanceof StarPlatinumMangaEntity) {
										((StarPlatinumMangaEntity) entityiterator).setAnimation("timestop");
									}
									if (entityiterator instanceof StarPlatinumOVAEntity) {
										((StarPlatinumOVAEntity) entityiterator).setAnimation("timestop");
									}
									if (entityiterator instanceof StarPlatinumP3Entity) {
										((StarPlatinumP3Entity) entityiterator).setAnimation("timestop");
									}
									if (entityiterator instanceof StarPlatinumP4Entity) {
										((StarPlatinumP4Entity) entityiterator).setAnimation("timestop");
									}
									if (entityiterator instanceof StarPlatinumP6Entity) {
										((StarPlatinumP6Entity) entityiterator).setAnimation("timestop");
									}
								}
							}
						}
					}
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Goku : Ultra Instinct!"), true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:goku_timefreeze")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:goku_timefreeze")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				JojowosMod.queueServerWork(17, () -> {
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(200 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if ((entityiterator == entity) == false && entityiterator instanceof TheWorldEntity == false && entityiterator instanceof TheWorldSilverEntity == false && entityiterator instanceof TheWorldBlackEntity == false
									&& entityiterator instanceof TheWorldOVAEntity == false && entityiterator instanceof TheWorldMangaEntity == false && entityiterator instanceof StarPlatinumP3Entity == false
									&& entityiterator instanceof StarPlatinumP4Entity == false && entityiterator instanceof StarPlatinumP6Entity == false && entityiterator instanceof StarPlatinumOVAEntity == false
									&& entityiterator instanceof StarPlatinumGreenEntity == false && entityiterator instanceof StarPlatinumBlueEntity == false && entityiterator instanceof StarPlatinumMangaEntity == false) {
								entityiterator.getPersistentData().putDouble("TimeX", (entityiterator.getDeltaMovement().x()));
								entityiterator.getPersistentData().putDouble("TimeY", (entityiterator.getDeltaMovement().y()));
								entityiterator.getPersistentData().putDouble("TimeZ", (entityiterator.getDeltaMovement().z()));
								entityiterator.getPersistentData().putBoolean("InitialStop", true);
							}
						}
					}
				});
				JojowosMod.queueServerWork(18, () -> {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:goku_timestop")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:goku_timestop")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle minecraft:dust 0.263 0.278 0.29 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
					JojowosMod.queueServerWork(10, () -> {
						entity.getPersistentData().putBoolean("Infront", false);
					});
					if (world.getLevelData().getGameRules().getBoolean(GameRules.RULE_DAYLIGHT) == true) {
						JojowosModVariables.MapVariables.get(world).DaylightChanged = true;
						JojowosModVariables.MapVariables.get(world).syncData(world);
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"gamerule doDaylightCycle false");
					}
					if (world.getLevelData().getGameRules().getBoolean(GameRules.RULE_FIRE_DAMAGE) == true) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"gamerule fireDamage false");
						JojowosModVariables.MapVariables.get(world).FireDamageChanged = true;
						JojowosModVariables.MapVariables.get(world).syncData(world);
					}
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 10, 2, false, false));
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(JojowosModMobEffects.STOPPED_TIME.get(),
								(int) (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).TimeStopLength, 0, false, false));
					entity.getPersistentData().putDouble("TimeFreezeEffect", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).TimeStopLength));
					JojowosMod.queueServerWork((int) (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).TimeStopLength, () -> {
						{
							boolean _setval = false;
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.TimeStop = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 10, 2, false, false));
						if (JojowosModVariables.MapVariables.get(world).DaylightChanged == true) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"gamerule doDaylightCycle true");
							JojowosModVariables.MapVariables.get(world).DaylightChanged = false;
							JojowosModVariables.MapVariables.get(world).syncData(world);
						}
						if (JojowosModVariables.MapVariables.get(world).FireDamageChanged == true) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"gamerule fireDamage true");
							JojowosModVariables.MapVariables.get(world).FireDamageChanged = false;
							JojowosModVariables.MapVariables.get(world).syncData(world);
						}
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(200 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if ((entityiterator == entity) == false && entityiterator instanceof TheWorldEntity == false && entityiterator instanceof TheWorldSilverEntity == false && entityiterator instanceof TheWorldBlackEntity == false
										&& entityiterator instanceof TheWorldOVAEntity == false && entityiterator instanceof TheWorldMangaEntity == false && entityiterator instanceof StarPlatinumP3Entity == false
										&& entityiterator instanceof StarPlatinumP4Entity == false && entityiterator instanceof StarPlatinumP6Entity == false && entityiterator instanceof StarPlatinumOVAEntity == false
										&& entityiterator instanceof StarPlatinumGreenEntity == false && entityiterator instanceof StarPlatinumBlueEntity == false && entityiterator instanceof StarPlatinumMangaEntity == false) {
									entityiterator.setDeltaMovement(new Vec3((entityiterator.getPersistentData().getDouble("TimeX")), (entityiterator.getPersistentData().getDouble("TimeY")), (entityiterator.getPersistentData().getDouble("TimeZ"))));
									entityiterator.getPersistentData().putBoolean("InitialStop", false);
								}
							}
						}
					});
				});
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("jojowos:stand_mob")))) {
							if (entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) {
								if (entityiterator instanceof StarPlatinumUltraInstinctEntity) {
									((StarPlatinumUltraInstinctEntity) entityiterator).setAnimation("timestop");
								}
							}
						}
					}
				}
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Time Stop is on Cooldown!"), true);
		}
	}
}
