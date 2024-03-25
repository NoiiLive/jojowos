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
public class ModelDioTop<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("jojowos", "model_dio_top"), "main");
	public final ModelPart torso;
	public final ModelPart left_arm;
	public final ModelPart right_arm;

	public ModelDioTop(ModelPart root) {
		this.torso = root.getChild("torso");
		this.left_arm = root.getChild("left_arm");
		this.right_arm = root.getChild("right_arm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition torso = partdefinition.addOrReplaceChild("torso",
				CubeListBuilder.create().texOffs(66, 27).addBox(-3.0F, -0.25F, -2.0F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(67, 28).addBox(-4.0F, -0.25F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(68, 29)
						.addBox(-4.25F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 29).addBox(3.25F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(67, 28)
						.addBox(3.0F, -0.25F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(66, 0).addBox(-4.0F, 5.0F, -2.25F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(65, 62)
						.addBox(-4.0F, 5.0F, 1.25F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 107).addBox(3.0F, 0.0F, 1.25F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 107)
						.addBox(-4.0F, 0.0F, 1.25F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 64).addBox(3.25F, 5.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 55)
						.addBox(-4.25F, 5.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 107).addBox(-4.25F, 0.0F, 1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 107)
						.addBox(3.25F, 0.0F, 1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 71).addBox(-2.5F, 0.0F, -2.25F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 71)
						.addBox(-3.0F, 0.0F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 71).addBox(-3.0F, 4.0F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.0F, 0.0F));
		PartDefinition torso_r1 = torso.addOrReplaceChild("torso_r1",
				CubeListBuilder.create().texOffs(56, 71).addBox(-0.5F, 1.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 71).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, 2.5F, -1.75F, 0.0F, -1.5708F, 0.0F));
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm",
				CubeListBuilder.create().texOffs(52, 77).mirror().addBox(2.15F, 6.45F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(77, 39).mirror()
						.addBox(-1.15F, 6.45F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(68, 87).mirror().addBox(-1.0F, 6.45F, -2.15F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(86, 84).mirror()
						.addBox(-1.0F, 6.45F, 1.15F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(5.0F, 14.0F, 0.0F));
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm",
				CubeListBuilder.create().texOffs(52, 77).addBox(-3.15F, 6.45F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(77, 39).addBox(0.15F, 6.45F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(68, 87)
						.addBox(-3.0F, 6.45F, -2.15F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(86, 84).addBox(-3.0F, 6.45F, 1.15F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 14.0F, 0.0F));
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
