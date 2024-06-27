
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

import net.mcreator.jojowos.procedures.TimeStopUnselected9Procedure;
import net.mcreator.jojowos.procedures.TimeStopUnselected8Procedure;
import net.mcreator.jojowos.procedures.TimeStopUnselected7Procedure;
import net.mcreator.jojowos.procedures.TimeStopUnselected5Procedure;
import net.mcreator.jojowos.procedures.TimeStopUnselected4Procedure;
import net.mcreator.jojowos.procedures.TimeStopUnselected3Procedure;
import net.mcreator.jojowos.procedures.TimeStopUnselected2Procedure;
import net.mcreator.jojowos.procedures.TimeStopUnselected1Procedure;
import net.mcreator.jojowos.procedures.TimeStopSelected9Procedure;
import net.mcreator.jojowos.procedures.TimeStopSelected8Procedure;
import net.mcreator.jojowos.procedures.TimeStopSelected7Procedure;
import net.mcreator.jojowos.procedures.TimeStopSelected6Procedure;
import net.mcreator.jojowos.procedures.TimeStopSelected5Procedure;
import net.mcreator.jojowos.procedures.TimeStopSelected4Procedure;
import net.mcreator.jojowos.procedures.TimeStopSelected3Procedure;
import net.mcreator.jojowos.procedures.TimeStopSelected2Procedure;
import net.mcreator.jojowos.procedures.TimeStopSelected1Procedure;
import net.mcreator.jojowos.procedures.ShortTimestopUnlocked6Procedure;
import net.mcreator.jojowos.procedures.ReturnStandSummonedProcedure;
import net.mcreator.jojowos.procedures.DontReturnProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class StandAbilityTimeStopOverlay {
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
			if (TimeStopUnselected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_timestop.png"), 27, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (TimeStopUnselected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_timestop.png"), 46, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (TimeStopUnselected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_timestop.png"), 65, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (TimeStopUnselected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_timestop.png"), 84, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (TimeStopUnselected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_timestop.png"), 8, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (ShortTimestopUnlocked6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_timestop.png"), 27, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (TimeStopUnselected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_timestop.png"), 46, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (TimeStopUnselected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_timestop.png"), 65, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (TimeStopUnselected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_timestop.png"), 84, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (TimeStopSelected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_timestop.png"), 25, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (TimeStopSelected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_timestop.png"), 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (TimeStopSelected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_timestop.png"), 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (TimeStopSelected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_timestop.png"), 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (TimeStopSelected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_timestop.png"), 6, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (TimeStopSelected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_timestop.png"), 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (TimeStopSelected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_timestop.png"), 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (TimeStopSelected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_timestop.png"), 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (TimeStopSelected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_timestop.png"), 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
