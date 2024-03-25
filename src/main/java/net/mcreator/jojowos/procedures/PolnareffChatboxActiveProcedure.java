package net.mcreator.jojowos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;

public class PolnareffChatboxActiveProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double step = 0;
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PolnareffChatStage).equals("NonNon")) {
			PolnareffChatNonNonProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PolnareffChatStage).equals("DontUnderstand")) {
			PolnareffChatDontUnderstandProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PolnareffChatStage).equals("WhatDoYouNeed")) {
			PolnareffChatWhatDoYouNeedProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PolnareffChatStage).equals("QuestComplete")) {
			PolnareffChatQuestCompleteProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PolnareffChatStage).equals("QuestKillZombies")) {
			PolnareffChatQuestKillZombiesProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PolnareffChatStage).equals("QuestKillSkeletons")) {
			PolnareffChatKillQuestSkeletonProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PolnareffChatStage).equals("QuestKillSpiders")) {
			PolnareffChatKillQuestSpiderProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PolnareffChatStage).equals("QuestKillCreepers")) {
			PolnareffChatKillQuestCreeperProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PolnareffChatStage).equals("QuestKillEndermen")) {
			PolnareffChatKillQuestEndermenProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PolnareffChatStage).equals("QuestKillPiglins")) {
			PolnareffChatKillQuestPiglinProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PolnareffChatStage).equals("QuestKillPillagers")) {
			PolnareffChatKillQuestPillagerProcedure.execute(world, entity);
		}
	}
}
