
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jojowos.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.jojowos.network.UseSkillMessage;
import net.mcreator.jojowos.network.ToggleShiftMessage;
import net.mcreator.jojowos.network.SwitchSkillMessage;
import net.mcreator.jojowos.network.SummonStandMessage;
import net.mcreator.jojowos.network.StandBlockMessage;
import net.mcreator.jojowos.network.OpenStandStatsMessage;
import net.mcreator.jojowos.JojowosMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class JojowosModKeyMappings {
	public static final KeyMapping SUMMON_STAND = new KeyMapping("key.jojowos.summon_stand", GLFW.GLFW_KEY_V, "key.categories.jojowos") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				JojowosMod.PACKET_HANDLER.sendToServer(new SummonStandMessage(0, 0));
				SummonStandMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping SWITCH_SKILL = new KeyMapping("key.jojowos.switch_skill", GLFW.GLFW_KEY_X, "key.categories.jojowos") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				JojowosMod.PACKET_HANDLER.sendToServer(new SwitchSkillMessage(0, 0));
				SwitchSkillMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping USE_SKILL = new KeyMapping("key.jojowos.use_skill", GLFW.GLFW_KEY_C, "key.categories.jojowos") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				JojowosMod.PACKET_HANDLER.sendToServer(new UseSkillMessage(0, 0));
				UseSkillMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping OPEN_STAND_STATS = new KeyMapping("key.jojowos.open_stand_stats", GLFW.GLFW_KEY_G, "key.categories.jojowos") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				JojowosMod.PACKET_HANDLER.sendToServer(new OpenStandStatsMessage(0, 0));
				OpenStandStatsMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping TOGGLE_SHIFT = new KeyMapping("key.jojowos.toggle_shift", GLFW.GLFW_KEY_LEFT_SHIFT, "key.categories.jojowos") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				JojowosMod.PACKET_HANDLER.sendToServer(new ToggleShiftMessage(0, 0));
				ToggleShiftMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping STAND_BLOCK = new KeyMapping("key.jojowos.stand_block", GLFW.GLFW_KEY_LEFT_CONTROL, "key.categories.jojowos") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				JojowosMod.PACKET_HANDLER.sendToServer(new StandBlockMessage(0, 0));
				StandBlockMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				STAND_BLOCK_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - STAND_BLOCK_LASTPRESS);
				JojowosMod.PACKET_HANDLER.sendToServer(new StandBlockMessage(1, dt));
				StandBlockMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	private static long STAND_BLOCK_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(SUMMON_STAND);
		event.register(SWITCH_SKILL);
		event.register(USE_SKILL);
		event.register(OPEN_STAND_STATS);
		event.register(TOGGLE_SHIFT);
		event.register(STAND_BLOCK);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				SUMMON_STAND.consumeClick();
				SWITCH_SKILL.consumeClick();
				USE_SKILL.consumeClick();
				OPEN_STAND_STATS.consumeClick();
				TOGGLE_SHIFT.consumeClick();
				STAND_BLOCK.consumeClick();
			}
		}
	}
}
