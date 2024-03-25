package net.mcreator.jojowos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.jojowos.network.JojowosModVariables;

public class AvdolChatboxActiveProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double step = 0;
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AvdolChatStage).equals("TskTsk")) {
			AvdolChatTskTskProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AvdolChatStage).equals("YesIAm")) {
			AvdolChatYesIAmProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AvdolChatStage).equals("WhatDoYouNeed")) {
			AvdolChatWhatDoYouNeedProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AvdolChatStage).equals("QuestComplete")) {
			AvdolChatQuestCompleteProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AvdolChatStage).equals("QuestKillZombies")) {
			AvdolChatQuestKillZombiesProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AvdolChatStage).equals("QuestKillSkeletons")) {
			AvdolChatKillQuestSkeletonProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AvdolChatStage).equals("QuestKillSpiders")) {
			AvdolChatKillQuestSpiderProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AvdolChatStage).equals("QuestKillCreepers")) {
			AvdolChatKillQuestCreeperProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AvdolChatStage).equals("QuestKillEndermen")) {
			AvdolChatKillQuestEndermenProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AvdolChatStage).equals("QuestKillPiglins")) {
			AvdolChatKillQuestPiglinProcedure.execute(world, entity);
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AvdolChatStage).equals("QuestKillPillagers")) {
			AvdolChatKillQuestPillagerProcedure.execute(world, entity);
		}
	}
}
