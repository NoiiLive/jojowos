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
import net.mcreator.jojowos.init.JojowosModEntities;
import net.mcreator.jojowos.entity.SilverChariotOVAEntity;
import net.mcreator.jojowos.entity.SilverChariotOVAArmorlessEntity;
import net.mcreator.jojowos.entity.SilverChariotMangaEntity;
import net.mcreator.jojowos.entity.SilverChariotMangaArmorlessEntity;
import net.mcreator.jojowos.entity.SilverChariotKokushiboEntity;
import net.mcreator.jojowos.entity.SilverChariotKokushiboArmorlessEntity;
import net.mcreator.jojowos.entity.SilverChariotGoldEntity;
import net.mcreator.jojowos.entity.SilverChariotGoldArmorlessEntity;
import net.mcreator.jojowos.entity.SilverChariotEntity;
import net.mcreator.jojowos.entity.SilverChariotArmorlessEntity;
import net.mcreator.jojowos.entity.InvisFistProjectileEntity;
import net.mcreator.jojowos.configuration.MoveDirectoryConfiguration;
import net.mcreator.jojowos.JojowosMod;

import java.util.List;
import java.util.Comparator;

public class StandSwordBarrageProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean gate = false;
		boolean usemove = false;
		double cooldown = 0;
		double subtract = 0;
		double nocooldown = 0;
		String move = "";
		usemove = false;
		subtract = ((double) MoveDirectoryConfiguration.SWORDBARRAGECDMIN.get() - (double) MoveDirectoryConfiguration.SWORDBARRAGECDMAX.get())
				/ (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).MaxSpeed;
		if (subtract != 0) {
			cooldown = (double) MoveDirectoryConfiguration.SWORDBARRAGECDMAX.get() + Math.round((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSpeed * subtract);
		} else {
			cooldown = (double) MoveDirectoryConfiguration.SWORDBARRAGECDMAX.get();
		}
		nocooldown = 60;
		move = "Sword Barrage";
		if (usemove == false && ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilitySelected)
				.equals((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilitySlot1)) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilityCooldown1 == 0) {
				if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NoCooldown == false) {
					{
						double _setval = cooldown;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.AbilityCooldown1 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						double _setval = nocooldown;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.AbilityCooldown1 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				usemove = true;
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal((move + " is on Cooldown!")), true);
			}
		}
		if (usemove == false && ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilitySelected)
				.equals((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilitySlot2)) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilityCooldown2 == 0) {
				if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NoCooldown == false) {
					{
						double _setval = cooldown;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.AbilityCooldown2 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						double _setval = nocooldown;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.AbilityCooldown2 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				usemove = true;
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal((move + " is on Cooldown!")), true);
			}
		}
		if (usemove == false && ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilitySelected)
				.equals((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilitySlot3)) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilityCooldown3 == 0) {
				if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NoCooldown == false) {
					{
						double _setval = cooldown;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.AbilityCooldown3 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						double _setval = nocooldown;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.AbilityCooldown3 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				usemove = true;
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal((move + " is on Cooldown!")), true);
			}
		}
		if (usemove == false && ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilitySelected)
				.equals((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilitySlot4)) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilityCooldown4 == 0) {
				if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NoCooldown == false) {
					{
						double _setval = cooldown;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.AbilityCooldown4 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						double _setval = nocooldown;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.AbilityCooldown4 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				usemove = true;
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal((move + " is on Cooldown!")), true);
			}
		}
		if (usemove == false && ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilitySelected)
				.equals((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilitySlot5)) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilityCooldown5 == 0) {
				if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NoCooldown == false) {
					{
						double _setval = cooldown;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.AbilityCooldown5 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						double _setval = nocooldown;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.AbilityCooldown5 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				usemove = true;
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal((move + " is on Cooldown!")), true);
			}
		}
		if (usemove == false && ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilitySelected)
				.equals((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilitySlot6)) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilityCooldown6 == 0) {
				if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NoCooldown == false) {
					{
						double _setval = cooldown;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.AbilityCooldown6 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						double _setval = nocooldown;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.AbilityCooldown6 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				usemove = true;
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal((move + " is on Cooldown!")), true);
			}
		}
		if (usemove == false && ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilitySelected)
				.equals((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilitySlot7)) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilityCooldown7 == 0) {
				if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NoCooldown == false) {
					{
						double _setval = cooldown;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.AbilityCooldown7 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						double _setval = nocooldown;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.AbilityCooldown7 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				usemove = true;
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal((move + " is on Cooldown!")), true);
			}
		}
		if (usemove == false && ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilitySelected)
				.equals((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilitySlot8)) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilityCooldown8 == 0) {
				if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NoCooldown == false) {
					{
						double _setval = cooldown;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.AbilityCooldown8 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						double _setval = nocooldown;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.AbilityCooldown8 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				usemove = true;
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal((move + " is on Cooldown!")), true);
			}
		}
		if (usemove == false && ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilitySelected)
				.equals((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilitySlot9)) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilityCooldown9 == 0) {
				if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NoCooldown == false) {
					{
						double _setval = cooldown;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.AbilityCooldown9 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						double _setval = nocooldown;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.AbilityCooldown9 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				usemove = true;
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal((move + " is on Cooldown!")), true);
			}
		}
		if (usemove == true) {
			{
				double _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).CurrentExp + 10
						+ (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPotential / 3;
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CurrentExp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			entity.getPersistentData().putBoolean("Attack", true);
			if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("SilverChariot")) {
				if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Kokushibo")) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.PLAYERS, 1, (float) 0.7);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.PLAYERS, 1, (float) 0.7, false);
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:silverchariot_horarush")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:silverchariot_horarush")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.PLAYERS, 1, (float) 0.7);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.PLAYERS, 1, (float) 0.7, false);
						}
					}
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("jojowos:stand_mob")))) {
						if ((entityiterator instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) == entity) {
							if (entityiterator instanceof SilverChariotEntity) {
								((SilverChariotEntity) entityiterator).setAnimation("barrage");
							}
							if (entityiterator instanceof SilverChariotArmorlessEntity) {
								((SilverChariotArmorlessEntity) entityiterator).setAnimation("barrage");
							}
							if (entityiterator instanceof SilverChariotGoldEntity) {
								((SilverChariotGoldEntity) entityiterator).setAnimation("barrage");
							}
							if (entityiterator instanceof SilverChariotGoldArmorlessEntity) {
								((SilverChariotGoldArmorlessEntity) entityiterator).setAnimation("barrage");
							}
							if (entityiterator instanceof SilverChariotMangaEntity) {
								((SilverChariotMangaEntity) entityiterator).setAnimation("barrage");
							}
							if (entityiterator instanceof SilverChariotMangaArmorlessEntity) {
								((SilverChariotMangaArmorlessEntity) entityiterator).setAnimation("barrage");
							}
							if (entityiterator instanceof SilverChariotOVAEntity) {
								((SilverChariotOVAEntity) entityiterator).setAnimation("barrage");
							}
							if (entityiterator instanceof SilverChariotOVAArmorlessEntity) {
								((SilverChariotOVAArmorlessEntity) entityiterator).setAnimation("barrage");
							}
							if (entityiterator instanceof SilverChariotKokushiboEntity) {
								((SilverChariotKokushiboEntity) entityiterator).setAnimation("barrage");
							}
							if (entityiterator instanceof SilverChariotKokushiboArmorlessEntity) {
								((SilverChariotKokushiboArmorlessEntity) entityiterator).setAnimation("barrage");
							}
							JojowosMod.queueServerWork(10, () -> {
								{
									Entity _ent = entityiterator;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
												_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
												"execute at @s positioned ^0 ^1.5 ^2 run function jojowos:barrage_line");
									}
								}
								{
									Entity _ent = entityiterator;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
												_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
												"execute at @s run particle jojowos:impact ^0 ^1.7 ^4 0.5 0.2 0.5 0 1 force @a");
									}
								}
								JojowosMod.queueServerWork(1, () -> {
									{
										Entity _ent = entityiterator;
										if (!_ent.level().isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
													"execute at @s positioned ^0 ^1.5 ^2 run function jojowos:barrage_line");
										}
									}
									{
										Entity _ent = entityiterator;
										if (!_ent.level().isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
													"execute at @s run particle jojowos:impact ^0 ^1.7 ^4 0.5 0.2 0.5 0 1 force @a");
										}
									}
									JojowosMod.queueServerWork(1, () -> {
										{
											Entity _ent = entityiterator;
											if (!_ent.level().isClientSide() && _ent.getServer() != null) {
												_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
														_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
														"execute at @s positioned ^0 ^1.5 ^2 run function jojowos:barrage_line");
											}
										}
										{
											Entity _ent = entityiterator;
											if (!_ent.level().isClientSide() && _ent.getServer() != null) {
												_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
														_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
														"execute at @s run particle jojowos:impact ^0 ^1.7 ^4 0.5 0.2 0.5 0 1 force @a");
											}
										}
									});
								});
								JojowosMod.queueServerWork(5, () -> {
									{
										Entity _ent = entityiterator;
										if (!_ent.level().isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
													"execute at @s positioned ^0 ^1.5 ^2 run function jojowos:barrage_line");
										}
									}
									{
										Entity _ent = entityiterator;
										if (!_ent.level().isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
													"execute at @s run particle jojowos:impact ^0 ^1.7 ^4 0.5 0.2 0.5 0 1 force @a");
										}
									}
									JojowosMod.queueServerWork(1, () -> {
										{
											Entity _ent = entityiterator;
											if (!_ent.level().isClientSide() && _ent.getServer() != null) {
												_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
														_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
														"execute at @s positioned ^0 ^1.5 ^2 run function jojowos:barrage_line");
											}
										}
										{
											Entity _ent = entityiterator;
											if (!_ent.level().isClientSide() && _ent.getServer() != null) {
												_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
														_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
														"execute at @s run particle jojowos:impact ^0 ^1.7 ^4 0.5 0.2 0.5 0 1 force @a");
											}
										}
										JojowosMod.queueServerWork(1, () -> {
											{
												Entity _ent = entityiterator;
												if (!_ent.level().isClientSide() && _ent.getServer() != null) {
													_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
															_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
															"execute at @s positioned ^0 ^1.5 ^2 run function jojowos:barrage_line");
												}
											}
											{
												Entity _ent = entityiterator;
												if (!_ent.level().isClientSide() && _ent.getServer() != null) {
													_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
															_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
															"execute at @s run particle jojowos:impact ^0 ^1.7 ^4 0.5 0.2 0.5 0 1 force @a");
												}
											}
										});
									});
									JojowosMod.queueServerWork(5, () -> {
										{
											Entity _ent = entityiterator;
											if (!_ent.level().isClientSide() && _ent.getServer() != null) {
												_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
														_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
														"execute at @s positioned ^0 ^1.5 ^2 run function jojowos:barrage_line");
											}
										}
										{
											Entity _ent = entityiterator;
											if (!_ent.level().isClientSide() && _ent.getServer() != null) {
												_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
														_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
														"execute at @s run particle jojowos:impact ^0 ^1.7 ^4 0.5 0.2 0.5 0 1 force @a");
											}
										}
										JojowosMod.queueServerWork(1, () -> {
											{
												Entity _ent = entityiterator;
												if (!_ent.level().isClientSide() && _ent.getServer() != null) {
													_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
															_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
															"execute at @s positioned ^0 ^1.5 ^2 run function jojowos:barrage_line");
												}
											}
											{
												Entity _ent = entityiterator;
												if (!_ent.level().isClientSide() && _ent.getServer() != null) {
													_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
															_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
															"execute at @s run particle jojowos:impact ^0 ^1.7 ^4 0.5 0.2 0.5 0 1 force @a");
												}
											}
											JojowosMod.queueServerWork(1, () -> {
												{
													Entity _ent = entityiterator;
													if (!_ent.level().isClientSide() && _ent.getServer() != null) {
														_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																"execute at @s positioned ^0 ^1.5 ^2 run function jojowos:barrage_line");
													}
												}
												{
													Entity _ent = entityiterator;
													if (!_ent.level().isClientSide() && _ent.getServer() != null) {
														_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																"execute at @s run particle jojowos:impact ^0 ^1.7 ^4 0.5 0.2 0.5 0 1 force @a");
													}
												}
											});
										});
										JojowosMod.queueServerWork(5, () -> {
											{
												Entity _ent = entityiterator;
												if (!_ent.level().isClientSide() && _ent.getServer() != null) {
													_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
															_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
															"execute at @s positioned ^0 ^1.5 ^2 run function jojowos:barrage_line");
												}
											}
											{
												Entity _ent = entityiterator;
												if (!_ent.level().isClientSide() && _ent.getServer() != null) {
													_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
															_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
															"execute at @s run particle jojowos:impact ^0 ^1.7 ^4 0.5 0.2 0.5 0 1 force @a");
												}
											}
											JojowosMod.queueServerWork(1, () -> {
												{
													Entity _ent = entityiterator;
													if (!_ent.level().isClientSide() && _ent.getServer() != null) {
														_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																"execute at @s positioned ^0 ^1.5 ^2 run function jojowos:barrage_line");
													}
												}
												{
													Entity _ent = entityiterator;
													if (!_ent.level().isClientSide() && _ent.getServer() != null) {
														_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																"execute at @s run particle jojowos:impact ^0 ^1.7 ^4 0.5 0.2 0.5 0 1 force @a");
													}
												}
												JojowosMod.queueServerWork(1, () -> {
													{
														Entity _ent = entityiterator;
														if (!_ent.level().isClientSide() && _ent.getServer() != null) {
															_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																	_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																	"execute at @s positioned ^0 ^1.5 ^2 run function jojowos:barrage_line");
														}
													}
													{
														Entity _ent = entityiterator;
														if (!_ent.level().isClientSide() && _ent.getServer() != null) {
															_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																	_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																	"execute at @s run particle jojowos:impact ^0 ^1.7 ^4 0.5 0.2 0.5 0 1 force @a");
														}
													}
												});
											});
											JojowosMod.queueServerWork(5, () -> {
												{
													Entity _ent = entityiterator;
													if (!_ent.level().isClientSide() && _ent.getServer() != null) {
														_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																"execute at @s positioned ^0 ^1.5 ^2 run function jojowos:barrage_line");
													}
												}
												{
													Entity _ent = entityiterator;
													if (!_ent.level().isClientSide() && _ent.getServer() != null) {
														_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																"execute at @s run particle jojowos:impact ^0 ^1.7 ^4 0.5 0.2 0.5 0 1 force @a");
													}
												}
												JojowosMod.queueServerWork(1, () -> {
													{
														Entity _ent = entityiterator;
														if (!_ent.level().isClientSide() && _ent.getServer() != null) {
															_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																	_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																	"execute at @s positioned ^0 ^1.5 ^2 run function jojowos:barrage_line");
														}
													}
													{
														Entity _ent = entityiterator;
														if (!_ent.level().isClientSide() && _ent.getServer() != null) {
															_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																	_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																	"execute at @s run particle jojowos:impact ^0 ^1.7 ^4 0.5 0.2 0.5 0 1 force @a");
														}
													}
													JojowosMod.queueServerWork(1, () -> {
														{
															Entity _ent = entityiterator;
															if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																_ent.getServer().getCommands()
																		.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																				_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																				"execute at @s positioned ^0 ^1.5 ^2 run function jojowos:barrage_line");
															}
														}
														{
															Entity _ent = entityiterator;
															if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																_ent.getServer().getCommands()
																		.performPrefixedCommand(
																				new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
																						_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																				"execute at @s run particle jojowos:impact ^0 ^1.7 ^4 0.5 0.2 0.5 0 1 force @a");
															}
														}
													});
												});
												JojowosMod.queueServerWork(5, () -> {
													{
														Entity _ent = entityiterator;
														if (!_ent.level().isClientSide() && _ent.getServer() != null) {
															_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																	_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																	"execute at @s positioned ^0 ^1.5 ^2 run function jojowos:barrage_line");
														}
													}
													{
														Entity _ent = entityiterator;
														if (!_ent.level().isClientSide() && _ent.getServer() != null) {
															_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																	_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																	"execute at @s run particle jojowos:impact ^0 ^1.7 ^4 0.5 0.2 0.5 0 1 force @a");
														}
													}
													JojowosMod.queueServerWork(1, () -> {
														{
															Entity _ent = entityiterator;
															if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																_ent.getServer().getCommands()
																		.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																				_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																				"execute at @s positioned ^0 ^1.5 ^2 run function jojowos:barrage_line");
															}
														}
														{
															Entity _ent = entityiterator;
															if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																_ent.getServer().getCommands()
																		.performPrefixedCommand(
																				new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
																						_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																				"execute at @s run particle jojowos:impact ^0 ^1.7 ^4 0.5 0.2 0.5 0 1 force @a");
															}
														}
														JojowosMod.queueServerWork(1, () -> {
															{
																Entity _ent = entityiterator;
																if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																	_ent.getServer().getCommands()
																			.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																					_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																					"execute at @s positioned ^0 ^1.5 ^2 run function jojowos:barrage_line");
																}
															}
															{
																Entity _ent = entityiterator;
																if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																	_ent.getServer().getCommands()
																			.performPrefixedCommand(
																					new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
																							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																					"execute at @s run particle jojowos:impact ^0 ^1.7 ^4 0.5 0.2 0.5 0 1 force @a");
																}
															}
														});
													});
													JojowosMod.queueServerWork(5, () -> {
														{
															Entity _ent = entityiterator;
															if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																_ent.getServer().getCommands()
																		.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																				_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																				"execute at @s positioned ^0 ^1.5 ^2 run function jojowos:barrage_line");
															}
														}
														{
															Entity _ent = entityiterator;
															if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																_ent.getServer().getCommands()
																		.performPrefixedCommand(
																				new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
																						_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																				"execute at @s run particle jojowos:impact ^0 ^1.7 ^4 0.5 0.2 0.5 0 1 force @a");
															}
														}
														JojowosMod.queueServerWork(1, () -> {
															{
																Entity _ent = entityiterator;
																if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																	_ent.getServer().getCommands()
																			.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																					_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																					"execute at @s positioned ^0 ^1.5 ^2 run function jojowos:barrage_line");
																}
															}
															{
																Entity _ent = entityiterator;
																if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																	_ent.getServer().getCommands()
																			.performPrefixedCommand(
																					new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
																							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																					"execute at @s run particle jojowos:impact ^0 ^1.7 ^4 0.5 0.2 0.5 0 1 force @a");
																}
															}
															JojowosMod.queueServerWork(1, () -> {
																{
																	Entity _ent = entityiterator;
																	if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																		_ent.getServer().getCommands()
																				.performPrefixedCommand(
																						new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
																								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																						"execute at @s positioned ^0 ^1.5 ^2 run function jojowos:barrage_line");
																	}
																}
																{
																	Entity _ent = entityiterator;
																	if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																		_ent.getServer().getCommands().performPrefixedCommand(
																				new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
																						_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																				"execute at @s run particle jojowos:impact ^0 ^1.7 ^4 0.5 0.2 0.5 0 1 force @a");
																	}
																}
															});
														});
														JojowosMod.queueServerWork(5, () -> {
															{
																Entity _ent = entityiterator;
																if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																	_ent.getServer().getCommands()
																			.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																					_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																					"execute at @s positioned ^0 ^1.5 ^2 run function jojowos:barrage_line");
																}
															}
															{
																Entity _ent = entityiterator;
																if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																	_ent.getServer().getCommands()
																			.performPrefixedCommand(
																					new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
																							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																					"execute at @s run particle jojowos:impact ^0 ^1.7 ^4 0.5 0.2 0.5 0 1 force @a");
																}
															}
															JojowosMod.queueServerWork(1, () -> {
																{
																	Entity _ent = entityiterator;
																	if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																		_ent.getServer().getCommands()
																				.performPrefixedCommand(
																						new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
																								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																						"execute at @s positioned ^0 ^1.5 ^2 run function jojowos:barrage_line");
																	}
																}
																{
																	Entity _ent = entityiterator;
																	if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																		_ent.getServer().getCommands().performPrefixedCommand(
																				new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
																						_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																				"execute at @s run particle jojowos:impact ^0 ^1.7 ^4 0.5 0.2 0.5 0 1 force @a");
																	}
																}
																JojowosMod.queueServerWork(1, () -> {
																	{
																		Entity _ent = entityiterator;
																		if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																			_ent.getServer().getCommands()
																					.performPrefixedCommand(
																							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
																									4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																							"execute at @s positioned ^0 ^1.5 ^2 run function jojowos:barrage_line");
																		}
																	}
																	{
																		Entity _ent = entityiterator;
																		if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																			_ent.getServer().getCommands().performPrefixedCommand(
																					new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
																							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																					"execute at @s run particle jojowos:impact ^0 ^1.7 ^4 0.5 0.2 0.5 0 1 force @a");
																		}
																	}
																});
															});
															JojowosMod.queueServerWork(5, () -> {
																{
																	Entity _ent = entityiterator;
																	if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																		_ent.getServer().getCommands()
																				.performPrefixedCommand(
																						new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
																								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																						"execute at @s positioned ^0 ^1.5 ^2 run function jojowos:barrage_line");
																	}
																}
																{
																	Entity _ent = entityiterator;
																	if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																		_ent.getServer().getCommands().performPrefixedCommand(
																				new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
																						_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																				"execute at @s run particle jojowos:impact ^0 ^1.7 ^4 0.5 0.2 0.5 0 1 force @a");
																	}
																}
																JojowosMod.queueServerWork(1, () -> {
																	{
																		Entity _ent = entityiterator;
																		if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																			_ent.getServer().getCommands()
																					.performPrefixedCommand(
																							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
																									4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																							"execute at @s positioned ^0 ^1.5 ^2 run function jojowos:barrage_line");
																		}
																	}
																	{
																		Entity _ent = entityiterator;
																		if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																			_ent.getServer().getCommands().performPrefixedCommand(
																					new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
																							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																					"execute at @s run particle jojowos:impact ^0 ^1.7 ^4 0.5 0.2 0.5 0 1 force @a");
																		}
																	}
																	JojowosMod.queueServerWork(1, () -> {
																		{
																			Entity _ent = entityiterator;
																			if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																				_ent.getServer().getCommands().performPrefixedCommand(
																						new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
																								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																						"execute at @s positioned ^0 ^1.5 ^2 run function jojowos:barrage_line");
																			}
																		}
																		{
																			Entity _ent = entityiterator;
																			if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																				_ent.getServer().getCommands().performPrefixedCommand(
																						new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
																								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																						"execute at @s run particle jojowos:impact ^0 ^1.7 ^4 0.5 0.2 0.5 0 1 force @a");
																			}
																		}
																	});
																});
																JojowosMod.queueServerWork(5, () -> {
																	{
																		Entity _ent = entityiterator;
																		if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																			_ent.getServer().getCommands()
																					.performPrefixedCommand(
																							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
																									4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																							"execute at @s positioned ^0 ^1.5 ^2 run function jojowos:barrage_line");
																		}
																	}
																	{
																		Entity _ent = entityiterator;
																		if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																			_ent.getServer().getCommands().performPrefixedCommand(
																					new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
																							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																					"execute at @s run particle jojowos:impact ^0 ^1.7 ^4 0.5 0.2 0.5 0 1 force @a");
																		}
																	}
																	JojowosMod.queueServerWork(1, () -> {
																		{
																			Entity _ent = entityiterator;
																			if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																				_ent.getServer().getCommands().performPrefixedCommand(
																						new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
																								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																						"execute at @s positioned ^0 ^1.5 ^2 run function jojowos:barrage_line");
																			}
																		}
																		{
																			Entity _ent = entityiterator;
																			if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																				_ent.getServer().getCommands().performPrefixedCommand(
																						new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
																								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																						"execute at @s run particle jojowos:impact ^0 ^1.7 ^4 0.5 0.2 0.5 0 1 force @a");
																			}
																		}
																		JojowosMod.queueServerWork(1, () -> {
																			{
																				Entity _ent = entityiterator;
																				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																					_ent.getServer().getCommands().performPrefixedCommand(
																							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
																									4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																							"execute at @s positioned ^0 ^1.5 ^2 run function jojowos:barrage_line");
																				}
																			}
																			{
																				Entity _ent = entityiterator;
																				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																					_ent.getServer().getCommands().performPrefixedCommand(
																							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
																									4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																							"execute at @s run particle jojowos:impact ^0 ^1.7 ^4 0.5 0.2 0.5 0 1 force @a");
																				}
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
							});
						}
					}
				}
			}
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 3, false, false));
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
				}.getArrow(projectileLevel, entity, (float) (2 + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower / 35), (int) 0.1, (byte) 1);
				_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
				_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), (float) 1.2, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
			JojowosMod.queueServerWork(4, () -> {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"kill @e[type=jojowos:invis_fist_projectile,limit=1]");
				JojowosMod.queueServerWork(1, () -> {
					entity.getPersistentData().putBoolean("Barrage", true);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")), SoundSource.PLAYERS, 1, (float) 0.7);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")), SoundSource.PLAYERS, 1, (float) 0.7, false);
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
						}.getArrow(projectileLevel, entity, (float) (2 + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower / 35), (int) 0.1, (byte) 1);
						_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
						_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), (float) 1.2, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
					JojowosMod.queueServerWork(4, () -> {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"kill @e[type=jojowos:invis_fist_projectile,limit=1]");
						JojowosMod.queueServerWork(1, () -> {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")), SoundSource.PLAYERS, 1, (float) 0.7);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")), SoundSource.PLAYERS, 1, (float) 0.7, false);
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
								}.getArrow(projectileLevel, entity, (float) (2 + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower / 35), (int) 0.1, (byte) 1);
								_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
								_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), (float) 1.2, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
							JojowosMod.queueServerWork(4, () -> {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"kill @e[type=jojowos:invis_fist_projectile,limit=1]");
								JojowosMod.queueServerWork(1, () -> {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")), SoundSource.PLAYERS, 1, (float) 0.7);
										} else {
											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")), SoundSource.PLAYERS, 1, (float) 0.7, false);
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
										}.getArrow(projectileLevel, entity, (float) (2 + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower / 35), (int) 0.1,
												(byte) 1);
										_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
										_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), (float) 1.2, 0);
										projectileLevel.addFreshEntity(_entityToSpawn);
									}
									JojowosMod.queueServerWork(4, () -> {
										if (world instanceof ServerLevel _level)
											_level.getServer().getCommands().performPrefixedCommand(
													new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
													"kill @e[type=jojowos:invis_fist_projectile,limit=1]");
										JojowosMod.queueServerWork(1, () -> {
											if (world instanceof Level _level) {
												if (!_level.isClientSide()) {
													_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")), SoundSource.PLAYERS, 1, (float) 0.7);
												} else {
													_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")), SoundSource.PLAYERS, 1, (float) 0.7, false);
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
												}.getArrow(projectileLevel, entity, (float) (2 + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower / 35),
														(int) 0.1, (byte) 1);
												_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
												_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), (float) 1.2, 0);
												projectileLevel.addFreshEntity(_entityToSpawn);
											}
											JojowosMod.queueServerWork(4, () -> {
												if (world instanceof ServerLevel _level)
													_level.getServer().getCommands().performPrefixedCommand(
															new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
															"kill @e[type=jojowos:invis_fist_projectile,limit=1]");
												JojowosMod.queueServerWork(1, () -> {
													if (world instanceof Level _level) {
														if (!_level.isClientSide()) {
															_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")), SoundSource.PLAYERS, 1, (float) 0.7);
														} else {
															_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")), SoundSource.PLAYERS, 1, (float) 0.7, false);
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
														}.getArrow(projectileLevel, entity, (float) (2 + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower / 35),
																(int) 0.1, (byte) 1);
														_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
														_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), (float) 1.2, 0);
														projectileLevel.addFreshEntity(_entityToSpawn);
													}
													JojowosMod.queueServerWork(4, () -> {
														if (world instanceof ServerLevel _level)
															_level.getServer().getCommands().performPrefixedCommand(
																	new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
																	"kill @e[type=jojowos:invis_fist_projectile,limit=1]");
														JojowosMod.queueServerWork(1, () -> {
															if (world instanceof Level _level) {
																if (!_level.isClientSide()) {
																	_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")), SoundSource.PLAYERS, 1, (float) 0.7);
																} else {
																	_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")), SoundSource.PLAYERS, 1, (float) 0.7, false);
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
																}.getArrow(projectileLevel, entity,
																		(float) (2 + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower / 35), (int) 0.1,
																		(byte) 1);
																_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
																_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), (float) 1.2, 0);
																projectileLevel.addFreshEntity(_entityToSpawn);
															}
															JojowosMod.queueServerWork(4, () -> {
																if (world instanceof ServerLevel _level)
																	_level.getServer().getCommands().performPrefixedCommand(
																			new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
																			"kill @e[type=jojowos:invis_fist_projectile,limit=1]");
																JojowosMod.queueServerWork(1, () -> {
																	if (world instanceof Level _level) {
																		if (!_level.isClientSide()) {
																			_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")), SoundSource.PLAYERS, 1, (float) 0.7);
																		} else {
																			_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")), SoundSource.PLAYERS, 1, (float) 0.7, false);
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
																		}.getArrow(projectileLevel, entity,
																				(float) (2 + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower / 35), (int) 0.1,
																				(byte) 1);
																		_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
																		_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), (float) 1.2, 0);
																		projectileLevel.addFreshEntity(_entityToSpawn);
																	}
																	JojowosMod.queueServerWork(4, () -> {
																		if (world instanceof ServerLevel _level)
																			_level.getServer().getCommands().performPrefixedCommand(
																					new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
																					"kill @e[type=jojowos:invis_fist_projectile,limit=1]");
																		JojowosMod.queueServerWork(1, () -> {
																			if (world instanceof Level _level) {
																				if (!_level.isClientSide()) {
																					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")), SoundSource.PLAYERS, 1,
																							(float) 0.7);
																				} else {
																					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")), SoundSource.PLAYERS, 1, (float) 0.7, false);
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
																				}.getArrow(projectileLevel, entity,
																						(float) (2 + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower / 35),
																						(int) 0.1, (byte) 1);
																				_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
																				_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), (float) 1.2, 0);
																				projectileLevel.addFreshEntity(_entityToSpawn);
																			}
																			JojowosMod.queueServerWork(4, () -> {
																				if (world instanceof ServerLevel _level)
																					_level.getServer().getCommands().performPrefixedCommand(
																							new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
																									.withSuppressedOutput(),
																							"kill @e[type=jojowos:invis_fist_projectile,limit=1]");
																				JojowosMod.queueServerWork(1, () -> {
																					if (world instanceof Level _level) {
																						if (!_level.isClientSide()) {
																							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")), SoundSource.PLAYERS,
																									1, (float) 0.7);
																						} else {
																							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")), SoundSource.PLAYERS, 1, (float) 0.7, false);
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
																						}.getArrow(projectileLevel, entity, (float) (2
																								+ (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower / 35),
																								(int) 0.1, (byte) 1);
																						_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
																						_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), (float) 1.2, 0);
																						projectileLevel.addFreshEntity(_entityToSpawn);
																					}
																					JojowosMod.queueServerWork(4, () -> {
																						if (world instanceof ServerLevel _level)
																							_level.getServer().getCommands().performPrefixedCommand(
																									new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
																											.withSuppressedOutput(),
																									"kill @e[type=jojowos:invis_fist_projectile,limit=1]");
																						JojowosMod.queueServerWork(1, () -> {
																							if (world instanceof Level _level) {
																								if (!_level.isClientSide()) {
																									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")),
																											SoundSource.PLAYERS, 1, (float) 0.7);
																								} else {
																									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")), SoundSource.PLAYERS, 1, (float) 0.7,
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
																								}.getArrow(projectileLevel, entity, (float) (2
																										+ (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower
																												/ 35),
																										(int) 0.1, (byte) 1);
																								_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
																								_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), (float) 1.2, 0);
																								projectileLevel.addFreshEntity(_entityToSpawn);
																							}
																							JojowosMod.queueServerWork(4, () -> {
																								if (world instanceof ServerLevel _level)
																									_level.getServer().getCommands().performPrefixedCommand(
																											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
																													.withSuppressedOutput(),
																											"kill @e[type=jojowos:invis_fist_projectile,limit=1]");
																								JojowosMod.queueServerWork(1, () -> {
																									if (world instanceof Level _level) {
																										if (!_level.isClientSide()) {
																											_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")),
																													SoundSource.PLAYERS, 1, (float) 0.7);
																										} else {
																											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")), SoundSource.PLAYERS, 1,
																													(float) 0.7, false);
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
																										}.getArrow(projectileLevel, entity, (float) (2 + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																												.orElse(new JojowosModVariables.PlayerVariables())).StandPower / 35), (int) 0.1, (byte) 1);
																										_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
																										_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), (float) 1.2, 0);
																										projectileLevel.addFreshEntity(_entityToSpawn);
																									}
																									JojowosMod.queueServerWork(4, () -> {
																										if (world instanceof ServerLevel _level)
																											_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
																													"", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "kill @e[type=jojowos:invis_fist_projectile,limit=1]");
																										JojowosMod.queueServerWork(1, () -> {
																											if (world instanceof Level _level) {
																												if (!_level.isClientSide()) {
																													_level.playSound(null, BlockPos.containing(x, y, z),
																															ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")), SoundSource.PLAYERS, 1, (float) 0.7);
																												} else {
																													_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.shoot")), SoundSource.PLAYERS,
																															1, (float) 0.7, false);
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
																												}.getArrow(projectileLevel, entity, (float) (2 + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																														.orElse(new JojowosModVariables.PlayerVariables())).StandPower / 35), (int) 0.1, (byte) 1);
																												_entityToSpawn.setPos((entity.getX()), (entity.getY() + 1.5), (entity.getZ()));
																												_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), (float) 1.2, 0);
																												projectileLevel.addFreshEntity(_entityToSpawn);
																											}
																											JojowosMod.queueServerWork(4, () -> {
																												if (world instanceof ServerLevel _level)
																													_level.getServer().getCommands()
																															.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
																																	Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
																																	"kill @e[type=jojowos:invis_fist_projectile,limit=1]");
																												entity.getPersistentData().putBoolean("Attack", false);
																												entity.getPersistentData().putBoolean("Barrage", false);
																												if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																														.orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Goku")) {
																													if (world instanceof Level _level) {
																														if (!_level.isClientSide()) {
																															_level.playSound(null, BlockPos.containing(x, y, z),
																																	ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:goku_howsthat")), SoundSource.PLAYERS, 1, 1);
																														} else {
																															_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:goku_howsthat")),
																																	SoundSource.PLAYERS, 1, 1, false);
																														}
																													}
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
		}
	}
}
