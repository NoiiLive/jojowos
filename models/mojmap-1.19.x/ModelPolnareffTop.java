// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelPolnareffTop<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "polnarefftop"), "main");
	private final ModelPart torso;
	private final ModelPart left_arm;
	private final ModelPart right_arm;

	public ModelPolnareffTop(ModelPart root) {
		this.torso = root.getChild("torso");
		this.left_arm = root.getChild("left_arm");
		this.right_arm = root.getChild("right_arm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition torso = partdefinition.addOrReplaceChild("torso",
				CubeListBuilder.create().texOffs(54, 17)
						.addBox(3.25F, 5.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(34, 52)
						.addBox(-4.25F, 5.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 6)
						.addBox(-4.0F, 5.0F, -2.25F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 56)
						.addBox(3.5789F, 2.5163F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(49, 44)
						.addBox(-4.0F, 2.5163F, -2.5789F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-4.0F, 5.0F, 1.25F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 49)
						.addBox(-4.0F, 2.5163F, 1.5789F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 60)
						.addBox(-4.5789F, 2.5163F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition torso_r1 = torso.addOrReplaceChild("torso_r1",
				CubeListBuilder.create().texOffs(64, 17).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1258F, 4.305F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition torso_r2 = torso.addOrReplaceChild("torso_r2",
				CubeListBuilder.create().texOffs(41, 64).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1258F, 4.305F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition torso_r3 = torso.addOrReplaceChild("torso_r3",
				CubeListBuilder.create().texOffs(12, 53).addBox(-4.0F, 0.0F, -0.5F, 8.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.305F, 2.1258F, -0.4363F, 0.0F, 0.0F));

		PartDefinition torso_r4 = torso.addOrReplaceChild("torso_r4",
				CubeListBuilder.create().texOffs(53, 15).addBox(-4.0F, 0.0F, -0.5F, 8.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.305F, -2.1258F, 0.4363F, 0.0F, 0.0F));

		PartDefinition torso_r5 = torso.addOrReplaceChild("torso_r5",
				CubeListBuilder.create().texOffs(44, 47).addBox(-1.0F, -3.0F, -0.4711F, 2.0F, 4.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.6F, 2.2163F, -2.0289F, 0.0F, 0.0F, 0.3927F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm",
				CubeListBuilder.create().texOffs(22, 55)
						.addBox(2.25F, 5.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 55)
						.addBox(-1.25F, 5.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(66, 53)
						.addBox(-1.0F, 5.0F, -2.25F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 22)
						.addBox(-1.0F, 5.0F, 1.25F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 14.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create()
				.texOffs(22, 55).mirror().addBox(-3.25F, 5.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(12, 55).mirror()
				.addBox(0.25F, 5.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(66, 53)
				.mirror().addBox(-3.0F, 5.0F, -2.25F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(66, 22).mirror().addBox(-3.0F, 5.0F, 1.25F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false), PartPose.offset(-5.0F, 14.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}