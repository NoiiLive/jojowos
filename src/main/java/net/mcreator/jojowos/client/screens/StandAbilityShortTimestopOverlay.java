
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

import net.mcreator.jojowos.procedures.ShortTimestopUnselected9Procedure;
import net.mcreator.jojowos.procedures.ShortTimestopUnselected8Procedure;
import net.mcreator.jojowos.procedures.ShortTimestopUnselected7Procedure;
import net.mcreator.jojowos.procedures.ShortTimestopUnselected6Procedure;
import net.mcreator.jojowos.procedures.ShortTimestopUnselected5Procedure;
import net.mcreator.jojowos.procedures.ShortTimestopUnselected4Procedure;
import net.mcreator.jojowos.procedures.ShortTimestopUnselected3Procedure;
import net.mcreator.jojowos.procedures.ShortTimestopUnselected2Procedure;
import net.mcreator.jojowos.procedures.ShortTimestopUnselected1Procedure;
import net.mcreator.jojowos.procedures.ShortTimestopSelected9Procedure;
import net.mcreator.jojowos.procedures.ShortTimestopSelected8Procedure;
import net.mcreator.jojowos.procedures.ShortTimestopSelected7Procedure;
import net.mcreator.jojowos.procedures.ShortTimestopSelected6Procedure;
import net.mcreator.jojowos.procedures.ShortTimestopSelected5Procedure;
import net.mcreator.jojowos.procedures.ShortTimestopSelected4Procedure;
import net.mcreator.jojowos.procedures.ShortTimestopSelected3Procedure;
import net.mcreator.jojowos.procedures.ShortTimestopSelected2Procedure;
import net.mcreator.jojowos.procedures.ShortTimestopSelected1Procedure;
import net.mcreator.jojowos.procedures.ReturnStandSummonedProcedure;
import net.mcreator.jojowos.procedures.DontReturnProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class StandAbilityShortTimestopOverlay {
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
			if (ShortTimestopUnselected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_shorttimestop.png"), 27, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (ShortTimestopUnselected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_shorttimestop.png"), 46, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (ShortTimestopUnselected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_shorttimestop.png"), 65, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (ShortTimestopUnselected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_shorttimestop.png"), 84, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (ShortTimestopUnselected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_shorttimestop.png"), 8, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (ShortTimestopUnselected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_shorttimestop.png"), 27, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (ShortTimestopUnselected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_shorttimestop.png"), 46, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (ShortTimestopUnselected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_shorttimestop.png"), 65, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (ShortTimestopUnselected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_shorttimestop.png"), 84, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (ShortTimestopSelected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_shorttimestop.png"), 25, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ShortTimestopSelected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_shorttimestop.png"), 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ShortTimestopSelected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_shorttimestop.png"), 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ShortTimestopSelected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_shorttimestop.png"), 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ShortTimestopSelected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_shorttimestop.png"), 6, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ShortTimestopSelected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_shorttimestop.png"), 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ShortTimestopSelected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_shorttimestop.png"), 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ShortTimestopSelected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_shorttimestop.png"), 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ShortTimestopSelected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_shorttimestop.png"), 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
