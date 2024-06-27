package net.mcreator.jojowos.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.configuration.SDCConfigFilesConfiguration;

public class ApplyStatsMagiciansRedProcedure {
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
			String _setval = "Furnace";
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SpecialType = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = SDCConfigFilesConfiguration.MAGICIANSREDABILITY1.get() + "|";
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.MovesUnlocked = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = SDCConfigFilesConfiguration.MAGICIANSREDABILITY1.get();
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SetAbility1 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = SDCConfigFilesConfiguration.MAGICIANSREDABILITY2.get();
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SetAbility2 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = SDCConfigFilesConfiguration.MAGICIANSREDABILITY3.get();
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SetAbility3 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = SDCConfigFilesConfiguration.MAGICIANSREDABILITY4.get();
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SetAbility4 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = SDCConfigFilesConfiguration.MAGICIANSREDABILITY5.get();
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SetAbility5 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = SDCConfigFilesConfiguration.MAGICIANSREDABILITY6.get();
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SetAbility6 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = SDCConfigFilesConfiguration.MAGICIANSREDABILITY7.get();
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SetAbility7 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = SDCConfigFilesConfiguration.MAGICIANSREDABILITY8.get();
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SetAbility8 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = SDCConfigFilesConfiguration.MAGICIANSREDABILITY9.get();
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SetAbility9 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = (double) SDCConfigFilesConfiguration.MAGICIANSREDDURABILITY.get();
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.MaxDurability = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = (double) SDCConfigFilesConfiguration.MAGICIANSREDPRECISION.get();
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.MaxPrecision = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = (double) SDCConfigFilesConfiguration.MAGICIANSREDPOTENTIAL.get();
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.MaxPotential = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = (double) SDCConfigFilesConfiguration.MAGICIANSREDSTRENGTH.get();
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.MaxPower = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 80;
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
