package net.mcreator.jojowos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.JojowosMod;

public class AvdolChatWhatDoYouNeedProcedure {
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
				String _setval = "Ts";
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
				String _setval = "Tsk";
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
				String _setval = "Tsk ";
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
				String _setval = "Tsk t";
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
				String _setval = "Tsk ts";
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
				String _setval = "Tsk tsk";
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
				String _setval = "Tsk tsk.";
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
				String _setval = "Tsk tsk..";
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
				String _setval = "Tsk tsk...";
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
				String _setval = "Tsk tsk... ";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.NPCTextLine1 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "Avdol";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.NPCIcon = _setval;
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
				String _setval = "Tsk tsk... H";
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
				String _setval = "Tsk tsk... Ho";
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
				String _setval = "Tsk tsk... How";
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
				String _setval = "Tsk tsk... How ";
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
				String _setval = "Tsk tsk... How c";
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
				String _setval = "Tsk tsk... How ca";
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
				String _setval = "Tsk tsk... How can";
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
				String _setval = "Tsk tsk... How can ";
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
				String _setval = "Tsk tsk... How can I";
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
				String _setval = "Tsk tsk... How can I ";
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
				String _setval = "Tsk tsk... How can I h";
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
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 == 22) {
			{
				String _setval = "Tsk tsk... How can I he";
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
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 == 23) {
			{
				String _setval = "Tsk tsk... How can I hel";
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
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 == 24) {
			{
				String _setval = "Tsk tsk... How can I help";
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
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 == 25) {
			{
				String _setval = "Tsk tsk... How can I help ";
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
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 == 26) {
			{
				String _setval = "Tsk tsk... How can I help y";
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
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 == 27) {
			{
				String _setval = "Tsk tsk... How can I help yo";
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
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 == 28) {
			{
				String _setval = "Tsk tsk... How can I help you";
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
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NPCTextStep1 == 29) {
			{
				String _setval = "Tsk tsk... How can I help you?";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.NPCTextLine1 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
