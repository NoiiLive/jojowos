package net.mcreator.jojowos.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;

import net.mcreator.jojowos.network.JojowosModVariables;

public class EntityTimeFrozenTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		boolean gate = false;
		entity.setNoGravity(true);
		entity.makeStuckInBlock(Blocks.AIR.defaultBlockState(), new Vec3(0.25, 0.05, 0.25));
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 10, 9, false, false));
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 20, 9, false, false));
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 10, 9, false, false));
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 10, 9, false, false));
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 10, 9, false, false));
		{
			Entity _ent = entity;
			_ent.teleportTo((entity.getX()), (entity.getY()), (entity.getZ()));
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport((entity.getX()), (entity.getY()), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
		}
		if (entity instanceof Player) {
			if (entity.getPersistentData().getDouble("Ability1Cooldown") == 0) {
				entity.getPersistentData().putDouble("Ability1Cooldown", 5);
			}
			if (entity.getPersistentData().getDouble("Ability2Cooldown") == 0) {
				entity.getPersistentData().putDouble("Ability2Cooldown", 5);
			}
			if (entity.getPersistentData().getDouble("Ability3Cooldown") == 0) {
				entity.getPersistentData().putDouble("Ability3Cooldown", 5);
			}
			if (entity.getPersistentData().getDouble("Ability4Cooldown") == 0) {
				entity.getPersistentData().putDouble("Ability4Cooldown", 5);
			}
			if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("TheWorld")) {
				if (entity.getPersistentData().getDouble("Ability5Cooldown") == 0) {
					entity.getPersistentData().putDouble("Ability5Cooldown", 0);
				}
			} else {
				if (entity.getPersistentData().getDouble("Ability5Cooldown") == 0) {
					entity.getPersistentData().putDouble("Ability5Cooldown", 5);
				}
			}
			if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("StarPlatinum")) {
				if (entity.getPersistentData().getDouble("Ability6Cooldown") == 0) {
					entity.getPersistentData().putDouble("Ability6Cooldown", 0);
				}
			} else {
				if (entity.getPersistentData().getDouble("Ability6Cooldown") == 0) {
					entity.getPersistentData().putDouble("Ability6Cooldown", 5);
				}
			}
		}
		if (entity instanceof Player) {
			if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("StarPlatinum")) {
				if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StarTimeSkipUnlocked == false) {
					{
						boolean _setval = true;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StarTimeSkipUnlocked = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Your stand has evolved!"), true);
				}
				if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StarTimeStopUnlocked == false) {
					{
						boolean _setval = true;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StarTimeStopUnlocked = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Your stand has evolved!"), true);
					{
						double _setval = 40 + Math.round(((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPrecision - 1) * 0.606);
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.TimeStopLength = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
			if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("TheWorld")) {
				if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).WorldTimeSkipUnlocked == false) {
					{
						boolean _setval = true;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.WorldTimeSkipUnlocked = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Your stand has evolved!"), true);
				}
				if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).WorldTimeStopUnlocked == false) {
					{
						boolean _setval = true;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.WorldTimeStopUnlocked = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Your stand has evolved!"), true);
					{
						double _setval = 100 + Math.round(((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPrecision - 1) * 1.265);
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.TimeStopLength = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		}
		{
			Entity _ent = entity;
			_ent.setYRot((float) entity.getPersistentData().getDouble("tsYaw"));
			_ent.setXRot((float) entity.getPersistentData().getDouble("tsPitch"));
			_ent.setYBodyRot(_ent.getYRot());
			_ent.setYHeadRot(_ent.getYRot());
			_ent.yRotO = _ent.getYRot();
			_ent.xRotO = _ent.getXRot();
			if (_ent instanceof LivingEntity _entity) {
				_entity.yBodyRotO = _entity.getYRot();
				_entity.yHeadRotO = _entity.getYRot();
			}
		}
	}
}
