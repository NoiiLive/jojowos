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
public class ModelPolnareffBoots<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("jojowos", "model_polnareff_boots"), "main");
	public final ModelPart left_boot;
	public final ModelPart right_boot;

	public ModelPolnareffBoots(ModelPart root) {
		this.left_boot = root.getChild("left_boot");
		this.right_boot = root.getChild("right_boot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition left_boot = partdefinition.addOrReplaceChild("left_boot",
				CubeListBuilder.create().texOffs(24, 0).addBox(-2.0F, 10.0F, -4.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 46).addBox(-2.0F, 11.25F, -4.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(67, 44)
						.addBox(-2.0F, 8.0F, -2.25F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 7).addBox(-2.0F, 8.0F, 1.25F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 52)
						.addBox(-2.25F, 8.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 16).addBox(1.25F, 8.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition right_boot = partdefinition.addOrReplaceChild("right_boot",
				CubeListBuilder.create().texOffs(24, 0).mirror().addBox(-2.0F, 10.0F, -4.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(18, 46).mirror().addBox(-2.0F, 11.25F, -4.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(67, 44).mirror().addBox(-2.0F, 8.0F, -2.25F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(66, 7).mirror().addBox(-2.0F, 8.0F, 1.25F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(54, 52).mirror().addBox(1.25F, 8.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(24, 16).mirror().addBox(-2.25F, 8.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offset(-2.0F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		left_boot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_boot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
