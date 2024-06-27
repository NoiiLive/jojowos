
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

import net.mcreator.jojowos.procedures.TimestopCounterUnselected9Procedure;
import net.mcreator.jojowos.procedures.TimestopCounterUnselected8Procedure;
import net.mcreator.jojowos.procedures.TimestopCounterUnselected7Procedure;
import net.mcreator.jojowos.procedures.TimestopCounterUnselected6Procedure;
import net.mcreator.jojowos.procedures.TimestopCounterUnselected5Procedure;
import net.mcreator.jojowos.procedures.TimestopCounterUnselected4Procedure;
import net.mcreator.jojowos.procedures.TimestopCounterUnselected3Procedure;
import net.mcreator.jojowos.procedures.TimestopCounterUnselected2Procedure;
import net.mcreator.jojowos.procedures.TimestopCounterUnselected1Procedure;
import net.mcreator.jojowos.procedures.TimestopCounterSelected9Procedure;
import net.mcreator.jojowos.procedures.TimestopCounterSelected8Procedure;
import net.mcreator.jojowos.procedures.TimestopCounterSelected7Procedure;
import net.mcreator.jojowos.procedures.TimestopCounterSelected6Procedure;
import net.mcreator.jojowos.procedures.TimestopCounterSelected5Procedure;
import net.mcreator.jojowos.procedures.TimestopCounterSelected4Procedure;
import net.mcreator.jojowos.procedures.TimestopCounterSelected3Procedure;
import net.mcreator.jojowos.procedures.TimestopCounterSelected2Procedure;
import net.mcreator.jojowos.procedures.TimestopCounterSelected1Procedure;
import net.mcreator.jojowos.procedures.ReturnStandSummonedProcedure;
import net.mcreator.jojowos.procedures.DontReturnProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class StandAbilityTimestopCounterOverlay {
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
			if (TimestopCounterUnselected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_timestopcounter.png"), 27, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (TimestopCounterUnselected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_timestopcounter.png"), 46, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (TimestopCounterUnselected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_timestopcounter.png"), 65, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (TimestopCounterUnselected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_timestopcounter.png"), 84, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (TimestopCounterUnselected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_timestopcounter.png"), 8, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (TimestopCounterUnselected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_timestopcounter.png"), 27, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (TimestopCounterUnselected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_timestopcounter.png"), 46, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (TimestopCounterUnselected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_timestopcounter.png"), 65, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (TimestopCounterUnselected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_timestopcounter.png"), 84, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (TimestopCounterSelected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_timestopcounter.png"), 25, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (TimestopCounterSelected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_timestopcounter.png"), w / 2 + -169, h / 2 + 76, 0, 0, 20, 20, 20, 20);
			}
			if (TimestopCounterSelected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_timestopcounter.png"), 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (TimestopCounterSelected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_timestopcounter.png"), 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (TimestopCounterSelected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_timestopcounter.png"), 6, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (TimestopCounterSelected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_timestopcounter.png"), 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (TimestopCounterSelected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_timestopcounter.png"), 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (TimestopCounterSelected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_timestopcounter.png"), 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (TimestopCounterSelected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_timestopcounter.png"), 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
