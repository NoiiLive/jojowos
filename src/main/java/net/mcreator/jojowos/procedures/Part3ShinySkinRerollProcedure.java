package net.mcreator.jojowos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.JojowosMod;

public class Part3ShinySkinRerollProcedure {
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
						String _setval = "Part4";
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
						String _setval = "Part6";
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
						String _setval = "Manga";
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
						String _setval = "OVA";
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
				if (random_number >= 9 && random_number <= 10) {
					{
						String _setval = "Blue";
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
				if (random_number >= 11 && random_number <= 12) {
					{
						String _setval = "Green";
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
					{
						String _setval = "Base";
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
			random_number = Mth.nextInt(RandomSource.create(), 1, 7);
			if (logic_gate == false) {
				if (random_number >= 1 && random_number <= 2) {
					{
						String _setval = "Manga";
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
						String _setval = "OVA";
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
						String _setval = "Blue";
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
				if (random_number >= 7 && random_number <= 7) {
					{
						String _setval = "Base";
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
			random_number = Mth.nextInt(RandomSource.create(), 1, 7);
			if (logic_gate == false) {
				if (random_number >= 1 && random_number <= 2) {
					{
						String _setval = "OVA";
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
						String _setval = "Manga";
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
				if (random_number >= 5 && random_number <= 6) {
					{
						String _setval = "Gold";
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
				if (random_number >= 7 && random_number <= 7) {
					{
						String _setval = "Base";
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
			random_number = Mth.nextInt(RandomSource.create(), 1, 9);
			if (logic_gate == false) {
				if (random_number >= 1 && random_number <= 2) {
					{
						String _setval = "OVA";
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
						String _setval = "Manga";
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
						String _setval = "ASB";
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
						String _setval = "Green";
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
				if (random_number >= 9 && random_number <= 9) {
					{
						String _setval = "Base";
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
			random_number = Mth.nextInt(RandomSource.create(), 1, 11);
			if (logic_gate == false) {
				if (random_number >= 1 && random_number <= 2) {
					{
						String _setval = "Part4";
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
				if (random_number >= 3 && random_number <= 4) {
					{
						String _setval = "Manga";
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
						String _setval = "Red";
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
						String _setval = "Blue";
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
				if (random_number >= 9 && random_number <= 10) {
					{
						String _setval = "Gold";
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
				if (random_number >= 11 && random_number <= 11) {
					{
						String _setval = "Base";
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
			random_number = Mth.nextInt(RandomSource.create(), 1, 9);
			if (logic_gate == false) {
				if (random_number >= 1 && random_number <= 2) {
					{
						String _setval = "OVA";
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
						String _setval = "Manga";
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
				if (random_number >= 5 && random_number <= 6) {
					{
						String _setval = "Black";
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
						String _setval = "Dark";
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
				if (random_number >= 9 && random_number <= 9) {
					{
						String _setval = "Base";
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
			random_number = Mth.nextInt(RandomSource.create(), 1, 5);
			if (logic_gate == false) {
				if (random_number >= 1 && random_number <= 2) {
					{
						String _setval = "OVA";
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
						String _setval = "Manga";
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
				if (random_number >= 5 && random_number <= 5) {
					{
						String _setval = "Base";
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
