
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

import net.mcreator.jojowos.procedures.TangleUnselected9Procedure;
import net.mcreator.jojowos.procedures.TangleUnselected8Procedure;
import net.mcreator.jojowos.procedures.TangleUnselected7Procedure;
import net.mcreator.jojowos.procedures.TangleUnselected6Procedure;
import net.mcreator.jojowos.procedures.TangleUnselected5Procedure;
import net.mcreator.jojowos.procedures.TangleUnselected4Procedure;
import net.mcreator.jojowos.procedures.TangleUnselected3Procedure;
import net.mcreator.jojowos.procedures.TangleUnselected2Procedure;
import net.mcreator.jojowos.procedures.TangleUnselected1Procedure;
import net.mcreator.jojowos.procedures.TangleSelected9Procedure;
import net.mcreator.jojowos.procedures.TangleSelected8Procedure;
import net.mcreator.jojowos.procedures.TangleSelected7Procedure;
import net.mcreator.jojowos.procedures.TangleSelected6Procedure;
import net.mcreator.jojowos.procedures.TangleSelected5Procedure;
import net.mcreator.jojowos.procedures.TangleSelected4Procedure;
import net.mcreator.jojowos.procedures.TangleSelected3Procedure;
import net.mcreator.jojowos.procedures.TangleSelected2Procedure;
import net.mcreator.jojowos.procedures.TangleSelected1Procedure;
import net.mcreator.jojowos.procedures.ReturnSummonedProcedure;
import net.mcreator.jojowos.procedures.DontReturnProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class StandAbilityTangleOverlay {
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
			if (TangleUnselected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_tangle.png"), 27, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (TangleUnselected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_tangle.png"), 46, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (TangleUnselected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_tangle.png"), 65, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (TangleUnselected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_tangle.png"), 84, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (TangleUnselected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_tangle.png"), 8, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (TangleUnselected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_tangle.png"), 27, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (TangleUnselected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_tangle.png"), 46, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (TangleUnselected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_tangle.png"), 65, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (TangleUnselected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_tangle.png"), 84, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (TangleSelected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_tangle.png"), 25, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (TangleSelected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_tangle.png"), 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (TangleSelected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_tangle.png"), 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (TangleSelected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_tangle.png"), 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (TangleSelected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_tangle.png"), 6, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (TangleSelected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_tangle.png"), 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (TangleSelected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_tangle.png"), 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (TangleSelected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_tangle.png"), 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (TangleSelected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_tangle.png"), 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
