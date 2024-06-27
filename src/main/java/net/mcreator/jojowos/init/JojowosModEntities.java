
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jojowos.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.entity.ThrowingKnifeProjectileEntity;
import net.mcreator.jojowos.entity.TheWorldSilverEntity;
import net.mcreator.jojowos.entity.TheWorldShadowEntity;
import net.mcreator.jojowos.entity.TheWorldOVAEntity;
import net.mcreator.jojowos.entity.TheWorldMangaEntity;
import net.mcreator.jojowos.entity.TheWorldImposterEntity;
import net.mcreator.jojowos.entity.TheWorldEntity;
import net.mcreator.jojowos.entity.TheWorldBlackEntity;
import net.mcreator.jojowos.entity.TheHandEntity;
import net.mcreator.jojowos.entity.TheFoolOVAEntity;
import net.mcreator.jojowos.entity.TheFoolMangaEntity;
import net.mcreator.jojowos.entity.TheFoolEntity;
import net.mcreator.jojowos.entity.TheFoolDisplayOVAEntity;
import net.mcreator.jojowos.entity.TheFoolDisplayMangaEntity;
import net.mcreator.jojowos.entity.TheFoolDisplayBaseEntity;
import net.mcreator.jojowos.entity.StarPlatinumUltraInstinctEntity;
import net.mcreator.jojowos.entity.StarPlatinumP6Entity;
import net.mcreator.jojowos.entity.StarPlatinumP4Entity;
import net.mcreator.jojowos.entity.StarPlatinumP3Entity;
import net.mcreator.jojowos.entity.StarPlatinumOVAEntity;
import net.mcreator.jojowos.entity.StarPlatinumMangaEntity;
import net.mcreator.jojowos.entity.StarPlatinumGreenEntity;
import net.mcreator.jojowos.entity.StarPlatinumBlueEntity;
import net.mcreator.jojowos.entity.SmallCrossfireProjectileEntity;
import net.mcreator.jojowos.entity.SilverChariotOVAEntity;
import net.mcreator.jojowos.entity.SilverChariotOVAArmorlessEntity;
import net.mcreator.jojowos.entity.SilverChariotMangaEntity;
import net.mcreator.jojowos.entity.SilverChariotMangaArmorlessEntity;
import net.mcreator.jojowos.entity.SilverChariotKokushiboEntity;
import net.mcreator.jojowos.entity.SilverChariotKokushiboArmorlessEntity;
import net.mcreator.jojowos.entity.SilverChariotGoldEntity;
import net.mcreator.jojowos.entity.SilverChariotGoldArmorlessEntity;
import net.mcreator.jojowos.entity.SilverChariotEntity;
import net.mcreator.jojowos.entity.SilverChariotArmorlessEntity;
import net.mcreator.jojowos.entity.RoadRollerProjectileEntity;
import net.mcreator.jojowos.entity.PlayerDummyEntity;
import net.mcreator.jojowos.entity.OldJosephJoestarEntity;
import net.mcreator.jojowos.entity.NoriakiKakyoinEntity;
import net.mcreator.jojowos.entity.MuhammedAvdolEntity;
import net.mcreator.jojowos.entity.MagiciansRedRinOkumuraEntity;
import net.mcreator.jojowos.entity.MagiciansRedOVAEntity;
import net.mcreator.jojowos.entity.MagiciansRedMangaEntity;
import net.mcreator.jojowos.entity.MagiciansRedEntity;
import net.mcreator.jojowos.entity.MagiciansRedASBEntity;
import net.mcreator.jojowos.entity.MagiciansGreenEntity;
import net.mcreator.jojowos.entity.LifeDetectorEntity;
import net.mcreator.jojowos.entity.LargeCrossfireProjectileEntity;
import net.mcreator.jojowos.entity.JotaroKujoPart3Entity;
import net.mcreator.jojowos.entity.JeanPierrePolnareffEntity;
import net.mcreator.jojowos.entity.InvisFistProjectileEntity;
import net.mcreator.jojowos.entity.IggySittingEntity;
import net.mcreator.jojowos.entity.IggyEntity;
import net.mcreator.jojowos.entity.HierophantGreenSeroEntity;
import net.mcreator.jojowos.entity.HierophantGreenOVAEntity;
import net.mcreator.jojowos.entity.HierophantGreenMangaEntity;
import net.mcreator.jojowos.entity.HierophantGreenEntity;
import net.mcreator.jojowos.entity.HierophantGreenBlueEntity;
import net.mcreator.jojowos.entity.HermitVenomTangleEntity;
import net.mcreator.jojowos.entity.HermitSpiritTangleEntity;
import net.mcreator.jojowos.entity.HermitRopeTangleEntity;
import net.mcreator.jojowos.entity.HermitRedTangleEntity;
import net.mcreator.jojowos.entity.HermitPurpleTangleEntity;
import net.mcreator.jojowos.entity.HermitPurpleDisplayRedEntity;
import net.mcreator.jojowos.entity.HermitPurpleDisplayPart4Entity;
import net.mcreator.jojowos.entity.HermitPurpleDisplayMangaEntity;
import net.mcreator.jojowos.entity.HermitPurpleDisplayGoldEntity;
import net.mcreator.jojowos.entity.HermitPurpleDisplayBlueEntity;
import net.mcreator.jojowos.entity.HermitPurpleDisplayBaseEntity;
import net.mcreator.jojowos.entity.HermitPart4TangleEntity;
import net.mcreator.jojowos.entity.HermitMangaTangleEntity;
import net.mcreator.jojowos.entity.HermitGoldTangleEntity;
import net.mcreator.jojowos.entity.HermitEnergyTangleEntity;
import net.mcreator.jojowos.entity.HermitBlueTangleEntity;
import net.mcreator.jojowos.entity.HeavensDoorEntity;
import net.mcreator.jojowos.entity.EmeraldSplashItemProjectileEntity;
import net.mcreator.jojowos.entity.EmeraldBarrierEntity;
import net.mcreator.jojowos.entity.DIOEntity;
import net.mcreator.jojowos.entity.DIOCapedEntity;
import net.mcreator.jojowos.entity.DIOAwakenedEntity;
import net.mcreator.jojowos.entity.CrazyDiamondEntity;
import net.mcreator.jojowos.entity.ChariotSwordProjectileEntity;
import net.mcreator.jojowos.entity.ChariotSwordGoldProjectileEntity;
import net.mcreator.jojowos.entity.ChariotDisplayOVAEntity;
import net.mcreator.jojowos.entity.ChariotDisplayMangaEntity;
import net.mcreator.jojowos.entity.ChariotDisplayGoldEntity;
import net.mcreator.jojowos.entity.ChariotDisplayBaseEntity;
import net.mcreator.jojowos.entity.BallBearingProjectileEntity;
import net.mcreator.jojowos.entity.AncientBowProjectileEntity;
import net.mcreator.jojowos.JojowosMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class JojowosModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, JojowosMod.MODID);
	public static final RegistryObject<EntityType<StarPlatinumP3Entity>> STAR_PLATINUM_P_3 = register("star_platinum_p_3", EntityType.Builder.<StarPlatinumP3Entity>of(StarPlatinumP3Entity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StarPlatinumP3Entity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<StarPlatinumP4Entity>> STAR_PLATINUM_P_4 = register("star_platinum_p_4", EntityType.Builder.<StarPlatinumP4Entity>of(StarPlatinumP4Entity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StarPlatinumP4Entity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<StarPlatinumP6Entity>> STAR_PLATINUM_P_6 = register("star_platinum_p_6", EntityType.Builder.<StarPlatinumP6Entity>of(StarPlatinumP6Entity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StarPlatinumP6Entity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<StarPlatinumOVAEntity>> STAR_PLATINUM_OVA = register("star_platinum_ova", EntityType.Builder.<StarPlatinumOVAEntity>of(StarPlatinumOVAEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StarPlatinumOVAEntity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<StarPlatinumMangaEntity>> STAR_PLATINUM_MANGA = register("star_platinum_manga", EntityType.Builder.<StarPlatinumMangaEntity>of(StarPlatinumMangaEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StarPlatinumMangaEntity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<StarPlatinumBlueEntity>> STAR_PLATINUM_BLUE = register("star_platinum_blue", EntityType.Builder.<StarPlatinumBlueEntity>of(StarPlatinumBlueEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StarPlatinumBlueEntity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<StarPlatinumGreenEntity>> STAR_PLATINUM_GREEN = register("star_platinum_green", EntityType.Builder.<StarPlatinumGreenEntity>of(StarPlatinumGreenEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StarPlatinumGreenEntity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<MagiciansRedEntity>> MAGICIANS_RED = register("magicians_red", EntityType.Builder.<MagiciansRedEntity>of(MagiciansRedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MagiciansRedEntity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<MagiciansRedMangaEntity>> MAGICIANS_RED_MANGA = register("magicians_red_manga", EntityType.Builder.<MagiciansRedMangaEntity>of(MagiciansRedMangaEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MagiciansRedMangaEntity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<MagiciansRedOVAEntity>> MAGICIANS_RED_OVA = register("magicians_red_ova", EntityType.Builder.<MagiciansRedOVAEntity>of(MagiciansRedOVAEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MagiciansRedOVAEntity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<MagiciansRedASBEntity>> MAGICIANS_RED_ASB = register("magicians_red_asb", EntityType.Builder.<MagiciansRedASBEntity>of(MagiciansRedASBEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MagiciansRedASBEntity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<HierophantGreenEntity>> HIEROPHANT_GREEN = register("hierophant_green", EntityType.Builder.<HierophantGreenEntity>of(HierophantGreenEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HierophantGreenEntity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<HierophantGreenMangaEntity>> HIEROPHANT_GREEN_MANGA = register("hierophant_green_manga", EntityType.Builder.<HierophantGreenMangaEntity>of(HierophantGreenMangaEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HierophantGreenMangaEntity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<HierophantGreenOVAEntity>> HIEROPHANT_GREEN_OVA = register("hierophant_green_ova", EntityType.Builder.<HierophantGreenOVAEntity>of(HierophantGreenOVAEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HierophantGreenOVAEntity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<HierophantGreenBlueEntity>> HIEROPHANT_GREEN_BLUE = register("hierophant_green_blue", EntityType.Builder.<HierophantGreenBlueEntity>of(HierophantGreenBlueEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HierophantGreenBlueEntity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<SilverChariotEntity>> SILVER_CHARIOT = register("silver_chariot", EntityType.Builder.<SilverChariotEntity>of(SilverChariotEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SilverChariotEntity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<SilverChariotArmorlessEntity>> SILVER_CHARIOT_ARMORLESS = register("silver_chariot_armorless",
			EntityType.Builder.<SilverChariotArmorlessEntity>of(SilverChariotArmorlessEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(SilverChariotArmorlessEntity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<SilverChariotMangaEntity>> SILVER_CHARIOT_MANGA = register("silver_chariot_manga", EntityType.Builder.<SilverChariotMangaEntity>of(SilverChariotMangaEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SilverChariotMangaEntity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<SilverChariotMangaArmorlessEntity>> SILVER_CHARIOT_MANGA_ARMORLESS = register("silver_chariot_manga_armorless",
			EntityType.Builder.<SilverChariotMangaArmorlessEntity>of(SilverChariotMangaArmorlessEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(SilverChariotMangaArmorlessEntity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<SilverChariotGoldEntity>> SILVER_CHARIOT_GOLD = register("silver_chariot_gold", EntityType.Builder.<SilverChariotGoldEntity>of(SilverChariotGoldEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SilverChariotGoldEntity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<SilverChariotGoldArmorlessEntity>> SILVER_CHARIOT_GOLD_ARMORLESS = register("silver_chariot_gold_armorless",
			EntityType.Builder.<SilverChariotGoldArmorlessEntity>of(SilverChariotGoldArmorlessEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(SilverChariotGoldArmorlessEntity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<SilverChariotOVAEntity>> SILVER_CHARIOT_OVA = register("silver_chariot_ova", EntityType.Builder.<SilverChariotOVAEntity>of(SilverChariotOVAEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SilverChariotOVAEntity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<SilverChariotOVAArmorlessEntity>> SILVER_CHARIOT_OVA_ARMORLESS = register("silver_chariot_ova_armorless",
			EntityType.Builder.<SilverChariotOVAArmorlessEntity>of(SilverChariotOVAArmorlessEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(SilverChariotOVAArmorlessEntity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<HermitPurpleTangleEntity>> HERMIT_PURPLE_TANGLE = register("hermit_purple_tangle", EntityType.Builder.<HermitPurpleTangleEntity>of(HermitPurpleTangleEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(1).setUpdateInterval(3).setCustomClientFactory(HermitPurpleTangleEntity::new).fireImmune().sized(0.1f, 1.8f));
	public static final RegistryObject<EntityType<HermitPart4TangleEntity>> HERMIT_PART_4_TANGLE = register("hermit_part_4_tangle", EntityType.Builder.<HermitPart4TangleEntity>of(HermitPart4TangleEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(1).setUpdateInterval(3).setCustomClientFactory(HermitPart4TangleEntity::new).fireImmune().sized(0.1f, 1.8f));
	public static final RegistryObject<EntityType<HermitMangaTangleEntity>> HERMIT_MANGA_TANGLE = register("hermit_manga_tangle", EntityType.Builder.<HermitMangaTangleEntity>of(HermitMangaTangleEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(1).setUpdateInterval(3).setCustomClientFactory(HermitMangaTangleEntity::new).fireImmune().sized(0.1f, 1.8f));
	public static final RegistryObject<EntityType<HermitRedTangleEntity>> HERMIT_RED_TANGLE = register("hermit_red_tangle", EntityType.Builder.<HermitRedTangleEntity>of(HermitRedTangleEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(1).setUpdateInterval(3).setCustomClientFactory(HermitRedTangleEntity::new).fireImmune().sized(0.1f, 1.8f));
	public static final RegistryObject<EntityType<HermitBlueTangleEntity>> HERMIT_BLUE_TANGLE = register("hermit_blue_tangle", EntityType.Builder.<HermitBlueTangleEntity>of(HermitBlueTangleEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(1).setUpdateInterval(3).setCustomClientFactory(HermitBlueTangleEntity::new).fireImmune().sized(0.1f, 1.8f));
	public static final RegistryObject<EntityType<HermitGoldTangleEntity>> HERMIT_GOLD_TANGLE = register("hermit_gold_tangle", EntityType.Builder.<HermitGoldTangleEntity>of(HermitGoldTangleEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(1).setUpdateInterval(3).setCustomClientFactory(HermitGoldTangleEntity::new).fireImmune().sized(0.1f, 1.8f));
	public static final RegistryObject<EntityType<MagiciansGreenEntity>> MAGICIANS_GREEN = register("magicians_green", EntityType.Builder.<MagiciansGreenEntity>of(MagiciansGreenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MagiciansGreenEntity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<TheWorldEntity>> THE_WORLD = register("the_world",
			EntityType.Builder.<TheWorldEntity>of(TheWorldEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TheWorldEntity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<TheWorldSilverEntity>> THE_WORLD_SILVER = register("the_world_silver", EntityType.Builder.<TheWorldSilverEntity>of(TheWorldSilverEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TheWorldSilverEntity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<TheWorldMangaEntity>> THE_WORLD_MANGA = register("the_world_manga", EntityType.Builder.<TheWorldMangaEntity>of(TheWorldMangaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TheWorldMangaEntity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<TheWorldOVAEntity>> THE_WORLD_OVA = register("the_world_ova", EntityType.Builder.<TheWorldOVAEntity>of(TheWorldOVAEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TheWorldOVAEntity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<TheWorldBlackEntity>> THE_WORLD_BLACK = register("the_world_black", EntityType.Builder.<TheWorldBlackEntity>of(TheWorldBlackEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TheWorldBlackEntity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<TheFoolEntity>> THE_FOOL = register("the_fool",
			EntityType.Builder.<TheFoolEntity>of(TheFoolEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TheFoolEntity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<TheFoolOVAEntity>> THE_FOOL_OVA = register("the_fool_ova", EntityType.Builder.<TheFoolOVAEntity>of(TheFoolOVAEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TheFoolOVAEntity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<TheFoolMangaEntity>> THE_FOOL_MANGA = register("the_fool_manga", EntityType.Builder.<TheFoolMangaEntity>of(TheFoolMangaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TheFoolMangaEntity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<PlayerDummyEntity>> PLAYER_DUMMY = register("player_dummy",
			EntityType.Builder.<PlayerDummyEntity>of(PlayerDummyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PlayerDummyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LifeDetectorEntity>> LIFE_DETECTOR = register("life_detector", EntityType.Builder.<LifeDetectorEntity>of(LifeDetectorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LifeDetectorEntity::new).fireImmune().sized(0.6f, 1f));
	public static final RegistryObject<EntityType<JotaroKujoPart3Entity>> JOTARO_KUJO_PART_3 = register("jotaro_kujo_part_3",
			EntityType.Builder.<JotaroKujoPart3Entity>of(JotaroKujoPart3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(JotaroKujoPart3Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DIOEntity>> DIO = register("dio",
			EntityType.Builder.<DIOEntity>of(DIOEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(DIOEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DIOCapedEntity>> DIO_CAPED = register("dio_caped",
			EntityType.Builder.<DIOCapedEntity>of(DIOCapedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(DIOCapedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DIOAwakenedEntity>> DIO_AWAKENED = register("dio_awakened",
			EntityType.Builder.<DIOAwakenedEntity>of(DIOAwakenedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(DIOAwakenedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<IggyEntity>> IGGY = register("iggy",
			EntityType.Builder.<IggyEntity>of(IggyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(IggyEntity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<OldJosephJoestarEntity>> OLD_JOSEPH_JOESTAR = register("old_joseph_joestar",
			EntityType.Builder.<OldJosephJoestarEntity>of(OldJosephJoestarEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(OldJosephJoestarEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<JeanPierrePolnareffEntity>> JEAN_PIERRE_POLNAREFF = register("jean_pierre_polnareff",
			EntityType.Builder.<JeanPierrePolnareffEntity>of(JeanPierrePolnareffEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(JeanPierrePolnareffEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NoriakiKakyoinEntity>> NORIAKI_KAKYOIN = register("noriaki_kakyoin",
			EntityType.Builder.<NoriakiKakyoinEntity>of(NoriakiKakyoinEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(NoriakiKakyoinEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MuhammedAvdolEntity>> MUHAMMED_AVDOL = register("muhammed_avdol", EntityType.Builder.<MuhammedAvdolEntity>of(MuhammedAvdolEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(MuhammedAvdolEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<IggySittingEntity>> IGGY_SITTING = register("iggy_sitting",
			EntityType.Builder.<IggySittingEntity>of(IggySittingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(IggySittingEntity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<EmeraldSplashItemProjectileEntity>> EMERALD_SPLASH_ITEM_PROJECTILE = register("emerald_splash_item_projectile",
			EntityType.Builder.<EmeraldSplashItemProjectileEntity>of(EmeraldSplashItemProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(EmeraldSplashItemProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<InvisFistProjectileEntity>> INVIS_FIST_PROJECTILE = register("invis_fist_projectile", EntityType.Builder.<InvisFistProjectileEntity>of(InvisFistProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(InvisFistProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ThrowingKnifeProjectileEntity>> THROWING_KNIFE_PROJECTILE = register("throwing_knife_projectile",
			EntityType.Builder.<ThrowingKnifeProjectileEntity>of(ThrowingKnifeProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(ThrowingKnifeProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BallBearingProjectileEntity>> BALL_BEARING_PROJECTILE = register("ball_bearing_projectile", EntityType.Builder.<BallBearingProjectileEntity>of(BallBearingProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(BallBearingProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ChariotSwordProjectileEntity>> CHARIOT_SWORD_PROJECTILE = register("chariot_sword_projectile", EntityType.Builder.<ChariotSwordProjectileEntity>of(ChariotSwordProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(ChariotSwordProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ChariotSwordGoldProjectileEntity>> CHARIOT_SWORD_GOLD_PROJECTILE = register("chariot_sword_gold_projectile",
			EntityType.Builder.<ChariotSwordGoldProjectileEntity>of(ChariotSwordGoldProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(ChariotSwordGoldProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LargeCrossfireProjectileEntity>> LARGE_CROSSFIRE_PROJECTILE = register("large_crossfire_projectile",
			EntityType.Builder.<LargeCrossfireProjectileEntity>of(LargeCrossfireProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(LargeCrossfireProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SmallCrossfireProjectileEntity>> SMALL_CROSSFIRE_PROJECTILE = register("small_crossfire_projectile",
			EntityType.Builder.<SmallCrossfireProjectileEntity>of(SmallCrossfireProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(SmallCrossfireProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RoadRollerProjectileEntity>> ROAD_ROLLER_PROJECTILE = register("road_roller_projectile", EntityType.Builder.<RoadRollerProjectileEntity>of(RoadRollerProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(RoadRollerProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AncientBowProjectileEntity>> ANCIENT_BOW_PROJECTILE = register("ancient_bow_projectile", EntityType.Builder.<AncientBowProjectileEntity>of(AncientBowProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(AncientBowProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ChariotDisplayBaseEntity>> CHARIOT_DISPLAY_BASE = register("chariot_display_base",
			EntityType.Builder.<ChariotDisplayBaseEntity>of(ChariotDisplayBaseEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ChariotDisplayBaseEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ChariotDisplayMangaEntity>> CHARIOT_DISPLAY_MANGA = register("chariot_display_manga",
			EntityType.Builder.<ChariotDisplayMangaEntity>of(ChariotDisplayMangaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ChariotDisplayMangaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ChariotDisplayOVAEntity>> CHARIOT_DISPLAY_OVA = register("chariot_display_ova",
			EntityType.Builder.<ChariotDisplayOVAEntity>of(ChariotDisplayOVAEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ChariotDisplayOVAEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ChariotDisplayGoldEntity>> CHARIOT_DISPLAY_GOLD = register("chariot_display_gold",
			EntityType.Builder.<ChariotDisplayGoldEntity>of(ChariotDisplayGoldEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ChariotDisplayGoldEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HermitPurpleDisplayBaseEntity>> HERMIT_PURPLE_DISPLAY_BASE = register("hermit_purple_display_base",
			EntityType.Builder.<HermitPurpleDisplayBaseEntity>of(HermitPurpleDisplayBaseEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(HermitPurpleDisplayBaseEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HermitPurpleDisplayPart4Entity>> HERMIT_PURPLE_DISPLAY_PART_4 = register("hermit_purple_display_part_4",
			EntityType.Builder.<HermitPurpleDisplayPart4Entity>of(HermitPurpleDisplayPart4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(HermitPurpleDisplayPart4Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HermitPurpleDisplayMangaEntity>> HERMIT_PURPLE_DISPLAY_MANGA = register("hermit_purple_display_manga",
			EntityType.Builder.<HermitPurpleDisplayMangaEntity>of(HermitPurpleDisplayMangaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(HermitPurpleDisplayMangaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HermitPurpleDisplayRedEntity>> HERMIT_PURPLE_DISPLAY_RED = register("hermit_purple_display_red",
			EntityType.Builder.<HermitPurpleDisplayRedEntity>of(HermitPurpleDisplayRedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(HermitPurpleDisplayRedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HermitPurpleDisplayBlueEntity>> HERMIT_PURPLE_DISPLAY_BLUE = register("hermit_purple_display_blue",
			EntityType.Builder.<HermitPurpleDisplayBlueEntity>of(HermitPurpleDisplayBlueEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(HermitPurpleDisplayBlueEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HermitPurpleDisplayGoldEntity>> HERMIT_PURPLE_DISPLAY_GOLD = register("hermit_purple_display_gold",
			EntityType.Builder.<HermitPurpleDisplayGoldEntity>of(HermitPurpleDisplayGoldEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(HermitPurpleDisplayGoldEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TheFoolDisplayBaseEntity>> THE_FOOL_DISPLAY_BASE = register("the_fool_display_base",
			EntityType.Builder.<TheFoolDisplayBaseEntity>of(TheFoolDisplayBaseEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TheFoolDisplayBaseEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TheFoolDisplayMangaEntity>> THE_FOOL_DISPLAY_MANGA = register("the_fool_display_manga",
			EntityType.Builder.<TheFoolDisplayMangaEntity>of(TheFoolDisplayMangaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TheFoolDisplayMangaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TheFoolDisplayOVAEntity>> THE_FOOL_DISPLAY_OVA = register("the_fool_display_ova",
			EntityType.Builder.<TheFoolDisplayOVAEntity>of(TheFoolDisplayOVAEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TheFoolDisplayOVAEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StarPlatinumUltraInstinctEntity>> STAR_PLATINUM_ULTRA_INSTINCT = register("star_platinum_ultra_instinct",
			EntityType.Builder.<StarPlatinumUltraInstinctEntity>of(StarPlatinumUltraInstinctEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(StarPlatinumUltraInstinctEntity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<TheWorldImposterEntity>> THE_WORLD_IMPOSTER = register("the_world_imposter", EntityType.Builder.<TheWorldImposterEntity>of(TheWorldImposterEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TheWorldImposterEntity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<EmeraldBarrierEntity>> EMERALD_BARRIER = register("emerald_barrier", EntityType.Builder.<EmeraldBarrierEntity>of(EmeraldBarrierEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EmeraldBarrierEntity::new).fireImmune().sized(0.1f, 0.1f));
	public static final RegistryObject<EntityType<HermitRopeTangleEntity>> HERMIT_ROPE_TANGLE = register("hermit_rope_tangle", EntityType.Builder.<HermitRopeTangleEntity>of(HermitRopeTangleEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(1).setUpdateInterval(3).setCustomClientFactory(HermitRopeTangleEntity::new).fireImmune().sized(0.1f, 1.8f));
	public static final RegistryObject<EntityType<CrazyDiamondEntity>> CRAZY_DIAMOND = register("crazy_diamond", EntityType.Builder.<CrazyDiamondEntity>of(CrazyDiamondEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CrazyDiamondEntity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<TheHandEntity>> THE_HAND = register("the_hand",
			EntityType.Builder.<TheHandEntity>of(TheHandEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TheHandEntity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<HeavensDoorEntity>> HEAVENS_DOOR = register("heavens_door", EntityType.Builder.<HeavensDoorEntity>of(HeavensDoorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HeavensDoorEntity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<TheWorldShadowEntity>> THE_WORLD_SHADOW = register("the_world_shadow", EntityType.Builder.<TheWorldShadowEntity>of(TheWorldShadowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TheWorldShadowEntity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<HermitSpiritTangleEntity>> HERMIT_SPIRIT_TANGLE = register("hermit_spirit_tangle", EntityType.Builder.<HermitSpiritTangleEntity>of(HermitSpiritTangleEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(1).setUpdateInterval(3).setCustomClientFactory(HermitSpiritTangleEntity::new).fireImmune().sized(0.1f, 1.8f));
	public static final RegistryObject<EntityType<HermitEnergyTangleEntity>> HERMIT_ENERGY_TANGLE = register("hermit_energy_tangle", EntityType.Builder.<HermitEnergyTangleEntity>of(HermitEnergyTangleEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(1).setUpdateInterval(3).setCustomClientFactory(HermitEnergyTangleEntity::new).fireImmune().sized(0.1f, 1.8f));
	public static final RegistryObject<EntityType<HermitVenomTangleEntity>> HERMIT_VENOM_TANGLE = register("hermit_venom_tangle", EntityType.Builder.<HermitVenomTangleEntity>of(HermitVenomTangleEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(1).setUpdateInterval(3).setCustomClientFactory(HermitVenomTangleEntity::new).fireImmune().sized(0.1f, 1.8f));
	public static final RegistryObject<EntityType<SilverChariotKokushiboEntity>> SILVER_CHARIOT_KOKUSHIBO = register("silver_chariot_kokushibo",
			EntityType.Builder.<SilverChariotKokushiboEntity>of(SilverChariotKokushiboEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(SilverChariotKokushiboEntity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<SilverChariotKokushiboArmorlessEntity>> SILVER_CHARIOT_KOKUSHIBO_ARMORLESS = register("silver_chariot_kokushibo_armorless",
			EntityType.Builder.<SilverChariotKokushiboArmorlessEntity>of(SilverChariotKokushiboArmorlessEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(SilverChariotKokushiboArmorlessEntity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<MagiciansRedRinOkumuraEntity>> MAGICIANS_RED_RIN_OKUMURA = register("magicians_red_rin_okumura",
			EntityType.Builder.<MagiciansRedRinOkumuraEntity>of(MagiciansRedRinOkumuraEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(MagiciansRedRinOkumuraEntity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<HierophantGreenSeroEntity>> HIEROPHANT_GREEN_SERO = register("hierophant_green_sero", EntityType.Builder.<HierophantGreenSeroEntity>of(HierophantGreenSeroEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HierophantGreenSeroEntity::new).fireImmune().sized(0.5f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			StarPlatinumP3Entity.init();
			StarPlatinumP4Entity.init();
			StarPlatinumP6Entity.init();
			StarPlatinumOVAEntity.init();
			StarPlatinumMangaEntity.init();
			StarPlatinumBlueEntity.init();
			StarPlatinumGreenEntity.init();
			MagiciansRedEntity.init();
			MagiciansRedMangaEntity.init();
			MagiciansRedOVAEntity.init();
			MagiciansRedASBEntity.init();
			HierophantGreenEntity.init();
			HierophantGreenMangaEntity.init();
			HierophantGreenOVAEntity.init();
			HierophantGreenBlueEntity.init();
			SilverChariotEntity.init();
			SilverChariotArmorlessEntity.init();
			SilverChariotMangaEntity.init();
			SilverChariotMangaArmorlessEntity.init();
			SilverChariotGoldEntity.init();
			SilverChariotGoldArmorlessEntity.init();
			SilverChariotOVAEntity.init();
			SilverChariotOVAArmorlessEntity.init();
			HermitPurpleTangleEntity.init();
			HermitPart4TangleEntity.init();
			HermitMangaTangleEntity.init();
			HermitRedTangleEntity.init();
			HermitBlueTangleEntity.init();
			HermitGoldTangleEntity.init();
			MagiciansGreenEntity.init();
			TheWorldEntity.init();
			TheWorldSilverEntity.init();
			TheWorldMangaEntity.init();
			TheWorldOVAEntity.init();
			TheWorldBlackEntity.init();
			TheFoolEntity.init();
			TheFoolOVAEntity.init();
			TheFoolMangaEntity.init();
			PlayerDummyEntity.init();
			LifeDetectorEntity.init();
			JotaroKujoPart3Entity.init();
			DIOEntity.init();
			DIOCapedEntity.init();
			DIOAwakenedEntity.init();
			IggyEntity.init();
			OldJosephJoestarEntity.init();
			JeanPierrePolnareffEntity.init();
			NoriakiKakyoinEntity.init();
			MuhammedAvdolEntity.init();
			IggySittingEntity.init();
			ChariotDisplayBaseEntity.init();
			ChariotDisplayMangaEntity.init();
			ChariotDisplayOVAEntity.init();
			ChariotDisplayGoldEntity.init();
			HermitPurpleDisplayBaseEntity.init();
			HermitPurpleDisplayPart4Entity.init();
			HermitPurpleDisplayMangaEntity.init();
			HermitPurpleDisplayRedEntity.init();
			HermitPurpleDisplayBlueEntity.init();
			HermitPurpleDisplayGoldEntity.init();
			TheFoolDisplayBaseEntity.init();
			TheFoolDisplayMangaEntity.init();
			TheFoolDisplayOVAEntity.init();
			StarPlatinumUltraInstinctEntity.init();
			TheWorldImposterEntity.init();
			EmeraldBarrierEntity.init();
			HermitRopeTangleEntity.init();
			CrazyDiamondEntity.init();
			TheHandEntity.init();
			HeavensDoorEntity.init();
			TheWorldShadowEntity.init();
			HermitSpiritTangleEntity.init();
			HermitEnergyTangleEntity.init();
			HermitVenomTangleEntity.init();
			SilverChariotKokushiboEntity.init();
			SilverChariotKokushiboArmorlessEntity.init();
			MagiciansRedRinOkumuraEntity.init();
			HierophantGreenSeroEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(STAR_PLATINUM_P_3.get(), StarPlatinumP3Entity.createAttributes().build());
		event.put(STAR_PLATINUM_P_4.get(), StarPlatinumP4Entity.createAttributes().build());
		event.put(STAR_PLATINUM_P_6.get(), StarPlatinumP6Entity.createAttributes().build());
		event.put(STAR_PLATINUM_OVA.get(), StarPlatinumOVAEntity.createAttributes().build());
		event.put(STAR_PLATINUM_MANGA.get(), StarPlatinumMangaEntity.createAttributes().build());
		event.put(STAR_PLATINUM_BLUE.get(), StarPlatinumBlueEntity.createAttributes().build());
		event.put(STAR_PLATINUM_GREEN.get(), StarPlatinumGreenEntity.createAttributes().build());
		event.put(MAGICIANS_RED.get(), MagiciansRedEntity.createAttributes().build());
		event.put(MAGICIANS_RED_MANGA.get(), MagiciansRedMangaEntity.createAttributes().build());
		event.put(MAGICIANS_RED_OVA.get(), MagiciansRedOVAEntity.createAttributes().build());
		event.put(MAGICIANS_RED_ASB.get(), MagiciansRedASBEntity.createAttributes().build());
		event.put(HIEROPHANT_GREEN.get(), HierophantGreenEntity.createAttributes().build());
		event.put(HIEROPHANT_GREEN_MANGA.get(), HierophantGreenMangaEntity.createAttributes().build());
		event.put(HIEROPHANT_GREEN_OVA.get(), HierophantGreenOVAEntity.createAttributes().build());
		event.put(HIEROPHANT_GREEN_BLUE.get(), HierophantGreenBlueEntity.createAttributes().build());
		event.put(SILVER_CHARIOT.get(), SilverChariotEntity.createAttributes().build());
		event.put(SILVER_CHARIOT_ARMORLESS.get(), SilverChariotArmorlessEntity.createAttributes().build());
		event.put(SILVER_CHARIOT_MANGA.get(), SilverChariotMangaEntity.createAttributes().build());
		event.put(SILVER_CHARIOT_MANGA_ARMORLESS.get(), SilverChariotMangaArmorlessEntity.createAttributes().build());
		event.put(SILVER_CHARIOT_GOLD.get(), SilverChariotGoldEntity.createAttributes().build());
		event.put(SILVER_CHARIOT_GOLD_ARMORLESS.get(), SilverChariotGoldArmorlessEntity.createAttributes().build());
		event.put(SILVER_CHARIOT_OVA.get(), SilverChariotOVAEntity.createAttributes().build());
		event.put(SILVER_CHARIOT_OVA_ARMORLESS.get(), SilverChariotOVAArmorlessEntity.createAttributes().build());
		event.put(HERMIT_PURPLE_TANGLE.get(), HermitPurpleTangleEntity.createAttributes().build());
		event.put(HERMIT_PART_4_TANGLE.get(), HermitPart4TangleEntity.createAttributes().build());
		event.put(HERMIT_MANGA_TANGLE.get(), HermitMangaTangleEntity.createAttributes().build());
		event.put(HERMIT_RED_TANGLE.get(), HermitRedTangleEntity.createAttributes().build());
		event.put(HERMIT_BLUE_TANGLE.get(), HermitBlueTangleEntity.createAttributes().build());
		event.put(HERMIT_GOLD_TANGLE.get(), HermitGoldTangleEntity.createAttributes().build());
		event.put(MAGICIANS_GREEN.get(), MagiciansGreenEntity.createAttributes().build());
		event.put(THE_WORLD.get(), TheWorldEntity.createAttributes().build());
		event.put(THE_WORLD_SILVER.get(), TheWorldSilverEntity.createAttributes().build());
		event.put(THE_WORLD_MANGA.get(), TheWorldMangaEntity.createAttributes().build());
		event.put(THE_WORLD_OVA.get(), TheWorldOVAEntity.createAttributes().build());
		event.put(THE_WORLD_BLACK.get(), TheWorldBlackEntity.createAttributes().build());
		event.put(THE_FOOL.get(), TheFoolEntity.createAttributes().build());
		event.put(THE_FOOL_OVA.get(), TheFoolOVAEntity.createAttributes().build());
		event.put(THE_FOOL_MANGA.get(), TheFoolMangaEntity.createAttributes().build());
		event.put(PLAYER_DUMMY.get(), PlayerDummyEntity.createAttributes().build());
		event.put(LIFE_DETECTOR.get(), LifeDetectorEntity.createAttributes().build());
		event.put(JOTARO_KUJO_PART_3.get(), JotaroKujoPart3Entity.createAttributes().build());
		event.put(DIO.get(), DIOEntity.createAttributes().build());
		event.put(DIO_CAPED.get(), DIOCapedEntity.createAttributes().build());
		event.put(DIO_AWAKENED.get(), DIOAwakenedEntity.createAttributes().build());
		event.put(IGGY.get(), IggyEntity.createAttributes().build());
		event.put(OLD_JOSEPH_JOESTAR.get(), OldJosephJoestarEntity.createAttributes().build());
		event.put(JEAN_PIERRE_POLNAREFF.get(), JeanPierrePolnareffEntity.createAttributes().build());
		event.put(NORIAKI_KAKYOIN.get(), NoriakiKakyoinEntity.createAttributes().build());
		event.put(MUHAMMED_AVDOL.get(), MuhammedAvdolEntity.createAttributes().build());
		event.put(IGGY_SITTING.get(), IggySittingEntity.createAttributes().build());
		event.put(CHARIOT_DISPLAY_BASE.get(), ChariotDisplayBaseEntity.createAttributes().build());
		event.put(CHARIOT_DISPLAY_MANGA.get(), ChariotDisplayMangaEntity.createAttributes().build());
		event.put(CHARIOT_DISPLAY_OVA.get(), ChariotDisplayOVAEntity.createAttributes().build());
		event.put(CHARIOT_DISPLAY_GOLD.get(), ChariotDisplayGoldEntity.createAttributes().build());
		event.put(HERMIT_PURPLE_DISPLAY_BASE.get(), HermitPurpleDisplayBaseEntity.createAttributes().build());
		event.put(HERMIT_PURPLE_DISPLAY_PART_4.get(), HermitPurpleDisplayPart4Entity.createAttributes().build());
		event.put(HERMIT_PURPLE_DISPLAY_MANGA.get(), HermitPurpleDisplayMangaEntity.createAttributes().build());
		event.put(HERMIT_PURPLE_DISPLAY_RED.get(), HermitPurpleDisplayRedEntity.createAttributes().build());
		event.put(HERMIT_PURPLE_DISPLAY_BLUE.get(), HermitPurpleDisplayBlueEntity.createAttributes().build());
		event.put(HERMIT_PURPLE_DISPLAY_GOLD.get(), HermitPurpleDisplayGoldEntity.createAttributes().build());
		event.put(THE_FOOL_DISPLAY_BASE.get(), TheFoolDisplayBaseEntity.createAttributes().build());
		event.put(THE_FOOL_DISPLAY_MANGA.get(), TheFoolDisplayMangaEntity.createAttributes().build());
		event.put(THE_FOOL_DISPLAY_OVA.get(), TheFoolDisplayOVAEntity.createAttributes().build());
		event.put(STAR_PLATINUM_ULTRA_INSTINCT.get(), StarPlatinumUltraInstinctEntity.createAttributes().build());
		event.put(THE_WORLD_IMPOSTER.get(), TheWorldImposterEntity.createAttributes().build());
		event.put(EMERALD_BARRIER.get(), EmeraldBarrierEntity.createAttributes().build());
		event.put(HERMIT_ROPE_TANGLE.get(), HermitRopeTangleEntity.createAttributes().build());
		event.put(CRAZY_DIAMOND.get(), CrazyDiamondEntity.createAttributes().build());
		event.put(THE_HAND.get(), TheHandEntity.createAttributes().build());
		event.put(HEAVENS_DOOR.get(), HeavensDoorEntity.createAttributes().build());
		event.put(THE_WORLD_SHADOW.get(), TheWorldShadowEntity.createAttributes().build());
		event.put(HERMIT_SPIRIT_TANGLE.get(), HermitSpiritTangleEntity.createAttributes().build());
		event.put(HERMIT_ENERGY_TANGLE.get(), HermitEnergyTangleEntity.createAttributes().build());
		event.put(HERMIT_VENOM_TANGLE.get(), HermitVenomTangleEntity.createAttributes().build());
		event.put(SILVER_CHARIOT_KOKUSHIBO.get(), SilverChariotKokushiboEntity.createAttributes().build());
		event.put(SILVER_CHARIOT_KOKUSHIBO_ARMORLESS.get(), SilverChariotKokushiboArmorlessEntity.createAttributes().build());
		event.put(MAGICIANS_RED_RIN_OKUMURA.get(), MagiciansRedRinOkumuraEntity.createAttributes().build());
		event.put(HIEROPHANT_GREEN_SERO.get(), HierophantGreenSeroEntity.createAttributes().build());
	}
}
