package net.mcreator.jojowos.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.jojowos.entity.SilverChariotOVAArmorlessEntity;
import net.mcreator.jojowos.entity.SilverChariotMangaArmorlessEntity;
import net.mcreator.jojowos.entity.SilverChariotGoldArmorlessEntity;
import net.mcreator.jojowos.entity.SilverChariotArmorlessEntity;

import java.util.List;
import java.util.Comparator;

public class ArmorlessEffectEndProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof SilverChariotArmorlessEntity) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle minecraft:dust 0.796 0.863 0.925 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle minecraft:dust 0.345 0.392 0.525 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
					if (!entityiterator.level().isClientSide())
						entityiterator.discard();
				}
				if (entityiterator instanceof SilverChariotGoldArmorlessEntity) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle minecraft:dust 0.969 0.867 0.263 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle minecraft:dust 0.608 0.514 0.176 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
					if (!entityiterator.level().isClientSide())
						entityiterator.discard();
				}
				if (entityiterator instanceof SilverChariotMangaArmorlessEntity) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle minecraft:dust 0.82 0.859 0.89 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle minecraft:dust 0.533 0.576 0.675 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
					if (!entityiterator.level().isClientSide())
						entityiterator.discard();
				}
				if (entityiterator instanceof SilverChariotOVAArmorlessEntity) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle minecraft:dust 0.702 0.788 0.808 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle minecraft:dust 0.859 0.725 0.322 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
					if (!entityiterator.level().isClientSide())
						entityiterator.discard();
				}
			}
		}
		StandDespawningProcedure.execute(world, x, y, z, entity);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:stand_unsummon")), SoundSource.PLAYERS, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:stand_unsummon")), SoundSource.PLAYERS, 1, 1, false);
			}
		}
	}
}
