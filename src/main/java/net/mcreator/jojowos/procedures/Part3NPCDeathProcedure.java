package net.mcreator.jojowos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.jojowos.init.JojowosModItems;
import net.mcreator.jojowos.entity.OldJosephJoestarEntity;
import net.mcreator.jojowos.entity.NoriakiKakyoinEntity;
import net.mcreator.jojowos.entity.MuhammedAvdolEntity;
import net.mcreator.jojowos.entity.JotaroKujoPart3Entity;
import net.mcreator.jojowos.entity.JeanPierrePolnareffEntity;
import net.mcreator.jojowos.entity.IggyEntity;
import net.mcreator.jojowos.entity.DIOAwakenedEntity;
import net.mcreator.jojowos.configuration.ConfigFilesConfiguration;

public class Part3NPCDeathProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (ConfigFilesConfiguration.BOSSARROWS.get() == true) {
			if (Mth.nextInt(RandomSource.create(), 1, 100) <= (double) ConfigFilesConfiguration.STANDARROWCHANCE.get()) {
				if (entity instanceof JotaroKujoPart3Entity || entity instanceof DIOAwakenedEntity) {
					if (Mth.nextInt(RandomSource.create(), 1, 100) <= (double) ConfigFilesConfiguration.SHINYARROWCHANCE.get()) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(JojowosModItems.SHINY_ARROW.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(JojowosModItems.STAND_ARROW.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
		}
		if (ConfigFilesConfiguration.DISCDROPS.get() == true) {
			if (Mth.nextInt(RandomSource.create(), 1, 100) <= (double) ConfigFilesConfiguration.DISCDROPCHANCE.get()) {
				if (entity instanceof JotaroKujoPart3Entity) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(JojowosModItems.STAR_PLATINUM_DISC.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
				if (entity instanceof DIOAwakenedEntity) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(JojowosModItems.THE_WORLD_DISC.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
				if (entity instanceof JeanPierrePolnareffEntity) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(JojowosModItems.SILVER_CHARIOT_DISC.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
				if (entity instanceof NoriakiKakyoinEntity) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(JojowosModItems.HIEROPHANT_GREEN_DISC.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
				if (entity instanceof MuhammedAvdolEntity) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(JojowosModItems.MAGICIANS_RED_DISC.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
				if (entity instanceof OldJosephJoestarEntity) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(JojowosModItems.HERMIT_PURPLE_DISC.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
				if (entity instanceof IggyEntity) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(JojowosModItems.THE_FOOL_DISC.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
		}
	}
}
