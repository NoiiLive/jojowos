package net.mcreator.jojowos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;

public class DioChatboxActiveProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double step = 0;
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).DioChatStage).equals("WishToJoinMe")) {
			DioChatJoinMeProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).DioChatStage).equals("ThenDie")) {
			DioChatThenDieProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).DioChatStage).equals("WhatDoYouNeed")) {
			DioChatWhatDoYouNeedProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).DioChatStage).equals("QuestComplete")) {
			DioChatQuestCompleteProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).DioChatStage).equals("QuestKillZombies")) {
			DioChatQuestKillZombiesProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).DioChatStage).equals("QuestKillSkeletons")) {
			DioChatQuestKillSkeletonsProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).DioChatStage).equals("QuestKillSpiders")) {
			DioChatQuestKillSpidersProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).DioChatStage).equals("QuestKillCreepers")) {
			DioChatQuestKillCreepersProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).DioChatStage).equals("QuestKillEndermen")) {
			DioChatQuestKillEndermenProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).DioChatStage).equals("QuestKillPiglins")) {
			DioChatQuestKillPiglinsProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).DioChatStage).equals("QuestKillPillagers")) {
			DioChatQuestKillPillagersProcedure.execute(world, entity);
		}
	}
}
