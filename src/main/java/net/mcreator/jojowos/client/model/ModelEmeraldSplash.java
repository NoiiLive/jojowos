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
public class ModelEmeraldSplash<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("jojowos", "model_emerald_splash"), "main");
	public final ModelPart emerald;

	public ModelEmeraldSplash(ModelPart root) {
		this.emerald = root.getChild("emerald");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition emerald = partdefinition.addOrReplaceChild("emerald",
				CubeListBuilder.create().texOffs(0, 5).addBox(-1.0F, -0.7047F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.0F, -0.3047F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 20.7047F, 0.0F, 0.0F, 1.5708F, -1.5708F));
		PartDefinition cube_r1 = emerald.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 10).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0024F, -2.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r2 = emerald.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(5, 11).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0024F, 2.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r3 = emerald.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(8, 1).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0024F, 0.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r4 = emerald.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(8, 6).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.0024F, 0.0F, 0.0F, 0.0F, 0.7854F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		emerald.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
