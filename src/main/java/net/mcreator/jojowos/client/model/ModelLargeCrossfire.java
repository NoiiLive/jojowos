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
public class ModelLargeCrossfire<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("jojowos", "model_large_crossfire"), "main");
	public final ModelPart ankh;

	public ModelLargeCrossfire(ModelPart root) {
		this.ankh = root.getChild("ankh");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition ankh = partdefinition.addOrReplaceChild("ankh",
				CubeListBuilder.create().texOffs(0, 20).addBox(-6.0F, -1.0F, 11.0F, 12.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 16).addBox(-6.0F, -1.0F, 2.0F, 12.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(21, 7)
						.addBox(-6.0F, -1.0F, 5.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(21, 0).addBox(3.0F, -1.0F, 5.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.5F, -1.0F, -13.0F, 3.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(20, 24).addBox(1.5F, -1.0F, -4.0F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(-8.5F, -1.0F, -4.0F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		ankh.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
