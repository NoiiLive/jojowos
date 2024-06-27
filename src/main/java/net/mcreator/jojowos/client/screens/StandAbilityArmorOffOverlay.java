
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
import net.mcreator.jojowos.procedures.ArmorOffUnselected9Procedure;
import net.mcreator.jojowos.procedures.ArmorOffUnselected8Procedure;
import net.mcreator.jojowos.procedures.ArmorOffUnselected7Procedure;
import net.mcreator.jojowos.procedures.ArmorOffUnselected6Procedure;
import net.mcreator.jojowos.procedures.ArmorOffUnselected5Procedure;
import net.mcreator.jojowos.procedures.ArmorOffUnselected4Procedure;
import net.mcreator.jojowos.procedures.ArmorOffUnselected3Procedure;
import net.mcreator.jojowos.procedures.ArmorOffUnselected2Procedure;
import net.mcreator.jojowos.procedures.ArmorOffUnselected1Procedure;
import net.mcreator.jojowos.procedures.ArmorOffSelected9Procedure;
import net.mcreator.jojowos.procedures.ArmorOffSelected8Procedure;
import net.mcreator.jojowos.procedures.ArmorOffSelected7Procedure;
import net.mcreator.jojowos.procedures.ArmorOffSelected6Procedure;
import net.mcreator.jojowos.procedures.ArmorOffSelected5Procedure;
import net.mcreator.jojowos.procedures.ArmorOffSelected4Procedure;
import net.mcreator.jojowos.procedures.ArmorOffSelected3Procedure;
import net.mcreator.jojowos.procedures.ArmorOffSelected2Procedure;
import net.mcreator.jojowos.procedures.ArmorOffSelected1Procedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class StandAbilityArmorOffOverlay {
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
			if (ArmorOffUnselected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_armoroff.png"), 27, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (ArmorOffUnselected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_armoroff.png"), 46, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (ArmorOffUnselected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_armoroff.png"), 65, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (ArmorOffUnselected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_armoroff.png"), 84, h - 42, 0, 0, 16, 16, 16, 16);
			}
			if (ArmorOffUnselected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_armoroff.png"), 8, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (ArmorOffUnselected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_armoroff.png"), 27, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (ArmorOffUnselected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_armoroff.png"), 46, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (ArmorOffUnselected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_armoroff.png"), 65, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (ArmorOffUnselected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_armoroff.png"), 84, h - 23, 0, 0, 16, 16, 16, 16);
			}
			if (ArmorOffSelected1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_armoroff.png"), 25, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ArmorOffSelected2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_armoroff.png"), 44, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ArmorOffSelected3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_armoroff.png"), 63, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ArmorOffSelected4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_armoroff.png"), 82, h - 44, 0, 0, 20, 20, 20, 20);
			}
			if (ArmorOffSelected5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_armoroff.png"), 6, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ArmorOffSelected6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_armoroff.png"), 25, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ArmorOffSelected7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_armoroff.png"), 44, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ArmorOffSelected8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_armoroff.png"), 63, h - 25, 0, 0, 20, 20, 20, 20);
			}
			if (ArmorOffSelected9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("jojowos:textures/screens/ability_overlay_selected_armoroff.png"), 82, h - 25, 0, 0, 20, 20, 20, 20);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
