// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelRedCape<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "redcape"), "main");
	private final ModelPart torso;

	public ModelRedCape(ModelPart root) {
		this.torso = root.getChild("torso");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition torso = partdefinition.addOrReplaceChild("torso", CubeListBuilder.create(),
				PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition cape = torso.addOrReplaceChild("cape", CubeListBuilder.create().texOffs(52, 21)
				.addBox(-18.543F, -10.9125F, -5.4606F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(50, 39)
				.addBox(-6.543F, -10.9125F, -5.4606F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 72)
				.addBox(-12.543F, -10.9125F, -2.4606F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(9.543F, 9.6625F, 2.9606F));

		PartDefinition torso_r1 = cape.addOrReplaceChild("torso_r1",
				CubeListBuilder.create().texOffs(24, 55)
						.addBox(-0.501F, -11.0F, -1.5F, 1.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 52)
						.addBox(-1.501F, -11.0F, -0.5F, 2.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, -0.0873F));

		PartDefinition torso_r2 = cape.addOrReplaceChild("torso_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -4.5F, -0.5F, 18.0F, 22.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.043F, -6.3861F, -0.5665F, 0.0873F, 0.0F, 0.0F));

		PartDefinition torso_r3 = cape.addOrReplaceChild("torso_r3",
				CubeListBuilder.create().texOffs(40, 52)
						.addBox(-0.499F, -11.0F, -0.5F, 2.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 52)
						.addBox(-0.499F, -11.0F, -1.5F, 1.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-19.0861F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0873F));

		PartDefinition torso_r4 = cape.addOrReplaceChild("torso_r4",
				CubeListBuilder.create().texOffs(0, 39).addBox(-0.5F, -4.5F, -2.5F, 1.0F, 22.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-18.5273F, -6.3867F, -3.0356F, 0.0F, 0.0F, 0.0873F));

		PartDefinition torso_r5 = cape.addOrReplaceChild("torso_r5",
				CubeListBuilder.create().texOffs(12, 39).addBox(-0.5F, -4.5F, -2.5F, 1.0F, 22.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5588F, -6.3867F, -3.0356F, 0.0F, 0.0F, -0.0873F));

		PartDefinition torso_r6 = cape.addOrReplaceChild("torso_r6",
				CubeListBuilder.create().texOffs(72, 59).addBox(-3.0F, -1.0F, -0.4997F, 6.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.291F, -4.9438F, -5.5559F, -0.0832F, 0.0262F, 0.3043F));

		PartDefinition torso_r7 = cape.addOrReplaceChild("torso_r7",
				CubeListBuilder.create().texOffs(69, 45).addBox(-3.0F, -0.2662F, -0.1296F, 6.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.4529F, -10.6367F, -5.4297F, -0.0873F, 0.0F, 0.0F));

		PartDefinition torso_r8 = cape.addOrReplaceChild("torso_r8",
				CubeListBuilder.create().texOffs(38, 21).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.4529F, -7.3905F, -5.7668F, -0.0852F, -0.0189F, -0.2174F));

		PartDefinition torso_r9 = cape.addOrReplaceChild("torso_r9",
				CubeListBuilder.create().texOffs(68, 73).addBox(-3.0F, -1.0F, -0.4997F, 6.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.795F, -4.9438F, -5.5559F, -0.0832F, -0.0262F, -0.3043F));

		PartDefinition torso_r10 = cape.addOrReplaceChild("torso_r10",
				CubeListBuilder.create().texOffs(67, 36).addBox(-3.0F, -0.2662F, -0.1296F, 6.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.6332F, -10.6367F, -5.4297F, -0.0873F, 0.0F, 0.0F));

		PartDefinition torso_r11 = cape.addOrReplaceChild("torso_r11",
				CubeListBuilder.create().texOffs(56, 100).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.4257F, -11.1133F, 3.3169F, -0.3054F, 0.0F, 0.3054F));

		PartDefinition torso_r12 = cape.addOrReplaceChild("torso_r12",
				CubeListBuilder.create().texOffs(52, 100).addBox(-0.5007F, -1.0F, -0.5F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.8243F, -11.1133F, 2.7155F, -0.3054F, 0.0F, 0.3054F));

		PartDefinition torso_r13 = cape.addOrReplaceChild("torso_r13",
				CubeListBuilder.create().texOffs(46, 8)
						.addBox(-0.5F, -1.0F, -2.5F, 1.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(82, 18)
						.addBox(-0.5F, 4.0F, 2.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.793F, -11.2125F, -2.9606F, 0.0F, 0.0F, 0.3054F));

		PartDefinition torso_r14 = cape.addOrReplaceChild("torso_r14",
				CubeListBuilder.create().texOffs(64, 16).addBox(-4.0F, -1.5F, -0.5F, 8.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.5706F, -6.9303F, 1.0419F, -1.0472F, 0.0F, 0.0F));

		PartDefinition torso_r15 = cape.addOrReplaceChild("torso_r15",
				CubeListBuilder.create().texOffs(80, 78)
						.addBox(-0.5F, 4.0F, 2.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 39)
						.addBox(-0.5F, -1.0F, -2.5F, 1.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.3482F, -11.2125F, -2.9606F, 0.0F, 0.0F, -0.3054F));

		PartDefinition torso_r16 = cape.addOrReplaceChild("torso_r16",
				CubeListBuilder.create().texOffs(65, 53).addBox(-4.0F, -1.0F, -0.5F, 8.0F, 5.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.5706F, -11.2125F, 3.3169F, -0.3054F, 0.0F, 0.0F));

		PartDefinition torso_r17 = cape.addOrReplaceChild("torso_r17",
				CubeListBuilder.create().texOffs(30, 73).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.7154F, -11.1133F, 3.3169F, -0.3054F, 0.0F, -0.3054F));

		PartDefinition torso_r18 = cape.addOrReplaceChild("torso_r18",
				CubeListBuilder.create().texOffs(20, 70).addBox(-0.4992F, -1.0F, -0.5F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.3169F, -11.1133F, 2.7155F, -0.3054F, 0.0F, -0.3054F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}