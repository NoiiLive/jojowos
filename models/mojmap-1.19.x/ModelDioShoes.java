// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelDioShoes<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "dioshoes"), "main");
	private final ModelPart left_shoe;
	private final ModelPart right_shoe;

	public ModelDioShoes(ModelPart root) {
		this.left_shoe = root.getChild("left_shoe");
		this.right_shoe = root.getChild("right_shoe");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition left_shoe = partdefinition.addOrReplaceChild("left_shoe",
				CubeListBuilder.create().texOffs(88, 12)
						.addBox(-2.0F, 7.05F, -2.25F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 84)
						.addBox(1.25F, 8.05F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 23)
						.addBox(-2.0F, 10.0F, -4.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 82)
						.addBox(1.25F, 10.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(55, 46)
						.addBox(-2.0F, 11.25F, -4.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(92, 61)
						.addBox(-2.0F, 8.05F, 1.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 58)
						.addBox(-2.0F, 10.0F, 1.25F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 84)
						.addBox(-2.25F, 8.05F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(82, 12)
						.addBox(-2.25F, 10.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition left_leg_r1 = left_shoe.addOrReplaceChild("left_leg_r1",
				CubeListBuilder.create().texOffs(26, 86).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 9.55F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition left_leg_r2 = left_shoe
				.addOrReplaceChild("left_leg_r2",
						CubeListBuilder.create().texOffs(96, 6).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 9.55F, 2.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition left_leg_r3 = left_shoe.addOrReplaceChild("left_leg_r3",
				CubeListBuilder.create().texOffs(96, 18).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.0F, -3.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition left_leg_r4 = left_shoe.addOrReplaceChild("left_leg_r4",
				CubeListBuilder.create().texOffs(96, 30).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.55F, -2.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition left_leg_r5 = left_shoe.addOrReplaceChild("left_leg_r5",
				CubeListBuilder.create().texOffs(36, 86).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 9.55F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition right_shoe = partdefinition.addOrReplaceChild("right_shoe", CubeListBuilder.create()
				.texOffs(88, 12).mirror().addBox(-2.0F, 7.05F, -2.25F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(52, 84).mirror()
				.addBox(-2.25F, 8.05F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(24, 23)
				.mirror().addBox(-2.0F, 10.0F, -4.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(20, 82).mirror().addBox(-2.25F, 10.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(55, 46).mirror()
				.addBox(-2.0F, 11.25F, -4.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(92, 61)
				.mirror().addBox(-2.0F, 8.05F, 1.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(88, 58).mirror().addBox(-2.0F, 10.0F, 1.25F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(80, 84).mirror()
				.addBox(1.25F, 8.05F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(82, 12)
				.mirror().addBox(1.25F, 10.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition right_leg_r1 = right_shoe.addOrReplaceChild("right_leg_r1",
				CubeListBuilder.create().texOffs(26, 86).mirror()
						.addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0F, 9.55F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition right_leg_r2 = right_shoe.addOrReplaceChild("right_leg_r2",
				CubeListBuilder.create().texOffs(96, 6).mirror()
						.addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.55F, 2.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition right_leg_r3 = right_shoe.addOrReplaceChild("right_leg_r3",
				CubeListBuilder.create().texOffs(96, 18).mirror()
						.addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 10.0F, -3.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition right_leg_r4 = right_shoe.addOrReplaceChild("right_leg_r4",
				CubeListBuilder.create().texOffs(96, 30).mirror()
						.addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 9.55F, -2.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition right_leg_r5 = right_shoe.addOrReplaceChild("right_leg_r5",
				CubeListBuilder.create().texOffs(36, 86).mirror()
						.addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, 9.55F, 0.0F, 0.0F, 0.0F, 0.0873F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		left_shoe.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_shoe.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}