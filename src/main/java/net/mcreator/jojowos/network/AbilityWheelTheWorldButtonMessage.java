
package net.mcreator.jojowos.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.jojowos.world.inventory.AbilityWheelTheWorldMenu;
import net.mcreator.jojowos.procedures.WorldTimeStopAbilityWheelProcedure;
import net.mcreator.jojowos.procedures.WorldTimeSkipAbilityWheelProcedure;
import net.mcreator.jojowos.procedures.RoadRollerAbilityWheelProcedure;
import net.mcreator.jojowos.procedures.MudaKickBarrageAbilityWheelProcedure;
import net.mcreator.jojowos.procedures.MudaBarrageAbilityWheelProcedure;
import net.mcreator.jojowos.procedures.KnifeTossAbilityWheelProcedure;
import net.mcreator.jojowos.JojowosMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AbilityWheelTheWorldButtonMessage {
	private final int buttonID, x, y, z;

	public AbilityWheelTheWorldButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public AbilityWheelTheWorldButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(AbilityWheelTheWorldButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(AbilityWheelTheWorldButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = AbilityWheelTheWorldMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			MudaBarrageAbilityWheelProcedure.execute(entity);
		}
		if (buttonID == 1) {

			KnifeTossAbilityWheelProcedure.execute(entity);
		}
		if (buttonID == 2) {

			MudaKickBarrageAbilityWheelProcedure.execute(entity);
		}
		if (buttonID == 3) {

			WorldTimeSkipAbilityWheelProcedure.execute(entity);
		}
		if (buttonID == 4) {

			WorldTimeStopAbilityWheelProcedure.execute(entity);
		}
		if (buttonID == 5) {

			RoadRollerAbilityWheelProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		JojowosMod.addNetworkMessage(AbilityWheelTheWorldButtonMessage.class, AbilityWheelTheWorldButtonMessage::buffer, AbilityWheelTheWorldButtonMessage::new, AbilityWheelTheWorldButtonMessage::handler);
	}
}
