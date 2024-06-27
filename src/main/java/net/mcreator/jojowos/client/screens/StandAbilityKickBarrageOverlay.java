
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
import net.mcreator.jojowos.procedures.KickBarrageUnselected9Procedure;
import net.mcreator.jojowos.procedures.KickBarrageUnselected8Procedure;
import net.mcreator.jojowos.procedures.KickBarrageUnselected7Procedure;
import net.mcreator.jojowos.procedures.KickBarrageUnselected6Procedure;
import net.mcreator.jojowos.procedures.KickBarrageUnselected5Procedure;
import net.mcreator.jojowos.procedures.KickBarrageUnselected4Procedure;
import net.mcreator.jojowos.procedures.KickBarrageUnselected3Procedure;
import net.mcreator.jojowos.procedures.KickBarrageUnselected2Procedure;
import net.mcreator.jojowos.procedures.KickBarrageUnselected1Procedure;
import net.mcreator.jojowos.procedures.KickBarrageSelected9Procedure;
import net.mcreator.jojowos.procedures.KickBarrageSelected8Procedure;
import net.mcreator.jojowos.procedures.KickBarrageSelected7Procedure;
import net.mcreator.jojowos.procedures.KickBarrageSelected6Procedure;
import net.mcreator.jojowos.procedures.KickBarrageSelected5Procedure;
import net.mcreator.jojowos.procedures.KickBarrageSelected4Procedure;
import net.mcreator.jojowos.procedures.KickBarrageSelected3Procedure;
import net.mcreator.jojowos.procedures.KickBarrageSelected2Procedure;
import net.mcreator.jojowos.procedures.KickBarrageSelected1Procedure;
import net.mcreator.jojowos.procedures.DontReturnProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class StandAbilityKickBarrageOverlay {
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
			if (KickBarrageUnselected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_kickbarrage.png"), 27, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (KickBarrageUnselected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_kickbarrage.png"), 46, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (KickBarrageUnselected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_kickbarrage.png"), 65, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (KickBarrageUnselected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_kickbarrage.png"), 84, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (KickBarrageUnselected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_kickbarrage.png"), 8, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (KickBarrageUnselected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_kickbarrage.png"), 27, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (KickBarrageUnselected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_kickbarrage.png"), 46, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (KickBarrageUnselected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_kickbarrage.png"), 65, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (KickBarrageUnselected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_kickbarrage.png"), 84, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (KickBarrageSelected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_kickbarrage.png"), 25, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (KickBarrageSelected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_kickbarrage.png"), 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (KickBarrageSelected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_kickbarrage.png"), 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (KickBarrageSelected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_kickbarrage.png"), 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (KickBarrageSelected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_kickbarrage.png"), 6, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (KickBarrageSelected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_kickbarrage.png"), 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (KickBarrageSelected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_kickbarrage.png"), 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (KickBarrageSelected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_kickbarrage.png"), 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (KickBarrageSelected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_kickbarrage.png"), 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
