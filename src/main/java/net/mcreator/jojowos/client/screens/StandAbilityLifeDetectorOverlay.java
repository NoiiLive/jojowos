
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

import net.mcreator.jojowos.procedures.ReturnStandSummonedProcedure;
import net.mcreator.jojowos.procedures.LifeDetectorUnselected9Procedure;
import net.mcreator.jojowos.procedures.LifeDetectorUnselected8Procedure;
import net.mcreator.jojowos.procedures.LifeDetectorUnselected7Procedure;
import net.mcreator.jojowos.procedures.LifeDetectorUnselected6Procedure;
import net.mcreator.jojowos.procedures.LifeDetectorUnselected5Procedure;
import net.mcreator.jojowos.procedures.LifeDetectorUnselected4Procedure;
import net.mcreator.jojowos.procedures.LifeDetectorUnselected3Procedure;
import net.mcreator.jojowos.procedures.LifeDetectorUnselected2Procedure;
import net.mcreator.jojowos.procedures.LifeDetectorUnselected1Procedure;
import net.mcreator.jojowos.procedures.LifeDetectorSelected9Procedure;
import net.mcreator.jojowos.procedures.LifeDetectorSelected7Procedure;
import net.mcreator.jojowos.procedures.LifeDetectorSelected6Procedure;
import net.mcreator.jojowos.procedures.LifeDetectorSelected5Procedure;
import net.mcreator.jojowos.procedures.LifeDetectorSelected4Procedure;
import net.mcreator.jojowos.procedures.LifeDetectorSelected3Procedure;
import net.mcreator.jojowos.procedures.LifeDetectorSelected2Procedure;
import net.mcreator.jojowos.procedures.LifeDetectorSelected1Procedure;
import net.mcreator.jojowos.procedures.DontReturnProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class StandAbilityLifeDetectorOverlay {
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
			if (LifeDetectorUnselected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_lifedetect.png"), 27, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (LifeDetectorUnselected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_lifedetect.png"), 46, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (LifeDetectorUnselected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_lifedetect.png"), 65, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (LifeDetectorUnselected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_lifedetect.png"), 84, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (LifeDetectorUnselected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_lifedetect.png"), 8, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (LifeDetectorUnselected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_lifedetect.png"), 27, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (LifeDetectorUnselected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_lifedetect.png"), 47, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (LifeDetectorUnselected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_lifedetect.png"), 65, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (LifeDetectorUnselected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_lifedetect.png"), 84, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (LifeDetectorSelected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_lifedetect.png"), 25, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (LifeDetectorSelected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_lifedetect.png"), 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (LifeDetectorSelected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_lifedetect.png"), 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (LifeDetectorSelected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_lifedetect.png"), 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (LifeDetectorSelected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_lifedetect.png"), 6, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (LifeDetectorSelected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_lifedetect.png"), 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (LifeDetectorSelected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_lifedetect.png"), 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (LifeDetectorUnselected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_lifedetect.png"), 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (LifeDetectorSelected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_lifedetect.png"), 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
