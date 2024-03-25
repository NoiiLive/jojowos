// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelJosephJoestarPants<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "josephjoestarpants"), "main");
	private final ModelPart body;
	private final ModelPart left_leg;
	private final ModelPart right_leg;

	public ModelJosephJoestarPants(ModelPart root) {
		this.body = root.getChild("body");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(27, 14)
						.addBox(-4.0F, 11.25F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(84, 45)
						.addBox(3.5F, 10.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 83)
						.addBox(-4.5F, 10.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(64, 48)
						.addBox(-4.0F, 10.0F, -2.5F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(55, 68)
						.addBox(-4.0F, 9.0F, -2.4F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 31)
						.addBox(-1.0F, 9.1F, -2.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 12)
						.addBox(-4.0F, 9.0F, 1.4F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(87, 71)
						.addBox(3.4F, 9.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(87, 66)
						.addBox(-4.4F, 9.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(30, 64)
						.addBox(-4.0F, 10.0F, 1.5F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(65, 29)
				.addBox(-2.0F, -0.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition right_leg_r1 = left_leg.addOrReplaceChild("right_leg_r1",
				CubeListBuilder.create().texOffs(54, 84).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1724F, 7.7517F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition right_leg_r2 = left_leg.addOrReplaceChild("right_leg_r2",
				CubeListBuilder.create().texOffs(67, 75).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1724F, 5.8464F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition right_leg_r3 = left_leg.addOrReplaceChild("right_leg_r3",
				CubeListBuilder.create().texOffs(21, 69).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1724F, 1.9488F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition left_leg_r1 = left_leg.addOrReplaceChild("left_leg_r1",
				CubeListBuilder.create().texOffs(31, 69).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.1724F, 1.9488F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition left_leg_r2 = left_leg.addOrReplaceChild("left_leg_r2",
				CubeListBuilder.create().texOffs(9, 93).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.7517F, 2.1724F, 0.0873F, 0.0F, 0.0F));

		PartDefinition left_leg_r3 = left_leg.addOrReplaceChild("left_leg_r3",
				CubeListBuilder.create().texOffs(88, 39).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.8502F, 2.2596F, -0.0873F, 0.0F, 0.0F));

		PartDefinition left_leg_r4 = left_leg.addOrReplaceChild("left_leg_r4",
				CubeListBuilder.create().texOffs(85, 87).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.9526F, 2.0853F, 0.0873F, 0.0F, 0.0F));

		PartDefinition left_leg_r5 = left_leg.addOrReplaceChild("left_leg_r5",
				CubeListBuilder.create().texOffs(88, 6).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.9526F, -2.0853F, -0.0873F, 0.0F, 0.0F));

		PartDefinition left_leg_r6 = left_leg.addOrReplaceChild("left_leg_r6",
				CubeListBuilder.create().texOffs(75, 71).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.1724F, 5.8464F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition left_leg_r7 = left_leg.addOrReplaceChild("left_leg_r7",
				CubeListBuilder.create().texOffs(89, 0).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.8502F, -2.2596F, 0.0873F, 0.0F, 0.0F));

		PartDefinition left_leg_r8 = left_leg.addOrReplaceChild("left_leg_r8",
				CubeListBuilder.create().texOffs(93, 14).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.7517F, -2.1724F, -0.0873F, 0.0F, 0.0F));

		PartDefinition left_leg_r9 = left_leg.addOrReplaceChild("left_leg_r9",
				CubeListBuilder.create().texOffs(69, 84).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.1724F, 7.7517F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg",
				CubeListBuilder.create().texOffs(65, 29).mirror()
						.addBox(-2.0F, -0.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition left_leg_r10 = right_leg.addOrReplaceChild("left_leg_r10",
				CubeListBuilder.create().texOffs(54, 84).mirror()
						.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.1724F, 7.7517F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition left_leg_r11 = right_leg.addOrReplaceChild("left_leg_r11",
				CubeListBuilder.create().texOffs(67, 75).mirror()
						.addBox(-0.5F, -2.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.1724F, 5.8464F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition left_leg_r12 = right_leg.addOrReplaceChild("left_leg_r12",
				CubeListBuilder.create().texOffs(21, 69).mirror()
						.addBox(-0.5F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.1724F, 1.9488F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition right_leg_r4 = right_leg.addOrReplaceChild("right_leg_r4",
				CubeListBuilder.create().texOffs(31, 69).mirror()
						.addBox(-0.5F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.1724F, 1.9488F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition right_leg_r5 = right_leg.addOrReplaceChild("right_leg_r5",
				CubeListBuilder.create().texOffs(9, 93).mirror()
						.addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 7.7517F, 2.1724F, 0.0873F, 0.0F, 0.0F));

		PartDefinition right_leg_r6 = right_leg.addOrReplaceChild("right_leg_r6",
				CubeListBuilder.create().texOffs(88, 39).mirror()
						.addBox(-2.0F, -1.0F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.8502F, 2.2596F, -0.0873F, 0.0F, 0.0F));

		PartDefinition right_leg_r7 = right_leg.addOrReplaceChild("right_leg_r7",
				CubeListBuilder.create().texOffs(85, 87).mirror()
						.addBox(-2.0F, -1.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.9526F, 2.0853F, 0.0873F, 0.0F, 0.0F));

		PartDefinition right_leg_r8 = right_leg.addOrReplaceChild("right_leg_r8",
				CubeListBuilder.create().texOffs(88, 6).mirror()
						.addBox(-2.0F, -1.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.9526F, -2.0853F, -0.0873F, 0.0F, 0.0F));

		PartDefinition right_leg_r9 = right_leg.addOrReplaceChild("right_leg_r9",
				CubeListBuilder.create().texOffs(75, 71).mirror()
						.addBox(-0.5F, -2.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.1724F, 5.8464F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition right_leg_r10 = right_leg.addOrReplaceChild("right_leg_r10",
				CubeListBuilder.create().texOffs(89, 0).mirror()
						.addBox(-2.0F, -1.0F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.8502F, -2.2596F, 0.0873F, 0.0F, 0.0F));

		PartDefinition right_leg_r11 = right_leg.addOrReplaceChild("right_leg_r11",
				CubeListBuilder.create().texOffs(93, 14).mirror()
						.addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 7.7517F, -2.1724F, -0.0873F, 0.0F, 0.0F));

		PartDefinition right_leg_r12 = right_leg.addOrReplaceChild("right_leg_r12",
				CubeListBuilder.create().texOffs(69, 84).mirror()
						.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.1724F, 7.7517F, 0.0F, 0.0F, 0.0F, 0.0873F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}