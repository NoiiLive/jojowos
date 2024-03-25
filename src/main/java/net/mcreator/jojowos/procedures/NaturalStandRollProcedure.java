package net.mcreator.jojowos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.configuration.SDCConfigFilesConfiguration;
import net.mcreator.jojowos.configuration.ConfigFilesConfiguration;
import net.mcreator.jojowos.JojowosMod;

public class NaturalStandRollProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double random_number = 0;
		String obtainablestands = "";
		if (ConfigFilesConfiguration.SINGLEPLAYERSTAND.get() == true) {
			if (JojowosModVariables.MapVariables.get(world).StarPlatinumObtained == false) {
				obtainablestands = obtainablestands + "1";
			}
			if (JojowosModVariables.MapVariables.get(world).HierophantGreenObtained == false) {
				obtainablestands = obtainablestands + "2";
			}
			if (JojowosModVariables.MapVariables.get(world).MagiciansRedObtained == false) {
				obtainablestands = obtainablestands + "3";
			}
			if (JojowosModVariables.MapVariables.get(world).SilverChariotObtained == false) {
				obtainablestands = obtainablestands + "4";
			}
			if (JojowosModVariables.MapVariables.get(world).HermitPurpleObtained == false) {
				obtainablestands = obtainablestands + "5";
			}
			if (JojowosModVariables.MapVariables.get(world).TheWorldObtained == false) {
				obtainablestands = obtainablestands + "6";
			}
			if (JojowosModVariables.MapVariables.get(world).TheFoolObtained == false) {
				obtainablestands = obtainablestands + "7";
			}
			JojowosMod.LOGGER.info(obtainablestands);
			if ((obtainablestands).isEmpty()) {
				if (entity instanceof LivingEntity _entity)
					_entity.hurt(new DamageSource(_entity.level().registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)) {
						@Override
						public Component getLocalizedDeathMessage(LivingEntity _msgEntity) {
							String _translatekey = "death.attack." + "standarrow";
							if (this.getEntity() == null && this.getDirectEntity() == null) {
								return _msgEntity.getKillCredit() != null
										? Component.translatable(_translatekey + ".player", _msgEntity.getDisplayName(), _msgEntity.getKillCredit().getDisplayName())
										: Component.translatable(_translatekey, _msgEntity.getDisplayName());
							} else {
								Component _component = this.getEntity() == null ? this.getDirectEntity().getDisplayName() : this.getEntity().getDisplayName();
								ItemStack _itemstack = ItemStack.EMPTY;
								if (this.getEntity() instanceof LivingEntity _livingentity)
									_itemstack = _livingentity.getMainHandItem();
								return !_itemstack.isEmpty() && _itemstack.hasCustomHoverName()
										? Component.translatable(_translatekey + ".item", _msgEntity.getDisplayName(), _component, _itemstack.getDisplayName())
										: Component.translatable(_translatekey, _msgEntity.getDisplayName(), _component);
							}
						}
					}, 100);
			} else {
				if ((obtainablestands).length() > 1) {
					random_number = Mth.nextInt(RandomSource.create(), 0, (int) ((obtainablestands).length() - 1));
					obtainablestands = obtainablestands.substring((int) random_number, (int) (random_number + 1));
					JojowosMod.LOGGER.info(obtainablestands);
				}
				if ((obtainablestands).length() == 1) {
					if ((obtainablestands).equals("1") && (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).ArrowUsed == false) {
						JojowosModVariables.MapVariables.get(world).StarPlatinumObtained = true;
						JojowosModVariables.MapVariables.get(world).syncData(world);
						JojowosModVariables.MapVariables.get(world).StarPlatinumUser = entity.getDisplayName().getString();
						JojowosModVariables.MapVariables.get(world).syncData(world);
						JojowosMod.LOGGER.info("Star Platinum No Longer Obtainable");
						{
							boolean _setval = true;
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.ArrowUsed = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
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
						{
							String _setval = "Close";
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.StandType = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = "Power";
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SpecialType = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = 0;
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.TimeStopLength = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = (double) SDCConfigFilesConfiguration.STARPLATINUMSTRENGTH.get();
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxPower = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = 100;
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxSpeed = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = (double) SDCConfigFilesConfiguration.STARPLATINUMDURABILITY.get();
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxDurability = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = 60;
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxRange = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = (double) SDCConfigFilesConfiguration.STARPLATINUMPRECISION.get();
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxPrecision = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = (double) SDCConfigFilesConfiguration.STARPLATINUMPOTENTIAL.get();
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxPotential = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						Part3SkinRerollProcedure.execute(world, entity);
					}
					if ((obtainablestands).equals("2") && (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).ArrowUsed == false) {
						JojowosModVariables.MapVariables.get(world).HierophantGreenObtained = true;
						JojowosModVariables.MapVariables.get(world).syncData(world);
						JojowosModVariables.MapVariables.get(world).HierophantGreenUser = entity.getDisplayName().getString();
						JojowosModVariables.MapVariables.get(world).syncData(world);
						JojowosMod.LOGGER.info("Hierophant Green No Longer Obtainable");
						{
							boolean _setval = true;
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.ArrowUsed = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
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
						{
							String _setval = "Long";
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.StandType = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = "Pilot";
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SpecialType = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = 0;
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.TimeStopLength = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = (double) SDCConfigFilesConfiguration.HIEROPHANTGREENSTRENGTH.get();
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxPower = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = 80;
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxSpeed = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = (double) SDCConfigFilesConfiguration.HIEROPHANTGREENDURABILITY.get();
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxDurability = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = 100;
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxRange = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = (double) SDCConfigFilesConfiguration.HIEROPHANTGREENPRECISION.get();
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxPrecision = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = (double) SDCConfigFilesConfiguration.HIEROPHANTGREENPOTENTIAL.get();
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxPotential = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						Part3SkinRerollProcedure.execute(world, entity);
					}
					if ((obtainablestands).equals("3") && (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).ArrowUsed == false) {
						JojowosModVariables.MapVariables.get(world).MagiciansRedObtained = true;
						JojowosModVariables.MapVariables.get(world).syncData(world);
						JojowosModVariables.MapVariables.get(world).MagiciansRedUser = entity.getDisplayName().getString();
						JojowosModVariables.MapVariables.get(world).syncData(world);
						JojowosMod.LOGGER.info("Magician's Red No Longer Obtainable");
						{
							boolean _setval = true;
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.ArrowUsed = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
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
						{
							String _setval = "Close";
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.StandType = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = "Power";
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SpecialType = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = 0;
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.TimeStopLength = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = (double) SDCConfigFilesConfiguration.MAGICIANSREDSTRENGTH.get();
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxPower = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = 80;
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxSpeed = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = (double) SDCConfigFilesConfiguration.MAGICIANSREDDURABILITY.get();
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxDurability = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = 60;
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxRange = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = (double) SDCConfigFilesConfiguration.MAGICIANSREDPRECISION.get();
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxPrecision = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = (double) SDCConfigFilesConfiguration.MAGICIANSREDPOTENTIAL.get();
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxPotential = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						Part3SkinRerollProcedure.execute(world, entity);
					}
					if ((obtainablestands).equals("4") && (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).ArrowUsed == false) {
						JojowosModVariables.MapVariables.get(world).SilverChariotObtained = true;
						JojowosModVariables.MapVariables.get(world).syncData(world);
						JojowosModVariables.MapVariables.get(world).SilverChariotUser = entity.getDisplayName().getString();
						JojowosModVariables.MapVariables.get(world).syncData(world);
						JojowosMod.LOGGER.info("Silver Chariot No Longer Obtainable");
						{
							boolean _setval = true;
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.ArrowUsed = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
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
						{
							String _setval = "Close";
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.StandType = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = "Power";
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SpecialType = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = 0;
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.TimeStopLength = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = (double) SDCConfigFilesConfiguration.SILVERCHARIOTSTRENGTH.get();
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxPower = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = 100;
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxSpeed = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = (double) SDCConfigFilesConfiguration.SILVERCHARIOTDURABILITY.get();
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxDurability = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = 60;
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxRange = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = (double) SDCConfigFilesConfiguration.SILVERCHARIOTPRECISION.get();
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxPrecision = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = (double) SDCConfigFilesConfiguration.SILVERCHARIOTPOTENTIAL.get();
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxPotential = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						Part3SkinRerollProcedure.execute(world, entity);
					}
					if ((obtainablestands).equals("5") && (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).ArrowUsed == false) {
						JojowosModVariables.MapVariables.get(world).HermitPurpleObtained = true;
						JojowosModVariables.MapVariables.get(world).syncData(world);
						JojowosModVariables.MapVariables.get(world).HermitPurpleUser = entity.getDisplayName().getString();
						JojowosModVariables.MapVariables.get(world).syncData(world);
						JojowosMod.LOGGER.info("Hermit Purple No Longer Obtainable");
						{
							boolean _setval = true;
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.ArrowUsed = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
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
						{
							String _setval = "Close";
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.StandType = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = "Item";
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SpecialType = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = 0;
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.TimeStopLength = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = (double) SDCConfigFilesConfiguration.HERMITPURPLESTRENGTH.get();
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxPower = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = 60;
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxSpeed = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = (double) SDCConfigFilesConfiguration.HERMITPURPLEDURABILITY.get();
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxDurability = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = 40;
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxRange = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = (double) SDCConfigFilesConfiguration.HERMITPURPLEPRECISION.get();
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxPrecision = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = (double) SDCConfigFilesConfiguration.HERMITPURPLEPOTENTIAL.get();
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxPotential = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						Part3SkinRerollProcedure.execute(world, entity);
					}
					if ((obtainablestands).equals("6") && (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).ArrowUsed == false) {
						JojowosModVariables.MapVariables.get(world).TheWorldObtained = true;
						JojowosModVariables.MapVariables.get(world).syncData(world);
						JojowosModVariables.MapVariables.get(world).TheWorldUser = entity.getDisplayName().getString();
						JojowosModVariables.MapVariables.get(world).syncData(world);
						JojowosMod.LOGGER.info("The World No Longer Obtainable");
						{
							boolean _setval = true;
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.ArrowUsed = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
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
						{
							String _setval = "Close";
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.StandType = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = "Power";
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SpecialType = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = 100;
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.TimeStopLength = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = (double) SDCConfigFilesConfiguration.THEWORLDSTRENGTH.get();
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxPower = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = 100;
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxSpeed = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = (double) SDCConfigFilesConfiguration.THEWORLDDURABILITY.get();
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxDurability = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = 60;
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxRange = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = (double) SDCConfigFilesConfiguration.THEWORLDPRECISION.get();
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxPrecision = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = (double) SDCConfigFilesConfiguration.THEWORLDPOTENTIAL.get();
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxPotential = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						Part3SkinRerollProcedure.execute(world, entity);
					}
					if ((obtainablestands).equals("7") && (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).ArrowUsed == false) {
						JojowosModVariables.MapVariables.get(world).TheFoolObtained = true;
						JojowosModVariables.MapVariables.get(world).syncData(world);
						JojowosModVariables.MapVariables.get(world).TheFoolUser = entity.getDisplayName().getString();
						JojowosModVariables.MapVariables.get(world).syncData(world);
						JojowosMod.LOGGER.info("The Fool No Longer Obtainable");
						{
							boolean _setval = true;
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.ArrowUsed = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
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
						{
							String _setval = "Close";
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.StandType = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = "Burrow";
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.SpecialType = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = 0;
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.TimeStopLength = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = (double) SDCConfigFilesConfiguration.THEFOOLSTRENGTH.get();
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxPower = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = 60;
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxSpeed = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = (double) SDCConfigFilesConfiguration.THEFOOLDURABILITY.get();
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxDurability = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = 40;
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxRange = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = (double) SDCConfigFilesConfiguration.THEFOOLPRECISION.get();
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxPrecision = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = (double) SDCConfigFilesConfiguration.THEFOOLPOTENTIAL.get();
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MaxPotential = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						Part3SkinRerollProcedure.execute(world, entity);
					}
				}
			}
		} else {
			random_number = Mth.nextInt(RandomSource.create(), 1, 7);
			if (random_number == 1 && (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).ArrowUsed == false) {
				{
					boolean _setval = true;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ArrowUsed = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
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
				{
					String _setval = "Close";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.StandType = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "Power";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SpecialType = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.TimeStopLength = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) SDCConfigFilesConfiguration.STARPLATINUMSTRENGTH.get();
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxPower = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 100;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxSpeed = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) SDCConfigFilesConfiguration.STARPLATINUMDURABILITY.get();
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxDurability = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 60;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxRange = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) SDCConfigFilesConfiguration.STARPLATINUMPRECISION.get();
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxPrecision = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) SDCConfigFilesConfiguration.STARPLATINUMPOTENTIAL.get();
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxPotential = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				Part3SkinRerollProcedure.execute(world, entity);
			}
			if (random_number == 2 && (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).ArrowUsed == false) {
				{
					boolean _setval = true;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ArrowUsed = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
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
				{
					String _setval = "Long";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.StandType = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "Pilot";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SpecialType = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.TimeStopLength = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) SDCConfigFilesConfiguration.HIEROPHANTGREENSTRENGTH.get();
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxPower = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 80;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxSpeed = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) SDCConfigFilesConfiguration.HIEROPHANTGREENDURABILITY.get();
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxDurability = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 100;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxRange = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) SDCConfigFilesConfiguration.HIEROPHANTGREENPRECISION.get();
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxPrecision = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) SDCConfigFilesConfiguration.HIEROPHANTGREENPOTENTIAL.get();
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxPotential = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				Part3SkinRerollProcedure.execute(world, entity);
			}
			if (random_number == 3 && (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).ArrowUsed == false) {
				{
					boolean _setval = true;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ArrowUsed = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
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
				{
					String _setval = "Close";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.StandType = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "Power";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SpecialType = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.TimeStopLength = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) SDCConfigFilesConfiguration.MAGICIANSREDSTRENGTH.get();
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxPower = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 80;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxSpeed = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) SDCConfigFilesConfiguration.MAGICIANSREDDURABILITY.get();
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxDurability = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 60;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxRange = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) SDCConfigFilesConfiguration.MAGICIANSREDPRECISION.get();
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxPrecision = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) SDCConfigFilesConfiguration.MAGICIANSREDPOTENTIAL.get();
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxPotential = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				Part3SkinRerollProcedure.execute(world, entity);
			}
			if (random_number == 4 && (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).ArrowUsed == false) {
				{
					boolean _setval = true;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ArrowUsed = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
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
				{
					String _setval = "Close";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.StandType = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "Power";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SpecialType = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.TimeStopLength = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) SDCConfigFilesConfiguration.SILVERCHARIOTSTRENGTH.get();
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxPower = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 100;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxSpeed = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) SDCConfigFilesConfiguration.SILVERCHARIOTDURABILITY.get();
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxDurability = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 60;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxRange = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) SDCConfigFilesConfiguration.SILVERCHARIOTPRECISION.get();
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxPrecision = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) SDCConfigFilesConfiguration.SILVERCHARIOTPOTENTIAL.get();
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxPotential = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				Part3SkinRerollProcedure.execute(world, entity);
			}
			if (random_number == 5 && (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).ArrowUsed == false) {
				{
					boolean _setval = true;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ArrowUsed = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
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
				{
					String _setval = "Close";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.StandType = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "Item";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SpecialType = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.TimeStopLength = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) SDCConfigFilesConfiguration.HERMITPURPLESTRENGTH.get();
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxPower = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 60;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxSpeed = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) SDCConfigFilesConfiguration.HERMITPURPLEDURABILITY.get();
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxDurability = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 40;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxRange = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) SDCConfigFilesConfiguration.HERMITPURPLEPRECISION.get();
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxPrecision = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) SDCConfigFilesConfiguration.HERMITPURPLEPOTENTIAL.get();
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxPotential = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				Part3SkinRerollProcedure.execute(world, entity);
			}
			if (random_number == 6 && (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).ArrowUsed == false) {
				{
					boolean _setval = true;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ArrowUsed = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
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
				{
					String _setval = "Close";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.StandType = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "Power";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SpecialType = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 100;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.TimeStopLength = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) SDCConfigFilesConfiguration.THEWORLDSTRENGTH.get();
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxPower = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 100;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxSpeed = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) SDCConfigFilesConfiguration.THEWORLDDURABILITY.get();
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxDurability = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 60;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxRange = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) SDCConfigFilesConfiguration.THEWORLDPRECISION.get();
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxPrecision = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) SDCConfigFilesConfiguration.THEWORLDPOTENTIAL.get();
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxPotential = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				Part3SkinRerollProcedure.execute(world, entity);
			}
			if (random_number == 7 && (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).ArrowUsed == false) {
				{
					boolean _setval = true;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ArrowUsed = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
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
				{
					String _setval = "Close";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.StandType = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "Burrow";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SpecialType = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.TimeStopLength = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) SDCConfigFilesConfiguration.THEFOOLSTRENGTH.get();
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxPower = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 60;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxSpeed = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) SDCConfigFilesConfiguration.THEFOOLDURABILITY.get();
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxDurability = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 40;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxRange = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) SDCConfigFilesConfiguration.THEFOOLPRECISION.get();
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxPrecision = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) SDCConfigFilesConfiguration.THEFOOLPOTENTIAL.get();
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxPotential = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				Part3SkinRerollProcedure.execute(world, entity);
			}
		}
		JojowosMod.queueServerWork(10, () -> {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandObtained == true) {
				StandSummoningProcedure.execute(world, x, y, z, entity);
				if ((entity instanceof ServerPlayer _plr81 && _plr81.level() instanceof ServerLevel
						&& _plr81.getAdvancements().getOrStartProgress(_plr81.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:stand_unlock_achivement"))).isDone()) == false) {
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
