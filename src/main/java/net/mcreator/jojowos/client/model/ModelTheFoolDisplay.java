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

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelTheFoolDisplay<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("jojowos", "model_the_fool_display"), "main");
	public final ModelPart body;

	public ModelTheFoolDisplay(ModelPart root) {
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 11.5F, 6.0F));
		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(51, 52).addBox(-5.6556F, -6.0771F, -8.0F, 9.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(67, 88).addBox(-3.1556F, 2.9229F, -10.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(98, 0)
						.addBox(-1.6556F, 2.4229F, -9.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 97).addBox(-2.9056F, 2.4229F, -9.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 98)
						.addBox(-0.4056F, 2.4229F, -9.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(89, 97).addBox(-0.4056F, 0.4229F, -9.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(97, 88)
						.addBox(-1.6556F, 0.4229F, -9.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 97).addBox(-2.9056F, 0.4229F, -9.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 91)
						.addBox(-3.1556F, -4.0771F, -10.0F, 4.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(82, 63).addBox(2.8444F, -2.0771F, -8.5F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(0.3444F, -1.0771F, -8.499F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(9, 14).addBox(-0.9056F, -2.0771F, -8.501F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 14).mirror()
						.addBox(-5.6556F, -1.0771F, -8.499F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(9, 14).mirror().addBox(-3.4056F, -2.0771F, -8.501F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(82, 63).mirror().addBox(-6.1556F, -2.0771F, -8.5F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(1.1556F, -6.1729F, -7.0F));
		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(66, 71).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.3112F, -2.0F, -8.0F, 0.0F, 0.0F, -1.2217F));
		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(78, 42).mirror().addBox(-2.0F, -0.5F, -0.499F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.1196F, -2.4009F, -8.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(66, 71).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, -8.0F, 0.0F, 0.0F, 1.2217F));
		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(50, 94).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4243F, -0.889F, -8.0F, 0.0F, 0.0F, -1.2217F));
		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(78, 42).addBox(-1.0F, -0.5F, -0.499F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8085F, -2.4009F, -8.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition cube_r6 = head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(94, 52).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8869F, -0.889F, -8.0F, 0.0F, 0.0F, 1.2217F));
		PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(59, 40).addBox(-3.5F, -1.4F, -3.0F, 7.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1556F, 2.7773F, -1.6431F, -0.1745F, 0.0F, 0.0F));
		PartDefinition feather1 = head.addOrReplaceChild("feather1", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1556F, -6.8462F, -2.8163F, -0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r8 = feather1.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 83).addBox(-1.5F, -0.5761F, 0.3827F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.4832F, -0.6409F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r9 = feather1.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(11, 83).addBox(-1.5F, 1.999F, 0.0436F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.9809F, -1.1837F, 0.2182F, 0.0F, 0.0F));
		PartDefinition feather2 = head.addOrReplaceChild("feather2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8444F, -7.116F, -3.1866F, 0.0F, 0.0F, 0.48F));
		PartDefinition cube_r10 = feather2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(75, 0).addBox(-1.0383F, -0.6206F, 0.1158F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0607F, -5.5954F, -0.2707F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r11 = feather2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(82, 20).addBox(-1.0383F, 1.866F, -0.192F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0607F, -4.093F, -0.8134F, 0.2182F, 0.0F, 0.0F));
		PartDefinition feather3 = head.addOrReplaceChild("feather3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.1556F, -7.116F, -3.1866F, 0.0F, 0.0F, -0.48F));
		PartDefinition cube_r12 = feather3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(42, 30).addBox(-1.9617F, -0.6206F, 0.1158F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0607F, -5.5954F, -0.2707F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r13 = feather3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(42, 35).addBox(-1.9617F, 1.866F, -0.192F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0607F, -4.093F, -0.8134F, 0.2182F, 0.0F, 0.0F));
		PartDefinition feather4 = head.addOrReplaceChild("feather4", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0944F, -4.866F, -3.1866F, -0.2502F, -0.0779F, 1.2752F));
		PartDefinition cube_r14 = feather4.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(44, 60).addBox(-0.5761F, -1.1206F, 0.05F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1981F, -5.2515F, -0.2707F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r15 = feather4.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(59, 71).addBox(-0.5761F, 1.3736F, -0.0828F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1981F, -3.7492F, -0.8134F, 0.2182F, 0.0F, 0.0F));
		PartDefinition feather5 = head.addOrReplaceChild("feather5", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.4056F, -4.866F, -3.1866F, -0.2502F, 0.0779F, -1.2752F));
		PartDefinition cube_r16 = feather5.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(44, 60).mirror().addBox(-2.4239F, -1.1206F, 0.05F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1981F, -5.2515F, -0.2707F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r17 = feather5.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(59, 71).mirror().addBox(-2.4239F, 1.3736F, -0.0828F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1981F, -3.7492F, -0.8134F, 0.2182F, 0.0F, 0.0F));
		PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create(), PartPose.offset(-0.5F, -8.0F, 1.0F));
		PartDefinition cube_r18 = torso.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(80, 40).addBox(0.0F, -5.0F, 8.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 30)
				.addBox(0.0F, -6.0F, -1.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-6.5F, -5.0F, -9.0F, 14.0F, 12.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r19 = torso.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(82, 20).addBox(-0.499F, -0.5F, -3.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -5.0955F, -2.4212F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r20 = torso.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(-3.0F, -1.0F, -3.5F, 6.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.25F, 7.3205F, -6.0251F, -1.6482F, 1.2931F, -1.8663F));
		PartDefinition cube_r21 = torso.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 100).addBox(-3.0F, -1.0F, -3.5F, 6.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.25F, 7.3205F, -6.0251F, -1.6482F, -1.2931F, 1.8663F));
		PartDefinition cube_r22 = torso.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(32, 91).addBox(3.5F, -4.5F, -1.85F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4939F, 11.5089F, 12.4734F, -0.53F, -0.711F, 0.3655F));
		PartDefinition cube_r23 = torso.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(93, 60).addBox(-4.5F, -4.5F, -1.85F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 60).addBox(-4.5F, -4.5F, -1.5F, 6.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5061F, 11.5089F, 12.4734F, -0.53F, 0.711F, -0.3655F));
		PartDefinition cube_r24 = torso.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(55, 22).addBox(-4.5F, -7.0F, -4.5F, 9.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 13.1953F, 10.0058F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r25 = torso.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(67, 0).addBox(-0.499F, -1.25F, -4.25F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 4.4755F, 9.7781F, -0.9163F, 0.0F, 0.0F));
		PartDefinition cube_r26 = torso.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 30).addBox(-6.0F, -6.0F, -8.5F, 12.0F, 12.0F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 4.6741F, 1.3232F, -0.6109F, 0.0F, 0.0F));
		PartDefinition right_upper_arm = body.addOrReplaceChild("right_upper_arm", CubeListBuilder.create(), PartPose.offsetAndRotation(6.0F, -5.0F, -5.5F, 0.0F, 0.1309F, 0.0F));
		PartDefinition cube_r27 = right_upper_arm.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 60).addBox(-2.1304F, -4.032F, -3.2858F, 5.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.1309F));
		PartDefinition right_arm = right_upper_arm.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offsetAndRotation(2.75F, 1.0F, 0.0F, 0.0037F, 0.049F, -0.0911F));
		PartDefinition cube_r28 = right_arm.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(55, 94).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6427F, 3.0631F, -1.2871F, -1.825F, -0.304F, -2.846F));
		PartDefinition cube_r29 = right_arm.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(93, 4).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7508F, 3.7695F, -0.9606F, -2.2177F, -0.304F, -2.846F));
		PartDefinition cube_r30 = right_arm.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(11, 88).addBox(-0.5006F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9164F, 4.4085F, -0.4472F, -2.2686F, -0.1128F, -2.6021F));
		PartDefinition cube_r31 = right_arm.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 88).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0689F, 4.7901F, 0.1282F, -2.7922F, -0.1128F, -2.6021F));
		PartDefinition cube_r32 = right_arm.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(86, 60).addBox(0.4291F, -0.518F, 0.1596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1493F, 5.3548F, 1.4005F, 3.011F, -0.1128F, -2.6021F));
		PartDefinition cube_r33 = right_arm.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(47, 86).addBox(0.1195F, -0.518F, -0.0975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1493F, 5.3548F, 1.4005F, 2.9752F, -0.6742F, -2.5124F));
		PartDefinition cube_r34 = right_arm.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(38, 76).addBox(0.0381F, -0.518F, -0.5696F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1493F, 5.3548F, 1.4005F, 2.8251F, -1.142F, -2.3274F));
		PartDefinition cube_r35 = right_arm.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(26, 60).addBox(0.1501F, -0.5178F, -0.7187F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1493F, 5.3548F, 1.4005F, 0.381F, -1.2153F, 0.1655F));
		PartDefinition cube_r36 = right_arm.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(46, 5).addBox(0.3554F, -0.518F, -1.0473F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1493F, 5.3548F, 1.4005F, 0.1712F, -0.708F, 0.4128F));
		PartDefinition cube_r37 = right_arm.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(60, 94).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5838F, -0.1461F, -0.2123F, 1.418F, -0.4065F, 2.3929F));
		PartDefinition cube_r38 = right_arm.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(94, 78).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0049F, 0.4635F, -0.0436F, 1.2578F, -0.304F, 2.846F));
		PartDefinition cube_r39 = right_arm.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(94, 81).addBox(-0.5062F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.2962F, 1.2598F, 0.1052F, 1.5196F, -0.304F, 2.846F));
		PartDefinition cube_r40 = right_arm.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(83, 94).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5143F, 2.0631F, 0.0243F, 1.825F, -0.304F, 2.846F));
		PartDefinition cube_r41 = right_arm.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(88, 94).addBox(-0.5004F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6224F, 2.7695F, -0.3021F, 2.2177F, -0.304F, 2.846F));
		PartDefinition cube_r42 = right_arm.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(93, 94).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.788F, 3.4085F, -0.8155F, 2.2686F, -0.1128F, 2.6021F));
		PartDefinition cube_r43 = right_arm.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(65, 95).addBox(-0.5005F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9405F, 3.7901F, -1.391F, 2.7922F, -0.1128F, 2.6021F));
		PartDefinition cube_r44 = right_arm.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(70, 95).addBox(-1.4291F, -0.518F, -1.1596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0209F, 4.3548F, -2.6633F, -3.011F, -0.1128F, 2.6021F));
		PartDefinition cube_r45 = right_arm.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(75, 95).addBox(-1.1195F, -0.5178F, -0.9025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0209F, 4.3548F, -2.6633F, -2.9752F, -0.6742F, 2.5124F));
		PartDefinition cube_r46 = right_arm.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(14, 97).addBox(-1.0381F, -0.518F, -0.4304F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0209F, 4.3548F, -2.6633F, -2.8251F, -1.142F, 2.3274F));
		PartDefinition cube_r47 = right_arm.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(97, 23).addBox(-1.1501F, -0.518F, -0.2813F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0209F, 4.3548F, -2.6633F, -0.381F, -1.2153F, -0.1655F));
		PartDefinition cube_r48 = right_arm.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(54, 97).addBox(-1.3554F, -0.518F, 0.0473F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0209F, 4.3548F, -2.6633F, -0.1712F, -0.708F, -0.4128F));
		PartDefinition cube_r49 = right_arm.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(66, 71).addBox(-4.382F, -3.5795F, -2.6673F, 5.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.3608F, 0.7585F, 0.0436F, -0.1298F, -0.017F, -0.1298F));
		PartDefinition lower_right_arm = right_arm.addOrReplaceChild("lower_right_arm", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1285F, 5.4096F, -0.5853F, -0.1886F, -0.3423F, 0.0202F));
		PartDefinition cube_r50 = lower_right_arm
				.addOrReplaceChild(
						"cube_r50", CubeListBuilder.create().texOffs(63, 86).addBox(-1.0393F, -3.0343F, -1.7432F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 86)
								.addBox(-2.0393F, -3.5343F, -1.4932F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(37, 86).addBox(-1.5393F, -5.5343F, -0.9932F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.3071F, 4.8389F, -1.7754F, -0.2603F, -0.0281F, -0.0832F));
		PartDefinition cube_r51 = lower_right_arm.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(93, 0).addBox(-1.8609F, -2.6071F, -0.3979F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1343F, 6.1762F, -1.672F, 0.0275F, -0.1884F, 0.8378F));
		PartDefinition cube_r52 = lower_right_arm.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(59, 97).addBox(-1.1761F, -1.5647F, -0.3977F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1343F, 6.1762F, -1.672F, 0.1312F, -0.1384F, 0.2204F));
		PartDefinition cube_r53 = lower_right_arm.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(63, 17).addBox(-0.7825F, -1.044F, -0.3979F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1343F, 6.1762F, -1.672F, 0.18F, -0.0626F, -0.2561F));
		PartDefinition cube_r54 = lower_right_arm.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(92, 74).addBox(-0.7832F, 1.457F, 0.4373F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1343F, 6.1762F, -1.672F, -0.3F, -0.0626F, -0.2561F));
		PartDefinition cube_r55 = lower_right_arm.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(92, 23).addBox(-0.1792F, -0.7369F, 0.0611F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0913F, 4.155F, -0.3684F, -0.4561F, 0.4856F, 0.4142F));
		PartDefinition cube_r56 = lower_right_arm.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(80, 88).addBox(-0.996F, -2.3916F, -0.5766F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2227F, 7.3712F, -1.8318F, -0.5848F, 0.3103F, -0.0014F));
		PartDefinition cube_r57 = lower_right_arm.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(87, 74).addBox(-0.7026F, -0.8072F, -0.5766F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2227F, 7.3712F, -1.8318F, -0.653F, 0.0281F, -0.3968F));
		PartDefinition cube_r58 = lower_right_arm.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(37, 82).addBox(-0.7029F, 0.8813F, -0.9892F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2227F, 7.3712F, -1.8318F, -0.2603F, 0.0281F, -0.3968F));
		PartDefinition cube_r59 = lower_right_arm.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(79, 97).addBox(-0.8208F, 0.2631F, 0.0617F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8833F, 3.5532F, -0.3684F, -0.4561F, -0.4856F, -0.4142F));
		PartDefinition cube_r60 = lower_right_arm.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(0, 94).addBox(-0.5404F, -0.1732F, 0.0611F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.328F, 4.6019F, -1.0082F, -0.5848F, -0.3103F, -0.0859F));
		PartDefinition cube_r61 = lower_right_arm.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(5, 94).addBox(-0.1541F, -0.748F, 0.0611F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.2273F, 6.3678F, -2.3062F, -0.653F, -0.0281F, 0.3095F));
		PartDefinition cube_r62 = lower_right_arm.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(10, 94).addBox(-0.4049F, 1.1595F, -0.2694F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4754F, 6.4266F, -2.4525F, -0.2603F, -0.0281F, 0.3095F));
		PartDefinition cube_r63 = lower_right_arm.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(86, 36).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6922F, 10.3828F, -2.4444F, -0.0034F, -0.028F, 0.0914F));
		PartDefinition cube_r64 = lower_right_arm.addOrReplaceChild("cube_r64",
				CubeListBuilder.create().texOffs(90, 29).addBox(-3.0F, -0.75F, -0.75F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(84, 88).addBox(-2.0F, -1.0F, -1.75F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7434F, 10.2333F, -2.6929F, 0.0015F, -0.0281F, -0.0832F));
		PartDefinition cube_r65 = lower_right_arm.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(93, 46).addBox(-0.0557F, 1.372F, 0.3931F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8971F, 6.22F, -1.8864F, -0.3423F, 0.0736F, 0.2532F));
		PartDefinition cube_r66 = lower_right_arm.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(93, 42).addBox(1.0225F, -2.504F, -0.3978F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8971F, 6.22F, -1.8864F, -0.002F, 0.1559F, -0.8429F));
		PartDefinition cube_r67 = lower_right_arm.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(97, 74).addBox(0.3677F, -1.5729F, -0.3973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8971F, 6.22F, -1.8864F, 0.0883F, 0.1287F, -0.2261F));
		PartDefinition cube_r68 = lower_right_arm.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(67, 0).addBox(-0.0514F, -1.1397F, -0.3978F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8971F, 6.22F, -1.8864F, 0.1376F, 0.0736F, 0.2532F));
		PartDefinition right_paw = lower_right_arm.addOrReplaceChild("right_paw",
				CubeListBuilder.create().texOffs(78, 52).addBox(-2.6754F, 0.0377F, -2.6572F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(30, 76).addBox(-1.1754F, 0.0377F, -5.6572F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.973F, 9.8972F, -2.5909F, 0.2182F, 0.0F, 0.0698F));
		PartDefinition cube_r69 = right_paw.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(18, 60).addBox(-1.0005F, -0.0005F, -0.7514F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.3244F, 0.0377F, -4.1557F, 0.0F, -0.5236F, 0.0F));
		PartDefinition cube_r70 = right_paw.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(92, 17).addBox(-0.999F, -0.0005F, -0.7512F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6756F, 0.0377F, -4.1557F, 0.0F, 0.5236F, 0.0F));
		PartDefinition left_upper_arm = body.addOrReplaceChild("left_upper_arm", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.0F, -5.0F, -5.5F, 0.0F, -0.1309F, 0.0F));
		PartDefinition cube_r71 = left_upper_arm.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(0, 60).mirror().addBox(-2.8696F, -4.032F, -3.2858F, 5.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, -0.2618F, 0.0F, -0.1309F));
		PartDefinition left_arm = left_upper_arm.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.75F, 1.0F, 0.0F, 0.0037F, -0.049F, 0.0911F));
		PartDefinition cube_r72 = left_arm.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(55, 94).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.6427F, 3.0631F, -1.2871F, -1.825F, 0.304F, 2.846F));
		PartDefinition cube_r73 = left_arm.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(93, 4).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7508F, 3.7695F, -0.9606F, -2.2177F, 0.304F, 2.846F));
		PartDefinition cube_r74 = left_arm.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(11, 88).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.9164F, 4.4085F, -0.4472F, -2.2686F, 0.1128F, 2.6021F));
		PartDefinition cube_r75 = left_arm.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(0, 88).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0689F, 4.7901F, 0.1282F, -2.7922F, 0.1128F, 2.6021F));
		PartDefinition cube_r76 = left_arm.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(86, 60).mirror().addBox(-1.4291F, -0.518F, 0.1596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.1493F, 5.3548F, 1.4005F, 3.011F, 0.1128F, 2.6021F));
		PartDefinition cube_r77 = left_arm.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(47, 86).mirror().addBox(-1.1195F, -0.518F, -0.0975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.1493F, 5.3548F, 1.4005F, 2.9752F, 0.6742F, 2.5124F));
		PartDefinition cube_r78 = left_arm.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(38, 76).mirror().addBox(-1.0381F, -0.518F, -0.5696F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.1493F, 5.3548F, 1.4005F, 2.8251F, 1.142F, 2.3274F));
		PartDefinition cube_r79 = left_arm.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(26, 60).mirror().addBox(-1.1501F, -0.518F, -0.7187F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.1493F, 5.3548F, 1.4005F, 0.381F, 1.2153F, -0.1655F));
		PartDefinition cube_r80 = left_arm.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(46, 5).mirror().addBox(-1.3554F, -0.518F, -1.0473F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.1493F, 5.3548F, 1.4005F, 0.1712F, 0.708F, -0.4128F));
		PartDefinition cube_r81 = left_arm.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(60, 94).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5838F, -0.1461F, -0.2123F, 1.418F, 0.4065F, -2.3929F));
		PartDefinition cube_r82 = left_arm.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(94, 78).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.0049F, 0.4635F, -0.0436F, 1.2578F, 0.304F, -2.846F));
		PartDefinition cube_r83 = left_arm.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(94, 81).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.2962F, 1.2598F, 0.1052F, 1.5196F, 0.304F, -2.846F));
		PartDefinition cube_r84 = left_arm.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(83, 94).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.5143F, 2.0631F, 0.0243F, 1.825F, 0.304F, -2.846F));
		PartDefinition cube_r85 = left_arm.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(88, 94).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.6224F, 2.7695F, -0.3021F, 2.2177F, 0.304F, -2.846F));
		PartDefinition cube_r86 = left_arm.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(93, 94).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.788F, 3.4085F, -0.8155F, 2.2686F, 0.1128F, -2.6021F));
		PartDefinition cube_r87 = left_arm.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(65, 95).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.9405F, 3.7901F, -1.391F, 2.7922F, 0.1128F, -2.6021F));
		PartDefinition cube_r88 = left_arm.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(70, 95).mirror().addBox(0.4291F, -0.518F, -1.1596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.0209F, 4.3548F, -2.6633F, -3.011F, 0.1128F, -2.6021F));
		PartDefinition cube_r89 = left_arm.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(75, 95).mirror().addBox(0.1195F, -0.518F, -0.9025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.0209F, 4.3548F, -2.6633F, -2.9752F, 0.6742F, -2.5124F));
		PartDefinition cube_r90 = left_arm.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(14, 97).mirror().addBox(0.0381F, -0.518F, -0.4304F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.0209F, 4.3548F, -2.6633F, -2.8251F, 1.142F, -2.3274F));
		PartDefinition cube_r91 = left_arm.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(97, 23).mirror().addBox(0.1501F, -0.518F, -0.2813F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.0209F, 4.3548F, -2.6633F, -0.381F, 1.2153F, 0.1655F));
		PartDefinition cube_r92 = left_arm.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(54, 97).mirror().addBox(0.3554F, -0.518F, 0.0473F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.0209F, 4.3548F, -2.6633F, -0.1712F, 0.708F, 0.4128F));
		PartDefinition cube_r93 = left_arm.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(66, 71).mirror().addBox(-0.618F, -3.5795F, -2.6673F, 5.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.3608F, 0.7585F, 0.0436F, -0.1298F, 0.017F, 0.1298F));
		PartDefinition lower_left_arm = left_arm.addOrReplaceChild("lower_left_arm", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1285F, 5.4096F, -0.5853F, -0.1886F, 0.3423F, -0.0202F));
		PartDefinition cube_r94 = lower_left_arm.addOrReplaceChild("cube_r94",
				CubeListBuilder.create().texOffs(63, 86).mirror().addBox(-0.9607F, -3.0343F, -1.7432F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(50, 86).mirror()
						.addBox(-1.9607F, -3.5343F, -1.4932F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(37, 86).mirror().addBox(-1.4607F, -5.5343F, -0.9932F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.3071F, 4.8389F, -1.7754F, -0.2603F, 0.0281F, 0.0832F));
		PartDefinition cube_r95 = lower_left_arm.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(93, 0).mirror().addBox(0.8609F, -2.6071F, -0.3979F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.1343F, 6.1762F, -1.672F, 0.0275F, 0.1884F, -0.8378F));
		PartDefinition cube_r96 = lower_left_arm.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(59, 97).mirror().addBox(0.1761F, -1.5647F, -0.3979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.1343F, 6.1762F, -1.672F, 0.1312F, 0.1384F, -0.2204F));
		PartDefinition cube_r97 = lower_left_arm.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(63, 17).mirror().addBox(-0.2175F, -1.044F, -0.3979F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.1343F, 6.1762F, -1.672F, 0.18F, 0.0626F, 0.2561F));
		PartDefinition cube_r98 = lower_left_arm.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(92, 74).mirror().addBox(-0.2175F, 1.457F, 0.4373F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.1343F, 6.1762F, -1.672F, -0.3F, 0.0626F, 0.2561F));
		PartDefinition cube_r99 = lower_left_arm.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(92, 23).mirror().addBox(-0.8208F, -0.7369F, 0.0611F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0913F, 4.155F, -0.3684F, -0.4561F, -0.4856F, -0.4142F));
		PartDefinition cube_r100 = lower_left_arm.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(80, 88).mirror().addBox(-0.004F, -2.3916F, -0.5766F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2227F, 7.3712F, -1.8318F, -0.5848F, -0.3103F, 0.0014F));
		PartDefinition cube_r101 = lower_left_arm.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(87, 74).mirror().addBox(-0.2974F, -0.8072F, -0.5766F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2227F, 7.3712F, -1.8318F, -0.653F, -0.0281F, 0.3968F));
		PartDefinition cube_r102 = lower_left_arm.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(37, 82).mirror().addBox(-0.2974F, 0.8813F, -0.9892F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2227F, 7.3712F, -1.8318F, -0.2603F, -0.0281F, 0.3968F));
		PartDefinition cube_r103 = lower_left_arm.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(79, 97).mirror().addBox(-0.1792F, 0.2631F, 0.0611F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.8833F, 3.5532F, -0.3684F, -0.4561F, 0.4856F, 0.4142F));
		PartDefinition cube_r104 = lower_left_arm.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(0, 94).mirror().addBox(-0.4596F, -0.1732F, 0.0611F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.328F, 4.6019F, -1.0082F, -0.5848F, 0.3103F, 0.0859F));
		PartDefinition cube_r105 = lower_left_arm.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(5, 94).mirror().addBox(-0.8459F, -0.748F, 0.0611F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.2273F, 6.3678F, -2.3062F, -0.653F, 0.0281F, -0.3095F));
		PartDefinition cube_r106 = lower_left_arm.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(10, 94).mirror().addBox(-0.5959F, 1.1595F, -0.2694F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.4754F, 6.4266F, -2.4525F, -0.2603F, 0.0281F, -0.3095F));
		PartDefinition cube_r107 = lower_left_arm.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(86, 36).mirror().addBox(-2.0F, -0.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.6922F, 10.3828F, -2.4444F, -0.0034F, 0.028F, -0.0914F));
		PartDefinition cube_r108 = lower_left_arm.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(90, 29).mirror().addBox(-3.0F, -0.75F, -0.75F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(84, 88).mirror()
				.addBox(-2.0F, -1.0F, -1.75F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7434F, 10.2333F, -2.6929F, 0.0015F, 0.0281F, 0.0832F));
		PartDefinition cube_r109 = lower_left_arm.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(93, 46).mirror().addBox(-0.9486F, 1.372F, 0.3931F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.8971F, 6.22F, -1.8864F, -0.3423F, -0.0736F, -0.2532F));
		PartDefinition cube_r110 = lower_left_arm.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(93, 42).mirror().addBox(-2.0225F, -2.504F, -0.3978F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.8971F, 6.22F, -1.8864F, -0.002F, -0.1559F, 0.8429F));
		PartDefinition cube_r111 = lower_left_arm.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(97, 74).mirror().addBox(-1.3677F, -1.5729F, -0.3978F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.8971F, 6.22F, -1.8864F, 0.0883F, -0.1287F, 0.2261F));
		PartDefinition cube_r112 = lower_left_arm.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(67, 0).mirror().addBox(-0.9486F, -1.1397F, -0.3978F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.8971F, 6.22F, -1.8864F, 0.1376F, -0.0736F, -0.2532F));
		PartDefinition left_paw = lower_left_arm.addOrReplaceChild("left_paw", CubeListBuilder.create().texOffs(78, 52).mirror().addBox(-2.3246F, 0.0377F, -2.6572F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(30, 76).mirror()
				.addBox(-0.8246F, 0.0377F, -5.6572F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.973F, 9.8972F, -2.5909F, 0.2182F, 0.0F, -0.0698F));
		PartDefinition cube_r113 = left_paw.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(18, 60).mirror().addBox(-0.9995F, -0.0005F, -0.7514F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.3244F, 0.0377F, -4.1557F, 0.0F, 0.5236F, 0.0F));
		PartDefinition cube_r114 = left_paw.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(92, 17).mirror().addBox(-1.001F, -0.0005F, -0.7512F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.6756F, 0.0377F, -4.1557F, 0.0F, -0.5236F, 0.0F));
		PartDefinition right_leg = body.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(5.0F, 3.5F, 8.0F));
		PartDefinition right_leg_part = right_leg.addOrReplaceChild("right_leg_part", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2367F, -0.3395F, -1.7084F, -0.1958F, -0.7203F, 0.2921F));
		PartDefinition cube_r115 = right_leg_part.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(42, 42).addBox(3.0F, -0.5F, -0.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 77)
				.addBox(3.0F, 2.0F, -3.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 0).addBox(-3.0F, -4.0F, -4.0F, 6.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7633F, 0.3395F, 0.7084F, 0.0873F, 0.0F, 0.1309F));
		PartDefinition cube_r116 = right_leg_part.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(86, 13).addBox(0.3193F, -0.5837F, -0.47F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7633F, -1.9105F, 2.9584F, 0.088F, 0.1304F, 0.1424F));
		PartDefinition cube_r117 = right_leg_part.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(86, 10).addBox(0.5466F, -0.5176F, -0.2475F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8939F, 2.9521F, 3.1668F, 0.0763F, 0.1376F, 0.0546F));
		PartDefinition cube_r118 = right_leg_part.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(0, 80).addBox(0.0551F, -0.4094F, -0.5079F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9914F, -1.6195F, -2.0F, 0.0873F, 0.0F, 0.1309F));
		PartDefinition wheelhub = right_leg_part.addOrReplaceChild("wheelhub", CubeListBuilder.create(), PartPose.offsetAndRotation(10.0874F, 0.9172F, 0.8804F, -0.2112F, 0.7418F, -0.4782F));
		PartDefinition cube_r119 = wheelhub.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(18, 76).addBox(-3.0F, -4.5F, -4.5F, 2.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, 2.15F, 1.0F, 0.0F, -0.1309F, 0.2618F));
		PartDefinition right_wheel = right_leg.addOrReplaceChild("right_wheel", CubeListBuilder.create(), PartPose.offsetAndRotation(11.2318F, 3.5006F, 5.468F, -0.0038F, -0.0872F, 0.0438F));
		PartDefinition cube_r120 = right_wheel.addOrReplaceChild("cube_r120",
				CubeListBuilder.create().texOffs(0, 30).addBox(-2.5F, -5.5F, -5.5F, 5.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(43, 71).addBox(-2.0F, -3.5F, -3.5F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(68, 10)
						.addBox(-2.5F, 3.5F, -3.5F, 5.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(75, 0).addBox(-2.5F, -5.5F, -3.5F, 5.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.5F, -5.5F, 3.5F, 5.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));
		PartDefinition left_leg = body.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(-5.0F, 3.5F, 8.0F));
		PartDefinition left_leg_part = left_leg.addOrReplaceChild("left_leg_part", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2367F, -0.3395F, -1.7084F, -0.1958F, 0.7203F, -0.2921F));
		PartDefinition cube_r121 = left_leg_part.addOrReplaceChild("cube_r121",
				CubeListBuilder.create().texOffs(42, 42).mirror().addBox(-13.0F, -0.5F, -0.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 77).mirror()
						.addBox(-13.0F, 2.0F, -3.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(46, 0).mirror().addBox(-3.0F, -4.0F, -4.0F, 6.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.7633F, 0.3395F, 0.7084F, 0.0873F, 0.0F, -0.1309F));
		PartDefinition cube_r122 = left_leg_part.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(86, 13).mirror().addBox(-8.3193F, -0.5837F, -0.47F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.7633F, -1.9105F, 2.9584F, 0.088F, -0.1304F, -0.1424F));
		PartDefinition cube_r123 = left_leg_part.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(86, 10).mirror().addBox(-9.5466F, -0.5176F, -0.2475F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.8939F, 2.9521F, 3.1668F, 0.0763F, -0.1376F, -0.0546F));
		PartDefinition cube_r124 = left_leg_part.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-10.0551F, -0.4094F, -0.5079F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.9914F, -1.6195F, -2.0F, 0.0873F, 0.0F, -0.1309F));
		PartDefinition wheelhub2 = left_leg_part.addOrReplaceChild("wheelhub2", CubeListBuilder.create(), PartPose.offsetAndRotation(-10.0874F, 0.9172F, 0.8804F, -0.2112F, -0.7418F, 0.4782F));
		PartDefinition cube_r125 = wheelhub2.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(18, 76).mirror().addBox(1.0F, -4.5F, -4.5F, 2.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5F, 2.15F, 1.0F, 0.0F, 0.1309F, -0.2618F));
		PartDefinition left_wheel = left_leg.addOrReplaceChild("left_wheel", CubeListBuilder.create(), PartPose.offsetAndRotation(-11.2318F, 3.5006F, 5.468F, -0.0038F, 0.0872F, -0.0438F));
		PartDefinition cube_r126 = left_wheel.addOrReplaceChild("cube_r126",
				CubeListBuilder.create().texOffs(0, 30).mirror().addBox(-2.5F, -5.5F, -5.5F, 5.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(43, 71).mirror().addBox(-2.0F, -3.5F, -3.5F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(68, 10).mirror().addBox(-2.5F, 3.5F, -3.5F, 5.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(75, 0).mirror().addBox(-2.5F, -5.5F, -3.5F, 5.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 0).mirror().addBox(-2.5F, -5.5F, 3.5F, 5.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
