package net.mcreator.jojowos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.JojowosMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class EntityKillEXPProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		execute(null, world, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof Player) {
			if ((sourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandObtained == true) {
				if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("jojowos:weak_mob")))) {
					{
						double _setval = (sourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).CurrentExp + 10
								+ Math.round((sourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPotential * 0.1);
						sourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.CurrentExp = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					if (sourceentity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(
								Component.literal(("+" + (10 + Math.round((sourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPotential * 0.1)) + " EXP")), true);
				}
				if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("jojowos:average_mob")))) {
					{
						double _setval = (sourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).CurrentExp + 25
								+ Math.round((sourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPotential * 0.25);
						sourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.CurrentExp = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					if (sourceentity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(
								Component.literal(("+" + (25 + Math.round((sourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPotential * 0.25)) + " EXP")), true);
				}
				if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("jojowos:strong_mob")))) {
					{
						double _setval = (sourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).CurrentExp + 100
								+ Math.round((sourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPotential * 1);
						sourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.CurrentExp = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					if (sourceentity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(
								Component.literal(("+" + (100 + Math.round((sourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPotential * 1)) + " EXP")), true);
				}
				if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("jojowos:boss_mob")))) {
					{
						double _setval = (sourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).CurrentExp + 500
								+ Math.round((sourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPotential * 5);
						sourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.CurrentExp = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					if (sourceentity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(
								Component.literal(("+" + (500 + Math.round((sourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPotential * 5)) + " EXP")), true);
				}
				if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("jojowos:weak_stand_user")))) {
					{
						double _setval = (sourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).CurrentExp + 100
								+ Math.round((sourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPotential * 1);
						sourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.CurrentExp = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					if (sourceentity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(
								Component.literal(("+" + (100 + Math.round((sourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPotential * 1)) + " EXP")), true);
				}
				if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("jojowos:average_stand_user")))) {
					{
						double _setval = (sourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).CurrentExp + 500
								+ Math.round((sourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPotential * 5);
						sourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.CurrentExp = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					if (sourceentity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(
								Component.literal(("+" + (500 + Math.round((sourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPotential * 5)) + " EXP")), true);
				}
				if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("jojowos:strong_stand_user")))) {
					{
						double _setval = (sourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).CurrentExp + 1000
								+ Math.round((sourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPotential * 10);
						sourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.CurrentExp = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					if (sourceentity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(
								Component.literal(("+" + (1000 + Math.round((sourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPotential * 10)) + " EXP")), true);
				}
				if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("jojowos:good_karma_low")))) {
					{
						double _setval = (sourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Karma - 10;
						sourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Karma = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					JojowosMod.queueServerWork(10, () -> {
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("\u00A7c-10 Karma"), true);
					});
				}
				if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("jojowos:good_karma_mid")))) {
					{
						double _setval = (sourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Karma - 25;
						sourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Karma = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					JojowosMod.queueServerWork(10, () -> {
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("\u00A7c-25 Karma"), true);
					});
				}
				if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("jojowos:good_karma_high")))) {
					{
						double _setval = (sourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Karma - 50;
						sourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Karma = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					JojowosMod.queueServerWork(10, () -> {
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("\u00A7c-50 Karma"), true);
					});
				}
				if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("jojowos:bad_karma_low")))) {
					{
						double _setval = (sourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Karma + 10;
						sourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Karma = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					JojowosMod.queueServerWork(10, () -> {
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("\u00A7a+10 Karma"), true);
					});
				}
				if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("jojowos:bad_karma_mid")))) {
					{
						double _setval = (sourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Karma + 25;
						sourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Karma = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					JojowosMod.queueServerWork(10, () -> {
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("\u00A7a+10 Karma"), true);
					});
				}
				if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("jojowos:bad_karma_high")))) {
					{
						double _setval = (sourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Karma + 50;
						sourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Karma = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					JojowosMod.queueServerWork(10, () -> {
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("\u00A7a+50 Karma"), true);
					});
				}
			}
		}
	}
}
