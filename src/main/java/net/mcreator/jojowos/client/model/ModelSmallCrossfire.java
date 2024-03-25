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
public class ModelSmallCrossfire<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("jojowos", "model_small_crossfire"), "main");
	public final ModelPart ankh;

	public ModelSmallCrossfire(ModelPart root) {
		this.ankh = root.getChild("ankh");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition ankh = partdefinition.addOrReplaceChild("ankh",
				CubeListBuilder.create().texOffs(1, 21).addBox(-4.0F, -1.0F, 8.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(1, 17).addBox(-4.0F, -1.0F, 2.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(23, 9)
						.addBox(-4.0F, -1.0F, 4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(23, 2).addBox(2.0F, -1.0F, 4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(5, 5)
						.addBox(-1.0F, -1.0F, -8.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(21, 25).addBox(1.0F, -1.0F, -3.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(1, 25)
						.addBox(-5.0F, -1.0F, -3.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 24.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		ankh.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
