
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
import net.mcreator.jojowos.procedures.QuicksandUnselected9Procedure;
import net.mcreator.jojowos.procedures.QuicksandUnselected8Procedure;
import net.mcreator.jojowos.procedures.QuicksandUnselected7Procedure;
import net.mcreator.jojowos.procedures.QuicksandUnselected6Procedure;
import net.mcreator.jojowos.procedures.QuicksandUnselected5Procedure;
import net.mcreator.jojowos.procedures.QuicksandUnselected4Procedure;
import net.mcreator.jojowos.procedures.QuicksandUnselected3Procedure;
import net.mcreator.jojowos.procedures.QuicksandUnselected2Procedure;
import net.mcreator.jojowos.procedures.QuicksandUnselected1Procedure;
import net.mcreator.jojowos.procedures.QuicksandSelected9Procedure;
import net.mcreator.jojowos.procedures.QuicksandSelected8Procedure;
import net.mcreator.jojowos.procedures.QuicksandSelected7Procedure;
import net.mcreator.jojowos.procedures.QuicksandSelected6Procedure;
import net.mcreator.jojowos.procedures.QuicksandSelected5Procedure;
import net.mcreator.jojowos.procedures.QuicksandSelected4Procedure;
import net.mcreator.jojowos.procedures.QuicksandSelected3Procedure;
import net.mcreator.jojowos.procedures.QuicksandSelected2Procedure;
import net.mcreator.jojowos.procedures.QuicksandSelected1Procedure;
import net.mcreator.jojowos.procedures.DontReturnProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class StandAbilityQuicksandOverlay {
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
			if (QuicksandUnselected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_quicksand.png"), 27, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (QuicksandUnselected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_quicksand.png"), 46, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (QuicksandUnselected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_quicksand.png"), 65, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (QuicksandUnselected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_quicksand.png"), 84, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (QuicksandUnselected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_quicksand.png"), 8, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (QuicksandUnselected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_quicksand.png"), 27, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (QuicksandUnselected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_quicksand.png"), 46, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (QuicksandUnselected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_quicksand.png"), 65, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (QuicksandUnselected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_quicksand.png"), 84, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (QuicksandSelected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_quicksand.png"), 25, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (QuicksandSelected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_quicksand.png"), 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (QuicksandSelected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_quicksand.png"), 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (QuicksandSelected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_quicksand.png"), 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (QuicksandSelected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_quicksand.png"), 6, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (QuicksandSelected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_quicksand.png"), 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (QuicksandSelected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_quicksand.png"), 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (QuicksandSelected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_quicksand.png"), 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (QuicksandSelected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_quicksand.png"), 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
