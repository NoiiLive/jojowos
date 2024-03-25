package net.mcreator.jojowos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.JojowosMod;

public class Part3SkinRerollProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		boolean logic_gate = false;
		double random_number = 0;
		logic_gate = false;
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("StarPlatinum")) {
			random_number = Mth.nextInt(RandomSource.create(), 1, 56);
			if (logic_gate == false) {
				if (random_number >= 1 && random_number <= 50) {
					{
						String _setval = "Base";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number == 51) {
					{
						String _setval = "Part4";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number == 52) {
					{
						String _setval = "Part6";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number == 53) {
					{
						String _setval = "Manga";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number == 54) {
					{
						String _setval = "OVA";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number == 55) {
					{
						String _setval = "Blue";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number == 56) {
					{
						String _setval = "Green";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("HierophantGreen")) {
			random_number = Mth.nextInt(RandomSource.create(), 1, 53);
			if (logic_gate == false) {
				if (random_number >= 1 && random_number <= 50) {
					{
						String _setval = "Base";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number == 51) {
					{
						String _setval = "Manga";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number == 52) {
					{
						String _setval = "OVA";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number == 53) {
					{
						String _setval = "Blue";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("SilverChariot")) {
			random_number = Mth.nextInt(RandomSource.create(), 1, 53);
			if (logic_gate == false) {
				if (random_number >= 1 && random_number <= 50) {
					{
						String _setval = "Base";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number == 51) {
					{
						String _setval = "OVA";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number == 52) {
					{
						String _setval = "Manga";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number == 53) {
					{
						String _setval = "Gold";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("MagiciansRed")) {
			random_number = Mth.nextInt(RandomSource.create(), 1, 54);
			if (logic_gate == false) {
				if (random_number >= 1 && random_number <= 50) {
					{
						String _setval = "Base";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number == 51) {
					{
						String _setval = "OVA";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number == 52) {
					{
						String _setval = "Manga";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number == 53) {
					{
						String _setval = "ASB";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number == 54) {
					{
						String _setval = "Green";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("HermitPurple")) {
			random_number = Mth.nextInt(RandomSource.create(), 1, 55);
			if (logic_gate == false) {
				if (random_number >= 1 && random_number <= 50) {
					{
						String _setval = "Base";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number == 51) {
					{
						String _setval = "Part4";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number == 52) {
					{
						String _setval = "Manga";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number == 53) {
					{
						String _setval = "Red";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number == 54) {
					{
						String _setval = "Blue";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number == 55) {
					{
						String _setval = "Gold";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("TheWorld")) {
			random_number = Mth.nextInt(RandomSource.create(), 1, 54);
			if (logic_gate == false) {
				if (random_number >= 1 && random_number <= 50) {
					{
						String _setval = "Base";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number == 51) {
					{
						String _setval = "Black";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number == 52) {
					{
						String _setval = "Manga";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number == 53) {
					{
						String _setval = "OVA";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number == 54) {
					{
						String _setval = "Dark";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("TheFool")) {
			random_number = Mth.nextInt(RandomSource.create(), 1, 52);
			if (logic_gate == false) {
				if (random_number >= 1 && random_number <= 50) {
					{
						String _setval = "Base";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number == 51) {
					{
						String _setval = "OVA";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number == 52) {
					{
						String _setval = "Manga";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
		}
		JojowosMod.queueServerWork(10, () -> {
			JojowosMod.LOGGER.info((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin);
		});
	}
}
