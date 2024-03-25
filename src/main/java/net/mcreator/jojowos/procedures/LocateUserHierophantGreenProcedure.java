package net.mcreator.jojowos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.configuration.ConfigFilesConfiguration;

public class LocateUserHierophantGreenProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (ConfigFilesConfiguration.SINGLEPLAYERSTAND.get() == true) {
			if (JojowosModVariables.MapVariables.get(world).HierophantGreenObtained == true) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal((JojowosModVariables.MapVariables.get(world).HierophantGreenUser + " Is the Current User of Hierophant Green")), false);
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Nobody has Hierophant Green!"), false);
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Config \"Single Player Stand\" Is Not Enabled!"), false);
		}
	}
}
