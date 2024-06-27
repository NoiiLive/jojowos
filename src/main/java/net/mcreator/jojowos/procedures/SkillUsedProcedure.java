package net.mcreator.jojowos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;

public class SkillUsedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSummoned == true || entity.getPersistentData().getBoolean("Piloting") == true)
				&& !((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SpecialType).equals("Item")) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandBlocking == false
					&& (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandGuarding == false) {
				if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilitySelected).equals("Fist Barrage")) {
					StandFistBarrageProcedure.execute(world, x, y, z, entity);
				}
				if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilitySelected).equals("Kick Barrage")) {
					StandKickBarrageProcedure.execute(world, x, y, z, entity);
				}
				if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilitySelected).equals("Sword Barrage")) {
					StandSwordBarrageProcedure.execute(world, x, y, z, entity);
				}
				if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilitySelected).equals("Time Skip")) {
					StandTimeSkipProcedure.execute(world, x, y, z, entity);
				}
				if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilitySelected).equals("Short Timestop")) {
					StandShortTimestopProcedure.execute(world, x, y, z, entity);
				}
				if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilitySelected).equals("Time Stop")) {
					StandTimeStopProcedure.execute(world, x, y, z, entity);
				}
				if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilitySelected).equals("Zoom")) {
					StandZoomProcedure.execute(world, x, y, z, entity);
				}
				if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilitySelected).equals("Bearing Shot")) {
					StandBearingShotProcedure.execute(world, x, y, z, entity);
				}
				if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilitySelected).equals("Inhale")) {
					StandInhaleProcedure.execute(world, x, y, z, entity);
				}
				if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilitySelected).equals("Star Finger")) {
					StandStarFingerProcedure.execute(world, x, y, z, entity);
				}
				if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilitySelected).equals("Emerald Splash")) {
					StandEmeraldSplashProcedure.execute(world, x, y, z, entity);
				}
				if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilitySelected).equals("Emerald Barrier")) {
					StandEmeraldBarrierProcedure.execute(world, x, y, z, entity);
				}
				if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilitySelected).equals("Body Control")) {
					StandBodyControlProcedure.execute(entity);
				}
				if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilitySelected).equals("Grapple")) {
					StandGrappleProcedure.execute(world, x, y, z, entity);
				}
				if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilitySelected).equals("Crossfire Hurricane")) {
					StandCrossfireHurricaneProcedure.execute(world, x, y, z, entity);
				}
				if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilitySelected).equals("Crossfire: Special")) {
					StandCrossfireSpecialProcedure.execute(world, x, y, z, entity);
				}
				if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilitySelected).equals("Red Bind")) {
					StandRedBindProcedure.execute(world, x, y, z, entity);
				}
				if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilitySelected).equals("Life Detector")) {
					StandLifeDetectorProcedure.execute(world, x, y, z, entity);
				}
				if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilitySelected).equals("Blade Cyclone")) {
					StandBladeCycloneProcedure.execute(world, x, y, z, entity);
				}
				if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilitySelected).equals("Sword Launch")) {
					StandSwordLaunchProcedure.execute(world, x, y, z, entity);
				}
				if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilitySelected).equals("Armor Off")) {
					StandArmorOffProcedure.execute(world, x, y, z, entity);
				}
				if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilitySelected).equals("Quicksand")) {
					StandQuicksandProcedure.execute(world, x, y, z, entity);
				}
				if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilitySelected).equals("Sand Glider")) {
					StandSandGlideProcedure.execute(world, x, y, z, entity);
				}
				if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilitySelected).equals("Sand Dome")) {
					StandSandDomeProcedure.execute(world, x, y, z, entity);
				}
				if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilitySelected).equals("Knife Throw")) {
					StandKnifeThrowProcedure.execute(world, x, y, z, entity);
				}
				if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilitySelected).equals("Road Roller")) {
					StandRoadRollerProcedure.execute(world, entity);
				}
				if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilitySelected).equals("Timestop Counter")) {
					StandTimestopCounterProcedure.execute(world, x, y, z, entity);
				}
			}
		}
	}
}
