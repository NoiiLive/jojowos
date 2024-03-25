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

import net.mcreator.jojowos.world.inventory.TheWorldStandSkins1Menu;
import net.mcreator.jojowos.procedures.ReturnTheWorldOVAProcedure;
import net.mcreator.jojowos.procedures.ReturnTheWorldMangaProcedure;
import net.mcreator.jojowos.procedures.ReturnTheWorldBaseProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinTheWorldOVAProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinTheWorldNotEquippedOVAProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinTheWorldNotEquippedMangaProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinTheWorldNotEquippedBaseProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinTheWorldNoOVAProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinTheWorldNoMangaProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinTheWorldMangaProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinTheWorldEquippedOVAProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinTheWorldEquippedMangaProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinTheWorldEquippedBaseProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinTheWorldBaseProcedure;
import net.mcreator.jojowos.procedures.ReturnNoSkinEntityProcedure;
import net.mcreator.jojowos.procedures.ReturnCostTheWorldOVAProcedure;
import net.mcreator.jojowos.procedures.ReturnCostTheWorldMangaProcedure;
import net.mcreator.jojowos.procedures.ReturnCostTheWorldBaseProcedure;
import net.mcreator.jojowos.network.TheWorldStandSkins1ButtonMessage;
import net.mcreator.jojowos.JojowosMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class TheWorldStandSkins1Screen extends AbstractContainerScreen<TheWorldStandSkins1Menu> {
	private final static HashMap<String, Object> guistate = TheWorldStandSkins1Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_standskin_equip;
	ImageButton imagebutton_standskin_equip1;
	ImageButton imagebutton_standskin_equip2;
	ImageButton imagebutton_guiarrow_left;
	ImageButton imagebutton_guiarrow;

	public TheWorldStandSkins1Screen(TheWorldStandSkins1Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 1;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("jojowos:textures/screens/the_world_stand_skins_1.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		if (ReturnTheWorldBaseProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinTheWorldBaseProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + -97, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + -97 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0),
						livingEntity);
		}
		if (ReturnNoSkinEntityProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinTheWorldNoMangaProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + -1, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + -1 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0),
						livingEntity);
		}
		if (ReturnNoSkinEntityProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinTheWorldNoOVAProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 96, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + 96 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0),
						livingEntity);
		}
		if (ReturnTheWorldMangaProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinTheWorldMangaProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + -1, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + -1 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0),
						livingEntity);
		}
		if (ReturnTheWorldOVAProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinTheWorldOVAProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 96, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + 96 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0),
						livingEntity);
		}
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (ReturnSkinTheWorldNoMangaProcedure.execute(entity))
			if (mouseX > leftPos + -10 && mouseX < leftPos + 10 && mouseY > topPos + 77 && mouseY < topPos + 101)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.the_world_stand_skins_1.tooltip_locked_manga"), mouseX, mouseY);
		if (ReturnSkinTheWorldNoOVAProcedure.execute(entity))
			if (mouseX > leftPos + 86 && mouseX < leftPos + 106 && mouseY > topPos + 77 && mouseY < topPos + 101)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.the_world_stand_skins_1.tooltip_locked_ova"), mouseX, mouseY);
		if (ReturnSkinTheWorldEquippedBaseProcedure.execute(entity))
			if (mouseX > leftPos + -124 && mouseX < leftPos + -68 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.the_world_stand_skins_1.tooltip_equipped_base"), mouseX, mouseY);
		if (ReturnSkinTheWorldEquippedMangaProcedure.execute(entity))
			if (mouseX > leftPos + -28 && mouseX < leftPos + 28 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.the_world_stand_skins_1.tooltip_equipped_manga"), mouseX, mouseY);
		if (ReturnSkinTheWorldEquippedOVAProcedure.execute(entity))
			if (mouseX > leftPos + 68 && mouseX < leftPos + 124 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.the_world_stand_skins_1.tooltip_locked_ova1"), mouseX, mouseY);
		if (ReturnSkinTheWorldNotEquippedBaseProcedure.execute(entity))
			if (mouseX > leftPos + -124 && mouseX < leftPos + -68 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.literal(ReturnCostTheWorldBaseProcedure.execute()), mouseX, mouseY);
		if (ReturnSkinTheWorldNotEquippedMangaProcedure.execute(entity))
			if (mouseX > leftPos + -28 && mouseX < leftPos + 28 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.literal(ReturnCostTheWorldMangaProcedure.execute()), mouseX, mouseY);
		if (ReturnSkinTheWorldNotEquippedOVAProcedure.execute(entity))
			if (mouseX > leftPos + 68 && mouseX < leftPos + 124 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.literal(ReturnCostTheWorldOVAProcedure.execute()), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standskin_gui_3.png"), this.leftPos + -213, this.topPos + -120, 0, 0, 427, 240, 427, 240);

		if (ReturnSkinTheWorldEquippedBaseProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standskin_equipped.png"), this.leftPos + -126, this.topPos + 80, 0, 0, 60, 19, 60, 19);
		}
		if (ReturnSkinTheWorldEquippedMangaProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standskin_equipped.png"), this.leftPos + -30, this.topPos + 80, 0, 0, 60, 19, 60, 19);
		}
		if (ReturnSkinTheWorldEquippedOVAProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standskin_equipped.png"), this.leftPos + 66, this.topPos + 80, 0, 0, 60, 19, 60, 19);
		}
		if (ReturnSkinTheWorldNoMangaProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skilltree_lock.png"), this.leftPos + -11, this.topPos + 76, 0, 0, 22, 26, 22, 26);
		}
		if (ReturnSkinTheWorldNoOVAProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skilltree_lock.png"), this.leftPos + 85, this.topPos + 76, 0, 0, 22, 26, 22, 26);
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
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_standskin_equip = new ImageButton(this.leftPos + -126, this.topPos + 80, 60, 19, 0, 0, 19, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_standskin_equip.png"), 60, 38, e -> {
			if (ReturnSkinTheWorldNotEquippedBaseProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new TheWorldStandSkins1ButtonMessage(0, x, y, z));
				TheWorldStandSkins1ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnSkinTheWorldNotEquippedBaseProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_standskin_equip", imagebutton_standskin_equip);
		this.addRenderableWidget(imagebutton_standskin_equip);
		imagebutton_standskin_equip1 = new ImageButton(this.leftPos + -30, this.topPos + 80, 60, 19, 0, 0, 19, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_standskin_equip1.png"), 60, 38, e -> {
			if (ReturnSkinTheWorldNotEquippedMangaProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new TheWorldStandSkins1ButtonMessage(1, x, y, z));
				TheWorldStandSkins1ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnSkinTheWorldNotEquippedMangaProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_standskin_equip1", imagebutton_standskin_equip1);
		this.addRenderableWidget(imagebutton_standskin_equip1);
		imagebutton_standskin_equip2 = new ImageButton(this.leftPos + 66, this.topPos + 80, 60, 19, 0, 0, 19, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_standskin_equip2.png"), 60, 38, e -> {
			if (ReturnSkinTheWorldNotEquippedOVAProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new TheWorldStandSkins1ButtonMessage(2, x, y, z));
				TheWorldStandSkins1ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnSkinTheWorldNotEquippedOVAProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_standskin_equip2", imagebutton_standskin_equip2);
		this.addRenderableWidget(imagebutton_standskin_equip2);
		imagebutton_guiarrow_left = new ImageButton(this.leftPos + -156, this.topPos + -10, 13, 19, 0, 0, 19, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_guiarrow_left.png"), 13, 38, e -> {
			if (true) {
				JojowosMod.PACKET_HANDLER.sendToServer(new TheWorldStandSkins1ButtonMessage(3, x, y, z));
				TheWorldStandSkins1ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_guiarrow_left", imagebutton_guiarrow_left);
		this.addRenderableWidget(imagebutton_guiarrow_left);
		imagebutton_guiarrow = new ImageButton(this.leftPos + 143, this.topPos + -10, 13, 19, 0, 0, 19, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_guiarrow.png"), 13, 38, e -> {
			if (true) {
				JojowosMod.PACKET_HANDLER.sendToServer(new TheWorldStandSkins1ButtonMessage(4, x, y, z));
				TheWorldStandSkins1ButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_guiarrow", imagebutton_guiarrow);
		this.addRenderableWidget(imagebutton_guiarrow);
	}
}
