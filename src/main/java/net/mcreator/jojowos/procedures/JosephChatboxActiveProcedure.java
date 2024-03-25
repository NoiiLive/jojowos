package net.mcreator.jojowos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;

public class JosephChatboxActiveProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double step = 0;
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).JosephChatStage).equals("WhatDoYouNeed")) {
			JosephChatWhatDoYouNeedProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).JosephChatStage).equals("QuestComplete")) {
			JosephChatQuestCompleteProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).JosephChatStage).equals("QuestKillZombies")) {
			JosephChatQuestKillZombiesProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).JosephChatStage).equals("QuestKillSkeletons")) {
			JosephChatKillQuestSkeletonProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).JosephChatStage).equals("QuestKillSpiders")) {
			JosephChatKillQuestSpiderProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).JosephChatStage).equals("QuestKillCreepers")) {
			JosephChatKillQuestCreeperProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).JosephChatStage).equals("QuestKillEndermen")) {
			JosephChatKillQuestEndermenProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).JosephChatStage).equals("QuestKillPiglins")) {
			JosephChatKillQuestPiglinProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).JosephChatStage).equals("QuestKillPillagers")) {
			JosephChatKillQuestPillagerProcedure.execute(world, entity);
		}
	}
}
