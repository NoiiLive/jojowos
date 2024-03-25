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
public class ModelHermitPurpleDisplay<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("jojowos", "model_hermit_purple_display"), "main");
	public final ModelPart static_vines;

	public ModelHermitPurpleDisplay(ModelPart root) {
		this.static_vines = root.getChild("static_vines");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition static_vines = partdefinition.addOrReplaceChild("static_vines", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition bone = static_vines.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2151F, -9.5207F, 1.2316F, -0.1747F, -0.043F, 0.0076F));
		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(15, 23).addBox(-0.5F, -0.4991F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8338F, -0.7142F, -2.1083F, -0.4146F, -0.8731F, 0.3253F));
		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(16, 4).addBox(-0.25F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2849F, -0.4793F, -1.2316F, -0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(19, 23).addBox(-0.5F, -0.4997F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8284F, 0.0304F, 0.6705F, -0.3776F, 0.7926F, -0.2753F));
		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 24).addBox(-0.5F, -0.4931F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2976F, 0.0838F, 0.8699F, -1.5708F, 1.309F, -1.5708F));
		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(9, 17).addBox(-0.5005F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4826F, 0.4972F, 0.7592F, -1.8762F, 1.309F, -1.5708F));
		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(24, 1).addBox(-0.5F, -0.4992F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9889F, 0.5979F, 0.5184F, -2.807F, 0.7203F, -2.6006F));
		PartDefinition bone2 = static_vines.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.8204F, -10.6734F, 1.7815F));
		PartDefinition cube_r7 = bone2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(22, 22).addBox(-0.5F, -0.4996F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.7553F, -0.9105F, -3.093F));
		PartDefinition cube_r8 = bone2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(23, 7).addBox(-0.5F, -0.4908F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5668F, -0.1958F, 0.1777F, 1.4415F, -1.3356F, -1.7001F));
		PartDefinition cube_r9 = bone2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(23, 9).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0268F, -0.2664F, -0.0371F, 0.3037F, -0.6878F, -0.4586F));
		PartDefinition cube_r10 = bone2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(11, 23).addBox(-0.5F, -0.499F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2877F, -0.1977F, -0.6014F, 0.2335F, -0.0549F, -0.2752F));
		PartDefinition cube_r11 = bone2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(23, 12).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2796F, -0.1266F, -0.8815F, 0.3491F, 0.829F, 0.0F));
		PartDefinition bone3 = static_vines.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-0.8204F, -7.3266F, -1.7815F));
		PartDefinition cube_r12 = bone3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(19, 21).addBox(-0.5F, -0.4934F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.7553F, -0.9105F, -3.093F));
		PartDefinition cube_r13 = bone3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 22).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5668F, 0.1958F, -0.1777F, 1.4415F, -1.3356F, -1.7001F));
		PartDefinition cube_r14 = bone3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(4, 22).addBox(-0.5F, -0.4998F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0268F, 0.2664F, 0.0371F, 0.3037F, -0.6878F, -0.4586F));
		PartDefinition cube_r15 = bone3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(8, 22).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2877F, 0.1977F, 0.6014F, 0.2335F, -0.0549F, -0.2752F));
		PartDefinition cube_r16 = bone3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(22, 20).addBox(-0.5F, -0.49F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2796F, 0.1266F, 0.8815F, 0.3491F, 0.829F, 0.0F));
		PartDefinition bone4 = static_vines.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2151F, -5.4793F, 1.2316F, 0.1747F, 0.043F, 0.0076F));
		PartDefinition cube_r17 = bone4.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(11, 21).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8338F, 0.7142F, -2.1083F, 0.4146F, 0.8731F, 0.3253F));
		PartDefinition cube_r18 = bone4.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 16).addBox(-0.75F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2849F, 0.4793F, -1.2316F, 0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r19 = bone4.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(21, 14).addBox(-0.5F, -0.4903F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8284F, -0.0304F, 0.6705F, 0.3776F, -0.7926F, -0.2753F));
		PartDefinition cube_r20 = bone4.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(15, 21).addBox(-0.5007F, -0.4999F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2976F, -0.0838F, 0.8699F, 1.5708F, -1.309F, -1.5708F));
		PartDefinition cube_r21 = bone4.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(17, 0).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4826F, -0.4972F, 0.7592F, 1.8762F, -1.309F, -1.5708F));
		PartDefinition cube_r22 = bone4.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(21, 18).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9889F, -0.5979F, 0.5184F, 2.807F, -0.7203F, -2.6006F));
		PartDefinition bone5 = static_vines.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2151F, -8.9793F, -1.2316F, -0.1747F, -0.043F, 0.0076F));
		PartDefinition cube_r23 = bone5.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(20, 16).addBox(-0.5F, -0.4999F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6338F, 0.7142F, 2.2083F, -0.4146F, -0.8731F, 0.3253F));
		PartDefinition cube_r24 = bone5.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(13, 13).addBox(-0.75F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0849F, 0.4793F, 1.3316F, -0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r25 = bone5.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(16, 11).addBox(-0.5F, -0.5F, -0.4999F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5419F, 2.497F, 0.0745F, 0.829F, 0.2618F, 1.5708F));
		PartDefinition cube_r26 = bone5.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(13, 17).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0604F, 2.1926F, -0.3879F, 0.6654F, 0.5925F, 1.1853F));
		PartDefinition cube_r27 = bone5.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, -0.4993F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3746F, 1.1956F, -0.6122F, 0.1014F, 0.8554F, 0.3669F));
		PartDefinition cube_r28 = bone5.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(21, 0).addBox(-0.5F, -0.4993F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6284F, -0.0304F, -0.5705F, -0.3776F, 0.7926F, -0.2753F));
		PartDefinition cube_r29 = bone5.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(21, 3).addBox(-0.5F, -0.4999F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0976F, -0.0838F, -0.7699F, -1.5708F, 1.309F, -1.5708F));
		PartDefinition cube_r30 = bone5.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(16, 8).addBox(-0.5005F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6826F, -0.4972F, -0.6592F, -1.8762F, 1.309F, -1.5708F));
		PartDefinition cube_r31 = bone5.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(21, 5).addBox(-0.5F, -0.4998F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1889F, -0.5979F, -0.4184F, -2.807F, 0.7203F, -2.6006F));
		PartDefinition bone6 = static_vines.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(-0.8204F, -3.3266F, 1.7815F));
		PartDefinition cube_r32 = bone6.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 20).addBox(-0.5F, -0.4934F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.7553F, 0.9105F, -3.093F));
		PartDefinition cube_r33 = bone6.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(4, 20).addBox(-0.5F, -0.4992F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5668F, 0.1958F, 0.1777F, -1.4415F, 1.3356F, -1.7001F));
		PartDefinition cube_r34 = bone6.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(8, 20).addBox(-0.5F, -0.4998F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0268F, 0.2664F, -0.0371F, -0.3037F, 0.6878F, -0.4586F));
		PartDefinition cube_r35 = bone6.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(20, 8).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2877F, 0.1977F, -0.6014F, -0.2335F, 0.0549F, -0.2752F));
		PartDefinition cube_r36 = bone6.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(20, 11).addBox(-0.5F, -0.49F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2796F, 0.1266F, -0.8815F, -0.3491F, -0.829F, 0.0F));
		PartDefinition bone7 = static_vines.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2151F, -4.5207F, -1.2316F, 0.1747F, 0.043F, 0.0076F));
		PartDefinition cube_r37 = bone7.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(17, 17).addBox(-0.5F, -0.4991F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8338F, -0.7142F, 2.1083F, 0.4146F, 0.8731F, 0.3253F));
		PartDefinition cube_r38 = bone7.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(12, 0).addBox(-0.25F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2849F, -0.4793F, 1.2316F, 0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r39 = bone7.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(18, 13).addBox(-0.5F, -0.4997F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8284F, 0.0304F, -0.6705F, 0.3776F, -0.7926F, -0.2753F));
		PartDefinition cube_r40 = bone7.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(14, 19).addBox(-0.5F, -0.4991F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2976F, 0.0838F, -0.8699F, 1.5708F, -1.309F, -1.5708F));
		PartDefinition cube_r41 = bone7.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(5, 16).addBox(-0.5005F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4826F, 0.4972F, -0.7592F, 1.8762F, -1.309F, -1.5708F));
		PartDefinition cube_r42 = bone7.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(18, 19).addBox(-0.5F, -0.4972F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9889F, 0.5979F, -0.5184F, 2.807F, -0.7203F, -2.6006F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		static_vines.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
