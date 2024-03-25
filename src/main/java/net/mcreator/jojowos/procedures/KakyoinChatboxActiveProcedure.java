package net.mcreator.jojowos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;

public class KakyoinChatboxActiveProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double step = 0;
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).KakyoinChatStage).equals("WhatDoYouNeed")) {
			KakyoinChatWhatDoYouNeedProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).KakyoinChatStage).equals("QuestComplete")) {
			KakyoinChatQuestCompleteProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).KakyoinChatStage).equals("QuestKillZombies")) {
			KakyoinChatQuestKillZombiesProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).KakyoinChatStage).equals("QuestKillSkeletons")) {
			KakyoinChatKillQuestSkeletonProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).KakyoinChatStage).equals("QuestKillSpiders")) {
			KakyoinChatKillQuestSpiderProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).KakyoinChatStage).equals("QuestKillCreepers")) {
			KakyoinChatKillQuestCreeperProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).KakyoinChatStage).equals("QuestKillEndermen")) {
			KakyoinChatKillQuestEndermenProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).KakyoinChatStage).equals("QuestKillPiglins")) {
			KakyoinChatKillQuestPiglinProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).KakyoinChatStage).equals("QuestKillPillagers")) {
			KakyoinChatKillQuestPillagerProcedure.execute(world, entity);
		}
	}
}
