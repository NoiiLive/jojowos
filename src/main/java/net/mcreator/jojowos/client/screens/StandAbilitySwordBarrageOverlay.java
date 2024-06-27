
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

import net.mcreator.jojowos.procedures.SwordBarrageUnselected9Procedure;
import net.mcreator.jojowos.procedures.SwordBarrageUnselected8Procedure;
import net.mcreator.jojowos.procedures.SwordBarrageUnselected7Procedure;
import net.mcreator.jojowos.procedures.SwordBarrageUnselected6Procedure;
import net.mcreator.jojowos.procedures.SwordBarrageUnselected5Procedure;
import net.mcreator.jojowos.procedures.SwordBarrageUnselected4Procedure;
import net.mcreator.jojowos.procedures.SwordBarrageUnselected3Procedure;
import net.mcreator.jojowos.procedures.SwordBarrageUnselected2Procedure;
import net.mcreator.jojowos.procedures.SwordBarrageUnselected1Procedure;
import net.mcreator.jojowos.procedures.SwordBarrageSelected9Procedure;
import net.mcreator.jojowos.procedures.SwordBarrageSelected8Procedure;
import net.mcreator.jojowos.procedures.SwordBarrageSelected7Procedure;
import net.mcreator.jojowos.procedures.SwordBarrageSelected6Procedure;
import net.mcreator.jojowos.procedures.SwordBarrageSelected5Procedure;
import net.mcreator.jojowos.procedures.SwordBarrageSelected4Procedure;
import net.mcreator.jojowos.procedures.SwordBarrageSelected3Procedure;
import net.mcreator.jojowos.procedures.SwordBarrageSelected2Procedure;
import net.mcreator.jojowos.procedures.SwordBarrageSelected1Procedure;
import net.mcreator.jojowos.procedures.ReturnStandSummonedProcedure;
import net.mcreator.jojowos.procedures.DontReturnProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class StandAbilitySwordBarrageOverlay {
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
			if (SwordBarrageUnselected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_swordbarrage.png"), 27, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (SwordBarrageUnselected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_swordbarrage.png"), 46, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (SwordBarrageUnselected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_swordbarrage.png"), 65, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (SwordBarrageUnselected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_swordbarrage.png"), 84, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (SwordBarrageUnselected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_swordbarrage.png"), 8, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (SwordBarrageUnselected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_swordbarrage.png"), 27, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (SwordBarrageUnselected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_swordbarrage.png"), 46, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (SwordBarrageUnselected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_swordbarrage.png"), 65, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (SwordBarrageUnselected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_swordbarrage.png"), 84, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (SwordBarrageSelected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_swordbarrage.png"), 25, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (SwordBarrageSelected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_swordbarrage.png"), 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (SwordBarrageSelected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_swordbarrage.png"), 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (SwordBarrageSelected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_swordbarrage.png"), 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (SwordBarrageSelected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_swordbarrage.png"), 6, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (SwordBarrageSelected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_swordbarrage.png"), 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (SwordBarrageSelected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_swordbarrage.png"), 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (SwordBarrageSelected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_swordbarrage.png"), 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (SwordBarrageSelected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_swordbarrage.png"), 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
