
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

import net.mcreator.jojowos.procedures.RoadRollerUnselected9Procedure;
import net.mcreator.jojowos.procedures.RoadRollerUnselected8Procedure;
import net.mcreator.jojowos.procedures.RoadRollerUnselected7Procedure;
import net.mcreator.jojowos.procedures.RoadRollerUnselected6Procedure;
import net.mcreator.jojowos.procedures.RoadRollerUnselected5Procedure;
import net.mcreator.jojowos.procedures.RoadRollerUnselected4Procedure;
import net.mcreator.jojowos.procedures.RoadRollerUnselected3Procedure;
import net.mcreator.jojowos.procedures.RoadRollerUnselected2Procedure;
import net.mcreator.jojowos.procedures.RoadRollerUnselected1Procedure;
import net.mcreator.jojowos.procedures.RoadRollerSelected9Procedure;
import net.mcreator.jojowos.procedures.RoadRollerSelected8Procedure;
import net.mcreator.jojowos.procedures.RoadRollerSelected7Procedure;
import net.mcreator.jojowos.procedures.RoadRollerSelected6Procedure;
import net.mcreator.jojowos.procedures.RoadRollerSelected5Procedure;
import net.mcreator.jojowos.procedures.RoadRollerSelected4Procedure;
import net.mcreator.jojowos.procedures.RoadRollerSelected3Procedure;
import net.mcreator.jojowos.procedures.RoadRollerSelected2Procedure;
import net.mcreator.jojowos.procedures.RoadRollerSelected1Procedure;
import net.mcreator.jojowos.procedures.ReturnStandSummonedProcedure;
import net.mcreator.jojowos.procedures.DontReturnProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class StandAbilityRoadRollerOverlay {
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
			if (RoadRollerUnselected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_roadroller.png"), 27, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (RoadRollerUnselected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_roadroller.png"), 46, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (RoadRollerUnselected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_roadroller.png"), 65, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (RoadRollerUnselected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_roadroller.png"), 84, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (RoadRollerUnselected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_roadroller.png"), 8, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (RoadRollerUnselected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_roadroller.png"), 27, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (RoadRollerUnselected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_roadroller.png"), 46, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (RoadRollerUnselected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_roadroller.png"), 65, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (RoadRollerUnselected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_roadroller.png"), 84, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (RoadRollerSelected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_roadroller.png"), 25, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (RoadRollerSelected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_roadroller.png"), 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (RoadRollerSelected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_roadroller.png"), 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (RoadRollerSelected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_roadroller.png"), 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (RoadRollerSelected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_roadroller.png"), 6, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (RoadRollerSelected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_roadroller.png"), 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (RoadRollerSelected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_roadroller.png"), 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (RoadRollerSelected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_roadroller.png"), 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (RoadRollerSelected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_roadroller.png"), 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
