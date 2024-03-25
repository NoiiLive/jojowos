// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelAvdolCoat<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "avdolcoat"), "main");
	private final ModelPart avdoltorso;
	private final ModelPart avdolleft_arm;
	private final ModelPart avdolright_arm;

	public ModelAvdolCoat(ModelPart root) {
		this.avdoltorso = root.getChild("avdoltorso");
		this.avdolleft_arm = root.getChild("avdolleft_arm");
		this.avdolright_arm = root.getChild("avdolright_arm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition avdoltorso = partdefinition.addOrReplaceChild("avdoltorso",
				CubeListBuilder.create().texOffs(12, 72)
						.addBox(-3.5F, 2.3908F, -2.9145F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 65)
						.addBox(-4.0F, 4.8745F, -2.5855F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(61, 20)
						.addBox(-4.0F, 4.8745F, 1.5855F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 76)
						.addBox(3.5855F, 4.8745F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(76, 54)
						.addBox(-4.5855F, 4.8745F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition torso_r1 = avdoltorso.addOrReplaceChild("torso_r1",
				CubeListBuilder.create().texOffs(54, 83).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.25F, 8.1163F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition torso_r2 = avdoltorso.addOrReplaceChild("torso_r2",
				CubeListBuilder.create().texOffs(64, 83).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.25F, 8.6F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition torso_r3 = avdoltorso.addOrReplaceChild("torso_r3",
				CubeListBuilder.create().texOffs(28, 84).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.25F, 8.1163F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition torso_r4 = avdoltorso
				.addOrReplaceChild("torso_r4",
						CubeListBuilder.create().texOffs(40, 84).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(4.25F, 8.6F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition torso_r5 = avdoltorso.addOrReplaceChild("torso_r5",
				CubeListBuilder.create().texOffs(61, 24).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.1163F, 2.25F, 0.4363F, 0.0F, 0.0F));

		PartDefinition torso_r6 = avdoltorso.addOrReplaceChild("torso_r6",
				CubeListBuilder.create().texOffs(21, 17).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.6F, 2.25F, -0.4363F, 0.0F, 0.0F));

		PartDefinition torso_r7 = avdoltorso.addOrReplaceChild("torso_r7",
				CubeListBuilder.create().texOffs(71, 14).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.6F, -2.25F, 0.4363F, 0.0F, 0.0F));

		PartDefinition torso_r8 = avdoltorso.addOrReplaceChild("torso_r8",
				CubeListBuilder.create().texOffs(71, 16).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.1163F, -2.25F, -0.4363F, 0.0F, 0.0F));

		PartDefinition torso_r9 = avdoltorso.addOrReplaceChild("torso_r9",
				CubeListBuilder.create().texOffs(71, 47).addBox(-3.0F, -0.5F, -0.5F, 7.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 4.6326F, -2.25F, 0.4363F, 0.0F, 0.0F));

		PartDefinition torso_r10 = avdoltorso.addOrReplaceChild("torso_r10",
				CubeListBuilder.create().texOffs(0, 16).addBox(-4.9407F, -0.9589F, -4.5F, 6.0F, 3.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5924F, 0.439F, 0.5216F, 0.2559F, -0.056F, 0.211F));

		PartDefinition torso_r11 = avdoltorso.addOrReplaceChild("torso_r11",
				CubeListBuilder.create().texOffs(21, 19).addBox(-1.0593F, -0.9589F, -4.4916F, 6.0F, 3.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5924F, 0.439F, 0.5216F, 0.2559F, 0.056F, -0.211F));

		PartDefinition coat = avdoltorso.addOrReplaceChild("coat", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition torso_r12 = coat.addOrReplaceChild("torso_r12",
				CubeListBuilder.create().texOffs(110, 0).addBox(-4.0F, -3.5F, -0.8645F, 8.0F, 17.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.3745F, 2.9145F, 0.0436F, 0.0F, 0.0F));

		PartDefinition torso_r13 = coat.addOrReplaceChild("torso_r13",
				CubeListBuilder.create().texOffs(36, 71).addBox(-3.6716F, -0.5186F, -1.5F, 4.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.2432F, 2.6017F, 0.1705F, -0.0376F, 0.215F));

		PartDefinition torso_r14 = coat.addOrReplaceChild("torso_r14",
				CubeListBuilder.create().texOffs(42, 0).addBox(-0.3284F, -0.5186F, -1.5F, 4.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.2432F, 2.6017F, 0.1705F, 0.0376F, -0.215F));

		PartDefinition torso_r15 = coat.addOrReplaceChild("torso_r15",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.7779F, 2.0598F, 0.3818F, 0.176F, 0.2525F, -0.177F));

		PartDefinition torso_r16 = coat.addOrReplaceChild("torso_r16",
				CubeListBuilder.create().texOffs(0, 16).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.7779F, 2.0598F, 0.3818F, 0.176F, -0.2525F, 0.177F));

		PartDefinition torso_r17 = coat.addOrReplaceChild("torso_r17",
				CubeListBuilder.create().texOffs(21, 19).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.2561F, 1.7944F, 2.5526F, 0.2144F, 0.6488F, 0.3522F));

		PartDefinition torso_r18 = coat.addOrReplaceChild("torso_r18",
				CubeListBuilder.create().texOffs(42, 17).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.2561F, 1.7944F, 2.5526F, 0.2144F, -0.6488F, -0.3522F));

		PartDefinition torso_r19 = coat.addOrReplaceChild("torso_r19",
				CubeListBuilder.create().texOffs(28, 48).addBox(-3.6376F, -0.37F, -0.495F, 7.0F, 21.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0517F, 2.295F, 0.043F, 0.0076F, -0.1744F));

		PartDefinition torso_r20 = coat.addOrReplaceChild("torso_r20",
				CubeListBuilder.create().texOffs(71, 30)
						.addBox(-1.65F, 4.5F, -2.99F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 89)
						.addBox(-1.9F, 5.5F, -3.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 71)
						.addBox(-2.65F, 7.5F, -2.99F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 19)
						.addBox(-2.9F, 8.5F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 65)
						.addBox(-0.9F, -10.5F, -3.0F, 1.0F, 21.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 31)
						.addBox(0.1F, -10.5F, -3.0F, 1.0F, 21.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.9719F, 10.4613F, -0.25F, 0.0F, 0.0F, -0.1745F));

		PartDefinition torso_r21 = coat.addOrReplaceChild("torso_r21",
				CubeListBuilder.create().texOffs(16, 28).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.2219F, 3.7113F, -3.25F, 0.0F, 0.0F, 0.2182F));

		PartDefinition torso_r22 = coat.addOrReplaceChild("torso_r22",
				CubeListBuilder.create().texOffs(0, 88).addBox(-0.5F, -1.5F, -0.52F, 1.0F, 9.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3301F, 5.9356F, -3.25F, 0.0F, 0.0F, 0.2182F));

		PartDefinition torso_r23 = coat.addOrReplaceChild("torso_r23",
				CubeListBuilder.create().texOffs(26, 89).addBox(-0.5F, -1.5F, -0.52F, 1.0F, 9.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3301F, 5.9356F, -3.25F, 0.0F, 0.0F, -0.2182F));

		PartDefinition torso_r24 = coat.addOrReplaceChild("torso_r24",
				CubeListBuilder.create().texOffs(66, 88).addBox(-0.5F, -4.5F, -0.5F, 1.0F, 9.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1677F, 17.4945F, -3.26F, 0.0F, 0.0F, 0.1745F));

		PartDefinition torso_r25 = coat.addOrReplaceChild("torso_r25",
				CubeListBuilder.create().texOffs(8, 28).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.2219F, 3.7113F, -3.25F, 0.0F, 0.0F, -0.2182F));

		PartDefinition torso_r26 = coat.addOrReplaceChild("torso_r26",
				CubeListBuilder.create().texOffs(37, 88).addBox(-0.5F, -4.5F, -0.5F, 1.0F, 9.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1677F, 17.4945F, -3.26F, 0.0F, 0.0F, -0.1745F));

		PartDefinition torso_r27 = coat.addOrReplaceChild("torso_r27",
				CubeListBuilder.create().texOffs(5, 16)
						.addBox(1.9F, 8.5F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(53, 5)
						.addBox(1.65F, 7.5F, -2.99F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 69)
						.addBox(0.9F, 5.5F, -3.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(65, 16)
						.addBox(0.65F, 4.5F, -2.99F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 65)
						.addBox(-0.1F, -10.5F, -3.0F, 1.0F, 21.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(-1.1F, -10.5F, -3.0F, 1.0F, 21.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.9719F, 10.4613F, -0.25F, 0.0F, 0.0F, 0.1745F));

		PartDefinition torso_r28 = coat.addOrReplaceChild("torso_r28",
				CubeListBuilder.create().texOffs(44, 49).addBox(-3.3624F, -0.37F, -0.505F, 7.0F, 21.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0517F, 2.295F, 0.043F, -0.0076F, 0.1744F));

		PartDefinition avdolleft_arm = partdefinition.addOrReplaceChild("avdolleft_arm",
				CubeListBuilder.create().texOffs(70, 92)
						.addBox(-1.0F, 8.0F, -2.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(91, 2)
						.addBox(-1.0F, 8.0F, 1.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(86, 81)
						.addBox(2.25F, 8.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(85, 20)
						.addBox(-1.25F, 8.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(90, 52)
						.addBox(-1.0F, 7.0F, -2.35F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(82, 40)
						.addBox(2.35F, 7.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(91, 0)
						.addBox(-1.0F, 7.0F, 1.35F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(82, 65)
						.addBox(-1.35F, 7.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(56, 15)
						.addBox(-1.0F, 6.0F, -2.45F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(78, 30)
						.addBox(2.45F, 6.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(90, 50)
						.addBox(-1.0F, 6.0F, 1.45F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(82, 35)
						.addBox(-1.45F, 6.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 14.0F, 0.0F));

		PartDefinition right_arm_r1 = avdolleft_arm.addOrReplaceChild("right_arm_r1",
				CubeListBuilder.create().texOffs(0, 1)
						.addBox(-0.6F, 0.0F, 0.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 55)
						.addBox(-0.6F, -2.0F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(5, 0)
						.addBox(0.4F, 0.0F, -0.4F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2665F, 4.2601F, -2.4418F, -0.2618F, 0.0F, 0.2618F));

		PartDefinition right_arm_r2 = avdolleft_arm.addOrReplaceChild("right_arm_r2",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-0.6F, 0.0F, -1.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 10)
						.addBox(-0.6F, -2.0F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.4F, 0.0F, 0.4F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2665F, 4.2601F, 2.4418F, 0.2618F, 0.0F, 0.2618F));

		PartDefinition left_arm_r1 = avdolleft_arm.addOrReplaceChild("left_arm_r1",
				CubeListBuilder.create().texOffs(5, 0)
						.addBox(0.6F, 0.0F, -1.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 49)
						.addBox(-0.4F, -2.0F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-1.4F, 0.0F, 0.4F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.2665F, 4.2601F, 2.4418F, 0.2618F, 0.0F, -0.2618F));

		PartDefinition left_arm_r2 = avdolleft_arm.addOrReplaceChild("left_arm_r2",
				CubeListBuilder.create().texOffs(5, 1)
						.addBox(0.6F, 0.0F, 0.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(-1.4F, 0.0F, -0.4F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(64, 10)
						.addBox(-0.4F, -2.0F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.2665F, 4.2601F, -2.4418F, -0.2618F, 0.0F, -0.2618F));

		PartDefinition right_arm_r3 = avdolleft_arm.addOrReplaceChild("right_arm_r3",
				CubeListBuilder.create().texOffs(46, 85).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4046F, 2.5728F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition right_arm_r4 = avdolleft_arm.addOrReplaceChild("right_arm_r4",
				CubeListBuilder.create().texOffs(85, 26).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1881F, 3.3327F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition right_arm_r5 = avdolleft_arm.addOrReplaceChild("right_arm_r5",
				CubeListBuilder.create().texOffs(48, 78)
						.addBox(-0.5F, -0.5F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(68, 69)
						.addBox(-1.0F, 1.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3124F, 3.578F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition left_arm_r3 = avdolleft_arm.addOrReplaceChild("left_arm_r3",
				CubeListBuilder.create().texOffs(78, 78)
						.addBox(-0.5F, -0.5F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 70)
						.addBox(0.0F, 1.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3124F, 3.578F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition left_arm_r4 = avdolleft_arm.addOrReplaceChild("left_arm_r4",
				CubeListBuilder.create().texOffs(86, 55).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1881F, 3.3327F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition left_arm_r5 = avdolleft_arm.addOrReplaceChild("left_arm_r5",
				CubeListBuilder.create().texOffs(86, 86).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4046F, 2.5728F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition left_arm_r6 = avdolleft_arm.addOrReplaceChild("left_arm_r6",
				CubeListBuilder.create().texOffs(76, 63)
						.addBox(-3.0F, 1.0F, -0.15F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(85, 5)
						.addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 4.061F, 2.4418F, 0.2618F, 0.0F, 0.0F));

		PartDefinition left_arm_r7 = avdolleft_arm.addOrReplaceChild("left_arm_r7",
				CubeListBuilder.create().texOffs(92, 57).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 2.5728F, 2.4046F, 0.2182F, 0.0F, 0.0F));

		PartDefinition left_arm_r8 = avdolleft_arm.addOrReplaceChild("left_arm_r8",
				CubeListBuilder.create().texOffs(92, 55).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 3.3327F, 2.1881F, -0.2182F, 0.0F, 0.0F));

		PartDefinition left_arm_r9 = avdolleft_arm.addOrReplaceChild("left_arm_r9",
				CubeListBuilder.create().texOffs(92, 81).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 2.5728F, -2.4046F, -0.2182F, 0.0F, 0.0F));

		PartDefinition left_arm_r10 = avdolleft_arm.addOrReplaceChild("left_arm_r10",
				CubeListBuilder.create().texOffs(74, 76)
						.addBox(-3.0F, 1.0F, -0.85F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 65)
						.addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 4.061F, -2.4418F, -0.2618F, 0.0F, 0.0F));

		PartDefinition left_arm_r11 = avdolleft_arm.addOrReplaceChild("left_arm_r11",
				CubeListBuilder.create().texOffs(92, 68).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 3.3327F, -2.1881F, 0.2182F, 0.0F, 0.0F));

		PartDefinition right_arm_r6 = avdolleft_arm.addOrReplaceChild("right_arm_r6",
				CubeListBuilder.create().texOffs(6, 79).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3262F, 0.7785F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition right_arm_r7 = avdolleft_arm.addOrReplaceChild("right_arm_r7",
				CubeListBuilder.create().texOffs(79, 18).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3262F, -1.0738F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition left_arm_r12 = avdolleft_arm.addOrReplaceChild("left_arm_r12",
				CubeListBuilder.create().texOffs(88, 70).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -1.0738F, 2.3262F, 0.1309F, 0.0F, 0.0F));

		PartDefinition left_arm_r13 = avdolleft_arm.addOrReplaceChild("left_arm_r13",
				CubeListBuilder.create().texOffs(89, 9).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.7785F, 2.3262F, -0.1309F, 0.0F, 0.0F));

		PartDefinition left_arm_r14 = avdolleft_arm
				.addOrReplaceChild("left_arm_r14",
						CubeListBuilder.create().texOffs(0, 71).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 1.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition left_arm_r15 = avdolleft_arm.addOrReplaceChild("left_arm_r15",
				CubeListBuilder.create().texOffs(12, 82).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3262F, 0.7785F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition left_arm_r16 = avdolleft_arm.addOrReplaceChild("left_arm_r16",
				CubeListBuilder.create().texOffs(22, 82).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3262F, -1.0738F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition left_arm_r17 = avdolleft_arm.addOrReplaceChild("left_arm_r17",
				CubeListBuilder.create().texOffs(70, 89).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -1.0738F, -2.3262F, -0.1309F, 0.0F, 0.0F));

		PartDefinition left_arm_r18 = avdolleft_arm.addOrReplaceChild("left_arm_r18",
				CubeListBuilder.create().texOffs(4, 90).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.7785F, -2.3262F, 0.1309F, 0.0F, 0.0F));

		PartDefinition avdolright_arm = partdefinition.addOrReplaceChild("avdolright_arm", CubeListBuilder.create()
				.texOffs(70, 92).mirror().addBox(-3.0F, 8.0F, -2.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(91, 2).mirror()
				.addBox(-3.0F, 8.0F, 1.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(86, 81)
				.mirror().addBox(-3.25F, 8.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(85, 20).mirror().addBox(0.25F, 8.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(90, 52).mirror()
				.addBox(-3.0F, 7.0F, -2.35F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(82, 40)
				.mirror().addBox(-3.35F, 7.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(91, 0).mirror().addBox(-3.0F, 7.0F, 1.35F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(82, 65).mirror()
				.addBox(0.35F, 7.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(56, 15)
				.mirror().addBox(-3.0F, 6.0F, -2.45F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(78, 30).mirror().addBox(-3.45F, 6.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(90, 50).mirror()
				.addBox(-3.0F, 6.0F, 1.45F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(82, 35)
				.mirror().addBox(0.45F, 6.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-5.0F, 14.0F, 0.0F));

		PartDefinition left_arm_r19 = avdolright_arm.addOrReplaceChild("left_arm_r19", CubeListBuilder.create()
				.texOffs(0, 1).mirror().addBox(0.6F, 0.0F, 0.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(0, 55).mirror()
				.addBox(-0.4F, -2.0F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(5, 0)
				.mirror().addBox(-1.4F, 0.0F, -0.4F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2665F, 4.2601F, -2.4418F, -0.2618F, 0.0F, -0.2618F));

		PartDefinition left_arm_r20 = avdolright_arm.addOrReplaceChild("left_arm_r20", CubeListBuilder.create()
				.texOffs(0, 0).mirror().addBox(0.6F, 0.0F, -1.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(48, 10).mirror()
				.addBox(-0.4F, -2.0F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0)
				.mirror().addBox(-1.4F, 0.0F, 0.4F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2665F, 4.2601F, 2.4418F, 0.2618F, 0.0F, -0.2618F));

		PartDefinition right_arm_r8 = avdolright_arm.addOrReplaceChild("right_arm_r8", CubeListBuilder.create()
				.texOffs(5, 0).mirror().addBox(-0.6F, 0.0F, -1.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(60, 49).mirror()
				.addBox(-0.6F, -2.0F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 16)
				.mirror().addBox(0.4F, 0.0F, 0.4F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.2665F, 4.2601F, 2.4418F, 0.2618F, 0.0F, 0.2618F));

		PartDefinition right_arm_r9 = avdolright_arm.addOrReplaceChild("right_arm_r9",
				CubeListBuilder.create().texOffs(5, 1).mirror()
						.addBox(-0.6F, 0.0F, 0.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 17).mirror().addBox(0.4F, 0.0F, -0.4F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(64, 10).mirror()
						.addBox(-0.6F, -2.0F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.2665F, 4.2601F, -2.4418F, -0.2618F, 0.0F, 0.2618F));

		PartDefinition left_arm_r21 = avdolright_arm.addOrReplaceChild("left_arm_r21",
				CubeListBuilder.create().texOffs(46, 85).mirror()
						.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.4046F, 2.5728F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition left_arm_r22 = avdolright_arm.addOrReplaceChild("left_arm_r22",
				CubeListBuilder.create().texOffs(85, 26).mirror()
						.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.1881F, 3.3327F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition left_arm_r23 = avdolright_arm.addOrReplaceChild("left_arm_r23",
				CubeListBuilder.create().texOffs(48, 78).mirror()
						.addBox(-0.5F, -0.5F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(68, 69).mirror().addBox(0.0F, 1.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(1.3124F, 3.578F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition right_arm_r10 = avdolright_arm.addOrReplaceChild("right_arm_r10",
				CubeListBuilder.create().texOffs(78, 78).mirror()
						.addBox(-0.5F, -0.5F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(28, 70).mirror()
						.addBox(-1.0F, 1.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.3124F, 3.578F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition right_arm_r11 = avdolright_arm.addOrReplaceChild("right_arm_r11",
				CubeListBuilder.create().texOffs(86, 55).mirror()
						.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.1881F, 3.3327F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition right_arm_r12 = avdolright_arm.addOrReplaceChild("right_arm_r12",
				CubeListBuilder.create().texOffs(86, 86).mirror()
						.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.4046F, 2.5728F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition right_arm_r13 = avdolright_arm.addOrReplaceChild("right_arm_r13",
				CubeListBuilder.create().texOffs(76, 63).mirror()
						.addBox(-3.0F, 1.0F, -0.15F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(85, 5).mirror()
						.addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 4.061F, 2.4418F, 0.2618F, 0.0F, 0.0F));

		PartDefinition right_arm_r14 = avdolright_arm.addOrReplaceChild("right_arm_r14",
				CubeListBuilder.create().texOffs(92, 57).mirror()
						.addBox(-2.0F, -1.0F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 2.5728F, 2.4046F, 0.2182F, 0.0F, 0.0F));

		PartDefinition right_arm_r15 = avdolright_arm.addOrReplaceChild("right_arm_r15",
				CubeListBuilder.create().texOffs(92, 55).mirror()
						.addBox(-2.0F, -1.0F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 3.3327F, 2.1881F, -0.2182F, 0.0F, 0.0F));

		PartDefinition right_arm_r16 = avdolright_arm.addOrReplaceChild("right_arm_r16",
				CubeListBuilder.create().texOffs(92, 81).mirror()
						.addBox(-2.0F, -1.0F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 2.5728F, -2.4046F, -0.2182F, 0.0F, 0.0F));

		PartDefinition right_arm_r17 = avdolright_arm.addOrReplaceChild("right_arm_r17",
				CubeListBuilder.create().texOffs(74, 76).mirror()
						.addBox(-3.0F, 1.0F, -0.85F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(88, 65).mirror()
						.addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 4.061F, -2.4418F, -0.2618F, 0.0F, 0.0F));

		PartDefinition right_arm_r18 = avdolright_arm.addOrReplaceChild("right_arm_r18",
				CubeListBuilder.create().texOffs(92, 68).mirror()
						.addBox(-2.0F, -1.0F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 3.3327F, -2.1881F, 0.2182F, 0.0F, 0.0F));

		PartDefinition left_arm_r24 = avdolright_arm.addOrReplaceChild("left_arm_r24",
				CubeListBuilder.create().texOffs(6, 79).mirror()
						.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.3262F, 0.7785F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition left_arm_r25 = avdolright_arm.addOrReplaceChild("left_arm_r25",
				CubeListBuilder.create().texOffs(79, 18).mirror()
						.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.3262F, -1.0738F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition right_arm_r19 = avdolright_arm.addOrReplaceChild("right_arm_r19",
				CubeListBuilder.create().texOffs(88, 70).mirror()
						.addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, -1.0738F, 2.3262F, 0.1309F, 0.0F, 0.0F));

		PartDefinition right_arm_r20 = avdolright_arm.addOrReplaceChild("right_arm_r20",
				CubeListBuilder.create().texOffs(89, 9).mirror()
						.addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 0.7785F, 2.3262F, -0.1309F, 0.0F, 0.0F));

		PartDefinition right_arm_r21 = avdolright_arm.addOrReplaceChild("right_arm_r21",
				CubeListBuilder.create().texOffs(0, 71).mirror()
						.addBox(-2.0F, -0.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition right_arm_r22 = avdolright_arm.addOrReplaceChild("right_arm_r22",
				CubeListBuilder.create().texOffs(12, 82).mirror()
						.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.3262F, 0.7785F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition right_arm_r23 = avdolright_arm.addOrReplaceChild("right_arm_r23",
				CubeListBuilder.create().texOffs(22, 82).mirror()
						.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.3262F, -1.0738F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition right_arm_r24 = avdolright_arm.addOrReplaceChild("right_arm_r24",
				CubeListBuilder.create().texOffs(70, 89).mirror()
						.addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, -1.0738F, -2.3262F, -0.1309F, 0.0F, 0.0F));

		PartDefinition right_arm_r25 = avdolright_arm.addOrReplaceChild("right_arm_r25",
				CubeListBuilder.create().texOffs(4, 90).mirror()
						.addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 0.7785F, -2.3262F, 0.1309F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		avdoltorso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		avdolleft_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		avdolright_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}