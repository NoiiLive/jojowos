
package net.mcreator.jojowos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.jojowos.entity.IggySittingEntity;
import net.mcreator.jojowos.client.model.ModelIggySit;

public class IggySittingRenderer extends MobRenderer<IggySittingEntity, ModelIggySit<IggySittingEntity>> {
	public IggySittingRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelIggySit(context.bakeLayer(ModelIggySit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(IggySittingEntity entity) {
		return new ResourceLocation("jojowos:textures/entities/iggysittexture.png");
	}
}
