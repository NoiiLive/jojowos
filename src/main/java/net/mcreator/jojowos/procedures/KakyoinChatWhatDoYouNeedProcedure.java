package net.mcreator.jojowos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.JojowosMod;

public class KakyoinChatWhatDoYouNeedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 == 0) {
			{
				String _setval = "W";
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
				String _setval = "Wh";
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
				String _setval = "Wha";
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
				String _setval = "What";
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
				String _setval = "What ";
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
				String _setval = "What c";
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
				String _setval = "What ca";
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
				String _setval = "What can";
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
				String _setval = "What can ";
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
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 == 9) {
			{
				String _setval = "What can I";
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
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 == 10) {
			{
				String _setval = "What can I ";
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
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 == 11) {
			{
				String _setval = "What can I d";
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
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 == 12) {
			{
				String _setval = "What can I do";
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
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 == 13) {
			{
				String _setval = "What can I do ";
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
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 == 14) {
			{
				String _setval = "What can I do f";
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
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 == 15) {
			{
				String _setval = "What can I do fo";
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
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 == 16) {
			{
				String _setval = "What can I do for";
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
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 == 17) {
			{
				String _setval = "What can I do for ";
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
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 == 18) {
			{
				String _setval = "What can I do for y";
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
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 == 19) {
			{
				String _setval = "What can I do for yo";
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
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 == 20) {
			{
				String _setval = "What can I do for you";
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
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 == 21) {
			{
				String _setval = "What can I do for you?";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.NPCTextLine1 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
