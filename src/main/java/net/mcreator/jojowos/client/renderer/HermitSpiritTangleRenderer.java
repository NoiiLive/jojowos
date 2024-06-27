
package net.mcreator.jojowos.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.jojowos.entity.model.HermitSpiritTangleModel;
import net.mcreator.jojowos.entity.layer.HermitSpiritTangleLayer;
import net.mcreator.jojowos.entity.HermitSpiritTangleEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class HermitSpiritTangleRenderer extends GeoEntityRenderer<HermitSpiritTangleEntity> {
	public HermitSpiritTangleRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new HermitSpiritTangleModel());
		this.shadowRadius = 0.1f;
		this.addRenderLayer(new HermitSpiritTangleLayer(this));
	}

	@Override
	public RenderType getRenderType(HermitSpiritTangleEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, HermitSpiritTangleEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
