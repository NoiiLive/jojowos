
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
import net.mcreator.jojowos.procedures.InhaleUnselected9Procedure;
import net.mcreator.jojowos.procedures.InhaleUnselected8Procedure;
import net.mcreator.jojowos.procedures.InhaleUnselected7Procedure;
import net.mcreator.jojowos.procedures.InhaleUnselected6Procedure;
import net.mcreator.jojowos.procedures.InhaleUnselected5Procedure;
import net.mcreator.jojowos.procedures.InhaleUnselected4Procedure;
import net.mcreator.jojowos.procedures.InhaleUnselected3Procedure;
import net.mcreator.jojowos.procedures.InhaleUnselected2Procedure;
import net.mcreator.jojowos.procedures.InhaleUnselected1Procedure;
import net.mcreator.jojowos.procedures.InhaleSelected9Procedure;
import net.mcreator.jojowos.procedures.InhaleSelected8Procedure;
import net.mcreator.jojowos.procedures.InhaleSelected7Procedure;
import net.mcreator.jojowos.procedures.InhaleSelected6Procedure;
import net.mcreator.jojowos.procedures.InhaleSelected5Procedure;
import net.mcreator.jojowos.procedures.InhaleSelected4Procedure;
import net.mcreator.jojowos.procedures.InhaleSelected3Procedure;
import net.mcreator.jojowos.procedures.InhaleSelected2Procedure;
import net.mcreator.jojowos.procedures.InhaleSelected1Procedure;
import net.mcreator.jojowos.procedures.DontReturnProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class StandAbilityInhaleOverlay {
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
			if (InhaleUnselected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_inhale.png"), 27, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (InhaleUnselected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_inhale.png"), 46, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (InhaleUnselected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_inhale.png"), 65, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (InhaleUnselected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_inhale.png"), 84, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (InhaleUnselected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_inhale.png"), 8, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (InhaleUnselected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_inhale.png"), 27, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (InhaleUnselected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_inhale.png"), 46, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (InhaleUnselected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_inhale.png"), 65, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (InhaleUnselected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_inhale.png"), 84, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (InhaleSelected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_inhale.png"), 25, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (InhaleSelected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_inhale.png"), 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (InhaleSelected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_inhale.png"), 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (InhaleSelected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_inhale.png"), 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (InhaleSelected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_inhale.png"), 6, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (InhaleSelected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_inhale.png"), 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (InhaleSelected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_inhale.png"), 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (InhaleSelected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_inhale.png"), 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (InhaleSelected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_inhale.png"), 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
