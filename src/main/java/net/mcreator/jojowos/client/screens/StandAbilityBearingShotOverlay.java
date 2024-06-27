
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
import net.mcreator.jojowos.procedures.BearingShotUnselected9Procedure;
import net.mcreator.jojowos.procedures.BearingShotUnselected8Procedure;
import net.mcreator.jojowos.procedures.BearingShotUnselected7Procedure;
import net.mcreator.jojowos.procedures.BearingShotUnselected6Procedure;
import net.mcreator.jojowos.procedures.BearingShotUnselected5Procedure;
import net.mcreator.jojowos.procedures.BearingShotUnselected4Procedure;
import net.mcreator.jojowos.procedures.BearingShotUnselected3Procedure;
import net.mcreator.jojowos.procedures.BearingShotUnselected2Procedure;
import net.mcreator.jojowos.procedures.BearingShotUnselected1Procedure;
import net.mcreator.jojowos.procedures.BearingShotSelected9Procedure;
import net.mcreator.jojowos.procedures.BearingShotSelected8Procedure;
import net.mcreator.jojowos.procedures.BearingShotSelected7Procedure;
import net.mcreator.jojowos.procedures.BearingShotSelected6Procedure;
import net.mcreator.jojowos.procedures.BearingShotSelected5Procedure;
import net.mcreator.jojowos.procedures.BearingShotSelected4Procedure;
import net.mcreator.jojowos.procedures.BearingShotSelected3Procedure;
import net.mcreator.jojowos.procedures.BearingShotSelected2Procedure;
import net.mcreator.jojowos.procedures.BearingShotSelected1Procedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class StandAbilityBearingShotOverlay {
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
			if (BearingShotUnselected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_bearingshot.png"), 27, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (BearingShotUnselected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_bearingshot.png"), 46, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (BearingShotUnselected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_bearingshot.png"), 65, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (BearingShotUnselected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_bearingshot.png"), 84, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (BearingShotUnselected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_bearingshot.png"), 8, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (BearingShotUnselected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_bearingshot.png"), 27, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (BearingShotUnselected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_bearingshot.png"), 46, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (BearingShotUnselected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_bearingshot.png"), 65, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (BearingShotUnselected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_bearingshot.png"), 84, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (BearingShotSelected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_bearingshot.png"), 25, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (BearingShotSelected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_bearingshot.png"), 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (BearingShotSelected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_bearingshot.png"), 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (BearingShotSelected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_bearingshot.png"), 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (BearingShotSelected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_bearingshot.png"), 6, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (BearingShotSelected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_bearingshot.png"), 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (BearingShotSelected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_bearingshot.png"), 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (BearingShotSelected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_bearingshot.png"), 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (BearingShotSelected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_bearingshot.png"), 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
