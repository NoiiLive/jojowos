package net.mcreator.jojowos.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;

public class StatStrengthDisplayProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower == (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new JojowosModVariables.PlayerVariables())).MaxPower) {
			return "Power : MAX/" + ("" + ("" + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).MaxPower).replace(".0", ""));
		}
		return "Power : " + ("" + ("" + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower).replace(".0", "")) + "/"
				+ ("" + ("" + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).MaxPower).replace(".0", ""));
	}
}
