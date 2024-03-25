
package net.mcreator.jojowos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.jojowos.entity.EmeraldBarrierEntity;

public class EmeraldBarrierRenderer extends HumanoidMobRenderer<EmeraldBarrierEntity, HumanoidModel<EmeraldBarrierEntity>> {
	public EmeraldBarrierRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(EmeraldBarrierEntity entity) {
		return new ResourceLocation("jojowos:textures/entities/zzzamn.png");
	}

	@Override
	protected boolean isBodyVisible(EmeraldBarrierEntity entity) {
		return false;
	}
}
