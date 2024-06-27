
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
import net.mcreator.jojowos.procedures.RedBindUnselected9Procedure;
import net.mcreator.jojowos.procedures.RedBindUnselected7Procedure;
import net.mcreator.jojowos.procedures.RedBindUnselected6Procedure;
import net.mcreator.jojowos.procedures.RedBindUnselected4Procedure;
import net.mcreator.jojowos.procedures.RedBindUnselected3Procedure;
import net.mcreator.jojowos.procedures.RedBindUnselected2Procedure;
import net.mcreator.jojowos.procedures.RedBindUnselected1Procedure;
import net.mcreator.jojowos.procedures.RedBindUnlocked5Procedure;
import net.mcreator.jojowos.procedures.RedBindSelected9Procedure;
import net.mcreator.jojowos.procedures.RedBindSelected8Procedure;
import net.mcreator.jojowos.procedures.RedBindSelected7Procedure;
import net.mcreator.jojowos.procedures.RedBindSelected6Procedure;
import net.mcreator.jojowos.procedures.RedBindSelected5Procedure;
import net.mcreator.jojowos.procedures.RedBindSelected4Procedure;
import net.mcreator.jojowos.procedures.RedBindSelected3Procedure;
import net.mcreator.jojowos.procedures.RedBindSelected2Procedure;
import net.mcreator.jojowos.procedures.RedBindSelected1Procedure;
import net.mcreator.jojowos.procedures.DontReturnProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class StandAbilityRedBindOverlay {
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
			if (RedBindUnselected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_redbind.png"), 27, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (RedBindUnselected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_redbind.png"), 46, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (RedBindUnselected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_redbind.png"), 65, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (RedBindUnselected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_redbind.png"), 84, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (RedBindUnlocked5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_redbind.png"), 8, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (RedBindUnselected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_redbind.png"), 27, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (RedBindUnselected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_redbind.png"), 46, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (RedBindUnselected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_redbind.png"), 65, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (RedBindUnselected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_redbind.png"), 84, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (RedBindSelected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_redbind.png"), 25, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (RedBindSelected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_redbind.png"), 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (RedBindSelected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_redbind.png"), 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (RedBindSelected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_redbind.png"), 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (RedBindSelected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_redbind.png"), 6, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (RedBindSelected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_redbind.png"), 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (RedBindSelected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_redbind.png"), 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (RedBindSelected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_redbind.png"), 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (RedBindSelected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_redbind.png"), 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
