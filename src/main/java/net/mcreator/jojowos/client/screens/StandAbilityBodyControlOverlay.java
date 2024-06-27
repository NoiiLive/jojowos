
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
import net.mcreator.jojowos.procedures.BodyControlUnselected9Procedure;
import net.mcreator.jojowos.procedures.BodyControlUnselected8Procedure;
import net.mcreator.jojowos.procedures.BodyControlUnselected7Procedure;
import net.mcreator.jojowos.procedures.BodyControlUnselected6Procedure;
import net.mcreator.jojowos.procedures.BodyControlUnselected5Procedure;
import net.mcreator.jojowos.procedures.BodyControlUnselected4Procedure;
import net.mcreator.jojowos.procedures.BodyControlUnselected3Procedure;
import net.mcreator.jojowos.procedures.BodyControlUnselected2Procedure;
import net.mcreator.jojowos.procedures.BodyControlUnselected1Procedure;
import net.mcreator.jojowos.procedures.BodyControlSelected9Procedure;
import net.mcreator.jojowos.procedures.BodyControlSelected8Procedure;
import net.mcreator.jojowos.procedures.BodyControlSelected7Procedure;
import net.mcreator.jojowos.procedures.BodyControlSelected6Procedure;
import net.mcreator.jojowos.procedures.BodyControlSelected5Procedure;
import net.mcreator.jojowos.procedures.BodyControlSelected4Procedure;
import net.mcreator.jojowos.procedures.BodyControlSelected3Procedure;
import net.mcreator.jojowos.procedures.BodyControlSelected2Procedure;
import net.mcreator.jojowos.procedures.BodyControlSelected1Procedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class StandAbilityBodyControlOverlay {
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
			if (BodyControlUnselected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_bodycontrol.png"), 27, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (BodyControlUnselected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_bodycontrol.png"), 46, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (BodyControlUnselected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_bodycontrol.png"), 65, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (BodyControlUnselected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_bodycontrol.png"), 84, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (BodyControlUnselected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_bodycontrol.png"), 8, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (BodyControlUnselected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_bodycontrol.png"), 27, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (BodyControlUnselected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_bodycontrol.png"), 46, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (BodyControlUnselected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_bodycontrol.png"), 65, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (BodyControlUnselected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_bodycontrol.png"), 84, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (BodyControlSelected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_bodycontrol.png"), 25, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (BodyControlSelected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_bodycontrol.png"), 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (BodyControlSelected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_bodycontrol.png"), 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (BodyControlSelected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_bodycontrol.png"), 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (BodyControlSelected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_bodycontrol.png"), 6, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (BodyControlSelected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_bodycontrol.png"), 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (BodyControlSelected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_bodycontrol.png"), 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (BodyControlSelected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_bodycontrol.png"), 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (BodyControlSelected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_bodycontrol.png"), 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
