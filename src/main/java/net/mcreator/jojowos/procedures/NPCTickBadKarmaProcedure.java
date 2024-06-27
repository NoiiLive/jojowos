package net.mcreator.jojowos.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.vehicle.Minecart;
import net.minecraft.world.entity.vehicle.ChestBoat;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.entity.DIOEntity;
import net.mcreator.jojowos.entity.DIOCapedEntity;
import net.mcreator.jojowos.entity.DIOAwakenedEntity;

import java.util.List;
import java.util.Comparator;

public class NPCTickBadKarmaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("Ability1Cooldown") > 0) {
			entity.getPersistentData().putDouble("Ability1Cooldown", (entity.getPersistentData().getDouble("Ability1Cooldown") - 1));
		}
		if (entity.getPersistentData().getDouble("AttackCooldown") > 0) {
			entity.getPersistentData().putDouble("AttackCooldown", (entity.getPersistentData().getDouble("AttackCooldown") - 1));
		}
		if (entity.getPersistentData().getDouble("PassiveCooldown") > 0) {
			entity.getPersistentData().putDouble("PassiveCooldown", (entity.getPersistentData().getDouble("PassiveCooldown") - 1));
		}
		if (entity instanceof DIOEntity || entity instanceof DIOAwakenedEntity || entity instanceof DIOCapedEntity) {
			if ((world instanceof Level _lvl12 && _lvl12.isDay()) == true && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z)) == true && entity.isInWaterRainOrBubble() == false) {
				entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.ON_FIRE)), 2);
			}
		}
		if (entity.isPassenger()) {
			if ((entity.getVehicle()) instanceof Boat || (entity.getVehicle()) instanceof ChestBoat || (entity.getVehicle()) instanceof Minecart) {
				entity.stopRiding();
			}
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof Player) {
					if ((entityiterator.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Karma >= 25) {
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
						}.checkGamemode(entityiterator)) {
							if (entity instanceof Mob _entity && entityiterator instanceof LivingEntity _ent)
								_entity.setTarget(_ent);
						}
					}
				}
			}
		}
	}
}
