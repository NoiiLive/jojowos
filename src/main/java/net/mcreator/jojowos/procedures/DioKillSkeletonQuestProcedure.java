package net.mcreator.jojowos.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;

import net.mcreator.jojowos.network.JojowosModVariables;

public class DioKillSkeletonQuestProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SideQuest1).equals("None")) {
			{
				String _setval = "Kill Skeletons";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SideQuest1 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "Dio";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SideQuestGiver1 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SideQuestObjective1 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = Mth.nextInt(RandomSource.create(), 10, 15) + Math.round((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Level / 2.5);
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SideQuestTotalObjective1 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "QuestComplete";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.DioChatStage = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "Yes";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ChatButton1 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "No";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ChatButton2 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(
						Component.literal(("\u00A7aSide Quest Accepted - Kill "
								+ new java.text.DecimalFormat("##").format((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SideQuestTotalObjective1) + " Skeletons!")),
						true);
		} else {
			if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SideQuest2).equals("None")) {
				{
					String _setval = "Kill Skeletons";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SideQuest2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "Dio";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SideQuestGiver2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SideQuestObjective2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = Mth.nextInt(RandomSource.create(), 10, 15) + Math.round((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Level / 2.5);
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SideQuestTotalObjective2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "QuestComplete";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.DioChatStage = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "Yes";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ChatButton1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "No";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ChatButton2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7aSide Quest Accepted - Kill "
							+ new java.text.DecimalFormat("##").format((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SideQuestTotalObjective2) + " Skeletons!")), true);
			} else {
				if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SideQuest3).equals("None")) {
					{
						String _setval = "Kill Skeletons";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SideQuest3 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "Dio";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SideQuestGiver3 = _setval;
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
						double _setval = Mth.nextInt(RandomSource.create(), 10, 15) + Math.round((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Level / 2.5);
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SideQuestTotalObjective3 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "QuestComplete";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DioChatStage = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "Yes";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ChatButton1 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "No";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ChatButton2 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(("\u00A7aSide Quest Accepted - Kill "
								+ new java.text.DecimalFormat("##").format((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SideQuestTotalObjective3) + " Skeletons!")),
								true);
				} else {
					if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SideQuest4).equals("None")) {
						{
							String _setval = "Kill Skeletons";
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SideQuest4 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = "Dio";
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SideQuestGiver4 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = 0;
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SideQuestTotalObjective4 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = Mth.nextInt(RandomSource.create(), 10, 15) + Math.round((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Level / 2.5);
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SideQuestTotalObjective4 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = "QuestComplete";
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.DioChatStage = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = "Yes";
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.ChatButton1 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = "No";
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.ChatButton2 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal(("\u00A7aSide Quest Accepted - Kill "
									+ new java.text.DecimalFormat("##").format((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SideQuestTotalObjective4)
									+ " Skeletons!")), true);
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("\u00A7cCannot Accept Any More Side Quests."), true);
					}
				}
			}
		}
	}
}
