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

import net.mcreator.jojowos.world.inventory.StarPlatinumStandSkins1Menu;
import net.mcreator.jojowos.procedures.ReturnStarPlatinumPart6Procedure;
import net.mcreator.jojowos.procedures.ReturnStarPlatinumPart4Procedure;
import net.mcreator.jojowos.procedures.ReturnStarPlatinumMangaProcedure;
import net.mcreator.jojowos.procedures.ReturnStarPlatinumBaseProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinStarPlatinumPart6Procedure;
import net.mcreator.jojowos.procedures.ReturnSkinStarPlatinumPart4Procedure;
import net.mcreator.jojowos.procedures.ReturnSkinStarPlatinumNotEquippedPart6Procedure;
import net.mcreator.jojowos.procedures.ReturnSkinStarPlatinumNotEquippedPart4Procedure;
import net.mcreator.jojowos.procedures.ReturnSkinStarPlatinumNotEquippedMangaProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinStarPlatinumNotEquippedBaseProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinStarPlatinumNoPart6Procedure;
import net.mcreator.jojowos.procedures.ReturnSkinStarPlatinumNoPart4Procedure;
import net.mcreator.jojowos.procedures.ReturnSkinStarPlatinumNoMangaProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinStarPlatinumMangaProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinStarPlatinumEquippedPart6Procedure;
import net.mcreator.jojowos.procedures.ReturnSkinStarPlatinumEquippedPart4Procedure;
import net.mcreator.jojowos.procedures.ReturnSkinStarPlatinumEquippedMangaProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinStarPlatinumEquippedBaseProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinStarPlatinumBaseProcedure;
import net.mcreator.jojowos.procedures.ReturnNoSkinEntityProcedure;
import net.mcreator.jojowos.procedures.ReturnCostStarPlatinumPart6Procedure;
import net.mcreator.jojowos.procedures.ReturnCostStarPlatinumPart4Procedure;
import net.mcreator.jojowos.procedures.ReturnCostStarPlatinumMangaProcedure;
import net.mcreator.jojowos.procedures.ReturnCostStarPlatinumBaseProcedure;
import net.mcreator.jojowos.network.StarPlatinumStandSkins1ButtonMessage;
import net.mcreator.jojowos.JojowosMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class StarPlatinumStandSkins1Screen extends AbstractContainerScreen<StarPlatinumStandSkins1Menu> {
	private final static HashMap<String, Object> guistate = StarPlatinumStandSkins1Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_standskin_equip;
	ImageButton imagebutton_standskin_equip1;
	ImageButton imagebutton_standskin_equip2;
	ImageButton imagebutton_standskin_equip3;
	ImageButton imagebutton_guiarrow_left;
	ImageButton imagebutton_guiarrow;

	public StarPlatinumStandSkins1Screen(StarPlatinumStandSkins1Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 1;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("jojowos:textures/screens/star_platinum_stand_skins_1.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		if (ReturnStarPlatinumBaseProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinStarPlatinumBaseProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + -144, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + -144 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0),
						livingEntity);
		}
		if (ReturnStarPlatinumPart4Procedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinStarPlatinumPart4Procedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + -48, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + -48 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0),
						livingEntity);
		}
		if (ReturnStarPlatinumPart6Procedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinStarPlatinumPart6Procedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 48, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + 48 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0),
						livingEntity);
		}
		if (ReturnStarPlatinumMangaProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinStarPlatinumMangaProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 144, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + 144 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0),
						livingEntity);
		}
		if (ReturnNoSkinEntityProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinStarPlatinumNoPart4Procedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + -48, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + -48 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0),
						livingEntity);
		}
		if (ReturnNoSkinEntityProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinStarPlatinumNoPart6Procedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 48, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + 48 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0),
						livingEntity);
		}
		if (ReturnNoSkinEntityProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinStarPlatinumNoMangaProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 144, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + 144 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0),
						livingEntity);
		}
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (ReturnSkinStarPlatinumEquippedBaseProcedure.execute(entity))
			if (mouseX > leftPos + -172 && mouseX < leftPos + -116 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.star_platinum_stand_skins_1.tooltip_equipped_base"), mouseX, mouseY);
		if (ReturnSkinStarPlatinumNotEquippedBaseProcedure.execute(entity))
			if (mouseX > leftPos + -172 && mouseX < leftPos + -116 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.literal(ReturnCostStarPlatinumBaseProcedure.execute()), mouseX, mouseY);
		if (ReturnSkinStarPlatinumNoPart4Procedure.execute(entity))
			if (mouseX > leftPos + -57 && mouseX < leftPos + -38 && mouseY > topPos + 77 && mouseY < topPos + 101)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.star_platinum_stand_skins_1.tooltip_locked_part_4"), mouseX, mouseY);
		if (ReturnSkinStarPlatinumNotEquippedPart4Procedure.execute(entity))
			if (mouseX > leftPos + -76 && mouseX < leftPos + -20 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.literal(ReturnCostStarPlatinumPart4Procedure.execute()), mouseX, mouseY);
		if (ReturnSkinStarPlatinumEquippedPart4Procedure.execute(entity))
			if (mouseX > leftPos + -76 && mouseX < leftPos + -20 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.star_platinum_stand_skins_1.tooltip_equipped_part_4"), mouseX, mouseY);
		if (ReturnSkinStarPlatinumNoPart6Procedure.execute(entity))
			if (mouseX > leftPos + 38 && mouseX < leftPos + 58 && mouseY > topPos + 77 && mouseY < topPos + 101)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.star_platinum_stand_skins_1.tooltip_locked_part_6"), mouseX, mouseY);
		if (ReturnSkinStarPlatinumNotEquippedPart6Procedure.execute(entity))
			if (mouseX > leftPos + 20 && mouseX < leftPos + 76 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.literal(ReturnCostStarPlatinumPart6Procedure.execute()), mouseX, mouseY);
		if (ReturnSkinStarPlatinumEquippedPart6Procedure.execute(entity))
			if (mouseX > leftPos + 20 && mouseX < leftPos + 76 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.star_platinum_stand_skins_1.tooltip_equipped_part_6"), mouseX, mouseY);
		if (ReturnSkinStarPlatinumNoMangaProcedure.execute(entity))
			if (mouseX > leftPos + 134 && mouseX < leftPos + 154 && mouseY > topPos + 77 && mouseY < topPos + 101)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.star_platinum_stand_skins_1.tooltip_locked_manga"), mouseX, mouseY);
		if (ReturnSkinStarPlatinumNotEquippedMangaProcedure.execute(entity))
			if (mouseX > leftPos + 116 && mouseX < leftPos + 172 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.literal(ReturnCostStarPlatinumMangaProcedure.execute()), mouseX, mouseY);
		if (ReturnSkinStarPlatinumEquippedMangaProcedure.execute(entity))
			if (mouseX > leftPos + 116 && mouseX < leftPos + 172 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.star_platinum_stand_skins_1.tooltip_equipped_manga"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standskin_maingui.png"), this.leftPos + -213, this.topPos + -120, 0, 0, 427, 240, 427, 240);

		if (ReturnSkinStarPlatinumEquippedBaseProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standskin_equipped.png"), this.leftPos + -174, this.topPos + 80, 0, 0, 60, 19, 60, 19);
		}
		if (ReturnSkinStarPlatinumEquippedPart4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standskin_equipped.png"), this.leftPos + -78, this.topPos + 80, 0, 0, 60, 19, 60, 19);
		}
		if (ReturnSkinStarPlatinumEquippedPart6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standskin_equipped.png"), this.leftPos + 18, this.topPos + 80, 0, 0, 60, 19, 60, 19);
		}
		if (ReturnSkinStarPlatinumEquippedMangaProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standskin_equipped.png"), this.leftPos + 114, this.topPos + 80, 0, 0, 60, 19, 60, 19);
		}
		if (ReturnSkinStarPlatinumNoPart4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skilltree_lock.png"), this.leftPos + -59, this.topPos + 76, 0, 0, 22, 26, 22, 26);
		}
		if (ReturnSkinStarPlatinumNoPart6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skilltree_lock.png"), this.leftPos + 37, this.topPos + 76, 0, 0, 22, 26, 22, 26);
		}
		if (ReturnSkinStarPlatinumNoMangaProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skilltree_lock.png"), this.leftPos + 133, this.topPos + 76, 0, 0, 22, 26, 22, 26);
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
		imagebutton_standskin_equip = new ImageButton(this.leftPos + -174, this.topPos + 80, 60, 19, 0, 0, 19, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_standskin_equip.png"), 60, 38, e -> {
			if (ReturnSkinStarPlatinumNotEquippedBaseProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new StarPlatinumStandSkins1ButtonMessage(0, x, y, z));
				StarPlatinumStandSkins1ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnSkinStarPlatinumNotEquippedBaseProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_standskin_equip", imagebutton_standskin_equip);
		this.addRenderableWidget(imagebutton_standskin_equip);
		imagebutton_standskin_equip1 = new ImageButton(this.leftPos + -78, this.topPos + 80, 60, 19, 0, 0, 19, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_standskin_equip1.png"), 60, 38, e -> {
			if (ReturnSkinStarPlatinumNotEquippedPart4Procedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new StarPlatinumStandSkins1ButtonMessage(1, x, y, z));
				StarPlatinumStandSkins1ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnSkinStarPlatinumNotEquippedPart4Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_standskin_equip1", imagebutton_standskin_equip1);
		this.addRenderableWidget(imagebutton_standskin_equip1);
		imagebutton_standskin_equip2 = new ImageButton(this.leftPos + 18, this.topPos + 80, 60, 19, 0, 0, 19, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_standskin_equip2.png"), 60, 38, e -> {
			if (ReturnSkinStarPlatinumNotEquippedPart6Procedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new StarPlatinumStandSkins1ButtonMessage(2, x, y, z));
				StarPlatinumStandSkins1ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnSkinStarPlatinumNotEquippedPart6Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_standskin_equip2", imagebutton_standskin_equip2);
		this.addRenderableWidget(imagebutton_standskin_equip2);
		imagebutton_standskin_equip3 = new ImageButton(this.leftPos + 114, this.topPos + 80, 60, 19, 0, 0, 19, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_standskin_equip3.png"), 60, 38, e -> {
			if (ReturnSkinStarPlatinumNotEquippedMangaProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new StarPlatinumStandSkins1ButtonMessage(3, x, y, z));
				StarPlatinumStandSkins1ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnSkinStarPlatinumNotEquippedMangaProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_standskin_equip3", imagebutton_standskin_equip3);
		this.addRenderableWidget(imagebutton_standskin_equip3);
		imagebutton_guiarrow_left = new ImageButton(this.leftPos + -204, this.topPos + -10, 13, 19, 0, 0, 19, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_guiarrow_left.png"), 13, 38, e -> {
			if (true) {
				JojowosMod.PACKET_HANDLER.sendToServer(new StarPlatinumStandSkins1ButtonMessage(4, x, y, z));
				StarPlatinumStandSkins1ButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_guiarrow_left", imagebutton_guiarrow_left);
		this.addRenderableWidget(imagebutton_guiarrow_left);
		imagebutton_guiarrow = new ImageButton(this.leftPos + 191, this.topPos + -10, 13, 19, 0, 0, 19, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_guiarrow.png"), 13, 38, e -> {
			if (true) {
				JojowosMod.PACKET_HANDLER.sendToServer(new StarPlatinumStandSkins1ButtonMessage(5, x, y, z));
				StarPlatinumStandSkins1ButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_guiarrow", imagebutton_guiarrow);
		this.addRenderableWidget(imagebutton_guiarrow);
	}
}
