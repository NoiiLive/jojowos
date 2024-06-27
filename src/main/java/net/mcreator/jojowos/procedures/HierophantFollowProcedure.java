package net.mcreator.jojowos.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.entity.HierophantGreenSeroEntity;
import net.mcreator.jojowos.entity.HierophantGreenOVAEntity;
import net.mcreator.jojowos.entity.HierophantGreenMangaEntity;
import net.mcreator.jojowos.entity.HierophantGreenEntity;
import net.mcreator.jojowos.entity.HierophantGreenBlueEntity;

public class HierophantFollowProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double sinYaw = 0;
		double cosYaw = 0;
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
				if (entity instanceof HierophantGreenSeroEntity) {
					((HierophantGreenSeroEntity) entity).setAnimation("blocking");
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
				if (entity instanceof HierophantGreenSeroEntity) {
					((HierophantGreenSeroEntity) entity).setAnimation("blocking");
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
