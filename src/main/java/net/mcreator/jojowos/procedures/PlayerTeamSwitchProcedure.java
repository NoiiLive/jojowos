package net.mcreator.jojowos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.scores.PlayerTeam;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.JojowosMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerTeamSwitchProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandObtained == true) {
			if ((entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(MobEffects.INVISIBILITY)) == false) {
				if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandVisibleTeam == false) {
					{
						boolean _setval = false;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandInvisibleTeam = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = false;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.NonStandUserTeam = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						Entity _entityTeam = entity;
						PlayerTeam _pt = _entityTeam.level().getScoreboard().getPlayerTeam("stand_user_visible");
						if (_pt != null) {
							if (_entityTeam instanceof Player _player)
								_entityTeam.level().getScoreboard().addPlayerToTeam(_player.getGameProfile().getName(), _pt);
							else
								_entityTeam.level().getScoreboard().addPlayerToTeam(_entityTeam.getStringUUID(), _pt);
						}
					}
					JojowosMod.LOGGER.info(entity.getDisplayName().getString() + " Added to team: " + "stand_user_visible");
					{
						boolean _setval = true;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandVisibleTeam = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(MobEffects.INVISIBILITY)) == true) {
				if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandInvisibleTeam == false) {
					{
						boolean _setval = false;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandVisibleTeam = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = false;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.NonStandUserTeam = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						Entity _entityTeam = entity;
						PlayerTeam _pt = _entityTeam.level().getScoreboard().getPlayerTeam("stand_user_invisible");
						if (_pt != null) {
							if (_entityTeam instanceof Player _player)
								_entityTeam.level().getScoreboard().addPlayerToTeam(_player.getGameProfile().getName(), _pt);
							else
								_entityTeam.level().getScoreboard().addPlayerToTeam(_entityTeam.getStringUUID(), _pt);
						}
					}
					JojowosMod.LOGGER.info(entity.getDisplayName().getString() + " Added to team: " + "stand_user_invisible");
					{
						boolean _setval = true;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandInvisibleTeam = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		} else if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandObtained == false) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NonStandUserTeam == false) {
				{
					boolean _setval = false;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.StandVisibleTeam = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					boolean _setval = false;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.StandInvisibleTeam = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					Entity _entityTeam = entity;
					PlayerTeam _pt = _entityTeam.level().getScoreboard().getPlayerTeam("non_stand_user");
					if (_pt != null) {
						if (_entityTeam instanceof Player _player)
							_entityTeam.level().getScoreboard().addPlayerToTeam(_player.getGameProfile().getName(), _pt);
						else
							_entityTeam.level().getScoreboard().addPlayerToTeam(_entityTeam.getStringUUID(), _pt);
					}
				}
				JojowosMod.LOGGER.info(entity.getDisplayName().getString() + " Removed from teams ");
				{
					boolean _setval = true;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NonStandUserTeam = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
