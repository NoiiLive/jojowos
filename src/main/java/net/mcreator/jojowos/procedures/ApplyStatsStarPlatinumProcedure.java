package net.mcreator.jojowos.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.configuration.SDCConfigFilesConfiguration;

public class ApplyStatsStarPlatinumProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			String _setval = "Close";
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.StandType = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "Power";
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SpecialType = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = SDCConfigFilesConfiguration.STARPLATINUMABILITY1.get() + "|";
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.MovesUnlocked = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = SDCConfigFilesConfiguration.STARPLATINUMABILITY1.get();
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SetAbility1 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = SDCConfigFilesConfiguration.STARPLATINUMABILITY2.get();
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SetAbility2 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = SDCConfigFilesConfiguration.STARPLATINUMABILITY3.get();
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SetAbility3 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = SDCConfigFilesConfiguration.STARPLATINUMABILITY4.get();
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SetAbility4 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = SDCConfigFilesConfiguration.STARPLATINUMABILITY5.get();
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SetAbility5 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = SDCConfigFilesConfiguration.STARPLATINUMABILITY6.get();
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SetAbility6 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = SDCConfigFilesConfiguration.STARPLATINUMABILITY7.get();
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SetAbility7 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = SDCConfigFilesConfiguration.STARPLATINUMABILITY8.get();
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SetAbility8 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = SDCConfigFilesConfiguration.STARPLATINUMABILITY9.get();
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SetAbility9 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = (double) SDCConfigFilesConfiguration.STARPLATINUMSTRENGTH.get();
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.MaxPower = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = (double) SDCConfigFilesConfiguration.STARPLATINUMDURABILITY.get();
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.MaxDurability = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = (double) SDCConfigFilesConfiguration.STARPLATINUMPRECISION.get();
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.MaxPrecision = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = (double) SDCConfigFilesConfiguration.STARPLATINUMPOTENTIAL.get();
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.MaxPotential = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 100;
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.MaxSpeed = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 20;
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.TimeStopLength = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		entity.getPersistentData().putDouble("MoveUpdate", 0);
	}
}
