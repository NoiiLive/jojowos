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

import net.mcreator.jojowos.world.inventory.SilverChariotStandSkins1Menu;
import net.mcreator.jojowos.procedures.ReturnSkinSilverChariotOVAProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinSilverChariotNotEquippedOVAProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinSilverChariotNotEquippedMangaProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinSilverChariotNotEquippedGoldProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinSilverChariotNotEquippedBaseProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinSilverChariotNoOVAProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinSilverChariotNoMangaProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinSilverChariotNoGoldProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinSilverChariotMangaProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinSilverChariotGoldProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinSilverChariotEquippedOVAProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinSilverChariotEquippedMangaProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinSilverChariotEquippedGoldProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinSilverChariotEquippedBaseProcedure;
import net.mcreator.jojowos.procedures.ReturnSkinSilverChariotBaseProcedure;
import net.mcreator.jojowos.procedures.ReturnSilverChariotOVAProcedure;
import net.mcreator.jojowos.procedures.ReturnSilverChariotMangaProcedure;
import net.mcreator.jojowos.procedures.ReturnSilverChariotGoldProcedure;
import net.mcreator.jojowos.procedures.ReturnSilverChariotBaseProcedure;
import net.mcreator.jojowos.procedures.ReturnNoSkinEntityProcedure;
import net.mcreator.jojowos.procedures.ReturnCostSilverChariotOVAProcedure;
import net.mcreator.jojowos.procedures.ReturnCostSilverChariotMangaProcedure;
import net.mcreator.jojowos.procedures.ReturnCostSilverChariotGoldProcedure;
import net.mcreator.jojowos.procedures.ReturnCostSilverChariotBaseProcedure;
import net.mcreator.jojowos.network.SilverChariotStandSkins1ButtonMessage;
import net.mcreator.jojowos.JojowosMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SilverChariotStandSkins1Screen extends AbstractContainerScreen<SilverChariotStandSkins1Menu> {
	private final static HashMap<String, Object> guistate = SilverChariotStandSkins1Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_standskin_equip;
	ImageButton imagebutton_standskin_equip1;
	ImageButton imagebutton_standskin_equip2;
	ImageButton imagebutton_standskin_equip3;

	public SilverChariotStandSkins1Screen(SilverChariotStandSkins1Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 1;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("jojowos:textures/screens/silver_chariot_stand_skins_1.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		if (ReturnSilverChariotBaseProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinSilverChariotBaseProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + -145, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + -145 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0),
						livingEntity);
		}
		if (ReturnNoSkinEntityProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinSilverChariotNoMangaProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + -49, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + -49 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0),
						livingEntity);
		}
		if (ReturnNoSkinEntityProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinSilverChariotNoOVAProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 48, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + 48 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0),
						livingEntity);
		}
		if (ReturnNoSkinEntityProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinSilverChariotNoGoldProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 144, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + 144 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0),
						livingEntity);
		}
		if (ReturnSilverChariotMangaProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinSilverChariotMangaProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + -49, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + -49 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0),
						livingEntity);
		}
		if (ReturnSilverChariotOVAProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinSilverChariotOVAProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 48, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + 48 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0),
						livingEntity);
		}
		if (ReturnSilverChariotGoldProcedure.execute(world) instanceof LivingEntity livingEntity) {
			if (ReturnSkinSilverChariotGoldProcedure.execute(entity))
				InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 144, this.topPos + 65, 50, 0f + (float) Math.atan((this.leftPos + 144 - mouseX) / 40.0), (float) Math.atan((this.topPos + 16 - mouseY) / 40.0),
						livingEntity);
		}
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (ReturnSkinSilverChariotNoMangaProcedure.execute(entity))
			if (mouseX > leftPos + -58 && mouseX < leftPos + -38 && mouseY > topPos + 77 && mouseY < topPos + 101)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.silver_chariot_stand_skins_1.tooltip_locked_manga"), mouseX, mouseY);
		if (ReturnSkinSilverChariotNoOVAProcedure.execute(entity))
			if (mouseX > leftPos + 38 && mouseX < leftPos + 58 && mouseY > topPos + 77 && mouseY < topPos + 101)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.silver_chariot_stand_skins_1.tooltip_locked_ova"), mouseX, mouseY);
		if (ReturnSkinSilverChariotNoGoldProcedure.execute(entity))
			if (mouseX > leftPos + 134 && mouseX < leftPos + 154 && mouseY > topPos + 77 && mouseY < topPos + 101)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.silver_chariot_stand_skins_1.tooltip_locked_gold"), mouseX, mouseY);
		if (ReturnSkinSilverChariotEquippedBaseProcedure.execute(entity))
			if (mouseX > leftPos + -172 && mouseX < leftPos + -116 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.silver_chariot_stand_skins_1.tooltip_equipped_base"), mouseX, mouseY);
		if (ReturnSkinSilverChariotEquippedMangaProcedure.execute(entity))
			if (mouseX > leftPos + -76 && mouseX < leftPos + -20 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.silver_chariot_stand_skins_1.tooltip_equipped_manga"), mouseX, mouseY);
		if (ReturnSkinSilverChariotEquippedOVAProcedure.execute(entity))
			if (mouseX > leftPos + 20 && mouseX < leftPos + 76 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.silver_chariot_stand_skins_1.tooltip_equipped_ova"), mouseX, mouseY);
		if (ReturnSkinSilverChariotEquippedGoldProcedure.execute(entity))
			if (mouseX > leftPos + 116 && mouseX < leftPos + 172 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.silver_chariot_stand_skins_1.tooltip_equipped_gold"), mouseX, mouseY);
		if (ReturnSkinSilverChariotNotEquippedBaseProcedure.execute(entity))
			if (mouseX > leftPos + -172 && mouseX < leftPos + -116 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.literal(ReturnCostSilverChariotBaseProcedure.execute()), mouseX, mouseY);
		if (ReturnSkinSilverChariotNotEquippedMangaProcedure.execute(entity))
			if (mouseX > leftPos + -76 && mouseX < leftPos + -20 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.literal(ReturnCostSilverChariotMangaProcedure.execute()), mouseX, mouseY);
		if (ReturnSkinSilverChariotNotEquippedOVAProcedure.execute(entity))
			if (mouseX > leftPos + 20 && mouseX < leftPos + 76 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.literal(ReturnCostSilverChariotOVAProcedure.execute()), mouseX, mouseY);
		if (ReturnSkinSilverChariotNotEquippedGoldProcedure.execute(entity))
			if (mouseX > leftPos + 116 && mouseX < leftPos + 172 && mouseY > topPos + 82 && mouseY < topPos + 97)
				guiGraphics.renderTooltip(font, Component.literal(ReturnCostSilverChariotGoldProcedure.execute()), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standskin_maingui.png"), this.leftPos + -213, this.topPos + -120, 0, 0, 427, 240, 427, 240);

		if (ReturnSkinSilverChariotEquippedBaseProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standskin_equipped.png"), this.leftPos + -174, this.topPos + 80, 0, 0, 60, 19, 60, 19);
		}
		if (ReturnSkinSilverChariotEquippedMangaProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standskin_equipped.png"), this.leftPos + -78, this.topPos + 80, 0, 0, 60, 19, 60, 19);
		}
		if (ReturnSkinSilverChariotEquippedOVAProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standskin_equipped.png"), this.leftPos + 18, this.topPos + 80, 0, 0, 60, 19, 60, 19);
		}
		if (ReturnSkinSilverChariotEquippedGoldProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/standskin_equipped.png"), this.leftPos + 114, this.topPos + 80, 0, 0, 60, 19, 60, 19);
		}
		if (ReturnSkinSilverChariotNoMangaProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skilltree_lock.png"), this.leftPos + -59, this.topPos + 76, 0, 0, 22, 26, 22, 26);
		}
		if (ReturnSkinSilverChariotNoOVAProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skilltree_lock.png"), this.leftPos + 37, this.topPos + 76, 0, 0, 22, 26, 22, 26);
		}
		if (ReturnSkinSilverChariotNoGoldProcedure.execute(entity)) {
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
			if (ReturnSkinSilverChariotNotEquippedBaseProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new SilverChariotStandSkins1ButtonMessage(0, x, y, z));
				SilverChariotStandSkins1ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnSkinSilverChariotNotEquippedBaseProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_standskin_equip", imagebutton_standskin_equip);
		this.addRenderableWidget(imagebutton_standskin_equip);
		imagebutton_standskin_equip1 = new ImageButton(this.leftPos + -78, this.topPos + 80, 60, 19, 0, 0, 19, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_standskin_equip1.png"), 60, 38, e -> {
			if (ReturnSkinSilverChariotNotEquippedMangaProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new SilverChariotStandSkins1ButtonMessage(1, x, y, z));
				SilverChariotStandSkins1ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnSkinSilverChariotNotEquippedMangaProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_standskin_equip1", imagebutton_standskin_equip1);
		this.addRenderableWidget(imagebutton_standskin_equip1);
		imagebutton_standskin_equip2 = new ImageButton(this.leftPos + 18, this.topPos + 80, 60, 19, 0, 0, 19, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_standskin_equip2.png"), 60, 38, e -> {
			if (ReturnSkinSilverChariotNotEquippedOVAProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new SilverChariotStandSkins1ButtonMessage(2, x, y, z));
				SilverChariotStandSkins1ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnSkinSilverChariotNotEquippedOVAProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_standskin_equip2", imagebutton_standskin_equip2);
		this.addRenderableWidget(imagebutton_standskin_equip2);
		imagebutton_standskin_equip3 = new ImageButton(this.leftPos + 114, this.topPos + 80, 60, 19, 0, 0, 19, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_standskin_equip3.png"), 60, 38, e -> {
			if (ReturnSkinSilverChariotNotEquippedGoldProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new SilverChariotStandSkins1ButtonMessage(3, x, y, z));
				SilverChariotStandSkins1ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ReturnSkinSilverChariotNotEquippedGoldProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_standskin_equip3", imagebutton_standskin_equip3);
		this.addRenderableWidget(imagebutton_standskin_equip3);
	}
}
