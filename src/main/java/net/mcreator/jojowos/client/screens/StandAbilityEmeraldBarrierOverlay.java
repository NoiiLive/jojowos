
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
import net.mcreator.jojowos.procedures.EmeraldBarrierUnselected9Procedure;
import net.mcreator.jojowos.procedures.EmeraldBarrierUnselected8Procedure;
import net.mcreator.jojowos.procedures.EmeraldBarrierUnselected7Procedure;
import net.mcreator.jojowos.procedures.EmeraldBarrierUnselected6Procedure;
import net.mcreator.jojowos.procedures.EmeraldBarrierUnselected5Procedure;
import net.mcreator.jojowos.procedures.EmeraldBarrierUnselected4Procedure;
import net.mcreator.jojowos.procedures.EmeraldBarrierUnselected3Procedure;
import net.mcreator.jojowos.procedures.EmeraldBarrierUnselected2Procedure;
import net.mcreator.jojowos.procedures.EmeraldBarrierUnselected1Procedure;
import net.mcreator.jojowos.procedures.EmeraldBarrierSelected9Procedure;
import net.mcreator.jojowos.procedures.EmeraldBarrierSelected8Procedure;
import net.mcreator.jojowos.procedures.EmeraldBarrierSelected7Procedure;
import net.mcreator.jojowos.procedures.EmeraldBarrierSelected6Procedure;
import net.mcreator.jojowos.procedures.EmeraldBarrierSelected5Procedure;
import net.mcreator.jojowos.procedures.EmeraldBarrierSelected4Procedure;
import net.mcreator.jojowos.procedures.EmeraldBarrierSelected3Procedure;
import net.mcreator.jojowos.procedures.EmeraldBarrierSelected2Procedure;
import net.mcreator.jojowos.procedures.EmeraldBarrierSelected1Procedure;
import net.mcreator.jojowos.procedures.DontReturnProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class StandAbilityEmeraldBarrierOverlay {
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
			if (EmeraldBarrierUnselected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_emeraldbarrier.png"), 27, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (EmeraldBarrierUnselected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_emeraldbarrier.png"), 46, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (EmeraldBarrierUnselected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_emeraldbarrier.png"), 65, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (EmeraldBarrierUnselected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_emeraldbarrier.png"), 84, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (EmeraldBarrierUnselected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_emeraldbarrier.png"), 8, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (EmeraldBarrierUnselected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_emeraldbarrier.png"), 27, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (EmeraldBarrierUnselected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_emeraldbarrier.png"), 46, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (EmeraldBarrierUnselected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_emeraldbarrier.png"), 65, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (EmeraldBarrierUnselected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_emeraldbarrier.png"), 84, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (EmeraldBarrierSelected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_emeraldbarrier.png"), 25, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (EmeraldBarrierSelected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_emeraldbarrier.png"), 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (EmeraldBarrierSelected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_emeraldbarrier.png"), 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (EmeraldBarrierSelected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_emeraldbarrier.png"), 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (EmeraldBarrierSelected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_emeraldbarrier.png"), 6, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (EmeraldBarrierSelected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_emeraldbarrier.png"), 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (EmeraldBarrierSelected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_emeraldbarrier.png"), 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (EmeraldBarrierSelected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_emeraldbarrier.png"), 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (EmeraldBarrierSelected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_emeraldbarrier.png"), 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
