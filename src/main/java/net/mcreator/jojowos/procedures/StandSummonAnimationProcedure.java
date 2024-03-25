package net.mcreator.jojowos.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.entity.TheWorldSilverEntity;
import net.mcreator.jojowos.entity.TheWorldOVAEntity;
import net.mcreator.jojowos.entity.TheWorldMangaEntity;
import net.mcreator.jojowos.entity.TheWorldEntity;
import net.mcreator.jojowos.entity.TheWorldBlackEntity;
import net.mcreator.jojowos.entity.TheFoolOVAEntity;
import net.mcreator.jojowos.entity.TheFoolMangaEntity;
import net.mcreator.jojowos.entity.TheFoolEntity;
import net.mcreator.jojowos.entity.StarPlatinumUltraInstinctEntity;
import net.mcreator.jojowos.entity.StarPlatinumP6Entity;
import net.mcreator.jojowos.entity.StarPlatinumP4Entity;
import net.mcreator.jojowos.entity.StarPlatinumP3Entity;
import net.mcreator.jojowos.entity.StarPlatinumOVAEntity;
import net.mcreator.jojowos.entity.StarPlatinumMangaEntity;
import net.mcreator.jojowos.entity.StarPlatinumGreenEntity;
import net.mcreator.jojowos.entity.StarPlatinumBlueEntity;
import net.mcreator.jojowos.entity.SilverChariotOVAArmorlessEntity;
import net.mcreator.jojowos.entity.SilverChariotMangaArmorlessEntity;
import net.mcreator.jojowos.entity.SilverChariotGoldArmorlessEntity;
import net.mcreator.jojowos.entity.SilverChariotArmorlessEntity;
import net.mcreator.jojowos.entity.MagiciansRedOVAEntity;
import net.mcreator.jojowos.entity.MagiciansRedMangaEntity;
import net.mcreator.jojowos.entity.MagiciansRedEntity;
import net.mcreator.jojowos.entity.MagiciansRedASBEntity;
import net.mcreator.jojowos.entity.MagiciansGreenEntity;
import net.mcreator.jojowos.entity.HierophantGreenOVAEntity;
import net.mcreator.jojowos.entity.HierophantGreenMangaEntity;
import net.mcreator.jojowos.entity.HierophantGreenEntity;
import net.mcreator.jojowos.entity.HierophantGreenBlueEntity;

public class StandSummonAnimationProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof MagiciansRedEntity) {
			((MagiciansRedEntity) entity).setAnimation("summon");
		}
		if (entity instanceof MagiciansRedOVAEntity) {
			((MagiciansRedOVAEntity) entity).setAnimation("summon");
		}
		if (entity instanceof MagiciansRedMangaEntity) {
			((MagiciansRedMangaEntity) entity).setAnimation("summon");
		}
		if (entity instanceof MagiciansRedASBEntity) {
			((MagiciansRedASBEntity) entity).setAnimation("summon");
		}
		if (entity instanceof MagiciansGreenEntity) {
			((MagiciansGreenEntity) entity).setAnimation("summon");
		}
		if (entity instanceof TheWorldEntity) {
			((TheWorldEntity) entity).setAnimation("summon");
		}
		if (entity instanceof TheWorldSilverEntity) {
			((TheWorldSilverEntity) entity).setAnimation("summon");
		}
		if (entity instanceof TheWorldBlackEntity) {
			((TheWorldBlackEntity) entity).setAnimation("summon2");
		}
		if (entity instanceof TheWorldMangaEntity) {
			((TheWorldMangaEntity) entity).setAnimation("summon");
		}
		if (entity instanceof TheWorldOVAEntity) {
			((TheWorldOVAEntity) entity).setAnimation("summon2");
		}
		if (entity instanceof TheFoolEntity) {
			((TheFoolEntity) entity).setAnimation("summon");
		}
		if (entity instanceof TheFoolMangaEntity) {
			((TheFoolMangaEntity) entity).setAnimation("summon");
		}
		if (entity instanceof TheFoolOVAEntity) {
			((TheFoolOVAEntity) entity).setAnimation("summon");
		}
		if (entity instanceof HierophantGreenEntity) {
			((HierophantGreenEntity) entity).setAnimation("summon");
		}
		if (entity instanceof HierophantGreenBlueEntity) {
			((HierophantGreenBlueEntity) entity).setAnimation("summon");
		}
		if (entity instanceof HierophantGreenMangaEntity) {
			((HierophantGreenMangaEntity) entity).setAnimation("summon");
		}
		if (entity instanceof HierophantGreenOVAEntity) {
			((HierophantGreenOVAEntity) entity).setAnimation("summon");
		}
		if (entity instanceof SilverChariotArmorlessEntity) {
			((SilverChariotArmorlessEntity) entity).setAnimation("summon");
		}
		if (entity instanceof SilverChariotGoldArmorlessEntity) {
			((SilverChariotGoldArmorlessEntity) entity).setAnimation("summon");
		}
		if (entity instanceof SilverChariotMangaArmorlessEntity) {
			((SilverChariotMangaArmorlessEntity) entity).setAnimation("summon");
		}
		if (entity instanceof SilverChariotOVAArmorlessEntity) {
			((SilverChariotOVAArmorlessEntity) entity).setAnimation("summon");
		}
		if (entity instanceof StarPlatinumBlueEntity) {
			((StarPlatinumBlueEntity) entity).setAnimation("summon");
		}
		if (entity instanceof StarPlatinumGreenEntity) {
			((StarPlatinumGreenEntity) entity).setAnimation("summon");
		}
		if (entity instanceof StarPlatinumMangaEntity) {
			((StarPlatinumMangaEntity) entity).setAnimation("summon");
		}
		if (entity instanceof StarPlatinumOVAEntity) {
			((StarPlatinumOVAEntity) entity).setAnimation("summon");
		}
		if (entity instanceof StarPlatinumP3Entity) {
			((StarPlatinumP3Entity) entity).setAnimation("summon");
		}
		if (entity instanceof StarPlatinumP4Entity) {
			((StarPlatinumP4Entity) entity).setAnimation("summon");
		}
		if (entity instanceof StarPlatinumP6Entity) {
			((StarPlatinumP6Entity) entity).setAnimation("summon");
		}
		if (entity instanceof StarPlatinumUltraInstinctEntity) {
			((StarPlatinumUltraInstinctEntity) entity).setAnimation("summon");
		}
	}
}
