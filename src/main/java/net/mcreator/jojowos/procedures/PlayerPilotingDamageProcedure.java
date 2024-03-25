package net.mcreator.jojowos.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.client.Minecraft;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.entity.PlayerDummyEntity;
import net.mcreator.jojowos.entity.PlayerControllingEntity;
import net.mcreator.jojowos.entity.PlayerControlEntity;
import net.mcreator.jojowos.JojowosMod;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Comparator;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class PlayerPilotingDamageProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
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
		if (entity instanceof Player) {
			if (entity.getPersistentData().getBoolean("Piloting") == true) {
				{
					Entity _ent = entity;
					_ent.teleportTo((entity.getPersistentData().getDouble("PilotX")), (entity.getPersistentData().getDouble("PilotY")), (entity.getPersistentData().getDouble("PilotZ")));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport((entity.getPersistentData().getDouble("PilotX")), (entity.getPersistentData().getDouble("PilotY")), (entity.getPersistentData().getDouble("PilotZ")), _ent.getYRot(), _ent.getXRot());
				}
				JojowosMod.queueServerWork(5, () -> {
					{
						final Vec3 _center = new Vec3((entity.getPersistentData().getDouble("PilotX")), (entity.getPersistentData().getDouble("PilotY")), (entity.getPersistentData().getDouble("PilotZ")));
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
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
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												"particle minecraft:dust 0.263 0.278 0.29 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
									if (!entityiterator.level().isClientSide())
										entityiterator.discard();
								}
							}
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(entity.getPersistentData().getDouble("PilotX"), entity.getPersistentData().getDouble("PilotY"), entity.getPersistentData().getDouble("PilotZ")),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:stand_unsummon")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound((entity.getPersistentData().getDouble("PilotX")), (entity.getPersistentData().getDouble("PilotY")), (entity.getPersistentData().getDouble("PilotZ")),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:stand_unsummon")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					entity.getPersistentData().putBoolean("Piloting", false);
				});
			}
		}
		if (entity instanceof Player) {
			if (entity.getPersistentData().getBoolean("Controlling") == true) {
				{
					final Vec3 _center = new Vec3((entity.getPersistentData().getDouble("PilotX")), (entity.getPersistentData().getDouble("PilotY")), (entity.getPersistentData().getDouble("PilotZ")));
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
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
								{
									Entity _ent = entity;
									_ent.teleportTo((entity.getPersistentData().getDouble("PilotX")), (entity.getPersistentData().getDouble("PilotY")), (entity.getPersistentData().getDouble("PilotZ")));
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport((entity.getPersistentData().getDouble("PilotX")), (entity.getPersistentData().getDouble("PilotY")), (entity.getPersistentData().getDouble("PilotZ")), _ent.getYRot(),
												_ent.getXRot());
								}
								if (!entityiterator.level().isClientSide())
									entityiterator.discard();
							}
						}
					}
				}
				for (Entity entityiterator : new ArrayList<>(world.players())) {
					if (entityiterator.getPersistentData().getBoolean("Controlled") == true) {
						if ((entityiterator.getPersistentData().getString("ControllerName")).equals((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PlayerName)) {
							entityiterator.getPersistentData().putBoolean("Controlled", false);
							if (new Object() {
								public boolean checkGamemode(Entity _ent) {
									if (_ent instanceof ServerPlayer _serverPlayer) {
										return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SPECTATOR;
									} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
										return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
												&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SPECTATOR;
									}
									return false;
								}
							}.checkGamemode(entityiterator)) {
								if (entityiterator instanceof ServerPlayer _player)
									_player.setGameMode(GameType.SURVIVAL);
							}
						}
					}
				}
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof PlayerControlEntity) {
							if ((entityiterator.getPersistentData().getString("ControllerName")).equals((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PlayerName)) {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"particle minecraft:dust 0.263 0.278 0.29 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
								if (!entityiterator.level().isClientSide())
									entityiterator.discard();
							}
						}
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:stand_unsummon")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:stand_unsummon")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				entity.getPersistentData().putBoolean("Controlling", false);
			}
		}
	}
}
