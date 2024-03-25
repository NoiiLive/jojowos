package net.mcreator.jojowos.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;

public class BladeCycloneAbilityWheelProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 4;
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SkillNumber = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "Blade Cyclone";
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SelectedSkill = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (entity instanceof Player _player)
			_player.closeContainer();
	}
}
