package net.mcreator.jojowos.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.jojowos.network.JojowosModVariables;

public class ToggleShiftAbilitiesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		boolean gate = false;
		gate = false;
		if (entity.getPersistentData().getDouble("ToggleShift") == 0) {
			if (gate == false) {
				entity.getPersistentData().putDouble("ToggleShift", 5);
				gate = true;
			}
		}
		if (entity.getPersistentData().getDouble("ToggleShift") > 0) {
			if (gate == false) {
				if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).ToggleShiftMove == true) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("- Shift Move Disabled -"), true);
					{
						boolean _setval = false;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ToggleShiftMove = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					entity.getPersistentData().putDouble("ToggleShift", 0);
					gate = true;
				} else if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).ToggleShiftMove == false) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("- Shift Move Enabled -"), true);
					{
						boolean _setval = true;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ToggleShiftMove = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					entity.getPersistentData().putDouble("ToggleShift", 0);
					gate = true;
				}
			}
		}
	}
}
