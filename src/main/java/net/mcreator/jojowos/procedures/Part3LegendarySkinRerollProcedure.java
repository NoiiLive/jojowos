package net.mcreator.jojowos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.JojowosMod;

public class Part3LegendarySkinRerollProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		boolean logic_gate = false;
		double random_number = 0;
		logic_gate = false;
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("StarPlatinum")) {
			random_number = Mth.nextInt(RandomSource.create(), 1, 13);
			if (logic_gate == false) {
				if (random_number >= 1 && random_number <= 2) {
					{
						String _setval = "Goku";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "White";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandColor = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number >= 3 && random_number <= 4) {
					{
						String _setval = "Gojo";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "Light Blue";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandColor = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number >= 5 && random_number <= 6) {
					{
						String _setval = "Susanoo";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "Purple";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandColor = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number >= 7 && random_number <= 8) {
					{
						String _setval = "Vergil";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "Blue";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandColor = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number >= 9 && random_number <= 10) {
					{
						String _setval = "Baoh";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "Purple";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandColor = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number >= 11 && random_number <= 12) {
					{
						String _setval = "Jotaro";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "Purple";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandColor = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number >= 13 && random_number <= 13) {
					Part3ShinySkinRerollProcedure.execute(world, entity);
					logic_gate = true;
				}
			}
			if (!((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StarPlatinumSkinsUnlocked)
					.contains((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin)) {
				{
					String _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StarPlatinumSkinsUnlocked + " "
							+ (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin + " ,";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.StarPlatinumSkinsUnlocked = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("HierophantGreen")) {
			random_number = Mth.nextInt(RandomSource.create(), 1, 9);
			if (logic_gate == false) {
				if (random_number >= 1 && random_number <= 2) {
					{
						String _setval = "Kakyoin";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "Green";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandColor = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number >= 3 && random_number <= 4) {
					{
						String _setval = "Spiderman";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "Blue";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandColor = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number >= 5 && random_number <= 6) {
					{
						String _setval = "Dazai";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "White";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandColor = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number >= 7 && random_number <= 8) {
					{
						String _setval = "Sero";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "Yellow";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandColor = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number >= 9 && random_number <= 9) {
					Part3ShinySkinRerollProcedure.execute(world, entity);
					logic_gate = true;
				}
			}
			if (!((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).HierophantGreenSkinsUnlocked)
					.contains((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin)) {
				{
					String _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).HierophantGreenSkinsUnlocked + " "
							+ (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin + " ,";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.HierophantGreenSkinsUnlocked = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("SilverChariot")) {
			random_number = Mth.nextInt(RandomSource.create(), 1, 13);
			if (logic_gate == false) {
				if (random_number >= 1 && random_number <= 2) {
					{
						String _setval = "Polnareff";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "White";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandColor = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number >= 3 && random_number <= 4) {
					{
						String _setval = "Kokushibo";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "Purple";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandColor = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number >= 5 && random_number <= 6) {
					{
						String _setval = "Darth";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "Red";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandColor = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number >= 7 && random_number <= 8) {
					{
						String _setval = "Jetstream";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "Red";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandColor = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number >= 9 && random_number <= 10) {
					{
						String _setval = "Yuta";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "Pink";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandColor = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number >= 11 && random_number <= 12) {
					{
						String _setval = "Zoro";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "Green";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandColor = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number >= 13 && random_number <= 13) {
					Part3ShinySkinRerollProcedure.execute(world, entity);
					logic_gate = true;
				}
			}
			if (!((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SilverChariotSkinsUnlocked)
					.contains((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin)) {
				{
					String _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SilverChariotSkinsUnlocked + " "
							+ (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin + " ,";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SilverChariotSkinsUnlocked = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("MagiciansRed")) {
			random_number = Mth.nextInt(RandomSource.create(), 1, 13);
			if (logic_gate == false) {
				if (random_number >= 1 && random_number <= 2) {
					{
						String _setval = "Avdol";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "Red";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandColor = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number >= 3 && random_number <= 4) {
					{
						String _setval = "Marco";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "Light Blue";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandColor = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number >= 5 && random_number <= 6) {
					{
						String _setval = "Shinra";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "Orange";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandColor = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number >= 7 && random_number <= 8) {
					{
						String _setval = "Roy";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "Blue";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandColor = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number >= 9 && random_number <= 10) {
					{
						String _setval = "Dabi";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "Light Blue";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandColor = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number >= 11 && random_number <= 12) {
					{
						String _setval = "Rin";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "Light Blue";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandColor = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number >= 13 && random_number <= 13) {
					Part3ShinySkinRerollProcedure.execute(world, entity);
					logic_gate = true;
				}
			}
			if (!((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).MagiciansRedSkinsUnlocked)
					.contains((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin)) {
				{
					String _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).MagiciansRedSkinsUnlocked + " "
							+ (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin + " ,";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MagiciansRedSkinsUnlocked = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("HermitPurple")) {
			random_number = Mth.nextInt(RandomSource.create(), 1, 13);
			if (logic_gate == false) {
				if (random_number >= 1 && random_number <= 2) {
					{
						String _setval = "Venom";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "White";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandColor = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number >= 3 && random_number <= 4) {
					{
						String _setval = "Link";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "Green";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandColor = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number >= 5 && random_number <= 6) {
					{
						String _setval = "Automail";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "White";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandColor = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number >= 7 && random_number <= 8) {
					{
						String _setval = "Gigante";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "Red";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandColor = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number >= 9 && random_number <= 10) {
					{
						String _setval = "Nero";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "Light Blue";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandColor = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number >= 11 && random_number <= 12) {
					{
						String _setval = "Luck";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "Light Blue";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandColor = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number >= 13 && random_number <= 13) {
					Part3ShinySkinRerollProcedure.execute(world, entity);
					logic_gate = true;
				}
			}
			if (!((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).HermitPurpleSkinsUnlocked)
					.contains((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin)) {
				{
					String _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).HermitPurpleSkinsUnlocked + " "
							+ (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin + " ,";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.HermitPurpleSkinsUnlocked = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("TheWorld")) {
			random_number = Mth.nextInt(RandomSource.create(), 1, 15);
			if (logic_gate == false) {
				if (random_number >= 1 && random_number <= 2) {
					{
						String _setval = "Dio";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "Yellow";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandColor = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number >= 3 && random_number <= 4) {
					{
						String _setval = "Imposter";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "Red";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandColor = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number >= 5 && random_number <= 6) {
					{
						String _setval = "Sett";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "Purple";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandColor = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number >= 7 && random_number <= 8) {
					{
						String _setval = "Vegeta";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "Blue";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandColor = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number >= 9 && random_number <= 10) {
					{
						String _setval = "Dante";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "Red";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandColor = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number >= 11 && random_number <= 12) {
					{
						String _setval = "Shadow";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "Purple";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandColor = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number >= 13 && random_number <= 14) {
					{
						String _setval = "Sakuya";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "Red";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandColor = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number >= 15 && random_number <= 15) {
					Part3ShinySkinRerollProcedure.execute(world, entity);
					logic_gate = true;
				}
			}
			if (!((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).TheWorldSkinsUnlocked)
					.contains((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin)) {
				{
					String _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).TheWorldSkinsUnlocked + " "
							+ (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin + " ,";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.TheWorldSkinsUnlocked = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("TheFool")) {
			random_number = Mth.nextInt(RandomSource.create(), 1, 9);
			if (logic_gate == false) {
				if (random_number >= 1 && random_number <= 2) {
					{
						String _setval = "Iggy";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "White";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandColor = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number >= 3 && random_number <= 4) {
					{
						String _setval = "Sandman";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "Green";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandColor = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number >= 5 && random_number <= 6) {
					{
						String _setval = "Gaara";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "Red";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandColor = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number >= 7 && random_number <= 8) {
					{
						String _setval = "Crocodile";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "Yellow";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandColor = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					logic_gate = true;
				}
			}
			if (logic_gate == false) {
				if (random_number >= 9 && random_number <= 9) {
					Part3ShinySkinRerollProcedure.execute(world, entity);
					logic_gate = true;
				}
			}
			if (!((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).TheFoolSkinsUnlocked)
					.contains((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin)) {
				{
					String _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).TheFoolSkinsUnlocked + " "
							+ (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin + " ,";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.TheFoolSkinsUnlocked = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		JojowosMod.queueServerWork(10, () -> {
			JojowosMod.LOGGER.info((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin);
		});
	}
}
