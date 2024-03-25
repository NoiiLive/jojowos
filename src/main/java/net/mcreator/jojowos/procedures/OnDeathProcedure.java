package net.mcreator.jojowos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.entity.PlayerDummyEntity;
import net.mcreator.jojowos.entity.PlayerControllingEntity;
import net.mcreator.jojowos.entity.PlayerControlEntity;
import net.mcreator.jojowos.entity.HermitRedTangleEntity;
import net.mcreator.jojowos.entity.HermitPurpleTangleEntity;
import net.mcreator.jojowos.entity.HermitPart4TangleEntity;
import net.mcreator.jojowos.entity.HermitMangaTangleEntity;
import net.mcreator.jojowos.entity.HermitGoldTangleEntity;
import net.mcreator.jojowos.entity.HermitBlueTangleEntity;
import net.mcreator.jojowos.configuration.ConfigFilesConfiguration;
import net.mcreator.jojowos.JojowosMod;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Comparator;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class OnDeathProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSummoned == true) {
			{
				boolean _setval = false;
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.StandSummoned = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			StandDespawningProcedure.execute(world, x, y, z, entity);
		}
		if (entity.getPersistentData().getBoolean("Piloting") == true) {
			{
				final Vec3 _center = new Vec3((entity.getPersistentData().getDouble("PilotX")), (entity.getPersistentData().getDouble("PilotY")), (entity.getPersistentData().getDouble("PilotZ")));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(64 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof PlayerDummyEntity) {
						if ((entityiterator instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) == entity) {
							{
								Entity _entity = entity;
								if (_entity instanceof Player _player) {
									_player.getInventory().armor.set(0, ((entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).copy()));
									_player.getInventory().setChanged();
								} else if (_entity instanceof LivingEntity _living) {
									_living.setItemSlot(EquipmentSlot.FEET, ((entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).copy()));
								}
							}
							{
								Entity _entity = entity;
								if (_entity instanceof Player _player) {
									_player.getInventory().armor.set(1, ((entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).copy()));
									_player.getInventory().setChanged();
								} else if (_entity instanceof LivingEntity _living) {
									_living.setItemSlot(EquipmentSlot.LEGS, ((entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).copy()));
								}
							}
							{
								Entity _entity = entity;
								if (_entity instanceof Player _player) {
									_player.getInventory().armor.set(2, ((entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).copy()));
									_player.getInventory().setChanged();
								} else if (_entity instanceof LivingEntity _living) {
									_living.setItemSlot(EquipmentSlot.CHEST, ((entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).copy()));
								}
							}
							{
								Entity _entity = entity;
								if (_entity instanceof Player _player) {
									_player.getInventory().armor.set(3, ((entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).copy()));
									_player.getInventory().setChanged();
								} else if (_entity instanceof LivingEntity _living) {
									_living.setItemSlot(EquipmentSlot.HEAD, ((entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).copy()));
								}
							}
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"particle minecraft:dust 0.263 0.278 0.29 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
							if (!entityiterator.level().isClientSide())
								entityiterator.discard();
						}
					}
				}
			}
			entity.getPersistentData().putBoolean("Piloting", false);
		}
		if (entity.getPersistentData().getBoolean("Controlling") == true) {
			{
				final Vec3 _center = new Vec3((entity.getPersistentData().getDouble("PilotX")), (entity.getPersistentData().getDouble("PilotY")), (entity.getPersistentData().getDouble("PilotZ")));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(64 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof PlayerControllingEntity) {
						if ((entityiterator.getPersistentData().getString("ControllerName")).equals((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PlayerName)) {
							{
								Entity _entity = entity;
								if (_entity instanceof Player _player) {
									_player.getInventory().armor.set(0, ((entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).copy()));
									_player.getInventory().setChanged();
								} else if (_entity instanceof LivingEntity _living) {
									_living.setItemSlot(EquipmentSlot.FEET, ((entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).copy()));
								}
							}
							{
								Entity _entity = entity;
								if (_entity instanceof Player _player) {
									_player.getInventory().armor.set(1, ((entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).copy()));
									_player.getInventory().setChanged();
								} else if (_entity instanceof LivingEntity _living) {
									_living.setItemSlot(EquipmentSlot.LEGS, ((entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).copy()));
								}
							}
							{
								Entity _entity = entity;
								if (_entity instanceof Player _player) {
									_player.getInventory().armor.set(2, ((entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).copy()));
									_player.getInventory().setChanged();
								} else if (_entity instanceof LivingEntity _living) {
									_living.setItemSlot(EquipmentSlot.CHEST, ((entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).copy()));
								}
							}
							{
								Entity _entity = entity;
								if (_entity instanceof Player _player) {
									_player.getInventory().armor.set(3, ((entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).copy()));
									_player.getInventory().setChanged();
								} else if (_entity instanceof LivingEntity _living) {
									_living.setItemSlot(EquipmentSlot.HEAD, ((entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).copy()));
								}
							}
							if (!entityiterator.level().isClientSide())
								entityiterator.discard();
						}
					}
				}
			}
			for (Entity entityiterator : new ArrayList<>(world.players())) {
				if ((entityiterator.getPersistentData().getString("ControllerName")).equals((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PlayerName)) {
					if (entityiterator.getPersistentData().getBoolean("Controlled") == true) {
						entityiterator.getPersistentData().putBoolean("Controlled", false);
						if (entityiterator instanceof ServerPlayer _player)
							_player.setGameMode(GameType.SURVIVAL);
					}
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(64 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof PlayerControlEntity) {
						if ((entityiterator.getPersistentData().getString("ControllerName")).equals((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PlayerName)) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"particle minecraft:dust 0.263 0.278 0.29 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
							if (!entityiterator.level().isClientSide())
								entityiterator.discard();
						}
					}
				}
			}
			entity.getPersistentData().putBoolean("Controlling", false);
		}
		if (ConfigFilesConfiguration.LOSESTANDONDEATH.get() == true) {
			if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("StarPlatinum")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"advancement revoke @p from jojowos:star_platinum_achievement");
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
				{
					String _setval = "none";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Stand = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (ConfigFilesConfiguration.SINGLEPLAYERSTAND.get() == true) {
					JojowosModVariables.MapVariables.get(world).StarPlatinumObtained = false;
					JojowosModVariables.MapVariables.get(world).syncData(world);
					JojowosMod.LOGGER.info("Star Platinum is Now Obtainable");
				}
			}
			if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("HierophantGreen")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"advancement revoke @p from jojowos:hierophant_green_achievement");
				{
					boolean _setval = false;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.GreenGrappleUnlocked = _setval;
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
					String _setval = "none";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Stand = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (ConfigFilesConfiguration.SINGLEPLAYERSTAND.get() == true) {
					JojowosModVariables.MapVariables.get(world).HierophantGreenObtained = false;
					JojowosModVariables.MapVariables.get(world).syncData(world);
					JojowosMod.LOGGER.info("Hierophant Green is Now Obtainable");
				}
			}
			if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("MagiciansRed")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"advancement revoke @p from jojowos:magicians_red_achievement");
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
				{
					String _setval = "none";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Stand = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (ConfigFilesConfiguration.SINGLEPLAYERSTAND.get() == true) {
					JojowosModVariables.MapVariables.get(world).MagiciansRedObtained = false;
					JojowosModVariables.MapVariables.get(world).syncData(world);
					JojowosMod.LOGGER.info("Magician's Red is Now Obtainable");
				}
			}
			if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("SilverChariot")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"advancement revoke @p from jojowos:silver_chariot_achievement");
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
				{
					String _setval = "none";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Stand = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (ConfigFilesConfiguration.SINGLEPLAYERSTAND.get() == true) {
					JojowosModVariables.MapVariables.get(world).SilverChariotObtained = false;
					JojowosModVariables.MapVariables.get(world).syncData(world);
					JojowosMod.LOGGER.info("Silver Chariot is Now Obtainable ");
				}
			}
			if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("HermitPurple")) {
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
				{
					String _setval = "none";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Stand = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (ConfigFilesConfiguration.SINGLEPLAYERSTAND.get() == true) {
					JojowosModVariables.MapVariables.get(world).HermitPurpleObtained = false;
					JojowosModVariables.MapVariables.get(world).syncData(world);
					JojowosMod.LOGGER.info("Hermit Purple is Now Obtainable");
				}
			}
			if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("TheWorld")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"advancement revoke @p from jojowos:the_world_achievement");
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
				{
					String _setval = "none";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Stand = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (ConfigFilesConfiguration.SINGLEPLAYERSTAND.get() == true) {
					JojowosModVariables.MapVariables.get(world).TheWorldObtained = false;
					JojowosModVariables.MapVariables.get(world).syncData(world);
					JojowosMod.LOGGER.info("The World is Now Obtainable");
				}
			}
			if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("TheFool")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"advancement revoke @p from jojowos:the_fool_achievement");
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
				{
					String _setval = "none";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Stand = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (ConfigFilesConfiguration.SINGLEPLAYERSTAND.get() == true) {
					JojowosModVariables.MapVariables.get(world).TheFoolObtained = false;
					JojowosModVariables.MapVariables.get(world).syncData(world);
					JojowosMod.LOGGER.info("The Fool is Now Obtainable");
				}
			}
			{
				String _setval = "";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.StandType = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "Base";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.StandSkin = _setval;
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
				double _setval = 0;
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CurrentExp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.MaxExp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
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
			{
				boolean _setval = false;
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Evolved = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"attribute @p minecraft:generic.max_health base set 20");
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(32 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof HermitBlueTangleEntity) {
					if (entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) {
						if (!entityiterator.level().isClientSide())
							entityiterator.discard();
					}
				}
				if (entityiterator instanceof HermitGoldTangleEntity) {
					if (entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) {
						if (!entityiterator.level().isClientSide())
							entityiterator.discard();
					}
				}
				if (entityiterator instanceof HermitMangaTangleEntity) {
					if (entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) {
						if (!entityiterator.level().isClientSide())
							entityiterator.discard();
					}
				}
				if (entityiterator instanceof HermitPart4TangleEntity) {
					if (entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) {
						if (!entityiterator.level().isClientSide())
							entityiterator.discard();
					}
				}
				if (entityiterator instanceof HermitPurpleTangleEntity) {
					if (entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) {
						if (!entityiterator.level().isClientSide())
							entityiterator.discard();
					}
				}
				if (entityiterator instanceof HermitRedTangleEntity) {
					if (entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) {
						if (!entityiterator.level().isClientSide())
							entityiterator.discard();
					}
				}
			}
		}
	}
}
