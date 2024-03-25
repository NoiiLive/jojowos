package net.mcreator.jojowos.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;

public class StarTimeSkipAbilityWheelProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 5;
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SkillNumber = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "Time Skip";
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SelectedSkill = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (entity instanceof Player _player)
			_player.closeContainer();
	}
}
