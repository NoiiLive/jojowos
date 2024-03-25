package net.mcreator.jojowos.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.entity.TheWorldSilverEntity;
import net.mcreator.jojowos.entity.TheWorldOVAEntity;
import net.mcreator.jojowos.entity.TheWorldMangaEntity;
import net.mcreator.jojowos.entity.TheWorldImposterEntity;
import net.mcreator.jojowos.entity.TheWorldEntity;
import net.mcreator.jojowos.entity.TheWorldBlackEntity;
import net.mcreator.jojowos.entity.StarPlatinumUltraInstinctEntity;
import net.mcreator.jojowos.entity.StarPlatinumP6Entity;
import net.mcreator.jojowos.entity.StarPlatinumP4Entity;
import net.mcreator.jojowos.entity.StarPlatinumP3Entity;
import net.mcreator.jojowos.entity.StarPlatinumOVAEntity;
import net.mcreator.jojowos.entity.StarPlatinumMangaEntity;
import net.mcreator.jojowos.entity.StarPlatinumGreenEntity;
import net.mcreator.jojowos.entity.StarPlatinumBlueEntity;
import net.mcreator.jojowos.entity.SilverChariotOVAEntity;
import net.mcreator.jojowos.entity.SilverChariotMangaEntity;
import net.mcreator.jojowos.entity.SilverChariotGoldEntity;
import net.mcreator.jojowos.entity.SilverChariotEntity;
import net.mcreator.jojowos.entity.MagiciansRedOVAEntity;
import net.mcreator.jojowos.entity.MagiciansRedMangaEntity;
import net.mcreator.jojowos.entity.MagiciansRedEntity;
import net.mcreator.jojowos.entity.MagiciansRedASBEntity;
import net.mcreator.jojowos.entity.MagiciansGreenEntity;
import net.mcreator.jojowos.entity.HierophantGreenOVAEntity;
import net.mcreator.jojowos.entity.HierophantGreenMangaEntity;
import net.mcreator.jojowos.entity.HierophantGreenEntity;
import net.mcreator.jojowos.entity.HierophantGreenBlueEntity;

import java.util.List;
import java.util.Comparator;

public class StandUnblockingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean gate = false;
		{
			boolean _setval = false;
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.StandBlocking = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = false;
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.StandGuarding = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if ((entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) == true) {
					if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("jojowos:stand_mob"))) == true) {
						if (entityiterator instanceof SilverChariotEntity) {
							((SilverChariotEntity) entityiterator).setAnimation("empty");
						}
						if (entityiterator instanceof SilverChariotGoldEntity) {
							((SilverChariotGoldEntity) entityiterator).setAnimation("empty");
						}
						if (entityiterator instanceof SilverChariotMangaEntity) {
							((SilverChariotMangaEntity) entityiterator).setAnimation("empty");
						}
						if (entityiterator instanceof SilverChariotOVAEntity) {
							((SilverChariotOVAEntity) entityiterator).setAnimation("empty");
						}
						if (entityiterator instanceof HierophantGreenEntity) {
							((HierophantGreenEntity) entityiterator).setAnimation("empty");
						}
						if (entityiterator instanceof HierophantGreenBlueEntity) {
							((HierophantGreenBlueEntity) entityiterator).setAnimation("empty");
						}
						if (entityiterator instanceof HierophantGreenMangaEntity) {
							((HierophantGreenMangaEntity) entityiterator).setAnimation("empty");
						}
						if (entityiterator instanceof HierophantGreenOVAEntity) {
							((HierophantGreenOVAEntity) entityiterator).setAnimation("empty");
						}
						if (entityiterator instanceof StarPlatinumBlueEntity) {
							((StarPlatinumBlueEntity) entityiterator).setAnimation("empty");
						}
						if (entityiterator instanceof StarPlatinumGreenEntity) {
							((StarPlatinumGreenEntity) entityiterator).setAnimation("empty");
						}
						if (entityiterator instanceof StarPlatinumMangaEntity) {
							((StarPlatinumMangaEntity) entityiterator).setAnimation("empty");
						}
						if (entityiterator instanceof StarPlatinumOVAEntity) {
							((StarPlatinumOVAEntity) entityiterator).setAnimation("empty");
						}
						if (entityiterator instanceof StarPlatinumP3Entity) {
							((StarPlatinumP3Entity) entityiterator).setAnimation("empty");
						}
						if (entityiterator instanceof StarPlatinumP4Entity) {
							((StarPlatinumP4Entity) entityiterator).setAnimation("empty");
						}
						if (entityiterator instanceof StarPlatinumP6Entity) {
							((StarPlatinumP6Entity) entityiterator).setAnimation("empty");
						}
						if (entityiterator instanceof StarPlatinumUltraInstinctEntity) {
							((StarPlatinumUltraInstinctEntity) entityiterator).setAnimation("empty");
						}
						if (entityiterator instanceof MagiciansRedEntity) {
							((MagiciansRedEntity) entityiterator).setAnimation("empty");
						}
						if (entityiterator instanceof MagiciansGreenEntity) {
							((MagiciansGreenEntity) entityiterator).setAnimation("empty");
						}
						if (entityiterator instanceof MagiciansRedASBEntity) {
							((MagiciansRedASBEntity) entityiterator).setAnimation("empty");
						}
						if (entityiterator instanceof MagiciansRedMangaEntity) {
							((MagiciansRedMangaEntity) entityiterator).setAnimation("empty");
						}
						if (entityiterator instanceof MagiciansRedOVAEntity) {
							((MagiciansRedOVAEntity) entityiterator).setAnimation("empty");
						}
						if (entityiterator instanceof TheWorldEntity) {
							((TheWorldEntity) entityiterator).setAnimation("empty");
						}
						if (entityiterator instanceof TheWorldBlackEntity) {
							((TheWorldBlackEntity) entityiterator).setAnimation("empty");
						}
						if (entityiterator instanceof TheWorldMangaEntity) {
							((TheWorldMangaEntity) entityiterator).setAnimation("empty");
						}
						if (entityiterator instanceof TheWorldOVAEntity) {
							((TheWorldOVAEntity) entityiterator).setAnimation("empty");
						}
						if (entityiterator instanceof TheWorldSilverEntity) {
							((TheWorldSilverEntity) entityiterator).setAnimation("empty");
						}
						if (entityiterator instanceof TheWorldImposterEntity) {
							((TheWorldImposterEntity) entityiterator).setAnimation("empty");
						}
					}
				}
			}
		}
	}
}
