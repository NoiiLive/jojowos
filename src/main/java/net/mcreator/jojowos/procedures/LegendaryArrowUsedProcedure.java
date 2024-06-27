package net.mcreator.jojowos.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.init.JojowosModItems;
import net.mcreator.jojowos.configuration.ConfigFilesConfiguration;
import net.mcreator.jojowos.JojowosMod;

import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationRegistry;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationAccess;
import dev.kosmx.playerAnim.api.layered.ModifierLayer;
import dev.kosmx.playerAnim.api.layered.KeyframeAnimationPlayer;
import dev.kosmx.playerAnim.api.layered.IAnimation;

public class LegendaryArrowUsedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		String obtainablestands = "";
		double random_number = 0;
		double totalstands = 0;
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 80);
		random_number = Mth.nextInt(RandomSource.create(), 1, 7);
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 70, 9, false, false));
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:arrow_stab")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:arrow_stab")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).ArrowWorthy == true) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandObtained == false) {
				JojowosMod.queueServerWork(45, () -> {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("jojowos:arrow_worthiness")))), 2);
				});
				if (world.isClientSide()) {
					if (entity instanceof AbstractClientPlayer player) {
						var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("jojowos", "player_animation"));
						if (animation != null && !animation.isActive()) {
							animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("jojowos", "arrow"))));
						}
					}
				}
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
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("jojowos:arrow_worthiness")))), 100);
					} else {
						obtainablestands = new Object() {
							private String split(String text, String space, int index) {
								String s = text.split(space)[index];
								return s;
							}
						}.split(obtainablestands, ",", (int) (Mth.nextDouble(RandomSource.create(), 0, totalstands - 1)));
						JojowosMod.LOGGER.info(obtainablestands);
						if (obtainablestands.contains("StarPlatinum")) {
							JojowosMod.queueServerWork(75, () -> {
								if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(JojowosModItems.LEGENDARY_ARROW.get())) : false) {
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
									Part3LegendarySkinRerollProcedure.execute(world, entity);
									if (ConfigFilesConfiguration.REUSABLEARROWS.get() == false) {
										if (entity instanceof Player _player) {
											ItemStack _stktoremove = new ItemStack(JojowosModItems.LEGENDARY_ARROW.get());
											_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
										}
									}
								} else {
									entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("jojowos:arrow_worthiness")))), 100);
								}
							});
						}
						if (obtainablestands.contains("HierophantGreen")) {
							JojowosMod.queueServerWork(75, () -> {
								if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(JojowosModItems.LEGENDARY_ARROW.get())) : false) {
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
									Part3LegendarySkinRerollProcedure.execute(world, entity);
									if (ConfigFilesConfiguration.REUSABLEARROWS.get() == false) {
										if (entity instanceof Player _player) {
											ItemStack _stktoremove = new ItemStack(JojowosModItems.LEGENDARY_ARROW.get());
											_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
										}
									}
								} else {
									entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("jojowos:arrow_worthiness")))), 100);
								}
							});
						}
						if (obtainablestands.contains("MagiciansRed")) {
							JojowosMod.queueServerWork(75, () -> {
								if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(JojowosModItems.LEGENDARY_ARROW.get())) : false) {
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
									Part3LegendarySkinRerollProcedure.execute(world, entity);
									if (ConfigFilesConfiguration.REUSABLEARROWS.get() == false) {
										if (entity instanceof Player _player) {
											ItemStack _stktoremove = new ItemStack(JojowosModItems.LEGENDARY_ARROW.get());
											_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
										}
									}
								} else {
									entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("jojowos:arrow_worthiness")))), 100);
								}
							});
						}
						if (obtainablestands.contains("SilverChariot")) {
							JojowosMod.queueServerWork(75, () -> {
								if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(JojowosModItems.LEGENDARY_ARROW.get())) : false) {
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
									Part3LegendarySkinRerollProcedure.execute(world, entity);
									if (ConfigFilesConfiguration.REUSABLEARROWS.get() == false) {
										if (entity instanceof Player _player) {
											ItemStack _stktoremove = new ItemStack(JojowosModItems.LEGENDARY_ARROW.get());
											_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
										}
									}
								} else {
									entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("jojowos:arrow_worthiness")))), 100);
								}
							});
						}
						if (obtainablestands.contains("HermitPurple")) {
							JojowosMod.queueServerWork(75, () -> {
								if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(JojowosModItems.LEGENDARY_ARROW.get())) : false) {
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
									Part3LegendarySkinRerollProcedure.execute(world, entity);
									if (ConfigFilesConfiguration.REUSABLEARROWS.get() == false) {
										if (entity instanceof Player _player) {
											ItemStack _stktoremove = new ItemStack(JojowosModItems.LEGENDARY_ARROW.get());
											_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
										}
									}
								} else {
									entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("jojowos:arrow_worthiness")))), 100);
								}
							});
						}
						if (obtainablestands.contains("TheWorld")) {
							JojowosMod.queueServerWork(75, () -> {
								if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(JojowosModItems.LEGENDARY_ARROW.get())) : false) {
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
									Part3LegendarySkinRerollProcedure.execute(world, entity);
									if (ConfigFilesConfiguration.REUSABLEARROWS.get() == false) {
										if (entity instanceof Player _player) {
											ItemStack _stktoremove = new ItemStack(JojowosModItems.LEGENDARY_ARROW.get());
											_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
										}
									}
								} else {
									entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("jojowos:arrow_worthiness")))), 100);
								}
							});
						}
						if (obtainablestands.contains("TheFool")) {
							JojowosMod.queueServerWork(75, () -> {
								if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(JojowosModItems.LEGENDARY_ARROW.get())) : false) {
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
									Part3LegendarySkinRerollProcedure.execute(world, entity);
									if (ConfigFilesConfiguration.REUSABLEARROWS.get() == false) {
										if (entity instanceof Player _player) {
											ItemStack _stktoremove = new ItemStack(JojowosModItems.LEGENDARY_ARROW.get());
											_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
										}
									}
								} else {
									entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("jojowos:arrow_worthiness")))), 100);
								}
							});
						}
					}
				} else {
					if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).HamonUser == true
							&& Mth.nextInt(RandomSource.create(), 1, 100) <= (double) ConfigFilesConfiguration.HAMONHP.get()
							|| (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Vampire == true
									&& Mth.nextInt(RandomSource.create(), 1, 100) <= (double) ConfigFilesConfiguration.VAMPIRETW.get()) {
						JojowosMod.LOGGER.info("Hamon Era");
						if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).HamonUser == true) {
							JojowosMod.queueServerWork(75, () -> {
								if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(JojowosModItems.LEGENDARY_ARROW.get())) : false) {
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
									Part3ShinySkinRerollProcedure.execute(world, entity);
									if (ConfigFilesConfiguration.REUSABLEARROWS.get() == false) {
										if (entity instanceof Player _player) {
											ItemStack _stktoremove = new ItemStack(JojowosModItems.LEGENDARY_ARROW.get());
											_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
										}
									}
								} else {
									entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("jojowos:arrow_worthiness")))), 100);
								}
							});
						}
						if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Vampire == true) {
							JojowosMod.queueServerWork(75, () -> {
								if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(JojowosModItems.LEGENDARY_ARROW.get())) : false) {
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
									Part3ShinySkinRerollProcedure.execute(world, entity);
									if (ConfigFilesConfiguration.REUSABLEARROWS.get() == false) {
										if (entity instanceof Player _player) {
											ItemStack _stktoremove = new ItemStack(JojowosModItems.LEGENDARY_ARROW.get());
											_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
										}
									}
								} else {
									entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("jojowos:arrow_worthiness")))), 100);
								}
							});
						}
					} else {
						JojowosMod.LOGGER.info("Default");
						if (random_number == 1) {
							JojowosMod.queueServerWork(75, () -> {
								if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(JojowosModItems.LEGENDARY_ARROW.get())) : false) {
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
									Part3LegendarySkinRerollProcedure.execute(world, entity);
									if (ConfigFilesConfiguration.REUSABLEARROWS.get() == false) {
										if (entity instanceof Player _player) {
											ItemStack _stktoremove = new ItemStack(JojowosModItems.LEGENDARY_ARROW.get());
											_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
										}
									}
								} else {
									entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("jojowos:arrow_worthiness")))), 100);
								}
							});
						}
						if (random_number == 2) {
							JojowosMod.queueServerWork(75, () -> {
								if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(JojowosModItems.LEGENDARY_ARROW.get())) : false) {
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
									Part3LegendarySkinRerollProcedure.execute(world, entity);
									if (ConfigFilesConfiguration.REUSABLEARROWS.get() == false) {
										if (entity instanceof Player _player) {
											ItemStack _stktoremove = new ItemStack(JojowosModItems.LEGENDARY_ARROW.get());
											_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
										}
									}
								} else {
									entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("jojowos:arrow_worthiness")))), 100);
								}
							});
						}
						if (random_number == 3) {
							JojowosMod.queueServerWork(75, () -> {
								if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(JojowosModItems.LEGENDARY_ARROW.get())) : false) {
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
									Part3LegendarySkinRerollProcedure.execute(world, entity);
									if (ConfigFilesConfiguration.REUSABLEARROWS.get() == false) {
										if (entity instanceof Player _player) {
											ItemStack _stktoremove = new ItemStack(JojowosModItems.LEGENDARY_ARROW.get());
											_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
										}
									}
								} else {
									entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("jojowos:arrow_worthiness")))), 100);
								}
							});
						}
						if (random_number == 4) {
							JojowosMod.queueServerWork(75, () -> {
								if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(JojowosModItems.LEGENDARY_ARROW.get())) : false) {
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
									Part3LegendarySkinRerollProcedure.execute(world, entity);
									if (ConfigFilesConfiguration.REUSABLEARROWS.get() == false) {
										if (entity instanceof Player _player) {
											ItemStack _stktoremove = new ItemStack(JojowosModItems.LEGENDARY_ARROW.get());
											_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
										}
									}
								} else {
									entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("jojowos:arrow_worthiness")))), 100);
								}
							});
						}
						if (random_number == 5) {
							JojowosMod.queueServerWork(75, () -> {
								if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(JojowosModItems.LEGENDARY_ARROW.get())) : false) {
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
									Part3LegendarySkinRerollProcedure.execute(world, entity);
									if (ConfigFilesConfiguration.REUSABLEARROWS.get() == false) {
										if (entity instanceof Player _player) {
											ItemStack _stktoremove = new ItemStack(JojowosModItems.LEGENDARY_ARROW.get());
											_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
										}
									}
								} else {
									entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("jojowos:arrow_worthiness")))), 100);
								}
							});
						}
						if (random_number == 6) {
							JojowosMod.queueServerWork(75, () -> {
								if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(JojowosModItems.LEGENDARY_ARROW.get())) : false) {
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
									Part3LegendarySkinRerollProcedure.execute(world, entity);
									if (ConfigFilesConfiguration.REUSABLEARROWS.get() == false) {
										if (entity instanceof Player _player) {
											ItemStack _stktoremove = new ItemStack(JojowosModItems.LEGENDARY_ARROW.get());
											_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
										}
									}
								} else {
									entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("jojowos:arrow_worthiness")))), 100);
								}
							});
						}
						if (random_number == 7) {
							JojowosMod.queueServerWork(75, () -> {
								if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(JojowosModItems.LEGENDARY_ARROW.get())) : false) {
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
									Part3LegendarySkinRerollProcedure.execute(world, entity);
									if (ConfigFilesConfiguration.REUSABLEARROWS.get() == false) {
										if (entity instanceof Player _player) {
											ItemStack _stktoremove = new ItemStack(JojowosModItems.LEGENDARY_ARROW.get());
											_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
										}
									}
								} else {
									entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("jojowos:arrow_worthiness")))), 100);
								}
							});
						}
					}
				}
				JojowosMod.queueServerWork(77, () -> {
					StandSummoningProcedure.execute(world, x, y, z, entity);
					JojowosMod.LOGGER.info((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand);
					if ((entity instanceof ServerPlayer _plr137 && _plr137.level() instanceof ServerLevel
							&& _plr137.getAdvancements().getOrStartProgress(_plr137.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:stand_unlock_achivement"))).isDone()) == false) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:stand_unlock_achivement"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				});
			} else if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandObtained == true) {
				if (world.isClientSide()) {
					if (entity instanceof AbstractClientPlayer player) {
						var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("jojowos", "player_animation"));
						if (animation != null && !animation.isActive()) {
							animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("jojowos", "arrow"))));
						}
					}
				}
				JojowosMod.queueServerWork(43, () -> {
					if (ConfigFilesConfiguration.REUSABLEARROWS.get() == false) {
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(JojowosModItems.LEGENDARY_ARROW.get());
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
					}
				});
				JojowosMod.queueServerWork(45, () -> {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("jojowos:arrow_worthiness")))), 10);
					StandDespawningProcedure.execute(world, x, y, z, entity);
					Part3LegendarySkinRerollProcedure.execute(world, entity);
				});
				JojowosMod.queueServerWork(77, () -> {
					StandSummoningProcedure.execute(world, x, y, z, entity);
				});
			}
		} else {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandObtained == true) {
				if (world.isClientSide()) {
					if (entity instanceof AbstractClientPlayer player) {
						var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("jojowos", "player_animation"));
						if (animation != null && !animation.isActive()) {
							animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("jojowos", "arrow"))));
						}
					}
				}
				JojowosMod.queueServerWork(43, () -> {
					if (ConfigFilesConfiguration.REUSABLEARROWS.get() == false) {
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(JojowosModItems.LEGENDARY_ARROW.get());
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
					}
				});
				JojowosMod.queueServerWork(45, () -> {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("jojowos:arrow_worthiness")))), 10);
					StandDespawningProcedure.execute(world, x, y, z, entity);
					Part3LegendarySkinRerollProcedure.execute(world, entity);
				});
				JojowosMod.queueServerWork(77, () -> {
					StandSummoningProcedure.execute(world, x, y, z, entity);
				});
			} else {
				if (world.isClientSide()) {
					if (entity instanceof AbstractClientPlayer player) {
						var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("jojowos", "player_animation"));
						if (animation != null && !animation.isActive()) {
							animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("jojowos", "arrow"))));
						}
					}
				}
				JojowosMod.queueServerWork(43, () -> {
					if (ConfigFilesConfiguration.REUSABLEARROWS.get() == false) {
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(JojowosModItems.LEGENDARY_ARROW.get());
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
					}
					StandDespawningProcedure.execute(world, x, y, z, entity);
				});
				JojowosMod.queueServerWork(45, () -> {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 100);
				});
			}
		}
	}
}
