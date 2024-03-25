
package net.mcreator.jojowos.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.jojowos.world.inventory.SilverChariotSkillTreeMenu;
import net.mcreator.jojowos.procedures.SwordLaunchUnlockButtonProcedure;
import net.mcreator.jojowos.procedures.OpenStandStatKeybindProcedure;
import net.mcreator.jojowos.procedures.BladeCycloneUnlockButtonProcedure;
import net.mcreator.jojowos.procedures.ArmorOffUnlockButtonProcedure;
import net.mcreator.jojowos.JojowosMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SilverChariotSkillTreeButtonMessage {
	private final int buttonID, x, y, z;

	public SilverChariotSkillTreeButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public SilverChariotSkillTreeButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(SilverChariotSkillTreeButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(SilverChariotSkillTreeButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = SilverChariotSkillTreeMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			BladeCycloneUnlockButtonProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			SwordLaunchUnlockButtonProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			ArmorOffUnlockButtonProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			OpenStandStatKeybindProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		JojowosMod.addNetworkMessage(SilverChariotSkillTreeButtonMessage.class, SilverChariotSkillTreeButtonMessage::buffer, SilverChariotSkillTreeButtonMessage::new, SilverChariotSkillTreeButtonMessage::handler);
	}
}
