package net.mcreator.jojowos.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.configuration.SDCConfigFilesConfiguration;

public class ApplyStatsHierophantGreenProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double random_number = 0;
		{
			String _setval = "Long";
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.StandType = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "Pilot";
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SpecialType = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = SDCConfigFilesConfiguration.HIEROPHANTGREENABILITY1.get() + "|";
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.MovesUnlocked = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = SDCConfigFilesConfiguration.HIEROPHANTGREENABILITY1.get();
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SetAbility1 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = SDCConfigFilesConfiguration.HIEROPHANTGREENABILITY2.get();
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SetAbility2 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = SDCConfigFilesConfiguration.HIEROPHANTGREENABILITY3.get();
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SetAbility3 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = SDCConfigFilesConfiguration.HIEROPHANTGREENABILITY4.get();
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SetAbility4 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = SDCConfigFilesConfiguration.HIEROPHANTGREENABILITY5.get();
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SetAbility5 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = SDCConfigFilesConfiguration.HIEROPHANTGREENABILITY6.get();
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SetAbility6 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = SDCConfigFilesConfiguration.HIEROPHANTGREENABILITY7.get();
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SetAbility7 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = SDCConfigFilesConfiguration.HIEROPHANTGREENABILITY8.get();
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SetAbility8 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = SDCConfigFilesConfiguration.HIEROPHANTGREENABILITY9.get();
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SetAbility9 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = (double) SDCConfigFilesConfiguration.HIEROPHANTGREENSTRENGTH.get();
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.MaxPower = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = (double) SDCConfigFilesConfiguration.HIEROPHANTGREENDURABILITY.get();
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.MaxDurability = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = (double) SDCConfigFilesConfiguration.HIEROPHANTGREENPRECISION.get();
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.MaxPrecision = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = (double) SDCConfigFilesConfiguration.HIEROPHANTGREENPOTENTIAL.get();
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.MaxPotential = _setval;
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
