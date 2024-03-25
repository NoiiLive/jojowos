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
public class ModelRoadRoller<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("jojowos", "model_road_roller"), "main");
	public final ModelPart bone;

	public ModelRoadRoller(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(84, 68).addBox(-15.0F, 4.9863F, -26.4168F, 30.0F, 11.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 36).addBox(-16.0F, -0.0137F, 7.5832F, 32.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-14.0F, -2.0137F, 4.5832F, 28.0F, 15.0F, 21.0F, new CubeDeformation(0.0F)).texOffs(0, 96).addBox(-11.0F, 2.9863F, -3.4168F, 22.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(98, 21)
						.addBox(-11.0F, 2.9863F, -12.4168F, 22.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(96, 50).addBox(-9.0F, 4.9863F, -10.4168F, 18.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 68)
						.addBox(3.75F, 0.9863F, -0.4168F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 12).addBox(-6.75F, 0.9863F, -0.4168F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 68)
						.addBox(-13.0F, 0.9863F, -28.4168F, 26.0F, 12.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(106, 105).addBox(-11.0F, 2.9863F, -29.4168F, 22.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 114)
						.addBox(13.0F, 8.9863F, -23.4168F, 3.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(66, 121).addBox(13.0F, 0.9863F, -24.4168F, 3.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(44, 121)
						.addBox(-16.0F, 0.9863F, -24.4168F, 3.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 114).addBox(-16.0F, 8.9863F, -23.4168F, 3.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(72, 90)
						.addBox(-13.0F, -2.0137F, -25.4168F, 26.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(77, 0).addBox(-14.0F, -6.0137F, 7.5832F, 28.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(80, 36)
						.addBox(-14.0F, -8.0137F, 10.5832F, 28.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0137F, 3.4168F, -1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(68, 68).addBox(-0.999F, -5.836F, 1.1081F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -9.8905F, 12.4582F, 1.3265F, 0.0F, 0.0F));
		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(84, 68).mirror().addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(84, 68).addBox(19.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.0F, -9.5137F, 17.5832F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r3 = bone.addOrReplaceChild(
				"cube_r3", CubeListBuilder.create().texOffs(8, 36).mirror().addBox(-1.0F, -6.5F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(96, 64)
						.addBox(1.0F, -6.5F, -1.0F, 18.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 36).addBox(19.0F, -6.5F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.0F, -7.7637F, 7.3332F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(77, 0).mirror().addBox(-1.01F, -9.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(77, 0).addBox(19.01F, -9.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.0F, -11.1705F, 16.0382F, 1.3265F, 0.0F, 0.0F));
		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(47, 101).addBox(-1.5F, -3.5F, -6.5F, 5.0F, 7.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(83, 105).addBox(27.5F, -3.5F, -6.5F, 5.0F, 7.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.5F, 3.4863F, 18.0832F, 0.6981F, 0.0F, 0.0F));
		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -5.0F, -1.0F, 8.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0137F, 3.5832F, -0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 12).addBox(-3.0F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 14)
				.addBox(2.0F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 12).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.428F, -8.5026F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 19).addBox(-3.0F, -3.0F, 1.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(77, 13).addBox(-3.0F, 2.0F, 1.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 68)
						.addBox(-0.5F, -2.0F, 1.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 75).addBox(-1.0F, -1.0F, -3.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.9863F, -9.9168F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(119, 112).addBox(-5.0F, -4.5F, -1.5F, 10.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.4863F, 26.0832F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(80, 36).addBox(-1.0F, -0.739F, 3.9817F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -9.8905F, 12.4582F, 0.1745F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
