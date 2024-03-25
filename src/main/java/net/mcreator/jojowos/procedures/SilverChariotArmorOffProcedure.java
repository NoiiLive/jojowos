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
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.init.JojowosModMobEffects;
import net.mcreator.jojowos.entity.SilverChariotOVAEntity;
import net.mcreator.jojowos.entity.SilverChariotMangaEntity;
import net.mcreator.jojowos.entity.SilverChariotGoldEntity;
import net.mcreator.jojowos.entity.SilverChariotEntity;
import net.mcreator.jojowos.JojowosMod;

import java.util.List;
import java.util.Comparator;

public class SilverChariotArmorOffProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("Ability3Cooldown") == 0) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NoCooldown == false) {
				entity.getPersistentData().putDouble("Ability3Cooldown", (2400 + Math.round((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSpeed * (-10.101))));
			} else {
				entity.getPersistentData().putDouble("Ability3Cooldown", 520);
			}
			{
				double _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).CurrentExp + 20
						+ (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPotential / 3;
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CurrentExp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 2, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(JojowosModMobEffects.NO_ARMOR_CHARIOT.get(),
						(int) (200 + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPotential * 5), 0, false, false));
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof SilverChariotEntity) {
						if (entityiterator instanceof SilverChariotEntity) {
							((SilverChariotEntity) entityiterator).setAnimation("armoroff");
						}
						JojowosMod.queueServerWork(40, () -> {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
												.withSuppressedOutput(),
										"particle minecraft:dust 0.796 0.863 0.925 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
												.withSuppressedOutput(),
										"particle minecraft:dust 0.345 0.392 0.525 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
						});
					}
					if (entityiterator instanceof SilverChariotGoldEntity) {
						if (entityiterator instanceof SilverChariotGoldEntity) {
							((SilverChariotGoldEntity) entityiterator).setAnimation("armoroff");
						}
						JojowosMod.queueServerWork(40, () -> {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
												.withSuppressedOutput(),
										"particle minecraft:dust 0.969 0.867 0.263 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
												.withSuppressedOutput(),
										"particle minecraft:dust 0.608 0.514 0.176 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
						});
					}
					if (entityiterator instanceof SilverChariotMangaEntity) {
						if (entityiterator instanceof SilverChariotMangaEntity) {
							((SilverChariotMangaEntity) entityiterator).setAnimation("armoroff");
						}
						JojowosMod.queueServerWork(40, () -> {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
												.withSuppressedOutput(),
										"particle minecraft:dust 0.82 0.859 0.89 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
												.withSuppressedOutput(),
										"particle minecraft:dust 0.533 0.576 0.675 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
						});
					}
					if (entityiterator instanceof SilverChariotOVAEntity) {
						if (entityiterator instanceof SilverChariotOVAEntity) {
							((SilverChariotOVAEntity) entityiterator).setAnimation("armoroff");
						}
						JojowosMod.queueServerWork(40, () -> {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
												.withSuppressedOutput(),
										"particle minecraft:dust 0.702 0.788 0.808 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
												.withSuppressedOutput(),
										"particle minecraft:dust 0.859 0.725 0.322 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
						});
					}
				}
			}
			JojowosMod.queueServerWork(40, () -> {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:stand_bearingshot")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:stand_bearingshot")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
			});
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Armor Off is on Cooldown!"), true);
		}
	}
}
