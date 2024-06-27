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
				{
					String _setval = itemstack.getOrCreateTag().getString("StandSkin");
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.StandSkin = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = itemstack.getOrCreateTag().getString("StandColor");
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.StandColor = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = itemstack.getOrCreateTag().getString("MovesUnlocked");
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MovesUnlocked = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				JojowosMod.LOGGER.info((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).MovesUnlocked);
				{
					String _setval = itemstack.getOrCreateTag().getString("Ability1");
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SetAbility1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = itemstack.getOrCreateTag().getString("Ability2");
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SetAbility2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = itemstack.getOrCreateTag().getString("Ability3");
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SetAbility3 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = itemstack.getOrCreateTag().getString("Ability4");
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SetAbility4 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = itemstack.getOrCreateTag().getString("Ability5");
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SetAbility5 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = itemstack.getOrCreateTag().getString("Ability6");
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SetAbility6 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = itemstack.getOrCreateTag().getString("Ability7");
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SetAbility7 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = itemstack.getOrCreateTag().getString("Ability8");
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SetAbility8 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = itemstack.getOrCreateTag().getString("Ability9");
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SetAbility9 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "[ ]";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AbilitySelected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putDouble("MoveUpdate", 0);
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
					boolean _setval = false;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.StandSummoned = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (itemstack.getItem() == JojowosModItems.STAR_PLATINUM_DISC.get()) {
					if ((entity instanceof ServerPlayer _plr60 && _plr60.level() instanceof ServerLevel
							&& _plr60.getAdvancements().getOrStartProgress(_plr60.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:star_platinum_achievement"))).isDone()) == false) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:star_platinum_achievement"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
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
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Stand Updated : Star Platinum"), true);
				}
				if (itemstack.getItem() == JojowosModItems.HIEROPHANT_GREEN_DISC.get()) {
					if ((entity instanceof ServerPlayer _plr65 && _plr65.level() instanceof ServerLevel
							&& _plr65.getAdvancements().getOrStartProgress(_plr65.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:hierophant_green_achievement"))).isDone()) == false) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:hierophant_green_achievement"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
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
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Stand Updated : Hierophant Green"), true);
				}
				if (itemstack.getItem() == JojowosModItems.MAGICIANS_RED_DISC.get()) {
					if ((entity instanceof ServerPlayer _plr70 && _plr70.level() instanceof ServerLevel
							&& _plr70.getAdvancements().getOrStartProgress(_plr70.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:magicians_red_achievement"))).isDone()) == false) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:magicians_red_achievement"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
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
						String _setval = "Furnace";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.SpecialType = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Stand Updated : Magician's Red"), true);
				}
				if (itemstack.getItem() == JojowosModItems.SILVER_CHARIOT_DISC.get()) {
					if ((entity instanceof ServerPlayer _plr75 && _plr75.level() instanceof ServerLevel
							&& _plr75.getAdvancements().getOrStartProgress(_plr75.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:silver_chariot_achievement"))).isDone()) == false) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:silver_chariot_achievement"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
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
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Stand Updated : Silver Chariot"), true);
				}
				if (itemstack.getItem() == JojowosModItems.HERMIT_PURPLE_DISC.get()) {
					if ((entity instanceof ServerPlayer _plr80 && _plr80.level() instanceof ServerLevel
							&& _plr80.getAdvancements().getOrStartProgress(_plr80.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:hermit_purple_achievement"))).isDone()) == false) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:hermit_purple_achievement"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
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
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Stand Updated : Hermit Purple"), true);
				}
				if (itemstack.getItem() == JojowosModItems.THE_WORLD_DISC.get()) {
					if ((entity instanceof ServerPlayer _plr85 && _plr85.level() instanceof ServerLevel
							&& _plr85.getAdvancements().getOrStartProgress(_plr85.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:the_world_achievement"))).isDone()) == false) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:the_world_achievement"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
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
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Stand Updated : The World"), true);
				}
				if (itemstack.getItem() == JojowosModItems.THE_FOOL_DISC.get()) {
					if ((entity instanceof ServerPlayer _plr90 && _plr90.level() instanceof ServerLevel
							&& _plr90.getAdvancements().getOrStartProgress(_plr90.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:the_fool_achievement"))).isDone()) == false) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:the_fool_achievement"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
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
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Stand Updated : The Fool"), true);
				}
				if ((entity instanceof ServerPlayer _plr93 && _plr93.level() instanceof ServerLevel
						&& _plr93.getAdvancements().getOrStartProgress(_plr93.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:stand_disc_equip_achievement"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:stand_disc_equip_achievement"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if ((entity instanceof ServerPlayer _plr95 && _plr95.level() instanceof ServerLevel
						&& _plr95.getAdvancements().getOrStartProgress(_plr95.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:stand_unlock_achivement"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:stand_unlock_achivement"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if (itemstack.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = ItemStack.EMPTY.copy();
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = ItemStack.EMPTY.copy();
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
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
