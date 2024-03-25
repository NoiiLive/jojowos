
package net.mcreator.jojowos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.jojowos.entity.HermitPurpleDisplayPart4Entity;
import net.mcreator.jojowos.client.model.ModelHermitPurpleDisplay;

public class HermitPurpleDisplayPart4Renderer extends MobRenderer<HermitPurpleDisplayPart4Entity, ModelHermitPurpleDisplay<HermitPurpleDisplayPart4Entity>> {
	public HermitPurpleDisplayPart4Renderer(EntityRendererProvider.Context context) {
		super(context, new ModelHermitPurpleDisplay(context.bakeLayer(ModelHermitPurpleDisplay.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HermitPurpleDisplayPart4Entity entity) {
		return new ResourceLocation("jojowos:textures/entities/hermitpart4.png");
	}
}
