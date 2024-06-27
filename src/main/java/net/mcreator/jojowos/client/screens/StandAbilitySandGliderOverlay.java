
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

import net.mcreator.jojowos.procedures.SandGliderUnselected9Procedure;
import net.mcreator.jojowos.procedures.SandGliderUnselected8Procedure;
import net.mcreator.jojowos.procedures.SandGliderUnselected7Procedure;
import net.mcreator.jojowos.procedures.SandGliderUnselected6Procedure;
import net.mcreator.jojowos.procedures.SandGliderUnselected5Procedure;
import net.mcreator.jojowos.procedures.SandGliderUnselected4Procedure;
import net.mcreator.jojowos.procedures.SandGliderUnselected3Procedure;
import net.mcreator.jojowos.procedures.SandGliderUnselected2Procedure;
import net.mcreator.jojowos.procedures.SandGliderUnselected1Procedure;
import net.mcreator.jojowos.procedures.SandGliderSelected9Procedure;
import net.mcreator.jojowos.procedures.SandGliderSelected8Procedure;
import net.mcreator.jojowos.procedures.SandGliderSelected7Procedure;
import net.mcreator.jojowos.procedures.SandGliderSelected6Procedure;
import net.mcreator.jojowos.procedures.SandGliderSelected5Procedure;
import net.mcreator.jojowos.procedures.SandGliderSelected4Procedure;
import net.mcreator.jojowos.procedures.SandGliderSelected3Procedure;
import net.mcreator.jojowos.procedures.SandGliderSelected2Procedure;
import net.mcreator.jojowos.procedures.SandGliderSelected1Procedure;
import net.mcreator.jojowos.procedures.ReturnStandSummonedProcedure;
import net.mcreator.jojowos.procedures.DontReturnProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class StandAbilitySandGliderOverlay {
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
			if (SandGliderUnselected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_sandglider.png"), 27, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (SandGliderUnselected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_sandglider.png"), 46, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (SandGliderUnselected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_sandglider.png"), 65, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (SandGliderUnselected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_sandglider.png"), 84, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (SandGliderUnselected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_sandglider.png"), 8, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (SandGliderUnselected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_sandglider.png"), 27, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (SandGliderUnselected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_sandglider.png"), 46, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (SandGliderUnselected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_sandglider.png"), 65, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (SandGliderUnselected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_sandglider.png"), 84, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (SandGliderSelected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_sandglider.png"), 25, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (SandGliderSelected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_sandglider.png"), 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (SandGliderSelected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_sandglider.png"), 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (SandGliderSelected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_sandglider.png"), 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (SandGliderSelected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_sandglider.png"), 6, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (SandGliderSelected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_sandglider.png"), 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (SandGliderSelected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_sandglider.png"), 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (SandGliderSelected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_sandglider.png"), 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (SandGliderSelected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_sandglider.png"), 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
