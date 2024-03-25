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
public class ModelKakyoinShoes<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("jojowos", "model_kakyoin_shoes"), "main");
	public final ModelPart kakleft_shoe;
	public final ModelPart kakright_shoe;

	public ModelKakyoinShoes(ModelPart root) {
		this.kakleft_shoe = root.getChild("kakleft_shoe");
		this.kakright_shoe = root.getChild("kakright_shoe");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition kakleft_shoe = partdefinition.addOrReplaceChild("kakleft_shoe",
				CubeListBuilder.create().texOffs(16, 68).addBox(1.25F, 10.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(34, 39).addBox(-2.0F, 11.25F, -4.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
						.addBox(-2.0F, 10.0F, -4.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(80, 30).addBox(-2.0F, 10.0F, 1.25F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(67, 43)
						.addBox(-2.25F, 10.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition kakright_shoe = partdefinition.addOrReplaceChild("kakright_shoe",
				CubeListBuilder.create().texOffs(16, 68).mirror().addBox(-2.25F, 10.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(34, 39).mirror()
						.addBox(-2.0F, 11.25F, -4.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(24, 0).mirror().addBox(-2.0F, 10.0F, -4.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(80, 30).mirror()
						.addBox(-2.0F, 10.0F, 1.25F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(67, 43).mirror().addBox(1.25F, 10.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-2.0F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		kakleft_shoe.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		kakright_shoe.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
