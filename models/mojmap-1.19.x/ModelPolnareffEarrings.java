// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelPolnareffEarrings<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "polnareffearrings"), "main");
	private final ModelPart head;

	public ModelPolnareffEarrings(ModelPart root) {
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition head_r1 = head.addOrReplaceChild("head_r1",
				CubeListBuilder.create().texOffs(58, 35)
						.addBox(0.0F, -0.75F, -0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.5F, -1.75F, -0.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.506F, -1.0256F, -1.0657F, -0.0873F, 1.3526F, 0.0F));

		PartDefinition head_r2 = head.addOrReplaceChild("head_r2",
				CubeListBuilder.create().texOffs(60, 17)
						.addBox(-1.0F, -0.75F, -0.05F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(-0.5F, -1.75F, -0.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.506F, -1.0256F, -1.0657F, -0.0873F, -1.3526F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}