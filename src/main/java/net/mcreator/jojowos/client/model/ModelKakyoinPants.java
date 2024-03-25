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
public class ModelKakyoinPants<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("jojowos", "model_kakyoin_pants"), "main");
	public final ModelPart kakleft_leg;
	public final ModelPart kakright_leg;

	public ModelKakyoinPants(ModelPart root) {
		this.kakleft_leg = root.getChild("kakleft_leg");
		this.kakright_leg = root.getChild("kakright_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition kakleft_leg = partdefinition.addOrReplaceChild("kakleft_leg", CubeListBuilder.create().texOffs(50, 48).addBox(-2.0F, -0.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition right_leg_r1 = kakleft_leg.addOrReplaceChild("right_leg_r1", CubeListBuilder.create().texOffs(46, 60).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9224F, 1.9488F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition right_leg_r2 = kakleft_leg.addOrReplaceChild("right_leg_r2", CubeListBuilder.create().texOffs(26, 60).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9224F, 5.8464F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition right_leg_r3 = kakleft_leg.addOrReplaceChild("right_leg_r3", CubeListBuilder.create().texOffs(66, 56).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8762F, 8.7214F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition left_leg_r1 = kakleft_leg.addOrReplaceChild("left_leg_r1", CubeListBuilder.create().texOffs(0, 61).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9224F, 1.9488F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition left_leg_r2 = kakleft_leg.addOrReplaceChild("left_leg_r2", CubeListBuilder.create().texOffs(60, 60).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9224F, 5.8464F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition left_leg_r3 = kakleft_leg.addOrReplaceChild("left_leg_r3", CubeListBuilder.create().texOffs(66, 64).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8762F, 8.7214F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition left_leg_r4 = kakleft_leg.addOrReplaceChild("left_leg_r4", CubeListBuilder.create().texOffs(72, 49).addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.9488F, 1.9224F, 0.0873F, 0.0F, 0.0F));
		PartDefinition left_leg_r5 = kakleft_leg.addOrReplaceChild("left_leg_r5", CubeListBuilder.create().texOffs(68, 70).addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.8464F, 1.9224F, -0.0873F, 0.0F, 0.0F));
		PartDefinition left_leg_r6 = kakleft_leg.addOrReplaceChild("left_leg_r6", CubeListBuilder.create().texOffs(78, 72).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.7214F, 1.8762F, 0.1309F, 0.0F, 0.0F));
		PartDefinition left_leg_r7 = kakleft_leg.addOrReplaceChild("left_leg_r7", CubeListBuilder.create().texOffs(72, 54).addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.8464F, -1.9224F, 0.0873F, 0.0F, 0.0F));
		PartDefinition left_leg_r8 = kakleft_leg.addOrReplaceChild("left_leg_r8", CubeListBuilder.create().texOffs(80, 9).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.7214F, -1.8762F, -0.1309F, 0.0F, 0.0F));
		PartDefinition left_leg_r9 = kakleft_leg.addOrReplaceChild("left_leg_r9", CubeListBuilder.create().texOffs(72, 62).addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.9488F, -1.9224F, -0.0873F, 0.0F, 0.0F));
		PartDefinition kakright_leg = partdefinition.addOrReplaceChild("kakright_leg", CubeListBuilder.create().texOffs(50, 48).mirror().addBox(-2.0F, -0.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition left_leg_r10 = kakright_leg.addOrReplaceChild("left_leg_r10", CubeListBuilder.create().texOffs(46, 60).mirror().addBox(-0.5F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.9224F, 1.9488F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition left_leg_r11 = kakright_leg.addOrReplaceChild("left_leg_r11", CubeListBuilder.create().texOffs(26, 60).mirror().addBox(-0.5F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.9224F, 5.8464F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition left_leg_r12 = kakright_leg.addOrReplaceChild("left_leg_r12", CubeListBuilder.create().texOffs(66, 56).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.8762F, 8.7214F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition right_leg_r4 = kakright_leg.addOrReplaceChild("right_leg_r4", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(-0.5F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.9224F, 1.9488F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition right_leg_r5 = kakright_leg.addOrReplaceChild("right_leg_r5", CubeListBuilder.create().texOffs(60, 60).mirror().addBox(-0.5F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.9224F, 5.8464F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition right_leg_r6 = kakright_leg.addOrReplaceChild("right_leg_r6", CubeListBuilder.create().texOffs(66, 64).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.8762F, 8.7214F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition right_leg_r7 = kakright_leg.addOrReplaceChild("right_leg_r7", CubeListBuilder.create().texOffs(72, 49).mirror().addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.9488F, 1.9224F, 0.0873F, 0.0F, 0.0F));
		PartDefinition right_leg_r8 = kakright_leg.addOrReplaceChild("right_leg_r8", CubeListBuilder.create().texOffs(68, 70).mirror().addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.8464F, 1.9224F, -0.0873F, 0.0F, 0.0F));
		PartDefinition right_leg_r9 = kakright_leg.addOrReplaceChild("right_leg_r9", CubeListBuilder.create().texOffs(78, 72).mirror().addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 8.7214F, 1.8762F, 0.1309F, 0.0F, 0.0F));
		PartDefinition right_leg_r10 = kakright_leg.addOrReplaceChild("right_leg_r10", CubeListBuilder.create().texOffs(72, 54).mirror().addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.8464F, -1.9224F, 0.0873F, 0.0F, 0.0F));
		PartDefinition right_leg_r11 = kakright_leg.addOrReplaceChild("right_leg_r11", CubeListBuilder.create().texOffs(80, 9).mirror().addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 8.7214F, -1.8762F, -0.1309F, 0.0F, 0.0F));
		PartDefinition right_leg_r12 = kakright_leg.addOrReplaceChild("right_leg_r12", CubeListBuilder.create().texOffs(72, 62).mirror().addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.9488F, -1.9224F, -0.0873F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		kakleft_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		kakright_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
