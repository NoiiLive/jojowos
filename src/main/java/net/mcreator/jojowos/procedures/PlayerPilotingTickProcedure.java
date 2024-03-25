package net.mcreator.jojowos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.client.Minecraft;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.entity.PlayerControlEntity;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class PlayerPilotingTickProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean gate = false;
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("HierophantGreen")) {
			if ((new Object() {
				public boolean checkGamemode(Entity _ent) {
					if (_ent instanceof ServerPlayer _serverPlayer) {
						return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
					} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
						return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
								&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
					}
					return false;
				}
			}.checkGamemode(entity)) == false && (new Object() {
				public boolean checkGamemode(Entity _ent) {
					if (_ent instanceof ServerPlayer _serverPlayer) {
						return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SPECTATOR;
					} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
						return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
								&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SPECTATOR;
					}
					return false;
				}
			}.checkGamemode(entity)) == false) {
				if (entity instanceof Player _player) {
					_player.getAbilities().mayfly = (entity.getPersistentData().getBoolean("Piloting") == true);
					_player.onUpdateAbilities();
				}
			}
			if (entity.getPersistentData().getBoolean("Piloting") == true) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 10, 0, false, false));
				if (entity.getX() > entity.getPersistentData().getDouble("PilotX") + 50) {
					{
						Entity _ent = entity;
						_ent.teleportTo((entity.getPersistentData().getDouble("PilotX") + 49), y, z);
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((entity.getPersistentData().getDouble("PilotX") + 49), y, z, _ent.getYRot(), _ent.getXRot());
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("You can't go any further!"), true);
				}
				if (entity.getY() > entity.getPersistentData().getDouble("PilotY") + 50) {
					{
						Entity _ent = entity;
						_ent.teleportTo(x, (entity.getPersistentData().getDouble("PilotY") + 49), z);
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(x, (entity.getPersistentData().getDouble("PilotY") + 49), z, _ent.getYRot(), _ent.getXRot());
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("You can't go any further!"), true);
				}
				if (entity.getZ() > entity.getPersistentData().getDouble("PilotZ") + 50) {
					{
						Entity _ent = entity;
						_ent.teleportTo(x, y, (entity.getPersistentData().getDouble("PilotZ") + 49));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(x, y, (entity.getPersistentData().getDouble("PilotZ") + 49), _ent.getYRot(), _ent.getXRot());
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("You can't go any further!"), true);
				}
				if (entity.getX() < entity.getPersistentData().getDouble("PilotX") - 50) {
					{
						Entity _ent = entity;
						_ent.teleportTo((entity.getPersistentData().getDouble("PilotX") - 49), y, z);
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((entity.getPersistentData().getDouble("PilotX") - 49), y, z, _ent.getYRot(), _ent.getXRot());
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("You can't go any further!"), true);
				}
				if (entity.getY() < entity.getPersistentData().getDouble("PilotY") - 50) {
					{
						Entity _ent = entity;
						_ent.teleportTo(x, (entity.getPersistentData().getDouble("PilotY") - 49), z);
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(x, (entity.getPersistentData().getDouble("PilotY") - 49), z, _ent.getYRot(), _ent.getXRot());
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("You can't go any further!"), true);
				}
				if (entity.getZ() < entity.getPersistentData().getDouble("PilotZ") - 50) {
					{
						Entity _ent = entity;
						_ent.teleportTo(x, y, (entity.getPersistentData().getDouble("PilotZ") - 49));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(x, y, (entity.getPersistentData().getDouble("PilotZ") - 49), _ent.getYRot(), _ent.getXRot());
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("You can't go any further!"), true);
				}
			}
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("HierophantGreen")) {
			if (entity.getPersistentData().getBoolean("Controlling") == true) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 10, 0, false, false));
			}
		}
		if (entity.getPersistentData().getBoolean("Controlled") == true) {
			if (new Object() {
				public boolean checkGamemode(Entity _ent) {
					if (_ent instanceof ServerPlayer _serverPlayer) {
						return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
					} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
						return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
								&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SURVIVAL;
					}
					return false;
				}
			}.checkGamemode(entity)) {
				if (entity instanceof ServerPlayer _player)
					_player.setGameMode(GameType.SPECTATOR);
			}
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSummoned == true) {
				StandDespawningProcedure.execute(world, x, y, z, entity);
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof PlayerControlEntity) {
						if ((entityiterator.getPersistentData().getString("ControlledName")).equals((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PlayerName)) {
							{
								Entity _ent = entity;
								_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
							}
							if (gate == false) {
								{
									Entity _entity = entityiterator;
									if (_entity instanceof Player _player) {
										_player.getInventory().armor.set(0, (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY));
										_player.getInventory().setChanged();
									} else if (_entity instanceof LivingEntity _living) {
										_living.setItemSlot(EquipmentSlot.FEET, (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY));
									}
								}
								{
									Entity _entity = entityiterator;
									if (_entity instanceof Player _player) {
										_player.getInventory().armor.set(1, (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY));
										_player.getInventory().setChanged();
									} else if (_entity instanceof LivingEntity _living) {
										_living.setItemSlot(EquipmentSlot.LEGS, (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY));
									}
								}
								{
									Entity _entity = entityiterator;
									if (_entity instanceof Player _player) {
										_player.getInventory().armor.set(2, (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY));
										_player.getInventory().setChanged();
									} else if (_entity instanceof LivingEntity _living) {
										_living.setItemSlot(EquipmentSlot.CHEST, (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY));
									}
								}
								{
									Entity _entity = entityiterator;
									if (_entity instanceof Player _player) {
										_player.getInventory().armor.set(3, (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY));
										_player.getInventory().setChanged();
									} else if (_entity instanceof LivingEntity _living) {
										_living.setItemSlot(EquipmentSlot.HEAD, (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY));
									}
								}
								gate = true;
							}
						}
					}
				}
			}
		}
	}
}
