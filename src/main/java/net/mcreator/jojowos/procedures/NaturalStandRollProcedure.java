package net.mcreator.jojowos.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.configuration.ConfigFilesConfiguration;
import net.mcreator.jojowos.JojowosMod;

public class NaturalStandRollProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		String obtainablestands = "";
		double random_number = 0;
		double totalstands = 0;
		random_number = Mth.nextInt(RandomSource.create(), 1, 7);
		if (ConfigFilesConfiguration.SINGLEPLAYERSTAND.get() == true) {
			totalstands = 0;
			if (JojowosModVariables.MapVariables.get(world).StarPlatinumObtained == false) {
				obtainablestands = obtainablestands + "StarPlatinum,";
				totalstands = totalstands + 1;
			}
			if (JojowosModVariables.MapVariables.get(world).HierophantGreenObtained == false) {
				obtainablestands = obtainablestands + "HierophantGreen,";
				totalstands = totalstands + 1;
			}
			if (JojowosModVariables.MapVariables.get(world).MagiciansRedObtained == false) {
				obtainablestands = obtainablestands + "MagiciansRed,";
				totalstands = totalstands + 1;
			}
			if (JojowosModVariables.MapVariables.get(world).SilverChariotObtained == false) {
				obtainablestands = obtainablestands + "SilverChariot,";
				totalstands = totalstands + 1;
			}
			if (JojowosModVariables.MapVariables.get(world).HermitPurpleObtained == false) {
				obtainablestands = obtainablestands + "HermitPurple,";
				totalstands = totalstands + 1;
			}
			if (JojowosModVariables.MapVariables.get(world).TheWorldObtained == false) {
				obtainablestands = obtainablestands + "TheWorld,";
				totalstands = totalstands + 1;
			}
			if (JojowosModVariables.MapVariables.get(world).TheFoolObtained == false) {
				obtainablestands = obtainablestands + "TheFool,";
				totalstands = totalstands + 1;
			}
			JojowosMod.LOGGER.info(obtainablestands);
			if (totalstands == 0) {
				entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 100);
			} else {
				obtainablestands = new Object() {
					private String split(String text, String space, int index) {
						String s = text.split(space)[index];
						return s;
					}
				}.split(obtainablestands, ",", (int) (Mth.nextDouble(RandomSource.create(), 0, totalstands - 1)));
				JojowosMod.LOGGER.info(obtainablestands);
				if (obtainablestands.contains("StarPlatinum")) {
					JojowosModVariables.MapVariables.get(world).StarPlatinumObtained = true;
					JojowosModVariables.MapVariables.get(world).syncData(world);
					JojowosModVariables.MapVariables.get(world).StarPlatinumUser = entity.getDisplayName().getString();
					JojowosModVariables.MapVariables.get(world).syncData(world);
					JojowosMod.LOGGER.info("Star Platinum No Longer Obtainable");
					{
						boolean _setval = true;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandObtained = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:star_platinum_achievement"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
					{
						String _setval = "StarPlatinum";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Stand = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					ApplyStatsStarPlatinumProcedure.execute(entity);
					Part3SkinRerollProcedure.execute(world, entity);
				}
				if (obtainablestands.contains("HierophantGreen")) {
					JojowosModVariables.MapVariables.get(world).HierophantGreenObtained = true;
					JojowosModVariables.MapVariables.get(world).syncData(world);
					JojowosModVariables.MapVariables.get(world).HierophantGreenUser = entity.getDisplayName().getString();
					JojowosModVariables.MapVariables.get(world).syncData(world);
					JojowosMod.LOGGER.info("Hierophant Green No Longer Obtainable");
					{
						boolean _setval = true;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandObtained = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:hierophant_green_achievement"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
					{
						String _setval = "HierophantGreen";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Stand = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					ApplyStatsHierophantGreenProcedure.execute(entity);
					Part3SkinRerollProcedure.execute(world, entity);
				}
				if (obtainablestands.contains("MagiciansRed")) {
					JojowosModVariables.MapVariables.get(world).MagiciansRedObtained = true;
					JojowosModVariables.MapVariables.get(world).syncData(world);
					JojowosModVariables.MapVariables.get(world).MagiciansRedUser = entity.getDisplayName().getString();
					JojowosModVariables.MapVariables.get(world).syncData(world);
					JojowosMod.LOGGER.info("Magician's Red No Longer Obtainable");
					{
						boolean _setval = true;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandObtained = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:magicians_red_achievement"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
					{
						String _setval = "MagiciansRed";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Stand = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					ApplyStatsMagiciansRedProcedure.execute(entity);
					Part3SkinRerollProcedure.execute(world, entity);
				}
				if (obtainablestands.contains("SilverChariot")) {
					JojowosModVariables.MapVariables.get(world).SilverChariotObtained = true;
					JojowosModVariables.MapVariables.get(world).syncData(world);
					JojowosModVariables.MapVariables.get(world).SilverChariotUser = entity.getDisplayName().getString();
					JojowosModVariables.MapVariables.get(world).syncData(world);
					JojowosMod.LOGGER.info("Silver Chariot No Longer Obtainable");
					{
						boolean _setval = true;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandObtained = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:silver_chariot_achievement"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
					{
						String _setval = "SilverChariot";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Stand = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					ApplyStatsSilverChariotProcedure.execute(entity);
					Part3SkinRerollProcedure.execute(world, entity);
				}
				if (obtainablestands.contains("HermitPurple")) {
					JojowosModVariables.MapVariables.get(world).HermitPurpleObtained = true;
					JojowosModVariables.MapVariables.get(world).syncData(world);
					JojowosModVariables.MapVariables.get(world).HermitPurpleUser = entity.getDisplayName().getString();
					JojowosModVariables.MapVariables.get(world).syncData(world);
					JojowosMod.LOGGER.info("Hermit Purple No Longer Obtainable");
					{
						boolean _setval = true;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandObtained = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:hermit_purple_achievement"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
					{
						String _setval = "HermitPurple";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Stand = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					ApplyStatsHermitPurpleProcedure.execute(entity);
					Part3SkinRerollProcedure.execute(world, entity);
				}
				if (obtainablestands.contains("TheWorld")) {
					JojowosModVariables.MapVariables.get(world).TheWorldObtained = true;
					JojowosModVariables.MapVariables.get(world).syncData(world);
					JojowosModVariables.MapVariables.get(world).TheWorldUser = entity.getDisplayName().getString();
					JojowosModVariables.MapVariables.get(world).syncData(world);
					JojowosMod.LOGGER.info("The World No Longer Obtainable");
					{
						boolean _setval = true;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandObtained = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:the_world_achievement"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
					{
						String _setval = "TheWorld";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Stand = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					ApplyStatsTheWorldProcedure.execute(entity);
					Part3SkinRerollProcedure.execute(world, entity);
				}
				if (obtainablestands.contains("TheFool")) {
					JojowosModVariables.MapVariables.get(world).TheFoolUser = entity.getDisplayName().getString();
					JojowosModVariables.MapVariables.get(world).syncData(world);
					JojowosModVariables.MapVariables.get(world).TheFoolObtained = true;
					JojowosModVariables.MapVariables.get(world).syncData(world);
					JojowosMod.LOGGER.info("The Fool No Longer Obtainable");
					{
						boolean _setval = true;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandObtained = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:the_fool_achievement"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
					{
						String _setval = "TheFool";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Stand = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					ApplyStatsTheFoolProcedure.execute(entity);
					Part3SkinRerollProcedure.execute(world, entity);
				}
			}
		} else {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).HamonUser == true && Math.random() <= (double) ConfigFilesConfiguration.HAMONHP.get()
					|| (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Vampire == true && Math.random() <= (double) ConfigFilesConfiguration.VAMPIRETW.get()) {
				JojowosMod.LOGGER.info("Hamon Era");
				if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).HamonUser == true) {
					{
						boolean _setval = true;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandObtained = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:hermit_purple_achievement"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
					{
						String _setval = "HermitPurple";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Stand = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					ApplyStatsHermitPurpleProcedure.execute(entity);
					Part3SkinRerollProcedure.execute(world, entity);
				}
				if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Vampire == true) {
					{
						boolean _setval = true;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandObtained = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:the_world_achievement"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
					{
						String _setval = "TheWorld";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Stand = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					ApplyStatsTheWorldProcedure.execute(entity);
					Part3SkinRerollProcedure.execute(world, entity);
				}
			} else {
				JojowosMod.LOGGER.info("Default");
				if (random_number == 1) {
					{
						boolean _setval = true;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandObtained = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:star_platinum_achievement"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
					{
						String _setval = "StarPlatinum";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Stand = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					ApplyStatsStarPlatinumProcedure.execute(entity);
					Part3SkinRerollProcedure.execute(world, entity);
				}
				if (random_number == 2) {
					{
						boolean _setval = true;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandObtained = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:hierophant_green_achievement"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
					{
						String _setval = "HierophantGreen";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Stand = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					ApplyStatsHierophantGreenProcedure.execute(entity);
					Part3SkinRerollProcedure.execute(world, entity);
				}
				if (random_number == 3) {
					{
						boolean _setval = true;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandObtained = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:magicians_red_achievement"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
					{
						String _setval = "MagiciansRed";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Stand = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					ApplyStatsMagiciansRedProcedure.execute(entity);
					Part3SkinRerollProcedure.execute(world, entity);
				}
				if (random_number == 4) {
					{
						boolean _setval = true;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandObtained = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:silver_chariot_achievement"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
					{
						String _setval = "SilverChariot";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Stand = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					ApplyStatsSilverChariotProcedure.execute(entity);
					Part3SkinRerollProcedure.execute(world, entity);
				}
				if (random_number == 5) {
					{
						boolean _setval = true;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandObtained = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:hermit_purple_achievement"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
					{
						String _setval = "HermitPurple";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Stand = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					ApplyStatsHermitPurpleProcedure.execute(entity);
					Part3SkinRerollProcedure.execute(world, entity);
				}
				if (random_number == 6) {
					{
						boolean _setval = true;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandObtained = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:the_world_achievement"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
					{
						String _setval = "TheWorld";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Stand = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					ApplyStatsTheWorldProcedure.execute(entity);
					Part3SkinRerollProcedure.execute(world, entity);
				}
				if (random_number == 7) {
					{
						boolean _setval = true;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandObtained = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:the_fool_achievement"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
					{
						String _setval = "TheFool";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Stand = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					ApplyStatsTheFoolProcedure.execute(entity);
					Part3SkinRerollProcedure.execute(world, entity);
				}
			}
		}
		JojowosMod.queueServerWork(10, () -> {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandObtained == true) {
				StandSummoningProcedure.execute(world, x, y, z, entity);
				if ((entity instanceof ServerPlayer _plr31 && _plr31.level() instanceof ServerLevel
						&& _plr31.getAdvancements().getOrStartProgress(_plr31.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:stand_unlock_achivement"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:stand_unlock_achivement"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		});
	}
}
