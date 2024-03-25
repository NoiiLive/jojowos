package net.mcreator.jojowos.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.jojowos.network.JojowosModVariables;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class SetSkinCommandProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal("Can break things, if typed wrong. (Set to Base to revert)"), false);
		{
			String _setval = StringArgumentType.getString(arguments, "skin");
			(new Object() {
				public Entity getEntity() {
					try {
						return EntityArgument.getEntity(arguments, "name");
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return null;
					}
				}
			}.getEntity()).getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.StandSkin = _setval;
				capability.syncPlayerVariables((new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "name");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()));
			});
		}
		if ((new Object() {
			public Entity getEntity() {
				try {
					return EntityArgument.getEntity(arguments, "name");
				} catch (CommandSyntaxException e) {
					e.printStackTrace();
					return null;
				}
			}
		}.getEntity()) instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal("Re-Summon your Stand to Refresh it's Skin!"), true);
		if ((((new Object() {
			public Entity getEntity() {
				try {
					return EntityArgument.getEntity(arguments, "name");
				} catch (CommandSyntaxException e) {
					e.printStackTrace();
					return null;
				}
			}
		}.getEntity()).getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("StarPlatinum")) {
			if (!(((new Object() {
				public Entity getEntity() {
					try {
						return EntityArgument.getEntity(arguments, "name");
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return null;
					}
				}
			}.getEntity()).getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StarPlatinumSkinsUnlocked).contains(StringArgumentType.getString(arguments, "skin"))) {
				{
					String _setval = ((new Object() {
						public Entity getEntity() {
							try {
								return EntityArgument.getEntity(arguments, "name");
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return null;
							}
						}
					}.getEntity()).getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StarPlatinumSkinsUnlocked + " " + StringArgumentType.getString(arguments, "skin") + " ,";
					(new Object() {
						public Entity getEntity() {
							try {
								return EntityArgument.getEntity(arguments, "name");
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return null;
							}
						}
					}.getEntity()).getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.StarPlatinumSkinsUnlocked = _setval;
						capability.syncPlayerVariables((new Object() {
							public Entity getEntity() {
								try {
									return EntityArgument.getEntity(arguments, "name");
								} catch (CommandSyntaxException e) {
									e.printStackTrace();
									return null;
								}
							}
						}.getEntity()));
					});
				}
			}
		}
		if ((((new Object() {
			public Entity getEntity() {
				try {
					return EntityArgument.getEntity(arguments, "name");
				} catch (CommandSyntaxException e) {
					e.printStackTrace();
					return null;
				}
			}
		}.getEntity()).getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("MagiciansRed")) {
			if (!(((new Object() {
				public Entity getEntity() {
					try {
						return EntityArgument.getEntity(arguments, "name");
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return null;
					}
				}
			}.getEntity()).getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).MagiciansRedSkinsUnlocked).contains(StringArgumentType.getString(arguments, "skin"))) {
				{
					String _setval = ((new Object() {
						public Entity getEntity() {
							try {
								return EntityArgument.getEntity(arguments, "name");
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return null;
							}
						}
					}.getEntity()).getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).MagiciansRedSkinsUnlocked + " " + StringArgumentType.getString(arguments, "skin") + " ,";
					(new Object() {
						public Entity getEntity() {
							try {
								return EntityArgument.getEntity(arguments, "name");
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return null;
							}
						}
					}.getEntity()).getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MagiciansRedSkinsUnlocked = _setval;
						capability.syncPlayerVariables((new Object() {
							public Entity getEntity() {
								try {
									return EntityArgument.getEntity(arguments, "name");
								} catch (CommandSyntaxException e) {
									e.printStackTrace();
									return null;
								}
							}
						}.getEntity()));
					});
				}
			}
		}
		if ((((new Object() {
			public Entity getEntity() {
				try {
					return EntityArgument.getEntity(arguments, "name");
				} catch (CommandSyntaxException e) {
					e.printStackTrace();
					return null;
				}
			}
		}.getEntity()).getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("HierophantGreen")) {
			if (!(((new Object() {
				public Entity getEntity() {
					try {
						return EntityArgument.getEntity(arguments, "name");
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return null;
					}
				}
			}.getEntity()).getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).HierophantGreenSkinsUnlocked).contains(StringArgumentType.getString(arguments, "skin"))) {
				{
					String _setval = ((new Object() {
						public Entity getEntity() {
							try {
								return EntityArgument.getEntity(arguments, "name");
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return null;
							}
						}
					}.getEntity()).getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).HierophantGreenSkinsUnlocked + " " + StringArgumentType.getString(arguments, "skin") + " ,";
					(new Object() {
						public Entity getEntity() {
							try {
								return EntityArgument.getEntity(arguments, "name");
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return null;
							}
						}
					}.getEntity()).getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.HierophantGreenSkinsUnlocked = _setval;
						capability.syncPlayerVariables((new Object() {
							public Entity getEntity() {
								try {
									return EntityArgument.getEntity(arguments, "name");
								} catch (CommandSyntaxException e) {
									e.printStackTrace();
									return null;
								}
							}
						}.getEntity()));
					});
				}
			}
		}
		if ((((new Object() {
			public Entity getEntity() {
				try {
					return EntityArgument.getEntity(arguments, "name");
				} catch (CommandSyntaxException e) {
					e.printStackTrace();
					return null;
				}
			}
		}.getEntity()).getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("SilverChariot")) {
			if (!(((new Object() {
				public Entity getEntity() {
					try {
						return EntityArgument.getEntity(arguments, "name");
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return null;
					}
				}
			}.getEntity()).getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SilverChariotSkinsUnlocked).contains(StringArgumentType.getString(arguments, "skin"))) {
				{
					String _setval = ((new Object() {
						public Entity getEntity() {
							try {
								return EntityArgument.getEntity(arguments, "name");
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return null;
							}
						}
					}.getEntity()).getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SilverChariotSkinsUnlocked + " " + StringArgumentType.getString(arguments, "skin") + " ,";
					(new Object() {
						public Entity getEntity() {
							try {
								return EntityArgument.getEntity(arguments, "name");
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return null;
							}
						}
					}.getEntity()).getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SilverChariotSkinsUnlocked = _setval;
						capability.syncPlayerVariables((new Object() {
							public Entity getEntity() {
								try {
									return EntityArgument.getEntity(arguments, "name");
								} catch (CommandSyntaxException e) {
									e.printStackTrace();
									return null;
								}
							}
						}.getEntity()));
					});
				}
			}
		}
		if ((((new Object() {
			public Entity getEntity() {
				try {
					return EntityArgument.getEntity(arguments, "name");
				} catch (CommandSyntaxException e) {
					e.printStackTrace();
					return null;
				}
			}
		}.getEntity()).getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("HermitPurple")) {
			if (!(((new Object() {
				public Entity getEntity() {
					try {
						return EntityArgument.getEntity(arguments, "name");
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return null;
					}
				}
			}.getEntity()).getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).HermitPurpleSkinsUnlocked).contains(StringArgumentType.getString(arguments, "skin"))) {
				{
					String _setval = ((new Object() {
						public Entity getEntity() {
							try {
								return EntityArgument.getEntity(arguments, "name");
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return null;
							}
						}
					}.getEntity()).getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).HermitPurpleSkinsUnlocked + " " + StringArgumentType.getString(arguments, "skin") + " ,";
					(new Object() {
						public Entity getEntity() {
							try {
								return EntityArgument.getEntity(arguments, "name");
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return null;
							}
						}
					}.getEntity()).getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.HermitPurpleSkinsUnlocked = _setval;
						capability.syncPlayerVariables((new Object() {
							public Entity getEntity() {
								try {
									return EntityArgument.getEntity(arguments, "name");
								} catch (CommandSyntaxException e) {
									e.printStackTrace();
									return null;
								}
							}
						}.getEntity()));
					});
				}
			}
		}
		if ((((new Object() {
			public Entity getEntity() {
				try {
					return EntityArgument.getEntity(arguments, "name");
				} catch (CommandSyntaxException e) {
					e.printStackTrace();
					return null;
				}
			}
		}.getEntity()).getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("TheFool")) {
			if (!(((new Object() {
				public Entity getEntity() {
					try {
						return EntityArgument.getEntity(arguments, "name");
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return null;
					}
				}
			}.getEntity()).getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).TheFoolSkinsUnlocked).contains(StringArgumentType.getString(arguments, "skin"))) {
				{
					String _setval = ((new Object() {
						public Entity getEntity() {
							try {
								return EntityArgument.getEntity(arguments, "name");
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return null;
							}
						}
					}.getEntity()).getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).TheFoolSkinsUnlocked + " " + StringArgumentType.getString(arguments, "skin") + " ,";
					(new Object() {
						public Entity getEntity() {
							try {
								return EntityArgument.getEntity(arguments, "name");
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return null;
							}
						}
					}.getEntity()).getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.TheFoolSkinsUnlocked = _setval;
						capability.syncPlayerVariables((new Object() {
							public Entity getEntity() {
								try {
									return EntityArgument.getEntity(arguments, "name");
								} catch (CommandSyntaxException e) {
									e.printStackTrace();
									return null;
								}
							}
						}.getEntity()));
					});
				}
			}
		}
		if ((((new Object() {
			public Entity getEntity() {
				try {
					return EntityArgument.getEntity(arguments, "name");
				} catch (CommandSyntaxException e) {
					e.printStackTrace();
					return null;
				}
			}
		}.getEntity()).getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("TheWorld")) {
			if (!(((new Object() {
				public Entity getEntity() {
					try {
						return EntityArgument.getEntity(arguments, "name");
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return null;
					}
				}
			}.getEntity()).getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).TheWorldSkinsUnlocked).contains(StringArgumentType.getString(arguments, "skin"))) {
				{
					String _setval = ((new Object() {
						public Entity getEntity() {
							try {
								return EntityArgument.getEntity(arguments, "name");
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return null;
							}
						}
					}.getEntity()).getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).TheWorldSkinsUnlocked + " " + StringArgumentType.getString(arguments, "skin") + " ,";
					(new Object() {
						public Entity getEntity() {
							try {
								return EntityArgument.getEntity(arguments, "name");
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return null;
							}
						}
					}.getEntity()).getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.TheWorldSkinsUnlocked = _setval;
						capability.syncPlayerVariables((new Object() {
							public Entity getEntity() {
								try {
									return EntityArgument.getEntity(arguments, "name");
								} catch (CommandSyntaxException e) {
									e.printStackTrace();
									return null;
								}
							}
						}.getEntity()));
					});
				}
			}
		}
	}
}
