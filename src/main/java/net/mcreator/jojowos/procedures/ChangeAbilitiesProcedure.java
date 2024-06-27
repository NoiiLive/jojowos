package net.mcreator.jojowos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.JojowosMod;

public class ChangeAbilitiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean gate = false;
		if (!((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SpecialType).equals("Item")) {
			if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).UseAbilityType).equals("Wheel")) {
				OpenAbilityWheelProcedure.execute(world, x, y, z, entity);
			}
			if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).UseAbilityType).equals("Switcher")) {
				gate = false;
				if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SwitcherSlot == 1 && gate == false) {
					AbilitySwitcher1Procedure.execute(entity);
					gate = true;
				}
				if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SwitcherSlot == 2 && gate == false) {
					AbilitySwitcher2Procedure.execute(entity);
					gate = true;
				}
				if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SwitcherSlot == 3 && gate == false) {
					AbilitySwitcher3Procedure.execute(entity);
					gate = true;
				}
				if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SwitcherSlot == 4 && gate == false) {
					AbilitySwitcher4Procedure.execute(entity);
					gate = true;
				}
				if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SwitcherSlot == 5 && gate == false) {
					AbilitySwitcher5Procedure.execute(entity);
					gate = true;
				}
				if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SwitcherSlot == 6 && gate == false) {
					AbilitySwitcher6Procedure.execute(entity);
					gate = true;
				}
				if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SwitcherSlot == 7 && gate == false) {
					AbilitySwitcher7Procedure.execute(entity);
					gate = true;
				}
				if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SwitcherSlot == 8 && gate == false) {
					AbilitySwitcher8Procedure.execute(entity);
					gate = true;
				}
				if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SwitcherSlot == 9 && gate == false) {
					AbilitySwitcher9Procedure.execute(entity);
					gate = true;
				}
				JojowosMod.LOGGER.debug((new java.text.DecimalFormat("##").format((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SwitcherSlot)));
			}
		}
	}
}
