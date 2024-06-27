
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

import net.mcreator.jojowos.procedures.ReturnTheWorldProcedure;
import net.mcreator.jojowos.procedures.ReturnTheFoolProcedure;
import net.mcreator.jojowos.procedures.ReturnStarPlatinumProcedure;
import net.mcreator.jojowos.procedures.ReturnStandSummonedProcedure;
import net.mcreator.jojowos.procedures.ReturnSilverChariotProcedure;
import net.mcreator.jojowos.procedures.ReturnMagiciansRedProcedure;
import net.mcreator.jojowos.procedures.ReturnHierophantGreenProcedure;
import net.mcreator.jojowos.procedures.ReturnAbilityLockUnselected9Procedure;
import net.mcreator.jojowos.procedures.ReturnAbilityLockUnselected8Procedure;
import net.mcreator.jojowos.procedures.ReturnAbilityLockUnselected7Procedure;
import net.mcreator.jojowos.procedures.ReturnAbilityLockUnselected6Procedure;
import net.mcreator.jojowos.procedures.ReturnAbilityLockUnselected5Procedure;
import net.mcreator.jojowos.procedures.ReturnAbilityLockUnselected4Procedure;
import net.mcreator.jojowos.procedures.ReturnAbilityLockUnselected3Procedure;
import net.mcreator.jojowos.procedures.ReturnAbilityLockUnselected2Procedure;
import net.mcreator.jojowos.procedures.ReturnAbilityLockUnselected1Procedure;
import net.mcreator.jojowos.procedures.ReturnAbilityLockSelected9Procedure;
import net.mcreator.jojowos.procedures.ReturnAbilityLockSelected8Procedure;
import net.mcreator.jojowos.procedures.ReturnAbilityLockSelected7Procedure;
import net.mcreator.jojowos.procedures.ReturnAbilityLockSelected6Procedure;
import net.mcreator.jojowos.procedures.ReturnAbilityLockSelected5Procedure;
import net.mcreator.jojowos.procedures.ReturnAbilityLockSelected4Procedure;
import net.mcreator.jojowos.procedures.ReturnAbilityLockSelected3Procedure;
import net.mcreator.jojowos.procedures.ReturnAbilityLockSelected2Procedure;
import net.mcreator.jojowos.procedures.ReturnAbilityLockSelected1Procedure;
import net.mcreator.jojowos.procedures.AbilityTimeLeftDisplayProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class StandAbilityOverlayOverlay {
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
		if (ReturnStandSummonedProcedure.execute(entity)) {
			if (ReturnStandSummonedProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_switch_display_9.png"), 6, h - 44, 0, 0, 96, 39, 96, 39);
			}
			if (ReturnStarPlatinumProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/icon_overlay_starplatinum.png"), 8, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (ReturnMagiciansRedProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/icon_overlay_magiciansred.png"), 8, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (ReturnHierophantGreenProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/icon_overlay_hierophantgreen.png"), 8, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (ReturnSilverChariotProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/icon_overlay_silverchariot.png"), 8, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (ReturnTheWorldProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/icon_overlay_theworld.png"), 8, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (ReturnTheFoolProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/icon_overlay_thefool.png"), 8, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (ReturnAbilityLockUnselected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_lock.png"), 27, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (ReturnAbilityLockUnselected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_lock.png"), 46, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (ReturnAbilityLockUnselected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_lock.png"), 65, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (ReturnAbilityLockUnselected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_lock.png"), 84, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (ReturnAbilityLockUnselected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_lock.png"), 8, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (ReturnAbilityLockUnselected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_lock.png"), 27, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (ReturnAbilityLockUnselected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_lock.png"), 46, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (ReturnAbilityLockUnselected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_lock.png"), 65, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (ReturnAbilityLockUnselected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_lock.png"), 84, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (ReturnAbilityLockSelected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_lock_selected.png"), 25, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnAbilityLockSelected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_lock_selected.png"), 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnAbilityLockSelected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_lock_selected.png"), 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnAbilityLockSelected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_lock_selected.png"), 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnAbilityLockSelected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_lock_selected.png"), 6, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnAbilityLockSelected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_lock_selected.png"), 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnAbilityLockSelected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_lock_selected.png"), 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnAbilityLockSelected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_lock_selected.png"), 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ReturnAbilityLockSelected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_lock_selected.png"), 82, h - 25, 0, 0, 20, 20, 20, 20);
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
