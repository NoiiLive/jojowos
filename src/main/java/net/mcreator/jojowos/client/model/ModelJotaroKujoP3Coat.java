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
public class ModelJotaroKujoP3Coat<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("jojowos", "model_jotaro_kujo_p_3_coat"), "main");
	public final ModelPart torso;
	public final ModelPart left_arm;
	public final ModelPart right_arm;

	public ModelJotaroKujoP3Coat(ModelPart root) {
		this.torso = root.getChild("torso");
		this.left_arm = root.getChild("left_arm");
		this.right_arm = root.getChild("right_arm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition torso = partdefinition.addOrReplaceChild("torso",
				CubeListBuilder.create().texOffs(21, 44).addBox(-4.0038F, -0.5871F, -3.749F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 44).addBox(2.0038F, -0.5871F, -3.749F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(13, 49)
						.addBox(-2.0F, -0.25F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(13, 44).addBox(-2.4962F, -0.5871F, 0.501F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(13, 67)
						.addBox(-2.0F, 1.0F, -2.25F, 4.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.0F, 0.0F));
		PartDefinition head_r1 = torso.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(63, 30).addBox(-4.5F, -2.0F, -1.0F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5F, 4.25F, -0.0873F, 0.0F, 0.0F));
		PartDefinition torso_r1 = torso.addOrReplaceChild("torso_r1",
				CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, -3.0F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 44).addBox(-7.0F, -3.0F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 3.0465F, -2.3809F, 0.0436F, 0.0F, 0.0F));
		PartDefinition torso_r2 = torso.addOrReplaceChild("torso_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 9).addBox(-7.0F, 0.0F, -0.5F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 6.0F, -2.25F, -0.0436F, 0.0F, 0.0F));
		PartDefinition torso_r3 = torso.addOrReplaceChild("torso_r3", CubeListBuilder.create().texOffs(50, 71).addBox(0.0F, -5.8F, -1.0F, 1.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.001F, 6.0631F, -2.9961F, 0.1734F, -0.0084F, -0.0054F));
		PartDefinition torso_r4 = torso.addOrReplaceChild("torso_r4", CubeListBuilder.create().texOffs(57, 73).addBox(-1.0F, -5.8F, -1.0F, 1.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.001F, 6.0631F, -2.9961F, 0.1734F, 0.0084F, 0.0054F));
		PartDefinition torso_r5 = torso.addOrReplaceChild("torso_r5", CubeListBuilder.create().texOffs(25, 17).addBox(-4.5F, -3.0F, -0.5F, 9.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.0465F, 2.3809F, -0.0436F, 0.0F, 0.0F));
		PartDefinition torso_r6 = torso.addOrReplaceChild("torso_r6", CubeListBuilder.create().texOffs(42, 52).addBox(-8.0F, 0.0F, -0.5F, 9.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5F, 6.0F, 2.25F, 0.0436F, 0.0F, 0.0F));
		PartDefinition torso_r7 = torso.addOrReplaceChild("torso_r7", CubeListBuilder.create().texOffs(63, 47).addBox(-0.5F, -3.0F, -2.5F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1309F, 3.0465F, 0.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition torso_r8 = torso.addOrReplaceChild("torso_r8", CubeListBuilder.create().texOffs(24, 63).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 6.0F, -0.5F, 0.0F, 0.0F, 0.0436F));
		PartDefinition torso_r9 = torso.addOrReplaceChild("torso_r9", CubeListBuilder.create().texOffs(37, 65).addBox(-0.5F, -3.0F, -2.5F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1309F, 3.0465F, 0.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition torso_r10 = torso.addOrReplaceChild("torso_r10", CubeListBuilder.create().texOffs(64, 68).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 6.0F, -0.5F, 0.0F, 0.0F, -0.0436F));
		PartDefinition torso_r11 = torso.addOrReplaceChild("torso_r11", CubeListBuilder.create().texOffs(34, 49).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.25F, 2.5F, -2.5F, 0.0F, 0.0F, -0.6109F));
		PartDefinition torso_r12 = torso.addOrReplaceChild("torso_r12", CubeListBuilder.create().texOffs(45, 41).addBox(0.0F, -2.0F, -4.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5F, 0.5001F, 0.251F, 0.0F, 0.0F, -0.0873F));
		PartDefinition torso_r13 = torso.addOrReplaceChild("torso_r13", CubeListBuilder.create().texOffs(49, 9).addBox(-1.0F, -2.0F, -4.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5F, 0.5001F, 0.251F, 0.0F, 0.0F, 0.0873F));
		PartDefinition chain = torso.addOrReplaceChild("chain", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5538F, 0.9629F, -3.699F, 0.0F, 0.0F, -0.2182F));
		PartDefinition torso_r14 = chain.addOrReplaceChild("torso_r14", CubeListBuilder.create().texOffs(42, 77).addBox(1.9784F, -1.0628F, -0.5748F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3546F, 4.1757F, -0.25F, 2.2689F, 0.0F, -1.5708F));
		PartDefinition torso_r15 = chain.addOrReplaceChild("torso_r15", CubeListBuilder.create().texOffs(77, 70).addBox(-1.0466F, -1.0855F, -0.4773F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3546F, -0.0743F, -0.25F, 0.1683F, -0.1711F, -0.8605F));
		PartDefinition torso_r16 = chain.addOrReplaceChild("torso_r16", CubeListBuilder.create().texOffs(69, 64).addBox(-0.9624F, -0.9318F, -0.5628F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3546F, 2.6757F, -0.25F, 0.5355F, -0.4718F, -0.9171F));
		PartDefinition lowerchain = chain.addOrReplaceChild("lowerchain", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4052F, 3.017F, -0.25F, 0.0F, 0.0F, 0.2182F));
		PartDefinition torso_r17 = lowerchain.addOrReplaceChild("torso_r17", CubeListBuilder.create().texOffs(25, 4).addBox(-0.9458F, -0.9458F, -0.5643F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0506F, 2.6587F, 0.0F, 0.5355F, -0.4718F, -0.9171F));
		PartDefinition torso_r18 = lowerchain.addOrReplaceChild("torso_r18", CubeListBuilder.create().texOffs(21, 27).addBox(2.0F, -1.0643F, -0.5766F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0506F, 4.1587F, 0.0F, 2.2689F, 0.0F, -1.5708F));
		PartDefinition leftflap = torso.addOrReplaceChild("leftflap", CubeListBuilder.create(), PartPose.offset(4.2975F, 12.0094F, 0.0F));
		PartDefinition torso_r19 = leftflap.addOrReplaceChild("torso_r19", CubeListBuilder.create().texOffs(75, 96).addBox(-0.5002F, -3.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4127F, 2.504F, 2.2978F, 0.1745F, 0.0F, -0.1745F));
		PartDefinition torso_r20 = leftflap.addOrReplaceChild("torso_r20", CubeListBuilder.create().texOffs(0, 62).addBox(-0.5F, -3.35F, -2.0F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.478F, 2.8743F, -0.5F, 0.0F, 0.0F, -0.1745F));
		PartDefinition torso_r21 = leftflap.addOrReplaceChild("torso_r21", CubeListBuilder.create().texOffs(70, 95).addBox(-0.5002F, -3.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4127F, 2.504F, -2.2978F, -0.1745F, 0.0F, -0.1745F));
		PartDefinition rightflap = torso.addOrReplaceChild("rightflap", CubeListBuilder.create(), PartPose.offset(-4.2975F, 12.0094F, 0.0F));
		PartDefinition torso_r22 = rightflap.addOrReplaceChild("torso_r22", CubeListBuilder.create().texOffs(56, 94).addBox(-0.4998F, -3.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4127F, 2.504F, 2.2978F, 0.1745F, 0.0F, 0.1745F));
		PartDefinition torso_r23 = rightflap.addOrReplaceChild("torso_r23", CubeListBuilder.create().texOffs(56, 60).addBox(-0.5F, -3.35F, -2.0F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.478F, 2.8743F, -0.5F, 0.0F, 0.0F, 0.1745F));
		PartDefinition torso_r24 = rightflap.addOrReplaceChild("torso_r24", CubeListBuilder.create().texOffs(81, 94).addBox(-0.4998F, -3.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4127F, 2.504F, -2.2978F, -0.1745F, 0.0F, 0.1745F));
		PartDefinition backflap = torso.addOrReplaceChild("backflap", CubeListBuilder.create(), PartPose.offset(0.0F, 12.0076F, 2.5516F));
		PartDefinition torso_r25 = backflap.addOrReplaceChild("torso_r25", CubeListBuilder.create().texOffs(38, 95).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.3234F, 2.5032F, 0.4132F, 0.1745F, 0.0F, 0.1745F));
		PartDefinition torso_r26 = backflap.addOrReplaceChild("torso_r26", CubeListBuilder.create().texOffs(50, 0).addBox(-5.0F, -3.35F, -0.5F, 9.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 2.8761F, 0.474F, 0.1745F, 0.0F, 0.0F));
		PartDefinition torso_r27 = backflap.addOrReplaceChild("torso_r27", CubeListBuilder.create().texOffs(20, 97).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.3234F, 2.5032F, 0.4132F, 0.1745F, 0.0F, -0.1745F));
		PartDefinition frontleftflap = torso.addOrReplaceChild("frontleftflap", CubeListBuilder.create(), PartPose.offset(3.5709F, 11.8849F, -2.5468F));
		PartDefinition torso_r28 = frontleftflap.addOrReplaceChild("torso_r28", CubeListBuilder.create().texOffs(63, 88).addBox(-1.0F, -3.1F, -0.5F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0694F, 2.8576F, -0.2154F, -0.0866F, -0.0076F, -0.1744F));
		PartDefinition frontrightflap = torso.addOrReplaceChild("frontrightflap", CubeListBuilder.create(), PartPose.offset(-3.5709F, 11.8849F, -2.5468F));
		PartDefinition torso_r29 = frontrightflap.addOrReplaceChild("torso_r29", CubeListBuilder.create().texOffs(74, 87).addBox(-1.0F, -3.1F, -0.5F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0694F, 2.8576F, -0.2154F, -0.0866F, 0.0076F, 0.1744F));
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(60, 14).addBox(2.55F, 7.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 49)
				.addBox(2.65F, 5.75F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(71, 0).addBox(-1.0F, -2.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 14.0F, 0.0F));
		PartDefinition left_arm_r1 = left_arm.addOrReplaceChild("left_arm_r1", CubeListBuilder.create().texOffs(91, 47).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -1.0F, 2.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition left_arm_r2 = left_arm.addOrReplaceChild("left_arm_r2", CubeListBuilder.create().texOffs(25, 0).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.8524F, 2.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition left_arm_r3 = left_arm.addOrReplaceChild("left_arm_r3", CubeListBuilder.create().texOffs(45, 65).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 3.2293F, 2.0026F, 0.0873F, 0.0F, 0.0F));
		PartDefinition left_arm_r4 = left_arm.addOrReplaceChild("left_arm_r4", CubeListBuilder.create().texOffs(85, 62).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 6.1019F, 1.9399F, -0.1309F, 0.0F, 0.0F));
		PartDefinition left_arm_r5 = left_arm.addOrReplaceChild("left_arm_r5", CubeListBuilder.create().texOffs(94, 58).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -1.0F, -2.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition left_arm_r6 = left_arm.addOrReplaceChild("left_arm_r6", CubeListBuilder.create().texOffs(91, 74).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.8524F, -2.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition left_arm_r7 = left_arm.addOrReplaceChild("left_arm_r7", CubeListBuilder.create().texOffs(88, 42).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 3.2293F, -2.0026F, -0.0873F, 0.0F, 0.0F));
		PartDefinition left_arm_r8 = left_arm.addOrReplaceChild("left_arm_r8", CubeListBuilder.create().texOffs(29, 86).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 6.1019F, -1.9399F, 0.1309F, 0.0F, 0.0F));
		PartDefinition right_arm_r1 = left_arm.addOrReplaceChild("right_arm_r1", CubeListBuilder.create().texOffs(80, 81).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition right_arm_r2 = left_arm.addOrReplaceChild("right_arm_r2", CubeListBuilder.create().texOffs(64, 81).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.8524F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition right_arm_r3 = left_arm.addOrReplaceChild("right_arm_r3", CubeListBuilder.create().texOffs(76, 51).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0026F, 3.2293F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition right_arm_r4 = left_arm.addOrReplaceChild("right_arm_r4", CubeListBuilder.create().texOffs(0, 75).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0026F, 6.1307F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition left_arm_r9 = left_arm.addOrReplaceChild("left_arm_r9", CubeListBuilder.create().texOffs(42, 82).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition left_arm_r10 = left_arm.addOrReplaceChild("left_arm_r10", CubeListBuilder.create().texOffs(83, 55).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 0.8524F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition left_arm_r11 = left_arm.addOrReplaceChild("left_arm_r11", CubeListBuilder.create().texOffs(77, 39).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0026F, 3.2293F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition left_arm_r12 = left_arm.addOrReplaceChild("left_arm_r12", CubeListBuilder.create().texOffs(24, 75).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0026F, 6.1307F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm",
				CubeListBuilder.create().texOffs(60, 14).mirror().addBox(-3.55F, 7.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(24, 49).mirror()
						.addBox(-3.65F, 5.75F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(71, 0).mirror().addBox(-3.0F, -2.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-5.0F, 14.0F, 0.0F));
		PartDefinition right_arm_r5 = right_arm.addOrReplaceChild("right_arm_r5", CubeListBuilder.create().texOffs(91, 47).mirror().addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, -1.0F, 2.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition right_arm_r6 = right_arm.addOrReplaceChild("right_arm_r6", CubeListBuilder.create().texOffs(25, 0).mirror().addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 0.8524F, 2.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition right_arm_r7 = right_arm.addOrReplaceChild("right_arm_r7", CubeListBuilder.create().texOffs(45, 65).mirror().addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 3.2293F, 2.0026F, 0.0873F, 0.0F, 0.0F));
		PartDefinition right_arm_r8 = right_arm.addOrReplaceChild("right_arm_r8", CubeListBuilder.create().texOffs(85, 62).mirror().addBox(-2.0F, -1.5F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 6.1019F, 1.9399F, -0.1309F, 0.0F, 0.0F));
		PartDefinition right_arm_r9 = right_arm.addOrReplaceChild("right_arm_r9", CubeListBuilder.create().texOffs(94, 58).mirror().addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, -1.0F, -2.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition right_arm_r10 = right_arm.addOrReplaceChild("right_arm_r10", CubeListBuilder.create().texOffs(91, 74).mirror().addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 0.8524F, -2.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition right_arm_r11 = right_arm.addOrReplaceChild("right_arm_r11", CubeListBuilder.create().texOffs(88, 42).mirror().addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 3.2293F, -2.0026F, -0.0873F, 0.0F, 0.0F));
		PartDefinition right_arm_r12 = right_arm.addOrReplaceChild("right_arm_r12", CubeListBuilder.create().texOffs(29, 86).mirror().addBox(-2.0F, -1.5F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 6.1019F, -1.9399F, 0.1309F, 0.0F, 0.0F));
		PartDefinition left_arm_r13 = right_arm.addOrReplaceChild("left_arm_r13", CubeListBuilder.create().texOffs(80, 81).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition left_arm_r14 = right_arm.addOrReplaceChild("left_arm_r14", CubeListBuilder.create().texOffs(64, 81).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, 0.8524F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition left_arm_r15 = right_arm.addOrReplaceChild("left_arm_r15", CubeListBuilder.create().texOffs(76, 51).mirror().addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0026F, 3.2293F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition left_arm_r16 = right_arm.addOrReplaceChild("left_arm_r16", CubeListBuilder.create().texOffs(0, 75).mirror().addBox(-0.5F, -1.5F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0026F, 6.1307F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition right_arm_r13 = right_arm.addOrReplaceChild("right_arm_r13", CubeListBuilder.create().texOffs(42, 82).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition right_arm_r14 = right_arm.addOrReplaceChild("right_arm_r14", CubeListBuilder.create().texOffs(83, 55).mirror().addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.0F, 0.8524F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition right_arm_r15 = right_arm.addOrReplaceChild("right_arm_r15", CubeListBuilder.create().texOffs(77, 39).mirror().addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.0026F, 3.2293F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition right_arm_r16 = right_arm.addOrReplaceChild("right_arm_r16", CubeListBuilder.create().texOffs(24, 75).mirror().addBox(-0.5F, -1.5F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.0026F, 6.1307F, 0.0F, 0.0F, 0.0F, -0.0873F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
