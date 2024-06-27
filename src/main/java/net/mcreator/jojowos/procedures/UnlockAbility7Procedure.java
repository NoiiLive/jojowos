package net.mcreator.jojowos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;

public class UnlockAbility7Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility7).equals("Fist Barrage")) {
			UnlockBarrageProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility7).equals("Kick Barrage")) {
			UnlockKickBarrageProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility7).equals("Sword Barrage")) {
			UnlockSwordBarrageProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility7).equals("Bearing Shot")) {
			UnlockBearingShotProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility7).equals("Inhale")) {
			UnlockInhaleProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility7).equals("Star Finger")) {
			UnlockStarFingerProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility7).equals("Time Skip")) {
			UnlockTimeSkipProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility7).equals("Short Timestop")) {
			UnlockShortTimestopProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility7).equals("Time Stop")) {
			UnlockTimeStopProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility7).equals("Knife Throw")) {
			UnlockKnifeThrowProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility7).equals("Road Roller")) {
			UnlockRoadRollerProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility7).equals("Crossfire Hurricane")) {
			UnlockCrossfireHurricaneProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility7).equals("Crossfire: Special")) {
			UnlockCrossfireSpecialProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility7).equals("Red Bind")) {
			UnlockRedBindProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility7).equals("Life Detector")) {
			UnlockLifeDetectorProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility7).equals("Tangle")) {
			UnlockTangleProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility7).equals("Grapple")) {
			UnlockGrappleProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility7).equals("Emerald Splash")) {
			UnlockEmeraldSplashProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility7).equals("Emerald Barrier")) {
			UnlockEmeraldBarrierProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility7).equals("Body Control")) {
			UnlockBodyControlProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility7).equals("Sword Launch")) {
			UnlockSwordLaunchProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility7).equals("Blade Cyclone")) {
			UnlockBladeCycloneProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility7).equals("Armor Off")) {
			UnlockArmorOffProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility7).equals("Quicksand")) {
			UnlockQuicksandProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility7).equals("Sand Dome")) {
			UnlockSandDomeProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility7).equals("Sand Glider")) {
			UnlockSandGliderProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility7).equals("Divination")) {
			UnlockDivinationProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility7).equals("Zoom")) {
			UnlockZoomProcedure.execute(world, x, y, z, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SetAbility7).equals("Timestop Counter")) {
			UnlockTimestopCounterProcedure.execute(world, x, y, z, entity);
		}
	}
}
