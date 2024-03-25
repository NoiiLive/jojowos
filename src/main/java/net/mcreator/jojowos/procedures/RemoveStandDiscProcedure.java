package net.mcreator.jojowos.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
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
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.init.JojowosModItems;
import net.mcreator.jojowos.configuration.ConfigFilesConfiguration;
import net.mcreator.jojowos.JojowosMod;

public class RemoveStandDiscProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		boolean gate = false;
		double Hx = 0;
		double Hy = 0;
		double Hz = 0;
		gate = false;
		if (ConfigFilesConfiguration.SINGLEPLAYERSTAND.get() == false) {
			if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("none") == false && gate == false) {
				StandDespawningProcedure.execute(world, x, y, z, entity);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:disc_eject")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:disc_eject")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("StarPlatinum") && gate == false) {
					if (itemstack.getItem() == JojowosModItems.EMPTY_STAND_DISC.get()) {
						{
							String _setval = "none";
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Stand = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = "";
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.StandType = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = "";
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
							boolean _setval = false;
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
						{
							boolean _setval = false;
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.ArrowUsed = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Stand Has Been Removed"), true);
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									("give " + entity.getDisplayName().getString() + " jojowos:star_platinum_disc{display:{Name:\"{\\\"text\\\":\\\"\\\\u00A7f"
											+ (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PlayerName + "'s Stand Disc\\\"}\",Lore:[\"\\\"\\\\u00A76\\\\u00A7lSkin : "
											+ (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin + "\\\"\",\"\\\"\\\\u00A7eLevel : "
											+ new java.text.DecimalFormat("##").format((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Level) + "\\\"\"]}} 1"));
						JojowosMod.queueServerWork(20, () -> {
							{
								String _setval = "Base";
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandSkin = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								boolean _setval = false;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.Evolved = _setval;
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
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.CurrentExp = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 1;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.Level = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 100;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxExp = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.SkillPoints = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandPower = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandSpeed = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandDurability = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandPrecision = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandRange = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandPotential = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxPower = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxSpeed = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxDurability = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxRange = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxPotential = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxPrecision = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								boolean _setval = false;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StarFingerUnlocked = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								boolean _setval = false;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.InhaleUnlocked = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								boolean _setval = false;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.BearingShotUnlocked = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								boolean _setval = false;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StarTimeSkipUnlocked = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								boolean _setval = false;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StarTimeStopUnlocked = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"advancement revoke @p from jojowos:star_platinum_achievement");
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
						gate = true;
					}
				}
				if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("HierophantGreen") && gate == false) {
					if (itemstack.getItem() == JojowosModItems.EMPTY_STAND_DISC.get()) {
						{
							String _setval = "none";
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Stand = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = "";
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.StandType = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = "";
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
							boolean _setval = false;
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
						{
							boolean _setval = false;
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.ArrowUsed = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Stand Has Been Removed"), true);
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									("give " + entity.getDisplayName().getString() + " jojowos:hierophant_green_disc{display:{Name:\"{\\\"text\\\":\\\"\\\\u00A7f"
											+ (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PlayerName + "'s Stand Disc\\\"}\",Lore:[\"\\\"\\\\u00A76\\\\u00A7lSkin : "
											+ (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin + "\\\"\",\"\\\"\\\\u00A7eLevel : "
											+ new java.text.DecimalFormat("##").format((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Level) + "\\\"\"]}} 1"));
						JojowosMod.queueServerWork(20, () -> {
							{
								String _setval = "Base";
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandSkin = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								boolean _setval = false;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.Evolved = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.CurrentExp = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 1;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.Level = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 100;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxExp = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.SkillPoints = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandPower = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandSpeed = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandDurability = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandPrecision = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandRange = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandPotential = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxPower = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxSpeed = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxDurability = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxRange = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxPotential = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxPrecision = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								boolean _setval = false;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MeterEmeraldUnlocked = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								boolean _setval = false;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.BodyControlUnlocked = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								boolean _setval = false;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.GreenGrappleUnlocked = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"advancement revoke @p from jojowos:hierophant_green_achievement");
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
						gate = true;
					}
				}
				if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("MagiciansRed") && gate == false) {
					if (itemstack.getItem() == JojowosModItems.EMPTY_STAND_DISC.get()) {
						{
							String _setval = "none";
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Stand = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = "";
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.StandType = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = "";
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
							boolean _setval = false;
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
						{
							boolean _setval = false;
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.ArrowUsed = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Stand Has Been Removed"), true);
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									("give " + entity.getDisplayName().getString() + " jojowos:magicians_red_disc{display:{Name:\"{\\\"text\\\":\\\"\\\\u00A7f"
											+ (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PlayerName + "'s Stand Disc\\\"}\",Lore:[\"\\\"\\\\u00A76\\\\u00A7lSkin : "
											+ (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin + "\\\"\",\"\\\"\\\\u00A7eLevel : "
											+ new java.text.DecimalFormat("##").format((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Level) + "\\\"\"]}} 1"));
						JojowosMod.queueServerWork(20, () -> {
							{
								String _setval = "Base";
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandSkin = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								boolean _setval = false;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.Evolved = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.CurrentExp = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 1;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.Level = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 100;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxExp = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.SkillPoints = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandPower = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandSpeed = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandDurability = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandPrecision = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandRange = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandPotential = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxPower = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxSpeed = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxDurability = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxRange = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxPotential = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxPrecision = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								boolean _setval = false;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.RedBindUnlocked = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								boolean _setval = false;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.LifeDetectUnlocked = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								boolean _setval = false;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.CrossfireSpecialUnlocked = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"advancement revoke @p from jojowos:magicians_red_achievement");
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
						gate = true;
					}
				}
				if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("SilverChariot") && gate == false) {
					if (itemstack.getItem() == JojowosModItems.EMPTY_STAND_DISC.get()) {
						{
							String _setval = "none";
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Stand = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = "";
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.StandType = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = "";
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
							boolean _setval = false;
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
						{
							boolean _setval = false;
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.ArrowUsed = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Stand Has Been Removed"), true);
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									("give " + entity.getDisplayName().getString() + " jojowos:silver_chariot_disc{display:{Name:\"{\\\"text\\\":\\\"\\\\u00A7f"
											+ (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PlayerName + "'s Stand Disc\\\"}\",Lore:[\"\\\"\\\\u00A76\\\\u00A7lSkin : "
											+ (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin + "\\\"\",\"\\\"\\\\u00A7eLevel : "
											+ new java.text.DecimalFormat("##").format((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Level) + "\\\"\"]}} 1"));
						JojowosMod.queueServerWork(20, () -> {
							{
								String _setval = "Base";
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandSkin = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								boolean _setval = false;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.Evolved = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.CurrentExp = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 1;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.Level = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 100;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxExp = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.SkillPoints = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandPower = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandSpeed = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandDurability = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandPrecision = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandRange = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandPotential = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxPower = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxSpeed = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxDurability = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxRange = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxPotential = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxPrecision = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								boolean _setval = false;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.SwordLaunchUnlocked = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								boolean _setval = false;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ArmorOffUnlocked = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								boolean _setval = false;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.BladeCycloneUnlocked = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"advancement revoke @p from jojowos:silver_chariot_achievement");
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
						gate = true;
					}
				}
				if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("HermitPurple") && gate == false) {
					if (itemstack.getItem() == JojowosModItems.EMPTY_STAND_DISC.get()) {
						{
							String _setval = "none";
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Stand = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = "";
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.StandType = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = "";
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
							boolean _setval = false;
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
						{
							boolean _setval = false;
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.ArrowUsed = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Stand Has Been Removed"), true);
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									("give " + entity.getDisplayName().getString() + " jojowos:hermit_purple_disc{display:{Name:\"{\\\"text\\\":\\\"\\\\u00A7f"
											+ (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PlayerName + "'s Stand Disc\\\"}\",Lore:[\"\\\"\\\\u00A76\\\\u00A7lSkin : "
											+ (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin + "\\\"\",\"\\\"\\\\u00A7eLevel : "
											+ new java.text.DecimalFormat("##").format((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Level) + "\\\"\"]}} 1"));
						JojowosMod.queueServerWork(20, () -> {
							{
								String _setval = "Base";
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandSkin = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								boolean _setval = false;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.Evolved = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.CurrentExp = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 100;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxExp = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 1;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.Level = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.SkillPoints = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandPower = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandSpeed = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandDurability = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandPrecision = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandRange = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandPotential = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxPower = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxSpeed = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxDurability = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxRange = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxPotential = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxPrecision = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"advancement revoke @p from jojowos:hermit_purple_achievement");
							{
								boolean _setval = false;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.DivinationUnlocked = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								boolean _setval = false;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.TangleUnlocked = _setval;
									capability.syncPlayerVariables(entity);
								});
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
						gate = true;
					}
				}
				if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("TheWorld") && gate == false) {
					if (itemstack.getItem() == JojowosModItems.EMPTY_STAND_DISC.get()) {
						{
							String _setval = "none";
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Stand = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = "";
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.StandType = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = "";
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
							boolean _setval = false;
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
						{
							boolean _setval = false;
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.ArrowUsed = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Stand Has Been Removed"), true);
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									("give " + entity.getDisplayName().getString() + " jojowos:the_world_disc{display:{Name:\"{\\\"text\\\":\\\"\\\\u00A7f"
											+ (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PlayerName + "'s Stand Disc\\\"}\",Lore:[\"\\\"\\\\u00A76\\\\u00A7lSkin : "
											+ (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin + "\\\"\",\"\\\"\\\\u00A7eLevel : "
											+ new java.text.DecimalFormat("##").format((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Level) + "\\\"\"]}} 1"));
						JojowosMod.queueServerWork(20, () -> {
							{
								String _setval = "Base";
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandSkin = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								boolean _setval = false;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.Evolved = _setval;
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
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.CurrentExp = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 1;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.Level = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 100;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxExp = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.SkillPoints = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandPower = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandSpeed = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandDurability = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandPrecision = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandRange = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandPotential = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxPower = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxSpeed = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxDurability = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxRange = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxPotential = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxPrecision = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								boolean _setval = false;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MudaKickUnlocked = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								boolean _setval = false;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.KnifeTossUnlocked = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								boolean _setval = false;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.WorldTimeSkipUnlocked = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								boolean _setval = false;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.WorldTimeStopUnlocked = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								boolean _setval = false;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.RoadRollerUnlocked = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"advancement revoke @p from jojowos:the_world_achievement");
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
						gate = true;
					}
				}
				if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("TheFool") && gate == false) {
					if (itemstack.getItem() == JojowosModItems.EMPTY_STAND_DISC.get()) {
						{
							String _setval = "none";
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Stand = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = "";
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.StandType = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = "";
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
							boolean _setval = false;
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
						{
							boolean _setval = false;
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.ArrowUsed = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Stand Has Been Removed"), true);
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									("give " + entity.getDisplayName().getString() + " jojowos:the_fool_disc{display:{Name:\"{\\\"text\\\":\\\"\\\\u00A7f"
											+ (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PlayerName + "'s Stand Disc\\\"}\",Lore:[\"\\\"\\\\u00A76\\\\u00A7lSkin : "
											+ (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin + "\\\"\",\"\\\"\\\\u00A7eLevel : "
											+ new java.text.DecimalFormat("##").format((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Level) + "\\\"\"]}} 1"));
						JojowosMod.queueServerWork(20, () -> {
							{
								String _setval = "Base";
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandSkin = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								boolean _setval = false;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.Evolved = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.CurrentExp = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 1;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.Level = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 100;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxExp = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.SkillPoints = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandPower = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandSpeed = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandDurability = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandPrecision = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandRange = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.StandPotential = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxPower = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxSpeed = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxDurability = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxRange = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxPotential = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = 0;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.MaxPrecision = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								boolean _setval = false;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.SandDomeUnlocked = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								boolean _setval = false;
								entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.SandGlideUnlocked = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"advancement revoke @p from jojowos:the_fool_achievement");
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
						gate = true;
					}
				}
				JojowosMod.queueServerWork(21, () -> {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"attribute @p minecraft:generic.max_health base set 20");
				});
				if ((entity instanceof ServerPlayer _plr103 && _plr103.level() instanceof ServerLevel
						&& _plr103.getAdvancements().getOrStartProgress(_plr103.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:stand_disc_used_achieve"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jojowos:stand_disc_used_achieve"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(JojowosModItems.EMPTY_STAND_DISC.get(), 60);
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(JojowosModItems.STAR_PLATINUM_DISC.get(), 60);
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(JojowosModItems.HIEROPHANT_GREEN_DISC.get(), 60);
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(JojowosModItems.MAGICIANS_RED_DISC.get(), 60);
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(JojowosModItems.SILVER_CHARIOT_DISC.get(), 60);
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(JojowosModItems.HERMIT_PURPLE_DISC.get(), 60);
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(JojowosModItems.THE_WORLD_DISC.get(), 60);
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(JojowosModItems.THE_FOOL_DISC.get(), 60);
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("You don't have a stand!"), true);
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Stand Discs are Disabled!"), true);
		}
	}
}
