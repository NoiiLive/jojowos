package net.mcreator.jojowos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.JojowosMod;

public class DioChatQuestKillCreepersProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 == 0) {
			{
				String _setval = "H";
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
				String _setval = "Ho";
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
				String _setval = "Hoh";
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
				String _setval = "Hoho";
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
				String _setval = "Hoho.";
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
				String _setval = "Hoho.";
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
				String _setval = "Hoho...";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.NPCTextLine1 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep2 == 0
				&& (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 >= 6) {
			{
				String _setval = "K";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.NPCTextLine2 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "Dio";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.NPCIcon = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojowosMod.queueServerWork(2, () -> {
				{
					double _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep2 + 1;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			});
		}
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep2 == 1) {
			{
				String _setval = "Ki";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.NPCTextLine2 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojowosMod.queueServerWork(2, () -> {
				{
					double _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep2 + 1;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			});
		}
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep2 == 2) {
			{
				String _setval = "Kil";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.NPCTextLine2 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojowosMod.queueServerWork(2, () -> {
				{
					double _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep2 + 1;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			});
		}
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep2 == 3) {
			{
				String _setval = "Kill";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.NPCTextLine2 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojowosMod.queueServerWork(2, () -> {
				{
					double _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep2 + 1;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			});
		}
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep2 == 4) {
			{
				String _setval = "Kill ";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.NPCTextLine2 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojowosMod.queueServerWork(2, () -> {
				{
					double _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep2 + 1;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			});
		}
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep2 == 5) {
			{
				String _setval = "Kill S";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.NPCTextLine2 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojowosMod.queueServerWork(2, () -> {
				{
					double _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep2 + 1;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			});
		}
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep2 == 6) {
			{
				String _setval = "Kill So";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.NPCTextLine2 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojowosMod.queueServerWork(2, () -> {
				{
					double _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep2 + 1;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			});
		}
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep2 == 7) {
			{
				String _setval = "Kill Som";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.NPCTextLine2 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojowosMod.queueServerWork(2, () -> {
				{
					double _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep2 + 1;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			});
		}
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep2 == 8) {
			{
				String _setval = "Kill Some";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.NPCTextLine2 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojowosMod.queueServerWork(2, () -> {
				{
					double _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep2 + 1;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			});
		}
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep2 == 9) {
			{
				String _setval = "Kill Some ";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.NPCTextLine2 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojowosMod.queueServerWork(2, () -> {
				{
					double _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep2 + 1;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			});
		}
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep2 == 10) {
			{
				String _setval = "Kill Some C";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.NPCTextLine2 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojowosMod.queueServerWork(2, () -> {
				{
					double _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep2 + 1;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			});
		}
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep2 == 11) {
			{
				String _setval = "Kill Some Cr";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.NPCTextLine2 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojowosMod.queueServerWork(2, () -> {
				{
					double _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep2 + 1;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			});
		}
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep2 == 12) {
			{
				String _setval = "Kill Some Cre";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.NPCTextLine2 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojowosMod.queueServerWork(2, () -> {
				{
					double _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep2 + 1;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			});
		}
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep2 == 13) {
			{
				String _setval = "Kill Some Cree";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.NPCTextLine2 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojowosMod.queueServerWork(2, () -> {
				{
					double _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep2 + 1;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			});
		}
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep2 == 14) {
			{
				String _setval = "Kill Some Creep";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.NPCTextLine2 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojowosMod.queueServerWork(2, () -> {
				{
					double _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep2 + 1;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			});
		}
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep2 == 15) {
			{
				String _setval = "Kill Some Creepe";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.NPCTextLine2 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojowosMod.queueServerWork(2, () -> {
				{
					double _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep2 + 1;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			});
		}
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep2 == 16) {
			{
				String _setval = "Kill Some Creeper";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.NPCTextLine2 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			JojowosMod.queueServerWork(2, () -> {
				{
					double _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep2 + 1;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			});
		}
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep2 == 17) {
			{
				String _setval = "Kill Some Creepers";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.NPCTextLine2 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
