
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
import net.mcreator.jojowos.procedures.EmeraldSplashUnselected9Procedure;
import net.mcreator.jojowos.procedures.EmeraldSplashUnselected8Procedure;
import net.mcreator.jojowos.procedures.EmeraldSplashUnselected7Procedure;
import net.mcreator.jojowos.procedures.EmeraldSplashUnselected6Procedure;
import net.mcreator.jojowos.procedures.EmeraldSplashUnselected5Procedure;
import net.mcreator.jojowos.procedures.EmeraldSplashUnselected4Procedure;
import net.mcreator.jojowos.procedures.EmeraldSplashUnselected3Procedure;
import net.mcreator.jojowos.procedures.EmeraldSplashUnselected2Procedure;
import net.mcreator.jojowos.procedures.EmeraldSplashUnselected1Procedure;
import net.mcreator.jojowos.procedures.EmeraldSplashSelected9Procedure;
import net.mcreator.jojowos.procedures.EmeraldSplashSelected8Procedure;
import net.mcreator.jojowos.procedures.EmeraldSplashSelected7Procedure;
import net.mcreator.jojowos.procedures.EmeraldSplashSelected6Procedure;
import net.mcreator.jojowos.procedures.EmeraldSplashSelected5Procedure;
import net.mcreator.jojowos.procedures.EmeraldSplashSelected4Procedure;
import net.mcreator.jojowos.procedures.EmeraldSplashSelected3Procedure;
import net.mcreator.jojowos.procedures.EmeraldSplashSelected2Procedure;
import net.mcreator.jojowos.procedures.EmeraldSplashSelected1Procedure;
import net.mcreator.jojowos.procedures.DontReturnProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class StandAbilityEmeraldSplashOverlay {
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
			if (EmeraldSplashUnselected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_emeraldsplash.png"), 27, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (EmeraldSplashUnselected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_emeraldsplash.png"), 46, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (EmeraldSplashUnselected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_emeraldsplash.png"), 65, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (EmeraldSplashUnselected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_emeraldsplash.png"), 84, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (EmeraldSplashUnselected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_emeraldsplash.png"), 8, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (EmeraldSplashUnselected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_emeraldsplash.png"), 27, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (EmeraldSplashUnselected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_emeraldsplash.png"), 46, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (EmeraldSplashUnselected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_emeraldsplash.png"), 65, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (EmeraldSplashUnselected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_emeraldsplash.png"), 84, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (EmeraldSplashSelected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_emeraldsplash.png"), 25, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (EmeraldSplashSelected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_emeraldsplash.png"), 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (EmeraldSplashSelected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_emeraldsplash.png"), 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (EmeraldSplashSelected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_emeraldsplash.png"), 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (EmeraldSplashSelected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_emeraldsplash.png"), 6, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (EmeraldSplashSelected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_emeraldsplash.png"), 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (EmeraldSplashSelected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_emeraldsplash.png"), 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (EmeraldSplashSelected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_emeraldsplash.png"), 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (EmeraldSplashSelected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_emeraldsplash.png"), 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
