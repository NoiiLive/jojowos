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
public class ModelPolnareffPants<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("jojowos", "model_polnareff_pants"), "main");
	public final ModelPart body;
	public final ModelPart left_leg;
	public final ModelPart right_leg;

	public ModelPolnareffPants(ModelPart root) {
		this.body = root.getChild("body");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 44).addBox(-4.0F, 11.25F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 64).addBox(3.5F, 10.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(56, 62)
						.addBox(-4.5F, 10.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(51, 32).addBox(-4.0F, 10.0F, -2.5F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(63, 19)
						.addBox(-2.0F, 9.9F, -2.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 62).addBox(1.0F, 9.9F, -2.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(51, 29)
						.addBox(-4.0F, 10.0F, 1.5F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition torso_r1 = body.addOrReplaceChild("torso_r1",
				CubeListBuilder.create().texOffs(16, 62).addBox(-1.0F, -1.5F, -2.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(23, 62).addBox(-0.4F, -2.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 11.75F, 0.5F, 0.0F, 0.0F, 0.2618F));
		PartDefinition torso_r2 = body.addOrReplaceChild("torso_r2",
				CubeListBuilder.create().texOffs(56, 62).addBox(-0.6F, -2.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 62).addBox(-1.0F, -1.5F, -2.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 11.75F, 0.5F, 0.0F, 0.0F, -0.2618F));
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 52).addBox(-2.0F, -0.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition left_leg_r1 = left_leg.addOrReplaceChild("left_leg_r1", CubeListBuilder.create().texOffs(32, 68).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.4507F, 2.1288F, 0.0873F, 0.0F, 0.0F));
		PartDefinition left_leg_r2 = left_leg.addOrReplaceChild("left_leg_r2", CubeListBuilder.create().texOffs(10, 68).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.854F, 2.1724F, -0.0873F, 0.0F, 0.0F));
		PartDefinition left_leg_r3 = left_leg.addOrReplaceChild("left_leg_r3", CubeListBuilder.create().texOffs(20, 44).addBox(-2.0F, 0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.9908F, 2.5107F, -0.4363F, 0.0F, 0.0F));
		PartDefinition left_leg_r4 = left_leg.addOrReplaceChild("left_leg_r4", CubeListBuilder.create().texOffs(36, 29).addBox(-2.0F, 0.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.7376F, 1.9957F, 0.1309F, 0.0F, 0.0F));
		PartDefinition left_leg_r5 = left_leg.addOrReplaceChild("left_leg_r5", CubeListBuilder.create().texOffs(6, 57).addBox(-2.0F, 0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.9908F, -2.5107F, 0.4363F, 0.0F, 0.0F));
		PartDefinition left_leg_r6 = left_leg.addOrReplaceChild("left_leg_r6", CubeListBuilder.create().texOffs(66, 57).addBox(-2.0F, 0.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.7376F, -1.9957F, -0.1309F, 0.0F, 0.0F));
		PartDefinition left_leg_r7 = left_leg.addOrReplaceChild("left_leg_r7", CubeListBuilder.create().texOffs(50, 68).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.854F, -2.1724F, 0.0873F, 0.0F, 0.0F));
		PartDefinition left_leg_r8 = left_leg.addOrReplaceChild("left_leg_r8", CubeListBuilder.create().texOffs(68, 34).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.4507F, -2.1288F, -0.0873F, 0.0F, 0.0F));
		PartDefinition right_leg_r1 = left_leg.addOrReplaceChild("right_leg_r1", CubeListBuilder.create().texOffs(0, 57).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1288F, 1.4507F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition right_leg_r2 = left_leg.addOrReplaceChild("right_leg_r2", CubeListBuilder.create().texOffs(44, 56).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1724F, 3.854F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition right_leg_r3 = left_leg.addOrReplaceChild("right_leg_r3", CubeListBuilder.create().texOffs(22, 64).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1262F, 6.729F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition right_leg_r4 = left_leg.addOrReplaceChild("right_leg_r4", CubeListBuilder.create().texOffs(62, 64).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.088F, 7.8971F, 0.0F, 0.0F, 0.0F, -0.4363F));
		PartDefinition left_leg_r9 = left_leg.addOrReplaceChild("left_leg_r9", CubeListBuilder.create().texOffs(28, 58).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.1288F, 1.4507F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition left_leg_r10 = left_leg.addOrReplaceChild("left_leg_r10", CubeListBuilder.create().texOffs(58, 35).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.1724F, 3.854F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition left_leg_r11 = left_leg.addOrReplaceChild("left_leg_r11", CubeListBuilder.create().texOffs(64, 38).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.1262F, 6.729F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition left_leg_r12 = left_leg.addOrReplaceChild("left_leg_r12", CubeListBuilder.create().texOffs(65, 2).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.088F, 7.8971F, 0.0F, 0.0F, 0.0F, 0.4363F));
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(-2.0F, -0.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition right_leg_r5 = right_leg.addOrReplaceChild("right_leg_r5", CubeListBuilder.create().texOffs(32, 68).mirror().addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.4507F, 2.1288F, 0.0873F, 0.0F, 0.0F));
		PartDefinition right_leg_r6 = right_leg.addOrReplaceChild("right_leg_r6", CubeListBuilder.create().texOffs(10, 68).mirror().addBox(-2.0F, -1.0F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.854F, 2.1724F, -0.0873F, 0.0F, 0.0F));
		PartDefinition right_leg_r7 = right_leg.addOrReplaceChild("right_leg_r7", CubeListBuilder.create().texOffs(20, 44).mirror().addBox(-2.0F, 0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.9908F, 2.5107F, -0.4363F, 0.0F, 0.0F));
		PartDefinition right_leg_r8 = right_leg.addOrReplaceChild("right_leg_r8", CubeListBuilder.create().texOffs(36, 29).mirror().addBox(-2.0F, 0.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.7376F, 1.9957F, 0.1309F, 0.0F, 0.0F));
		PartDefinition right_leg_r9 = right_leg.addOrReplaceChild("right_leg_r9", CubeListBuilder.create().texOffs(6, 57).mirror().addBox(-2.0F, 0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.9908F, -2.5107F, 0.4363F, 0.0F, 0.0F));
		PartDefinition right_leg_r10 = right_leg.addOrReplaceChild("right_leg_r10", CubeListBuilder.create().texOffs(66, 57).mirror().addBox(-2.0F, 0.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.7376F, -1.9957F, -0.1309F, 0.0F, 0.0F));
		PartDefinition right_leg_r11 = right_leg.addOrReplaceChild("right_leg_r11", CubeListBuilder.create().texOffs(50, 68).mirror().addBox(-2.0F, -1.0F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.854F, -2.1724F, 0.0873F, 0.0F, 0.0F));
		PartDefinition right_leg_r12 = right_leg.addOrReplaceChild("right_leg_r12", CubeListBuilder.create().texOffs(68, 34).mirror().addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.4507F, -2.1288F, -0.0873F, 0.0F, 0.0F));
		PartDefinition left_leg_r13 = right_leg.addOrReplaceChild("left_leg_r13", CubeListBuilder.create().texOffs(0, 57).mirror().addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.1288F, 1.4507F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition left_leg_r14 = right_leg.addOrReplaceChild("left_leg_r14", CubeListBuilder.create().texOffs(44, 56).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.1724F, 3.854F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition left_leg_r15 = right_leg.addOrReplaceChild("left_leg_r15", CubeListBuilder.create().texOffs(22, 64).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.1262F, 6.729F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition left_leg_r16 = right_leg.addOrReplaceChild("left_leg_r16", CubeListBuilder.create().texOffs(62, 64).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.088F, 7.8971F, 0.0F, 0.0F, 0.0F, 0.4363F));
		PartDefinition right_leg_r13 = right_leg.addOrReplaceChild("right_leg_r13", CubeListBuilder.create().texOffs(28, 58).mirror().addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.1288F, 1.4507F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition right_leg_r14 = right_leg.addOrReplaceChild("right_leg_r14", CubeListBuilder.create().texOffs(58, 35).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.1724F, 3.854F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition right_leg_r15 = right_leg.addOrReplaceChild("right_leg_r15", CubeListBuilder.create().texOffs(64, 38).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.1262F, 6.729F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition right_leg_r16 = right_leg.addOrReplaceChild("right_leg_r16", CubeListBuilder.create().texOffs(65, 2).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.088F, 7.8971F, 0.0F, 0.0F, 0.0F, -0.4363F));
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
