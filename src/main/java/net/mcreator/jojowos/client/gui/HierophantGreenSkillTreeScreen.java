package net.mcreator.jojowos.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.jojowos.world.inventory.HierophantGreenSkillTreeMenu;
import net.mcreator.jojowos.procedures.MeterUnlockDisplayProcedure;
import net.mcreator.jojowos.procedures.MeterLockDisplayProcedure;
import net.mcreator.jojowos.procedures.HierophantGreenOVAIconProcedure;
import net.mcreator.jojowos.procedures.HierophantGreenMangaIconProcedure;
import net.mcreator.jojowos.procedures.HierophantGreenBlueIconProcedure;
import net.mcreator.jojowos.procedures.HierophantGreenBaseIconProcedure;
import net.mcreator.jojowos.procedures.HierophantGrappleRangeProcedure;
import net.mcreator.jojowos.procedures.HierophantBodyControlLengthProcedure;
import net.mcreator.jojowos.procedures.HierophantAttackStatsProcedure;
import net.mcreator.jojowos.procedures.Hierophant20MeterDamageProcedure;
import net.mcreator.jojowos.procedures.HieroGrappleUnlockDisplayProcedure;
import net.mcreator.jojowos.procedures.HieroGrappleLockDisplayProcedure;
import net.mcreator.jojowos.procedures.BodyControlUnlockDisplayProcedure;
import net.mcreator.jojowos.procedures.BodyControlLockDisplayProcedure;
import net.mcreator.jojowos.network.HierophantGreenSkillTreeButtonMessage;
import net.mcreator.jojowos.JojowosMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class HierophantGreenSkillTreeScreen extends AbstractContainerScreen<HierophantGreenSkillTreeMenu> {
	private final static HashMap<String, Object> guistate = HierophantGreenSkillTreeMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_skilltree_lock;
	ImageButton imagebutton_skilltree_lock1;
	ImageButton imagebutton_skilltree_lock2;
	ImageButton imagebutton_skillgui_button;

	public HierophantGreenSkillTreeScreen(HierophantGreenSkillTreeMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("jojowos:textures/screens/hierophant_green_skill_tree.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (HieroGrappleLockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + -52 && mouseX < leftPos + -28 && mouseY > topPos + -13 && mouseY < topPos + 11)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.hierophant_green_skill_tree.tooltip_grapple_10_potential_3_skill"), mouseX, mouseY);
		if (MeterLockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + 27 && mouseX < leftPos + 51 && mouseY > topPos + -13 && mouseY < topPos + 11)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.hierophant_green_skill_tree.tooltip_20meter_emerald_splash_30_pot"), mouseX, mouseY);
		if (BodyControlLockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + -13 && mouseX < leftPos + 11 && mouseY > topPos + 26 && mouseY < topPos + 50)
				guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.hierophant_green_skill_tree.tooltip_body_control_40_potential_3_s"), mouseX, mouseY);
		if (HieroGrappleUnlockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + -52 && mouseX < leftPos + -28 && mouseY > topPos + -13 && mouseY < topPos + 11)
				guiGraphics.renderTooltip(font, Component.literal(HierophantGrappleRangeProcedure.execute()), mouseX, mouseY);
		if (MeterUnlockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + 27 && mouseX < leftPos + 51 && mouseY > topPos + -13 && mouseY < topPos + 11)
				guiGraphics.renderTooltip(font, Component.literal(Hierophant20MeterDamageProcedure.execute()), mouseX, mouseY);
		if (BodyControlUnlockDisplayProcedure.execute(entity))
			if (mouseX > leftPos + -13 && mouseX < leftPos + 11 && mouseY > topPos + 26 && mouseY < topPos + 50)
				guiGraphics.renderTooltip(font, Component.literal(HierophantBodyControlLengthProcedure.execute()), mouseX, mouseY);
		if (mouseX > leftPos + -13 && mouseX < leftPos + 11 && mouseY > topPos + -13 && mouseY < topPos + 11)
			guiGraphics.renderTooltip(font, Component.translatable("gui.jojowos.hierophant_green_skill_tree.tooltip_open_stand_stats"), mouseX, mouseY);
		if (mouseX > leftPos + -17 && mouseX < leftPos + 15 && mouseY > topPos + -56 && mouseY < topPos + -24)
			guiGraphics.renderTooltip(font, Component.literal(HierophantAttackStatsProcedure.execute(entity)), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_default.png"), this.leftPos + -30, this.topPos + 9, 0, 0, 58, 58, 58, 58);

		guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_default.png"), this.leftPos + 10, this.topPos + -30, 0, 0, 58, 58, 58, 58);

		guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_default.png"), this.leftPos + -69, this.topPos + -30, 0, 0, 58, 58, 58, 58);

		if (HierophantGreenMangaIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_green.png"), this.leftPos + -30, this.topPos + -69, 0, 0, 58, 58, 58, 58);
		}
		if (HierophantGreenMangaIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/hierophantgreenicon_manga.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (HierophantGreenOVAIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_green.png"), this.leftPos + -30, this.topPos + -69, 0, 0, 58, 58, 58, 58);
		}
		if (HierophantGreenOVAIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/hierophantgreenicon_ova.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (HierophantGreenBlueIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_blue.png"), this.leftPos + -30, this.topPos + -69, 0, 0, 58, 58, 58, 58);
		}
		if (HierophantGreenBlueIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/hierophantgreenicon_blue.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (HierophantGreenBaseIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_green.png"), this.leftPos + -30, this.topPos + -69, 0, 0, 58, 58, 58, 58);
		}
		if (HierophantGreenBaseIconProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/hierophantgreen.png"), this.leftPos + -17, this.topPos + -56, 0, 0, 32, 32, 32, 32);
		}
		if (HieroGrappleUnlockDisplayProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/hierophant_grapple.png"), this.leftPos + -58, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (MeterUnlockDisplayProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/hierophant_20meter.png"), this.leftPos + 21, this.topPos + -19, 0, 0, 36, 36, 36, 36);
		}
		if (BodyControlUnlockDisplayProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/hierophant_bodycontrol.png"), this.leftPos + -19, this.topPos + 20, 0, 0, 36, 36, 36, 36);
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
		imagebutton_skilltree_lock = new ImageButton(this.leftPos + 28, this.topPos + -14, 22, 26, 0, 0, 26, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_skilltree_lock.png"), 22, 52, e -> {
			if (MeterLockDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new HierophantGreenSkillTreeButtonMessage(0, x, y, z));
				HierophantGreenSkillTreeButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (MeterLockDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_lock", imagebutton_skilltree_lock);
		this.addRenderableWidget(imagebutton_skilltree_lock);
		imagebutton_skilltree_lock1 = new ImageButton(this.leftPos + -12, this.topPos + 25, 22, 26, 0, 0, 26, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_skilltree_lock1.png"), 22, 52, e -> {
			if (BodyControlLockDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new HierophantGreenSkillTreeButtonMessage(1, x, y, z));
				HierophantGreenSkillTreeButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (BodyControlLockDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_lock1", imagebutton_skilltree_lock1);
		this.addRenderableWidget(imagebutton_skilltree_lock1);
		imagebutton_skilltree_lock2 = new ImageButton(this.leftPos + -51, this.topPos + -14, 22, 26, 0, 0, 26, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_skilltree_lock2.png"), 22, 52, e -> {
			if (HieroGrappleLockDisplayProcedure.execute(entity)) {
				JojowosMod.PACKET_HANDLER.sendToServer(new HierophantGreenSkillTreeButtonMessage(2, x, y, z));
				HierophantGreenSkillTreeButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (HieroGrappleLockDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_skilltree_lock2", imagebutton_skilltree_lock2);
		this.addRenderableWidget(imagebutton_skilltree_lock2);
		imagebutton_skillgui_button = new ImageButton(this.leftPos + -12, this.topPos + -12, 22, 22, 0, 0, 22, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_skillgui_button.png"), 22, 44, e -> {
			if (true) {
				JojowosMod.PACKET_HANDLER.sendToServer(new HierophantGreenSkillTreeButtonMessage(3, x, y, z));
				HierophantGreenSkillTreeButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_skillgui_button", imagebutton_skillgui_button);
		this.addRenderableWidget(imagebutton_skillgui_button);
	}
}
