// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelAvdolPants<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "avdolpants"), "main");
	private final ModelPart body;
	private final ModelPart avdolleft_leg;
	private final ModelPart avdolright_leg;

	public ModelAvdolPants(ModelPart root) {
		this.body = root.getChild("body");
		this.avdolleft_leg = root.getChild("avdolleft_leg");
		this.avdolright_leg = root.getChild("avdolright_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(71, 32)
						.addBox(-4.0F, 11.0F, -2.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(71, 10)
						.addBox(-4.0F, 10.0F, -2.7F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 61)
						.addBox(-3.0F, 11.0F, -2.7F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(71, 12)
						.addBox(-4.0F, 9.0F, -2.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 71)
						.addBox(3.0F, 11.0F, -2.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(85, 14)
						.addBox(3.4F, 11.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(84, 76)
						.addBox(3.7F, 10.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(70, 84)
						.addBox(3.5F, 9.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(80, 84)
						.addBox(3.0F, 11.25F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 10)
						.addBox(-3.0F, 11.35F, -2.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(85, 0)
						.addBox(-4.0F, 11.25F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(6, 85)
						.addBox(-4.4F, 11.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(84, 45)
						.addBox(-4.7F, 10.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(84, 50)
						.addBox(-4.5F, 9.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(70, 26)
						.addBox(-4.0F, 9.0F, 1.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 45)
						.addBox(-4.0F, 10.0F, 1.7F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 8)
						.addBox(-3.0F, 11.0F, 1.7F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(53, 0)
						.addBox(-4.0F, 11.0F, 1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 31)
						.addBox(3.0F, 11.0F, 1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition avdolleft_leg = partdefinition.addOrReplaceChild("avdolleft_leg",
				CubeListBuilder.create().texOffs(80, 45)
						.addBox(-2.0F, 0.0F, -2.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 78)
						.addBox(-2.0F, 0.0F, 1.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 83)
						.addBox(-2.5F, 0.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 83)
						.addBox(1.4F, 0.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(82, 71)
						.addBox(-2.4F, 1.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(76, 49)
						.addBox(0.0F, -0.25F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(8, 28)
						.addBox(-2.0F, -0.35F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(79, 24)
						.addBox(0.0F, 0.0F, -2.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 22)
						.addBox(0.0F, 1.0F, -2.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 17)
						.addBox(0.0F, 1.0F, 1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 17)
						.addBox(-2.0F, 1.0F, -2.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 35)
						.addBox(-2.0F, 1.0F, 1.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 35)
						.addBox(0.0F, 0.0F, 1.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition left_leg_r1 = avdolleft_leg.addOrReplaceChild("left_leg_r1",
				CubeListBuilder.create().texOffs(88, 40).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.6526F, 2.0853F, 0.0873F, 0.0F, 0.0F));

		PartDefinition right_leg_r1 = avdolleft_leg.addOrReplaceChild("right_leg_r1",
				CubeListBuilder.create().texOffs(76, 37).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1724F, 3.6488F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition left_leg_r2 = avdolleft_leg.addOrReplaceChild("left_leg_r2",
				CubeListBuilder.create().texOffs(22, 31).addBox(-2.0F, -2.0F, -0.5F, 4.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.4039F, 1.7571F, -0.2618F, 0.0F, 0.0F));

		PartDefinition left_leg_r3 = avdolleft_leg.addOrReplaceChild("left_leg_r3",
				CubeListBuilder.create().texOffs(16, 88).addBox(-2.0F, -2.0F, -0.5F, 4.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.4039F, -1.7571F, 0.2618F, 0.0F, 0.0F));

		PartDefinition left_leg_r4 = avdolleft_leg.addOrReplaceChild("left_leg_r4",
				CubeListBuilder.create().texOffs(56, 88).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.6526F, -2.0853F, -0.0873F, 0.0F, 0.0F));

		PartDefinition right_leg_r2 = avdolleft_leg.addOrReplaceChild("right_leg_r2",
				CubeListBuilder.create().texOffs(50, 71).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8865F, 5.9209F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition left_leg_r5 = avdolleft_leg.addOrReplaceChild("left_leg_r5",
				CubeListBuilder.create().texOffs(12, 75).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8865F, 5.9209F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition left_leg_r6 = avdolleft_leg.addOrReplaceChild("left_leg_r6",
				CubeListBuilder.create().texOffs(38, 76).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.1724F, 3.6488F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition right_leg_r3 = avdolleft_leg.addOrReplaceChild("right_leg_r3",
				CubeListBuilder.create().texOffs(48, 28)
						.addBox(-0.75F, -0.9995F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(16, 67)
						.addBox(-0.5F, -1.0005F, 2.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(82, 55)
						.addBox(-0.5F, -1.0005F, -3.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.25F, 5.0505F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition left_leg_r7 = avdolleft_leg.addOrReplaceChild("left_leg_r7",
				CubeListBuilder.create().texOffs(71, 30)
						.addBox(0.0F, -0.9995F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 5)
						.addBox(-2.25F, -1.0005F, -3.01F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 77)
						.addBox(-2.25F, -1.0005F, 2.01F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0747F, 5.2828F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition left_leg_r8 = avdolleft_leg.addOrReplaceChild("left_leg_r8",
				CubeListBuilder.create().texOffs(24, 0).addBox(-3.0F, -1.0F, -3.0F, 6.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.05F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition avdolright_leg = partdefinition.addOrReplaceChild("avdolright_leg", CubeListBuilder.create()
				.texOffs(80, 45).mirror().addBox(0.0F, 0.0F, -2.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(74, 78).mirror()
				.addBox(0.0F, 0.0F, 1.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(34, 83)
				.mirror().addBox(1.5F, 0.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 83).mirror().addBox(-2.4F, 0.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(82, 71).mirror()
				.addBox(1.4F, 1.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(76, 49)
				.mirror().addBox(-2.0F, -0.25F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(8, 28).mirror().addBox(0.0F, -0.35F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(79, 24).mirror()
				.addBox(-2.0F, 0.0F, -2.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(47, 22)
				.mirror().addBox(-1.0F, 1.0F, -2.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(47, 17).mirror().addBox(-1.0F, 1.0F, 1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(39, 17).mirror()
				.addBox(0.0F, 1.0F, -2.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(22, 35)
				.mirror().addBox(0.0F, 1.0F, 1.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(52, 35).mirror().addBox(-2.0F, 0.0F, 1.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false), PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition right_leg_r4 = avdolright_leg.addOrReplaceChild("right_leg_r4",
				CubeListBuilder.create().texOffs(88, 40).mirror()
						.addBox(-2.0F, -1.0F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 2.6526F, 2.0853F, 0.0873F, 0.0F, 0.0F));

		PartDefinition left_leg_r9 = avdolright_leg.addOrReplaceChild("left_leg_r9",
				CubeListBuilder.create().texOffs(76, 37).mirror()
						.addBox(-0.5F, -2.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.1724F, 3.6488F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition right_leg_r5 = avdolright_leg.addOrReplaceChild("right_leg_r5",
				CubeListBuilder.create().texOffs(22, 31).mirror()
						.addBox(-2.0F, -2.0F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.4039F, 1.7571F, -0.2618F, 0.0F, 0.0F));

		PartDefinition right_leg_r6 = avdolright_leg.addOrReplaceChild("right_leg_r6",
				CubeListBuilder.create().texOffs(16, 88).mirror()
						.addBox(-2.0F, -2.0F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.4039F, -1.7571F, 0.2618F, 0.0F, 0.0F));

		PartDefinition right_leg_r7 = avdolright_leg.addOrReplaceChild("right_leg_r7",
				CubeListBuilder.create().texOffs(56, 88).mirror()
						.addBox(-2.0F, -1.0F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 2.6526F, -2.0853F, -0.0873F, 0.0F, 0.0F));

		PartDefinition left_leg_r10 = avdolright_leg.addOrReplaceChild("left_leg_r10",
				CubeListBuilder.create().texOffs(50, 71).mirror()
						.addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.8865F, 5.9209F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition right_leg_r8 = avdolright_leg.addOrReplaceChild("right_leg_r8",
				CubeListBuilder.create().texOffs(12, 75).mirror()
						.addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.8865F, 5.9209F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition right_leg_r9 = avdolright_leg.addOrReplaceChild("right_leg_r9",
				CubeListBuilder.create().texOffs(38, 76).mirror()
						.addBox(-0.5F, -2.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.1724F, 3.6488F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition left_leg_r11 = avdolright_leg.addOrReplaceChild("left_leg_r11",
				CubeListBuilder.create().texOffs(48, 28).mirror()
						.addBox(-0.25F, -0.9995F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(16, 67).mirror()
						.addBox(-2.5F, -1.0005F, 2.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(82, 55).mirror()
						.addBox(-2.5F, -1.0005F, -3.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.25F, 5.0505F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition right_leg_r10 = avdolright_leg.addOrReplaceChild("right_leg_r10",
				CubeListBuilder.create().texOffs(71, 30).mirror()
						.addBox(-1.0F, -0.9995F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 5).mirror()
						.addBox(-0.75F, -1.0005F, -3.01F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(34, 77).mirror()
						.addBox(-0.75F, -1.0005F, 2.01F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0747F, 5.2828F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition right_leg_r11 = avdolright_leg.addOrReplaceChild("right_leg_r11",
				CubeListBuilder.create().texOffs(24, 0).mirror()
						.addBox(-3.0F, -1.0F, -3.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 2.05F, 0.0F, 0.0F, 0.0F, 0.2182F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		avdolleft_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		avdolright_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}