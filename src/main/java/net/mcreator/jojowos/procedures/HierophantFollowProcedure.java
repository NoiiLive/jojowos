package net.mcreator.jojowos.procedures;

import net.minecraft.world.scores.PlayerTeam;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.entity.HierophantGreenOVAEntity;
import net.mcreator.jojowos.entity.HierophantGreenMangaEntity;
import net.mcreator.jojowos.entity.HierophantGreenEntity;
import net.mcreator.jojowos.entity.HierophantGreenBlueEntity;

public class HierophantFollowProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double player_yaw = 0;
		double entity_yaw = 0;
		double difference = 0;
		double rotation_speed = 0;
		double rotation_step = 0;
		double max_rotation_step = 0;
		double rotation_direction = 0;
		boolean chariotgate = false;
		if (entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) {
			if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getPersistentData().getBoolean("Attack") == true) {
				{
					Entity _ent = entity;
					_ent.teleportTo(
							((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getX() + Math.sin(Math.toRadians((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getYRot())) * (-0.6)
									+ Math.cos(Math.toRadians((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getYRot())) * (-1) * 1),
							((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getY() + 0.5),
							((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getZ() + Math.cos(Math.toRadians((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getYRot())) * (-0.6) * (-1)
									- Math.sin(Math.toRadians((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getYRot())) * 1));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(
								((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getX() + Math.sin(Math.toRadians((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getYRot())) * (-0.6)
										+ Math.cos(Math.toRadians((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getYRot())) * (-1) * 1),
								((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getY() + 0.5),
								((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getZ()
										+ Math.cos(Math.toRadians((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getYRot())) * (-0.6) * (-1)
										- Math.sin(Math.toRadians((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getYRot())) * 1),
								_ent.getYRot(), _ent.getXRot());
				}
			} else if ((((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandBlocking == true
					|| ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandGuarding == true)
					&& (entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).isSprinting() == false) {
				{
					Entity _ent = entity;
					_ent.teleportTo(
							((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getX() + Math.sin(Math.toRadians((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getYRot())) * (-1.2)
									+ Math.cos(Math.toRadians((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getYRot())) * (-1) * 0),
							((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getY() + 0.5),
							((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getZ() + Math.cos(Math.toRadians((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getYRot())) * (-1) * (-1.2)
									- Math.sin(Math.toRadians((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getYRot())) * 0));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(
								((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getX() + Math.sin(Math.toRadians((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getYRot())) * (-1.2)
										+ Math.cos(Math.toRadians((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getYRot())) * (-1) * 0),
								((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getY() + 0.5),
								((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getZ()
										+ Math.cos(Math.toRadians((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getYRot())) * (-1) * (-1.2)
										- Math.sin(Math.toRadians((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getYRot())) * 0),
								_ent.getYRot(), _ent.getXRot());
				}
				if (entity instanceof HierophantGreenEntity) {
					((HierophantGreenEntity) entity).setAnimation("blocking");
				}
				if (entity instanceof HierophantGreenBlueEntity) {
					((HierophantGreenBlueEntity) entity).setAnimation("blocking");
				}
				if (entity instanceof HierophantGreenMangaEntity) {
					((HierophantGreenMangaEntity) entity).setAnimation("blocking");
				}
				if (entity instanceof HierophantGreenOVAEntity) {
					((HierophantGreenOVAEntity) entity).setAnimation("blocking");
				}
			} else if ((((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandBlocking == true
					|| ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandGuarding == true)
					&& (entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).isSprinting() == true) {
				{
					Entity _ent = entity;
					_ent.teleportTo(
							((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getX() + Math.sin(Math.toRadians((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getYRot())) * (-2)
									+ Math.cos(Math.toRadians((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getYRot())) * (-1) * 0),
							((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getY() + 0.5),
							((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getZ() + Math.cos(Math.toRadians((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getYRot())) * (-1) * (-2)
									- Math.sin(Math.toRadians((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getYRot())) * 0));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(
								((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getX() + Math.sin(Math.toRadians((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getYRot())) * (-2)
										+ Math.cos(Math.toRadians((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getYRot())) * (-1) * 0),
								((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getY() + 0.5),
								((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getZ() + Math.cos(Math.toRadians((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getYRot())) * (-1) * (-2)
										- Math.sin(Math.toRadians((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getYRot())) * 0),
								_ent.getYRot(), _ent.getXRot());
				}
				if (entity instanceof HierophantGreenEntity) {
					((HierophantGreenEntity) entity).setAnimation("blocking");
				}
				if (entity instanceof HierophantGreenBlueEntity) {
					((HierophantGreenBlueEntity) entity).setAnimation("blocking");
				}
				if (entity instanceof HierophantGreenMangaEntity) {
					((HierophantGreenMangaEntity) entity).setAnimation("blocking");
				}
				if (entity instanceof HierophantGreenOVAEntity) {
					((HierophantGreenOVAEntity) entity).setAnimation("blocking");
				}
			} else {
				{
					Entity _ent = entity;
					_ent.teleportTo(
							((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getX() + Math.sin(Math.toRadians((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getYRot())) * (-0.2)
									+ Math.cos(Math.toRadians((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getYRot())) * (-1) * 1.2),
							((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getY() + 0.5),
							((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getZ() + Math.cos(Math.toRadians((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getYRot())) * (-1) * (-0.2)
									- Math.sin(Math.toRadians((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getYRot())) * 1.2));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(
								((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getX() + Math.sin(Math.toRadians((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getYRot())) * (-0.2)
										+ Math.cos(Math.toRadians((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getYRot())) * (-1) * 1.2),
								((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getY() + 0.5),
								((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getZ()
										+ Math.cos(Math.toRadians((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getYRot())) * (-1) * (-0.2)
										- Math.sin(Math.toRadians((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getYRot())) * 1.2),
								_ent.getYRot(), _ent.getXRot());
				}
			}
		}
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 10, 1, false, false));
		if (((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt81 && _livEnt81.hasEffect(MobEffects.INVISIBILITY)) == false) {
			if (entity.getPersistentData().getBoolean("StandVisibleTeam") == false) {
				entity.getPersistentData().putBoolean("StandInvisibleTeam", false);
				{
					Entity _entityTeam = entity;
					PlayerTeam _pt = _entityTeam.level().getScoreboard().getPlayerTeam("stand_user_visible");
					if (_pt != null) {
						if (_entityTeam instanceof Player _player)
							_entityTeam.level().getScoreboard().addPlayerToTeam(_player.getGameProfile().getName(), _pt);
						else
							_entityTeam.level().getScoreboard().addPlayerToTeam(_entityTeam.getStringUUID(), _pt);
					}
				}
				entity.getPersistentData().putBoolean("StandVisibleTeam", true);
			}
		} else if (((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt87 && _livEnt87.hasEffect(MobEffects.INVISIBILITY)) == true) {
			if (entity.getPersistentData().getBoolean("StandInvisibleTeam") == false) {
				entity.getPersistentData().putBoolean("StandVisibleTeam", false);
				{
					Entity _entityTeam = entity;
					PlayerTeam _pt = _entityTeam.level().getScoreboard().getPlayerTeam("stand_user_invisible");
					if (_pt != null) {
						if (_entityTeam instanceof Player _player)
							_entityTeam.level().getScoreboard().addPlayerToTeam(_player.getGameProfile().getName(), _pt);
						else
							_entityTeam.level().getScoreboard().addPlayerToTeam(_entityTeam.getStringUUID(), _pt);
					}
				}
				entity.getPersistentData().putBoolean("StandInvisibleTeam", true);
			}
		}
		if (entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) {
			if (entity.getPersistentData().getDouble("RotationLag") == 0) {
				rotation_speed = 36;
				player_yaw = (entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getYRot();
				entity_yaw = entity.getYRot();
				if (player_yaw != entity_yaw) {
					difference = player_yaw - entity_yaw;
					if (difference > 180) {
						difference = difference - 360;
					}
					if (difference < -180) {
						difference = difference + 360;
					}
					if (Math.abs(player_yaw) < 180) {
						if (Math.abs(difference) < rotation_speed) {
							rotation_step = 0;
						} else {
							if (difference > 0) {
								rotation_direction = 1;
							} else {
								rotation_direction = -1;
							}
							max_rotation_step = rotation_direction * Math.abs(rotation_speed);
							if (Math.abs(difference) <= max_rotation_step) {
								rotation_step = 0;
							} else {
								rotation_step = max_rotation_step;
							}
						}
					} else {
						rotation_step = 0;
					}
					entity_yaw = entity_yaw + rotation_step;
					if (entity_yaw > 180) {
						entity_yaw = entity_yaw - 360;
					}
					if (entity_yaw < -180) {
						entity_yaw = entity_yaw + 360;
					}
					{
						Entity _ent = entity;
						_ent.setYRot((float) entity_yaw);
						_ent.setXRot(entity.getXRot());
						_ent.setYBodyRot(_ent.getYRot());
						_ent.setYHeadRot(_ent.getYRot());
						_ent.yRotO = _ent.getYRot();
						_ent.xRotO = _ent.getXRot();
						if (_ent instanceof LivingEntity _entity) {
							_entity.yBodyRotO = _entity.getYRot();
							_entity.yHeadRotO = _entity.getYRot();
						}
					}
					entity.getPersistentData().putDouble("RotationLag", 2);
				}
			}
		}
		if (entity.getPersistentData().getDouble("RotationLag") > 0) {
			entity.getPersistentData().putDouble("RotationLag", (entity.getPersistentData().getDouble("RotationLag") - 1));
		}
	}
}
