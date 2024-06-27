
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

import net.mcreator.jojowos.procedures.ReturnSummonedProcedure;
import net.mcreator.jojowos.procedures.GrappleUnselected9Procedure;
import net.mcreator.jojowos.procedures.GrappleUnselected8Procedure;
import net.mcreator.jojowos.procedures.GrappleUnselected7Procedure;
import net.mcreator.jojowos.procedures.GrappleUnselected6Procedure;
import net.mcreator.jojowos.procedures.GrappleUnselected5Procedure;
import net.mcreator.jojowos.procedures.GrappleUnselected4Procedure;
import net.mcreator.jojowos.procedures.GrappleUnselected3Procedure;
import net.mcreator.jojowos.procedures.GrappleUnselected2Procedure;
import net.mcreator.jojowos.procedures.GrappleUnselected1Procedure;
import net.mcreator.jojowos.procedures.GrappleSelected9Procedure;
import net.mcreator.jojowos.procedures.GrappleSelected8Procedure;
import net.mcreator.jojowos.procedures.GrappleSelected7Procedure;
import net.mcreator.jojowos.procedures.GrappleSelected6Procedure;
import net.mcreator.jojowos.procedures.GrappleSelected5Procedure;
import net.mcreator.jojowos.procedures.GrappleSelected4Procedure;
import net.mcreator.jojowos.procedures.GrappleSelected3Procedure;
import net.mcreator.jojowos.procedures.GrappleSelected2Procedure;
import net.mcreator.jojowos.procedures.GrappleSelected1Procedure;
import net.mcreator.jojowos.procedures.DontReturnProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class StandAbilityGrappleOverlay {
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
		if (ReturnSummonedProcedure.execute(entity)) {
			if (DontReturnProcedure.execute()) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_switch_display_9.png"), 6, h - 44, 0, 0, 96, 39, 96, 39);
			}
			if (GrappleUnselected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_grapple.png"), 27, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (GrappleUnselected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_grapple.png"), 46, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (GrappleUnselected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_grapple.png"), 65, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (GrappleUnselected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_grapple.png"), 84, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (GrappleUnselected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_grapple.png"), 8, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (GrappleUnselected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_grapple.png"), 27, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (GrappleUnselected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_grapple.png"), 46, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (GrappleUnselected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_grapple.png"), 65, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (GrappleUnselected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_grapple.png"), 84, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (GrappleSelected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_grapple.png"), 25, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (GrappleSelected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_grapple.png"), 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (GrappleSelected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_grapple.png"), 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (GrappleSelected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_grapple.png"), 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (GrappleSelected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_grapple.png"), 6, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (GrappleSelected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_grapple.png"), 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (GrappleSelected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_grapple.png"), 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (GrappleSelected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_grapple.png"), 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (GrappleSelected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_grapple.png"), 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
