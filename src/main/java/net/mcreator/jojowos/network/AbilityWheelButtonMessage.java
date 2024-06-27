
package net.mcreator.jojowos.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.jojowos.world.inventory.AbilityWheelMenu;
import net.mcreator.jojowos.procedures.WheelSwitcherProcedure;
import net.mcreator.jojowos.procedures.WheelAbility9Procedure;
import net.mcreator.jojowos.procedures.WheelAbility8Procedure;
import net.mcreator.jojowos.procedures.WheelAbility7Procedure;
import net.mcreator.jojowos.procedures.WheelAbility6Procedure;
import net.mcreator.jojowos.procedures.WheelAbility5Procedure;
import net.mcreator.jojowos.procedures.WheelAbility4Procedure;
import net.mcreator.jojowos.procedures.WheelAbility3Procedure;
import net.mcreator.jojowos.procedures.WheelAbility2Procedure;
import net.mcreator.jojowos.procedures.WheelAbility1Procedure;
import net.mcreator.jojowos.JojowosMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AbilityWheelButtonMessage {
	private final int buttonID, x, y, z;

	public AbilityWheelButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public AbilityWheelButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(AbilityWheelButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(AbilityWheelButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = AbilityWheelMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			WheelSwitcherProcedure.execute(entity);
		}
		if (buttonID == 1) {

			WheelAbility1Procedure.execute(entity);
		}
		if (buttonID == 2) {

			WheelAbility2Procedure.execute(entity);
		}
		if (buttonID == 3) {

			WheelAbility3Procedure.execute(entity);
		}
		if (buttonID == 4) {

			WheelAbility4Procedure.execute(entity);
		}
		if (buttonID == 5) {

			WheelAbility5Procedure.execute(entity);
		}
		if (buttonID == 6) {

			WheelAbility6Procedure.execute(entity);
		}
		if (buttonID == 7) {

			WheelAbility7Procedure.execute(entity);
		}
		if (buttonID == 8) {

			WheelAbility8Procedure.execute(entity);
		}
		if (buttonID == 9) {

			WheelAbility9Procedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		JojowosMod.addNetworkMessage(AbilityWheelButtonMessage.class, AbilityWheelButtonMessage::buffer, AbilityWheelButtonMessage::new, AbilityWheelButtonMessage::handler);
	}
}
