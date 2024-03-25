
package net.mcreator.jojowos.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.jojowos.world.inventory.TheWorldSkillTreeMenu;
import net.mcreator.jojowos.procedures.WorldTimeStopUnlockButtonProcedure;
import net.mcreator.jojowos.procedures.WorldTimeSkipUnlockButtonProcedure;
import net.mcreator.jojowos.procedures.RoadRollerUnlockButtonProcedure;
import net.mcreator.jojowos.procedures.OpenStandStatKeybindProcedure;
import net.mcreator.jojowos.procedures.MudaKickUnlockButtonProcedure;
import net.mcreator.jojowos.procedures.KnifeTossUnlockButtonProcedure;
import net.mcreator.jojowos.JojowosMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheWorldSkillTreeButtonMessage {
	private final int buttonID, x, y, z;

	public TheWorldSkillTreeButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public TheWorldSkillTreeButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(TheWorldSkillTreeButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(TheWorldSkillTreeButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = TheWorldSkillTreeMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			RoadRollerUnlockButtonProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			WorldTimeSkipUnlockButtonProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			WorldTimeStopUnlockButtonProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			MudaKickUnlockButtonProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			KnifeTossUnlockButtonProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			OpenStandStatKeybindProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		JojowosMod.addNetworkMessage(TheWorldSkillTreeButtonMessage.class, TheWorldSkillTreeButtonMessage::buffer, TheWorldSkillTreeButtonMessage::new, TheWorldSkillTreeButtonMessage::handler);
	}
}
