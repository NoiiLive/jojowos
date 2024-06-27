
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

import net.mcreator.jojowos.procedures.SwordLaunchUnselected9Procedure;
import net.mcreator.jojowos.procedures.SwordLaunchUnselected8Procedure;
import net.mcreator.jojowos.procedures.SwordLaunchUnselected7Procedure;
import net.mcreator.jojowos.procedures.SwordLaunchUnselected6Procedure;
import net.mcreator.jojowos.procedures.SwordLaunchUnselected5Procedure;
import net.mcreator.jojowos.procedures.SwordLaunchUnselected4Procedure;
import net.mcreator.jojowos.procedures.SwordLaunchUnselected3Procedure;
import net.mcreator.jojowos.procedures.SwordLaunchUnselected2Procedure;
import net.mcreator.jojowos.procedures.SwordLaunchUnselected1Procedure;
import net.mcreator.jojowos.procedures.SwordLaunchSelected9Procedure;
import net.mcreator.jojowos.procedures.SwordLaunchSelected8Procedure;
import net.mcreator.jojowos.procedures.SwordLaunchSelected7Procedure;
import net.mcreator.jojowos.procedures.SwordLaunchSelected6Procedure;
import net.mcreator.jojowos.procedures.SwordLaunchSelected5Procedure;
import net.mcreator.jojowos.procedures.SwordLaunchSelected4Procedure;
import net.mcreator.jojowos.procedures.SwordLaunchSelected3Procedure;
import net.mcreator.jojowos.procedures.SwordLaunchSelected2Procedure;
import net.mcreator.jojowos.procedures.SwordLaunchSelected1Procedure;
import net.mcreator.jojowos.procedures.ReturnStandSummonedProcedure;
import net.mcreator.jojowos.procedures.DontReturnProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class StandAbilitySwordLaunchOverlay {
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
			if (SwordLaunchUnselected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_swordlaunch.png"), 27, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (SwordLaunchUnselected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_swordlaunch.png"), 46, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (SwordLaunchUnselected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_swordlaunch.png"), 65, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (SwordLaunchUnselected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_swordlaunch.png"), 84, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (SwordLaunchUnselected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_swordlaunch.png"), 8, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (SwordLaunchUnselected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_swordlaunch.png"), 27, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (SwordLaunchUnselected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_swordlaunch.png"), 46, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (SwordLaunchUnselected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_swordlaunch.png"), 65, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (SwordLaunchUnselected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_swordlaunch.png"), 84, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (SwordLaunchSelected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_swordlaunch.png"), 25, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (SwordLaunchSelected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_swordlaunch.png"), 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (SwordLaunchSelected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_swordlaunch.png"), 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (SwordLaunchSelected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_swordlaunch.png"), 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (SwordLaunchSelected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_swordlaunch.png"), 6, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (SwordLaunchSelected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_swordlaunch.png"), 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (SwordLaunchSelected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_swordlaunch.png"), 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (SwordLaunchSelected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_swordlaunch.png"), 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (SwordLaunchSelected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_swordlaunch.png"), 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
