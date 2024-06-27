
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
import net.mcreator.jojowos.procedures.FistBarrageUnselected9Procedure;
import net.mcreator.jojowos.procedures.FistBarrageUnselected8Procedure;
import net.mcreator.jojowos.procedures.FistBarrageUnselected7Procedure;
import net.mcreator.jojowos.procedures.FistBarrageUnselected6Procedure;
import net.mcreator.jojowos.procedures.FistBarrageUnselected5Procedure;
import net.mcreator.jojowos.procedures.FistBarrageUnselected4Procedure;
import net.mcreator.jojowos.procedures.FistBarrageUnselected3Procedure;
import net.mcreator.jojowos.procedures.FistBarrageUnselected2Procedure;
import net.mcreator.jojowos.procedures.FistBarrageUnselected1Procedure;
import net.mcreator.jojowos.procedures.FistBarrageSelected9Procedure;
import net.mcreator.jojowos.procedures.FistBarrageSelected8Procedure;
import net.mcreator.jojowos.procedures.FistBarrageSelected7Procedure;
import net.mcreator.jojowos.procedures.FistBarrageSelected6Procedure;
import net.mcreator.jojowos.procedures.FistBarrageSelected5Procedure;
import net.mcreator.jojowos.procedures.FistBarrageSelected4Procedure;
import net.mcreator.jojowos.procedures.FistBarrageSelected3Procedure;
import net.mcreator.jojowos.procedures.FistBarrageSelected2Procedure;
import net.mcreator.jojowos.procedures.FistBarrageSelected1Procedure;
import net.mcreator.jojowos.procedures.DontReturnProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class StandAbilityFistBarrageOverlay {
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
			if (FistBarrageUnselected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_fistbarrage.png"), 27, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (FistBarrageUnselected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_fistbarrage.png"), 46, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (FistBarrageUnselected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_fistbarrage.png"), 65, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (FistBarrageUnselected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_fistbarrage.png"), 84, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (FistBarrageUnselected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_fistbarrage.png"), 8, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (FistBarrageUnselected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_fistbarrage.png"), 27, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (FistBarrageUnselected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_fistbarrage.png"), 46, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (FistBarrageUnselected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_fistbarrage.png"), 65, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (FistBarrageUnselected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_fistbarrage.png"), 84, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (FistBarrageSelected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_fistbarrage.png"), 25, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (FistBarrageSelected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_fistbarrage.png"), 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (FistBarrageSelected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_fistbarrage.png"), 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (FistBarrageSelected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_fistbarrage.png"), 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (FistBarrageSelected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_fistbarrage.png"), 6, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (FistBarrageSelected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_fistbarrage.png"), 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (FistBarrageSelected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_fistbarrage.png"), 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (FistBarrageSelected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_fistbarrage.png"), 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (FistBarrageSelected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_fistbarrage.png"), 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
