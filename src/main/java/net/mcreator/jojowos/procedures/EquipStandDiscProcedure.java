package net.mcreator.jojowos.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.init.JojowosModItems;
import net.mcreator.jojowos.configuration.ConfigFilesConfiguration;
import net.mcreator.jojowos.JojowosMod;

public class EquipStandDiscProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (ConfigFilesConfiguration.SINGLEPLAYERSTAND.get() == false) {
			if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("none")) {
				StandDespawningProcedure.execute(world, x, y, z, entity);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:disc_insert")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:disc_insert")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				if (itemstack.getItem() == JojowosModItems.STAR_PLATINUM_DISC.get()) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:star_platinum_achievement"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
					{
						String _setval = itemstack.getOrCreateTag().getString("StandSkin");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = itemstack.getOrCreateTag().getBoolean("Evolved");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Evolved = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("TimeStopLength");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.TimeStopLength = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("CurrentExp");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.CurrentExp = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxExp");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxExp = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Level");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Level = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("SkillPoints");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SkillPoints = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Power");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandPower = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxPower");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxPower = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Speed");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSpeed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxSpeed");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxSpeed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Durability");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandDurability = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxDurability");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxDurability = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Precision");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandPrecision = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxPrecision");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxPrecision = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Range");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandRange = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxRange");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxRange = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Potential");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandPotential = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxPotential");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxPotential = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = itemstack.getOrCreateTag().getBoolean("StarFingerUnlocked");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StarFingerUnlocked = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = itemstack.getOrCreateTag().getBoolean("InhaleUnlocked");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.InhaleUnlocked = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = itemstack.getOrCreateTag().getBoolean("BearingShotUnlocked");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.BearingShotUnlocked = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = itemstack.getOrCreateTag().getBoolean("StarTimeSkipUnlocked");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StarTimeSkipUnlocked = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = itemstack.getOrCreateTag().getBoolean("StarTimeStopUnlocked");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StarTimeStopUnlocked = _setval;
							capability.syncPlayerVariables(entity);
						});
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
						String _setval = "[ ]";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SelectedSkill = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = 1;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.AttackLevel = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = 0;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SkillNumber = _setval;
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
					{
						boolean _setval = true;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ArrowUsed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = false;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSummoned = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Stand Updated : Star Platinum"), true);
					JojowosMod.queueServerWork(5, () -> {
						if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StarFingerUnlocked == true) {
							if (entity instanceof ServerPlayer _player) {
								Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:star_finger_achievement"));
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
						if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).InhaleUnlocked == true) {
							if (entity instanceof ServerPlayer _player) {
								Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:inhale_achievement"));
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
						if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).BearingShotUnlocked == true) {
							if (entity instanceof ServerPlayer _player) {
								Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:bearing_shot_achievement"));
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
						if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StarTimeSkipUnlocked == true) {
							if (entity instanceof ServerPlayer _player) {
								Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:star_time_skip_achievement"));
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
						if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StarTimeStopUnlocked == true) {
							if (entity instanceof ServerPlayer _player) {
								Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:star_time_stop_achievement"));
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
					});
					if (itemstack.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = ItemStack.EMPTY;
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = ItemStack.EMPTY;
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				}
				if (itemstack.getItem() == JojowosModItems.HIEROPHANT_GREEN_DISC.get()) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:hierophant_green_achievement"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
					{
						String _setval = itemstack.getOrCreateTag().getString("StandSkin");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = itemstack.getOrCreateTag().getBoolean("Evolved");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Evolved = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("CurrentExp");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.CurrentExp = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxExp");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxExp = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Level");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Level = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("SkillPoints");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SkillPoints = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Power");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandPower = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxPower");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxPower = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Speed");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSpeed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxSpeed");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxSpeed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Durability");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandDurability = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxDurability");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxDurability = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Precision");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandPrecision = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxPrecision");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxPrecision = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Range");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandRange = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxRange");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxRange = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Potential");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandPotential = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxPotential");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxPotential = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = itemstack.getOrCreateTag().getBoolean("GreenGrappleUnlocked");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.GreenGrappleUnlocked = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = itemstack.getOrCreateTag().getBoolean("MeterEmeraldUnlocked");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MeterEmeraldUnlocked = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = itemstack.getOrCreateTag().getBoolean("BodyControlUnlocked");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.BodyControlUnlocked = _setval;
							capability.syncPlayerVariables(entity);
						});
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
						String _setval = "[ ]";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SelectedSkill = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = 1;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.AttackLevel = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = 0;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SkillNumber = _setval;
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
						boolean _setval = true;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandObtained = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = true;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ArrowUsed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = false;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSummoned = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Stand Updated : Hierophant Green"), true);
					JojowosMod.queueServerWork(5, () -> {
						if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).GreenGrappleUnlocked == true) {
							if (entity instanceof ServerPlayer _player) {
								Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:hiero_grapple_achievement"));
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
						if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).MeterEmeraldUnlocked == true) {
							if (entity instanceof ServerPlayer _player) {
								Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:meter_emerald_achievement"));
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
						if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).BodyControlUnlocked == true) {
							if (entity instanceof ServerPlayer _player) {
								Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:body_control_achievement"));
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
					});
					if (itemstack.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = ItemStack.EMPTY;
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = ItemStack.EMPTY;
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				}
				if (itemstack.getItem() == JojowosModItems.MAGICIANS_RED_DISC.get()) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:magicians_red_achievement"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
					{
						String _setval = itemstack.getOrCreateTag().getString("StandSkin");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = itemstack.getOrCreateTag().getBoolean("Evolved");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Evolved = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("CurrentExp");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.CurrentExp = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxExp");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxExp = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Level");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Level = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("SkillPoints");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SkillPoints = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Power");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandPower = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxPower");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxPower = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Speed");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSpeed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxSpeed");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxSpeed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Durability");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandDurability = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxDurability");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxDurability = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Precision");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandPrecision = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxPrecision");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxPrecision = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Range");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandRange = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxRange");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxRange = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Potential");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandPotential = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxPotential");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxPotential = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = itemstack.getOrCreateTag().getBoolean("CrossfireSpecialUnlocked");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.CrossfireSpecialUnlocked = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = itemstack.getOrCreateTag().getBoolean("RedBindUnlocked");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.RedBindUnlocked = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = itemstack.getOrCreateTag().getBoolean("LifeDetectUnlocked");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.LifeDetectUnlocked = _setval;
							capability.syncPlayerVariables(entity);
						});
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
						String _setval = "[ ]";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SelectedSkill = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = 1;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.AttackLevel = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = 0;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SkillNumber = _setval;
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
						boolean _setval = true;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandObtained = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = true;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ArrowUsed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = false;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSummoned = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Stand Updated : Magician's Red"), true);
					JojowosMod.queueServerWork(5, () -> {
						if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).CrossfireSpecialUnlocked == true) {
							if (entity instanceof ServerPlayer _player) {
								Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:crossfire_special_achievement"));
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
						if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).RedBindUnlocked == true) {
							if (entity instanceof ServerPlayer _player) {
								Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:red_bind_achievement"));
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
						if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).LifeDetectUnlocked == true) {
							if (entity instanceof ServerPlayer _player) {
								Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:life_detector_achievement"));
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
					});
					if (itemstack.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = ItemStack.EMPTY;
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = ItemStack.EMPTY;
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				}
				if (itemstack.getItem() == JojowosModItems.SILVER_CHARIOT_DISC.get()) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:silver_chariot_achievement"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
					{
						String _setval = itemstack.getOrCreateTag().getString("StandSkin");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = itemstack.getOrCreateTag().getBoolean("Evolved");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Evolved = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("CurrentExp");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.CurrentExp = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxExp");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxExp = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Level");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Level = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("SkillPoints");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SkillPoints = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Power");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandPower = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxPower");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxPower = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Speed");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSpeed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxSpeed");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxSpeed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Durability");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandDurability = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxDurability");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxDurability = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Precision");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandPrecision = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxPrecision");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxPrecision = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Range");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandRange = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxRange");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxRange = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Potential");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandPotential = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxPotential");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxPotential = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = itemstack.getOrCreateTag().getBoolean("SwordLaunchUnlocked");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SwordLaunchUnlocked = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = itemstack.getOrCreateTag().getBoolean("ArmorOffUnlocked");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ArmorOffUnlocked = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = itemstack.getOrCreateTag().getBoolean("BladeCycloneUnlocked");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.BladeCycloneUnlocked = _setval;
							capability.syncPlayerVariables(entity);
						});
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
						String _setval = "[ ]";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SelectedSkill = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = 1;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.AttackLevel = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = 0;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SkillNumber = _setval;
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
						boolean _setval = true;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandObtained = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = true;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ArrowUsed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = false;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSummoned = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Stand Updated : Silver Chariot"), true);
					JojowosMod.queueServerWork(5, () -> {
						if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SwordLaunchUnlocked == true) {
							if (entity instanceof ServerPlayer _player) {
								Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:sword_launch_achievement"));
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
						if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).BladeCycloneUnlocked == true) {
							if (entity instanceof ServerPlayer _player) {
								Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:blade_cyclone_achievement"));
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
						if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).ArmorOffUnlocked == true) {
							if (entity instanceof ServerPlayer _player) {
								Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:armor_off_achievement"));
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
					});
					if (itemstack.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = ItemStack.EMPTY;
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = ItemStack.EMPTY;
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				}
				if (itemstack.getItem() == JojowosModItems.HERMIT_PURPLE_DISC.get()) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:hermit_purple_achievement"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
					{
						String _setval = itemstack.getOrCreateTag().getString("StandSkin");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = itemstack.getOrCreateTag().getBoolean("Evolved");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Evolved = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("CurrentExp");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.CurrentExp = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxExp");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxExp = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Level");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Level = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("SkillPoints");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SkillPoints = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Power");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandPower = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxPower");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxPower = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Speed");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSpeed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxSpeed");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxSpeed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Durability");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandDurability = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxDurability");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxDurability = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Precision");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandPrecision = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxPrecision");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxPrecision = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Range");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandRange = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxRange");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxRange = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Potential");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandPotential = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxPotential");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxPotential = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = itemstack.getOrCreateTag().getBoolean("DivinationUnlocked");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DivinationUnlocked = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = itemstack.getOrCreateTag().getBoolean("TangleUnlocked");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.TangleUnlocked = _setval;
							capability.syncPlayerVariables(entity);
						});
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
						String _setval = "[ ]";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SelectedSkill = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = 1;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.AttackLevel = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = 0;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SkillNumber = _setval;
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
						boolean _setval = true;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandObtained = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = true;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ArrowUsed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = false;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSummoned = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Stand Updated : Hermit Purple"), true);
					JojowosMod.queueServerWork(5, () -> {
						if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).DivinationUnlocked == true) {
							if (entity instanceof ServerPlayer _player) {
								Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:camera_divination_achievement"));
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
						if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).TangleUnlocked == true) {
							if (entity instanceof ServerPlayer _player) {
								Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:tangle_achievement"));
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
					});
					if (itemstack.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = ItemStack.EMPTY;
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = ItemStack.EMPTY;
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				}
				if (itemstack.getItem() == JojowosModItems.THE_WORLD_DISC.get()) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:the_world_achievement"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
					{
						String _setval = itemstack.getOrCreateTag().getString("StandSkin");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = itemstack.getOrCreateTag().getBoolean("Evolved");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Evolved = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("TimeStopLength");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.TimeStopLength = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("CurrentExp");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.CurrentExp = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxExp");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxExp = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Level");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Level = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("SkillPoints");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SkillPoints = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Power");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandPower = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxPower");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxPower = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Speed");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSpeed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxSpeed");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxSpeed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Durability");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandDurability = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxDurability");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxDurability = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Precision");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandPrecision = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxPrecision");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxPrecision = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Range");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandRange = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxRange");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxRange = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Potential");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandPotential = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxPotential");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxPotential = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = itemstack.getOrCreateTag().getBoolean("MudaKickUnlocked");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MudaKickUnlocked = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = itemstack.getOrCreateTag().getBoolean("KnifeTossUnlocked");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.KnifeTossUnlocked = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = itemstack.getOrCreateTag().getBoolean("WorldTimeSkipUnlocked");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.WorldTimeSkipUnlocked = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = itemstack.getOrCreateTag().getBoolean("WorldTimeStopUnlocked");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.WorldTimeStopUnlocked = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = itemstack.getOrCreateTag().getBoolean("RoadRollerUnlocked");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.RoadRollerUnlocked = _setval;
							capability.syncPlayerVariables(entity);
						});
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
						String _setval = "[ ]";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SelectedSkill = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = 1;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.AttackLevel = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = 0;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SkillNumber = _setval;
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
					{
						boolean _setval = true;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ArrowUsed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = false;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSummoned = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Stand Updated : The World"), true);
					JojowosMod.queueServerWork(5, () -> {
						if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).MudaKickUnlocked == true) {
							if (entity instanceof ServerPlayer _player) {
								Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:muda_kick_achievement"));
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
						if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).KnifeTossUnlocked == true) {
							if (entity instanceof ServerPlayer _player) {
								Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:knife_toss_achievement"));
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
						if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).WorldTimeSkipUnlocked == true) {
							if (entity instanceof ServerPlayer _player) {
								Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:world_time_skip_achievement"));
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
						if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).WorldTimeStopUnlocked == true) {
							if (entity instanceof ServerPlayer _player) {
								Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:world_time_stop_achievement"));
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
						if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).RoadRollerUnlocked == true) {
							if (entity instanceof ServerPlayer _player) {
								Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:road_roller_achievement"));
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
					});
					if (itemstack.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = ItemStack.EMPTY;
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = ItemStack.EMPTY;
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				}
				if (itemstack.getItem() == JojowosModItems.THE_FOOL_DISC.get()) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:the_fool_achievement"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
					{
						String _setval = itemstack.getOrCreateTag().getString("StandSkin");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSkin = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = itemstack.getOrCreateTag().getBoolean("Evolved");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Evolved = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("CurrentExp");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.CurrentExp = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxExp");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxExp = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Level");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Level = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("SkillPoints");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SkillPoints = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Power");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandPower = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxPower");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxPower = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Speed");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSpeed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxSpeed");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxSpeed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Durability");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandDurability = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxDurability");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxDurability = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Precision");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandPrecision = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxPrecision");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxPrecision = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Range");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandRange = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxRange");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxRange = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("Potential");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandPotential = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = itemstack.getOrCreateTag().getDouble("MaxPotential");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxPotential = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = itemstack.getOrCreateTag().getBoolean("SandDomeUnlocked");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SandDomeUnlocked = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = itemstack.getOrCreateTag().getBoolean("SandGlideUnlocked");
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SandGlideUnlocked = _setval;
							capability.syncPlayerVariables(entity);
						});
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
						String _setval = "[ ]";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SelectedSkill = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = 1;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.AttackLevel = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = 0;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SkillNumber = _setval;
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
						boolean _setval = true;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandObtained = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = true;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ArrowUsed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = false;
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StandSummoned = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Stand Updated : The Fool"), true);
					JojowosMod.queueServerWork(5, () -> {
						if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SandGlideUnlocked == true) {
							if (entity instanceof ServerPlayer _player) {
								Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:sand_glider_achievement"));
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
						if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SandDomeUnlocked == true) {
							if (entity instanceof ServerPlayer _player) {
								Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:sand_dome_achievement"));
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
					});
					if (itemstack.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = ItemStack.EMPTY;
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					} else {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = ItemStack.EMPTY;
							_setstack.setCount(1);
							_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr412 && _plr412.level() instanceof ServerLevel
						&& _plr412.getAdvancements().getOrStartProgress(_plr412.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:stand_disc_equip_achievement"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:stand_disc_equip_achievement"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr414 && _plr414.level() instanceof ServerLevel
						&& _plr414.getAdvancements().getOrStartProgress(_plr414.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:stand_unlock_achivement"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:stand_unlock_achivement"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Remove Your Stand First!"), true);
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Stand Discs are Disabled!"), true);
		}
	}
}
