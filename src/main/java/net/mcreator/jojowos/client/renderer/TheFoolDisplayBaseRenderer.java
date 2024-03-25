
package net.mcreator.jojowos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.jojowos.entity.TheFoolDisplayBaseEntity;
import net.mcreator.jojowos.client.model.ModelTheFoolDisplay;

public class TheFoolDisplayBaseRenderer extends MobRenderer<TheFoolDisplayBaseEntity, ModelTheFoolDisplay<TheFoolDisplayBaseEntity>> {
	public TheFoolDisplayBaseRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelTheFoolDisplay(context.bakeLayer(ModelTheFoolDisplay.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TheFoolDisplayBaseEntity entity) {
		return new ResourceLocation("jojowos:textures/entities/thefoolanime.png");
	}
}
