// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelIggySit<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "iggysit"), "main");
	private final ModelPart iggybody;

	public ModelIggySit(ModelPart root) {
		this.iggybody = root.getChild("iggybody");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition iggybody = partdefinition.addOrReplaceChild("iggybody", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-2.5F, -3.375F, -5.0F, 5.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 21.275F, 2.0F));

		PartDefinition cube_r1 = iggybody.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(24, 20).addBox(0.5F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -3.625F, 6.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition iggyhead = iggybody.addOrReplaceChild("iggyhead",
				CubeListBuilder.create().texOffs(0, 16)
						.addBox(-3.0F, -2.85F, -4.5F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(18, 16)
						.addBox(-2.0F, 0.15F, -5.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.525F, -4.5F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r2 = iggyhead.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(16, 28).addBox(-1.5F, -2.0F, -0.5F, 3.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.9F, -3.1F, 0.0F, -0.4363F, 0.0F, -0.6981F));

		PartDefinition cube_r3 = iggyhead.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(24, 28).addBox(-1.5F, -2.0F, -0.5F, 3.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.9F, -3.1F, 0.0F, -0.4363F, 0.0F, 0.6981F));

		PartDefinition iggyfront_left_leg = iggybody.addOrReplaceChild("iggyfront_left_leg", CubeListBuilder.create(),
				PartPose.offsetAndRotation(3.25F, -0.625F, -1.5F, -1.0435F, -0.1133F, -0.0657F));

		PartDefinition cube_r4 = iggyfront_left_leg
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(20, 0).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 5.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.25F, 2.0F, 0.5F, 0.3054F, 0.0F, 0.0F));

		PartDefinition iggylower_left_1 = iggyfront_left_leg.addOrReplaceChild("iggylower_left_1",
				CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.25F, 3.5708F, 2.0551F, 0.0077F, 0.1739F, 0.3066F));

		PartDefinition cube_r5 = iggylower_left_1.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(8, 28).addBox(-1.001F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.2679F, -1.866F, -0.5236F, 0.0F, 0.0F));

		PartDefinition iggyleft_paw_1 = iggylower_left_1.addOrReplaceChild("iggyleft_paw_1",
				CubeListBuilder.create().texOffs(25, 4).addBox(-1.002F, -1.0292F, -2.9449F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.5292F, -2.0551F, 1.0764F, 0.1062F, 0.19F));

		PartDefinition iggyfront_right_leg = iggybody.addOrReplaceChild("iggyfront_right_leg", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-3.25F, -0.625F, -1.5F, -1.0435F, 0.1133F, 0.0657F));

		PartDefinition cube_r6 = iggyfront_right_leg.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(20, 0).mirror()
						.addBox(-1.0F, -3.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.25F, 2.0F, 0.5F, 0.3054F, 0.0F, 0.0F));

		PartDefinition iggylower_right_1 = iggyfront_right_leg.addOrReplaceChild("iggylower_right_1",
				CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.25F, 3.5708F, 2.0551F, 0.0077F, -0.1739F, -0.3066F));

		PartDefinition cube_r7 = iggylower_right_1.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(8, 28).mirror()
						.addBox(-0.999F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.2679F, -1.866F, -0.5236F, 0.0F, 0.0F));

		PartDefinition iggyright_paw_1 = iggylower_right_1.addOrReplaceChild("iggyright_paw_1",
				CubeListBuilder.create().texOffs(25, 4).mirror()
						.addBox(-0.998F, -1.0292F, -2.9449F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.5292F, -2.0551F, 1.0764F, -0.1062F, -0.19F));

		PartDefinition iggyback_left_leg = iggybody.addOrReplaceChild("iggyback_left_leg", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.75F, 0.825F, 4.5F, -1.7002F, -0.2615F, -0.0117F));

		PartDefinition cube_r8 = iggyback_left_leg.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.5F, -1.5F, 2.0F, 5.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.75F, 1.5F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r9 = iggyback_left_leg.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(28, 14).addBox(-1.001F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.75F, 4.0579F, 0.0797F, 0.8727F, 0.0F, 0.0F));

		PartDefinition iggylower_left_2 = iggyback_left_leg.addOrReplaceChild("iggylower_left_2",
				CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.75F, 4.2313F, 1.8311F, 0.7288F, -0.2071F, 0.532F));

		PartDefinition cube_r10 = iggylower_left_2.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(0, 28).addBox(-1.002F, -1.5F, -1.0F, 2.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.9616F, -1.4998F, -0.4363F, 0.0F, 0.0F));

		PartDefinition iggyleft_paw_2 = iggylower_left_2.addOrReplaceChild("iggyleft_paw_2",
				CubeListBuilder.create().texOffs(24, 24).addBox(-1.003F, -1.0F, -3.0F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.65F, -1.65F, 0.9163F, 0.0F, 0.0F));

		PartDefinition iggyback_right_leg = iggybody.addOrReplaceChild("iggyback_right_leg", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-1.75F, 0.825F, 4.5F, -1.7002F, 0.2615F, 0.0117F));

		PartDefinition cube_r11 = iggyback_right_leg.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-1.0F, -2.5F, -1.5F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.75F, 1.5F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r12 = iggyback_right_leg.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(28, 14).mirror()
						.addBox(-0.999F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.75F, 4.0579F, 0.0797F, 0.8727F, 0.0F, 0.0F));

		PartDefinition iggylower_right_2 = iggyback_right_leg.addOrReplaceChild("iggylower_right_2",
				CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.75F, 4.2313F, 1.8311F, 0.7288F, 0.2071F, -0.532F));

		PartDefinition cube_r13 = iggylower_right_2.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(0, 28).mirror()
						.addBox(-0.998F, -1.5F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.9616F, -1.4998F, -0.4363F, 0.0F, 0.0F));

		PartDefinition iggyright_paw_2 = iggylower_right_2.addOrReplaceChild("iggyright_paw_2",
				CubeListBuilder.create().texOffs(24, 24).mirror()
						.addBox(-0.997F, -1.0F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.65F, -1.65F, 0.9163F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		iggybody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}