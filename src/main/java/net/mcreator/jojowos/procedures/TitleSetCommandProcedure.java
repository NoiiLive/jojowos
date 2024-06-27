package net.mcreator.jojowos.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.arguments.MessageArgument;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.jojowos.network.JojowosModVariables;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;

public class TitleSetCommandProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).UnlockedTitles).contains(" " + (new Object() {
			public String getMessage() {
				try {
					return MessageArgument.getMessage(arguments, "title").getString();
				} catch (CommandSyntaxException ignored) {
					return "";
				}
			}
		}).getMessage() + " ")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A7f\u00A7lTitle Set: \u00A7f" + (new Object() {
					public String getMessage() {
						try {
							return MessageArgument.getMessage(arguments, "title").getString();
						} catch (CommandSyntaxException ignored) {
							return "";
						}
					}
				}).getMessage())), false);
			{
				String _setval = (new Object() {
					public String getMessage() {
						try {
							return MessageArgument.getMessage(arguments, "title").getString();
						} catch (CommandSyntaxException ignored) {
							return "";
						}
					}
				}).getMessage();
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerTitle = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((((new Object() {
			public String getMessage() {
				try {
					return MessageArgument.getMessage(arguments, "title").getString();
				} catch (CommandSyntaxException ignored) {
					return "";
				}
			}
		}).getMessage()).toLowerCase()).equals("none")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Title Removed!"), false);
			{
				String _setval = "";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerTitle = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Title is Incorrect! Use /jojowos title list"), false);
		}
	}
}
