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
		if (itemstack.getItem() == JojowosModItems.STAR_PLATINUM_DISC.get()) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandObtained == false) {
				if ((itemstack.getOrCreateTag().getString("StandSkin")).equals("")) {
					itemstack.getOrCreateTag().putString("StandSkin", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin));
					itemstack.getOrCreateTag().putBoolean("Evolved", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Evolved));
					itemstack.getOrCreateTag().putDouble("TimeStopLength", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).TimeStopLength));
					itemstack.getOrCreateTag().putDouble("CurrentExp", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).CurrentExp));
					itemstack.getOrCreateTag().putDouble("MaxExp", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).MaxExp));
					itemstack.getOrCreateTag().putDouble("Level", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Level));
					itemstack.getOrCreateTag().putDouble("SkillPoints", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SkillPoints));
					itemstack.getOrCreateTag().putDouble("Power", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower));
					itemstack.getOrCreateTag().putDouble("Speed", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSpeed));
					itemstack.getOrCreateTag().putDouble("Range", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandRange));
					itemstack.getOrCreateTag().putDouble("Durability", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandDurability));
					itemstack.getOrCreateTag().putDouble("Precision", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPrecision));
					itemstack.getOrCreateTag().putDouble("Potential", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPotential));
					itemstack.getOrCreateTag().putBoolean("StarFingerUnlocked", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StarFingerUnlocked));
					itemstack.getOrCreateTag().putBoolean("InhaleUnlocked", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).InhaleUnlocked));
					itemstack.getOrCreateTag().putBoolean("BearingShotUnlocked", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).BearingShotUnlocked));
					itemstack.getOrCreateTag().putBoolean("StarTimeSkipUnlocked", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StarTimeSkipUnlocked));
					itemstack.getOrCreateTag().putBoolean("StarTimeStopUnlocked", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StarTimeStopUnlocked));
					JojowosMod.LOGGER.info(itemstack.getOrCreateTag().getString("StandSkin"));
				}
			}
		}
		if (itemstack.getItem() == JojowosModItems.HIEROPHANT_GREEN_DISC.get()) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandObtained == false) {
				if ((itemstack.getOrCreateTag().getString("StandSkin")).equals("")) {
					itemstack.getOrCreateTag().putString("StandSkin", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin));
					itemstack.getOrCreateTag().putBoolean("Evolved", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Evolved));
					itemstack.getOrCreateTag().putDouble("CurrentExp", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).CurrentExp));
					itemstack.getOrCreateTag().putDouble("MaxExp", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).MaxExp));
					itemstack.getOrCreateTag().putDouble("Level", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Level));
					itemstack.getOrCreateTag().putDouble("SkillPoints", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SkillPoints));
					itemstack.getOrCreateTag().putDouble("Power", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower));
					itemstack.getOrCreateTag().putDouble("Speed", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSpeed));
					itemstack.getOrCreateTag().putDouble("Range", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandRange));
					itemstack.getOrCreateTag().putDouble("Durability", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandDurability));
					itemstack.getOrCreateTag().putDouble("Precision", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPrecision));
					itemstack.getOrCreateTag().putDouble("Potential", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPotential));
					itemstack.getOrCreateTag().putBoolean("GreenGrappleUnlocked", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).GreenGrappleUnlocked));
					itemstack.getOrCreateTag().putBoolean("MeterEmeraldUnlocked", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).MeterEmeraldUnlocked));
					itemstack.getOrCreateTag().putBoolean("BodyControlUnlocked", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).BodyControlUnlocked));
					JojowosMod.LOGGER.info(itemstack.getOrCreateTag().getString("StandSkin"));
				}
			}
		}
		if (itemstack.getItem() == JojowosModItems.MAGICIANS_RED_DISC.get()) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandObtained == false) {
				if ((itemstack.getOrCreateTag().getString("StandSkin")).equals("")) {
					itemstack.getOrCreateTag().putString("StandSkin", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin));
					itemstack.getOrCreateTag().putBoolean("Evolved", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Evolved));
					itemstack.getOrCreateTag().putDouble("CurrentExp", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).CurrentExp));
					itemstack.getOrCreateTag().putDouble("MaxExp", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).MaxExp));
					itemstack.getOrCreateTag().putDouble("Level", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Level));
					itemstack.getOrCreateTag().putDouble("SkillPoints", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SkillPoints));
					itemstack.getOrCreateTag().putDouble("Power", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower));
					itemstack.getOrCreateTag().putDouble("Speed", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSpeed));
					itemstack.getOrCreateTag().putDouble("Range", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandRange));
					itemstack.getOrCreateTag().putDouble("Durability", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandDurability));
					itemstack.getOrCreateTag().putDouble("Precision", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPrecision));
					itemstack.getOrCreateTag().putDouble("Potential", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPotential));
					itemstack.getOrCreateTag().putBoolean("CrossfireSpecialUnlocked", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).CrossfireSpecialUnlocked));
					itemstack.getOrCreateTag().putBoolean("RedBindUnlocked", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).RedBindUnlocked));
					itemstack.getOrCreateTag().putBoolean("LifeDetectUnlocked", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).LifeDetectUnlocked));
					JojowosMod.LOGGER.info(itemstack.getOrCreateTag().getString("StandSkin"));
				}
			}
		}
		if (itemstack.getItem() == JojowosModItems.SILVER_CHARIOT_DISC.get()) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandObtained == false) {
				if ((itemstack.getOrCreateTag().getString("StandSkin")).equals("")) {
					itemstack.getOrCreateTag().putString("StandSkin", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin));
					itemstack.getOrCreateTag().putBoolean("Evolved", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Evolved));
					itemstack.getOrCreateTag().putDouble("CurrentExp", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).CurrentExp));
					itemstack.getOrCreateTag().putDouble("MaxExp", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).MaxExp));
					itemstack.getOrCreateTag().putDouble("Level", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Level));
					itemstack.getOrCreateTag().putDouble("SkillPoints", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SkillPoints));
					itemstack.getOrCreateTag().putDouble("Power", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower));
					itemstack.getOrCreateTag().putDouble("Speed", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSpeed));
					itemstack.getOrCreateTag().putDouble("Range", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandRange));
					itemstack.getOrCreateTag().putDouble("Durability", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandDurability));
					itemstack.getOrCreateTag().putDouble("Precision", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPrecision));
					itemstack.getOrCreateTag().putDouble("Potential", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPotential));
					itemstack.getOrCreateTag().putBoolean("SwordLaunchUnlocked", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SwordLaunchUnlocked));
					itemstack.getOrCreateTag().putBoolean("ArmorOffUnlocked", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).ArmorOffUnlocked));
					itemstack.getOrCreateTag().putBoolean("BladeCycloneUnlocked", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).BladeCycloneUnlocked));
					JojowosMod.LOGGER.info(itemstack.getOrCreateTag().getString("StandSkin"));
				}
			}
		}
		if (itemstack.getItem() == JojowosModItems.HERMIT_PURPLE_DISC.get()) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandObtained == false) {
				if ((itemstack.getOrCreateTag().getString("StandSkin")).equals("")) {
					itemstack.getOrCreateTag().putString("StandSkin", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin));
					itemstack.getOrCreateTag().putBoolean("Evolved", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Evolved));
					itemstack.getOrCreateTag().putDouble("CurrentExp", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).CurrentExp));
					itemstack.getOrCreateTag().putDouble("MaxExp", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).MaxExp));
					itemstack.getOrCreateTag().putDouble("Level", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Level));
					itemstack.getOrCreateTag().putDouble("SkillPoints", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SkillPoints));
					itemstack.getOrCreateTag().putDouble("Power", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower));
					itemstack.getOrCreateTag().putDouble("Speed", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSpeed));
					itemstack.getOrCreateTag().putDouble("Range", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandRange));
					itemstack.getOrCreateTag().putDouble("Durability", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandDurability));
					itemstack.getOrCreateTag().putDouble("Precision", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPrecision));
					itemstack.getOrCreateTag().putDouble("Potential", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPotential));
					itemstack.getOrCreateTag().putBoolean("DivinationUnlocked", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).DivinationUnlocked));
					itemstack.getOrCreateTag().putBoolean("TangleUnlocked", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).TangleUnlocked));
				}
			}
		}
		if (itemstack.getItem() == JojowosModItems.THE_WORLD_DISC.get()) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandObtained == false) {
				if ((itemstack.getOrCreateTag().getString("StandSkin")).equals("")) {
					itemstack.getOrCreateTag().putString("StandSkin", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin));
					itemstack.getOrCreateTag().putBoolean("Evolved", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Evolved));
					if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).TimeStopLength > 100) {
						itemstack.getOrCreateTag().putDouble("TimeStopLength", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).TimeStopLength));
					} else {
						itemstack.getOrCreateTag().putDouble("TimeStopLength", 100);
					}
					itemstack.getOrCreateTag().putDouble("CurrentExp", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).CurrentExp));
					itemstack.getOrCreateTag().putDouble("MaxExp", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).MaxExp));
					itemstack.getOrCreateTag().putDouble("Level", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Level));
					itemstack.getOrCreateTag().putDouble("SkillPoints", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SkillPoints));
					itemstack.getOrCreateTag().putDouble("Power", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower));
					itemstack.getOrCreateTag().putDouble("Speed", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSpeed));
					itemstack.getOrCreateTag().putDouble("Range", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandRange));
					itemstack.getOrCreateTag().putDouble("Durability", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandDurability));
					itemstack.getOrCreateTag().putDouble("Precision", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPrecision));
					itemstack.getOrCreateTag().putDouble("Potential", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPotential));
					itemstack.getOrCreateTag().putBoolean("MudaKickUnlocked", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).MudaKickUnlocked));
					itemstack.getOrCreateTag().putBoolean("KnifeTossUnlocked", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).KnifeTossUnlocked));
					itemstack.getOrCreateTag().putBoolean("WorldTimeSkipUnlocked", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).WorldTimeSkipUnlocked));
					itemstack.getOrCreateTag().putBoolean("WorldTimeStopUnlocked", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).WorldTimeStopUnlocked));
					itemstack.getOrCreateTag().putBoolean("RoadRollerUnlocked", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).RoadRollerUnlocked));
					JojowosMod.LOGGER.info(itemstack.getOrCreateTag().getString("StandSkin"));
				}
			}
		}
		if (itemstack.getItem() == JojowosModItems.THE_FOOL_DISC.get()) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandObtained == false) {
				if ((itemstack.getOrCreateTag().getString("StandSkin")).equals("")) {
					itemstack.getOrCreateTag().putString("StandSkin", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin));
					itemstack.getOrCreateTag().putBoolean("Evolved", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Evolved));
					itemstack.getOrCreateTag().putDouble("CurrentExp", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).CurrentExp));
					itemstack.getOrCreateTag().putDouble("MaxExp", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).MaxExp));
					itemstack.getOrCreateTag().putDouble("Level", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Level));
					itemstack.getOrCreateTag().putDouble("SkillPoints", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SkillPoints));
					itemstack.getOrCreateTag().putDouble("Power", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower));
					itemstack.getOrCreateTag().putDouble("Speed", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSpeed));
					itemstack.getOrCreateTag().putDouble("Range", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandRange));
					itemstack.getOrCreateTag().putDouble("Durability", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandDurability));
					itemstack.getOrCreateTag().putDouble("Precision", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPrecision));
					itemstack.getOrCreateTag().putDouble("Potential", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPotential));
					itemstack.getOrCreateTag().putBoolean("SandDomeUnlocked", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SandDomeUnlocked));
					itemstack.getOrCreateTag().putBoolean("SandGlideUnlocked", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SandGlideUnlocked));
					JojowosMod.LOGGER.info(itemstack.getOrCreateTag().getString("StandSkin"));
				}
			}
		}
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandObtained == true) {
			if ((itemstack.getOrCreateTag().getString("StandSkin")).equals("")) {
				itemstack.getOrCreateTag().putString("StandSkin", "Base");
				itemstack.getOrCreateTag().putBoolean("Evolved", false);
				itemstack.getOrCreateTag().putDouble("CurrentExp", 0);
				itemstack.getOrCreateTag().putDouble("MaxExp", 100);
				itemstack.getOrCreateTag().putDouble("Level", 1);
				itemstack.getOrCreateTag().putDouble("SkillPoints", 0);
				itemstack.getOrCreateTag().putDouble("Power", 0);
				itemstack.getOrCreateTag().putDouble("Speed", 0);
				itemstack.getOrCreateTag().putDouble("Range", 0);
				itemstack.getOrCreateTag().putDouble("Durability", 0);
				itemstack.getOrCreateTag().putDouble("Precision", 0);
				itemstack.getOrCreateTag().putDouble("Potential", 0);
				if (itemstack.getItem() == JojowosModItems.STAR_PLATINUM_DISC.get()) {
					itemstack.getOrCreateTag().putBoolean("StarFingerUnlocked", false);
					itemstack.getOrCreateTag().putBoolean("InhaleUnlocked", false);
					itemstack.getOrCreateTag().putBoolean("BearingShotUnlocked", false);
					itemstack.getOrCreateTag().putBoolean("StarTimeSkipUnlocked", false);
					itemstack.getOrCreateTag().putBoolean("StarTimeStopUnlocked", false);
				}
				if (itemstack.getItem() == JojowosModItems.MAGICIANS_RED_DISC.get()) {
					itemstack.getOrCreateTag().putBoolean("CrossfireSpecialUnlocked", false);
					itemstack.getOrCreateTag().putBoolean("RedBindUnlocked", false);
					itemstack.getOrCreateTag().putBoolean("LifeDetectUnlocked", false);
				}
				if (itemstack.getItem() == JojowosModItems.SILVER_CHARIOT_DISC.get()) {
					itemstack.getOrCreateTag().putBoolean("SwordLaunchUnlocked", false);
					itemstack.getOrCreateTag().putBoolean("ArmorOffUnlocked", false);
					itemstack.getOrCreateTag().putBoolean("BladeCycloneUnlocked", false);
				}
				if (itemstack.getItem() == JojowosModItems.HIEROPHANT_GREEN_DISC.get()) {
					itemstack.getOrCreateTag().putBoolean("GreenGrappleUnlocked", false);
					itemstack.getOrCreateTag().putBoolean("MeterEmeraldUnlocked", false);
					itemstack.getOrCreateTag().putBoolean("BodyControlUnlocked", false);
				}
				if (itemstack.getItem() == JojowosModItems.HERMIT_PURPLE_DISC.get()) {
					itemstack.getOrCreateTag().putBoolean("DivinationUnlocked", false);
					itemstack.getOrCreateTag().putBoolean("TangleUnlocked", false);
				}
				if (itemstack.getItem() == JojowosModItems.THE_WORLD_DISC.get()) {
					itemstack.getOrCreateTag().putDouble("TimeStopLength", 100);
					itemstack.getOrCreateTag().putBoolean("MudaKickUnlocked", false);
					itemstack.getOrCreateTag().putBoolean("KnifeTossUnlocked", false);
					itemstack.getOrCreateTag().putBoolean("WorldTimeSkipUnlocked", false);
					itemstack.getOrCreateTag().putBoolean("WorldTimeStopUnlocked", false);
					itemstack.getOrCreateTag().putBoolean("RoadRollerUnlocked", false);
				}
				if (itemstack.getItem() == JojowosModItems.THE_FOOL_DISC.get()) {
					itemstack.getOrCreateTag().putBoolean("SandDomeUnlocked", false);
					itemstack.getOrCreateTag().putBoolean("SandGlideUnlocked", false);
				}
			}
		}
		if (itemstack.getItem() == JojowosModItems.THE_WORLD_DISC.get()) {
			itemstack.getOrCreateTag().putDouble("MaxPower", (double) SDCConfigFilesConfiguration.THEWORLDSTRENGTH.get());
			itemstack.getOrCreateTag().putDouble("MaxDurability", (double) SDCConfigFilesConfiguration.THEWORLDDURABILITY.get());
			itemstack.getOrCreateTag().putDouble("MaxPrecision", (double) SDCConfigFilesConfiguration.THEWORLDPRECISION.get());
			itemstack.getOrCreateTag().putDouble("MaxPotential", (double) SDCConfigFilesConfiguration.THEWORLDPOTENTIAL.get());
			itemstack.getOrCreateTag().putDouble("MaxSpeed", 100);
			itemstack.getOrCreateTag().putDouble("MaxRange", 60);
		} else if (itemstack.getItem() == JojowosModItems.STAR_PLATINUM_DISC.get()) {
			itemstack.getOrCreateTag().putDouble("TimeStopLength", 0);
			itemstack.getOrCreateTag().putDouble("MaxPower", (double) SDCConfigFilesConfiguration.STARPLATINUMSTRENGTH.get());
			itemstack.getOrCreateTag().putDouble("MaxDurability", (double) SDCConfigFilesConfiguration.STARPLATINUMDURABILITY.get());
			itemstack.getOrCreateTag().putDouble("MaxPrecision", (double) SDCConfigFilesConfiguration.STARPLATINUMPRECISION.get());
			itemstack.getOrCreateTag().putDouble("MaxPotential", (double) SDCConfigFilesConfiguration.STARPLATINUMPOTENTIAL.get());
			itemstack.getOrCreateTag().putDouble("MaxSpeed", 100);
			itemstack.getOrCreateTag().putDouble("MaxRange", 60);
		} else if (itemstack.getItem() == JojowosModItems.HIEROPHANT_GREEN_DISC.get()) {
			itemstack.getOrCreateTag().putDouble("TimeStopLength", 0);
			itemstack.getOrCreateTag().putDouble("MaxPower", (double) SDCConfigFilesConfiguration.HIEROPHANTGREENSTRENGTH.get());
			itemstack.getOrCreateTag().putDouble("MaxDurability", (double) SDCConfigFilesConfiguration.HIEROPHANTGREENDURABILITY.get());
			itemstack.getOrCreateTag().putDouble("MaxPrecision", (double) SDCConfigFilesConfiguration.HIEROPHANTGREENPRECISION.get());
			itemstack.getOrCreateTag().putDouble("MaxPotential", (double) SDCConfigFilesConfiguration.HIEROPHANTGREENPOTENTIAL.get());
			itemstack.getOrCreateTag().putDouble("MaxSpeed", 80);
			itemstack.getOrCreateTag().putDouble("MaxRange", 100);
		} else if (itemstack.getItem() == JojowosModItems.MAGICIANS_RED_DISC.get()) {
			itemstack.getOrCreateTag().putDouble("TimeStopLength", 0);
			itemstack.getOrCreateTag().putDouble("MaxPower", (double) SDCConfigFilesConfiguration.MAGICIANSREDSTRENGTH.get());
			itemstack.getOrCreateTag().putDouble("MaxDurability", (double) SDCConfigFilesConfiguration.MAGICIANSREDDURABILITY.get());
			itemstack.getOrCreateTag().putDouble("MaxPrecision", (double) SDCConfigFilesConfiguration.MAGICIANSREDPRECISION.get());
			itemstack.getOrCreateTag().putDouble("MaxPotential", (double) SDCConfigFilesConfiguration.MAGICIANSREDPOTENTIAL.get());
			itemstack.getOrCreateTag().putDouble("MaxSpeed", 80);
			itemstack.getOrCreateTag().putDouble("MaxRange", 60);
		} else if (itemstack.getItem() == JojowosModItems.SILVER_CHARIOT_DISC.get()) {
			itemstack.getOrCreateTag().putDouble("TimeStopLength", 0);
			itemstack.getOrCreateTag().putDouble("MaxPower", (double) SDCConfigFilesConfiguration.SILVERCHARIOTSTRENGTH.get());
			itemstack.getOrCreateTag().putDouble("MaxDurability", (double) SDCConfigFilesConfiguration.SILVERCHARIOTDURABILITY.get());
			itemstack.getOrCreateTag().putDouble("MaxPrecision", (double) SDCConfigFilesConfiguration.SILVERCHARIOTPRECISION.get());
			itemstack.getOrCreateTag().putDouble("MaxPotential", (double) SDCConfigFilesConfiguration.SILVERCHARIOTPOTENTIAL.get());
			itemstack.getOrCreateTag().putDouble("MaxSpeed", 100);
			itemstack.getOrCreateTag().putDouble("MaxRange", 60);
		} else if (itemstack.getItem() == JojowosModItems.HERMIT_PURPLE_DISC.get()) {
			itemstack.getOrCreateTag().putDouble("TimeStopLength", 0);
			itemstack.getOrCreateTag().putDouble("MaxPower", (double) SDCConfigFilesConfiguration.HERMITPURPLESTRENGTH.get());
			itemstack.getOrCreateTag().putDouble("MaxDurability", (double) SDCConfigFilesConfiguration.HERMITPURPLEDURABILITY.get());
			itemstack.getOrCreateTag().putDouble("MaxPrecision", (double) SDCConfigFilesConfiguration.HERMITPURPLEPRECISION.get());
			itemstack.getOrCreateTag().putDouble("MaxPotential", (double) SDCConfigFilesConfiguration.HERMITPURPLEPOTENTIAL.get());
			itemstack.getOrCreateTag().putDouble("MaxSpeed", 60);
			itemstack.getOrCreateTag().putDouble("MaxRange", 40);
		} else if (itemstack.getItem() == JojowosModItems.THE_FOOL_DISC.get()) {
			itemstack.getOrCreateTag().putDouble("TimeStopLength", 0);
			itemstack.getOrCreateTag().putDouble("MaxPower", (double) SDCConfigFilesConfiguration.THEFOOLSTRENGTH.get());
			itemstack.getOrCreateTag().putDouble("MaxDurability", (double) SDCConfigFilesConfiguration.THEFOOLDURABILITY.get());
			itemstack.getOrCreateTag().putDouble("MaxPrecision", (double) SDCConfigFilesConfiguration.THEFOOLPRECISION.get());
			itemstack.getOrCreateTag().putDouble("MaxPotential", (double) SDCConfigFilesConfiguration.THEFOOLPOTENTIAL.get());
			itemstack.getOrCreateTag().putDouble("MaxSpeed", 60);
			itemstack.getOrCreateTag().putDouble("MaxRange", 40);
		} else {
			itemstack.getOrCreateTag().putDouble("TimeStopLength", 0);
			itemstack.getOrCreateTag().putDouble("MaxPower", 0);
			itemstack.getOrCreateTag().putDouble("MaxDurability", 0);
			itemstack.getOrCreateTag().putDouble("MaxPrecision", 0);
			itemstack.getOrCreateTag().putDouble("MaxPotential", 0);
			itemstack.getOrCreateTag().putDouble("MaxSpeed", 0);
			itemstack.getOrCreateTag().putDouble("MaxRange", 0);
		}
	}
}
