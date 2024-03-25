package net.mcreator.jojowos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.init.JojowosModMobEffects;
import net.mcreator.jojowos.JojowosMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerNBTConversionProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).HamonUser == false && entity.getPersistentData().getBoolean("Hamon") == true) {
			{
				boolean _setval = true;
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.HamonUser = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojowosMod.LOGGER.info("Player is a Hamon User");
		}
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).HamonUser == true && entity.getPersistentData().getBoolean("Hamon") == false) {
			{
				boolean _setval = false;
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.HamonUser = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojowosMod.LOGGER.info("Player is not a Hamon User");
		}
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Vampire == false && entity.getPersistentData().getBoolean("Vampirism") == true) {
			{
				boolean _setval = true;
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Vampire = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojowosMod.LOGGER.info("Player is a Vampire");
		}
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Vampire == true && entity.getPersistentData().getBoolean("Vampirism") == false) {
			{
				boolean _setval = false;
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Vampire = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojowosMod.LOGGER.info("Player is not a Vampire");
		}
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandObtained == true && entity.getPersistentData().getBoolean("StandUser") == false) {
			entity.getPersistentData().putBoolean("StandUser", true);
			JojowosMod.LOGGER.info("Player is a Stand User");
		}
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandObtained == false && entity.getPersistentData().getBoolean("StandUser") == true) {
			entity.getPersistentData().putBoolean("StandUser", false);
			JojowosMod.LOGGER.info("Player is not a Stand User");
		}
		if (JojowosModVariables.MapVariables.get(world).HamonEra == false && entity.getPersistentData().getBoolean("HamonEra") == true) {
			JojowosModVariables.MapVariables.get(world).HamonEra = true;
			JojowosModVariables.MapVariables.get(world).syncData(world);
			JojowosMod.LOGGER.info("Player has JoJo: Hamon Era");
		}
		if (JojowosModVariables.MapVariables.get(world).HamonEra == true && entity.getPersistentData().getBoolean("HamonEra") == false) {
			JojowosModVariables.MapVariables.get(world).HamonEra = false;
			JojowosModVariables.MapVariables.get(world).syncData(world);
			JojowosMod.LOGGER.info("Player does not have JoJo: Hamon Era");
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSummoned == true
				|| (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).ItemStandSummoned == true) && entity.getPersistentData().getBoolean("StandSummoned") == false) {
			entity.getPersistentData().putBoolean("StandSummoned", true);
			entity.getPersistentData().putBoolean("SwitchWheels", false);
			{
				boolean _setval = false;
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SwitchWheels = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			entity.getPersistentData().putDouble("AbilityWheelGUI", 1);
			{
				double _setval = 1;
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.AbilityWheelGUI = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojowosMod.LOGGER.info("Player's Stand is Summoned");
		}
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSummoned == false
				&& (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).ItemStandSummoned == false && entity.getPersistentData().getBoolean("StandSummoned") == true) {
			entity.getPersistentData().putBoolean("StandSummoned", false);
			JojowosMod.LOGGER.info("Player's Stand is not Summoned");
		}
		if ((entity instanceof LivingEntity _livEnt16 && _livEnt16.hasEffect(JojowosModMobEffects.TIME_STOPPED.get())) == true && entity.getPersistentData().getBoolean("TimeStopped") == false) {
			entity.getPersistentData().putBoolean("TimeStopped", true);
			JojowosMod.LOGGER.info("Player's is Time Stopped");
		}
		if ((entity instanceof LivingEntity _livEnt19 && _livEnt19.hasEffect(JojowosModMobEffects.TIME_STOPPED.get())) == false && entity.getPersistentData().getBoolean("TimeStopped") == true) {
			entity.getPersistentData().putBoolean("TimeStopped", false);
			JojowosMod.LOGGER.info("Player's is not Time Stopped");
		}
		if (entity.getPersistentData().getBoolean("WorldOfStands") == false) {
			entity.getPersistentData().putBoolean("WorldOfStands", true);
			JojowosMod.LOGGER.info("Player has JoJo: World Of Stands");
		}
		if (JojowosModVariables.MapVariables.get(world).HamonEra == false
				&& ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilityWheelGUI != 1 || entity.getPersistentData().getDouble("AbilityWheelGUI") != 1)) {
			entity.getPersistentData().putBoolean("SwitchWheels", false);
			{
				boolean _setval = false;
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SwitchWheels = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			entity.getPersistentData().putDouble("AbilityWheelGUI", 1);
			{
				double _setval = 1;
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.AbilityWheelGUI = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojowosMod.LOGGER.info("Hamon Era Removed");
		}
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilityWheelGUI == 1 && entity.getPersistentData().getDouble("AbilityWheelGUI") != 1) {
			{
				double _setval = entity.getPersistentData().getDouble("AbilityWheelGUI");
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.AbilityWheelGUI = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojowosMod.LOGGER.info("Player Ability Wheel #" + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilityWheelGUI);
		}
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilityWheelGUI == 2 && entity.getPersistentData().getDouble("AbilityWheelGUI") != 2) {
			{
				double _setval = entity.getPersistentData().getDouble("AbilityWheelGUI");
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.AbilityWheelGUI = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojowosMod.LOGGER.info("Player Ability Wheel #" + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilityWheelGUI);
		}
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilityWheelGUI == 0 || entity.getPersistentData().getDouble("AbilityWheelGUI") == 0) {
			entity.getPersistentData().putDouble("AbilityWheelGUI", 1);
			{
				double _setval = 1;
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.AbilityWheelGUI = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojowosMod.LOGGER.info("Player Ability Wheel #" + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilityWheelGUI);
		}
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SwitchWheels == false && entity.getPersistentData().getBoolean("SwitchWheels") == true) {
			{
				boolean _setval = true;
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SwitchWheels = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			entity.getPersistentData().putBoolean("SwitchWheels", true);
			entity.getPersistentData().putDouble("AbilityWheelGUI", 2);
			{
				double _setval = 2;
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.AbilityWheelGUI = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojowosMod.LOGGER.info("Player is Switching Wheels");
		}
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SwitchWheels == true && entity.getPersistentData().getBoolean("SwitchWheels") == false) {
			{
				boolean _setval = false;
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SwitchWheels = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			entity.getPersistentData().putBoolean("SwitchWheels", false);
			entity.getPersistentData().putDouble("AbilityWheelGUI", 1);
			{
				double _setval = 1;
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.AbilityWheelGUI = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			PickGUIStandProcedure.execute(world, x, y, z, entity);
			JojowosMod.LOGGER.info("Player is not Switching Wheels");
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).HEUseAbilityType).equals(entity.getPersistentData().getString("HEUseAbilityType")) == false) {
			{
				String _setval = entity.getPersistentData().getString("HEUseAbilityType");
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.HEUseAbilityType = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojowosMod.LOGGER.info("Hamon Era Use Ability Changed To: " + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).HEUseAbilityType);
		}
		if ((entity.getPersistentData().getString("WOSUseAbilityType")).equals((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).UseAbilityType) == false) {
			entity.getPersistentData().putString("WOSUseAbilityType", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).UseAbilityType));
			JojowosMod.LOGGER.info("World Of Stands Use Ability Changed To: " + entity.getPersistentData().getString("WOSUseAbilityType"));
		}
	}
}
