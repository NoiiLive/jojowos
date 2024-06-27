package net.mcreator.jojowos.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.jojowos.world.inventory.TheWorldStandSkins2Menu;
import net.mcreator.jojowos.procedures.ReturnTheWorldDarkProcedure;
import net.mcreator.jojowos.procedures.ReturnTheWorldBlackProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinTheWorldNotEquippedDarkProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinTheWorldNotEquippedBlackProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinTheWorldNoDarkProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinTheWorldNoBlackProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinTheWorldEquippedDarkProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinTheWorldEquippedBlackProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinTheWorldDarkProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinTheWorldBlackProcedure;
import net.mcreator.jojowos.procedures.ReturnNoSkinEntityProcedure;
import net.mcreator.jojowos.procedures.ReturnCostTheWorldDarkProcedure;
import net.mcreator.jojowos.procedures.ReturnCostTheWorldBlackProcedure;
import net.mcreator.jojowos.network.TheWorldStandSkins2ButtonMessage;
import net.mcreator.jojowos.JojowosMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class TheWorldStandSkins2Screen extends AbstractContainerScreen<TheWorldStandSkins2Menu> {
	private final static HashMap<String, Object> guistate = TheWorldStandSkins2Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_standskin_equip1;
	ImageButton imagebutton_standskin_equip2;
	ImageButton imagebutton_guiarrow_left;
	ImageButton imagebutton_guiarrow;

	public TheWorldStandSkins2Screen(TheWorldStandSkins2Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 1;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("jojowos:textures/screens/the_world_stand_skins_2.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		if (ReturnNoSkinEntityProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinTheWorldNoBlackProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + -48, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + -48 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0),
						livingEntity);
		}
		if (ReturnNoSkinEntityProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinTheWorldNoDarkProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 48, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + 48 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0),
						livingEntity);
		}
		if (ReturnTheWorldBlackProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinTheWorldBlackProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + -48, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + -48 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0),
						livingEntity);
		}
		if (ReturnTheWorldDarkProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinTheWorldDarkProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 48, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + 48 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0),
						livingEntity);
		}
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (ReturnSkinTheWorldNoBlackProcedure.execute(entity))
			if (mouseX > leftPos + -58 && mouseX < leftPos + -38 && mouseY > topPos + 77 && mouseY < topPos + 101)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.the_world_stand_skins_2.tooltip_locked_black"), mouseX, mouseY);
		if (ReturnSkinTheWorldNoDarkProcedure.execute(entity))
			if (mouseX > leftPos + 38 && mouseX < leftPos + 58 && mouseY > topPos + 77 && mouseY < topPos + 101)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.the_world_stand_skins_2.tooltip_locked_dark"), mouseX, mouseY);
		if (ReturnSkinTheWorldEquippedBlackProcedure.execute(entity))
			if (mouseX > leftPos + -76 && mouseX < leftPos + -20 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.the_world_stand_skins_2.tooltip_equipped_black"), mouseX, mouseY);
		if (ReturnSkinTheWorldEquippedDarkProcedure.execute(entity))
			if (mouseX > leftPos + 20 && mouseX < leftPos + 76 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.the_world_stand_skins_2.tooltip_equipped_dark"), mouseX, mouseY);
		if (ReturnSkinTheWorldNotEquippedBlackProcedure.execute(entity))
			if (mouseX > leftPos + -76 && mouseX < leftPos + -20 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.literal(ReturnCostTheWorldBlackProcedure.execute()), mouseX, mouseY);
		if (ReturnSkinTheWorldNotEquippedDarkProcedure.execute(entity))
			if (mouseX > leftPos + 20 && mouseX < leftPos + 76 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.literal(ReturnCostTheWorldDarkProcedure.execute()), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standskin_gui_2.png"), this.leftPos + -213, this.topPos + -120, 0, 0, 427, 240, 427, 240);

		if (ReturnSkinTheWorldEquippedBlackProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standskin_equipped.png"), this.leftPos + -78, this.topPos + 80, 0, 0, 60, 19, 60, 19);
		}
		if (ReturnSkinTheWorldEquippedDarkProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standskin_equipped.png"), this.leftPos + 18, this.topPos + 80, 0, 0, 60, 19, 60, 19);
		}
		if (ReturnSkinTheWorldNoBlackProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skilltree_lock.png"), this.leftPos + -59, this.topPos + 76, 0, 0, 22, 26, 22, 26);
		}
		if (ReturnSkinTheWorldNoDarkProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skilltree_lock.png"), this.leftPos + 37, this.topPos + 76, 0, 0, 22, 26, 22, 26);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		imagebutton_standskin_equip1 = new ImageButton(this.leftPos + -78, this.topPos + 80, 60, 19, 0, 0, 19, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_standskin_equip1.png"), 60, 38, e -> {
			if (ReturnSkinTheWorldNotEquippedBlackProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new TheWorldStandSkins2ButtonMessage(0, x, y, z));
				TheWorldStandSkins2ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnSkinTheWorldNotEquippedBlackProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_standskin_equip1", imagebutton_standskin_equip1);
		this.addRenderableWidget(imagebutton_standskin_equip1);
		imagebutton_standskin_equip2 = new ImageButton(this.leftPos + 18, this.topPos + 80, 60, 19, 0, 0, 19, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_standskin_equip2.png"), 60, 38, e -> {
			if (ReturnSkinTheWorldNotEquippedDarkProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new TheWorldStandSkins2ButtonMessage(1, x, y, z));
				TheWorldStandSkins2ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnSkinTheWorldNotEquippedDarkProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_standskin_equip2", imagebutton_standskin_equip2);
		this.addRenderableWidget(imagebutton_standskin_equip2);
		imagebutton_guiarrow_left = new ImageButton(this.leftPos + -108, this.topPos + -10, 13, 19, 0, 0, 19, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_guiarrow_left.png"), 13, 38, e -> {
			if (true) {
				JojowosMod.PACKET_HANDLER.sendToServer(new TheWorldStandSkins2ButtonMessage(2, x, y, z));
				TheWorldStandSkins2ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_guiarrow_left", imagebutton_guiarrow_left);
		this.addRenderableWidget(imagebutton_guiarrow_left);
		imagebutton_guiarrow = new ImageButton(this.leftPos + 95, this.topPos + -10, 13, 19, 0, 0, 19, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_guiarrow.png"), 13, 38, e -> {
			if (true) {
				JojowosMod.PACKET_HANDLER.sendToServer(new TheWorldStandSkins2ButtonMessage(3, x, y, z));
				TheWorldStandSkins2ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_guiarrow", imagebutton_guiarrow);
		this.addRenderableWidget(imagebutton_guiarrow);
	}
}
