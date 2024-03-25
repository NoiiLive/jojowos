
package net.mcreator.jojowos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.jojowos.entity.HermitPurpleDisplayBaseEntity;
import net.mcreator.jojowos.client.model.ModelHermitPurpleDisplay;

public class HermitPurpleDisplayBaseRenderer extends MobRenderer<HermitPurpleDisplayBaseEntity, ModelHermitPurpleDisplay<HermitPurpleDisplayBaseEntity>> {
	public HermitPurpleDisplayBaseRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelHermitPurpleDisplay(context.bakeLayer(ModelHermitPurpleDisplay.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HermitPurpleDisplayBaseEntity entity) {
		return new ResourceLocation("jojowos:textures/entities/hermitpurple.png");
	}
}
