package net.mcreator.jojowos.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelKakyoinEarrings<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("jojowos", "model_kakyoin_earrings"), "main");
	public final ModelPart kakhead;

	public ModelKakyoinEarrings(ModelPart root) {
		this.kakhead = root.getChild("kakhead");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition kakhead = partdefinition.addOrReplaceChild("kakhead", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition head_r1 = kakhead.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(24, 3).addBox(0.4821F, -2.0745F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.6009F, -0.8392F, -2.5577F, -1.4555F, -1.2548F, 1.8162F));
		PartDefinition head_r2 = kakhead.addOrReplaceChild("head_r2",
				CubeListBuilder.create().texOffs(6, 6).addBox(0.3214F, -0.367F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 74).addBox(-0.1786F, 0.633F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.6009F, -0.8392F, -2.5577F, -1.5286F, -0.5583F, 1.9035F));
		PartDefinition head_r3 = kakhead.addOrReplaceChild("head_r3",
				CubeListBuilder.create().texOffs(20, 74).addBox(-0.8214F, 0.633F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 22).addBox(-0.3214F, -0.367F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.6009F, -0.8392F, -2.5577F, -1.5286F, 0.5583F, -1.9035F));
		PartDefinition head_r4 = kakhead.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(20, 24).addBox(-0.4821F, -2.0745F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.6009F, -0.8392F, -2.5577F, -1.4555F, 1.2548F, -1.8162F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		kakhead.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
