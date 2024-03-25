package net.mcreator.jojowos.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.JojowosMod;

public class WheelSwitcherProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		boolean GATE = false;
		GATE = false;
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilityWheelGUI == 1 && GATE == false) {
			entity.getPersistentData().putDouble("AbilityWheelGUI", 2);
			{
				double _setval = 2;
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.AbilityWheelGUI = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			entity.getPersistentData().putBoolean("SwitchWheels", true);
			JojowosMod.LOGGER.info("Switch to Hamon Era");
			JojowosMod.LOGGER.info("---");
			GATE = true;
		}
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilityWheelGUI == 2 && GATE == false) {
			entity.getPersistentData().putDouble("AbilityWheelGUI", 1);
			{
				double _setval = 1;
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.AbilityWheelGUI = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			entity.getPersistentData().putBoolean("SwitchWheels", false);
			JojowosMod.LOGGER.info("Switch to World of Stands");
			JojowosMod.LOGGER.info("---");
			GATE = true;
		}
	}
}
