
package net.mcreator.jojowos.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.jojowos.procedures.AbilityTimeLeftDisplayProcedure;
import net.mcreator.jojowos.procedures.AbilityTextDisplayProcedure;
import net.mcreator.jojowos.procedures.AbilityTextDisplayConditionProcedure;
import net.mcreator.jojowos.procedures.AbilityLockDisplayProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class AbilityDisplayOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (true) {
			if (AbilityLockDisplayProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_lock.png"), 22, h - 39, 0, 0, 16, 16, 16, 16);
			}
			if (AbilityTextDisplayConditionProcedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						AbilityTextDisplayProcedure.execute(entity), 24, h - 54, -1, false);
			if (AbilityLockDisplayProcedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						AbilityTimeLeftDisplayProcedure.execute(entity), 42, h - 35, -39322, false);
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
