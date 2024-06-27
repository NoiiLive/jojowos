
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
import net.mcreator.jojowos.network.UseAbility9Message;
import net.mcreator.jojowos.network.UseAbility8Message;
import net.mcreator.jojowos.network.UseAbility7Message;
import net.mcreator.jojowos.network.UseAbility6Message;
import net.mcreator.jojowos.network.UseAbility5Message;
import net.mcreator.jojowos.network.UseAbility4Message;
import net.mcreator.jojowos.network.UseAbility3Message;
import net.mcreator.jojowos.network.UseAbility2Message;
import net.mcreator.jojowos.network.UseAbility1Message;
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
	public static final KeyMapping USE_ABILITY_1 = new KeyMapping("key.jojowos.use_ability_1", GLFW.GLFW_KEY_KP_1, "key.categories.jojowos") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				JojowosMod.PACKET_HANDLER.sendToServer(new UseAbility1Message(0, 0));
				UseAbility1Message.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping USE_ABILITY_2 = new KeyMapping("key.jojowos.use_ability_2", GLFW.GLFW_KEY_KP_2, "key.categories.jojowos") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				JojowosMod.PACKET_HANDLER.sendToServer(new UseAbility2Message(0, 0));
				UseAbility2Message.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping USE_ABILITY_3 = new KeyMapping("key.jojowos.use_ability_3", GLFW.GLFW_KEY_KP_3, "key.categories.jojowos") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				JojowosMod.PACKET_HANDLER.sendToServer(new UseAbility3Message(0, 0));
				UseAbility3Message.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping USE_ABILITY_4 = new KeyMapping("key.jojowos.use_ability_4", GLFW.GLFW_KEY_KP_4, "key.categories.jojowos") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				JojowosMod.PACKET_HANDLER.sendToServer(new UseAbility4Message(0, 0));
				UseAbility4Message.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping USE_ABILITY_5 = new KeyMapping("key.jojowos.use_ability_5", GLFW.GLFW_KEY_KP_5, "key.categories.jojowos") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				JojowosMod.PACKET_HANDLER.sendToServer(new UseAbility5Message(0, 0));
				UseAbility5Message.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping USE_ABILITY_6 = new KeyMapping("key.jojowos.use_ability_6", GLFW.GLFW_KEY_KP_6, "key.categories.jojowos") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				JojowosMod.PACKET_HANDLER.sendToServer(new UseAbility6Message(0, 0));
				UseAbility6Message.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping USE_ABILITY_7 = new KeyMapping("key.jojowos.use_ability_7", GLFW.GLFW_KEY_KP_7, "key.categories.jojowos") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				JojowosMod.PACKET_HANDLER.sendToServer(new UseAbility7Message(0, 0));
				UseAbility7Message.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping USE_ABILITY_8 = new KeyMapping("key.jojowos.use_ability_8", GLFW.GLFW_KEY_KP_8, "key.categories.jojowos") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				JojowosMod.PACKET_HANDLER.sendToServer(new UseAbility8Message(0, 0));
				UseAbility8Message.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping USE_ABILITY_9 = new KeyMapping("key.jojowos.use_ability_9", GLFW.GLFW_KEY_KP_9, "key.categories.jojowos") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				JojowosMod.PACKET_HANDLER.sendToServer(new UseAbility9Message(0, 0));
				UseAbility9Message.pressAction(Minecraft.getInstance().player, 0, 0);
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
		event.register(USE_ABILITY_1);
		event.register(USE_ABILITY_2);
		event.register(USE_ABILITY_3);
		event.register(USE_ABILITY_4);
		event.register(USE_ABILITY_5);
		event.register(USE_ABILITY_6);
		event.register(USE_ABILITY_7);
		event.register(USE_ABILITY_8);
		event.register(USE_ABILITY_9);
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
				USE_ABILITY_1.consumeClick();
				USE_ABILITY_2.consumeClick();
				USE_ABILITY_3.consumeClick();
				USE_ABILITY_4.consumeClick();
				USE_ABILITY_5.consumeClick();
				USE_ABILITY_6.consumeClick();
				USE_ABILITY_7.consumeClick();
				USE_ABILITY_8.consumeClick();
				USE_ABILITY_9.consumeClick();
			}
		}
	}
}
