package net.mcreator.jojowos.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.jojowos.network.JojowosModVariables;

public class DiscardQuestButton3Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SideQuestGiver3).equals("Jotaro")) {
			{
				String _setval = "WhatDoYouNeed";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.JotaroChatStage = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "None";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SideQuestGiver3 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SideQuestGiver3).equals("Dio")) {
			{
				String _setval = "WhatDoYouNeed";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.DioChatStage = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "None";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SideQuestGiver3 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SideQuestGiver3).equals("Polnareff")) {
			{
				String _setval = "WhatDoYouNeed";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PolnareffChatStage = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "None";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SideQuestGiver3 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SideQuestGiver3).equals("Joseph")) {
			{
				String _setval = "WhatDoYouNeed";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.JosephChatStage = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "None";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SideQuestGiver3 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SideQuestGiver3).equals("Kakyoin")) {
			{
				String _setval = "WhatDoYouNeed";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KakyoinChatStage = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "None";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SideQuestGiver3 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SideQuestGiver3).equals("Avdol")) {
			{
				String _setval = "WhatDoYouNeed";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.AvdolChatStage = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "None";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SideQuestGiver3 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		{
			String _setval = "None";
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SideQuest3 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 0;
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SideQuestObjective3 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 0;
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SideQuestTotalObjective3 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal("\u00A7cSide Quest Discarded"), true);
	}
}
