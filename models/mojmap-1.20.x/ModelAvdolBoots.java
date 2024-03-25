// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelAvdolBoots<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "avdolboots"), "main");
	private final ModelPart avdolleft_boot;
	private final ModelPart avdolright_boot;

	public ModelAvdolBoots(ModelPart root) {
		this.avdolleft_boot = root.getChild("avdolleft_boot");
		this.avdolright_boot = root.getChild("avdolright_boot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition avdolleft_boot = partdefinition.addOrReplaceChild("avdolleft_boot",
				CubeListBuilder.create().texOffs(76, 69)
						.addBox(-2.25F, 10.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 58)
						.addBox(-2.0F, 10.0F, -4.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(62, 38)
						.addBox(-2.0F, 11.25F, -4.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(28, 78)
						.addBox(1.25F, 10.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(6, 76)
						.addBox(-2.0F, 10.0F, 1.25F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition left_leg_r1 = avdolleft_boot.addOrReplaceChild("left_leg_r1",
				CubeListBuilder.create().texOffs(88, 35).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.5621F, 1.8826F, -0.0873F, 0.0F, 0.0F));

		PartDefinition left_leg_r2 = avdolleft_boot.addOrReplaceChild("left_leg_r2",
				CubeListBuilder.create().texOffs(0, 76).addBox(1.0F, -1.0F, -3.5F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4319F, 7.9333F, 1.5F, 0.0F, 0.0F, 0.0873F));

		PartDefinition right_leg_r1 = avdolleft_boot.addOrReplaceChild("right_leg_r1",
				CubeListBuilder.create().texOffs(22, 75).addBox(-2.0F, -1.0F, -3.5F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4319F, 7.9333F, 1.5F, 0.0F, 0.0F, -0.0873F));

		PartDefinition left_leg_r3 = avdolleft_boot.addOrReplaceChild("left_leg_r3",
				CubeListBuilder.create().texOffs(88, 31).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.5621F, -1.8826F, 0.0873F, 0.0F, 0.0F));

		PartDefinition avdolright_boot = partdefinition.addOrReplaceChild("avdolright_boot", CubeListBuilder.create()
				.texOffs(76, 69).mirror().addBox(1.25F, 10.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(16, 58).mirror()
				.addBox(-2.0F, 10.0F, -4.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(62, 38)
				.mirror().addBox(-2.0F, 11.25F, -4.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(28, 78).mirror().addBox(-2.25F, 10.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(6, 76).mirror()
				.addBox(-2.0F, 10.0F, 1.25F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition right_leg_r2 = avdolright_boot.addOrReplaceChild("right_leg_r2",
				CubeListBuilder.create().texOffs(88, 35).mirror()
						.addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 8.5621F, 1.8826F, -0.0873F, 0.0F, 0.0F));

		PartDefinition right_leg_r3 = avdolright_boot.addOrReplaceChild("right_leg_r3",
				CubeListBuilder.create().texOffs(0, 76).mirror()
						.addBox(-2.0F, -1.0F, -3.5F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.4319F, 7.9333F, 1.5F, 0.0F, 0.0F, -0.0873F));

		PartDefinition left_leg_r4 = avdolright_boot.addOrReplaceChild("left_leg_r4",
				CubeListBuilder.create().texOffs(22, 75).mirror()
						.addBox(1.0F, -1.0F, -3.5F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.4319F, 7.9333F, 1.5F, 0.0F, 0.0F, 0.0873F));

		PartDefinition right_leg_r4 = avdolright_boot.addOrReplaceChild("right_leg_r4",
				CubeListBuilder.create().texOffs(88, 31).mirror()
						.addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 8.5621F, -1.8826F, 0.0873F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		avdolleft_boot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		avdolright_boot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}