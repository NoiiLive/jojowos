
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

import net.mcreator.jojowos.procedures.SandDomeUnselected9Procedure;
import net.mcreator.jojowos.procedures.SandDomeUnselected8Procedure;
import net.mcreator.jojowos.procedures.SandDomeUnselected7Procedure;
import net.mcreator.jojowos.procedures.SandDomeUnselected6Procedure;
import net.mcreator.jojowos.procedures.SandDomeUnselected5Procedure;
import net.mcreator.jojowos.procedures.SandDomeUnselected4Procedure;
import net.mcreator.jojowos.procedures.SandDomeUnselected3Procedure;
import net.mcreator.jojowos.procedures.SandDomeUnselected2Procedure;
import net.mcreator.jojowos.procedures.SandDomeUnselected1Procedure;
import net.mcreator.jojowos.procedures.SandDomeSelected9Procedure;
import net.mcreator.jojowos.procedures.SandDomeSelected8Procedure;
import net.mcreator.jojowos.procedures.SandDomeSelected7Procedure;
import net.mcreator.jojowos.procedures.SandDomeSelected6Procedure;
import net.mcreator.jojowos.procedures.SandDomeSelected5Procedure;
import net.mcreator.jojowos.procedures.SandDomeSelected4Procedure;
import net.mcreator.jojowos.procedures.SandDomeSelected3Procedure;
import net.mcreator.jojowos.procedures.SandDomeSelected2Procedure;
import net.mcreator.jojowos.procedures.SandDomeSelected1Procedure;
import net.mcreator.jojowos.procedures.ReturnStandSummonedProcedure;
import net.mcreator.jojowos.procedures.DontReturnProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class StandAbilitySandDOmeOverlay {
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
			if (SandDomeUnselected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_sanddome.png"), 27, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (SandDomeUnselected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_sanddome.png"), 46, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (SandDomeUnselected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_sanddome.png"), 65, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (SandDomeUnselected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_sanddome.png"), 84, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (SandDomeUnselected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_sanddome.png"), 8, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (SandDomeUnselected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_sanddome.png"), 27, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (SandDomeUnselected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_sanddome.png"), 46, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (SandDomeUnselected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_sanddome.png"), 65, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (SandDomeUnselected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_sanddome.png"), 84, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (SandDomeSelected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_sanddome.png"), 25, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (SandDomeSelected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_sanddome.png"), 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (SandDomeSelected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_sanddome.png"), 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (SandDomeSelected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_sanddome.png"), 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (SandDomeSelected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_sanddome.png"), 6, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (SandDomeSelected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_sanddome.png"), 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (SandDomeSelected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_sanddome.png"), 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (SandDomeSelected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_sanddome.png"), 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (SandDomeSelected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_sanddome.png"), 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
