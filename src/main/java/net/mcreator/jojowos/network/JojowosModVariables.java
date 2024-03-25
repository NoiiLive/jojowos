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
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
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
			clone.ArrowUsed = original.ArrowUsed;
			clone.SpecialType = original.SpecialType;
			clone.TimeStopLength = original.TimeStopLength;
			clone.MaxExp = original.MaxExp;
			clone.CurrentExp = original.CurrentExp;
			clone.Level = original.Level;
			clone.StandPower = original.StandPower;
			clone.StandSpeed = original.StandSpeed;
			clone.StandDurability = original.StandDurability;
			clone.StandPrecision = original.StandPrecision;
			clone.StandRange = original.StandRange;
			clone.StandPotential = original.StandPotential;
			clone.SkillPoints = original.SkillPoints;
			clone.MaxPower = original.MaxPower;
			clone.MaxSpeed = original.MaxSpeed;
			clone.MaxDurability = original.MaxDurability;
			clone.MaxRange = original.MaxRange;
			clone.MaxPotential = original.MaxPotential;
			clone.MaxPrecision = original.MaxPrecision;
			clone.Karma = original.Karma;
			clone.CurrentQuest = original.CurrentQuest;
			clone.ArrowWorthy = original.ArrowWorthy;
			clone.TangleUnlocked = original.TangleUnlocked;
			clone.DivinationUnlocked = original.DivinationUnlocked;
			clone.StarFingerUnlocked = original.StarFingerUnlocked;
			clone.InhaleUnlocked = original.InhaleUnlocked;
			clone.BearingShotUnlocked = original.BearingShotUnlocked;
			clone.StarTimeSkipUnlocked = original.StarTimeSkipUnlocked;
			clone.StarTimeStopUnlocked = original.StarTimeStopUnlocked;
			clone.CrossfireSpecialUnlocked = original.CrossfireSpecialUnlocked;
			clone.RedBindUnlocked = original.RedBindUnlocked;
			clone.LifeDetectUnlocked = original.LifeDetectUnlocked;
			clone.SwordLaunchUnlocked = original.SwordLaunchUnlocked;
			clone.ArmorOffUnlocked = original.ArmorOffUnlocked;
			clone.BladeCycloneUnlocked = original.BladeCycloneUnlocked;
			clone.GreenGrappleUnlocked = original.GreenGrappleUnlocked;
			clone.MeterEmeraldUnlocked = original.MeterEmeraldUnlocked;
			clone.BodyControlUnlocked = original.BodyControlUnlocked;
			clone.SandDomeUnlocked = original.SandDomeUnlocked;
			clone.SandGlideUnlocked = original.SandGlideUnlocked;
			clone.MudaKickUnlocked = original.MudaKickUnlocked;
			clone.KnifeTossUnlocked = original.KnifeTossUnlocked;
			clone.WorldTimeSkipUnlocked = original.WorldTimeSkipUnlocked;
			clone.WorldTimeStopUnlocked = original.WorldTimeStopUnlocked;
			clone.RoadRollerUnlocked = original.RoadRollerUnlocked;
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
			clone.StandVisibleTeam = original.StandVisibleTeam;
			clone.StandInvisibleTeam = original.StandInvisibleTeam;
			clone.NonStandUserTeam = original.NonStandUserTeam;
			clone.StarPlatinumSkinsUnlocked = original.StarPlatinumSkinsUnlocked;
			clone.MagiciansRedSkinsUnlocked = original.MagiciansRedSkinsUnlocked;
			clone.HierophantGreenSkinsUnlocked = original.HierophantGreenSkinsUnlocked;
			clone.SilverChariotSkinsUnlocked = original.SilverChariotSkinsUnlocked;
			clone.HermitPurpleSkinsUnlocked = original.HermitPurpleSkinsUnlocked;
			clone.TheFoolSkinsUnlocked = original.TheFoolSkinsUnlocked;
			clone.TheWorldSkinsUnlocked = original.TheWorldSkinsUnlocked;
			clone.StarPlatinumMovesUnlocked = original.StarPlatinumMovesUnlocked;
			clone.MagiciansRedMovesUnlocked = original.MagiciansRedMovesUnlocked;
			clone.HierophantGreenMovesUnlocked = original.HierophantGreenMovesUnlocked;
			clone.SilverChariotMovesUnlocked = original.SilverChariotMovesUnlocked;
			clone.HermitPurpleMovesUnlocked = original.HermitPurpleMovesUnlocked;
			clone.TheFoolMovesUnlocked = original.TheFoolMovesUnlocked;
			clone.TheWorldMovesUnlocked = original.TheWorldMovesUnlocked;
			if (!event.isWasDeath()) {
				clone.StandSummoned = original.StandSummoned;
				clone.AttackLevel = original.AttackLevel;
				clone.ItemStandSummoned = original.ItemStandSummoned;
				clone.HermitSearch = original.HermitSearch;
				clone.PolaroidGeneration = original.PolaroidGeneration;
				clone.SelectedSkill = original.SelectedSkill;
				clone.SkillNumber = original.SkillNumber;
				clone.TimeStop = original.TimeStop;
				clone.Evolved = original.Evolved;
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
		public boolean ArrowUsed = false;
		public String HermitSearch = "";
		public String PolaroidGeneration = "";
		public String SpecialType = "";
		public String SelectedSkill = "[ ]";
		public double SkillNumber = 0;
		public boolean TimeStop = false;
		public boolean Evolved = false;
		public double TimeStopLength = 0.0;
		public double MaxExp = 100.0;
		public double CurrentExp = 0;
		public double Level = 1.0;
		public double StandPower = 0;
		public double StandSpeed = 0;
		public double StandDurability = 0;
		public double StandPrecision = 0;
		public double StandRange = 0;
		public double StandPotential = 0;
		public double SkillPoints = 0;
		public double MaxPower = 0;
		public double MaxSpeed = 0;
		public double MaxDurability = 0;
		public double MaxRange = 0;
		public double MaxPotential = 0;
		public double MaxPrecision = 0;
		public double Karma = 0;
		public String CurrentQuest = "";
		public boolean ArrowWorthy = true;
		public boolean TangleUnlocked = false;
		public boolean DivinationUnlocked = false;
		public boolean StarFingerUnlocked = false;
		public boolean InhaleUnlocked = false;
		public boolean BearingShotUnlocked = false;
		public boolean StarTimeSkipUnlocked = false;
		public boolean StarTimeStopUnlocked = false;
		public boolean CrossfireSpecialUnlocked = false;
		public boolean RedBindUnlocked = false;
		public boolean LifeDetectUnlocked = false;
		public boolean SwordLaunchUnlocked = false;
		public boolean ArmorOffUnlocked = false;
		public boolean BladeCycloneUnlocked = false;
		public boolean GreenGrappleUnlocked = false;
		public boolean MeterEmeraldUnlocked = false;
		public boolean BodyControlUnlocked = false;
		public boolean SandDomeUnlocked = false;
		public boolean SandGlideUnlocked = false;
		public boolean MudaKickUnlocked = false;
		public boolean KnifeTossUnlocked = false;
		public boolean WorldTimeSkipUnlocked = false;
		public boolean WorldTimeStopUnlocked = false;
		public boolean RoadRollerUnlocked = false;
		public String NPCIcon = "";
		public String NPCTextLine1 = "";
		public String NPCTextLine2 = "";
		public String NPCTextLine3 = "";
		public String NPCTextLine4 = "";
		public String JotaroChatStage = "HaveWeMet";
		public double NPCTextStep1 = 0;
		public double NPCTextStep2 = 0;
		public double NPCTextStep3 = 0;
		public double NPCTextStep4 = 0;
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
		public double SideQuestObjective1 = 0;
		public double SideQuestObjective2 = 0;
		public double SideQuestObjective3 = 0;
		public double SideQuestObjective4 = 0;
		public double SideQuestTotalObjective1 = 0;
		public double SideQuestTotalObjective2 = 0;
		public double SideQuestTotalObjective3 = 0;
		public double SideQuestTotalObjective4 = 0;
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
		public boolean StandVisibleTeam = false;
		public boolean StandInvisibleTeam = false;
		public boolean NonStandUserTeam = false;
		public boolean StandBlocking = false;
		public double AttacksBlocked = 0;
		public double BlockingCooldown = 0;
		public boolean StandGuarding = false;
		public String StarPlatinumSkinsUnlocked = "";
		public String MagiciansRedSkinsUnlocked = "";
		public String HierophantGreenSkinsUnlocked = "";
		public String SilverChariotSkinsUnlocked = "";
		public String HermitPurpleSkinsUnlocked = "";
		public String TheFoolSkinsUnlocked = "";
		public String TheWorldSkinsUnlocked = "";
		public double AbilityCooldown1 = 0;
		public double AbilityCooldown2 = 0;
		public double AbilityCooldown3 = 0;
		public double AbilityCooldown4 = 0;
		public double AbilityCooldown5 = 0;
		public double AbilityCooldown6 = 0;
		public double AbilityCooldown7 = 0;
		public double AbilityCooldown8 = 0;
		public double AbilityCooldown9 = 0;
		public String StarPlatinumMovesUnlocked = "";
		public String MagiciansRedMovesUnlocked = "";
		public String HierophantGreenMovesUnlocked = "";
		public String SilverChariotMovesUnlocked = "";
		public String HermitPurpleMovesUnlocked = "";
		public String TheFoolMovesUnlocked = "";
		public String TheWorldMovesUnlocked = "";

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				JojowosMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
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
			nbt.putBoolean("ArrowUsed", ArrowUsed);
			nbt.putString("HermitSearch", HermitSearch);
			nbt.putString("PolaroidGeneration", PolaroidGeneration);
			nbt.putString("SpecialType", SpecialType);
			nbt.putString("SelectedSkill", SelectedSkill);
			nbt.putDouble("SkillNumber", SkillNumber);
			nbt.putBoolean("TimeStop", TimeStop);
			nbt.putBoolean("Evolved", Evolved);
			nbt.putDouble("TimeStopLength", TimeStopLength);
			nbt.putDouble("MaxExp", MaxExp);
			nbt.putDouble("CurrentExp", CurrentExp);
			nbt.putDouble("Level", Level);
			nbt.putDouble("StandPower", StandPower);
			nbt.putDouble("StandSpeed", StandSpeed);
			nbt.putDouble("StandDurability", StandDurability);
			nbt.putDouble("StandPrecision", StandPrecision);
			nbt.putDouble("StandRange", StandRange);
			nbt.putDouble("StandPotential", StandPotential);
			nbt.putDouble("SkillPoints", SkillPoints);
			nbt.putDouble("MaxPower", MaxPower);
			nbt.putDouble("MaxSpeed", MaxSpeed);
			nbt.putDouble("MaxDurability", MaxDurability);
			nbt.putDouble("MaxRange", MaxRange);
			nbt.putDouble("MaxPotential", MaxPotential);
			nbt.putDouble("MaxPrecision", MaxPrecision);
			nbt.putDouble("Karma", Karma);
			nbt.putString("CurrentQuest", CurrentQuest);
			nbt.putBoolean("ArrowWorthy", ArrowWorthy);
			nbt.putBoolean("TangleUnlocked", TangleUnlocked);
			nbt.putBoolean("DivinationUnlocked", DivinationUnlocked);
			nbt.putBoolean("StarFingerUnlocked", StarFingerUnlocked);
			nbt.putBoolean("InhaleUnlocked", InhaleUnlocked);
			nbt.putBoolean("BearingShotUnlocked", BearingShotUnlocked);
			nbt.putBoolean("StarTimeSkipUnlocked", StarTimeSkipUnlocked);
			nbt.putBoolean("StarTimeStopUnlocked", StarTimeStopUnlocked);
			nbt.putBoolean("CrossfireSpecialUnlocked", CrossfireSpecialUnlocked);
			nbt.putBoolean("RedBindUnlocked", RedBindUnlocked);
			nbt.putBoolean("LifeDetectUnlocked", LifeDetectUnlocked);
			nbt.putBoolean("SwordLaunchUnlocked", SwordLaunchUnlocked);
			nbt.putBoolean("ArmorOffUnlocked", ArmorOffUnlocked);
			nbt.putBoolean("BladeCycloneUnlocked", BladeCycloneUnlocked);
			nbt.putBoolean("GreenGrappleUnlocked", GreenGrappleUnlocked);
			nbt.putBoolean("MeterEmeraldUnlocked", MeterEmeraldUnlocked);
			nbt.putBoolean("BodyControlUnlocked", BodyControlUnlocked);
			nbt.putBoolean("SandDomeUnlocked", SandDomeUnlocked);
			nbt.putBoolean("SandGlideUnlocked", SandGlideUnlocked);
			nbt.putBoolean("MudaKickUnlocked", MudaKickUnlocked);
			nbt.putBoolean("KnifeTossUnlocked", KnifeTossUnlocked);
			nbt.putBoolean("WorldTimeSkipUnlocked", WorldTimeSkipUnlocked);
			nbt.putBoolean("WorldTimeStopUnlocked", WorldTimeStopUnlocked);
			nbt.putBoolean("RoadRollerUnlocked", RoadRollerUnlocked);
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
			nbt.putBoolean("StandVisibleTeam", StandVisibleTeam);
			nbt.putBoolean("StandInvisibleTeam", StandInvisibleTeam);
			nbt.putBoolean("NonStandUserTeam", NonStandUserTeam);
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
			nbt.putString("StarPlatinumMovesUnlocked", StarPlatinumMovesUnlocked);
			nbt.putString("MagiciansRedMovesUnlocked", MagiciansRedMovesUnlocked);
			nbt.putString("HierophantGreenMovesUnlocked", HierophantGreenMovesUnlocked);
			nbt.putString("SilverChariotMovesUnlocked", SilverChariotMovesUnlocked);
			nbt.putString("HermitPurpleMovesUnlocked", HermitPurpleMovesUnlocked);
			nbt.putString("TheFoolMovesUnlocked", TheFoolMovesUnlocked);
			nbt.putString("TheWorldMovesUnlocked", TheWorldMovesUnlocked);
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
			ArrowUsed = nbt.getBoolean("ArrowUsed");
			HermitSearch = nbt.getString("HermitSearch");
			PolaroidGeneration = nbt.getString("PolaroidGeneration");
			SpecialType = nbt.getString("SpecialType");
			SelectedSkill = nbt.getString("SelectedSkill");
			SkillNumber = nbt.getDouble("SkillNumber");
			TimeStop = nbt.getBoolean("TimeStop");
			Evolved = nbt.getBoolean("Evolved");
			TimeStopLength = nbt.getDouble("TimeStopLength");
			MaxExp = nbt.getDouble("MaxExp");
			CurrentExp = nbt.getDouble("CurrentExp");
			Level = nbt.getDouble("Level");
			StandPower = nbt.getDouble("StandPower");
			StandSpeed = nbt.getDouble("StandSpeed");
			StandDurability = nbt.getDouble("StandDurability");
			StandPrecision = nbt.getDouble("StandPrecision");
			StandRange = nbt.getDouble("StandRange");
			StandPotential = nbt.getDouble("StandPotential");
			SkillPoints = nbt.getDouble("SkillPoints");
			MaxPower = nbt.getDouble("MaxPower");
			MaxSpeed = nbt.getDouble("MaxSpeed");
			MaxDurability = nbt.getDouble("MaxDurability");
			MaxRange = nbt.getDouble("MaxRange");
			MaxPotential = nbt.getDouble("MaxPotential");
			MaxPrecision = nbt.getDouble("MaxPrecision");
			Karma = nbt.getDouble("Karma");
			CurrentQuest = nbt.getString("CurrentQuest");
			ArrowWorthy = nbt.getBoolean("ArrowWorthy");
			TangleUnlocked = nbt.getBoolean("TangleUnlocked");
			DivinationUnlocked = nbt.getBoolean("DivinationUnlocked");
			StarFingerUnlocked = nbt.getBoolean("StarFingerUnlocked");
			InhaleUnlocked = nbt.getBoolean("InhaleUnlocked");
			BearingShotUnlocked = nbt.getBoolean("BearingShotUnlocked");
			StarTimeSkipUnlocked = nbt.getBoolean("StarTimeSkipUnlocked");
			StarTimeStopUnlocked = nbt.getBoolean("StarTimeStopUnlocked");
			CrossfireSpecialUnlocked = nbt.getBoolean("CrossfireSpecialUnlocked");
			RedBindUnlocked = nbt.getBoolean("RedBindUnlocked");
			LifeDetectUnlocked = nbt.getBoolean("LifeDetectUnlocked");
			SwordLaunchUnlocked = nbt.getBoolean("SwordLaunchUnlocked");
			ArmorOffUnlocked = nbt.getBoolean("ArmorOffUnlocked");
			BladeCycloneUnlocked = nbt.getBoolean("BladeCycloneUnlocked");
			GreenGrappleUnlocked = nbt.getBoolean("GreenGrappleUnlocked");
			MeterEmeraldUnlocked = nbt.getBoolean("MeterEmeraldUnlocked");
			BodyControlUnlocked = nbt.getBoolean("BodyControlUnlocked");
			SandDomeUnlocked = nbt.getBoolean("SandDomeUnlocked");
			SandGlideUnlocked = nbt.getBoolean("SandGlideUnlocked");
			MudaKickUnlocked = nbt.getBoolean("MudaKickUnlocked");
			KnifeTossUnlocked = nbt.getBoolean("KnifeTossUnlocked");
			WorldTimeSkipUnlocked = nbt.getBoolean("WorldTimeSkipUnlocked");
			WorldTimeStopUnlocked = nbt.getBoolean("WorldTimeStopUnlocked");
			RoadRollerUnlocked = nbt.getBoolean("RoadRollerUnlocked");
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
			StandVisibleTeam = nbt.getBoolean("StandVisibleTeam");
			StandInvisibleTeam = nbt.getBoolean("StandInvisibleTeam");
			NonStandUserTeam = nbt.getBoolean("NonStandUserTeam");
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
			StarPlatinumMovesUnlocked = nbt.getString("StarPlatinumMovesUnlocked");
			MagiciansRedMovesUnlocked = nbt.getString("MagiciansRedMovesUnlocked");
			HierophantGreenMovesUnlocked = nbt.getString("HierophantGreenMovesUnlocked");
			SilverChariotMovesUnlocked = nbt.getString("SilverChariotMovesUnlocked");
			HermitPurpleMovesUnlocked = nbt.getString("HermitPurpleMovesUnlocked");
			TheFoolMovesUnlocked = nbt.getString("TheFoolMovesUnlocked");
			TheWorldMovesUnlocked = nbt.getString("TheWorldMovesUnlocked");
		}
	}

	public static class PlayerVariablesSyncMessage {
		private final PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
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
					variables.ArrowUsed = message.data.ArrowUsed;
					variables.HermitSearch = message.data.HermitSearch;
					variables.PolaroidGeneration = message.data.PolaroidGeneration;
					variables.SpecialType = message.data.SpecialType;
					variables.SelectedSkill = message.data.SelectedSkill;
					variables.SkillNumber = message.data.SkillNumber;
					variables.TimeStop = message.data.TimeStop;
					variables.Evolved = message.data.Evolved;
					variables.TimeStopLength = message.data.TimeStopLength;
					variables.MaxExp = message.data.MaxExp;
					variables.CurrentExp = message.data.CurrentExp;
					variables.Level = message.data.Level;
					variables.StandPower = message.data.StandPower;
					variables.StandSpeed = message.data.StandSpeed;
					variables.StandDurability = message.data.StandDurability;
					variables.StandPrecision = message.data.StandPrecision;
					variables.StandRange = message.data.StandRange;
					variables.StandPotential = message.data.StandPotential;
					variables.SkillPoints = message.data.SkillPoints;
					variables.MaxPower = message.data.MaxPower;
					variables.MaxSpeed = message.data.MaxSpeed;
					variables.MaxDurability = message.data.MaxDurability;
					variables.MaxRange = message.data.MaxRange;
					variables.MaxPotential = message.data.MaxPotential;
					variables.MaxPrecision = message.data.MaxPrecision;
					variables.Karma = message.data.Karma;
					variables.CurrentQuest = message.data.CurrentQuest;
					variables.ArrowWorthy = message.data.ArrowWorthy;
					variables.TangleUnlocked = message.data.TangleUnlocked;
					variables.DivinationUnlocked = message.data.DivinationUnlocked;
					variables.StarFingerUnlocked = message.data.StarFingerUnlocked;
					variables.InhaleUnlocked = message.data.InhaleUnlocked;
					variables.BearingShotUnlocked = message.data.BearingShotUnlocked;
					variables.StarTimeSkipUnlocked = message.data.StarTimeSkipUnlocked;
					variables.StarTimeStopUnlocked = message.data.StarTimeStopUnlocked;
					variables.CrossfireSpecialUnlocked = message.data.CrossfireSpecialUnlocked;
					variables.RedBindUnlocked = message.data.RedBindUnlocked;
					variables.LifeDetectUnlocked = message.data.LifeDetectUnlocked;
					variables.SwordLaunchUnlocked = message.data.SwordLaunchUnlocked;
					variables.ArmorOffUnlocked = message.data.ArmorOffUnlocked;
					variables.BladeCycloneUnlocked = message.data.BladeCycloneUnlocked;
					variables.GreenGrappleUnlocked = message.data.GreenGrappleUnlocked;
					variables.MeterEmeraldUnlocked = message.data.MeterEmeraldUnlocked;
					variables.BodyControlUnlocked = message.data.BodyControlUnlocked;
					variables.SandDomeUnlocked = message.data.SandDomeUnlocked;
					variables.SandGlideUnlocked = message.data.SandGlideUnlocked;
					variables.MudaKickUnlocked = message.data.MudaKickUnlocked;
					variables.KnifeTossUnlocked = message.data.KnifeTossUnlocked;
					variables.WorldTimeSkipUnlocked = message.data.WorldTimeSkipUnlocked;
					variables.WorldTimeStopUnlocked = message.data.WorldTimeStopUnlocked;
					variables.RoadRollerUnlocked = message.data.RoadRollerUnlocked;
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
					variables.StandVisibleTeam = message.data.StandVisibleTeam;
					variables.StandInvisibleTeam = message.data.StandInvisibleTeam;
					variables.NonStandUserTeam = message.data.NonStandUserTeam;
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
					variables.StarPlatinumMovesUnlocked = message.data.StarPlatinumMovesUnlocked;
					variables.MagiciansRedMovesUnlocked = message.data.MagiciansRedMovesUnlocked;
					variables.HierophantGreenMovesUnlocked = message.data.HierophantGreenMovesUnlocked;
					variables.SilverChariotMovesUnlocked = message.data.SilverChariotMovesUnlocked;
					variables.HermitPurpleMovesUnlocked = message.data.HermitPurpleMovesUnlocked;
					variables.TheFoolMovesUnlocked = message.data.TheFoolMovesUnlocked;
					variables.TheWorldMovesUnlocked = message.data.TheWorldMovesUnlocked;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
