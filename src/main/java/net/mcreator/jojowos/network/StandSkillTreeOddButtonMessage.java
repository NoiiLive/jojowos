
package net.mcreator.jojowos.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.jojowos.world.inventory.StandSkillTreeOddMenu;
import net.mcreator.jojowos.procedures.UnlockAbility9Procedure;
import net.mcreator.jojowos.procedures.UnlockAbility8Procedure;
import net.mcreator.jojowos.procedures.UnlockAbility7Procedure;
import net.mcreator.jojowos.procedures.UnlockAbility6Procedure;
import net.mcreator.jojowos.procedures.UnlockAbility5Procedure;
import net.mcreator.jojowos.procedures.UnlockAbility4Procedure;
import net.mcreator.jojowos.procedures.UnlockAbility3Procedure;
import net.mcreator.jojowos.procedures.UnlockAbility2Procedure;
import net.mcreator.jojowos.procedures.OpenStandStatKeybindProcedure;
import net.mcreator.jojowos.JojowosMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class StandSkillTreeOddButtonMessage {
	private final int buttonID, x, y, z;

	public StandSkillTreeOddButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public StandSkillTreeOddButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(StandSkillTreeOddButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(StandSkillTreeOddButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = StandSkillTreeOddMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			OpenStandStatKeybindProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			UnlockAbility2Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			UnlockAbility3Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			UnlockAbility4Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			UnlockAbility5Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			UnlockAbility6Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			UnlockAbility7Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 7) {

			UnlockAbility8Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 8) {

			UnlockAbility9Procedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		JojowosMod.addNetworkMessage(StandSkillTreeOddButtonMessage.class, StandSkillTreeOddButtonMessage::buffer, StandSkillTreeOddButtonMessage::new, StandSkillTreeOddButtonMessage::handler);
	}
}
