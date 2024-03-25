package net.mcreator.jojowos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerSandGlidingProcedure {
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
		if (entity.getPersistentData().getBoolean("SandGliding") == true) {
			if (entity.onGround()) {
				StandDespawningProcedure.execute(world, x, y, z, entity);
				entity.getPersistentData().putBoolean("SandGliding", false);
			}
		}
		if (entity.getPersistentData().getBoolean("Inhaled1") == true) {
			entity.setDeltaMovement(new Vec3((entity.getPersistentData().getDouble("Inhale1x")), 0, (entity.getPersistentData().getDouble("Inhale1z"))));
		}
		if (entity.getPersistentData().getBoolean("Inhaled2") == true) {
			entity.setDeltaMovement(new Vec3((entity.getPersistentData().getDouble("Inhale2x")), 0, (entity.getPersistentData().getDouble("Inhale2z"))));
		}
		if (entity.getPersistentData().getBoolean("Inhaled3") == true) {
			entity.setDeltaMovement(new Vec3((entity.getPersistentData().getDouble("Inhale3x")), 0, (entity.getPersistentData().getDouble("Inhale3z"))));
		}
	}
}
