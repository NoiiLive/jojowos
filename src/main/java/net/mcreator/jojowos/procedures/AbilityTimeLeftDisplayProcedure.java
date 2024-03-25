package net.mcreator.jojowos.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;

public class AbilityTimeLeftDisplayProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SkillNumber == 1) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilityCooldown1 > 0) {
				return "[" + Math.round((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilityCooldown1 / 20) + "]";
			}
		} else if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SkillNumber == 2) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilityCooldown2 > 0) {
				return "[" + Math.round((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilityCooldown2 / 20) + "]";
			}
		} else if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SkillNumber == 3) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilityCooldown3 > 0) {
				return "[" + Math.round((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilityCooldown3 / 20) + "]";
			}
		} else if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SkillNumber == 4) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilityCooldown4 > 0) {
				return "[" + Math.round((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilityCooldown4 / 20) + "]";
			}
		} else if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SkillNumber == 5) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilityCooldown5 > 0) {
				return "[" + Math.round((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilityCooldown5 / 20) + "]";
			}
		} else if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SkillNumber == 6) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilityCooldown6 > 0) {
				return "[" + Math.round((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilityCooldown6 / 20) + "]";
			}
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("HermitPurple")) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SkillNumber == 1) {
				if (entity.getPersistentData().getDouble("AttackCooldown") > 0) {
					return "[" + Math.round(entity.getPersistentData().getDouble("AttackCooldown") / 20) + "]";
				}
			}
		}
		return "";
	}
}
