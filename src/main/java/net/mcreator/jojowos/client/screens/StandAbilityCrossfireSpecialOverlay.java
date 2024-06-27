
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
import net.mcreator.jojowos.procedures.DontReturnProcedure;
import net.mcreator.jojowos.procedures.CrossfireSpecialUnselected9Procedure;
import net.mcreator.jojowos.procedures.CrossfireSpecialUnselected8Procedure;
import net.mcreator.jojowos.procedures.CrossfireSpecialUnselected6Procedure;
import net.mcreator.jojowos.procedures.CrossfireSpecialUnselected5Procedure;
import net.mcreator.jojowos.procedures.CrossfireSpecialUnselected4Procedure;
import net.mcreator.jojowos.procedures.CrossfireSpecialUnselected3Procedure;
import net.mcreator.jojowos.procedures.CrossfireSpecialUnselected2Procedure;
import net.mcreator.jojowos.procedures.CrossfireSpecialUnselected1Procedure;
import net.mcreator.jojowos.procedures.CrossfireSpecialUnlocked7Procedure;
import net.mcreator.jojowos.procedures.CrossfireSpecialSelected9Procedure;
import net.mcreator.jojowos.procedures.CrossfireSpecialSelected8Procedure;
import net.mcreator.jojowos.procedures.CrossfireSpecialSelected7Procedure;
import net.mcreator.jojowos.procedures.CrossfireSpecialSelected6Procedure;
import net.mcreator.jojowos.procedures.CrossfireSpecialSelected5Procedure;
import net.mcreator.jojowos.procedures.CrossfireSpecialSelected4Procedure;
import net.mcreator.jojowos.procedures.CrossfireSpecialSelected3Procedure;
import net.mcreator.jojowos.procedures.CrossfireSpecialSelected2Procedure;
import net.mcreator.jojowos.procedures.CrossfireSpecialSelected1Procedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class StandAbilityCrossfireSpecialOverlay {
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
			if (CrossfireSpecialUnselected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_crossfirespecial.png"), 27, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (CrossfireSpecialUnselected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_crossfirespecial.png"), 46, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (CrossfireSpecialUnselected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_crossfirespecial.png"), 65, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (CrossfireSpecialUnselected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_crossfirespecial.png"), 84, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (CrossfireSpecialUnselected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_crossfirespecial.png"), 8, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (CrossfireSpecialUnselected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_crossfirespecial.png"), 27, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (CrossfireSpecialUnlocked7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_crossfirespecial.png"), 46, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (CrossfireSpecialUnselected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_crossfirespecial.png"), 65, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (CrossfireSpecialUnselected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_crossfirespecial.png"), 84, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (CrossfireSpecialSelected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_crossfirespecial.png"), 25, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (CrossfireSpecialSelected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_crossfirespecial.png"), 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (CrossfireSpecialSelected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_crossfirespecial.png"), 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (CrossfireSpecialSelected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_crossfirespecial.png"), 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (CrossfireSpecialSelected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_crossfirespecial.png"), 6, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (CrossfireSpecialSelected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_crossfirespecial.png"), 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (CrossfireSpecialSelected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_crossfirespecial.png"), 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (CrossfireSpecialSelected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_crossfirespecial.png"), 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (CrossfireSpecialSelected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_crossfirespecial.png"), 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
