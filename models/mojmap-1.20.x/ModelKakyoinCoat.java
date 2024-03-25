// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelKakyoinCoat<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "kakyoincoat"), "main");
	private final ModelPart kaktorso;
	private final ModelPart kakleft_arm;
	private final ModelPart kakright_arm;

	public ModelKakyoinCoat(ModelPart root) {
		this.kaktorso = root.getChild("kaktorso");
		this.kakleft_arm = root.getChild("kakleft_arm");
		this.kakright_arm = root.getChild("kakright_arm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition kaktorso = partdefinition.addOrReplaceChild("kaktorso",
				CubeListBuilder.create().texOffs(24, 16)
						.addBox(-4.0F, -0.25F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(66, 62)
						.addBox(-0.5F, 1.75F, -2.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 59)
						.addBox(-0.5F, 4.0F, -2.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 53)
						.addBox(-0.5F, 6.25F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 49)
						.addBox(-0.5F, 8.45F, -2.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 45)
						.addBox(-0.5F, 10.7F, -2.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 10)
						.addBox(-4.0F, 5.4745F, -2.3351F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-4.0F, -0.0092F, -2.664F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 6)
						.addBox(-4.0F, 5.4745F, 1.3351F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 46)
						.addBox(-4.0F, -0.0092F, 1.664F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 59)
						.addBox(3.664F, -0.0092F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(62, 12)
						.addBox(3.3351F, 5.4745F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(54, 55)
						.addBox(-4.664F, -0.0092F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(58, 22)
						.addBox(-4.3351F, 5.4745F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition torso_r1 = kaktorso.addOrReplaceChild("torso_r1",
				CubeListBuilder.create().texOffs(26, 68).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9995F, 9.2F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition torso_r2 = kaktorso.addOrReplaceChild("torso_r2",
				CubeListBuilder.create().texOffs(68, 22).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9995F, 8.7163F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition torso_r3 = kaktorso.addOrReplaceChild("torso_r3",
				CubeListBuilder.create().texOffs(68, 15).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9995F, 5.2326F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition torso_r4 = kaktorso.addOrReplaceChild("torso_r4",
				CubeListBuilder.create().texOffs(0, 49).addBox(-1.5F, -0.5F, -2.0F, 1.0F, 8.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8806F, 9.9835F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition torso_r5 = kaktorso.addOrReplaceChild("torso_r5",
				CubeListBuilder.create().texOffs(55, 72).addBox(-0.0389F, -0.0221F, -0.0609F, 1.0F, 8.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.2611F, 9.3314F, -2.2391F, -0.0873F, 0.0F, 0.0873F));

		PartDefinition torso_r6 = kaktorso.addOrReplaceChild("torso_r6",
				CubeListBuilder.create().texOffs(29, 73).addBox(-0.9611F, -0.0221F, -0.0609F, 1.0F, 8.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.2611F, 9.3314F, -2.2391F, -0.0873F, 0.0F, -0.0873F));

		PartDefinition torso_r7 = kaktorso.addOrReplaceChild("torso_r7",
				CubeListBuilder.create().texOffs(10, 49).addBox(0.5F, -0.5F, -2.0F, 1.0F, 8.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8806F, 9.9835F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition torso_r8 = kaktorso.addOrReplaceChild("torso_r8",
				CubeListBuilder.create().texOffs(36, 68).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9995F, 9.2F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition torso_r9 = kaktorso.addOrReplaceChild("torso_r9",
				CubeListBuilder.create().texOffs(46, 68).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9995F, 8.7163F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition torso_r10 = kaktorso.addOrReplaceChild("torso_r10",
				CubeListBuilder.create().texOffs(58, 68).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9995F, 5.2326F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition torso_r11 = kaktorso.addOrReplaceChild("torso_r11",
				CubeListBuilder.create().texOffs(40, 55).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.2326F, 1.9995F, -0.4363F, 0.0F, 0.0F));

		PartDefinition torso_r12 = kaktorso.addOrReplaceChild("torso_r12",
				CubeListBuilder.create().texOffs(53, 45).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.7163F, 1.9995F, 0.4363F, 0.0F, 0.0F));

		PartDefinition torso_r13 = kaktorso.addOrReplaceChild("torso_r13",
				CubeListBuilder.create().texOffs(40, 53).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.2F, 1.9995F, -0.4363F, 0.0F, 0.0F));

		PartDefinition torso_r14 = kaktorso.addOrReplaceChild("torso_r14",
				CubeListBuilder.create().texOffs(57, 20).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.2326F, -1.9995F, 0.4363F, 0.0F, 0.0F));

		PartDefinition torso_r15 = kaktorso.addOrReplaceChild("torso_r15",
				CubeListBuilder.create().texOffs(57, 29).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.7163F, -1.9995F, -0.4363F, 0.0F, 0.0F));

		PartDefinition torso_r16 = kaktorso.addOrReplaceChild("torso_r16",
				CubeListBuilder.create().texOffs(48, 14).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.2F, -1.9995F, 0.4363F, 0.0F, 0.0F));

		PartDefinition torso_r17 = kaktorso.addOrReplaceChild("torso_r17",
				CubeListBuilder.create().texOffs(44, 16).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.8964F, -1.8767F, -0.0873F, 0.0F, 0.0F));

		PartDefinition torso_r18 = kaktorso.addOrReplaceChild("torso_r18",
				CubeListBuilder.create().texOffs(68, 27)
						.addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 41)
						.addBox(-1.0F, -1.0F, -0.76F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8F, 0.0F, -2.25F, 0.0F, 0.0F, 0.1745F));

		PartDefinition torso_r19 = kaktorso.addOrReplaceChild("torso_r19",
				CubeListBuilder.create().texOffs(68, 41)
						.addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 41)
						.addBox(-2.0F, -1.0F, -0.75F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8F, 0.0F, -2.25F, 0.0F, 0.0F, -0.1745F));

		PartDefinition leftflap = kaktorso.addOrReplaceChild("leftflap", CubeListBuilder.create(),
				PartPose.offset(4.0F, 12.3964F, -2.1267F));

		PartDefinition torso_r20 = leftflap.addOrReplaceChild("torso_r20",
				CubeListBuilder.create().texOffs(0, 16).addBox(-1.5F, -3.1F, -0.4994F, 3.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1865F, 2.2646F, -0.1669F, -0.0865F, -0.0114F, -0.1304F));

		PartDefinition rightflap = kaktorso.addOrReplaceChild("rightflap", CubeListBuilder.create(),
				PartPose.offset(-4.0F, 12.3964F, -2.1267F));

		PartDefinition torso_r21 = rightflap.addOrReplaceChild("torso_r21",
				CubeListBuilder.create().texOffs(0, 16).mirror()
						.addBox(-1.5F, -3.1F, -0.4994F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.1865F, 2.2646F, -0.1669F, -0.0865F, 0.0114F, 0.1304F));

		PartDefinition backflap = kaktorso.addOrReplaceChild("backflap", CubeListBuilder.create(),
				PartPose.offset(0.0F, 9.5F, 2.0F));

		PartDefinition torso_r22 = backflap.addOrReplaceChild("torso_r22",
				CubeListBuilder.create().texOffs(10, 71).addBox(-0.0389F, -0.0221F, -0.9391F, 1.0F, 8.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.2611F, -0.1686F, 0.2391F, 0.0873F, 0.0F, 0.0873F));

		PartDefinition torso_r23 = backflap.addOrReplaceChild("torso_r23",
				CubeListBuilder.create().texOffs(25, 73).addBox(-0.9611F, -0.0221F, -0.9391F, 1.0F, 8.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.2611F, -0.1686F, 0.2391F, 0.0873F, 0.0F, -0.0873F));

		PartDefinition torso_r24 = backflap.addOrReplaceChild("torso_r24",
				CubeListBuilder.create().texOffs(40, 21).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 8.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.3964F, -0.1233F, 0.0873F, 0.0F, 0.0F));

		PartDefinition kakleft_arm = partdefinition.addOrReplaceChild("kakleft_arm",
				CubeListBuilder.create().texOffs(48, 39)
						.addBox(-1.0F, -2.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(80, 20)
						.addBox(2.6009F, 7.0238F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 78)
						.addBox(2.7009F, 5.6238F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 14.0F, 0.0F));

		PartDefinition left_arm_r1 = kakleft_arm.addOrReplaceChild("left_arm_r1",
				CubeListBuilder.create().texOffs(60, 56).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -1.0738F, 2.0762F, 0.1309F, 0.0F, 0.0F));

		PartDefinition left_arm_r2 = kakleft_arm.addOrReplaceChild("left_arm_r2",
				CubeListBuilder.create().texOffs(24, 21).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.7785F, 2.0762F, -0.1309F, 0.0F, 0.0F));

		PartDefinition left_arm_r3 = kakleft_arm.addOrReplaceChild("left_arm_r3",
				CubeListBuilder.create().texOffs(30, 41).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 3.1554F, 2.0788F, 0.0873F, 0.0F, 0.0F));

		PartDefinition left_arm_r4 = kakleft_arm.addOrReplaceChild("left_arm_r4",
				CubeListBuilder.create().texOffs(0, 69).addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 6.5238F, 1.9509F, -0.1309F, 0.0F, 0.0F));

		PartDefinition left_arm_r5 = kakleft_arm.addOrReplaceChild("left_arm_r5",
				CubeListBuilder.create().texOffs(76, 59).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.7785F, -2.0762F, 0.1309F, 0.0F, 0.0F));

		PartDefinition left_arm_r6 = kakleft_arm.addOrReplaceChild("left_arm_r6",
				CubeListBuilder.create().texOffs(6, 61).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -1.0738F, -2.0762F, -0.1309F, 0.0F, 0.0F));

		PartDefinition left_arm_r7 = kakleft_arm.addOrReplaceChild("left_arm_r7",
				CubeListBuilder.create().texOffs(72, 0).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 3.1554F, -2.0788F, -0.0873F, 0.0F, 0.0F));

		PartDefinition left_arm_r8 = kakleft_arm.addOrReplaceChild("left_arm_r8",
				CubeListBuilder.create().texOffs(70, 31).addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 6.5238F, -1.9509F, 0.1309F, 0.0F, 0.0F));

		PartDefinition right_arm_r1 = kakleft_arm.addOrReplaceChild("right_arm_r1",
				CubeListBuilder.create().texOffs(52, 64).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0762F, -1.0738F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition right_arm_r2 = kakleft_arm.addOrReplaceChild("right_arm_r2",
				CubeListBuilder.create().texOffs(64, 35).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0762F, 0.7785F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition right_arm_r3 = kakleft_arm.addOrReplaceChild("right_arm_r3",
				CubeListBuilder.create().texOffs(62, 49).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0788F, 3.1554F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition right_arm_r4 = kakleft_arm.addOrReplaceChild("right_arm_r4",
				CubeListBuilder.create().texOffs(58, 31).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9509F, 6.5238F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition left_arm_r9 = kakleft_arm.addOrReplaceChild("left_arm_r9",
				CubeListBuilder.create().texOffs(16, 60).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.9509F, 6.5238F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition left_arm_r10 = kakleft_arm.addOrReplaceChild("left_arm_r10",
				CubeListBuilder.create().texOffs(10, 64).addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0788F, 3.1554F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition left_arm_r11 = kakleft_arm.addOrReplaceChild("left_arm_r11",
				CubeListBuilder.create().texOffs(66, 0).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0762F, 0.7785F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition left_arm_r12 = kakleft_arm.addOrReplaceChild("left_arm_r12",
				CubeListBuilder.create().texOffs(66, 6).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0762F, -1.0738F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition kakright_arm = partdefinition.addOrReplaceChild("kakright_arm",
				CubeListBuilder.create().texOffs(48, 39).mirror()
						.addBox(-3.0F, -2.25F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(80, 20).mirror()
						.addBox(-3.6009F, 7.0238F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(39, 78).mirror()
						.addBox(-3.7009F, 5.6238F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-5.0F, 14.0F, 0.0F));

		PartDefinition right_arm_r5 = kakright_arm.addOrReplaceChild("right_arm_r5",
				CubeListBuilder.create().texOffs(60, 56).mirror()
						.addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, -1.0738F, 2.0762F, 0.1309F, 0.0F, 0.0F));

		PartDefinition right_arm_r6 = kakright_arm.addOrReplaceChild("right_arm_r6",
				CubeListBuilder.create().texOffs(24, 21).mirror()
						.addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 0.7785F, 2.0762F, -0.1309F, 0.0F, 0.0F));

		PartDefinition right_arm_r7 = kakright_arm.addOrReplaceChild("right_arm_r7",
				CubeListBuilder.create().texOffs(30, 41).mirror()
						.addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 3.1554F, 2.0788F, 0.0873F, 0.0F, 0.0F));

		PartDefinition right_arm_r8 = kakright_arm.addOrReplaceChild("right_arm_r8",
				CubeListBuilder.create().texOffs(0, 69).mirror()
						.addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 6.5238F, 1.9509F, -0.1309F, 0.0F, 0.0F));

		PartDefinition right_arm_r9 = kakright_arm.addOrReplaceChild("right_arm_r9",
				CubeListBuilder.create().texOffs(76, 59).mirror()
						.addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 0.7785F, -2.0762F, 0.1309F, 0.0F, 0.0F));

		PartDefinition right_arm_r10 = kakright_arm.addOrReplaceChild("right_arm_r10",
				CubeListBuilder.create().texOffs(6, 61).mirror()
						.addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, -1.0738F, -2.0762F, -0.1309F, 0.0F, 0.0F));

		PartDefinition right_arm_r11 = kakright_arm.addOrReplaceChild("right_arm_r11",
				CubeListBuilder.create().texOffs(72, 0).mirror()
						.addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 3.1554F, -2.0788F, -0.0873F, 0.0F, 0.0F));

		PartDefinition right_arm_r12 = kakright_arm.addOrReplaceChild("right_arm_r12",
				CubeListBuilder.create().texOffs(70, 31).mirror()
						.addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 6.5238F, -1.9509F, 0.1309F, 0.0F, 0.0F));

		PartDefinition left_arm_r13 = kakright_arm.addOrReplaceChild("left_arm_r13",
				CubeListBuilder.create().texOffs(52, 64).mirror()
						.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0762F, -1.0738F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition left_arm_r14 = kakright_arm.addOrReplaceChild("left_arm_r14",
				CubeListBuilder.create().texOffs(64, 35).mirror()
						.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0762F, 0.7785F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition left_arm_r15 = kakright_arm.addOrReplaceChild("left_arm_r15",
				CubeListBuilder.create().texOffs(62, 49).mirror()
						.addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0788F, 3.1554F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition left_arm_r16 = kakright_arm.addOrReplaceChild("left_arm_r16",
				CubeListBuilder.create().texOffs(58, 31).mirror()
						.addBox(-0.5F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.9509F, 6.5238F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition right_arm_r13 = kakright_arm.addOrReplaceChild("right_arm_r13",
				CubeListBuilder.create().texOffs(16, 60).mirror()
						.addBox(-0.5F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.9509F, 6.5238F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition right_arm_r14 = kakright_arm.addOrReplaceChild("right_arm_r14",
				CubeListBuilder.create().texOffs(10, 64).mirror()
						.addBox(-0.5F, -1.5F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.0788F, 3.1554F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition right_arm_r15 = kakright_arm.addOrReplaceChild("right_arm_r15",
				CubeListBuilder.create().texOffs(66, 0).mirror()
						.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.0762F, 0.7785F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition right_arm_r16 = kakright_arm.addOrReplaceChild("right_arm_r16",
				CubeListBuilder.create().texOffs(66, 6).mirror()
						.addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.0762F, -1.0738F, 0.0F, 0.0F, 0.0F, 0.1309F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		kaktorso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		kakleft_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		kakright_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}