
package net.mcreator.jojowos.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.jojowos.world.inventory.StandStatMenu;
import net.mcreator.jojowos.procedures.StatAddSpeedProcedure;
import net.mcreator.jojowos.procedures.StatAddPrecisionProcedure;
import net.mcreator.jojowos.procedures.StatAddPowerProcedure;
import net.mcreator.jojowos.procedures.StatAddPotentialProcedure;
import net.mcreator.jojowos.procedures.StatAddDurabilityProcedure;
import net.mcreator.jojowos.procedures.OpenStandSkinGUIProcedure;
import net.mcreator.jojowos.procedures.OpenSkillTreeGUIProcedure;
import net.mcreator.jojowos.procedures.OpenMainQuestProcedure;
import net.mcreator.jojowos.JojowosMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class StandStatButtonMessage {
	private final int buttonID, x, y, z;

	public StandStatButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public StandStatButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(StandStatButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(StandStatButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = StandStatMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			StatAddPowerProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			StatAddSpeedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			StatAddDurabilityProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			StatAddPrecisionProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			StatAddPotentialProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			OpenSkillTreeGUIProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			OpenMainQuestProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 7) {

			OpenStandSkinGUIProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		JojowosMod.addNetworkMessage(StandStatButtonMessage.class, StandStatButtonMessage::buffer, StandStatButtonMessage::new, StandStatButtonMessage::handler);
	}
}
