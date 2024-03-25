package net.mcreator.jojowos.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.jojowos.network.JojowosModVariables;

public class PolnareffChatButton2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean gate = false;
		double randomnumber = 0;
		gate = false;
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PolnareffChatStage).equals("NonNon") && gate == false) {
			if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).ChatButton2).equals("Non!")) {
				{
					String _setval = "";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextLine1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextLine2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextLine3 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep3 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextLine4 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep4 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "PolnareffSmile";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCIcon = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:polnareff_non")), SoundSource.HOSTILE, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:polnareff_non")), SoundSource.HOSTILE, 1, 1, false);
					}
				}
				{
					String _setval = "WhatDoYouNeed";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.PolnareffChatStage = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "Nothing";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ChatButton1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "Quest";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ChatButton2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			gate = true;
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PolnareffChatStage).equals("WhatDoYouNeed") && gate == false) {
			if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).ChatButton2).equals("Quest")) {
				randomnumber = Mth.nextInt(RandomSource.create(), 1, 7);
				{
					String _setval = "";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextLine1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextLine2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextLine3 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep3 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextLine4 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep4 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "PolnareffSmile";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCIcon = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:polnareff_non")), SoundSource.HOSTILE, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:polnareff_non")), SoundSource.HOSTILE, 1, 1, false);
					}
				}
				if (randomnumber == 1) {
					{
						String _setval = "QuestKillZombies";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.PolnareffChatStage = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (randomnumber == 2) {
					{
						String _setval = "QuestKillSkeletons";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.PolnareffChatStage = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (randomnumber == 3) {
					{
						String _setval = "QuestKillSpiders";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.PolnareffChatStage = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (randomnumber == 4) {
					{
						String _setval = "QuestKillCreepers";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.PolnareffChatStage = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (randomnumber == 5) {
					{
						String _setval = "QuestKillEndermen";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.PolnareffChatStage = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (randomnumber == 6) {
					{
						String _setval = "QuestKillPiglins";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.PolnareffChatStage = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (randomnumber == 7) {
					{
						String _setval = "QuestKillPillagers";
						entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.PolnareffChatStage = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				{
					String _setval = "Decline";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ChatButton1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "Accept";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ChatButton2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			gate = true;
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PolnareffChatStage).equals("QuestKillZombies") && gate == false) {
			if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).ChatButton2).equals("Accept")) {
				{
					String _setval = "";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextLine1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextLine2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextLine3 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep3 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextLine4 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep4 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof Player _player)
					_player.closeContainer();
				PolnareffKillZombieQuestProcedure.execute(entity);
			}
			gate = true;
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PolnareffChatStage).equals("QuestKillSkeletons") && gate == false) {
			if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).ChatButton2).equals("Accept")) {
				{
					String _setval = "";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextLine1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextLine2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextLine3 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep3 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextLine4 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep4 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof Player _player)
					_player.closeContainer();
				PolnareffKillSkeletonQuestProcedure.execute(entity);
			}
			gate = true;
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PolnareffChatStage).equals("QuestKillSpiders") && gate == false) {
			if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).ChatButton2).equals("Accept")) {
				{
					String _setval = "";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextLine1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextLine2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextLine3 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep3 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextLine4 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep4 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof Player _player)
					_player.closeContainer();
				PolnareffKillSpiderQuestProcedure.execute(entity);
			}
			gate = true;
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PolnareffChatStage).equals("QuestKillCreepers") && gate == false) {
			if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).ChatButton2).equals("Accept")) {
				{
					String _setval = "";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextLine1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextLine2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextLine3 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep3 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextLine4 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep4 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof Player _player)
					_player.closeContainer();
				PolnareffKillCreeperQuestProcedure.execute(entity);
			}
			gate = true;
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PolnareffChatStage).equals("QuestKillEndermen") && gate == false) {
			if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).ChatButton2).equals("Accept")) {
				{
					String _setval = "";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextLine1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextLine2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextLine3 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep3 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextLine4 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep4 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof Player _player)
					_player.closeContainer();
				PolnareffKillEndermenQuestProcedure.execute(entity);
			}
			gate = true;
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PolnareffChatStage).equals("QuestKillPiglins") && gate == false) {
			if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).ChatButton2).equals("Accept")) {
				{
					String _setval = "";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextLine1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextLine2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextLine3 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep3 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextLine4 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep4 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof Player _player)
					_player.closeContainer();
				PolnareffKillPiglinQuestProcedure.execute(entity);
			}
			gate = true;
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PolnareffChatStage).equals("QuestKillPillagers") && gate == false) {
			if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).ChatButton2).equals("Accept")) {
				{
					String _setval = "";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextLine1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextLine2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextLine3 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep3 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextLine4 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.NPCTextStep4 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof Player _player)
					_player.closeContainer();
				PolnareffKillPillagerQuestProcedure.execute(entity);
			}
			gate = true;
		}
	}
}
