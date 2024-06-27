
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

import net.mcreator.jojowos.procedures.ZoomUnselected9Procedure;
import net.mcreator.jojowos.procedures.ZoomUnselected8Procedure;
import net.mcreator.jojowos.procedures.ZoomUnselected7Procedure;
import net.mcreator.jojowos.procedures.ZoomUnselected6Procedure;
import net.mcreator.jojowos.procedures.ZoomUnselected5Procedure;
import net.mcreator.jojowos.procedures.ZoomUnselected4Procedure;
import net.mcreator.jojowos.procedures.ZoomUnselected3Procedure;
import net.mcreator.jojowos.procedures.ZoomUnselected2Procedure;
import net.mcreator.jojowos.procedures.ZoomUnselected1Procedure;
import net.mcreator.jojowos.procedures.ZoomSelected9Procedure;
import net.mcreator.jojowos.procedures.ZoomSelected8Procedure;
import net.mcreator.jojowos.procedures.ZoomSelected7Procedure;
import net.mcreator.jojowos.procedures.ZoomSelected6Procedure;
import net.mcreator.jojowos.procedures.ZoomSelected5Procedure;
import net.mcreator.jojowos.procedures.ZoomSelected4Procedure;
import net.mcreator.jojowos.procedures.ZoomSelected3Procedure;
import net.mcreator.jojowos.procedures.ZoomSelected2Procedure;
import net.mcreator.jojowos.procedures.ZoomSelected1Procedure;
import net.mcreator.jojowos.procedures.ReturnStandSummonedProcedure;
import net.mcreator.jojowos.procedures.DontReturnProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class StandAbilityZoomOverlay {
	@SubscribeEvent(priority = EventPriority.LOW)
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
		if (ReturnStandSummonedProcedure.execute(entity)) {
			if (DontReturnProcedure.execute()) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_switch_display_9.png"), 6, h - 44, 0, 0, 96, 39, 96, 39);
			}
			if (ZoomUnselected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_zoom.png"), 27, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (ZoomUnselected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_zoom.png"), 46, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (ZoomUnselected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_zoom.png"), 65, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (ZoomUnselected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_zoom.png"), 84, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (ZoomUnselected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_zoom.png"), 8, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (ZoomUnselected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_zoom.png"), 27, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (ZoomUnselected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_zoom.png"), 46, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (ZoomUnselected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_zoom.png"), 65, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (ZoomUnselected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_zoom.png"), 84, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (ZoomSelected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_zoom.png"), 25, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ZoomSelected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_zoom.png"), 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ZoomSelected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_zoom.png"), 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ZoomSelected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_zoom.png"), 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ZoomSelected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_zoom.png"), 6, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ZoomSelected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_zoom.png"), 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ZoomSelected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_zoom.png"), 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ZoomSelected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_zoom.png"), 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ZoomSelected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_zoom.png"), 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
