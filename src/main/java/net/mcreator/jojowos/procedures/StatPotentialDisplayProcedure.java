package net.mcreator.jojowos.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;

public class StatPotentialDisplayProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPotential == (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new JojowosModVariables.PlayerVariables())).MaxPotential) {
			return "Potential : MAX/" + ("" + ("" + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).MaxPotential).replace(".0", ""));
		}
		return "Potential : " + ("" + ("" + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPotential).replace(".0", "")) + "/"
				+ ("" + ("" + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).MaxPotential).replace(".0", ""));
	}
}
