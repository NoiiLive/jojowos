
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

import net.mcreator.jojowos.procedures.ReturnHermitPurpleSummonedProcedure;
import net.mcreator.jojowos.procedures.ReturnHermitPurpleProcedure;
import net.mcreator.jojowos.procedures.ReturnAbilityLockUnselected2Procedure;
import net.mcreator.jojowos.procedures.ReturnAbilityLockUnselected1Procedure;
import net.mcreator.jojowos.procedures.ReturnAbilityLockSelected2Procedure;
import net.mcreator.jojowos.procedures.ReturnAbilityLockSelected1Procedure;
import net.mcreator.jojowos.procedures.AbilityTimeLeftDisplayProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class HermitPurpleAbilityOverlayOverlay {
	@SubscribeEvent(priority = EventPriority.HIGH)
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
		if (ReturnHermitPurpleSummonedProcedure.execute(entity)) {
			if (ReturnHermitPurpleSummonedProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_switch_display_2.png"), 6, h - 44, 0, 0, 96, 39, 96, 39);
			}
			if (ReturnAbilityLockUnselected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_lock.png"), 27, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (ReturnAbilityLockUnselected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_lock.png"), 46, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (ReturnAbilityLockSelected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_lock_selected.png"), 25, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnAbilityLockSelected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_lock_selected.png"), 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnHermitPurpleProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/icon_overlay_hermitpurple.png"), 8, h - 42, 0, 0, 16, 16, 16, 16);
			}
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					AbilityTimeLeftDisplayProcedure.execute(entity), 8, h - 58, -39322, false);
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
