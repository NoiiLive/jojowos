
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

import net.mcreator.jojowos.procedures.StarFingerUnselected9Procedure;
import net.mcreator.jojowos.procedures.StarFingerUnselected8Procedure;
import net.mcreator.jojowos.procedures.StarFingerUnselected7Procedure;
import net.mcreator.jojowos.procedures.StarFingerUnselected6Procedure;
import net.mcreator.jojowos.procedures.StarFingerUnselected5Procedure;
import net.mcreator.jojowos.procedures.StarFingerUnselected4Procedure;
import net.mcreator.jojowos.procedures.StarFingerUnselected3Procedure;
import net.mcreator.jojowos.procedures.StarFingerUnselected2Procedure;
import net.mcreator.jojowos.procedures.StarFingerUnselected1Procedure;
import net.mcreator.jojowos.procedures.StarFingerSelected9Procedure;
import net.mcreator.jojowos.procedures.StarFingerSelected8Procedure;
import net.mcreator.jojowos.procedures.StarFingerSelected7Procedure;
import net.mcreator.jojowos.procedures.StarFingerSelected6Procedure;
import net.mcreator.jojowos.procedures.StarFingerSelected5Procedure;
import net.mcreator.jojowos.procedures.StarFingerSelected4Procedure;
import net.mcreator.jojowos.procedures.StarFingerSelected3Procedure;
import net.mcreator.jojowos.procedures.StarFingerSelected2Procedure;
import net.mcreator.jojowos.procedures.StarFingerSelected1Procedure;
import net.mcreator.jojowos.procedures.ReturnStandSummonedProcedure;
import net.mcreator.jojowos.procedures.DontReturnProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class StandAbilityStarFingerOverlay {
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
			if (StarFingerUnselected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_starfinger.png"), 27, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (StarFingerUnselected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_starfinger.png"), 46, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (StarFingerUnselected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_starfinger.png"), 65, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (StarFingerUnselected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_starfinger.png"), 84, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (StarFingerUnselected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_starfinger.png"), 8, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (StarFingerUnselected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_starfinger.png"), 27, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (StarFingerUnselected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_starfinger.png"), 46, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (StarFingerUnselected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_starfinger.png"), 65, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (StarFingerUnselected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_starfinger.png"), 84, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (StarFingerSelected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_starfinger.png"), 25, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (StarFingerSelected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_starfinger.png"), 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (StarFingerSelected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_starfinger.png"), 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (StarFingerSelected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_starfinger.png"), 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (StarFingerSelected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_starfinger.png"), 6, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (StarFingerSelected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_starfinger.png"), 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (StarFingerSelected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_starfinger.png"), 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (StarFingerSelected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_starfinger.png"), 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (StarFingerSelected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_starfinger.png"), 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
