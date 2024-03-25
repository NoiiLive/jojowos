// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelJosephJoestarHat<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "josephjoestarhat"), "main");
	private final ModelPart head;

	public ModelJosephJoestarHat(ModelPart root) {
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(27, 0).addBox(
				-4.5F, -9.5F, -4.5F, 9.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition head_r1 = head.addOrReplaceChild("head_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -0.5F, -7.0F, 7.0F, 1.0F, 13.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4431F, -5.8031F, 0.5F, 0.0F, 0.0F, -0.0873F));

		PartDefinition head_r2 = head.addOrReplaceChild("head_r2",
				CubeListBuilder.create().texOffs(0, 14).addBox(-3.5F, -0.5F, -7.0F, 7.0F, 1.0F, 13.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.4431F, -5.8031F, 0.5F, 0.0F, 0.0F, 0.0873F));

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