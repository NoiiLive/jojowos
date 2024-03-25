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
public class ModelJotaroKujoP3Pants<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("jojowos", "model_jotaro_kujo_p_3_pants"), "main");
	public final ModelPart body;
	public final ModelPart left_leg;
	public final ModelPart right_leg;

	public ModelJotaroKujoP3Pants(ModelPart root) {
		this.body = root.getChild("body");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(71, 47).addBox(-3.5F, 9.5512F, -2.5F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 14).addBox(-4.0F, 9.0512F, -2.3276F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(81, 6)
						.addBox(3.3276F, 9.0512F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(67, 34).addBox(-4.0F, 9.0512F, 1.3276F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 70)
						.addBox(-4.3276F, 9.0512F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(42, 30).addBox(-4.0F, 11.25F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(72, 64).addBox(-2.0F, -0.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition left_leg_r1 = left_leg.addOrReplaceChild("left_leg_r1", CubeListBuilder.create().texOffs(87, 78).addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0F, 2.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition left_leg_r2 = left_leg.addOrReplaceChild("left_leg_r2", CubeListBuilder.create().texOffs(87, 14).addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.8976F, 2.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition left_leg_r3 = left_leg.addOrReplaceChild("left_leg_r3", CubeListBuilder.create().texOffs(9, 95).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.7726F, 1.9538F, 0.1309F, 0.0F, 0.0F));
		PartDefinition left_leg_r4 = left_leg.addOrReplaceChild("left_leg_r4", CubeListBuilder.create().texOffs(95, 26).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.7726F, -1.9538F, -0.1309F, 0.0F, 0.0F));
		PartDefinition left_leg_r5 = left_leg.addOrReplaceChild("left_leg_r5", CubeListBuilder.create().texOffs(88, 0).addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.8976F, -2.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition left_leg_r6 = left_leg.addOrReplaceChild("left_leg_r6", CubeListBuilder.create().texOffs(52, 88).addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0F, -2.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition right_leg_r1 = left_leg.addOrReplaceChild("right_leg_r1", CubeListBuilder.create().texOffs(35, 77).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition right_leg_r2 = left_leg.addOrReplaceChild("right_leg_r2", CubeListBuilder.create().texOffs(73, 76).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 5.8976F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition right_leg_r3 = left_leg.addOrReplaceChild("right_leg_r3", CubeListBuilder.create().texOffs(18, 84).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9538F, 8.7726F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition left_leg_r7 = left_leg.addOrReplaceChild("left_leg_r7", CubeListBuilder.create().texOffs(84, 35).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9538F, 8.7726F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition left_leg_r8 = left_leg.addOrReplaceChild("left_leg_r8", CubeListBuilder.create().texOffs(78, 19).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 5.8976F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition left_leg_r9 = left_leg.addOrReplaceChild("left_leg_r9", CubeListBuilder.create().texOffs(7, 80).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 2.0F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(72, 64).mirror().addBox(-2.0F, -0.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition right_leg_r4 = right_leg.addOrReplaceChild("right_leg_r4", CubeListBuilder.create().texOffs(87, 78).mirror().addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 2.0F, 2.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition right_leg_r5 = right_leg.addOrReplaceChild("right_leg_r5", CubeListBuilder.create().texOffs(87, 14).mirror().addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.8976F, 2.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition right_leg_r6 = right_leg.addOrReplaceChild("right_leg_r6", CubeListBuilder.create().texOffs(9, 95).mirror().addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 8.7726F, 1.9538F, 0.1309F, 0.0F, 0.0F));
		PartDefinition right_leg_r7 = right_leg.addOrReplaceChild("right_leg_r7", CubeListBuilder.create().texOffs(95, 26).mirror().addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 8.7726F, -1.9538F, -0.1309F, 0.0F, 0.0F));
		PartDefinition right_leg_r8 = right_leg.addOrReplaceChild("right_leg_r8", CubeListBuilder.create().texOffs(88, 0).mirror().addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.8976F, -2.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition right_leg_r9 = right_leg.addOrReplaceChild("right_leg_r9", CubeListBuilder.create().texOffs(52, 88).mirror().addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 2.0F, -2.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition left_leg_r10 = right_leg.addOrReplaceChild("left_leg_r10", CubeListBuilder.create().texOffs(35, 77).mirror().addBox(-0.5F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0F, 2.0F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition left_leg_r11 = right_leg.addOrReplaceChild("left_leg_r11", CubeListBuilder.create().texOffs(73, 76).mirror().addBox(-0.5F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0F, 5.8976F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition left_leg_r12 = right_leg.addOrReplaceChild("left_leg_r12", CubeListBuilder.create().texOffs(18, 84).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.9538F, 8.7726F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition right_leg_r10 = right_leg.addOrReplaceChild("right_leg_r10", CubeListBuilder.create().texOffs(84, 35).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.9538F, 8.7726F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition right_leg_r11 = right_leg.addOrReplaceChild("right_leg_r11", CubeListBuilder.create().texOffs(78, 19).mirror().addBox(-0.5F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, 5.8976F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition right_leg_r12 = right_leg.addOrReplaceChild("right_leg_r12", CubeListBuilder.create().texOffs(7, 80).mirror().addBox(-0.5F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0873F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
