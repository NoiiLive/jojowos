package net.mcreator.jojowos.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.configuration.SDCConfigFilesConfiguration;

public class ApplyStatsHermitPurpleProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double random_number = 0;
		{
			String _setval = "Close";
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.StandType = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "Item";
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SpecialType = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "Grapple" + "|";
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.MovesUnlocked = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "Grapple";
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SetAbility1 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "Tangle";
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SetAbility2 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "Divination";
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SetAbility3 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = (double) SDCConfigFilesConfiguration.HERMITPURPLESTRENGTH.get();
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.MaxPower = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = (double) SDCConfigFilesConfiguration.HERMITPURPLEDURABILITY.get();
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.MaxDurability = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = (double) SDCConfigFilesConfiguration.HERMITPURPLEPRECISION.get();
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.MaxPrecision = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = (double) SDCConfigFilesConfiguration.HERMITPURPLEPOTENTIAL.get();
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.MaxPotential = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 60;
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.MaxSpeed = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 0;
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.TimeStopLength = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		entity.getPersistentData().putDouble("MoveUpdate", 0);
	}
}
