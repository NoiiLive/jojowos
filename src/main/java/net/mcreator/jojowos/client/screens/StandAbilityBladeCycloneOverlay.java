
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
import net.mcreator.jojowos.procedures.DontReturnProcedure;
import net.mcreator.jojowos.procedures.BladeCycloneUnselected9Procedure;
import net.mcreator.jojowos.procedures.BladeCycloneUnselected8Procedure;
import net.mcreator.jojowos.procedures.BladeCycloneUnselected7Procedure;
import net.mcreator.jojowos.procedures.BladeCycloneUnselected6Procedure;
import net.mcreator.jojowos.procedures.BladeCycloneUnselected5Procedure;
import net.mcreator.jojowos.procedures.BladeCycloneUnselected4Procedure;
import net.mcreator.jojowos.procedures.BladeCycloneUnselected3Procedure;
import net.mcreator.jojowos.procedures.BladeCycloneUnselected2Procedure;
import net.mcreator.jojowos.procedures.BladeCycloneUnselected1Procedure;
import net.mcreator.jojowos.procedures.BladeCycloneSelected9Procedure;
import net.mcreator.jojowos.procedures.BladeCycloneSelected8Procedure;
import net.mcreator.jojowos.procedures.BladeCycloneSelected7Procedure;
import net.mcreator.jojowos.procedures.BladeCycloneSelected6Procedure;
import net.mcreator.jojowos.procedures.BladeCycloneSelected5Procedure;
import net.mcreator.jojowos.procedures.BladeCycloneSelected4Procedure;
import net.mcreator.jojowos.procedures.BladeCycloneSelected3Procedure;
import net.mcreator.jojowos.procedures.BladeCycloneSelected2Procedure;
import net.mcreator.jojowos.procedures.BladeCycloneSelected1Procedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class StandAbilityBladeCycloneOverlay {
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
			if (BladeCycloneUnselected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_bladecyclone.png"), 27, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (BladeCycloneUnselected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_bladecyclone.png"), 46, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (BladeCycloneUnselected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_bladecyclone.png"), 65, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (BladeCycloneUnselected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_bladecyclone.png"), 84, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (BladeCycloneUnselected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_bladecyclone.png"), 8, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (BladeCycloneUnselected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_bladecyclone.png"), 27, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (BladeCycloneUnselected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_bladecyclone.png"), 46, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (BladeCycloneUnselected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_bladecyclone.png"), 65, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (BladeCycloneUnselected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_bladecyclone.png"), 84, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (BladeCycloneSelected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_bladecyclone.png"), 25, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (BladeCycloneSelected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_bladecyclone.png"), 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (BladeCycloneSelected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_bladecyclone.png"), 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (BladeCycloneSelected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_bladecyclone.png"), 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (BladeCycloneSelected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_bladecyclone.png"), 6, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (BladeCycloneSelected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_bladecyclone.png"), 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (BladeCycloneSelected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_bladecyclone.png"), 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (BladeCycloneSelected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_bladecyclone.png"), 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (BladeCycloneSelected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_bladecyclone.png"), 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
