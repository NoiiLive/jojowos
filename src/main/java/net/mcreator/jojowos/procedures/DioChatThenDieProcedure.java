package net.mcreator.jojowos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.JojowosMod;

public class DioChatThenDieProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 == 0) {
			{
				String _setval = "T";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.NPCTextLine1 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojowosMod.queueServerWork(2, () -> {
				{
					double _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 + 1;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			});
		}
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 == 1) {
			{
				String _setval = "Th";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.NPCTextLine1 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojowosMod.queueServerWork(2, () -> {
				{
					double _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 + 1;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			});
		}
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 == 2) {
			{
				String _setval = "The";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.NPCTextLine1 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojowosMod.queueServerWork(2, () -> {
				{
					double _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 + 1;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			});
		}
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 == 3) {
			{
				String _setval = "Then";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.NPCTextLine1 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojowosMod.queueServerWork(2, () -> {
				{
					double _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 + 1;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			});
		}
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 == 4) {
			{
				String _setval = "Then ";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.NPCTextLine1 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojowosMod.queueServerWork(2, () -> {
				{
					double _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 + 1;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			});
		}
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 == 5) {
			{
				String _setval = "Then d";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.NPCTextLine1 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojowosMod.queueServerWork(2, () -> {
				{
					double _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 + 1;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			});
		}
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 == 6) {
			{
				String _setval = "Then di";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.NPCTextLine1 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojowosMod.queueServerWork(2, () -> {
				{
					double _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 + 1;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			});
		}
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 == 7) {
			{
				String _setval = "Then die";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.NPCTextLine1 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojowosMod.queueServerWork(2, () -> {
				{
					double _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 + 1;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			});
		}
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 == 8) {
			{
				String _setval = "Then die.";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.NPCTextLine1 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojowosMod.queueServerWork(2, () -> {
				{
					double _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 + 1;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			});
		}
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 >= 8
				&& (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 < 20) {
			{
				double _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 + 1;
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.NPCTextStep1 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 >= 20) {
			{
				String _setval = "WhatDoYouNeed";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.DioChatStage = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
