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
public class ModelJotaroKujoP3Hat<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("jojowos", "model_jotaro_kujo_p_3_hat"), "main");
	public final ModelPart head;

	public ModelJotaroKujoP3Hat(ModelPart root) {
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(57, 20).addBox(-4.25F, -5.0F, 2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 41).addBox(3.25F, -5.0F, 2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 60)
						.addBox(3.25F, -5.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 63).addBox(3.25F, -5.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(57, 26)
						.addBox(-4.25F, -5.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 9).addBox(-4.25F, -5.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(21, 54)
						.addBox(-4.0F, -9.0F, 3.25F, 8.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 17).addBox(-4.0F, -9.25F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(38, 17)
						.addBox(3.5F, -9.0F, -4.0F, 1.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(34, 36).addBox(-4.5F, -9.0F, -4.0F, 1.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(64, 59)
						.addBox(-4.0F, -9.0F, -4.5F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(49, 20).addBox(1.25F, -8.5F, -4.6F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(45, 36)
						.addBox(-4.0F, -6.0F, -7.0F, 8.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(45, 41).addBox(-1.3F, -0.25F, -0.5F, 1.5F, 1.5F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.05F, -7.9F, -4.1F, 0.0F, 0.0F, -0.7854F));
		PartDefinition head_r2 = head.addOrReplaceChild("head_r2",
				CubeListBuilder.create().texOffs(91, 33).addBox(0.8239F, -0.4456F, 1.3715F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(92, 6).addBox(0.249F, -1.3785F, -0.3016F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.75F, 3.75F, -1.2339F, 0.0349F, 0.29F));
		PartDefinition head_r3 = head.addOrReplaceChild("head_r3",
				CubeListBuilder.create().texOffs(20, 91).addBox(-2.8239F, -0.4456F, 1.3715F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 92).addBox(-2.249F, -1.3785F, -0.3016F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.75F, 3.75F, -1.2339F, -0.0349F, -0.29F));
		PartDefinition head_r4 = head.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(11, 89).addBox(1.9615F, -1.3891F, 0.6101F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.75F, 3.75F, -1.1299F, 0.4082F, 0.2442F));
		PartDefinition head_r5 = head.addOrReplaceChild("head_r5", CubeListBuilder.create().texOffs(81, 88).addBox(1.3865F, -2.322F, -1.0629F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.75F, 3.75F, -1.1299F, 0.4082F, 0.2442F));
		PartDefinition head_r6 = head.addOrReplaceChild("head_r6", CubeListBuilder.create().texOffs(30, 98).addBox(-1.2018F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2982F, -8.7162F, 2.2609F, -0.9672F, 0.0099F, 0.0F));
		PartDefinition head_r7 = head.addOrReplaceChild("head_r7", CubeListBuilder.create().texOffs(98, 30).addBox(-1.2018F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7018F, -8.7162F, 2.2609F, -0.9672F, 0.0099F, 0.0F));
		PartDefinition head_r8 = head.addOrReplaceChild("head_r8", CubeListBuilder.create().texOffs(98, 78).addBox(-1.2018F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7018F, -8.7162F, 1.7609F, -0.9672F, 0.0099F, 0.0F));
		PartDefinition head_r9 = head.addOrReplaceChild("head_r9", CubeListBuilder.create().texOffs(86, 98).addBox(-1.2018F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7018F, -8.7162F, 3.7609F, -0.9672F, 0.0099F, 0.0F));
		PartDefinition head_r10 = head.addOrReplaceChild("head_r10", CubeListBuilder.create().texOffs(98, 12).addBox(0.8741F, -3.4789F, -1.3952F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.25F, -7.0F, 2.5F, -0.9231F, 0.3458F, 0.2381F));
		PartDefinition head_r11 = head.addOrReplaceChild("head_r11", CubeListBuilder.create().texOffs(98, 17).addBox(-1.8741F, -3.4789F, -1.3952F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.25F, -7.0F, 2.5F, -0.9231F, -0.3458F, -0.2381F));
		PartDefinition head_r12 = head.addOrReplaceChild("head_r12", CubeListBuilder.create().texOffs(99, 0).addBox(-1.8741F, -3.4789F, -1.3952F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.75F, -6.75F, 3.25F, -0.9231F, -0.3458F, -0.2381F));
		PartDefinition head_r13 = head.addOrReplaceChild("head_r13", CubeListBuilder.create().texOffs(7, 75).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7482F, -4.7162F, -0.9891F, -1.1071F, 0.5033F, 0.3207F));
		PartDefinition head_r14 = head.addOrReplaceChild("head_r14", CubeListBuilder.create().texOffs(14, 80).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7482F, -4.7162F, -0.9891F, -1.1071F, -0.5033F, -0.3207F));
		PartDefinition head_r15 = head.addOrReplaceChild("head_r15", CubeListBuilder.create().texOffs(97, 92).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7982F, -3.4662F, 0.0109F, -1.1413F, -0.3458F, -0.2381F));
		PartDefinition head_r16 = head.addOrReplaceChild("head_r16", CubeListBuilder.create().texOffs(15, 54).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0482F, -5.9162F, 1.0109F, -1.3158F, 0.3458F, 0.2381F));
		PartDefinition head_r17 = head.addOrReplaceChild("head_r17", CubeListBuilder.create().texOffs(0, 54).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1482F, -5.9662F, 2.7609F, -1.0104F, 0.3458F, 0.2381F));
		PartDefinition head_r18 = head.addOrReplaceChild("head_r18", CubeListBuilder.create().texOffs(31, 75).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0482F, -7.7662F, 3.0109F, -1.2722F, 0.3458F, 0.2381F));
		PartDefinition head_r19 = head.addOrReplaceChild("head_r19", CubeListBuilder.create().texOffs(0, 62).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1482F, -5.9662F, 2.7609F, -1.0104F, -0.3458F, -0.2381F));
		PartDefinition head_r20 = head.addOrReplaceChild("head_r20", CubeListBuilder.create().texOffs(97, 83).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8982F, -4.4662F, 2.0109F, -1.0104F, -0.3458F, -0.2381F));
		PartDefinition head_r21 = head.addOrReplaceChild("head_r21", CubeListBuilder.create().texOffs(25, 97).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0482F, -5.9162F, 1.0109F, -1.3158F, -0.3458F, -0.2381F));
		PartDefinition head_r22 = head.addOrReplaceChild("head_r22", CubeListBuilder.create().texOffs(61, 97).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7982F, -3.6662F, 1.7609F, -1.3158F, -0.3458F, -0.2381F));
		PartDefinition head_r23 = head.addOrReplaceChild("head_r23", CubeListBuilder.create().texOffs(75, 39).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0482F, -7.7662F, 3.0109F, -1.2722F, -0.3458F, -0.2381F));
		PartDefinition head_r24 = head.addOrReplaceChild("head_r24", CubeListBuilder.create().texOffs(79, 6).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7982F, -2.7662F, 3.0109F, -1.2722F, -0.3458F, -0.2381F));
		PartDefinition head_r25 = head.addOrReplaceChild("head_r25", CubeListBuilder.create().texOffs(0, 98).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7982F, -3.4662F, 0.0109F, -1.1413F, 0.3458F, 0.2381F));
		PartDefinition head_r26 = head.addOrReplaceChild("head_r26", CubeListBuilder.create().texOffs(5, 98).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8982F, -4.4662F, 2.0109F, -1.0104F, 0.3458F, 0.2381F));
		PartDefinition head_r27 = head.addOrReplaceChild("head_r27", CubeListBuilder.create().texOffs(96, 97).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7982F, -3.6662F, 1.7609F, -1.3158F, 0.3458F, 0.2381F));
		PartDefinition head_r28 = head.addOrReplaceChild("head_r28", CubeListBuilder.create().texOffs(19, 80).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7982F, -2.7662F, 3.0109F, -1.2722F, 0.3458F, 0.2381F));
		PartDefinition head_r29 = head.addOrReplaceChild("head_r29", CubeListBuilder.create().texOffs(91, 98).addBox(0.8741F, -3.4789F, -1.3952F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.75F, -6.75F, 3.25F, -0.9231F, 0.3458F, 0.2381F));
		PartDefinition head_r30 = head.addOrReplaceChild("head_r30", CubeListBuilder.create().texOffs(87, 68).addBox(0.8741F, -3.4789F, -2.3952F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.75F, 3.75F, -0.9231F, 0.3458F, 0.2381F));
		PartDefinition head_r31 = head.addOrReplaceChild("head_r31", CubeListBuilder.create().texOffs(90, 86).addBox(-3.9615F, -1.3891F, 0.6101F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.75F, 3.75F, -1.1299F, -0.4082F, -0.2442F));
		PartDefinition head_r32 = head.addOrReplaceChild("head_r32", CubeListBuilder.create().texOffs(40, 89).addBox(-3.3865F, -2.322F, -1.0629F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.75F, 3.75F, -1.1299F, -0.4082F, -0.2442F));
		PartDefinition head_r33 = head.addOrReplaceChild("head_r33", CubeListBuilder.create().texOffs(89, 20).addBox(-2.8741F, -3.4789F, -2.3952F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.75F, 3.75F, -0.9231F, -0.3458F, -0.2381F));
		PartDefinition head_r34 = head.addOrReplaceChild("head_r34", CubeListBuilder.create().texOffs(88, 92).addBox(-0.326F, -2.3114F, -1.9746F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.75F, 3.75F, -1.2339F, 0.0349F, 0.29F));
		PartDefinition head_r35 = head.addOrReplaceChild("head_r35", CubeListBuilder.create().texOffs(29, 92).addBox(-1.674F, -2.3114F, -1.9746F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.75F, 3.75F, -1.2339F, -0.0349F, -0.29F));
		PartDefinition head_r36 = head.addOrReplaceChild("head_r36", CubeListBuilder.create().texOffs(93, 52).addBox(-1.1448F, -3.7492F, -3.2321F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.75F, 3.5F, -1.0249F, 0.0278F, -0.2907F));
		PartDefinition head_r37 = head.addOrReplaceChild("head_r37", CubeListBuilder.create().texOffs(47, 94).addBox(-0.8552F, -3.7492F, -3.2321F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.75F, 3.5F, -1.0249F, -0.0278F, 0.2907F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
