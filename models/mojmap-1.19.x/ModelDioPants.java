// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelDioPants<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "diopants"), "main");
	private final ModelPart body;
	private final ModelPart left_leg;
	private final ModelPart right_leg;

	public ModelDioPants(ModelPart root) {
		this.body = root.getChild("body");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(50, 0)
						.addBox(-2.0F, 11.25F, -2.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(36, 39)
						.addBox(-2.5F, 10.0F, -2.25F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(69, 24)
						.addBox(-4.0F, 9.5F, -2.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 75)
						.addBox(-4.0F, 11.5F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 75)
						.addBox(2.0F, 11.5F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(6, 88)
						.addBox(-2.0F, 11.5F, 1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(83, 41)
						.addBox(3.5F, 9.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(69, 22)
						.addBox(-4.0F, 9.5F, 1.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(83, 36)
						.addBox(-4.5F, 9.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition torso_r1 = body.addOrReplaceChild("torso_r1",
				CubeListBuilder.create().texOffs(40, 80).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9513F, 11.1988F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition torso_r2 = body.addOrReplaceChild("torso_r2",
				CubeListBuilder.create().texOffs(66, 31).addBox(-4.0F, -1.0F, -0.5F, 8.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 11.1988F, 1.9513F, -0.2182F, 0.0F, 0.0F));

		PartDefinition torso_r3 = body.addOrReplaceChild("torso_r3",
				CubeListBuilder.create().texOffs(80, 64).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9513F, 11.1988F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition torso_r4 = body.addOrReplaceChild("torso_r4",
				CubeListBuilder.create().texOffs(76, 103)
						.addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 83)
						.addBox(-0.5F, 0.0F, 0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(85, 103)
						.addBox(-0.5F, -1.0F, 3.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.2526F, 13.3598F, -2.2F, 0.0F, 0.0F, 1.4835F));

		PartDefinition torso_r5 = body.addOrReplaceChild("torso_r5",
				CubeListBuilder.create().texOffs(43, 103)
						.addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(89, 103)
						.addBox(-0.5F, -1.0F, 3.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5968F, 12.8378F, -2.2F, 0.0F, 0.0F, 1.0472F));

		PartDefinition torso_r6 = body.addOrReplaceChild("torso_r6",
				CubeListBuilder.create().texOffs(103, 37)
						.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 88)
						.addBox(-0.5F, -1.5F, 3.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3F, 11.2F, -2.2F, 0.0F, 0.0F, 0.4363F));

		PartDefinition torso_r7 = body.addOrReplaceChild("torso_r7",
				CubeListBuilder.create().texOffs(94, 100)
						.addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 103)
						.addBox(-0.5F, -0.5F, -4.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3F, 11.2F, 2.2F, 0.0F, 0.0F, -0.4363F));

		PartDefinition torso_r8 = body.addOrReplaceChild("torso_r8",
				CubeListBuilder.create().texOffs(103, 91)
						.addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(101, 103)
						.addBox(-0.5F, -1.0F, -4.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5968F, 12.8378F, 2.2F, 0.0F, 0.0F, -1.0472F));

		PartDefinition torso_r9 = body.addOrReplaceChild("torso_r9",
				CubeListBuilder.create().texOffs(103, 95)
						.addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(83, 22)
						.addBox(-0.5F, 0.0F, -4.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(97, 103)
						.addBox(-0.5F, -1.0F, -4.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.2526F, 13.3598F, 2.2F, 0.0F, 0.0F, -1.4835F));

		PartDefinition torso_r10 = body.addOrReplaceChild("torso_r10",
				CubeListBuilder.create().texOffs(98, 80).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0834F, 11.3876F, -2.0316F, 0.2174F, -0.0189F, 0.0852F));

		PartDefinition torso_r11 = body.addOrReplaceChild("torso_r11",
				CubeListBuilder.create().texOffs(81, 36).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0834F, 11.3876F, -2.0316F, 0.2174F, 0.0189F, -0.0852F));

		PartDefinition left_leg_r1 = body.addOrReplaceChild("left_leg_r1",
				CubeListBuilder.create().texOffs(60, 96)
						.addBox(-1.25F, -1.25F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 81)
						.addBox(-1.25F, -0.25F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3536F, 10.1787F, -2.25F, 0.0F, 0.0F, -0.7854F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg",
				CubeListBuilder.create().texOffs(88, 99)
						.addBox(-2.0F, 0.0F, -2.25F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 53)
						.addBox(-2.25F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(94, 94)
						.addBox(-2.0F, 4.7F, -2.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(93, 44)
						.addBox(-2.0F, 4.7F, 1.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 86)
						.addBox(1.5F, 4.7F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 86)
						.addBox(-2.5F, 4.7F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(81, 27)
						.addBox(-2.0F, -0.35F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 32)
						.addBox(0.0F, -0.35F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(-2.0F, -0.25F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition left_leg_r2 = left_leg.addOrReplaceChild("left_leg_r2",
				CubeListBuilder.create().texOffs(98, 36)
						.addBox(-1.25F, -1.25F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(98, 58)
						.addBox(-1.25F, -0.25F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3536F, 5.2287F, -2.25F, 0.0F, 0.0F, -0.7854F));

		PartDefinition right_leg_r1 = left_leg.addOrReplaceChild("right_leg_r1",
				CubeListBuilder.create().texOffs(90, 8)
						.addBox(-0.5F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 62)
						.addBox(-0.5F, -2.0F, 2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0864F, 1.9497F, -2.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition right_leg_r2 = left_leg.addOrReplaceChild("right_leg_r2",
				CubeListBuilder.create().texOffs(80, 72).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.061F, 4.2695F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition right_leg_r3 = left_leg.addOrReplaceChild("right_leg_r3",
				CubeListBuilder.create().texOffs(58, 85).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0792F, 6.1056F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition right_leg_r4 = left_leg.addOrReplaceChild("right_leg_r4",
				CubeListBuilder.create().texOffs(46, 82).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0322F, 7.4373F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition left_leg_r3 = left_leg.addOrReplaceChild("left_leg_r3",
				CubeListBuilder.create().texOffs(80, 78).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.061F, 4.2695F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition left_leg_r4 = left_leg.addOrReplaceChild("left_leg_r4",
				CubeListBuilder.create().texOffs(8, 76).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0864F, 1.9497F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition left_leg_r5 = left_leg.addOrReplaceChild("left_leg_r5",
				CubeListBuilder.create().texOffs(86, 0).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0792F, 6.1056F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition left_leg_r6 = left_leg.addOrReplaceChild("left_leg_r6",
				CubeListBuilder.create().texOffs(82, 48).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0322F, 7.4373F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition left_leg_r7 = left_leg.addOrReplaceChild("left_leg_r7",
				CubeListBuilder.create().texOffs(86, 30).addBox(-2.0F, -2.0F, -0.5F, 4.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.9497F, 2.0864F, 0.1745F, 0.0F, 0.0F));

		PartDefinition left_leg_r8 = left_leg.addOrReplaceChild("left_leg_r8",
				CubeListBuilder.create().texOffs(88, 46).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.2695F, 2.061F, -0.1309F, 0.0F, 0.0F));

		PartDefinition left_leg_r9 = left_leg.addOrReplaceChild("left_leg_r9",
				CubeListBuilder.create().texOffs(93, 28).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.1056F, 2.0792F, 0.1745F, 0.0F, 0.0F));

		PartDefinition left_leg_r10 = left_leg.addOrReplaceChild("left_leg_r10",
				CubeListBuilder.create().texOffs(90, 66).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.4373F, 2.0322F, -0.1309F, 0.0F, 0.0F));

		PartDefinition left_leg_r11 = left_leg.addOrReplaceChild("left_leg_r11",
				CubeListBuilder.create().texOffs(88, 49).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.2695F, -2.061F, 0.1309F, 0.0F, 0.0F));

		PartDefinition left_leg_r12 = left_leg.addOrReplaceChild("left_leg_r12",
				CubeListBuilder.create().texOffs(62, 90)
						.addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 100)
						.addBox(1.0F, -2.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 1.9497F, -2.0864F, -0.1745F, 0.0F, 0.0F));

		PartDefinition left_leg_r13 = left_leg.addOrReplaceChild("left_leg_r13",
				CubeListBuilder.create().texOffs(95, 4).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.1056F, -2.0792F, -0.1745F, 0.0F, 0.0F));

		PartDefinition right_leg_r5 = left_leg.addOrReplaceChild("right_leg_r5",
				CubeListBuilder.create().texOffs(0, 104).addBox(-0.5F, -1.0F, -0.4996F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.933F, 7.3223F, -2.0474F, 0.1135F, -0.0653F, 0.5199F));

		PartDefinition left_leg_r14 = left_leg.addOrReplaceChild("left_leg_r14",
				CubeListBuilder.create().texOffs(4, 104).addBox(-0.5F, -1.0F, -0.4996F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.933F, 7.3223F, -2.0474F, 0.1135F, 0.0653F, -0.5199F));

		PartDefinition left_leg_r15 = left_leg.addOrReplaceChild("left_leg_r15",
				CubeListBuilder.create().texOffs(104, 45)
						.addBox(-2.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 104)
						.addBox(-5.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 7.4373F, -2.0322F, 0.1309F, 0.0F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create()
				.texOffs(88, 99).mirror().addBox(0.0F, 0.0F, -2.25F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(56, 53).mirror()
				.addBox(1.25F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(94, 94)
				.mirror().addBox(-2.0F, 4.7F, -2.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(93, 44).mirror().addBox(-2.0F, 4.7F, 1.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(12, 86).mirror()
				.addBox(-2.5F, 4.7F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 86)
				.mirror().addBox(1.5F, 4.7F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(81, 27).mirror().addBox(-2.0F, -0.35F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(56, 32).mirror()
				.addBox(-2.0F, -0.35F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 28)
				.mirror().addBox(0.0F, -0.25F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition right_leg_r6 = right_leg.addOrReplaceChild("right_leg_r6",
				CubeListBuilder.create().texOffs(98, 36).mirror()
						.addBox(-0.75F, -1.25F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(98, 58).mirror()
						.addBox(-1.75F, -0.25F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.3536F, 5.2287F, -2.25F, 0.0F, 0.0F, 0.7854F));

		PartDefinition left_leg_r16 = right_leg.addOrReplaceChild("left_leg_r16",
				CubeListBuilder.create().texOffs(90, 8).mirror()
						.addBox(-0.5F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(56, 62).mirror()
						.addBox(-0.5F, -2.0F, 2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0864F, 1.9497F, -2.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition left_leg_r17 = right_leg.addOrReplaceChild("left_leg_r17",
				CubeListBuilder.create().texOffs(80, 72).mirror()
						.addBox(-0.5F, -1.5F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.061F, 4.2695F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition left_leg_r18 = right_leg.addOrReplaceChild("left_leg_r18",
				CubeListBuilder.create().texOffs(58, 85).mirror()
						.addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0792F, 6.1056F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition left_leg_r19 = right_leg.addOrReplaceChild("left_leg_r19",
				CubeListBuilder.create().texOffs(46, 82).mirror()
						.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0322F, 7.4373F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition right_leg_r7 = right_leg.addOrReplaceChild("right_leg_r7",
				CubeListBuilder.create().texOffs(80, 78).mirror()
						.addBox(-0.5F, -1.5F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.061F, 4.2695F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition right_leg_r8 = right_leg.addOrReplaceChild("right_leg_r8",
				CubeListBuilder.create().texOffs(8, 76).mirror()
						.addBox(-0.5F, -2.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0864F, 1.9497F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition right_leg_r9 = right_leg.addOrReplaceChild("right_leg_r9",
				CubeListBuilder.create().texOffs(86, 0).mirror()
						.addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0792F, 6.1056F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition right_leg_r10 = right_leg.addOrReplaceChild("right_leg_r10",
				CubeListBuilder.create().texOffs(82, 48).mirror()
						.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0322F, 7.4373F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition right_leg_r11 = right_leg.addOrReplaceChild("right_leg_r11",
				CubeListBuilder.create().texOffs(86, 30).mirror()
						.addBox(-2.0F, -2.0F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.9497F, 2.0864F, 0.1745F, 0.0F, 0.0F));

		PartDefinition right_leg_r12 = right_leg.addOrReplaceChild("right_leg_r12",
				CubeListBuilder.create().texOffs(88, 46).mirror()
						.addBox(-2.0F, -1.5F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.2695F, 2.061F, -0.1309F, 0.0F, 0.0F));

		PartDefinition right_leg_r13 = right_leg.addOrReplaceChild("right_leg_r13",
				CubeListBuilder.create().texOffs(93, 28).mirror()
						.addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.1056F, 2.0792F, 0.1745F, 0.0F, 0.0F));

		PartDefinition right_leg_r14 = right_leg.addOrReplaceChild("right_leg_r14",
				CubeListBuilder.create().texOffs(90, 66).mirror()
						.addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 7.4373F, 2.0322F, -0.1309F, 0.0F, 0.0F));

		PartDefinition right_leg_r15 = right_leg.addOrReplaceChild("right_leg_r15",
				CubeListBuilder.create().texOffs(88, 49).mirror()
						.addBox(-2.0F, -1.5F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.2695F, -2.061F, 0.1309F, 0.0F, 0.0F));

		PartDefinition right_leg_r16 = right_leg.addOrReplaceChild("right_leg_r16",
				CubeListBuilder.create().texOffs(62, 90).mirror()
						.addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(46, 100).mirror()
						.addBox(-3.0F, -2.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, 1.9497F, -2.0864F, -0.1745F, 0.0F, 0.0F));

		PartDefinition right_leg_r17 = right_leg.addOrReplaceChild("right_leg_r17",
				CubeListBuilder.create().texOffs(95, 4).mirror()
						.addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.1056F, -2.0792F, -0.1745F, 0.0F, 0.0F));

		PartDefinition left_leg_r20 = right_leg.addOrReplaceChild("left_leg_r20",
				CubeListBuilder.create().texOffs(0, 104).mirror()
						.addBox(-0.5F, -1.0F, -0.4996F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.933F, 7.3223F, -2.0474F, 0.1135F, 0.0653F, -0.5199F));

		PartDefinition right_leg_r18 = right_leg.addOrReplaceChild("right_leg_r18",
				CubeListBuilder.create().texOffs(4, 104).mirror()
						.addBox(-0.5F, -1.0F, -0.4996F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.933F, 7.3223F, -2.0474F, 0.1135F, -0.0653F, 0.5199F));

		PartDefinition right_leg_r19 = right_leg.addOrReplaceChild("right_leg_r19",
				CubeListBuilder.create().texOffs(104, 45).mirror()
						.addBox(1.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(47, 104).mirror()
						.addBox(4.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.0F, 7.4373F, -2.0322F, 0.1309F, 0.0F, 0.0F));

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