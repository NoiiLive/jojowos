package net.mcreator.jojowos.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.entity.MagiciansRedRinOkumuraEntity;
import net.mcreator.jojowos.entity.MagiciansRedOVAEntity;
import net.mcreator.jojowos.entity.MagiciansRedMangaEntity;
import net.mcreator.jojowos.entity.MagiciansRedEntity;
import net.mcreator.jojowos.entity.MagiciansRedASBEntity;
import net.mcreator.jojowos.entity.MagiciansGreenEntity;

public class MagiciansRedFollowProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		boolean chariotgate = false;
		double player_yaw = 0;
		double entity_yaw = 0;
		double difference = 0;
		double rotation_speed = 0;
		double rotation_step = 0;
		double max_rotation_step = 0;
		double rotation_direction = 0;
		double cosYaw = 0;
		double sinYaw = 0;
		if (entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) {
			sinYaw = Math.sin(Math.toRadians((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getYRot()));
			cosYaw = Math.cos(Math.toRadians((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getYRot()));
			if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getPersistentData().getBoolean("Attack") == true) {
				{
					Entity _ent = entity;
					_ent.teleportTo(((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getX() + sinYaw * (-0.6) + cosYaw * (-1) * 1),
							((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getY() + 0.5), ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getZ() + cosYaw * (-0.6) * (-1) - sinYaw * 1));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getX() + sinYaw * (-0.6) + cosYaw * (-1) * 1),
								((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getY() + 0.5),
								((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getZ() + cosYaw * (-0.6) * (-1) - sinYaw * 1), _ent.getYRot(), _ent.getXRot());
				}
			} else if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getPersistentData().getBoolean("Infront") == true) {
				{
					Entity _ent = entity;
					_ent.teleportTo(((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getX() + sinYaw * (-1) + cosYaw * (-1) * 0.6),
							((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getY() + 0.5), ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getZ() + cosYaw * (-1) * (-1) - sinYaw * 0.6));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getX() + sinYaw * (-1) + cosYaw * (-1) * 0.6),
								((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getY() + 0.5),
								((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getZ() + cosYaw * (-1) * (-1) - sinYaw * 0.6), _ent.getYRot(), _ent.getXRot());
				}
			} else if ((((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandBlocking == true
					|| ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandGuarding == true)
					&& (entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).isSprinting() == false) {
				{
					Entity _ent = entity;
					_ent.teleportTo(((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getX() + sinYaw * (-1.2) + cosYaw * (-1) * 0),
							((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getY() + 0.5), ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getZ() + cosYaw * (-1) * (-1.2) - sinYaw * 0));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getX() + sinYaw * (-1.2) + cosYaw * (-1) * 0),
								((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getY() + 0.5),
								((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getZ() + cosYaw * (-1) * (-1.2) - sinYaw * 0), _ent.getYRot(), _ent.getXRot());
				}
				if (entity instanceof MagiciansRedEntity) {
					((MagiciansRedEntity) entity).setAnimation("blocking");
				}
				if (entity instanceof MagiciansGreenEntity) {
					((MagiciansGreenEntity) entity).setAnimation("blocking");
				}
				if (entity instanceof MagiciansRedASBEntity) {
					((MagiciansRedASBEntity) entity).setAnimation("blocking");
				}
				if (entity instanceof MagiciansRedMangaEntity) {
					((MagiciansRedMangaEntity) entity).setAnimation("blocking");
				}
				if (entity instanceof MagiciansRedOVAEntity) {
					((MagiciansRedOVAEntity) entity).setAnimation("blocking");
				}
				if (entity instanceof MagiciansRedRinOkumuraEntity) {
					((MagiciansRedRinOkumuraEntity) entity).setAnimation("blocking");
				}
			} else if ((((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandBlocking == true
					|| ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandGuarding == true)
					&& (entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).isSprinting() == true) {
				{
					Entity _ent = entity;
					_ent.teleportTo(((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getX() + sinYaw * (-2) + cosYaw * (-1) * 0),
							((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getY() + 0.5), ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getZ() + cosYaw * (-1) * (-2) - sinYaw * 0));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getX() + sinYaw * (-2) + cosYaw * (-1) * 0),
								((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getY() + 0.5),
								((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getZ() + cosYaw * (-1) * (-2) - sinYaw * 0), _ent.getYRot(), _ent.getXRot());
				}
				if (entity instanceof MagiciansRedEntity) {
					((MagiciansRedEntity) entity).setAnimation("blocking");
				}
				if (entity instanceof MagiciansGreenEntity) {
					((MagiciansGreenEntity) entity).setAnimation("blocking");
				}
				if (entity instanceof MagiciansRedASBEntity) {
					((MagiciansRedASBEntity) entity).setAnimation("blocking");
				}
				if (entity instanceof MagiciansRedMangaEntity) {
					((MagiciansRedMangaEntity) entity).setAnimation("blocking");
				}
				if (entity instanceof MagiciansRedOVAEntity) {
					((MagiciansRedOVAEntity) entity).setAnimation("blocking");
				}
				if (entity instanceof MagiciansRedRinOkumuraEntity) {
					((MagiciansRedRinOkumuraEntity) entity).setAnimation("blocking");
				}
			} else if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).isSprinting()) {
				{
					Entity _ent = entity;
					_ent.teleportTo(((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getX() + sinYaw * (-1) + cosYaw * (-1) * 1.2),
							((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getY() + 0.5), ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getZ() + cosYaw * (-1) * (-1) - sinYaw * 1.2));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getX() + sinYaw * (-1) + cosYaw * (-1) * 1.2),
								((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getY() + 0.5),
								((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getZ() + cosYaw * (-1) * (-1) - sinYaw * 1.2), _ent.getYRot(), _ent.getXRot());
				}
			} else if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getDeltaMovement().horizontalDistanceSqr() > 1.0E-6D) {
				{
					Entity _ent = entity;
					_ent.teleportTo(((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getX() + sinYaw * (-1.2) + cosYaw * (-1) * 1.2),
							((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getY() + 0.5),
							((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getZ() + cosYaw * (-1) * (-1.2) - sinYaw * 1.2));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getX() + sinYaw * (-1.2) + cosYaw * (-1) * 1.2),
								((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getY() + 0.5),
								((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getZ() + cosYaw * (-1) * (-1.2) - sinYaw * 1.2), _ent.getYRot(), _ent.getXRot());
				}
			} else {
				{
					Entity _ent = entity;
					_ent.teleportTo(((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getX() + sinYaw * (-0.2) + cosYaw * (-1) * 1.2),
							((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getY() + 0.5),
							((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getZ() + cosYaw * (-1) * (-0.2) - sinYaw * 1.2));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getX() + sinYaw * (-0.2) + cosYaw * (-1) * 1.2),
								((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getY() + 0.5),
								((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getZ() + cosYaw * (-1) * (-0.2) - sinYaw * 1.2), _ent.getYRot(), _ent.getXRot());
				}
			}
		}
	}
}
