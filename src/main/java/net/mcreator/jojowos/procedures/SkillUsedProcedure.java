package net.mcreator.jojowos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;

public class SkillUsedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSummoned == true || entity.getPersistentData().getBoolean("Piloting") == true) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandBlocking == false
					&& (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandGuarding == false) {
				if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("StarPlatinum")) {
					if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SelectedSkill).equals("Ora Barrage")) {
						StarPlatinumOraBarrageProcedure.execute(world, x, y, z, entity);
					}
					if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SelectedSkill).equals("Star Finger")) {
						StarPlatinumStarFingerProcedure.execute(world, x, y, z, entity);
					}
					if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SelectedSkill).equals("Inhale")) {
						StarPlatinumInhaleProcedure.execute(world, x, y, z, entity);
					}
					if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SelectedSkill).equals("Bearing Shot")) {
						StarPlatinumBearingProcedure.execute(world, x, y, z, entity);
					}
					if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SelectedSkill).equals("Time Skip")) {
						StarPlatinumTimeSkipProcedure.execute(world, x, y, z, entity);
					}
					if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SelectedSkill).equals("Time Stop")) {
						StarPlatinumTimeStopProcedure.execute(world, x, y, z, entity);
					}
				}
				if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("HierophantGreen")) {
					if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SelectedSkill).equals("Emerald Splash")) {
						HierophantEmeraldSplashProcedure.execute(world, x, y, z, entity);
					}
					if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SelectedSkill).equals("Emerald Barrier")) {
						HierophantGreen20MeterEmeraldProcedure.execute(world, x, y, z, entity);
					}
					if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SelectedSkill).equals("Body Control")) {
						HierophantBodyControlProcedure.execute(world, x, y, z, entity);
					}
					if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SelectedSkill).equals("Grapple")) {
						HierophantGreenGrappleProcedure.execute(world, x, y, z, entity);
					}
				}
				if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("MagiciansRed")) {
					if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SelectedSkill).equals("Crossfire Hurricane")) {
						MagiciansRedCrossfireProcedure.execute(world, x, y, z, entity);
					}
					if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SelectedSkill).equals("Crossfire Hurricane Special")) {
						MagiciansRedCrossfireSpecialProcedure.execute(world, x, y, z, entity);
					}
					if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SelectedSkill).equals("Red Bind")) {
						MagiciansRedRedBindProcedure.execute(world, x, y, z, entity);
					}
					if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SelectedSkill).equals("Life Detector")) {
						MagiciansRedLifeDetectorProcedure.execute(world, x, y, z, entity);
					}
				}
				if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("SilverChariot")) {
					if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SelectedSkill).equals("Hora Rush")) {
						SilverChariotHoraRushProcedure.execute(world, x, y, z, entity);
					}
					if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SelectedSkill).equals("Sword Launch")) {
						SilverChariotSwordShotProcedure.execute(world, x, y, z, entity);
					}
					if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SelectedSkill).equals("Armor Off")) {
						SilverChariotArmorOffProcedure.execute(world, x, y, z, entity);
					}
					if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SelectedSkill).equals("Blade Cyclone")) {
						SilverChariotCycloneProcedure.execute(world, x, y, z, entity);
					}
				}
				if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("TheWorld")) {
					if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SelectedSkill).equals("Muda Barrage")) {
						TheWorldMudaBarrageProcedure.execute(world, x, y, z, entity);
					}
					if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SelectedSkill).equals("Muda Kick Barrage")) {
						TheWorldMudaKickBarrageProcedure.execute(world, x, y, z, entity);
					}
					if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SelectedSkill).equals("Knife Toss")) {
						TheWorldKnifeThrowProcedure.execute(world, x, y, z, entity);
					}
					if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SelectedSkill).equals("Time Skip")) {
						TheWorldTimeSkipProcedure.execute(world, x, y, z, entity);
					}
					if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SelectedSkill).equals("Time Stop")) {
						TheWorldTimeStopProcedure.execute(world, x, y, z, entity);
					}
					if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SelectedSkill).equals("Road Roller")) {
						TheWorldRoadRollerProcedure.execute(world, entity);
					}
				}
				if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("TheFool")) {
					if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SelectedSkill).equals("Quicksand")) {
						TheFoolQuicksandProcedure.execute(world, x, y, z, entity);
					}
					if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SelectedSkill).equals("Sand Dome")) {
						TheFoolSandDomeProcedure.execute(world, x, y, z, entity);
					}
					if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SelectedSkill).equals("Sand Glider")) {
						TheFoolSandGlideProcedure.execute(world, x, y, z, entity);
					}
				}
			}
		}
	}
}
