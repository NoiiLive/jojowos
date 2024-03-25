
package net.mcreator.jojowos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.jojowos.entity.ChariotDisplayOVAEntity;
import net.mcreator.jojowos.client.model.ModelSilverChariotOVADisplay;

public class ChariotDisplayOVARenderer extends MobRenderer<ChariotDisplayOVAEntity, ModelSilverChariotOVADisplay<ChariotDisplayOVAEntity>> {
	public ChariotDisplayOVARenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSilverChariotOVADisplay(context.bakeLayer(ModelSilverChariotOVADisplay.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ChariotDisplayOVAEntity entity) {
		return new ResourceLocation("jojowos:textures/entities/silverchariotovatexture.png");
	}
}
