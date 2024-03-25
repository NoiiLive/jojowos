
package net.mcreator.jojowos.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.jojowos.world.inventory.AbilityWheelStarPlatinumMenu;
import net.mcreator.jojowos.procedures.WheelSwitcherProcedure;
import net.mcreator.jojowos.procedures.StarTimeStopAbilityWheelProcedure;
import net.mcreator.jojowos.procedures.StarTimeSkipAbilityWheelProcedure;
import net.mcreator.jojowos.procedures.StarFingerAbilityWheelProcedure;
import net.mcreator.jojowos.procedures.OraBarrageAbilityWheelProcedure;
import net.mcreator.jojowos.procedures.InhaleAbilityWheelProcedure;
import net.mcreator.jojowos.procedures.BearingShotAbilityWheelProcedure;
import net.mcreator.jojowos.JojowosMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AbilityWheelStarPlatinumButtonMessage {
	private final int buttonID, x, y, z;

	public AbilityWheelStarPlatinumButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public AbilityWheelStarPlatinumButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(AbilityWheelStarPlatinumButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(AbilityWheelStarPlatinumButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = AbilityWheelStarPlatinumMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			StarFingerAbilityWheelProcedure.execute(entity);
		}
		if (buttonID == 1) {

			BearingShotAbilityWheelProcedure.execute(entity);
		}
		if (buttonID == 2) {

			InhaleAbilityWheelProcedure.execute(entity);
		}
		if (buttonID == 3) {

			StarTimeSkipAbilityWheelProcedure.execute(entity);
		}
		if (buttonID == 4) {

			StarTimeStopAbilityWheelProcedure.execute(entity);
		}
		if (buttonID == 5) {

			OraBarrageAbilityWheelProcedure.execute(entity);
		}
		if (buttonID == 6) {

			WheelSwitcherProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		JojowosMod.addNetworkMessage(AbilityWheelStarPlatinumButtonMessage.class, AbilityWheelStarPlatinumButtonMessage::buffer, AbilityWheelStarPlatinumButtonMessage::new, AbilityWheelStarPlatinumButtonMessage::handler);
	}
}
