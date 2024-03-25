
package net.mcreator.jojowos.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.jojowos.world.inventory.StarPlatinumStandSkins1Menu;
import net.mcreator.jojowos.procedures.OpenSkinStarPlatinum2Procedure;
import net.mcreator.jojowos.procedures.EquipSkinStarPlatinumPart6Procedure;
import net.mcreator.jojowos.procedures.EquipSkinStarPlatinumPart4Procedure;
import net.mcreator.jojowos.procedures.EquipSkinStarPlatinumMangaProcedure;
import net.mcreator.jojowos.procedures.EquipSkinStarPlatinumBaseProcedure;
import net.mcreator.jojowos.JojowosMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class StarPlatinumStandSkins1ButtonMessage {
	private final int buttonID, x, y, z;

	public StarPlatinumStandSkins1ButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public StarPlatinumStandSkins1ButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(StarPlatinumStandSkins1ButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(StarPlatinumStandSkins1ButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = StarPlatinumStandSkins1Menu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			EquipSkinStarPlatinumBaseProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			EquipSkinStarPlatinumPart4Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			EquipSkinStarPlatinumPart6Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			EquipSkinStarPlatinumMangaProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			OpenSkinStarPlatinum2Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			OpenSkinStarPlatinum2Procedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		JojowosMod.addNetworkMessage(StarPlatinumStandSkins1ButtonMessage.class, StarPlatinumStandSkins1ButtonMessage::buffer, StarPlatinumStandSkins1ButtonMessage::new, StarPlatinumStandSkins1ButtonMessage::handler);
	}
}
