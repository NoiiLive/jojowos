// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelJosephJoestarShoes<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "josephjoestarshoes"), "main");
	private final ModelPart left_shoe;
	private final ModelPart right_shoe;

	public ModelJosephJoestarShoes(ModelPart root) {
		this.left_shoe = root.getChild("left_shoe");
		this.right_shoe = root.getChild("right_shoe");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition left_shoe = partdefinition.addOrReplaceChild("left_shoe",
				CubeListBuilder.create().texOffs(0, 22)
						.addBox(-2.0F, 10.0F, -4.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 77)
						.addBox(-2.0F, 9.0F, -2.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 89)
						.addBox(-2.0F, 9.0F, 1.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 20)
						.addBox(-2.0F, 11.25F, -4.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(76, 36)
						.addBox(1.5F, 9.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 76)
						.addBox(-2.5F, 9.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition right_shoe = partdefinition.addOrReplaceChild("right_shoe", CubeListBuilder.create()
				.texOffs(0, 22).mirror().addBox(-2.0F, 10.0F, -4.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(28, 77).mirror()
				.addBox(-2.0F, 9.0F, -2.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(16, 89)
				.mirror().addBox(-2.0F, 9.0F, 1.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(41, 20).mirror().addBox(-2.0F, 11.25F, -4.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(76, 36).mirror()
				.addBox(-2.5F, 9.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(12, 76)
				.mirror().addBox(1.5F, 9.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

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