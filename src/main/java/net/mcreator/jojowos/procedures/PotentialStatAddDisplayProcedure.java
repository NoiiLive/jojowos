package net.mcreator.jojowos.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;

public class PotentialStatAddDisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPotential < (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new JojowosModVariables.PlayerVariables())).MaxPotential && (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SkillPoints > 0) {
			return true;
		}
		return false;
	}
}
