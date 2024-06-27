
package net.mcreator.jojowos.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.jojowos.entity.model.TheWorldShadowModel;
import net.mcreator.jojowos.entity.layer.TheWorldShadowLayer;
import net.mcreator.jojowos.entity.TheWorldShadowEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class TheWorldShadowRenderer extends GeoEntityRenderer<TheWorldShadowEntity> {
	public TheWorldShadowRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new TheWorldShadowModel());
		this.shadowRadius = 0f;
		this.addRenderLayer(new TheWorldShadowLayer(this));
	}

	@Override
	public RenderType getRenderType(TheWorldShadowEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, TheWorldShadowEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
