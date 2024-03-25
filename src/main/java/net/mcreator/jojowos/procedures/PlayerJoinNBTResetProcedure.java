package net.mcreator.jojowos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.configuration.ConfigFilesConfiguration;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerJoinNBTResetProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("Hamon", false);
		entity.getPersistentData().putBoolean("Vampirism", false);
		entity.getPersistentData().putBoolean("HamonEra", false);
		entity.getPersistentData().putString("HEUseAbilityType", "");
		if (ConfigFilesConfiguration.SINGLEPLAYERSTAND.get() == false) {
			JojowosModVariables.MapVariables.get(world).StarPlatinumObtained = false;
			JojowosModVariables.MapVariables.get(world).syncData(world);
			JojowosModVariables.MapVariables.get(world).MagiciansRedObtained = false;
			JojowosModVariables.MapVariables.get(world).syncData(world);
			JojowosModVariables.MapVariables.get(world).SilverChariotObtained = false;
			JojowosModVariables.MapVariables.get(world).syncData(world);
			JojowosModVariables.MapVariables.get(world).HierophantGreenObtained = false;
			JojowosModVariables.MapVariables.get(world).syncData(world);
			JojowosModVariables.MapVariables.get(world).HermitPurpleObtained = false;
			JojowosModVariables.MapVariables.get(world).syncData(world);
			JojowosModVariables.MapVariables.get(world).TheFoolObtained = false;
			JojowosModVariables.MapVariables.get(world).syncData(world);
			JojowosModVariables.MapVariables.get(world).TheWorldObtained = false;
			JojowosModVariables.MapVariables.get(world).syncData(world);
			JojowosModVariables.MapVariables.get(world).StarPlatinumUser = "None";
			JojowosModVariables.MapVariables.get(world).syncData(world);
			JojowosModVariables.MapVariables.get(world).MagiciansRedUser = "None";
			JojowosModVariables.MapVariables.get(world).syncData(world);
			JojowosModVariables.MapVariables.get(world).HierophantGreenUser = "None";
			JojowosModVariables.MapVariables.get(world).syncData(world);
			JojowosModVariables.MapVariables.get(world).SilverChariotUser = "None";
			JojowosModVariables.MapVariables.get(world).syncData(world);
			JojowosModVariables.MapVariables.get(world).HermitPurpleUser = "None";
			JojowosModVariables.MapVariables.get(world).syncData(world);
			JojowosModVariables.MapVariables.get(world).TheFoolUser = "None";
			JojowosModVariables.MapVariables.get(world).syncData(world);
			JojowosModVariables.MapVariables.get(world).TheWorldUser = "None";
			JojowosModVariables.MapVariables.get(world).syncData(world);
		}
		if (ConfigFilesConfiguration.SINGLEPLAYERSTAND.get() == true) {
			if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("StarPlatinum")) {
				JojowosModVariables.MapVariables.get(world).StarPlatinumObtained = true;
				JojowosModVariables.MapVariables.get(world).syncData(world);
				JojowosModVariables.MapVariables.get(world).StarPlatinumUser = entity.getDisplayName().getString();
				JojowosModVariables.MapVariables.get(world).syncData(world);
			}
			if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("MagiciansRed")) {
				JojowosModVariables.MapVariables.get(world).MagiciansRedObtained = true;
				JojowosModVariables.MapVariables.get(world).syncData(world);
				JojowosModVariables.MapVariables.get(world).MagiciansRedUser = entity.getDisplayName().getString();
				JojowosModVariables.MapVariables.get(world).syncData(world);
			}
			if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("SilverChariot")) {
				JojowosModVariables.MapVariables.get(world).SilverChariotObtained = true;
				JojowosModVariables.MapVariables.get(world).syncData(world);
				JojowosModVariables.MapVariables.get(world).SilverChariotUser = entity.getDisplayName().getString();
				JojowosModVariables.MapVariables.get(world).syncData(world);
			}
			if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("HierophantGreen")) {
				JojowosModVariables.MapVariables.get(world).HierophantGreenObtained = true;
				JojowosModVariables.MapVariables.get(world).syncData(world);
				JojowosModVariables.MapVariables.get(world).HierophantGreenUser = entity.getDisplayName().getString();
				JojowosModVariables.MapVariables.get(world).syncData(world);
			}
			if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("HermitPurple")) {
				JojowosModVariables.MapVariables.get(world).HermitPurpleObtained = true;
				JojowosModVariables.MapVariables.get(world).syncData(world);
				JojowosModVariables.MapVariables.get(world).HermitPurpleUser = entity.getDisplayName().getString();
				JojowosModVariables.MapVariables.get(world).syncData(world);
			}
			if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("TheFool")) {
				JojowosModVariables.MapVariables.get(world).TheFoolObtained = true;
				JojowosModVariables.MapVariables.get(world).syncData(world);
				JojowosModVariables.MapVariables.get(world).TheFoolUser = entity.getDisplayName().getString();
				JojowosModVariables.MapVariables.get(world).syncData(world);
			}
			if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("TheWorld")) {
				JojowosModVariables.MapVariables.get(world).TheWorldObtained = true;
				JojowosModVariables.MapVariables.get(world).syncData(world);
				JojowosModVariables.MapVariables.get(world).TheWorldUser = entity.getDisplayName().getString();
				JojowosModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}
