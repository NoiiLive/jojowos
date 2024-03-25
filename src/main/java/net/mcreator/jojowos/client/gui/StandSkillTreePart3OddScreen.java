package net.mcreator.jojowos.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.jojowos.world.inventory.StandSkillTreePart3OddMenu;
import net.mcreator.jojowos.procedures.ReturnNoAbility9Procedure;
import net.mcreator.jojowos.procedures.ReturnNoAbility8Procedure;
import net.mcreator.jojowos.procedures.ReturnNoAbility7Procedure;
import net.mcreator.jojowos.procedures.ReturnNoAbility6Procedure;
import net.mcreator.jojowos.procedures.ReturnNoAbility5Procedure;
import net.mcreator.jojowos.procedures.ReturnNoAbility4Procedure;
import net.mcreator.jojowos.procedures.ReturnNoAbility3Procedure;
import net.mcreator.jojowos.procedures.ReturnNoAbility2Procedure;
import net.mcreator.jojowos.procedures.ReturnNoAbility1Procedure;
import net.mcreator.jojowos.network.StandSkillTreePart3OddButtonMessage;
import net.mcreator.jojowos.JojowosMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class StandSkillTreePart3OddScreen extends AbstractContainerScreen<StandSkillTreePart3OddMenu> {
	private final static HashMap<String, Object> guistate = StandSkillTreePart3OddMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_skillgui_button;

	public StandSkillTreePart3OddScreen(StandSkillTreePart3OddMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("jojowos:textures/screens/stand_skill_tree_part_3_odd.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		if (ReturnNoAbility3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_default.png"), this.leftPos + -30, this.topPos + 9, 0, 0, 58, 58, 58, 58);
		}
		if (ReturnNoAbility2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_default.png"), this.leftPos + 10, this.topPos + -30, 0, 0, 58, 58, 58, 58);
		}
		if (ReturnNoAbility1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_default.png"), this.leftPos + -69, this.topPos + -30, 0, 0, 58, 58, 58, 58);
		}
		if (ReturnNoAbility9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_default.png"), this.leftPos + -147, this.topPos + -30, 0, 0, 58, 58, 58, 58);
		}
		if (ReturnNoAbility8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_default.png"), this.leftPos + 88, this.topPos + -30, 0, 0, 58, 58, 58, 58);
		}
		if (ReturnNoAbility5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_default.png"), this.leftPos + 49, this.topPos + 9, 0, 0, 58, 58, 58, 58);
		}
		if (ReturnNoAbility4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_default.png"), this.leftPos + -108, this.topPos + 9, 0, 0, 58, 58, 58, 58);
		}
		if (ReturnNoAbility6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_default.png"), this.leftPos + 49, this.topPos + -69, 0, 0, 58, 58, 58, 58);
		}
		if (ReturnNoAbility7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_default.png"), this.leftPos + -108, this.topPos + -69, 0, 0, 58, 58, 58, 58);
		}

		guiGraphics.blit(new ResourceLocation("jojowos:textures/screens/skillicon_yellow.png"), this.leftPos + -30, this.topPos + -69, 0, 0, 58, 58, 58, 58);

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
		imagebutton_skillgui_button = new ImageButton(this.leftPos + -12, this.topPos + -12, 22, 22, 0, 0, 22, new ResourceLocation("jojowos:textures/screens/atlas/imagebutton_skillgui_button.png"), 22, 44, e -> {
			if (true) {
				JojowosMod.PACKET_HANDLER.sendToServer(new StandSkillTreePart3OddButtonMessage(0, x, y, z));
				StandSkillTreePart3OddButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_skillgui_button", imagebutton_skillgui_button);
		this.addRenderableWidget(imagebutton_skillgui_button);
	}
}
