package net.mcreator.jojowos.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.init.JojowosModItems;
import net.mcreator.jojowos.configuration.SDCConfigFilesConfiguration;
import net.mcreator.jojowos.JojowosMod;

public class DiscInformationShareProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double random_number = 0;
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).UsingDisc == true) {
			if (itemstack.getOrCreateTag().getBoolean("DiscInformation") == false) {
				itemstack.getOrCreateTag().putBoolean("DiscInformation", true);
				itemstack.getOrCreateTag().putString("StandSkin", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin));
				itemstack.getOrCreateTag().putString("MovesUnlocked", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).MovesUnlocked));
				itemstack.getOrCreateTag().putString("StandColor", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandColor));
				itemstack.getOrCreateTag().putDouble("TimeStopLength", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).TimeStopLength));
				itemstack.getOrCreateTag().putDouble("CurrentExp", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).CurrentExp));
				itemstack.getOrCreateTag().putDouble("MaxExp", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).MaxExp));
				itemstack.getOrCreateTag().putDouble("Level", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Level));
				itemstack.getOrCreateTag().putDouble("SkillPoints", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SkillPoints));
				itemstack.getOrCreateTag().putDouble("Power", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower));
				itemstack.getOrCreateTag().putDouble("Speed", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSpeed));
				itemstack.getOrCreateTag().putDouble("Durability", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandDurability));
				itemstack.getOrCreateTag().putDouble("Precision", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPrecision));
				itemstack.getOrCreateTag().putDouble("Potential", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPotential));
				JojowosMod.LOGGER.debug((itemstack.getOrCreateTag().getString("MovesUnlocked")));
			}
		}
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).UsingDisc == false) {
			if (itemstack.getOrCreateTag().getBoolean("DiscInformation") == false) {
				itemstack.getOrCreateTag().putBoolean("DiscInformation", true);
				itemstack.getOrCreateTag().putString("StandSkin", "Base");
				itemstack.getOrCreateTag().putDouble("CurrentExp", 0);
				itemstack.getOrCreateTag().putDouble("MaxExp", 100);
				itemstack.getOrCreateTag().putDouble("Level", 1);
				itemstack.getOrCreateTag().putDouble("SkillPoints", 0);
				itemstack.getOrCreateTag().putDouble("Power", 0);
				itemstack.getOrCreateTag().putDouble("Speed", 0);
				itemstack.getOrCreateTag().putDouble("Durability", 0);
				itemstack.getOrCreateTag().putDouble("Precision", 0);
				itemstack.getOrCreateTag().putDouble("Potential", 0);
				if (itemstack.getItem() == JojowosModItems.STAR_PLATINUM_DISC.get()) {
					itemstack.getOrCreateTag().putDouble("TimeStopLength", 20);
					itemstack.getOrCreateTag().putString("StandColor", "Purple");
					itemstack.getOrCreateTag().putString("MovesUnlocked", (SDCConfigFilesConfiguration.STARPLATINUMABILITY1.get() + "|"));
				}
				if (itemstack.getItem() == JojowosModItems.MAGICIANS_RED_DISC.get()) {
					itemstack.getOrCreateTag().putDouble("TimeStopLength", 0);
					itemstack.getOrCreateTag().putString("StandColor", "Red");
					itemstack.getOrCreateTag().putString("MovesUnlocked", (SDCConfigFilesConfiguration.MAGICIANSREDABILITY1.get() + "|"));
				}
				if (itemstack.getItem() == JojowosModItems.SILVER_CHARIOT_DISC.get()) {
					itemstack.getOrCreateTag().putDouble("TimeStopLength", 0);
					itemstack.getOrCreateTag().putString("StandColor", "White");
					itemstack.getOrCreateTag().putString("MovesUnlocked", (SDCConfigFilesConfiguration.SILVERCHARIOTABILITY1.get() + "|"));
				}
				if (itemstack.getItem() == JojowosModItems.HIEROPHANT_GREEN_DISC.get()) {
					itemstack.getOrCreateTag().putDouble("TimeStopLength", 0);
					itemstack.getOrCreateTag().putString("StandColor", "Green");
					itemstack.getOrCreateTag().putString("MovesUnlocked", (SDCConfigFilesConfiguration.HIEROPHANTGREENABILITY1.get() + "|"));
				}
				if (itemstack.getItem() == JojowosModItems.HERMIT_PURPLE_DISC.get()) {
					itemstack.getOrCreateTag().putDouble("TimeStopLength", 0);
					itemstack.getOrCreateTag().putString("StandColor", "Purple");
					itemstack.getOrCreateTag().putString("MovesUnlocked", ("Grapple" + "|"));
				}
				if (itemstack.getItem() == JojowosModItems.THE_WORLD_DISC.get()) {
					itemstack.getOrCreateTag().putDouble("TimeStopLength", 50);
					itemstack.getOrCreateTag().putString("StandColor", "Yellow");
					itemstack.getOrCreateTag().putString("MovesUnlocked", (SDCConfigFilesConfiguration.THEWORLDABILITY1.get() + "|"));
				}
				if (itemstack.getItem() == JojowosModItems.THE_FOOL_DISC.get()) {
					itemstack.getOrCreateTag().putDouble("TimeStopLength", 0);
					itemstack.getOrCreateTag().putString("StandColor", "White");
					itemstack.getOrCreateTag().putString("MovesUnlocked", (SDCConfigFilesConfiguration.THEFOOLABILITY1.get() + "|"));
				}
			}
		}
		if (itemstack.getItem() == JojowosModItems.THE_WORLD_DISC.get()) {
			itemstack.getOrCreateTag().putDouble("MaxPower", ((double) SDCConfigFilesConfiguration.THEWORLDSTRENGTH.get()));
			itemstack.getOrCreateTag().putDouble("MaxDurability", ((double) SDCConfigFilesConfiguration.THEWORLDDURABILITY.get()));
			itemstack.getOrCreateTag().putDouble("MaxPrecision", ((double) SDCConfigFilesConfiguration.THEWORLDPRECISION.get()));
			itemstack.getOrCreateTag().putDouble("MaxPotential", ((double) SDCConfigFilesConfiguration.THEWORLDPOTENTIAL.get()));
			itemstack.getOrCreateTag().putDouble("MaxSpeed", 100);
			itemstack.getOrCreateTag().putString("Ability1", (SDCConfigFilesConfiguration.THEWORLDABILITY1.get()));
			itemstack.getOrCreateTag().putString("Ability2", (SDCConfigFilesConfiguration.THEWORLDABILITY2.get()));
			itemstack.getOrCreateTag().putString("Ability3", (SDCConfigFilesConfiguration.THEWORLDABILITY3.get()));
			itemstack.getOrCreateTag().putString("Ability4", (SDCConfigFilesConfiguration.THEWORLDABILITY4.get()));
			itemstack.getOrCreateTag().putString("Ability5", (SDCConfigFilesConfiguration.THEWORLDABILITY5.get()));
			itemstack.getOrCreateTag().putString("Ability6", (SDCConfigFilesConfiguration.THEWORLDABILITY6.get()));
			itemstack.getOrCreateTag().putString("Ability7", (SDCConfigFilesConfiguration.THEWORLDABILITY7.get()));
			itemstack.getOrCreateTag().putString("Ability8", (SDCConfigFilesConfiguration.THEWORLDABILITY8.get()));
			itemstack.getOrCreateTag().putString("Ability9", (SDCConfigFilesConfiguration.THEWORLDABILITY9.get()));
		} else if (itemstack.getItem() == JojowosModItems.STAR_PLATINUM_DISC.get()) {
			itemstack.getOrCreateTag().putDouble("MaxPower", ((double) SDCConfigFilesConfiguration.STARPLATINUMSTRENGTH.get()));
			itemstack.getOrCreateTag().putDouble("MaxDurability", ((double) SDCConfigFilesConfiguration.STARPLATINUMDURABILITY.get()));
			itemstack.getOrCreateTag().putDouble("MaxPrecision", ((double) SDCConfigFilesConfiguration.STARPLATINUMPRECISION.get()));
			itemstack.getOrCreateTag().putDouble("MaxPotential", ((double) SDCConfigFilesConfiguration.STARPLATINUMPOTENTIAL.get()));
			itemstack.getOrCreateTag().putDouble("MaxSpeed", 100);
			itemstack.getOrCreateTag().putString("Ability1", (SDCConfigFilesConfiguration.STARPLATINUMABILITY1.get()));
			itemstack.getOrCreateTag().putString("Ability2", (SDCConfigFilesConfiguration.STARPLATINUMABILITY2.get()));
			itemstack.getOrCreateTag().putString("Ability3", (SDCConfigFilesConfiguration.STARPLATINUMABILITY3.get()));
			itemstack.getOrCreateTag().putString("Ability4", (SDCConfigFilesConfiguration.STARPLATINUMABILITY4.get()));
			itemstack.getOrCreateTag().putString("Ability5", (SDCConfigFilesConfiguration.STARPLATINUMABILITY5.get()));
			itemstack.getOrCreateTag().putString("Ability6", (SDCConfigFilesConfiguration.STARPLATINUMABILITY6.get()));
			itemstack.getOrCreateTag().putString("Ability7", (SDCConfigFilesConfiguration.STARPLATINUMABILITY7.get()));
			itemstack.getOrCreateTag().putString("Ability8", (SDCConfigFilesConfiguration.STARPLATINUMABILITY8.get()));
			itemstack.getOrCreateTag().putString("Ability9", (SDCConfigFilesConfiguration.STARPLATINUMABILITY9.get()));
		} else if (itemstack.getItem() == JojowosModItems.HIEROPHANT_GREEN_DISC.get()) {
			itemstack.getOrCreateTag().putDouble("MaxPower", ((double) SDCConfigFilesConfiguration.HIEROPHANTGREENSTRENGTH.get()));
			itemstack.getOrCreateTag().putDouble("MaxDurability", ((double) SDCConfigFilesConfiguration.HIEROPHANTGREENDURABILITY.get()));
			itemstack.getOrCreateTag().putDouble("MaxPrecision", ((double) SDCConfigFilesConfiguration.HIEROPHANTGREENPRECISION.get()));
			itemstack.getOrCreateTag().putDouble("MaxPotential", ((double) SDCConfigFilesConfiguration.HIEROPHANTGREENPOTENTIAL.get()));
			itemstack.getOrCreateTag().putDouble("MaxSpeed", 80);
			itemstack.getOrCreateTag().putString("Ability1", (SDCConfigFilesConfiguration.HIEROPHANTGREENABILITY1.get()));
			itemstack.getOrCreateTag().putString("Ability2", (SDCConfigFilesConfiguration.HIEROPHANTGREENABILITY2.get()));
			itemstack.getOrCreateTag().putString("Ability3", (SDCConfigFilesConfiguration.HIEROPHANTGREENABILITY3.get()));
			itemstack.getOrCreateTag().putString("Ability4", (SDCConfigFilesConfiguration.HIEROPHANTGREENABILITY4.get()));
			itemstack.getOrCreateTag().putString("Ability5", (SDCConfigFilesConfiguration.HIEROPHANTGREENABILITY5.get()));
			itemstack.getOrCreateTag().putString("Ability6", (SDCConfigFilesConfiguration.HIEROPHANTGREENABILITY6.get()));
			itemstack.getOrCreateTag().putString("Ability7", (SDCConfigFilesConfiguration.HIEROPHANTGREENABILITY7.get()));
			itemstack.getOrCreateTag().putString("Ability8", (SDCConfigFilesConfiguration.HIEROPHANTGREENABILITY8.get()));
			itemstack.getOrCreateTag().putString("Ability9", (SDCConfigFilesConfiguration.HIEROPHANTGREENABILITY9.get()));
		} else if (itemstack.getItem() == JojowosModItems.MAGICIANS_RED_DISC.get()) {
			itemstack.getOrCreateTag().putDouble("MaxPower", ((double) SDCConfigFilesConfiguration.MAGICIANSREDSTRENGTH.get()));
			itemstack.getOrCreateTag().putDouble("MaxDurability", ((double) SDCConfigFilesConfiguration.MAGICIANSREDDURABILITY.get()));
			itemstack.getOrCreateTag().putDouble("MaxPrecision", ((double) SDCConfigFilesConfiguration.MAGICIANSREDPRECISION.get()));
			itemstack.getOrCreateTag().putDouble("MaxPotential", ((double) SDCConfigFilesConfiguration.MAGICIANSREDPOTENTIAL.get()));
			itemstack.getOrCreateTag().putDouble("MaxSpeed", 80);
			itemstack.getOrCreateTag().putString("Ability1", (SDCConfigFilesConfiguration.MAGICIANSREDABILITY1.get()));
			itemstack.getOrCreateTag().putString("Ability2", (SDCConfigFilesConfiguration.MAGICIANSREDABILITY2.get()));
			itemstack.getOrCreateTag().putString("Ability3", (SDCConfigFilesConfiguration.MAGICIANSREDABILITY3.get()));
			itemstack.getOrCreateTag().putString("Ability4", (SDCConfigFilesConfiguration.MAGICIANSREDABILITY4.get()));
			itemstack.getOrCreateTag().putString("Ability5", (SDCConfigFilesConfiguration.MAGICIANSREDABILITY5.get()));
			itemstack.getOrCreateTag().putString("Ability6", (SDCConfigFilesConfiguration.MAGICIANSREDABILITY6.get()));
			itemstack.getOrCreateTag().putString("Ability7", (SDCConfigFilesConfiguration.MAGICIANSREDABILITY7.get()));
			itemstack.getOrCreateTag().putString("Ability8", (SDCConfigFilesConfiguration.MAGICIANSREDABILITY8.get()));
			itemstack.getOrCreateTag().putString("Ability9", (SDCConfigFilesConfiguration.MAGICIANSREDABILITY9.get()));
		} else if (itemstack.getItem() == JojowosModItems.SILVER_CHARIOT_DISC.get()) {
			itemstack.getOrCreateTag().putDouble("MaxPower", ((double) SDCConfigFilesConfiguration.SILVERCHARIOTSTRENGTH.get()));
			itemstack.getOrCreateTag().putDouble("MaxDurability", ((double) SDCConfigFilesConfiguration.SILVERCHARIOTDURABILITY.get()));
			itemstack.getOrCreateTag().putDouble("MaxPrecision", ((double) SDCConfigFilesConfiguration.SILVERCHARIOTPRECISION.get()));
			itemstack.getOrCreateTag().putDouble("MaxPotential", ((double) SDCConfigFilesConfiguration.SILVERCHARIOTPOTENTIAL.get()));
			itemstack.getOrCreateTag().putDouble("MaxSpeed", 100);
			itemstack.getOrCreateTag().putString("Ability1", (SDCConfigFilesConfiguration.SILVERCHARIOTABILITY1.get()));
			itemstack.getOrCreateTag().putString("Ability2", (SDCConfigFilesConfiguration.SILVERCHARIOTABILITY2.get()));
			itemstack.getOrCreateTag().putString("Ability3", (SDCConfigFilesConfiguration.SILVERCHARIOTABILITY3.get()));
			itemstack.getOrCreateTag().putString("Ability4", (SDCConfigFilesConfiguration.SILVERCHARIOTABILITY4.get()));
			itemstack.getOrCreateTag().putString("Ability5", (SDCConfigFilesConfiguration.SILVERCHARIOTABILITY5.get()));
			itemstack.getOrCreateTag().putString("Ability6", (SDCConfigFilesConfiguration.SILVERCHARIOTABILITY6.get()));
			itemstack.getOrCreateTag().putString("Ability7", (SDCConfigFilesConfiguration.SILVERCHARIOTABILITY7.get()));
			itemstack.getOrCreateTag().putString("Ability8", (SDCConfigFilesConfiguration.SILVERCHARIOTABILITY8.get()));
			itemstack.getOrCreateTag().putString("Ability9", (SDCConfigFilesConfiguration.SILVERCHARIOTABILITY9.get()));
		} else if (itemstack.getItem() == JojowosModItems.HERMIT_PURPLE_DISC.get()) {
			itemstack.getOrCreateTag().putDouble("MaxPower", ((double) SDCConfigFilesConfiguration.HERMITPURPLESTRENGTH.get()));
			itemstack.getOrCreateTag().putDouble("MaxDurability", ((double) SDCConfigFilesConfiguration.HERMITPURPLEDURABILITY.get()));
			itemstack.getOrCreateTag().putDouble("MaxPrecision", ((double) SDCConfigFilesConfiguration.HERMITPURPLEPRECISION.get()));
			itemstack.getOrCreateTag().putDouble("MaxPotential", ((double) SDCConfigFilesConfiguration.HERMITPURPLEPOTENTIAL.get()));
			itemstack.getOrCreateTag().putDouble("MaxSpeed", 60);
			itemstack.getOrCreateTag().putString("Ability1", "Grapple");
			itemstack.getOrCreateTag().putString("Ability2", "Tangle");
			itemstack.getOrCreateTag().putString("Ability3", "Divination");
		} else if (itemstack.getItem() == JojowosModItems.THE_FOOL_DISC.get()) {
			itemstack.getOrCreateTag().putDouble("MaxPower", ((double) SDCConfigFilesConfiguration.THEFOOLSTRENGTH.get()));
			itemstack.getOrCreateTag().putDouble("MaxDurability", ((double) SDCConfigFilesConfiguration.THEFOOLDURABILITY.get()));
			itemstack.getOrCreateTag().putDouble("MaxPrecision", ((double) SDCConfigFilesConfiguration.THEFOOLPRECISION.get()));
			itemstack.getOrCreateTag().putDouble("MaxPotential", ((double) SDCConfigFilesConfiguration.THEFOOLPOTENTIAL.get()));
			itemstack.getOrCreateTag().putDouble("MaxSpeed", 60);
			itemstack.getOrCreateTag().putString("Ability1", (SDCConfigFilesConfiguration.THEFOOLABILITY1.get()));
			itemstack.getOrCreateTag().putString("Ability2", (SDCConfigFilesConfiguration.THEFOOLABILITY2.get()));
			itemstack.getOrCreateTag().putString("Ability3", (SDCConfigFilesConfiguration.THEFOOLABILITY3.get()));
			itemstack.getOrCreateTag().putString("Ability4", (SDCConfigFilesConfiguration.THEFOOLABILITY4.get()));
			itemstack.getOrCreateTag().putString("Ability5", (SDCConfigFilesConfiguration.THEFOOLABILITY5.get()));
			itemstack.getOrCreateTag().putString("Ability6", (SDCConfigFilesConfiguration.THEFOOLABILITY6.get()));
			itemstack.getOrCreateTag().putString("Ability7", (SDCConfigFilesConfiguration.THEFOOLABILITY7.get()));
			itemstack.getOrCreateTag().putString("Ability8", (SDCConfigFilesConfiguration.THEFOOLABILITY8.get()));
			itemstack.getOrCreateTag().putString("Ability9", (SDCConfigFilesConfiguration.THEFOOLABILITY9.get()));
		} else {
			itemstack.getOrCreateTag().putDouble("TimeStopLength", 0);
			itemstack.getOrCreateTag().putDouble("MaxPower", 0);
			itemstack.getOrCreateTag().putDouble("MaxDurability", 0);
			itemstack.getOrCreateTag().putDouble("MaxPrecision", 0);
			itemstack.getOrCreateTag().putDouble("MaxPotential", 0);
			itemstack.getOrCreateTag().putDouble("MaxSpeed", 0);
			itemstack.getOrCreateTag().putString("Ability1", "");
			itemstack.getOrCreateTag().putString("Ability2", "");
			itemstack.getOrCreateTag().putString("Ability3", "");
			itemstack.getOrCreateTag().putString("Ability4", "");
			itemstack.getOrCreateTag().putString("Ability5", "");
			itemstack.getOrCreateTag().putString("Ability6", "");
			itemstack.getOrCreateTag().putString("Ability7", "");
			itemstack.getOrCreateTag().putString("Ability8", "");
			itemstack.getOrCreateTag().putString("Ability9", "");
			JojowosMod.LOGGER.fatal((itemstack.getOrCreateTag().getString("Disc Errored")));
		}
		if ((itemstack.getOrCreateTag().getString("MovesUnlocked")).isEmpty()) {
			itemstack.getOrCreateTag().putString("MovesUnlocked", (itemstack.getOrCreateTag().getString("Ability1")));
			JojowosMod.LOGGER.debug((itemstack.getOrCreateTag().getString("MovesUnlocked")));
		}
	}
}
