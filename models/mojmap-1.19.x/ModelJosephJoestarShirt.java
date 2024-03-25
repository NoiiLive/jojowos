// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelJosephJoestarShirt<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "josephjoestarshirt"), "main");
	private final ModelPart torso;
	private final ModelPart left_arm;
	private final ModelPart right_arm;

	public ModelJosephJoestarShirt(ModelPart root) {
		this.torso = root.getChild("torso");
		this.left_arm = root.getChild("left_arm");
		this.right_arm = root.getChild("right_arm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition torso = partdefinition.addOrReplaceChild("torso",
				CubeListBuilder.create().texOffs(60, 44)
						.addBox(-4.0F, 4.8745F, -2.5855F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 60)
						.addBox(-4.0F, 1.3908F, -2.9145F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 31)
						.addBox(2.0F, -0.0092F, -2.914F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(-4.0F, -0.0092F, -2.914F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 60)
						.addBox(-4.0F, 4.8745F, 1.5855F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 60)
						.addBox(-4.0F, 1.3908F, 1.9145F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 64)
						.addBox(-4.0F, -0.0092F, 1.914F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(75, 14)
						.addBox(3.5855F, 4.8745F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(74, 59)
						.addBox(3.9145F, 1.3908F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 83)
						.addBox(3.914F, -0.0092F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 83)
						.addBox(-4.914F, -0.0092F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(6, 73)
						.addBox(-4.5855F, 4.8745F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 69)
						.addBox(-4.9145F, 0.3908F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(11, 67)
						.addBox(-4.0F, -0.25F, -3.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(66, 51)
						.addBox(2.0F, -0.25F, -3.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(24, 28)
						.addBox(-2.0F, -0.25F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 41)
						.addBox(-4.0F, -0.5F, 2.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition head_r1 = torso.addOrReplaceChild("head_r1",
				CubeListBuilder.create().texOffs(63, 9).addBox(-4.0F, -1.5F, -0.5F, 8.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.5F, 4.15F, -0.1745F, 0.0F, 0.0F));

		PartDefinition torso_r1 = torso.addOrReplaceChild("torso_r1",
				CubeListBuilder.create().texOffs(56, 29).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.25F, -1.0F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition torso_r2 = torso.addOrReplaceChild("torso_r2",
				CubeListBuilder.create().texOffs(57, 53).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.25F, -1.0F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition torso_r3 = torso.addOrReplaceChild("torso_r3",
				CubeListBuilder.create().texOffs(6, 86).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.25F, 4.6326F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition torso_r4 = torso.addOrReplaceChild("torso_r4",
				CubeListBuilder.create().texOffs(85, 82).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.25F, 8.1163F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition torso_r5 = torso.addOrReplaceChild("torso_r5",
				CubeListBuilder.create().texOffs(28, 85).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.25F, 8.6F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition torso_r6 = torso.addOrReplaceChild("torso_r6",
				CubeListBuilder.create().texOffs(75, 86).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.25F, 4.6326F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition torso_r7 = torso.addOrReplaceChild("torso_r7",
				CubeListBuilder.create().texOffs(87, 16).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.25F, 8.1163F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition torso_r8 = torso
				.addOrReplaceChild("torso_r8",
						CubeListBuilder.create().texOffs(87, 21).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(4.25F, 8.6F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition torso_r9 = torso.addOrReplaceChild("torso_r9",
				CubeListBuilder.create().texOffs(65, 34).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.6326F, 2.25F, -0.4363F, 0.0F, 0.0F));

		PartDefinition torso_r10 = torso.addOrReplaceChild("torso_r10",
				CubeListBuilder.create().texOffs(63, 25).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.1163F, 2.25F, 0.4363F, 0.0F, 0.0F));

		PartDefinition torso_r11 = torso.addOrReplaceChild("torso_r11",
				CubeListBuilder.create().texOffs(63, 5).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.6F, 2.25F, -0.4363F, 0.0F, 0.0F));

		PartDefinition torso_r12 = torso.addOrReplaceChild("torso_r12",
				CubeListBuilder.create().texOffs(66, 57).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.6326F, -2.25F, 0.4363F, 0.0F, 0.0F));

		PartDefinition torso_r13 = torso.addOrReplaceChild("torso_r13",
				CubeListBuilder.create().texOffs(20, 67).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.1163F, -2.25F, -0.4363F, 0.0F, 0.0F));

		PartDefinition torso_r14 = torso.addOrReplaceChild("torso_r14",
				CubeListBuilder.create().texOffs(38, 67).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.6F, -2.25F, 0.4363F, 0.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm",
				CubeListBuilder.create().texOffs(82, 39)
						.addBox(2.25F, 8.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(62, 63)
						.addBox(-1.0F, 9.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(82, 10)
						.addBox(-1.25F, 8.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(92, 33)
						.addBox(-1.0F, 8.0F, -2.25F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(91, 76)
						.addBox(-1.0F, 8.0F, 1.25F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 64)
						.addBox(-1.0F, -2.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 14.0F, 0.0F));

		PartDefinition left_arm_r1 = left_arm.addOrReplaceChild("left_arm_r1",
				CubeListBuilder.create().texOffs(67, 91).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -1.0738F, 2.1262F, 0.1309F, 0.0F, 0.0F));

		PartDefinition left_arm_r2 = left_arm.addOrReplaceChild("left_arm_r2",
				CubeListBuilder.create().texOffs(0, 91).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.7785F, 2.1262F, -0.1309F, 0.0F, 0.0F));

		PartDefinition left_arm_r3 = left_arm.addOrReplaceChild("left_arm_r3",
				CubeListBuilder.create().texOffs(90, 79).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 2.6573F, 2.0853F, 0.0873F, 0.0F, 0.0F));

		PartDefinition left_arm_r4 = left_arm.addOrReplaceChild("left_arm_r4",
				CubeListBuilder.create().texOffs(87, 92).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 2.6573F, -2.0853F, -0.0873F, 0.0F, 0.0F));

		PartDefinition left_arm_r5 = left_arm.addOrReplaceChild("left_arm_r5",
				CubeListBuilder.create().texOffs(77, 92).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.7785F, -2.1262F, 0.1309F, 0.0F, 0.0F));

		PartDefinition left_arm_r6 = left_arm.addOrReplaceChild("left_arm_r6",
				CubeListBuilder.create().texOffs(92, 36).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -1.0738F, -2.1262F, -0.1309F, 0.0F, 0.0F));

		PartDefinition right_arm_r1 = left_arm.addOrReplaceChild("right_arm_r1",
				CubeListBuilder.create().texOffs(81, 74).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1262F, -1.0738F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition right_arm_r2 = left_arm.addOrReplaceChild("right_arm_r2",
				CubeListBuilder.create().texOffs(81, 68).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1262F, 0.7785F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition right_arm_r3 = left_arm.addOrReplaceChild("right_arm_r3",
				CubeListBuilder.create().texOffs(81, 17).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0853F, 2.6573F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition left_arm_r7 = left_arm.addOrReplaceChild("left_arm_r7",
				CubeListBuilder.create().texOffs(63, 82).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0853F, 2.6573F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition left_arm_r8 = left_arm.addOrReplaceChild("left_arm_r8",
				CubeListBuilder.create().texOffs(0, 83).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1262F, 0.7785F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition left_arm_r9 = left_arm.addOrReplaceChild("left_arm_r9",
				CubeListBuilder.create().texOffs(83, 0).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1262F, -1.0738F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition left_arm_r10 = left_arm.addOrReplaceChild("left_arm_r10",
				CubeListBuilder.create().texOffs(91, 82).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 7.0474F, 1.8353F, -0.0873F, 0.0F, 0.0F));

		PartDefinition left_arm_r11 = left_arm.addOrReplaceChild("left_arm_r11",
				CubeListBuilder.create().texOffs(35, 92).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 7.0474F, -1.8353F, 0.0873F, 0.0F, 0.0F));

		PartDefinition right_arm_r4 = left_arm.addOrReplaceChild("right_arm_r4",
				CubeListBuilder.create().texOffs(82, 29).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8353F, 7.0474F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition left_arm_r12 = left_arm.addOrReplaceChild("left_arm_r12",
				CubeListBuilder.create().texOffs(34, 82).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8353F, 7.0474F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create()
				.texOffs(82, 39).mirror().addBox(-3.25F, 8.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(62, 63).mirror()
				.addBox(-3.0F, 9.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(82, 10)
				.mirror().addBox(0.25F, 8.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(92, 33).mirror().addBox(-3.0F, 8.0F, -2.25F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(91, 76).mirror()
				.addBox(-3.0F, 8.0F, 1.25F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 64)
				.mirror().addBox(-3.0F, -2.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-5.0F, 14.0F, 0.0F));

		PartDefinition right_arm_r5 = right_arm.addOrReplaceChild("right_arm_r5",
				CubeListBuilder.create().texOffs(67, 91).mirror()
						.addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, -1.0738F, 2.1262F, 0.1309F, 0.0F, 0.0F));

		PartDefinition right_arm_r6 = right_arm.addOrReplaceChild("right_arm_r6",
				CubeListBuilder.create().texOffs(0, 91).mirror()
						.addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 0.7785F, 2.1262F, -0.1309F, 0.0F, 0.0F));

		PartDefinition right_arm_r7 = right_arm.addOrReplaceChild("right_arm_r7",
				CubeListBuilder.create().texOffs(90, 79).mirror()
						.addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 2.6573F, 2.0853F, 0.0873F, 0.0F, 0.0F));

		PartDefinition right_arm_r8 = right_arm.addOrReplaceChild("right_arm_r8",
				CubeListBuilder.create().texOffs(87, 92).mirror()
						.addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 2.6573F, -2.0853F, -0.0873F, 0.0F, 0.0F));

		PartDefinition right_arm_r9 = right_arm.addOrReplaceChild("right_arm_r9",
				CubeListBuilder.create().texOffs(77, 92).mirror()
						.addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 0.7785F, -2.1262F, 0.1309F, 0.0F, 0.0F));

		PartDefinition right_arm_r10 = right_arm.addOrReplaceChild("right_arm_r10",
				CubeListBuilder.create().texOffs(92, 36).mirror()
						.addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, -1.0738F, -2.1262F, -0.1309F, 0.0F, 0.0F));

		PartDefinition left_arm_r13 = right_arm.addOrReplaceChild("left_arm_r13",
				CubeListBuilder.create().texOffs(81, 74).mirror()
						.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.1262F, -1.0738F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition left_arm_r14 = right_arm.addOrReplaceChild("left_arm_r14",
				CubeListBuilder.create().texOffs(81, 68).mirror()
						.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.1262F, 0.7785F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition left_arm_r15 = right_arm.addOrReplaceChild("left_arm_r15",
				CubeListBuilder.create().texOffs(81, 17).mirror()
						.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0853F, 2.6573F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition right_arm_r11 = right_arm.addOrReplaceChild("right_arm_r11",
				CubeListBuilder.create().texOffs(63, 82).mirror()
						.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.0853F, 2.6573F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition right_arm_r12 = right_arm.addOrReplaceChild("right_arm_r12",
				CubeListBuilder.create().texOffs(0, 83).mirror()
						.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.1262F, 0.7785F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition right_arm_r13 = right_arm.addOrReplaceChild("right_arm_r13",
				CubeListBuilder.create().texOffs(83, 0).mirror()
						.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.1262F, -1.0738F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition right_arm_r14 = right_arm.addOrReplaceChild("right_arm_r14",
				CubeListBuilder.create().texOffs(91, 82).mirror()
						.addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 7.0474F, 1.8353F, -0.0873F, 0.0F, 0.0F));

		PartDefinition right_arm_r15 = right_arm.addOrReplaceChild("right_arm_r15",
				CubeListBuilder.create().texOffs(35, 92).mirror()
						.addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 7.0474F, -1.8353F, 0.0873F, 0.0F, 0.0F));

		PartDefinition left_arm_r16 = right_arm.addOrReplaceChild("left_arm_r16",
				CubeListBuilder.create().texOffs(82, 29).mirror()
						.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.8353F, 7.0474F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition right_arm_r16 = right_arm.addOrReplaceChild("right_arm_r16",
				CubeListBuilder.create().texOffs(34, 82).mirror()
						.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.8353F, 7.0474F, 0.0F, 0.0F, 0.0F, -0.0873F));

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