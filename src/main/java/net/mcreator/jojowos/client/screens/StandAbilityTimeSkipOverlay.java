
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

import net.mcreator.jojowos.procedures.TimeSkipUnselected9Procedure;
import net.mcreator.jojowos.procedures.TimeSkipUnselected8Procedure;
import net.mcreator.jojowos.procedures.TimeSkipUnselected7Procedure;
import net.mcreator.jojowos.procedures.TimeSkipUnselected6Procedure;
import net.mcreator.jojowos.procedures.TimeSkipUnselected5Procedure;
import net.mcreator.jojowos.procedures.TimeSkipUnselected4Procedure;
import net.mcreator.jojowos.procedures.TimeSkipUnselected3Procedure;
import net.mcreator.jojowos.procedures.TimeSkipUnselected2Procedure;
import net.mcreator.jojowos.procedures.TimeSkipUnselected1Procedure;
import net.mcreator.jojowos.procedures.TimeSkipSelected9Procedure;
import net.mcreator.jojowos.procedures.TimeSkipSelected8Procedure;
import net.mcreator.jojowos.procedures.TimeSkipSelected7Procedure;
import net.mcreator.jojowos.procedures.TimeSkipSelected6Procedure;
import net.mcreator.jojowos.procedures.TimeSkipSelected5Procedure;
import net.mcreator.jojowos.procedures.TimeSkipSelected4Procedure;
import net.mcreator.jojowos.procedures.TimeSkipSelected3Procedure;
import net.mcreator.jojowos.procedures.TimeSkipSelected2Procedure;
import net.mcreator.jojowos.procedures.TimeSkipSelected1Procedure;
import net.mcreator.jojowos.procedures.ReturnStandSummonedProcedure;
import net.mcreator.jojowos.procedures.DontReturnProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class StandAbilityTimeSkipOverlay {
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
			if (TimeSkipUnselected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_timeskip.png"), 27, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (TimeSkipUnselected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_timeskip.png"), 46, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (TimeSkipUnselected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_timeskip.png"), 65, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (TimeSkipUnselected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_timeskip.png"), 84, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (TimeSkipUnselected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_timeskip.png"), 8, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (TimeSkipUnselected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_timeskip.png"), 27, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (TimeSkipUnselected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_timeskip.png"), 46, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (TimeSkipUnselected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_timeskip.png"), 65, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (TimeSkipUnselected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_timeskip.png"), 84, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (TimeSkipSelected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_timeskip.png"), 25, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (TimeSkipSelected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_timeskip.png"), 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (TimeSkipSelected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_timeskip.png"), 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (TimeSkipSelected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_timeskip.png"), 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (TimeSkipSelected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_timeskip.png"), 6, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (TimeSkipSelected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_timeskip.png"), 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (TimeSkipSelected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_timeskip.png"), 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (TimeSkipSelected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_timeskip.png"), 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (TimeSkipSelected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_timeskip.png"), 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
