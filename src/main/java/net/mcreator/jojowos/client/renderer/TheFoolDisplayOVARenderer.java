
package net.mcreator.jojowos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.jojowos.entity.TheFoolDisplayOVAEntity;
import net.mcreator.jojowos.client.model.ModelTheFoolDisplay;

public class TheFoolDisplayOVARenderer extends MobRenderer<TheFoolDisplayOVAEntity, ModelTheFoolDisplay<TheFoolDisplayOVAEntity>> {
	public TheFoolDisplayOVARenderer(EntityRendererProvider.Context context) {
		super(context, new ModelTheFoolDisplay(context.bakeLayer(ModelTheFoolDisplay.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TheFoolDisplayOVAEntity entity) {
		return new ResourceLocation("jojowos:textures/entities/thefoolova.png");
	}
}
