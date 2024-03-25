// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelDioCape<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "diocape"), "main");
	private final ModelPart torso;
	private final ModelPart left_arm;
	private final ModelPart right_arm;

	public ModelDioCape(ModelPart root) {
		this.torso = root.getChild("torso");
		this.left_arm = root.getChild("left_arm");
		this.right_arm = root.getChild("right_arm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition torso = partdefinition.addOrReplaceChild("torso",
				CubeListBuilder.create().texOffs(66, 27)
						.addBox(-3.0F, -0.25F, -2.0F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(66, 0)
						.addBox(-4.0F, 5.0F, -2.25F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(65, 62)
						.addBox(-4.0F, 5.0F, 1.25F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 64)
						.addBox(3.25F, 5.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 55)
						.addBox(-4.25F, 5.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(56, 71)
						.addBox(-2.5F, 0.0F, -2.25F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 71)
						.addBox(-3.0F, 0.0F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 71)
						.addBox(-3.0F, 4.0F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition torso_r1 = torso.addOrReplaceChild("torso_r1",
				CubeListBuilder.create().texOffs(56, 71)
						.addBox(-0.5F, 1.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 71)
						.addBox(-0.5F, -2.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, 2.5F, -1.75F, 0.0F, -1.5708F, 0.0F));

		PartDefinition jacket = torso.addOrReplaceChild("jacket",
				CubeListBuilder.create().texOffs(100, 67)
						.addBox(-10.0F, -24.5F, -2.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 71)
						.addBox(-10.5F, -24.5F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(35, 103)
						.addBox(-10.0F, -21.5F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 88)
						.addBox(-9.0F, -22.5F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 87)
						.addBox(-9.0F, -22.8F, -2.49F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(31, 103)
						.addBox(-3.0F, -21.5F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 80)
						.addBox(-3.0F, -24.5F, -2.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(89, 24)
						.addBox(-4.0F, -22.5F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 88)
						.addBox(-4.0F, -22.8F, -2.49F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 71)
						.addBox(-2.5F, -24.5F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(82, 58)
						.addBox(-3.0F, -24.85F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(7, 39)
						.addBox(-10.0F, -24.85F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(58, 77)
						.addBox(-9.7931F, -19.7685F, 1.6F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 45)
						.addBox(-6.2069F, -19.7685F, 1.6F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 66)
						.addBox(-10.0F, -24.5F, 1.5F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 10)
						.addBox(-9.0F, -24.85F, 1.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 70)
						.addBox(-8.5135F, -25.0851F, 0.4F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.0F, 24.5F, 0.0F));

		PartDefinition torso_r2 = jacket.addOrReplaceChild("torso_r2",
				CubeListBuilder.create().texOffs(34, 73)
						.addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 82)
						.addBox(0.0F, -0.5F, -3.7F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(56, 67)
						.addBox(-1.0F, -0.5F, -4.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.3983F, -19.3066F, 2.1F, 0.0F, 0.0F, 0.3927F));

		PartDefinition torso_r3 = jacket.addOrReplaceChild("torso_r3",
				CubeListBuilder.create().texOffs(58, 79)
						.addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 82)
						.addBox(-1.0F, -0.5F, -3.7F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(74, 34)
						.addBox(-1.0F, -0.5F, -4.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.6017F, -19.3066F, 2.1F, 0.0F, 0.0F, -0.3927F));

		PartDefinition torso_r4 = jacket.addOrReplaceChild("torso_r4",
				CubeListBuilder.create().texOffs(70, 82)
						.addBox(-0.5F, -1.0F, 0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(20, 80)
						.addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.7582F, -24.0006F, -2.1F, 0.0F, 0.0F, -0.2182F));

		PartDefinition torso_r5 = jacket.addOrReplaceChild("torso_r5",
				CubeListBuilder.create().texOffs(32, 86)
						.addBox(-0.5F, -1.0F, 0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 80)
						.addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.2418F, -24.0006F, -2.1F, 0.0F, 0.0F, 0.2182F));

		PartDefinition torso_r6 = jacket.addOrReplaceChild("torso_r6",
				CubeListBuilder.create().texOffs(0, 86).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.35F, -20.8F, -2.1F, 0.0F, 0.0F, -0.2182F));

		PartDefinition torso_r7 = jacket.addOrReplaceChild("torso_r7",
				CubeListBuilder.create().texOffs(100, 50).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.65F, -20.8F, -2.1F, 0.0F, 0.0F, 0.2182F));

		PartDefinition cape = torso.addOrReplaceChild("cape", CubeListBuilder.create().texOffs(52, 21)
				.addBox(-18.543F, -10.9125F, -5.4606F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(50, 39)
				.addBox(-6.543F, -10.9125F, -5.4606F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 72)
				.addBox(-12.543F, -10.9125F, -2.4606F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(9.543F, 9.6625F, 2.9606F));

		PartDefinition torso_r8 = cape.addOrReplaceChild("torso_r8",
				CubeListBuilder.create().texOffs(24, 55)
						.addBox(-0.501F, -11.0F, -1.5F, 1.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 52)
						.addBox(-1.501F, -11.0F, -0.5F, 2.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, -0.0873F));

		PartDefinition torso_r9 = cape.addOrReplaceChild("torso_r9",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -4.5F, -0.5F, 18.0F, 22.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.043F, -6.3861F, -0.5665F, 0.0873F, 0.0F, 0.0F));

		PartDefinition torso_r10 = cape.addOrReplaceChild("torso_r10",
				CubeListBuilder.create().texOffs(40, 52)
						.addBox(-0.499F, -11.0F, -0.5F, 2.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 52)
						.addBox(-0.499F, -11.0F, -1.5F, 1.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-19.0861F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0873F));

		PartDefinition torso_r11 = cape.addOrReplaceChild("torso_r11",
				CubeListBuilder.create().texOffs(0, 39).addBox(-0.5F, -4.5F, -2.5F, 1.0F, 22.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-18.5273F, -6.3867F, -3.0356F, 0.0F, 0.0F, 0.0873F));

		PartDefinition torso_r12 = cape.addOrReplaceChild("torso_r12",
				CubeListBuilder.create().texOffs(12, 39).addBox(-0.5F, -4.5F, -2.5F, 1.0F, 22.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5588F, -6.3867F, -3.0356F, 0.0F, 0.0F, -0.0873F));

		PartDefinition torso_r13 = cape.addOrReplaceChild("torso_r13",
				CubeListBuilder.create().texOffs(72, 59).addBox(-3.0F, -1.0F, -0.4997F, 6.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.291F, -4.9438F, -5.5559F, -0.0832F, 0.0262F, 0.3043F));

		PartDefinition torso_r14 = cape.addOrReplaceChild("torso_r14",
				CubeListBuilder.create().texOffs(69, 45).addBox(-3.0F, -0.2662F, -0.1296F, 6.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.4529F, -10.6367F, -5.4297F, -0.0873F, 0.0F, 0.0F));

		PartDefinition torso_r15 = cape.addOrReplaceChild("torso_r15",
				CubeListBuilder.create().texOffs(38, 21).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.4529F, -7.3905F, -5.7668F, -0.0852F, -0.0189F, -0.2174F));

		PartDefinition torso_r16 = cape.addOrReplaceChild("torso_r16",
				CubeListBuilder.create().texOffs(68, 73).addBox(-3.0F, -1.0F, -0.4997F, 6.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.795F, -4.9438F, -5.5559F, -0.0832F, -0.0262F, -0.3043F));

		PartDefinition torso_r17 = cape.addOrReplaceChild("torso_r17",
				CubeListBuilder.create().texOffs(67, 36).addBox(-3.0F, -0.2662F, -0.1296F, 6.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.6332F, -10.6367F, -5.4297F, -0.0873F, 0.0F, 0.0F));

		PartDefinition torso_r18 = cape.addOrReplaceChild("torso_r18",
				CubeListBuilder.create().texOffs(56, 100).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.4257F, -11.1133F, 3.3169F, -0.3054F, 0.0F, 0.3054F));

		PartDefinition torso_r19 = cape.addOrReplaceChild("torso_r19",
				CubeListBuilder.create().texOffs(52, 100).addBox(-0.5007F, -1.0F, -0.5F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.8243F, -11.1133F, 2.7155F, -0.3054F, 0.0F, 0.3054F));

		PartDefinition torso_r20 = cape.addOrReplaceChild("torso_r20",
				CubeListBuilder.create().texOffs(46, 8)
						.addBox(-0.5F, -1.0F, -2.5F, 1.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(82, 18)
						.addBox(-0.5F, 4.0F, 2.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.793F, -11.2125F, -2.9606F, 0.0F, 0.0F, 0.3054F));

		PartDefinition torso_r21 = cape.addOrReplaceChild("torso_r21",
				CubeListBuilder.create().texOffs(64, 16).addBox(-4.0F, -1.5F, -0.5F, 8.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.5706F, -6.9303F, 1.0419F, -1.0472F, 0.0F, 0.0F));

		PartDefinition torso_r22 = cape.addOrReplaceChild("torso_r22",
				CubeListBuilder.create().texOffs(80, 78)
						.addBox(-0.5F, 4.0F, 2.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 39)
						.addBox(-0.5F, -1.0F, -2.5F, 1.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.3482F, -11.2125F, -2.9606F, 0.0F, 0.0F, -0.3054F));

		PartDefinition torso_r23 = cape.addOrReplaceChild("torso_r23",
				CubeListBuilder.create().texOffs(65, 53).addBox(-4.0F, -1.0F, -0.5F, 8.0F, 5.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.5706F, -11.2125F, 3.3169F, -0.3054F, 0.0F, 0.0F));

		PartDefinition torso_r24 = cape.addOrReplaceChild("torso_r24",
				CubeListBuilder.create().texOffs(30, 73).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.7154F, -11.1133F, 3.3169F, -0.3054F, 0.0F, -0.3054F));

		PartDefinition torso_r25 = cape.addOrReplaceChild("torso_r25",
				CubeListBuilder.create().texOffs(20, 70).addBox(-0.4992F, -1.0F, -0.5F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.3169F, -11.1133F, 2.7155F, -0.3054F, 0.0F, -0.3054F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(68, 68)
				.mirror().addBox(-1.0F, -2.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(52, 77).mirror().addBox(2.15F, 6.45F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(77, 39).mirror()
				.addBox(-1.15F, 6.45F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(68, 87)
				.mirror().addBox(-1.0F, 6.45F, -2.15F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(86, 84).mirror().addBox(-1.0F, 6.45F, 1.15F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false), PartPose.offset(5.0F, 14.0F, 0.0F));

		PartDefinition left_arm_r1 = left_arm.addOrReplaceChild("left_arm_r1",
				CubeListBuilder.create().texOffs(56, 36).mirror()
						.addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, 5.4465F, 1.967F, -0.1745F, 0.0F, 0.0F));

		PartDefinition left_arm_r2 = left_arm.addOrReplaceChild("left_arm_r2",
				CubeListBuilder.create().texOffs(54, 4).mirror()
						.addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, 3.1266F, 1.9415F, 0.1309F, 0.0F, 0.0F));

		PartDefinition left_arm_r3 = left_arm.addOrReplaceChild("left_arm_r3",
				CubeListBuilder.create().texOffs(86, 5).mirror()
						.addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, 0.7785F, 1.8762F, -0.1309F, 0.0F, 0.0F));

		PartDefinition left_arm_r4 = left_arm.addOrReplaceChild("left_arm_r4",
				CubeListBuilder.create().texOffs(86, 18).mirror()
						.addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, -1.0738F, 1.8762F, 0.1309F, 0.0F, 0.0F));

		PartDefinition left_arm_r5 = left_arm.addOrReplaceChild("left_arm_r5",
				CubeListBuilder.create().texOffs(86, 63).mirror()
						.addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, -1.0738F, -1.8762F, -0.1309F, 0.0F, 0.0F));

		PartDefinition left_arm_r6 = left_arm.addOrReplaceChild("left_arm_r6",
				CubeListBuilder.create().texOffs(86, 72).mirror()
						.addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, 0.7785F, -1.8762F, 0.1309F, 0.0F, 0.0F));

		PartDefinition left_arm_r7 = left_arm.addOrReplaceChild("left_arm_r7",
				CubeListBuilder.create().texOffs(83, 54).mirror()
						.addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, 3.1266F, -1.9415F, -0.1309F, 0.0F, 0.0F));

		PartDefinition left_arm_r8 = left_arm.addOrReplaceChild("left_arm_r8",
				CubeListBuilder.create().texOffs(86, 78).mirror()
						.addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, 5.4465F, -1.967F, 0.1745F, 0.0F, 0.0F));

		PartDefinition right_arm_r1 = left_arm.addOrReplaceChild("right_arm_r1",
				CubeListBuilder.create().texOffs(58, 79).mirror()
						.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.967F, 5.4465F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition right_arm_r2 = left_arm.addOrReplaceChild("right_arm_r2",
				CubeListBuilder.create().texOffs(74, 8).mirror()
						.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.8762F, 2.6309F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition right_arm_r3 = left_arm.addOrReplaceChild("right_arm_r3",
				CubeListBuilder.create().texOffs(0, 80).mirror()
						.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.8762F, -1.0738F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition right_arm_r4 = left_arm.addOrReplaceChild("right_arm_r4",
				CubeListBuilder.create().texOffs(80, 4).mirror()
						.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.8762F, 0.7785F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition left_arm_r9 = left_arm.addOrReplaceChild("left_arm_r9",
				CubeListBuilder.create().texOffs(14, 80).mirror()
						.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.967F, 5.4465F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition left_arm_r10 = left_arm.addOrReplaceChild("left_arm_r10",
				CubeListBuilder.create().texOffs(24, 74).mirror()
						.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.8762F, 2.6309F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition left_arm_r11 = left_arm.addOrReplaceChild("left_arm_r11",
				CubeListBuilder.create().texOffs(30, 80).mirror()
						.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.8762F, 0.7785F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition left_arm_r12 = left_arm.addOrReplaceChild("left_arm_r12",
				CubeListBuilder.create().texOffs(80, 30).mirror()
						.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.8762F, -1.0738F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm",
				CubeListBuilder.create().texOffs(68, 68)
						.addBox(-3.0F, -2.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 77)
						.addBox(-3.15F, 6.45F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(77, 39)
						.addBox(0.15F, 6.45F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(68, 87)
						.addBox(-3.0F, 6.45F, -2.15F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(86, 84)
						.addBox(-3.0F, 6.45F, 1.15F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 14.0F, 0.0F));

		PartDefinition right_arm_r5 = right_arm.addOrReplaceChild("right_arm_r5",
				CubeListBuilder.create().texOffs(56, 36).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 5.4465F, 1.967F, -0.1745F, 0.0F, 0.0F));

		PartDefinition right_arm_r6 = right_arm.addOrReplaceChild("right_arm_r6",
				CubeListBuilder.create().texOffs(54, 4).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 3.1266F, 1.9415F, 0.1309F, 0.0F, 0.0F));

		PartDefinition right_arm_r7 = right_arm.addOrReplaceChild("right_arm_r7",
				CubeListBuilder.create().texOffs(86, 5).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.7785F, 1.8762F, -0.1309F, 0.0F, 0.0F));

		PartDefinition right_arm_r8 = right_arm.addOrReplaceChild("right_arm_r8",
				CubeListBuilder.create().texOffs(86, 18).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -1.0738F, 1.8762F, 0.1309F, 0.0F, 0.0F));

		PartDefinition right_arm_r9 = right_arm.addOrReplaceChild("right_arm_r9",
				CubeListBuilder.create().texOffs(86, 63).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -1.0738F, -1.8762F, -0.1309F, 0.0F, 0.0F));

		PartDefinition right_arm_r10 = right_arm.addOrReplaceChild("right_arm_r10",
				CubeListBuilder.create().texOffs(86, 72).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.7785F, -1.8762F, 0.1309F, 0.0F, 0.0F));

		PartDefinition right_arm_r11 = right_arm.addOrReplaceChild("right_arm_r11",
				CubeListBuilder.create().texOffs(83, 54).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 3.1266F, -1.9415F, -0.1309F, 0.0F, 0.0F));

		PartDefinition right_arm_r12 = right_arm.addOrReplaceChild("right_arm_r12",
				CubeListBuilder.create().texOffs(86, 78).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 5.4465F, -1.967F, 0.1745F, 0.0F, 0.0F));

		PartDefinition left_arm_r13 = right_arm.addOrReplaceChild("left_arm_r13",
				CubeListBuilder.create().texOffs(58, 79).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.967F, 5.4465F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition left_arm_r14 = right_arm.addOrReplaceChild("left_arm_r14",
				CubeListBuilder.create().texOffs(74, 8).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8762F, 2.6309F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition left_arm_r15 = right_arm.addOrReplaceChild("left_arm_r15",
				CubeListBuilder.create().texOffs(0, 80).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8762F, -1.0738F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition left_arm_r16 = right_arm.addOrReplaceChild("left_arm_r16",
				CubeListBuilder.create().texOffs(80, 4).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8762F, 0.7785F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition right_arm_r13 = right_arm.addOrReplaceChild("right_arm_r13",
				CubeListBuilder.create().texOffs(14, 80).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.967F, 5.4465F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition right_arm_r14 = right_arm.addOrReplaceChild("right_arm_r14",
				CubeListBuilder.create().texOffs(24, 74).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8762F, 2.6309F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition right_arm_r15 = right_arm.addOrReplaceChild("right_arm_r15",
				CubeListBuilder.create().texOffs(30, 80).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8762F, 0.7785F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition right_arm_r16 = right_arm.addOrReplaceChild("right_arm_r16",
				CubeListBuilder.create().texOffs(80, 30).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8762F, -1.0738F, 0.0F, 0.0F, 0.0F, 0.1309F));

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