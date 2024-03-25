package net.mcreator.jojowos.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
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
import net.mcreator.jojowos.JojowosMod;

import java.util.List;
import java.util.Comparator;

public class StarPlatinumInhaleProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("Ability3Cooldown") == 0) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NoCooldown == false) {
				entity.getPersistentData().putDouble("Ability3Cooldown", (400 + Math.round((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSpeed * (-2.525))));
			} else {
				entity.getPersistentData().putDouble("Ability3Cooldown", 40);
			}
			{
				double _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).CurrentExp + 10
						+ (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPotential / 3;
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CurrentExp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 30, 2, false, false));
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.place")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.place")), SoundSource.PLAYERS, 1, 1, false);
				}
			}
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 1 1 1 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world
						.getEntitiesOfClass(Entity.class,
								new AABB(_center, _center).inflate((20 + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPrecision / 20) / 2d), e -> true)
						.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if ((entityiterator == entity) == false) {
						if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("jojowos:stand_mob"))) == false) {
							entityiterator.setDeltaMovement(new Vec3((((entityiterator.getX() - entity.getX()) * (-1)) / 7), 0, (((entityiterator.getZ() - entity.getZ()) * (-1)) / 7)));
							entityiterator.getPersistentData().putBoolean("Inhaled1", true);
							entity.getPersistentData().putDouble("Inhale1x", (((entityiterator.getX() - entity.getX()) * (-1)) / 7));
							entity.getPersistentData().putDouble("Inhale1z", (((entityiterator.getZ() - entity.getZ()) * (-1)) / 7));
							entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.DRY_OUT)), 2);
							JojowosMod.queueServerWork(1, () -> {
								entityiterator.getPersistentData().putBoolean("Inhaled1", false);
							});
						}
					}
				}
			}
			JojowosMod.queueServerWork(20, () -> {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.place")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.place")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:dust 1 1 1 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world
							.getEntitiesOfClass(Entity.class,
									new AABB(_center, _center).inflate((15 + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPrecision / 20) / 2d), e -> true)
							.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if ((entityiterator == entity) == false) {
							if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("jojowos:stand_mob"))) == false) {
								entityiterator.setDeltaMovement(new Vec3((((entityiterator.getX() - entity.getX()) * (-1)) / 5), 0, (((entityiterator.getZ() - entity.getZ()) * (-1)) / 5)));
								entityiterator.getPersistentData().putBoolean("Inahled2", true);
								entity.getPersistentData().putDouble("Inhale2x", (((entityiterator.getX() - entity.getX()) * (-1)) / 5));
								entity.getPersistentData().putDouble("Inhale2z", (((entityiterator.getZ() - entity.getZ()) * (-1)) / 5));
								entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.DRY_OUT)), 2);
								JojowosMod.queueServerWork(1, () -> {
									entityiterator.getPersistentData().putBoolean("Inahled2", false);
								});
							}
						}
					}
				}
				JojowosMod.queueServerWork(20, () -> {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle minecraft:dust 1 1 1 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.place")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wool.place")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world
								.getEntitiesOfClass(Entity.class,
										new AABB(_center, _center).inflate((10 + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPrecision / 20) / 2d), e -> true)
								.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if ((entityiterator == entity) == false) {
								if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("jojowos:stand_mob"))) == false) {
									entityiterator.setDeltaMovement(new Vec3((((entityiterator.getX() - entity.getX()) * (-1)) / 3), 0, (((entityiterator.getZ() - entity.getZ()) * (-1)) / 3)));
									entityiterator.getPersistentData().putBoolean("Inahled3", true);
									entity.getPersistentData().putDouble("Inhale3x", (((entityiterator.getX() - entity.getX()) * (-1)) / 3));
									entity.getPersistentData().putDouble("Inhale3z", (((entityiterator.getZ() - entity.getZ()) * (-1)) / 3));
									entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.DRY_OUT)), 2);
									JojowosMod.queueServerWork(1, () -> {
										entityiterator.getPersistentData().putBoolean("Inahled3", false);
									});
								}
							}
						}
					}
				});
			});
			if (!((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Goku")) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:starplatinum_inhale")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:starplatinum_inhale")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
			} else {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:goku_drag")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:goku_drag")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				JojowosMod.queueServerWork(17, () -> {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:goku_inhale")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:goku_inhale")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
				});
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Inhale is on Cooldown!"), true);
		}
	}
}
