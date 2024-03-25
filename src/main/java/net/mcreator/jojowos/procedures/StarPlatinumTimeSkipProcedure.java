package net.mcreator.jojowos.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.init.JojowosModMobEffects;
import net.mcreator.jojowos.JojowosMod;

public class StarPlatinumTimeSkipProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilityCooldown5 == 0) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NoCooldown == false) {
				{
					double _setval = 500 + Math.round((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSpeed * (-3.03));
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilityCooldown5 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				{
					double _setval = 10;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilityCooldown5 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			{
				double _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).CurrentExp + 15
						+ (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPotential / 3;
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CurrentExp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 10, 3, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(JojowosModMobEffects.STAND_JUMP_EFFECT.get(), 30, 0, false, false));
			JojowosMod.queueServerWork(5, () -> {
				{
					Entity _ent = entity;
					_ent.teleportTo(
							(entity.level()
									.clip(new ClipContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f)
													.add(entity.getViewVector(1f).scale((10 + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPrecision / 20))),
											ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
									.getBlockPos().getX()),
							(entity.level()
									.clip(new ClipContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f)
													.add(entity.getViewVector(1f).scale((10 + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPrecision / 20))),
											ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
									.getBlockPos().getY() + 1),
							(entity.level()
									.clip(new ClipContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f)
													.add(entity.getViewVector(1f).scale((10 + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPrecision / 20))),
											ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
									.getBlockPos().getZ()));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(
								(entity.level()
										.clip(new ClipContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f)
														.add(entity.getViewVector(1f).scale((10 + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPrecision / 20))),
												ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
										.getBlockPos().getX()),
								(entity.level()
										.clip(new ClipContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f)
														.add(entity.getViewVector(1f).scale((10 + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPrecision / 20))),
												ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
										.getBlockPos().getY() + 1),
								(entity.level()
										.clip(new ClipContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f)
														.add(entity.getViewVector(1f).scale((10 + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPrecision / 20))),
												ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
										.getBlockPos().getZ()),
								_ent.getYRot(), _ent.getXRot());
				}
			});
			if (!((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Goku")) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:theworld_skiptime")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:theworld_skiptime")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
			} else {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:goku_teleports")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:goku_teleports")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Time Skip is on Cooldown!"), true);
		}
	}
}
