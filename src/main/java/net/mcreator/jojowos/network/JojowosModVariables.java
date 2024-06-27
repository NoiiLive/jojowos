package net.mcreator.jojowos.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.mcreator.jojowos.JojowosMod;

import java.util.function.Supplier;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class JojowosModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		JojowosMod.addNetworkMessage(SavedDataSyncMessage.class, SavedDataSyncMessage::buffer, SavedDataSyncMessage::new, SavedDataSyncMessage::handler);
		JojowosMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.Stand = original.Stand;
			clone.StandType = original.StandType;
			clone.StandObtained = original.StandObtained;
			clone.PlayerName = original.PlayerName;
			clone.StandSkin = original.StandSkin;
			clone.PlayerSpawned = original.PlayerSpawned;
			clone.GATE = original.GATE;
			clone.SpecialType = original.SpecialType;
			clone.TimeStopLength = original.TimeStopLength;
			clone.MaxExp = original.MaxExp;
			clone.CurrentExp = original.CurrentExp;
			clone.Level = original.Level;
			clone.StandPower = original.StandPower;
			clone.StandSpeed = original.StandSpeed;
			clone.StandDurability = original.StandDurability;
			clone.StandPrecision = original.StandPrecision;
			clone.StandPotential = original.StandPotential;
			clone.SkillPoints = original.SkillPoints;
			clone.MaxPower = original.MaxPower;
			clone.MaxSpeed = original.MaxSpeed;
			clone.MaxDurability = original.MaxDurability;
			clone.MaxPotential = original.MaxPotential;
			clone.MaxPrecision = original.MaxPrecision;
			clone.Karma = original.Karma;
			clone.CurrentQuest = original.CurrentQuest;
			clone.ArrowWorthy = original.ArrowWorthy;
			clone.NPCIcon = original.NPCIcon;
			clone.NPCTextLine1 = original.NPCTextLine1;
			clone.NPCTextLine2 = original.NPCTextLine2;
			clone.NPCTextLine3 = original.NPCTextLine3;
			clone.NPCTextLine4 = original.NPCTextLine4;
			clone.JotaroChatStage = original.JotaroChatStage;
			clone.NPCTextStep1 = original.NPCTextStep1;
			clone.NPCTextStep2 = original.NPCTextStep2;
			clone.NPCTextStep3 = original.NPCTextStep3;
			clone.NPCTextStep4 = original.NPCTextStep4;
			clone.ChatButton1 = original.ChatButton1;
			clone.ChatButton2 = original.ChatButton2;
			clone.ToggleShiftMove = original.ToggleShiftMove;
			clone.HamonUser = original.HamonUser;
			clone.Vampire = original.Vampire;
			clone.AbilityWheelGUI = original.AbilityWheelGUI;
			clone.NoCooldown = original.NoCooldown;
			clone.MainQuest = original.MainQuest;
			clone.SideQuest1 = original.SideQuest1;
			clone.SideQuest2 = original.SideQuest2;
			clone.SideQuest3 = original.SideQuest3;
			clone.SideQuest4 = original.SideQuest4;
			clone.SideQuestObjective1 = original.SideQuestObjective1;
			clone.SideQuestObjective2 = original.SideQuestObjective2;
			clone.SideQuestObjective3 = original.SideQuestObjective3;
			clone.SideQuestObjective4 = original.SideQuestObjective4;
			clone.SideQuestTotalObjective1 = original.SideQuestTotalObjective1;
			clone.SideQuestTotalObjective2 = original.SideQuestTotalObjective2;
			clone.SideQuestTotalObjective3 = original.SideQuestTotalObjective3;
			clone.SideQuestTotalObjective4 = original.SideQuestTotalObjective4;
			clone.SideQuestGiver1 = original.SideQuestGiver1;
			clone.SideQuestGiver2 = original.SideQuestGiver2;
			clone.SideQuestGiver3 = original.SideQuestGiver3;
			clone.SideQuestGiver4 = original.SideQuestGiver4;
			clone.DioChatStage = original.DioChatStage;
			clone.PolnareffChatStage = original.PolnareffChatStage;
			clone.JosephChatStage = original.JosephChatStage;
			clone.KakyoinChatStage = original.KakyoinChatStage;
			clone.AvdolChatStage = original.AvdolChatStage;
			clone.UseAbilityType = original.UseAbilityType;
			clone.HEUseAbilityType = original.HEUseAbilityType;
			clone.StarPlatinumSkinsUnlocked = original.StarPlatinumSkinsUnlocked;
			clone.MagiciansRedSkinsUnlocked = original.MagiciansRedSkinsUnlocked;
			clone.HierophantGreenSkinsUnlocked = original.HierophantGreenSkinsUnlocked;
			clone.SilverChariotSkinsUnlocked = original.SilverChariotSkinsUnlocked;
			clone.HermitPurpleSkinsUnlocked = original.HermitPurpleSkinsUnlocked;
			clone.TheFoolSkinsUnlocked = original.TheFoolSkinsUnlocked;
			clone.TheWorldSkinsUnlocked = original.TheWorldSkinsUnlocked;
			clone.AbilitySlot1 = original.AbilitySlot1;
			clone.AbilitySlot2 = original.AbilitySlot2;
			clone.AbilitySlot3 = original.AbilitySlot3;
			clone.AbilitySlot4 = original.AbilitySlot4;
			clone.AbilitySlot5 = original.AbilitySlot5;
			clone.AbilitySlot6 = original.AbilitySlot6;
			clone.AbilitySlot7 = original.AbilitySlot7;
			clone.AbilitySlot8 = original.AbilitySlot8;
			clone.AbilitySlot9 = original.AbilitySlot9;
			clone.MovesUnlocked = original.MovesUnlocked;
			clone.SetAbility1 = original.SetAbility1;
			clone.SetAbility2 = original.SetAbility2;
			clone.SetAbility3 = original.SetAbility3;
			clone.SetAbility4 = original.SetAbility4;
			clone.SetAbility5 = original.SetAbility5;
			clone.SetAbility6 = original.SetAbility6;
			clone.SetAbility7 = original.SetAbility7;
			clone.SetAbility8 = original.SetAbility8;
			clone.SetAbility9 = original.SetAbility9;
			clone.StandColor = original.StandColor;
			clone.PlayerTitle = original.PlayerTitle;
			clone.UnlockedTitles = original.UnlockedTitles;
			clone.TitleColor = original.TitleColor;
			if (!event.isWasDeath()) {
				clone.StandSummoned = original.StandSummoned;
				clone.AttackLevel = original.AttackLevel;
				clone.ItemStandSummoned = original.ItemStandSummoned;
				clone.HermitSearch = original.HermitSearch;
				clone.PolaroidGeneration = original.PolaroidGeneration;
				clone.SelectedSkill = original.SelectedSkill;
				clone.SkillNumber = original.SkillNumber;
				clone.TimeStop = original.TimeStop;
				clone.SwitchWheels = original.SwitchWheels;
				clone.StandBlocking = original.StandBlocking;
				clone.AttacksBlocked = original.AttacksBlocked;
				clone.BlockingCooldown = original.BlockingCooldown;
				clone.StandGuarding = original.StandGuarding;
				clone.AbilityCooldown1 = original.AbilityCooldown1;
				clone.AbilityCooldown2 = original.AbilityCooldown2;
				clone.AbilityCooldown3 = original.AbilityCooldown3;
				clone.AbilityCooldown4 = original.AbilityCooldown4;
				clone.AbilityCooldown5 = original.AbilityCooldown5;
				clone.AbilityCooldown6 = original.AbilityCooldown6;
				clone.AbilityCooldown7 = original.AbilityCooldown7;
				clone.AbilityCooldown8 = original.AbilityCooldown8;
				clone.AbilityCooldown9 = original.AbilityCooldown9;
				clone.SwitcherSlot = original.SwitcherSlot;
				clone.AbilitySelected = original.AbilitySelected;
				clone.UsingDisc = original.UsingDisc;
				clone.AddEXPAmount = original.AddEXPAmount;
			}
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				SavedData mapdata = MapVariables.get(event.getEntity().level());
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (mapdata != null)
					JojowosMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					JojowosMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (worlddata != null)
					JojowosMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "jojowos_worldvars";

		public static WorldVariables load(CompoundTag tag) {
			WorldVariables data = new WorldVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level level && !level.isClientSide())
				JojowosMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(level::dimension), new SavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(e -> WorldVariables.load(e), WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends SavedData {
		public static final String DATA_NAME = "jojowos_mapvars";
		public boolean DaylightChanged = false;
		public boolean HamonEra = false;
		public boolean FireDamageChanged = false;
		public boolean StarPlatinumObtained = false;
		public boolean MagiciansRedObtained = false;
		public boolean SilverChariotObtained = false;
		public boolean HierophantGreenObtained = false;
		public boolean HermitPurpleObtained = false;
		public boolean TheFoolObtained = false;
		public boolean TheWorldObtained = false;
		public String StarPlatinumUser = "None";
		public String MagiciansRedUser = "None";
		public String HierophantGreenUser = "None";
		public String HermitPurpleUser = "None";
		public String SilverChariotUser = "None";
		public String TheFoolUser = "None";
		public String TheWorldUser = "None";

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			DaylightChanged = nbt.getBoolean("DaylightChanged");
			HamonEra = nbt.getBoolean("HamonEra");
			FireDamageChanged = nbt.getBoolean("FireDamageChanged");
			StarPlatinumObtained = nbt.getBoolean("StarPlatinumObtained");
			MagiciansRedObtained = nbt.getBoolean("MagiciansRedObtained");
			SilverChariotObtained = nbt.getBoolean("SilverChariotObtained");
			HierophantGreenObtained = nbt.getBoolean("HierophantGreenObtained");
			HermitPurpleObtained = nbt.getBoolean("HermitPurpleObtained");
			TheFoolObtained = nbt.getBoolean("TheFoolObtained");
			TheWorldObtained = nbt.getBoolean("TheWorldObtained");
			StarPlatinumUser = nbt.getString("StarPlatinumUser");
			MagiciansRedUser = nbt.getString("MagiciansRedUser");
			HierophantGreenUser = nbt.getString("HierophantGreenUser");
			HermitPurpleUser = nbt.getString("HermitPurpleUser");
			SilverChariotUser = nbt.getString("SilverChariotUser");
			TheFoolUser = nbt.getString("TheFoolUser");
			TheWorldUser = nbt.getString("TheWorldUser");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putBoolean("DaylightChanged", DaylightChanged);
			nbt.putBoolean("HamonEra", HamonEra);
			nbt.putBoolean("FireDamageChanged", FireDamageChanged);
			nbt.putBoolean("StarPlatinumObtained", StarPlatinumObtained);
			nbt.putBoolean("MagiciansRedObtained", MagiciansRedObtained);
			nbt.putBoolean("SilverChariotObtained", SilverChariotObtained);
			nbt.putBoolean("HierophantGreenObtained", HierophantGreenObtained);
			nbt.putBoolean("HermitPurpleObtained", HermitPurpleObtained);
			nbt.putBoolean("TheFoolObtained", TheFoolObtained);
			nbt.putBoolean("TheWorldObtained", TheWorldObtained);
			nbt.putString("StarPlatinumUser", StarPlatinumUser);
			nbt.putString("MagiciansRedUser", MagiciansRedUser);
			nbt.putString("HierophantGreenUser", HierophantGreenUser);
			nbt.putString("HermitPurpleUser", HermitPurpleUser);
			nbt.putString("SilverChariotUser", SilverChariotUser);
			nbt.putString("TheFoolUser", TheFoolUser);
			nbt.putString("TheWorldUser", TheWorldUser);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level && !world.isClientSide())
				JojowosMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new SavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAcc) {
				return serverLevelAcc.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(e -> MapVariables.load(e), MapVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class SavedDataSyncMessage {
		private final int type;
		private SavedData data;

		public SavedDataSyncMessage(FriendlyByteBuf buffer) {
			this.type = buffer.readInt();
			CompoundTag nbt = buffer.readNbt();
			if (nbt != null) {
				this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
				if (this.data instanceof MapVariables mapVariables)
					mapVariables.read(nbt);
				else if (this.data instanceof WorldVariables worldVariables)
					worldVariables.read(nbt);
			}
		}

		public SavedDataSyncMessage(int type, SavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(SavedDataSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeInt(message.type);
			if (message.data != null)
				buffer.writeNbt(message.data.save(new CompoundTag()));
		}

		public static void handler(SavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer() && message.data != null) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("jojowos", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public boolean StandSummoned = false;
		public String Stand = "none";
		public String StandType = "";
		public boolean StandObtained = false;
		public String PlayerName = "";
		public String StandSkin = "Base";
		public boolean PlayerSpawned = false;
		public boolean GATE = false;
		public double AttackLevel = 1.0;
		public boolean ItemStandSummoned = false;
		public String HermitSearch = "";
		public String PolaroidGeneration = "";
		public String SpecialType = "";
		public String SelectedSkill = "[ ]";
		public double SkillNumber = 0.0;
		public boolean TimeStop = false;
		public double TimeStopLength = 0.0;
		public double MaxExp = 100.0;
		public double CurrentExp = 0.0;
		public double Level = 1.0;
		public double StandPower = 0.0;
		public double StandSpeed = 0.0;
		public double StandDurability = 0.0;
		public double StandPrecision = 0.0;
		public double StandPotential = 0.0;
		public double SkillPoints = 0.0;
		public double MaxPower = 0.0;
		public double MaxSpeed = 0.0;
		public double MaxDurability = 0.0;
		public double MaxPotential = 0.0;
		public double MaxPrecision = 0.0;
		public double Karma = 0.0;
		public String CurrentQuest = "";
		public boolean ArrowWorthy = true;
		public String NPCIcon = "";
		public String NPCTextLine1 = "";
		public String NPCTextLine2 = "";
		public String NPCTextLine3 = "";
		public String NPCTextLine4 = "";
		public String JotaroChatStage = "HaveWeMet";
		public double NPCTextStep1 = 0.0;
		public double NPCTextStep2 = 0.0;
		public double NPCTextStep3 = 0.0;
		public double NPCTextStep4 = 0.0;
		public String ChatButton1 = "";
		public String ChatButton2 = "";
		public boolean ToggleShiftMove = true;
		public boolean HamonUser = false;
		public boolean Vampire = false;
		public double AbilityWheelGUI = 1.0;
		public boolean SwitchWheels = false;
		public boolean NoCooldown = false;
		public String MainQuest = "[WIP]";
		public String SideQuest1 = "None";
		public String SideQuest2 = "None";
		public String SideQuest3 = "None";
		public String SideQuest4 = "None";
		public double SideQuestObjective1 = 0.0;
		public double SideQuestObjective2 = 0.0;
		public double SideQuestObjective3 = 0.0;
		public double SideQuestObjective4 = 0.0;
		public double SideQuestTotalObjective1 = 0.0;
		public double SideQuestTotalObjective2 = 0.0;
		public double SideQuestTotalObjective3 = 0.0;
		public double SideQuestTotalObjective4 = 0.0;
		public String SideQuestGiver1 = "None";
		public String SideQuestGiver2 = "None";
		public String SideQuestGiver3 = "None";
		public String SideQuestGiver4 = "None";
		public String DioChatStage = "WishToJoinMe";
		public String PolnareffChatStage = "NonNon";
		public String JosephChatStage = "WhatDoYouNeed";
		public String KakyoinChatStage = "WhatDoYouNeed";
		public String AvdolChatStage = "TskTsk";
		public String UseAbilityType = "Wheel";
		public String HEUseAbilityType = "";
		public boolean StandBlocking = false;
		public double AttacksBlocked = 0.0;
		public double BlockingCooldown = 0.0;
		public boolean StandGuarding = false;
		public String StarPlatinumSkinsUnlocked = "";
		public String MagiciansRedSkinsUnlocked = "";
		public String HierophantGreenSkinsUnlocked = "";
		public String SilverChariotSkinsUnlocked = "";
		public String HermitPurpleSkinsUnlocked = "";
		public String TheFoolSkinsUnlocked = "";
		public String TheWorldSkinsUnlocked = "";
		public double AbilityCooldown1 = 0.0;
		public double AbilityCooldown2 = 0.0;
		public double AbilityCooldown3 = 0.0;
		public double AbilityCooldown4 = 0.0;
		public double AbilityCooldown5 = 0.0;
		public double AbilityCooldown6 = 0.0;
		public double AbilityCooldown7 = 0.0;
		public double AbilityCooldown8 = 0.0;
		public double AbilityCooldown9 = 0.0;
		public String AbilitySlot1 = "None";
		public String AbilitySlot2 = "None";
		public String AbilitySlot3 = "None";
		public String AbilitySlot4 = "None";
		public String AbilitySlot5 = "None";
		public String AbilitySlot6 = "None";
		public String AbilitySlot7 = "None";
		public String AbilitySlot8 = "None";
		public String AbilitySlot9 = "None";
		public double SwitcherSlot = 0.0;
		public String AbilitySelected = "[ ]";
		public String MovesUnlocked = "";
		public String SetAbility1 = "";
		public String SetAbility2 = "";
		public String SetAbility3 = "";
		public String SetAbility4 = "";
		public String SetAbility5 = "";
		public String SetAbility6 = "";
		public String SetAbility7 = "";
		public String SetAbility8 = "";
		public String SetAbility9 = "";
		public String StandColor = "";
		public boolean UsingDisc = false;
		public double AddEXPAmount = 1.0;
		public String PlayerTitle = "";
		public String UnlockedTitles = " ";
		public String TitleColor = "f";

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				JojowosMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(entity.level()::dimension), new PlayerVariablesSyncMessage(this, entity.getId()));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putBoolean("StandSummoned", StandSummoned);
			nbt.putString("Stand", Stand);
			nbt.putString("StandType", StandType);
			nbt.putBoolean("StandObtained", StandObtained);
			nbt.putString("PlayerName", PlayerName);
			nbt.putString("StandSkin", StandSkin);
			nbt.putBoolean("PlayerSpawned", PlayerSpawned);
			nbt.putBoolean("GATE", GATE);
			nbt.putDouble("AttackLevel", AttackLevel);
			nbt.putBoolean("ItemStandSummoned", ItemStandSummoned);
			nbt.putString("HermitSearch", HermitSearch);
			nbt.putString("PolaroidGeneration", PolaroidGeneration);
			nbt.putString("SpecialType", SpecialType);
			nbt.putString("SelectedSkill", SelectedSkill);
			nbt.putDouble("SkillNumber", SkillNumber);
			nbt.putBoolean("TimeStop", TimeStop);
			nbt.putDouble("TimeStopLength", TimeStopLength);
			nbt.putDouble("MaxExp", MaxExp);
			nbt.putDouble("CurrentExp", CurrentExp);
			nbt.putDouble("Level", Level);
			nbt.putDouble("StandPower", StandPower);
			nbt.putDouble("StandSpeed", StandSpeed);
			nbt.putDouble("StandDurability", StandDurability);
			nbt.putDouble("StandPrecision", StandPrecision);
			nbt.putDouble("StandPotential", StandPotential);
			nbt.putDouble("SkillPoints", SkillPoints);
			nbt.putDouble("MaxPower", MaxPower);
			nbt.putDouble("MaxSpeed", MaxSpeed);
			nbt.putDouble("MaxDurability", MaxDurability);
			nbt.putDouble("MaxPotential", MaxPotential);
			nbt.putDouble("MaxPrecision", MaxPrecision);
			nbt.putDouble("Karma", Karma);
			nbt.putString("CurrentQuest", CurrentQuest);
			nbt.putBoolean("ArrowWorthy", ArrowWorthy);
			nbt.putString("NPCIcon", NPCIcon);
			nbt.putString("NPCTextLine1", NPCTextLine1);
			nbt.putString("NPCTextLine2", NPCTextLine2);
			nbt.putString("NPCTextLine3", NPCTextLine3);
			nbt.putString("NPCTextLine4", NPCTextLine4);
			nbt.putString("JotaroChatStage", JotaroChatStage);
			nbt.putDouble("NPCTextStep1", NPCTextStep1);
			nbt.putDouble("NPCTextStep2", NPCTextStep2);
			nbt.putDouble("NPCTextStep3", NPCTextStep3);
			nbt.putDouble("NPCTextStep4", NPCTextStep4);
			nbt.putString("ChatButton1", ChatButton1);
			nbt.putString("ChatButton2", ChatButton2);
			nbt.putBoolean("ToggleShiftMove", ToggleShiftMove);
			nbt.putBoolean("HamonUser", HamonUser);
			nbt.putBoolean("Vampire", Vampire);
			nbt.putDouble("AbilityWheelGUI", AbilityWheelGUI);
			nbt.putBoolean("SwitchWheels", SwitchWheels);
			nbt.putBoolean("NoCooldown", NoCooldown);
			nbt.putString("MainQuest", MainQuest);
			nbt.putString("SideQuest1", SideQuest1);
			nbt.putString("SideQuest2", SideQuest2);
			nbt.putString("SideQuest3", SideQuest3);
			nbt.putString("SideQuest4", SideQuest4);
			nbt.putDouble("SideQuestObjective1", SideQuestObjective1);
			nbt.putDouble("SideQuestObjective2", SideQuestObjective2);
			nbt.putDouble("SideQuestObjective3", SideQuestObjective3);
			nbt.putDouble("SideQuestObjective4", SideQuestObjective4);
			nbt.putDouble("SideQuestTotalObjective1", SideQuestTotalObjective1);
			nbt.putDouble("SideQuestTotalObjective2", SideQuestTotalObjective2);
			nbt.putDouble("SideQuestTotalObjective3", SideQuestTotalObjective3);
			nbt.putDouble("SideQuestTotalObjective4", SideQuestTotalObjective4);
			nbt.putString("SideQuestGiver1", SideQuestGiver1);
			nbt.putString("SideQuestGiver2", SideQuestGiver2);
			nbt.putString("SideQuestGiver3", SideQuestGiver3);
			nbt.putString("SideQuestGiver4", SideQuestGiver4);
			nbt.putString("DioChatStage", DioChatStage);
			nbt.putString("PolnareffChatStage", PolnareffChatStage);
			nbt.putString("JosephChatStage", JosephChatStage);
			nbt.putString("KakyoinChatStage", KakyoinChatStage);
			nbt.putString("AvdolChatStage", AvdolChatStage);
			nbt.putString("UseAbilityType", UseAbilityType);
			nbt.putString("HEUseAbilityType", HEUseAbilityType);
			nbt.putBoolean("StandBlocking", StandBlocking);
			nbt.putDouble("AttacksBlocked", AttacksBlocked);
			nbt.putDouble("BlockingCooldown", BlockingCooldown);
			nbt.putBoolean("StandGuarding", StandGuarding);
			nbt.putString("StarPlatinumSkinsUnlocked", StarPlatinumSkinsUnlocked);
			nbt.putString("MagiciansRedSkinsUnlocked", MagiciansRedSkinsUnlocked);
			nbt.putString("HierophantGreenSkinsUnlocked", HierophantGreenSkinsUnlocked);
			nbt.putString("SilverChariotSkinsUnlocked", SilverChariotSkinsUnlocked);
			nbt.putString("HermitPurpleSkinsUnlocked", HermitPurpleSkinsUnlocked);
			nbt.putString("TheFoolSkinsUnlocked", TheFoolSkinsUnlocked);
			nbt.putString("TheWorldSkinsUnlocked", TheWorldSkinsUnlocked);
			nbt.putDouble("AbilityCooldown1", AbilityCooldown1);
			nbt.putDouble("AbilityCooldown2", AbilityCooldown2);
			nbt.putDouble("AbilityCooldown3", AbilityCooldown3);
			nbt.putDouble("AbilityCooldown4", AbilityCooldown4);
			nbt.putDouble("AbilityCooldown5", AbilityCooldown5);
			nbt.putDouble("AbilityCooldown6", AbilityCooldown6);
			nbt.putDouble("AbilityCooldown7", AbilityCooldown7);
			nbt.putDouble("AbilityCooldown8", AbilityCooldown8);
			nbt.putDouble("AbilityCooldown9", AbilityCooldown9);
			nbt.putString("AbilitySlot1", AbilitySlot1);
			nbt.putString("AbilitySlot2", AbilitySlot2);
			nbt.putString("AbilitySlot3", AbilitySlot3);
			nbt.putString("AbilitySlot4", AbilitySlot4);
			nbt.putString("AbilitySlot5", AbilitySlot5);
			nbt.putString("AbilitySlot6", AbilitySlot6);
			nbt.putString("AbilitySlot7", AbilitySlot7);
			nbt.putString("AbilitySlot8", AbilitySlot8);
			nbt.putString("AbilitySlot9", AbilitySlot9);
			nbt.putDouble("SwitcherSlot", SwitcherSlot);
			nbt.putString("AbilitySelected", AbilitySelected);
			nbt.putString("MovesUnlocked", MovesUnlocked);
			nbt.putString("SetAbility1", SetAbility1);
			nbt.putString("SetAbility2", SetAbility2);
			nbt.putString("SetAbility3", SetAbility3);
			nbt.putString("SetAbility4", SetAbility4);
			nbt.putString("SetAbility5", SetAbility5);
			nbt.putString("SetAbility6", SetAbility6);
			nbt.putString("SetAbility7", SetAbility7);
			nbt.putString("SetAbility8", SetAbility8);
			nbt.putString("SetAbility9", SetAbility9);
			nbt.putString("StandColor", StandColor);
			nbt.putBoolean("UsingDisc", UsingDisc);
			nbt.putDouble("AddEXPAmount", AddEXPAmount);
			nbt.putString("PlayerTitle", PlayerTitle);
			nbt.putString("UnlockedTitles", UnlockedTitles);
			nbt.putString("TitleColor", TitleColor);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			StandSummoned = nbt.getBoolean("StandSummoned");
			Stand = nbt.getString("Stand");
			StandType = nbt.getString("StandType");
			StandObtained = nbt.getBoolean("StandObtained");
			PlayerName = nbt.getString("PlayerName");
			StandSkin = nbt.getString("StandSkin");
			PlayerSpawned = nbt.getBoolean("PlayerSpawned");
			GATE = nbt.getBoolean("GATE");
			AttackLevel = nbt.getDouble("AttackLevel");
			ItemStandSummoned = nbt.getBoolean("ItemStandSummoned");
			HermitSearch = nbt.getString("HermitSearch");
			PolaroidGeneration = nbt.getString("PolaroidGeneration");
			SpecialType = nbt.getString("SpecialType");
			SelectedSkill = nbt.getString("SelectedSkill");
			SkillNumber = nbt.getDouble("SkillNumber");
			TimeStop = nbt.getBoolean("TimeStop");
			TimeStopLength = nbt.getDouble("TimeStopLength");
			MaxExp = nbt.getDouble("MaxExp");
			CurrentExp = nbt.getDouble("CurrentExp");
			Level = nbt.getDouble("Level");
			StandPower = nbt.getDouble("StandPower");
			StandSpeed = nbt.getDouble("StandSpeed");
			StandDurability = nbt.getDouble("StandDurability");
			StandPrecision = nbt.getDouble("StandPrecision");
			StandPotential = nbt.getDouble("StandPotential");
			SkillPoints = nbt.getDouble("SkillPoints");
			MaxPower = nbt.getDouble("MaxPower");
			MaxSpeed = nbt.getDouble("MaxSpeed");
			MaxDurability = nbt.getDouble("MaxDurability");
			MaxPotential = nbt.getDouble("MaxPotential");
			MaxPrecision = nbt.getDouble("MaxPrecision");
			Karma = nbt.getDouble("Karma");
			CurrentQuest = nbt.getString("CurrentQuest");
			ArrowWorthy = nbt.getBoolean("ArrowWorthy");
			NPCIcon = nbt.getString("NPCIcon");
			NPCTextLine1 = nbt.getString("NPCTextLine1");
			NPCTextLine2 = nbt.getString("NPCTextLine2");
			NPCTextLine3 = nbt.getString("NPCTextLine3");
			NPCTextLine4 = nbt.getString("NPCTextLine4");
			JotaroChatStage = nbt.getString("JotaroChatStage");
			NPCTextStep1 = nbt.getDouble("NPCTextStep1");
			NPCTextStep2 = nbt.getDouble("NPCTextStep2");
			NPCTextStep3 = nbt.getDouble("NPCTextStep3");
			NPCTextStep4 = nbt.getDouble("NPCTextStep4");
			ChatButton1 = nbt.getString("ChatButton1");
			ChatButton2 = nbt.getString("ChatButton2");
			ToggleShiftMove = nbt.getBoolean("ToggleShiftMove");
			HamonUser = nbt.getBoolean("HamonUser");
			Vampire = nbt.getBoolean("Vampire");
			AbilityWheelGUI = nbt.getDouble("AbilityWheelGUI");
			SwitchWheels = nbt.getBoolean("SwitchWheels");
			NoCooldown = nbt.getBoolean("NoCooldown");
			MainQuest = nbt.getString("MainQuest");
			SideQuest1 = nbt.getString("SideQuest1");
			SideQuest2 = nbt.getString("SideQuest2");
			SideQuest3 = nbt.getString("SideQuest3");
			SideQuest4 = nbt.getString("SideQuest4");
			SideQuestObjective1 = nbt.getDouble("SideQuestObjective1");
			SideQuestObjective2 = nbt.getDouble("SideQuestObjective2");
			SideQuestObjective3 = nbt.getDouble("SideQuestObjective3");
			SideQuestObjective4 = nbt.getDouble("SideQuestObjective4");
			SideQuestTotalObjective1 = nbt.getDouble("SideQuestTotalObjective1");
			SideQuestTotalObjective2 = nbt.getDouble("SideQuestTotalObjective2");
			SideQuestTotalObjective3 = nbt.getDouble("SideQuestTotalObjective3");
			SideQuestTotalObjective4 = nbt.getDouble("SideQuestTotalObjective4");
			SideQuestGiver1 = nbt.getString("SideQuestGiver1");
			SideQuestGiver2 = nbt.getString("SideQuestGiver2");
			SideQuestGiver3 = nbt.getString("SideQuestGiver3");
			SideQuestGiver4 = nbt.getString("SideQuestGiver4");
			DioChatStage = nbt.getString("DioChatStage");
			PolnareffChatStage = nbt.getString("PolnareffChatStage");
			JosephChatStage = nbt.getString("JosephChatStage");
			KakyoinChatStage = nbt.getString("KakyoinChatStage");
			AvdolChatStage = nbt.getString("AvdolChatStage");
			UseAbilityType = nbt.getString("UseAbilityType");
			HEUseAbilityType = nbt.getString("HEUseAbilityType");
			StandBlocking = nbt.getBoolean("StandBlocking");
			AttacksBlocked = nbt.getDouble("AttacksBlocked");
			BlockingCooldown = nbt.getDouble("BlockingCooldown");
			StandGuarding = nbt.getBoolean("StandGuarding");
			StarPlatinumSkinsUnlocked = nbt.getString("StarPlatinumSkinsUnlocked");
			MagiciansRedSkinsUnlocked = nbt.getString("MagiciansRedSkinsUnlocked");
			HierophantGreenSkinsUnlocked = nbt.getString("HierophantGreenSkinsUnlocked");
			SilverChariotSkinsUnlocked = nbt.getString("SilverChariotSkinsUnlocked");
			HermitPurpleSkinsUnlocked = nbt.getString("HermitPurpleSkinsUnlocked");
			TheFoolSkinsUnlocked = nbt.getString("TheFoolSkinsUnlocked");
			TheWorldSkinsUnlocked = nbt.getString("TheWorldSkinsUnlocked");
			AbilityCooldown1 = nbt.getDouble("AbilityCooldown1");
			AbilityCooldown2 = nbt.getDouble("AbilityCooldown2");
			AbilityCooldown3 = nbt.getDouble("AbilityCooldown3");
			AbilityCooldown4 = nbt.getDouble("AbilityCooldown4");
			AbilityCooldown5 = nbt.getDouble("AbilityCooldown5");
			AbilityCooldown6 = nbt.getDouble("AbilityCooldown6");
			AbilityCooldown7 = nbt.getDouble("AbilityCooldown7");
			AbilityCooldown8 = nbt.getDouble("AbilityCooldown8");
			AbilityCooldown9 = nbt.getDouble("AbilityCooldown9");
			AbilitySlot1 = nbt.getString("AbilitySlot1");
			AbilitySlot2 = nbt.getString("AbilitySlot2");
			AbilitySlot3 = nbt.getString("AbilitySlot3");
			AbilitySlot4 = nbt.getString("AbilitySlot4");
			AbilitySlot5 = nbt.getString("AbilitySlot5");
			AbilitySlot6 = nbt.getString("AbilitySlot6");
			AbilitySlot7 = nbt.getString("AbilitySlot7");
			AbilitySlot8 = nbt.getString("AbilitySlot8");
			AbilitySlot9 = nbt.getString("AbilitySlot9");
			SwitcherSlot = nbt.getDouble("SwitcherSlot");
			AbilitySelected = nbt.getString("AbilitySelected");
			MovesUnlocked = nbt.getString("MovesUnlocked");
			SetAbility1 = nbt.getString("SetAbility1");
			SetAbility2 = nbt.getString("SetAbility2");
			SetAbility3 = nbt.getString("SetAbility3");
			SetAbility4 = nbt.getString("SetAbility4");
			SetAbility5 = nbt.getString("SetAbility5");
			SetAbility6 = nbt.getString("SetAbility6");
			SetAbility7 = nbt.getString("SetAbility7");
			SetAbility8 = nbt.getString("SetAbility8");
			SetAbility9 = nbt.getString("SetAbility9");
			StandColor = nbt.getString("StandColor");
			UsingDisc = nbt.getBoolean("UsingDisc");
			AddEXPAmount = nbt.getDouble("AddEXPAmount");
			PlayerTitle = nbt.getString("PlayerTitle");
			UnlockedTitles = nbt.getString("UnlockedTitles");
			TitleColor = nbt.getString("TitleColor");
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		JojowosMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	public static class PlayerVariablesSyncMessage {
		private final int target;
		private final PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
			this.target = buffer.readInt();
		}

		public PlayerVariablesSyncMessage(PlayerVariables data, int entityid) {
			this.data = data;
			this.target = entityid;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
			buffer.writeInt(message.target);
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.level().getEntity(message.target).getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.StandSummoned = message.data.StandSummoned;
					variables.Stand = message.data.Stand;
					variables.StandType = message.data.StandType;
					variables.StandObtained = message.data.StandObtained;
					variables.PlayerName = message.data.PlayerName;
					variables.StandSkin = message.data.StandSkin;
					variables.PlayerSpawned = message.data.PlayerSpawned;
					variables.GATE = message.data.GATE;
					variables.AttackLevel = message.data.AttackLevel;
					variables.ItemStandSummoned = message.data.ItemStandSummoned;
					variables.HermitSearch = message.data.HermitSearch;
					variables.PolaroidGeneration = message.data.PolaroidGeneration;
					variables.SpecialType = message.data.SpecialType;
					variables.SelectedSkill = message.data.SelectedSkill;
					variables.SkillNumber = message.data.SkillNumber;
					variables.TimeStop = message.data.TimeStop;
					variables.TimeStopLength = message.data.TimeStopLength;
					variables.MaxExp = message.data.MaxExp;
					variables.CurrentExp = message.data.CurrentExp;
					variables.Level = message.data.Level;
					variables.StandPower = message.data.StandPower;
					variables.StandSpeed = message.data.StandSpeed;
					variables.StandDurability = message.data.StandDurability;
					variables.StandPrecision = message.data.StandPrecision;
					variables.StandPotential = message.data.StandPotential;
					variables.SkillPoints = message.data.SkillPoints;
					variables.MaxPower = message.data.MaxPower;
					variables.MaxSpeed = message.data.MaxSpeed;
					variables.MaxDurability = message.data.MaxDurability;
					variables.MaxPotential = message.data.MaxPotential;
					variables.MaxPrecision = message.data.MaxPrecision;
					variables.Karma = message.data.Karma;
					variables.CurrentQuest = message.data.CurrentQuest;
					variables.ArrowWorthy = message.data.ArrowWorthy;
					variables.NPCIcon = message.data.NPCIcon;
					variables.NPCTextLine1 = message.data.NPCTextLine1;
					variables.NPCTextLine2 = message.data.NPCTextLine2;
					variables.NPCTextLine3 = message.data.NPCTextLine3;
					variables.NPCTextLine4 = message.data.NPCTextLine4;
					variables.JotaroChatStage = message.data.JotaroChatStage;
					variables.NPCTextStep1 = message.data.NPCTextStep1;
					variables.NPCTextStep2 = message.data.NPCTextStep2;
					variables.NPCTextStep3 = message.data.NPCTextStep3;
					variables.NPCTextStep4 = message.data.NPCTextStep4;
					variables.ChatButton1 = message.data.ChatButton1;
					variables.ChatButton2 = message.data.ChatButton2;
					variables.ToggleShiftMove = message.data.ToggleShiftMove;
					variables.HamonUser = message.data.HamonUser;
					variables.Vampire = message.data.Vampire;
					variables.AbilityWheelGUI = message.data.AbilityWheelGUI;
					variables.SwitchWheels = message.data.SwitchWheels;
					variables.NoCooldown = message.data.NoCooldown;
					variables.MainQuest = message.data.MainQuest;
					variables.SideQuest1 = message.data.SideQuest1;
					variables.SideQuest2 = message.data.SideQuest2;
					variables.SideQuest3 = message.data.SideQuest3;
					variables.SideQuest4 = message.data.SideQuest4;
					variables.SideQuestObjective1 = message.data.SideQuestObjective1;
					variables.SideQuestObjective2 = message.data.SideQuestObjective2;
					variables.SideQuestObjective3 = message.data.SideQuestObjective3;
					variables.SideQuestObjective4 = message.data.SideQuestObjective4;
					variables.SideQuestTotalObjective1 = message.data.SideQuestTotalObjective1;
					variables.SideQuestTotalObjective2 = message.data.SideQuestTotalObjective2;
					variables.SideQuestTotalObjective3 = message.data.SideQuestTotalObjective3;
					variables.SideQuestTotalObjective4 = message.data.SideQuestTotalObjective4;
					variables.SideQuestGiver1 = message.data.SideQuestGiver1;
					variables.SideQuestGiver2 = message.data.SideQuestGiver2;
					variables.SideQuestGiver3 = message.data.SideQuestGiver3;
					variables.SideQuestGiver4 = message.data.SideQuestGiver4;
					variables.DioChatStage = message.data.DioChatStage;
					variables.PolnareffChatStage = message.data.PolnareffChatStage;
					variables.JosephChatStage = message.data.JosephChatStage;
					variables.KakyoinChatStage = message.data.KakyoinChatStage;
					variables.AvdolChatStage = message.data.AvdolChatStage;
					variables.UseAbilityType = message.data.UseAbilityType;
					variables.HEUseAbilityType = message.data.HEUseAbilityType;
					variables.StandBlocking = message.data.StandBlocking;
					variables.AttacksBlocked = message.data.AttacksBlocked;
					variables.BlockingCooldown = message.data.BlockingCooldown;
					variables.StandGuarding = message.data.StandGuarding;
					variables.StarPlatinumSkinsUnlocked = message.data.StarPlatinumSkinsUnlocked;
					variables.MagiciansRedSkinsUnlocked = message.data.MagiciansRedSkinsUnlocked;
					variables.HierophantGreenSkinsUnlocked = message.data.HierophantGreenSkinsUnlocked;
					variables.SilverChariotSkinsUnlocked = message.data.SilverChariotSkinsUnlocked;
					variables.HermitPurpleSkinsUnlocked = message.data.HermitPurpleSkinsUnlocked;
					variables.TheFoolSkinsUnlocked = message.data.TheFoolSkinsUnlocked;
					variables.TheWorldSkinsUnlocked = message.data.TheWorldSkinsUnlocked;
					variables.AbilityCooldown1 = message.data.AbilityCooldown1;
					variables.AbilityCooldown2 = message.data.AbilityCooldown2;
					variables.AbilityCooldown3 = message.data.AbilityCooldown3;
					variables.AbilityCooldown4 = message.data.AbilityCooldown4;
					variables.AbilityCooldown5 = message.data.AbilityCooldown5;
					variables.AbilityCooldown6 = message.data.AbilityCooldown6;
					variables.AbilityCooldown7 = message.data.AbilityCooldown7;
					variables.AbilityCooldown8 = message.data.AbilityCooldown8;
					variables.AbilityCooldown9 = message.data.AbilityCooldown9;
					variables.AbilitySlot1 = message.data.AbilitySlot1;
					variables.AbilitySlot2 = message.data.AbilitySlot2;
					variables.AbilitySlot3 = message.data.AbilitySlot3;
					variables.AbilitySlot4 = message.data.AbilitySlot4;
					variables.AbilitySlot5 = message.data.AbilitySlot5;
					variables.AbilitySlot6 = message.data.AbilitySlot6;
					variables.AbilitySlot7 = message.data.AbilitySlot7;
					variables.AbilitySlot8 = message.data.AbilitySlot8;
					variables.AbilitySlot9 = message.data.AbilitySlot9;
					variables.SwitcherSlot = message.data.SwitcherSlot;
					variables.AbilitySelected = message.data.AbilitySelected;
					variables.MovesUnlocked = message.data.MovesUnlocked;
					variables.SetAbility1 = message.data.SetAbility1;
					variables.SetAbility2 = message.data.SetAbility2;
					variables.SetAbility3 = message.data.SetAbility3;
					variables.SetAbility4 = message.data.SetAbility4;
					variables.SetAbility5 = message.data.SetAbility5;
					variables.SetAbility6 = message.data.SetAbility6;
					variables.SetAbility7 = message.data.SetAbility7;
					variables.SetAbility8 = message.data.SetAbility8;
					variables.SetAbility9 = message.data.SetAbility9;
					variables.StandColor = message.data.StandColor;
					variables.UsingDisc = message.data.UsingDisc;
					variables.AddEXPAmount = message.data.AddEXPAmount;
					variables.PlayerTitle = message.data.PlayerTitle;
					variables.UnlockedTitles = message.data.UnlockedTitles;
					variables.TitleColor = message.data.TitleColor;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
