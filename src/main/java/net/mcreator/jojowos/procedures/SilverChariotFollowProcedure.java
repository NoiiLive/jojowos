package net.mcreator.jojowos.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.init.JojowosModMobEffects;
import net.mcreator.jojowos.init.JojowosModEntities;
import net.mcreator.jojowos.entity.SilverChariotOVAEntity;
import net.mcreator.jojowos.entity.SilverChariotOVAArmorlessEntity;
import net.mcreator.jojowos.entity.SilverChariotMangaEntity;
import net.mcreator.jojowos.entity.SilverChariotMangaArmorlessEntity;
import net.mcreator.jojowos.entity.SilverChariotKokushiboEntity;
import net.mcreator.jojowos.entity.SilverChariotKokushiboArmorlessEntity;
import net.mcreator.jojowos.entity.SilverChariotGoldEntity;
import net.mcreator.jojowos.entity.SilverChariotGoldArmorlessEntity;
import net.mcreator.jojowos.entity.SilverChariotEntity;
import net.mcreator.jojowos.entity.SilverChariotArmorlessEntity;
import net.mcreator.jojowos.JojowosMod;

import java.util.List;
import java.util.Comparator;

public class SilverChariotFollowProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
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
				if (entity instanceof SilverChariotEntity) {
					((SilverChariotEntity) entity).setAnimation("blocking");
				}
				if (entity instanceof SilverChariotArmorlessEntity) {
					((SilverChariotArmorlessEntity) entity).setAnimation("blocking");
				}
				if (entity instanceof SilverChariotGoldEntity) {
					((SilverChariotGoldEntity) entity).setAnimation("blocking");
				}
				if (entity instanceof SilverChariotGoldArmorlessEntity) {
					((SilverChariotGoldArmorlessEntity) entity).setAnimation("blocking");
				}
				if (entity instanceof SilverChariotMangaEntity) {
					((SilverChariotMangaEntity) entity).setAnimation("blocking");
				}
				if (entity instanceof SilverChariotMangaArmorlessEntity) {
					((SilverChariotMangaArmorlessEntity) entity).setAnimation("blocking");
				}
				if (entity instanceof SilverChariotOVAEntity) {
					((SilverChariotOVAEntity) entity).setAnimation("blocking");
				}
				if (entity instanceof SilverChariotOVAArmorlessEntity) {
					((SilverChariotOVAArmorlessEntity) entity).setAnimation("blocking");
				}
				if (entity instanceof SilverChariotKokushiboEntity) {
					((SilverChariotKokushiboEntity) entity).setAnimation("blocking");
				}
				if (entity instanceof SilverChariotKokushiboArmorlessEntity) {
					((SilverChariotKokushiboArmorlessEntity) entity).setAnimation("blocking");
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
				if (entity instanceof SilverChariotEntity) {
					((SilverChariotEntity) entity).setAnimation("blocking");
				}
				if (entity instanceof SilverChariotArmorlessEntity) {
					((SilverChariotArmorlessEntity) entity).setAnimation("blocking");
				}
				if (entity instanceof SilverChariotGoldEntity) {
					((SilverChariotGoldEntity) entity).setAnimation("blocking");
				}
				if (entity instanceof SilverChariotGoldArmorlessEntity) {
					((SilverChariotGoldArmorlessEntity) entity).setAnimation("blocking");
				}
				if (entity instanceof SilverChariotMangaEntity) {
					((SilverChariotMangaEntity) entity).setAnimation("blocking");
				}
				if (entity instanceof SilverChariotMangaArmorlessEntity) {
					((SilverChariotMangaArmorlessEntity) entity).setAnimation("blocking");
				}
				if (entity instanceof SilverChariotOVAEntity) {
					((SilverChariotOVAEntity) entity).setAnimation("blocking");
				}
				if (entity instanceof SilverChariotOVAArmorlessEntity) {
					((SilverChariotOVAArmorlessEntity) entity).setAnimation("blocking");
				}
				if (entity instanceof SilverChariotKokushiboEntity) {
					((SilverChariotKokushiboEntity) entity).setAnimation("blocking");
				}
				if (entity instanceof SilverChariotKokushiboArmorlessEntity) {
					((SilverChariotKokushiboArmorlessEntity) entity).setAnimation("blocking");
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
			if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt91 && _livEnt91.hasEffect(JojowosModMobEffects.NO_ARMOR_CHARIOT.get())) {
				if (entity instanceof SilverChariotEntity) {
					if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt94 && _livEnt94.hasEffect(JojowosModMobEffects.NO_ARMOR_CHARIOT.get())) {
						if (((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt && _livEnt.hasEffect(JojowosModMobEffects.NO_ARMOR_CHARIOT.get())
								? _livEnt.getEffect(JojowosModMobEffects.NO_ARMOR_CHARIOT.get()).getDuration()
								: 0) < 200
										+ ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new JojowosModVariables.PlayerVariables())).StandPotential * 5) {
							chariotgate = true;
						} else {
							chariotgate = false;
						}
						if (chariotgate == false) {
							chariotgate = true;
							JojowosMod.queueServerWork(40, () -> {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = JojowosModEntities.SILVER_CHARIOT_ARMORLESS.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setDeltaMovement(0, 0, 0);
									}
								}
								{
									final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.toList();
									for (Entity entityiterator : _entfound) {
										if (entityiterator instanceof SilverChariotArmorlessEntity) {
											if (entityiterator instanceof TamableAnimal _toTame && (entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _owner)
												_toTame.tame(_owner);
										}
									}
								}
								if (!entity.level().isClientSide())
									entity.discard();
							});
						}
					}
				}
				if (entity instanceof SilverChariotGoldEntity) {
					if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt113 && _livEnt113.hasEffect(JojowosModMobEffects.NO_ARMOR_CHARIOT.get())) {
						if (((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt && _livEnt.hasEffect(JojowosModMobEffects.NO_ARMOR_CHARIOT.get())
								? _livEnt.getEffect(JojowosModMobEffects.NO_ARMOR_CHARIOT.get()).getDuration()
								: 0) < 200
										+ ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new JojowosModVariables.PlayerVariables())).StandPotential * 5) {
							chariotgate = true;
						} else {
							chariotgate = false;
						}
						if (chariotgate == false) {
							chariotgate = true;
							JojowosMod.queueServerWork(40, () -> {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = JojowosModEntities.SILVER_CHARIOT_GOLD_ARMORLESS.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setDeltaMovement(0, 0, 0);
									}
								}
								{
									final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.toList();
									for (Entity entityiterator : _entfound) {
										if (entityiterator instanceof SilverChariotGoldArmorlessEntity) {
											if (entityiterator instanceof TamableAnimal _toTame && (entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _owner)
												_toTame.tame(_owner);
										}
									}
								}
								if (!entity.level().isClientSide())
									entity.discard();
							});
						}
					}
				}
				if (entity instanceof SilverChariotMangaEntity) {
					if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt132 && _livEnt132.hasEffect(JojowosModMobEffects.NO_ARMOR_CHARIOT.get())) {
						if (((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt && _livEnt.hasEffect(JojowosModMobEffects.NO_ARMOR_CHARIOT.get())
								? _livEnt.getEffect(JojowosModMobEffects.NO_ARMOR_CHARIOT.get()).getDuration()
								: 0) < 200
										+ ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new JojowosModVariables.PlayerVariables())).StandPotential * 5) {
							chariotgate = true;
						} else {
							chariotgate = false;
						}
						if (chariotgate == false) {
							chariotgate = true;
							JojowosMod.queueServerWork(40, () -> {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = JojowosModEntities.SILVER_CHARIOT_MANGA_ARMORLESS.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setDeltaMovement(0, 0, 0);
									}
								}
								{
									final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.toList();
									for (Entity entityiterator : _entfound) {
										if (entityiterator instanceof SilverChariotMangaArmorlessEntity) {
											if (entityiterator instanceof TamableAnimal _toTame && (entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _owner)
												_toTame.tame(_owner);
										}
									}
								}
								if (!entity.level().isClientSide())
									entity.discard();
							});
						}
					}
				}
				if (entity instanceof SilverChariotOVAEntity) {
					if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt151 && _livEnt151.hasEffect(JojowosModMobEffects.NO_ARMOR_CHARIOT.get())) {
						if (((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt && _livEnt.hasEffect(JojowosModMobEffects.NO_ARMOR_CHARIOT.get())
								? _livEnt.getEffect(JojowosModMobEffects.NO_ARMOR_CHARIOT.get()).getDuration()
								: 0) < 200
										+ ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new JojowosModVariables.PlayerVariables())).StandPotential * 5) {
							chariotgate = true;
						} else {
							chariotgate = false;
						}
						if (chariotgate == false) {
							chariotgate = true;
							JojowosMod.queueServerWork(40, () -> {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = JojowosModEntities.SILVER_CHARIOT_OVA_ARMORLESS.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setDeltaMovement(0, 0, 0);
									}
								}
								{
									final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.toList();
									for (Entity entityiterator : _entfound) {
										if (entityiterator instanceof SilverChariotOVAArmorlessEntity) {
											if (entityiterator instanceof TamableAnimal _toTame && (entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _owner)
												_toTame.tame(_owner);
										}
									}
								}
								if (!entity.level().isClientSide())
									entity.discard();
							});
						}
					}
				}
				if (entity instanceof SilverChariotKokushiboEntity) {
					if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt170 && _livEnt170.hasEffect(JojowosModMobEffects.NO_ARMOR_CHARIOT.get())) {
						if (((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt && _livEnt.hasEffect(JojowosModMobEffects.NO_ARMOR_CHARIOT.get())
								? _livEnt.getEffect(JojowosModMobEffects.NO_ARMOR_CHARIOT.get()).getDuration()
								: 0) < 200
										+ ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new JojowosModVariables.PlayerVariables())).StandPotential * 5) {
							chariotgate = true;
						} else {
							chariotgate = false;
						}
						if (chariotgate == false) {
							chariotgate = true;
							JojowosMod.queueServerWork(40, () -> {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = JojowosModEntities.SILVER_CHARIOT_KOKUSHIBO_ARMORLESS.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setDeltaMovement(0, 0, 0);
									}
								}
								{
									final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.toList();
									for (Entity entityiterator : _entfound) {
										if (entityiterator instanceof SilverChariotKokushiboArmorlessEntity) {
											if (entityiterator instanceof TamableAnimal _toTame && (entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _owner)
												_toTame.tame(_owner);
										}
									}
								}
								if (!entity.level().isClientSide())
									entity.discard();
							});
						}
					}
				}
			}
		}
	}
}
