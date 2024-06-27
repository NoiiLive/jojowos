
package net.mcreator.jojowos.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.jojowos.entity.LifeDetectorEntity;
import net.mcreator.jojowos.client.model.ModelLifeDetector;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class LifeDetectorRenderer extends MobRenderer<LifeDetectorEntity, ModelLifeDetector<LifeDetectorEntity>> {
	public LifeDetectorRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelLifeDetector(context.bakeLayer(ModelLifeDetector.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<LifeDetectorEntity, ModelLifeDetector<LifeDetectorEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("jojowos:textures/entities/lifedetectortexture_e.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, LifeDetectorEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(LifeDetectorEntity entity) {
		return new ResourceLocation("jojowos:textures/entities/lifedetectortexture.png");
	}
}
