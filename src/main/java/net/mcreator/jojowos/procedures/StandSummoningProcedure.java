package net.mcreator.jojowos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.init.JojowosModMobEffects;

public class StandSummoningProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = false;
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.GATE = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (entity.getPersistentData().getBoolean("Piloting") == false) {
			if (entity.getPersistentData().getBoolean("Controlling") == false) {
				if (entity.getPersistentData().getBoolean("Controlled") == false) {
					if ((entity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(JojowosModMobEffects.NO_ARMOR_CHARIOT.get())) == false) {
						if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandObtained == true
								&& (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSummoned == false) {
							if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).GATE == false) {
								{
									boolean _setval = true;
									entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.StandSummoned = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
								{
									boolean _setval = true;
									entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.GATE = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
								if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandType).equals("Close")) {
									StandCloseSummonProcedure.execute(world, x, y, z, entity);
								}
								if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandType).equals("Long")) {
									StandLongSummonProcedure.execute(world, x, y, z, entity);
								}
								if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandType).equals("Special")) {
									StandSpecialSummonProcedure.execute(world, x, y, z, entity);
								}
							} else {
								if (entity instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal("You have yet to awaken this ability..."), true);
							}
						}
						if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandObtained == true
								&& (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSummoned == true
								&& (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).GATE == false) {
							{
								boolean _setval = true;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.GATE = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								boolean _setval = false;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandSummoned = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							StandDespawningProcedure.execute(world, x, y, z, entity);
						}
					}
				}
			}
		}
	}
}
