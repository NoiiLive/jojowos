// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelStandArrowEntity<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "standarrowentity"), "main");
	private final ModelPart group;

	public ModelStandArrowEntity(ModelPart root) {
		this.group = root.getChild("group");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition group = partdefinition.addOrReplaceChild("group",
				CubeListBuilder.create().texOffs(0, 5)
						.addBox(-1.575F, 0.05F, -7.375F, 3.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.575F, -0.55F, -5.875F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.075F, -0.05F, 5.625F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 5)
						.addBox(0.025F, -1.55F, -7.375F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.025F, 16.7F, 0.125F, 1.5708F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		group.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}