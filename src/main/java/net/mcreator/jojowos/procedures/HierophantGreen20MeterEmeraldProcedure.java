package net.mcreator.jojowos.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.init.JojowosModEntities;
import net.mcreator.jojowos.entity.EmeraldBarrierEntity;

import java.util.List;
import java.util.Comparator;

public class HierophantGreen20MeterEmeraldProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean gate = false;
		double mag = 0;
		double deltaz = 0;
		double distance = 0;
		double deltax = 0;
		double deltay = 0;
		double dampen = 0;
		gate = false;
		if (entity.getPersistentData().getDouble("BarrierCount") == 0) {
			entity.getPersistentData().putDouble("BarrierCount", 1);
		}
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilityCooldown2 == 0) {
			if (entity.getPersistentData().getDouble("BarrierCount") <= 20) {
				if ((entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
						.getType() == HitResult.Type.BLOCK) == true) {
					if (entity.getPersistentData().getBoolean("Barrier1Set") == false && gate == false) {
						entity.getPersistentData().putBoolean("Barrier1Set", true);
						{
							double _setval = 10;
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.AbilityCooldown2 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = JojowosModEntities.EMERALD_BARRIER.get().spawn(_level, BlockPos.containing(
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getX(),
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()
											+ 1,
									entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
									MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(15 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if (entityiterator instanceof EmeraldBarrierEntity) {
									if ((entityiterator instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) == false) {
										if (entityiterator instanceof EmeraldBarrierEntity _datEntSetI)
											_datEntSetI.getEntityData().set(EmeraldBarrierEntity.DATA_BarrierCount, (int) entity.getPersistentData().getDouble("BarrierCount"));
										if (entityiterator instanceof EmeraldBarrierEntity _datEntSetI)
											_datEntSetI.getEntityData().set(EmeraldBarrierEntity.DATA_BarrierPos, 1);
										if (entityiterator instanceof TamableAnimal _toTame && entity instanceof Player _owner)
											_toTame.tame(_owner);
									}
								}
							}
						}
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Position 1 Set!"), true);
						gate = true;
						entity.getPersistentData().putDouble("Barrier1X",
								(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()));
						entity.getPersistentData().putDouble("Barrier1Y",
								(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()));
						entity.getPersistentData().putDouble("Barrier1Z",
								(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
					}
					if (entity.getPersistentData().getBoolean("Barrier2Set") == false && gate == false) {
						entity.getPersistentData().putDouble("Barrier2X",
								(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()));
						entity.getPersistentData().putDouble("Barrier2Y",
								(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()));
						entity.getPersistentData().putDouble("Barrier2Z",
								(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
						deltax = entity.getPersistentData().getDouble("Barrier2X") - entity.getPersistentData().getDouble("Barrier1X");
						deltay = entity.getPersistentData().getDouble("Barrier2Y") - entity.getPersistentData().getDouble("Barrier1Y");
						deltaz = entity.getPersistentData().getDouble("Barrier2Z") - entity.getPersistentData().getDouble("Barrier1Z");
						mag = Math.sqrt(deltax * deltax + deltay * deltay + deltaz * deltaz);
						if (mag <= 20) {
							entity.getPersistentData().putBoolean("Barrier2Set", true);
							entity.getPersistentData().putDouble("Ability2Cooldown", 10);
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = JojowosModEntities.EMERALD_BARRIER.get().spawn(_level, BlockPos.containing(
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getX(),
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()
												+ 1,
										entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos()
												.getZ()),
										MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setDeltaMovement(0, 0, 0);
								}
							}
							{
								final Vec3 _center = new Vec3(x, y, z);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(15 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
								for (Entity entityiterator : _entfound) {
									if (entityiterator instanceof EmeraldBarrierEntity) {
										if ((entityiterator instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) == false) {
											if (entityiterator instanceof EmeraldBarrierEntity _datEntSetI)
												_datEntSetI.getEntityData().set(EmeraldBarrierEntity.DATA_BarrierCount, (int) entity.getPersistentData().getDouble("BarrierCount"));
											if (entityiterator instanceof EmeraldBarrierEntity _datEntSetI)
												_datEntSetI.getEntityData().set(EmeraldBarrierEntity.DATA_BarrierPos, 2);
											if (entityiterator instanceof TamableAnimal _toTame && entity instanceof Player _owner)
												_toTame.tame(_owner);
										}
									}
								}
							}
							gate = true;
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("Too Far Away!"), true);
						}
					}
					if (entity.getPersistentData().getBoolean("Barrier1Set") == true && entity.getPersistentData().getBoolean("Barrier2Set") == true) {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal(("Barrier Placed : " + new java.text.DecimalFormat("##").format(entity.getPersistentData().getDouble("BarrierCount")) + "/20")), true);
						entity.getPersistentData().putDouble("BarrierCount", (entity.getPersistentData().getDouble("BarrierCount") + 1));
						{
							double _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).CurrentExp + 10;
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.CurrentExp = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						entity.getPersistentData().putDouble("Barrier1X", 0);
						entity.getPersistentData().putDouble("Barrier1Y", 0);
						entity.getPersistentData().putDouble("Barrier1Z", 0);
						entity.getPersistentData().putDouble("Barrier2X", 0);
						entity.getPersistentData().putDouble("Barrier2Y", 0);
						entity.getPersistentData().putDouble("Barrier2Z", 0);
						{
							double _setval = 30;
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.AbilityCooldown2 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						entity.getPersistentData().putBoolean("Barrier1Set", false);
						entity.getPersistentData().putBoolean("Barrier2Set", false);
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"particle minecraft:dust 0.137 0.439 0.29 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:hierophant_barrier")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:hierophant_barrier")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					}
					if (entity.getPersistentData().getDouble("BarrierCount") > 20) {
						{
							double _setval = 1200;
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.AbilityCooldown2 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						entity.getPersistentData().putDouble("BarrierCount", 1);
					}
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Must Look at a Block!"), true);
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Maximum Barriers Placed!"), true);
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Emerald Barrier is on Cooldown!"), true);
		}
	}
}
