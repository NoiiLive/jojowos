
package net.mcreator.jojowos.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.jojowos.world.inventory.TheWorldStandSkins1Menu;
import net.mcreator.jojowos.procedures.OpenSkinTheWorld2Procedure;
import net.mcreator.jojowos.procedures.EquipSkinTheWorldOVAProcedure;
import net.mcreator.jojowos.procedures.EquipSkinTheWorldMangaProcedure;
import net.mcreator.jojowos.procedures.EquipSkinTheWorldBaseProcedure;
import net.mcreator.jojowos.JojowosMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheWorldStandSkins1ButtonMessage {
	private final int buttonID, x, y, z;

	public TheWorldStandSkins1ButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public TheWorldStandSkins1ButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(TheWorldStandSkins1ButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(TheWorldStandSkins1ButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = TheWorldStandSkins1Menu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			EquipSkinTheWorldBaseProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			EquipSkinTheWorldMangaProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			EquipSkinTheWorldOVAProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			OpenSkinTheWorld2Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			OpenSkinTheWorld2Procedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		JojowosMod.addNetworkMessage(TheWorldStandSkins1ButtonMessage.class, TheWorldStandSkins1ButtonMessage::buffer, TheWorldStandSkins1ButtonMessage::new, TheWorldStandSkins1ButtonMessage::handler);
	}
}
