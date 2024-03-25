// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelLifeDetector<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "lifedetector"), "main");
	private final ModelPart detector;

	public ModelLifeDetector(ModelPart root) {
		this.detector = root.getChild("detector");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition detector = partdefinition.addOrReplaceChild("detector", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone = detector.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(8, 0)
						.addBox(-0.5F, -8.0F, -0.5F, 1.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 10)
						.addBox(0.0F, -12.5F, -1.5F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 19)
						.addBox(0.0F, 7.5F, -1.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -8.0F, 0.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(6, 19)
						.addBox(0.0F, -3.0F, -1.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(18, 15)
						.addBox(0.0F, -23.0F, -1.5F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.5F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone2 = detector
				.addOrReplaceChild("bone2",
						CubeListBuilder.create().texOffs(4, 0).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 16.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -8.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r2 = bone2.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(12, 15).addBox(0.0F, -3.0F, -1.5F, 0.0F, 5.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.5F, 3.0F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = bone2
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(6, 14).addBox(0.0F, -3.0F, -1.5F, 0.0F, 5.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -7.5F, 3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r4 = bone2.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(18, 0).addBox(0.0F, -3.0F, -1.5F, 0.0F, 5.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.5F, 3.0F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r5 = bone2
				.addOrReplaceChild("cube_r5",
						CubeListBuilder.create().texOffs(18, 5).addBox(0.0F, -3.0F, -1.5F, 0.0F, 5.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 7.5F, 3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bone3 = detector.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -8.0F, -2.5F, 1.0F, 16.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -10.0F, 0.0F, 0.0F, -1.5708F, 1.5708F));

		PartDefinition cube_r6 = bone3.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(12, 0).addBox(0.0F, -3.0F, -1.5F, 0.0F, 5.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.5F, 1.0F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r7 = bone3
				.addOrReplaceChild("cube_r7",
						CubeListBuilder.create().texOffs(12, 5).addBox(0.0F, -3.0F, -1.5F, 0.0F, 5.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -7.5F, 1.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r8 = bone3.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(12, 10).addBox(0.0F, -3.0F, -1.5F, 0.0F, 5.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.5F, 1.0F, 1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r9 = bone3
				.addOrReplaceChild("cube_r9",
						CubeListBuilder.create().texOffs(0, 14).addBox(0.0F, -3.0F, -1.5F, 0.0F, 5.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 7.5F, 1.0F, 1.5708F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		detector.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}