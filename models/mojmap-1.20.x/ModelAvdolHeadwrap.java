// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelAvdolHeadwrap<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "avdolheadwrap"), "main");
	private final ModelPart avdolhead;

	public ModelAvdolHeadwrap(ModelPart root) {
		this.avdolhead = root.getChild("avdolhead");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition avdolhead = partdefinition.addOrReplaceChild("avdolhead", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition head_r1 = avdolhead.addOrReplaceChild("head_r1",
				CubeListBuilder.create().texOffs(48, 0).addBox(-4.9472F, -0.5987F, -4.494F, 5.0F, 1.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.9198F, 0.044F, -0.1298F, 0.017F, 0.1298F));

		PartDefinition head_r2 = avdolhead.addOrReplaceChild("head_r2",
				CubeListBuilder.create().texOffs(42, 17).addBox(-4.8825F, -0.8928F, -4.5F, 5.0F, 2.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.9198F, 0.044F, -0.1298F, -0.017F, -0.1298F));

		PartDefinition head_r3 = avdolhead.addOrReplaceChild("head_r3",
				CubeListBuilder.create().texOffs(52, 28).addBox(-0.0528F, -0.5987F, -4.494F, 5.0F, 1.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.9198F, 0.044F, -0.1298F, -0.017F, -0.1298F));

		PartDefinition head_r4 = avdolhead.addOrReplaceChild("head_r4",
				CubeListBuilder.create().texOffs(43, 38).addBox(-0.1175F, -0.8928F, -4.5F, 5.0F, 2.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.9198F, 0.044F, -0.1298F, 0.017F, 0.1298F));

		PartDefinition necklace = avdolhead.addOrReplaceChild("necklace", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -2.5F, -1.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition head_r5 = necklace.addOrReplaceChild("head_r5",
				CubeListBuilder.create().texOffs(57, 92).addBox(-2.9192F, -2.5474F, -0.6148F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.4145F, 3.0165F, -1.1703F, -0.4408F, 0.1964F, 0.5231F));

		PartDefinition head_r6 = necklace.addOrReplaceChild("head_r6",
				CubeListBuilder.create().texOffs(20, 92).addBox(-2.1321F, -1.9718F, 0.0116F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.4145F, 3.0165F, -1.1703F, -0.5957F, -0.6519F, 0.2276F));

		PartDefinition head_r7 = necklace.addOrReplaceChild("head_r7",
				CubeListBuilder.create().texOffs(76, 84).addBox(-2.1665F, -0.7657F, -0.8101F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.4145F, 3.0165F, -1.1703F, -0.3154F, -0.1693F, -0.3384F));

		PartDefinition head_r8 = necklace.addOrReplaceChild("head_r8",
				CubeListBuilder.create().texOffs(52, 84).addBox(-0.7056F, -4.9443F, -0.2081F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.4566F, -2.1698F, 0.1067F, -0.7291F, -1.1911F));

		PartDefinition head_r9 = necklace.addOrReplaceChild("head_r9",
				CubeListBuilder.create().texOffs(47, 71).addBox(-0.4684F, -3.0801F, 0.9064F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.4566F, -2.1698F, 0.3386F, 0.152F, -1.3727F));

		PartDefinition head_r10 = necklace.addOrReplaceChild("head_r10",
				CubeListBuilder.create().texOffs(82, 94).addBox(0.9192F, -2.5474F, -0.6148F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4145F, 3.0165F, -1.1703F, -0.4408F, -0.1964F, -0.5231F));

		PartDefinition head_r11 = necklace.addOrReplaceChild("head_r11",
				CubeListBuilder.create().texOffs(76, 94).addBox(0.1321F, -1.9718F, 0.0116F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4145F, 3.0165F, -1.1703F, -0.5957F, 0.6519F, -0.2276F));

		PartDefinition head_r12 = necklace.addOrReplaceChild("head_r12",
				CubeListBuilder.create().texOffs(70, 94).addBox(0.1665F, -0.7657F, -0.8101F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4145F, 3.0165F, -1.1703F, -0.3154F, 0.1693F, 0.3384F));

		PartDefinition head_r13 = necklace.addOrReplaceChild("head_r13",
				CubeListBuilder.create().texOffs(4, 93).addBox(-1.2944F, -4.9443F, -0.2081F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.4566F, -2.1698F, 0.1067F, 0.7291F, 1.1911F));

		PartDefinition head_r14 = necklace.addOrReplaceChild("head_r14",
				CubeListBuilder.create().texOffs(14, 33)
						.addBox(-1.0F, 1.0434F, 0.1708F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(-1.5F, -1.4566F, 0.1698F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.4566F, -2.1698F, 0.4363F, 0.0F, 0.0F));

		PartDefinition head_r15 = necklace.addOrReplaceChild("head_r15",
				CubeListBuilder.create().texOffs(92, 86).addBox(-1.5316F, -3.0801F, 0.9064F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.4566F, -2.1698F, 0.3386F, -0.152F, 1.3727F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		avdolhead.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}