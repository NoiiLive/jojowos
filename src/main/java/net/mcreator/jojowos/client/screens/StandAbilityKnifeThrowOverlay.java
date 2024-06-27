
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
import net.mcreator.jojowos.procedures.KnifeThrowUnselected9Procedure;
import net.mcreator.jojowos.procedures.KnifeThrowUnselected8Procedure;
import net.mcreator.jojowos.procedures.KnifeThrowUnselected7Procedure;
import net.mcreator.jojowos.procedures.KnifeThrowUnselected6Procedure;
import net.mcreator.jojowos.procedures.KnifeThrowUnselected4Procedure;
import net.mcreator.jojowos.procedures.KnifeThrowUnselected3Procedure;
import net.mcreator.jojowos.procedures.KnifeThrowUnselected2Procedure;
import net.mcreator.jojowos.procedures.KnifeThrowUnselected1Procedure;
import net.mcreator.jojowos.procedures.KnifeThrowUnlocked5Procedure;
import net.mcreator.jojowos.procedures.KnifeThrowSelected9Procedure;
import net.mcreator.jojowos.procedures.KnifeThrowSelected8Procedure;
import net.mcreator.jojowos.procedures.KnifeThrowSelected7Procedure;
import net.mcreator.jojowos.procedures.KnifeThrowSelected6Procedure;
import net.mcreator.jojowos.procedures.KnifeThrowSelected5Procedure;
import net.mcreator.jojowos.procedures.KnifeThrowSelected4Procedure;
import net.mcreator.jojowos.procedures.KnifeThrowSelected3Procedure;
import net.mcreator.jojowos.procedures.KnifeThrowSelected2Procedure;
import net.mcreator.jojowos.procedures.KnifeThrowSelected1Procedure;
import net.mcreator.jojowos.procedures.DontReturnProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class StandAbilityKnifeThrowOverlay {
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
			if (KnifeThrowUnselected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_knifethrow.png"), 27, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (KnifeThrowUnselected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_knifethrow.png"), 46, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (KnifeThrowUnselected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_knifethrow.png"), 65, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (KnifeThrowUnselected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_knifethrow.png"), 84, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (KnifeThrowUnlocked5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_knifethrow.png"), 8, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (KnifeThrowUnselected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_knifethrow.png"), 27, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (KnifeThrowUnselected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_knifethrow.png"), 46, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (KnifeThrowUnselected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_knifethrow.png"), 65, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (KnifeThrowUnselected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_knifethrow.png"), 84, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (KnifeThrowSelected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_knifethrow.png"), 25, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (KnifeThrowSelected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_knifethrow.png"), 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (KnifeThrowSelected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_knifethrow.png"), 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (KnifeThrowSelected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_knifethrow.png"), 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (KnifeThrowSelected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_knifethrow.png"), 6, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (KnifeThrowSelected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_knifethrow.png"), 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (KnifeThrowSelected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_knifethrow.png"), 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (KnifeThrowSelected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_knifethrow.png"), 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (KnifeThrowSelected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_knifethrow.png"), 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
