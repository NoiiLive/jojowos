
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
import net.mcreator.jojowos.procedures.CrossfireHurricaneUnselected9Procedure;
import net.mcreator.jojowos.procedures.CrossfireHurricaneUnselected8Procedure;
import net.mcreator.jojowos.procedures.CrossfireHurricaneUnselected7Procedure;
import net.mcreator.jojowos.procedures.CrossfireHurricaneUnselected6Procedure;
import net.mcreator.jojowos.procedures.CrossfireHurricaneUnselected5Procedure;
import net.mcreator.jojowos.procedures.CrossfireHurricaneUnselected4Procedure;
import net.mcreator.jojowos.procedures.CrossfireHurricaneUnselected2Procedure;
import net.mcreator.jojowos.procedures.CrossfireHurricaneUnselected1Procedure;
import net.mcreator.jojowos.procedures.CrossfireHurricaneUnlocked3Procedure;
import net.mcreator.jojowos.procedures.CrossfireHurricaneSelected9Procedure;
import net.mcreator.jojowos.procedures.CrossfireHurricaneSelected8Procedure;
import net.mcreator.jojowos.procedures.CrossfireHurricaneSelected7Procedure;
import net.mcreator.jojowos.procedures.CrossfireHurricaneSelected6Procedure;
import net.mcreator.jojowos.procedures.CrossfireHurricaneSelected5Procedure;
import net.mcreator.jojowos.procedures.CrossfireHurricaneSelected4Procedure;
import net.mcreator.jojowos.procedures.CrossfireHurricaneSelected3Procedure;
import net.mcreator.jojowos.procedures.CrossfireHurricaneSelected2Procedure;
import net.mcreator.jojowos.procedures.CrossfireHurricaneSelected1Procedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class StandAbilityCrossfireHurricaneOverlay {
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
			if (CrossfireHurricaneUnselected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_crossfire.png"), 27, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (CrossfireHurricaneUnselected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_crossfire.png"), 46, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (CrossfireHurricaneUnselected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_crossfire.png"), 84, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (CrossfireHurricaneUnlocked3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_crossfire.png"), 65, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (CrossfireHurricaneUnselected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_crossfire.png"), 8, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (CrossfireHurricaneUnselected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_crossfire.png"), 27, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (CrossfireHurricaneUnselected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_crossfire.png"), 46, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (CrossfireHurricaneUnselected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_crossfire.png"), 65, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (CrossfireHurricaneUnselected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_crossfire.png"), 84, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (CrossfireHurricaneSelected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_crossfire.png"), 25, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (CrossfireHurricaneSelected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_crossfire.png"), 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (CrossfireHurricaneSelected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_crossfire.png"), 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (CrossfireHurricaneSelected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_crossfire.png"), 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (CrossfireHurricaneSelected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_crossfire.png"), 6, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (CrossfireHurricaneSelected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_crossfire.png"), 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (CrossfireHurricaneSelected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_crossfire.png"), 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (CrossfireHurricaneSelected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_crossfire.png"), 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (CrossfireHurricaneSelected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_crossfire.png"), 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
