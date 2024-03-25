package net.mcreator.jojowos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.mcreator.jojowos.init.JojowosModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerTimeFreezeShaderProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		boolean gate = false;
		gate = false;
		if (world.isClientSide() && entity instanceof Player) {
			if (entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(JojowosModMobEffects.TIME_STOP_VISUAL.get()) && Minecraft.getInstance().gameRenderer.currentEffect() == null && gate == false) {
				Minecraft.getInstance().gameRenderer.loadEffect(new ResourceLocation("jojowos:shaders/timestop.json"));
				gate = true;
			}
			if ((entity instanceof LivingEntity _livEnt6 && _livEnt6.hasEffect(JojowosModMobEffects.TIME_STOP_VISUAL.get())) == false && Minecraft.getInstance().gameRenderer.currentEffect() != null
					&& Minecraft.getInstance().gameRenderer.currentEffect().getName().equals("jojowos:shaders/timestop.json") && gate == false) {
				Minecraft.getInstance().gameRenderer.shutdownEffect();
				gate = true;
			}
		}
	}
}
