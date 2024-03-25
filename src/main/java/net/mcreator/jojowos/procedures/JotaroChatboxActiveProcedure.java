package net.mcreator.jojowos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;

public class JotaroChatboxActiveProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double step = 0;
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).JotaroChatStage).equals("HaveWeMet")) {
			JotaroChatLevel0Procedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).JotaroChatStage).equals("YouLied")) {
			JotaroChatLevel1Procedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).JotaroChatStage).equals("WhatDoYouNeed")) {
			JotaroChatLevel2Procedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).JotaroChatStage).equals("YareYare")) {
			JotaroChatLevel3Procedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).JotaroChatStage).equals("QuestComplete")) {
			JotaroChatQuestCompleteProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).JotaroChatStage).equals("QuestKillZombies")) {
			JotaroChatQuest1Procedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).JotaroChatStage).equals("QuestKillSkeletons")) {
			JotaroChatKillQuestSkeletonProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).JotaroChatStage).equals("QuestKillSpiders")) {
			JotaroChatKillQuestSpiderProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).JotaroChatStage).equals("QuestKillCreepers")) {
			JotaroChatKillQuestCreeperProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).JotaroChatStage).equals("QuestKillEndermen")) {
			JotaroChatKillQuestEndermenProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).JotaroChatStage).equals("QuestKillPiglins")) {
			JotaroChatKillQuestPiglinProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).JotaroChatStage).equals("QuestKillPillagers")) {
			JotaroChatKillQuestPillagerProcedure.execute(world, entity);
		}
	}
}
