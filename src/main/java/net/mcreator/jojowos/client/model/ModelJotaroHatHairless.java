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

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelJotaroHatHairless<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("jojowos", "model_jotaro_hat_hairless"), "main");
	public final ModelPart head;

	public ModelJotaroHatHairless(ModelPart root) {
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 17).addBox(-4.0F, -9.25F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(38, 17).addBox(3.5F, -9.0F, -4.0F, 1.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(34, 36)
						.addBox(-4.5F, -9.0F, -4.0F, 1.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(64, 59).addBox(-4.0F, -9.0F, -4.5F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(49, 20)
						.addBox(1.25F, -8.5F, -4.6F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(45, 36).addBox(-4.0F, -6.0F, -7.0F, 8.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(45, 41).addBox(-1.3F, -0.25F, -0.5F, 1.5F, 1.5F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.05F, -7.9F, -4.1F, 0.0F, 0.0F, -0.7854F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
