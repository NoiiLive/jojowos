package net.mcreator.jojowos.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelSilverChariotAnimeDisplay<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("jojowos", "model_silver_chariot_anime_display"), "main");
	public final ModelPart Body;

	public ModelSilverChariotAnimeDisplay(ModelPart root) {
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition head = Body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(68, 3).addBox(-4.0F, -4.75F, -1.25F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(29, 66).addBox(3.0F, -4.75F, -1.25F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -3.0F, 0.0F));
		PartDefinition faceplate2 = head.addOrReplaceChild("faceplate2",
				CubeListBuilder.create().texOffs(18, 0).addBox(-0.5F, -2.1103F, -0.499F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 95).addBox(-3.5F, -2.2103F, -0.4F, 7.0F, 4.0F, 1.0F, new CubeDeformation(0.15F)).texOffs(35, 16)
						.addBox(-2.15F, -2.1103F, -0.498F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(21, 17).addBox(0.15F, -2.1103F, -0.498F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(63, 20)
						.addBox(-3.6252F, -2.5508F, -0.499F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(13, 32).addBox(1.6252F, -2.5508F, -0.499F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.8897F, -3.25F, 0.1309F, 0.0F, 0.0F));
		PartDefinition head_r1 = faceplate2.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(28, 33).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6013F, 0.8413F, 0.0F, 0.0F, 0.0F, 0.4363F));
		PartDefinition head_r2 = faceplate2.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(28, 35).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6013F, 0.8413F, 0.0F, 0.0F, 0.0F, -0.4363F));
		PartDefinition headdecor = head.addOrReplaceChild("headdecor", CubeListBuilder.create().texOffs(41, 70).addBox(-0.5F, -33.25F, -3.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 27.0F, 0.0F));
		PartDefinition head_r3 = headdecor.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(0, 50).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.25F, -33.5F, -3.25F, 0.0F, 0.0F, -0.48F));
		PartDefinition head_r4 = headdecor.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(7, 50).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.25F, -33.5F, -3.25F, 0.0F, 0.0F, 0.48F));
		PartDefinition head_r5 = headdecor.addOrReplaceChild("head_r5", CubeListBuilder.create().texOffs(70, 40).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9426F, -34.8305F, -3.0429F, -0.7854F, 0.0F, 0.48F));
		PartDefinition head_r6 = headdecor.addOrReplaceChild("head_r6", CubeListBuilder.create().texOffs(68, 56).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9426F, -34.8305F, -3.0429F, -0.7854F, 0.0F, -0.48F));
		PartDefinition head_r7 = headdecor.addOrReplaceChild("head_r7", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0485F, -35.034F, -2.5216F, -1.5272F, 0.0F, -0.48F));
		PartDefinition head_r8 = headdecor.addOrReplaceChild("head_r8", CubeListBuilder.create().texOffs(24, 45).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0485F, -35.034F, -2.5216F, -1.5272F, 0.0F, 0.48F));
		PartDefinition head_r9 = headdecor.addOrReplaceChild("head_r9", CubeListBuilder.create().texOffs(31, 70).addBox(-0.5F, -0.616F, -3.0216F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0485F, -35.034F, 2.5216F, 0.0F, 0.0F, 0.48F));
		PartDefinition head_r10 = headdecor.addOrReplaceChild("head_r10", CubeListBuilder.create().texOffs(69, 66).addBox(-0.5F, -0.616F, -3.0216F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0485F, -35.034F, 2.5216F, 0.0F, 0.0F, -0.48F));
		PartDefinition head_r11 = headdecor.addOrReplaceChild("head_r11", CubeListBuilder.create().texOffs(18, 10).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2728F, -33.5437F, 3.1212F, -0.0873F, 0.0F, -0.48F));
		PartDefinition head_r12 = headdecor.addOrReplaceChild("head_r12", CubeListBuilder.create().texOffs(27, 70).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9426F, -34.8305F, 3.0429F, 0.7854F, 0.0F, -0.48F));
		PartDefinition head_r13 = headdecor.addOrReplaceChild("head_r13", CubeListBuilder.create().texOffs(12, 0).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0485F, -35.034F, 2.5216F, 1.5272F, 0.0F, -0.48F));
		PartDefinition head_r14 = headdecor.addOrReplaceChild("head_r14", CubeListBuilder.create().texOffs(32, 40).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0485F, -35.034F, 2.5216F, 1.5272F, 0.0F, 0.48F));
		PartDefinition head_r15 = headdecor.addOrReplaceChild("head_r15", CubeListBuilder.create().texOffs(13, 41).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2728F, -33.5437F, 3.1212F, -0.0873F, 0.0F, 0.48F));
		PartDefinition head_r16 = headdecor.addOrReplaceChild("head_r16", CubeListBuilder.create().texOffs(70, 38).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9426F, -34.8305F, 3.0429F, 0.7854F, 0.0F, 0.48F));
		PartDefinition head_r17 = headdecor.addOrReplaceChild("head_r17", CubeListBuilder.create().texOffs(58, 31).addBox(-0.5009F, -1.5F, -3.5F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6699F, -28.9677F, 2.2874F, -0.48F, 0.0F, -0.48F));
		PartDefinition head_r18 = headdecor.addOrReplaceChild("head_r18", CubeListBuilder.create().texOffs(5, 70).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7504F, -28.813F, 3.0F, 0.0F, 0.0F, -0.48F));
		PartDefinition head_r19 = headdecor.addOrReplaceChild("head_r19", CubeListBuilder.create().texOffs(41, 50).addBox(-3.5F, -0.5F, -0.5F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -29.7F, 3.2405F, 0.48F, 0.0F, 0.0F));
		PartDefinition head_r20 = headdecor.addOrReplaceChild("head_r20", CubeListBuilder.create().texOffs(9, 70).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7504F, -28.813F, 3.0F, 0.0F, 0.0F, 0.48F));
		PartDefinition head_r21 = headdecor.addOrReplaceChild("head_r21", CubeListBuilder.create().texOffs(40, 59).addBox(-0.4991F, -1.5F, -3.5F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6699F, -28.9677F, 2.2874F, -0.48F, 0.0F, 0.48F));
		PartDefinition faceplate1 = head.addOrReplaceChild("faceplate1", CubeListBuilder.create().texOffs(14, 51).addBox(-0.5F, -0.943F, -0.501F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.407F, -3.5F, -0.0873F, 0.0F, 0.0F));
		PartDefinition head_r22 = faceplate1.addOrReplaceChild("head_r22", CubeListBuilder.create().texOffs(30, 58).addBox(-1.5F, -0.5F, -0.501F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0667F, -0.896F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition head_r23 = faceplate1.addOrReplaceChild("head_r23", CubeListBuilder.create().texOffs(66, 54).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9507F, -0.5718F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition head_r24 = faceplate1.addOrReplaceChild("head_r24", CubeListBuilder.create().texOffs(61, 52).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8828F, 1.2173F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition head_r25 = faceplate1.addOrReplaceChild("head_r25", CubeListBuilder.create().texOffs(52, 7).addBox(-1.5F, -0.5F, -0.501F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0667F, -0.896F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition head_r26 = faceplate1.addOrReplaceChild("head_r26", CubeListBuilder.create().texOffs(38, 11).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9507F, -0.5718F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition head_r27 = faceplate1.addOrReplaceChild("head_r27", CubeListBuilder.create().texOffs(57, 0).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8828F, 1.2173F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition head_r28 = faceplate1.addOrReplaceChild("head_r28", CubeListBuilder.create().texOffs(21, 64).addBox(-0.5F, 0.5F, -0.499F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.9259F, -1.5052F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition head_r29 = faceplate1.addOrReplaceChild("head_r29", CubeListBuilder.create().texOffs(64, 30).addBox(-0.5F, 0.5F, -0.499F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.9259F, -1.5052F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition normalhead = head.addOrReplaceChild("normalhead", CubeListBuilder.create().texOffs(0, 17).addBox(-3.5F, -8.0F, -3.5F, 7.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition torso = Body.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(67, 58).addBox(-1.5F, 8.0F, -0.25F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 36)
				.addBox(-2.0F, 12.0F, -2.001F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(62, 37).addBox(-1.0F, 7.0F, -0.75F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.0F, 0.0F));
		PartDefinition torso_r1 = torso.addOrReplaceChild("torso_r1", CubeListBuilder.create().texOffs(42, 11).addBox(-4.5F, -1.0F, -2.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition torso_r2 = torso.addOrReplaceChild("torso_r2", CubeListBuilder.create().texOffs(44, 30).addBox(-0.5F, -1.0F, -2.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition uppertorso = torso.addOrReplaceChild("uppertorso",
				CubeListBuilder.create().texOffs(18, 0).addBox(-4.5F, -7.0F, -2.5F, 9.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(18, 10).addBox(-4.0F, -2.0F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 7.0F, 0.0F));
		PartDefinition armor = uppertorso.addOrReplaceChild("armor",
				CubeListBuilder.create().texOffs(0, 62).addBox(-4.25F, -6.5F, -3.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(61, 47).addBox(0.25F, -6.5F, -3.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(21, 52)
						.addBox(-4.25F, -6.5F, 2.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(59, 60).addBox(0.25F, -6.5F, 2.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 51)
						.addBox(3.0F, -8.0F, -1.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 50).addBox(-4.0F, -8.0F, -1.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-3.5F, -8.0F, 3.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 0).addBox(-3.5F, -7.75F, 1.5F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition torso_r3 = armor.addOrReplaceChild("torso_r3",
				CubeListBuilder.create().texOffs(47, 19).addBox(-1.0F, -1.0F, -0.501F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 35).addBox(-1.0F, -1.0F, -5.499F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8693F, -2.1939F, 2.5F, 0.0F, 0.0F, 0.5672F));
		PartDefinition torso_r4 = armor.addOrReplaceChild("torso_r4",
				CubeListBuilder.create().texOffs(36, 26).addBox(-1.0F, -1.0F, -0.501F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(21, 69).addBox(-1.0F, -1.0F, -5.499F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8693F, -2.1939F, 2.5F, 0.0F, 0.0F, -0.5672F));
		PartDefinition torso_r5 = armor.addOrReplaceChild("torso_r5", CubeListBuilder.create().texOffs(34, 56).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.75F, -1.0F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition torso_r6 = armor.addOrReplaceChild("torso_r6", CubeListBuilder.create().texOffs(56, 7).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.75F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition torso_r7 = armor.addOrReplaceChild("torso_r7", CubeListBuilder.create().texOffs(47, 16).addBox(-4.0F, -1.0F, -0.5F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -2.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition torso_r8 = armor.addOrReplaceChild("torso_r8", CubeListBuilder.create().texOffs(0, 47).addBox(-4.0F, -1.0F, -0.5F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition torso_r9 = armor.addOrReplaceChild("torso_r9", CubeListBuilder.create().texOffs(0, 11).addBox(-4.0F, -1.0F, -0.5F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 1.0F, -1.75F, -0.0873F, 0.0F, 0.0F));
		PartDefinition torso_r10 = armor.addOrReplaceChild("torso_r10", CubeListBuilder.create().texOffs(50, 55).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.25F, 1.0F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition torso_r11 = armor.addOrReplaceChild("torso_r11", CubeListBuilder.create().texOffs(0, 56).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.25F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition torso_r12 = armor.addOrReplaceChild("torso_r12", CubeListBuilder.create().texOffs(48, 26).addBox(-4.0F, -1.0F, -0.5F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 1.0F, 1.75F, 0.0873F, 0.0F, 0.0F));
		PartDefinition tubes = torso.addOrReplaceChild("tubes",
				CubeListBuilder.create().texOffs(44, 32).addBox(-2.5F, 11.0F, -1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 62).addBox(1.5F, 11.0F, -1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition torso_r13 = tubes.addOrReplaceChild("torso_r13",
				CubeListBuilder.create().texOffs(42, 13).addBox(-0.501F, -0.5F, -0.4991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 14).addBox(3.499F, -0.5F, -0.4991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 10.9077F, -0.5489F, -0.6545F, 0.0F, 0.0F));
		PartDefinition torso_r14 = tubes.addOrReplaceChild("torso_r14", CubeListBuilder.create().texOffs(41, 3).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1272F, 10.252F, -0.0458F, -0.6318F, -0.1841F, -0.2451F));
		PartDefinition torso_r15 = tubes.addOrReplaceChild("torso_r15", CubeListBuilder.create().texOffs(32, 37).addBox(-0.4999F, -1.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0748F, 10.209F, -0.375F, -1.1117F, -0.1841F, -0.2451F));
		PartDefinition torso_r16 = tubes.addOrReplaceChild("torso_r16", CubeListBuilder.create().texOffs(35, 20).addBox(-0.5F, -0.5F, -0.4999F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2525F, 9.6382F, 0.8469F, -0.9643F, 0.7009F, 0.2658F));
		PartDefinition torso_r17 = tubes.addOrReplaceChild("torso_r17", CubeListBuilder.create().texOffs(21, 21).addBox(-0.5F, -0.3F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1904F, 9.228F, 0.9058F, 0.0183F, 1.1167F, 1.586F));
		PartDefinition torso_r18 = tubes.addOrReplaceChild("torso_r18", CubeListBuilder.create().texOffs(0, 56).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7902F, 9.4869F, 1.0084F, 0.1172F, 1.1167F, 1.5462F));
		PartDefinition torso_r19 = tubes.addOrReplaceChild("torso_r19", CubeListBuilder.create().texOffs(6, 57).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7902F, 9.4869F, 1.0084F, 0.1172F, -1.1167F, -1.5462F));
		PartDefinition torso_r20 = tubes.addOrReplaceChild("torso_r20", CubeListBuilder.create().texOffs(31, 49).addBox(-0.5F, -0.5F, -0.4999F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.2525F, 9.6382F, 0.8469F, -0.9643F, -0.7009F, -0.2658F));
		PartDefinition torso_r21 = tubes.addOrReplaceChild("torso_r21", CubeListBuilder.create().texOffs(54, 47).addBox(-0.5001F, -1.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0748F, 10.209F, -0.375F, -1.1117F, 0.1841F, 0.2451F));
		PartDefinition torso_r22 = tubes.addOrReplaceChild("torso_r22", CubeListBuilder.create().texOffs(56, 13).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.1272F, 10.252F, -0.0458F, -0.6318F, 0.1841F, 0.2451F));
		PartDefinition right_arm = Body.addOrReplaceChild("right_arm",
				CubeListBuilder.create().texOffs(49, 19).addBox(-2.0F, 2.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 32).addBox(-2.5F, -2.0F, -2.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-6.0F, -1.0F, 0.0F));
		PartDefinition shoulderarmor = right_arm.addOrReplaceChild("shoulderarmor",
				CubeListBuilder.create().texOffs(33, 49).addBox(-1.0F, 0.75F, -2.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(15, 64).addBox(-1.0F, -5.25F, 2.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(-1.0F, -5.25F, -3.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 25).addBox(-1.0F, -3.25F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 42)
						.addBox(-1.0F, -0.25F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(53, 50).addBox(-1.0F, -5.25F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(46, 61)
						.addBox(-0.5F, -1.25F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(61, 15).addBox(-0.5F, -4.25F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(58, 37)
						.addBox(-0.5F, -3.25F, 1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 30).addBox(-0.5F, -3.25F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(69, 29)
						.addBox(-0.5F, -3.25F, -5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(68, 63).addBox(-0.5F, -3.25F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(59, 20)
						.addBox(-0.5F, -7.25F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.75F, 2.25F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition left_arm_r1 = shoulderarmor.addOrReplaceChild("left_arm_r1", CubeListBuilder.create().texOffs(67, 68).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.75F, 4.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition left_arm_r2 = shoulderarmor.addOrReplaceChild("left_arm_r2", CubeListBuilder.create().texOffs(69, 18).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.75F, -4.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition lowerarm = right_arm.addOrReplaceChild("lowerarm",
				CubeListBuilder.create().texOffs(18, 33).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 41).addBox(-1.5F, 5.0F, -2.5F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(55, 69)
						.addBox(-0.5F, -1.0F, 1.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 65).addBox(0.0F, -0.5F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 4.0F, 0.0F));
		PartDefinition rapier = lowerarm.addOrReplaceChild("rapier",
				CubeListBuilder.create().texOffs(67, 14).addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 10).addBox(-1.5F, 1.0F, -1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 8)
						.addBox(-1.5F, -2.0F, -1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(71, 48).addBox(-1.75F, 1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 71)
						.addBox(-1.75F, -2.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 42).addBox(1.0F, -1.5F, -1.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 64)
						.addBox(-2.0F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5F, 6.5F, -2.0F));
		PartDefinition tip = rapier.addOrReplaceChild("tip", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, -14.0F, 1.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -2.0F));
		PartDefinition left_arm = Body.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(49, 19).mirror().addBox(-1.0F, 2.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 32).mirror()
				.addBox(-1.5F, -2.0F, -2.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(6.0F, -1.0F, 0.0F));
		PartDefinition shoulderarmor2 = left_arm.addOrReplaceChild("shoulderarmor2",
				CubeListBuilder.create().texOffs(33, 49).mirror().addBox(-1.0F, 0.75F, -2.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(15, 64).mirror().addBox(-1.0F, -5.25F, 2.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 17).mirror().addBox(-1.0F, -5.25F, -3.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(66, 25).mirror().addBox(-1.0F, -3.25F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(54, 42).mirror().addBox(-1.0F, -0.25F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(53, 50).mirror().addBox(-1.0F, -5.25F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(46, 61).mirror().addBox(-0.5F, -1.25F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(61, 15).mirror().addBox(-0.5F, -4.25F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(58, 37).mirror().addBox(-0.5F, -3.25F, 1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(58, 30).mirror().addBox(-0.5F, -3.25F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(69, 29).mirror().addBox(-0.5F, -3.25F, -5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(68, 63).mirror().addBox(-0.5F, -3.25F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(59, 20).mirror().addBox(-0.5F, -7.25F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.75F, 2.25F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition left_arm_r3 = shoulderarmor2.addOrReplaceChild("left_arm_r3", CubeListBuilder.create().texOffs(67, 68).mirror().addBox(-0.5F, -1.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -4.75F, 4.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition left_arm_r4 = shoulderarmor2.addOrReplaceChild("left_arm_r4", CubeListBuilder.create().texOffs(69, 18).mirror().addBox(-0.5F, -1.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -4.75F, -4.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition lowerarm2 = left_arm.addOrReplaceChild("lowerarm2",
				CubeListBuilder.create().texOffs(18, 33).mirror().addBox(-2.0F, 0.0F, -2.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 41).mirror().addBox(-2.5F, 5.0F, -2.5F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(55, 69).mirror().addBox(-1.5F, -1.0F, 1.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(26, 65).mirror().addBox(-1.0F, -0.5F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offset(1.0F, 4.0F, 0.0F));
		PartDefinition left_leg = Body.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(42, 53).addBox(-1.5F, -2.0F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, 11.0F, 0.0F));
		PartDefinition realleg = left_leg.addOrReplaceChild("realleg",
				CubeListBuilder.create().texOffs(32, 40).addBox(-2.0F, 2.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(62, 9).addBox(1.25F, 1.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(62, 3)
						.addBox(-2.25F, 1.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(66, 1).addBox(-2.0F, 1.0F, -2.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 44)
						.addBox(-2.0F, 1.0F, 1.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition lowerleg = left_leg.addOrReplaceChild("lowerleg",
				CubeListBuilder.create().texOffs(28, 24).addBox(-2.5F, 4.5F, 0.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 55).addBox(-2.0F, 5.0F, -4.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 6.0F, 0.0F));
		PartDefinition extra = lowerleg.addOrReplaceChild("extra",
				CubeListBuilder.create().texOffs(44, 42).addBox(-2.0F, 1.5F, 1.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 25).addBox(-2.25F, 1.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 30)
						.addBox(-2.0F, 1.5F, -2.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 60).addBox(1.25F, 1.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 3)
						.addBox(-2.5F, 0.25F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition realleglower = lowerleg.addOrReplaceChild("realleglower",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(35, 68).addBox(-1.0F, 0.0F, -2.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition right_leg = Body.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(42, 53).mirror().addBox(-1.5F, -2.0F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.5F, 11.0F, 0.0F));
		PartDefinition realleg2 = right_leg.addOrReplaceChild("realleg2",
				CubeListBuilder.create().texOffs(32, 40).mirror().addBox(-2.0F, 2.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(62, 9).mirror().addBox(-2.25F, 1.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(62, 3).mirror().addBox(1.25F, 1.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(66, 1).mirror().addBox(-2.0F, 1.0F, -2.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(62, 44).mirror().addBox(-2.0F, 1.0F, 1.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition lowerleg2 = right_leg.addOrReplaceChild("lowerleg2", CubeListBuilder.create().texOffs(28, 24).mirror().addBox(-2.5F, 4.5F, 0.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(56, 55).mirror()
				.addBox(-2.0F, 5.0F, -4.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 6.0F, 0.0F));
		PartDefinition extra2 = lowerleg2.addOrReplaceChild("extra2",
				CubeListBuilder.create().texOffs(44, 42).mirror().addBox(-2.0F, 1.5F, 1.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(60, 25).mirror().addBox(1.25F, 1.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(36, 30).mirror().addBox(-2.0F, 1.5F, -2.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(26, 60).mirror().addBox(-2.25F, 1.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(52, 3).mirror().addBox(-2.5F, 0.25F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition realleglower2 = lowerleg2.addOrReplaceChild("realleglower2", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(35, 68).mirror()
				.addBox(-1.0F, 0.0F, -2.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition barragearms = Body.addOrReplaceChild("barragearms", CubeListBuilder.create(), PartPose.offset(-7.0F, 3.0F, 0.0F));
		PartDefinition barrage_arm1 = barragearms.addOrReplaceChild("barrage_arm1",
				CubeListBuilder.create().texOffs(18, 33).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 41).addBox(-1.5F, 5.0F, -2.5F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition rapier5 = barrage_arm1.addOrReplaceChild("rapier5",
				CubeListBuilder.create().texOffs(67, 14).addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 10).addBox(-1.5F, 1.0F, -1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 8)
						.addBox(-1.5F, -2.0F, -1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(71, 48).addBox(-1.75F, 1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 71)
						.addBox(-1.75F, -2.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 42).addBox(1.0F, -1.5F, -1.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 64)
						.addBox(-2.0F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5F, 6.5F, -2.0F));
		PartDefinition tip5 = rapier5.addOrReplaceChild("tip5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, -14.0F, 1.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -2.0F));
		PartDefinition barrage_arm2 = barragearms.addOrReplaceChild("barrage_arm2",
				CubeListBuilder.create().texOffs(18, 33).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 41).addBox(-1.5F, 5.0F, -2.5F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition rapier2 = barrage_arm2.addOrReplaceChild("rapier2",
				CubeListBuilder.create().texOffs(67, 14).addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 10).addBox(-1.5F, 1.0F, -1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 8)
						.addBox(-1.5F, -2.0F, -1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(71, 48).addBox(-1.75F, 1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 71)
						.addBox(-1.75F, -2.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 42).addBox(1.0F, -1.5F, -1.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 64)
						.addBox(-2.0F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5F, 6.5F, -2.0F));
		PartDefinition tip2 = rapier2.addOrReplaceChild("tip2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, -14.0F, 1.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -2.0F));
		PartDefinition barrage_arm3 = barragearms.addOrReplaceChild("barrage_arm3",
				CubeListBuilder.create().texOffs(18, 33).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 41).addBox(-1.5F, 5.0F, -2.5F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition rapier3 = barrage_arm3.addOrReplaceChild("rapier3",
				CubeListBuilder.create().texOffs(67, 14).addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 10).addBox(-1.5F, 1.0F, -1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 8)
						.addBox(-1.5F, -2.0F, -1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(71, 48).addBox(-1.75F, 1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 71)
						.addBox(-1.75F, -2.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 42).addBox(1.0F, -1.5F, -1.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 64)
						.addBox(-2.0F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5F, 6.5F, -2.0F));
		PartDefinition tip3 = rapier3.addOrReplaceChild("tip3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, -14.0F, 1.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -2.0F));
		PartDefinition barrage_arm4 = barragearms.addOrReplaceChild("barrage_arm4",
				CubeListBuilder.create().texOffs(18, 33).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 41).addBox(-1.5F, 5.0F, -2.5F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition rapier4 = barrage_arm4.addOrReplaceChild("rapier4",
				CubeListBuilder.create().texOffs(67, 14).addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 10).addBox(-1.5F, 1.0F, -1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 8)
						.addBox(-1.5F, -2.0F, -1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(71, 48).addBox(-1.75F, 1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 71)
						.addBox(-1.75F, -2.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 42).addBox(1.0F, -1.5F, -1.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 64)
						.addBox(-2.0F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5F, 6.5F, -2.0F));
		PartDefinition tip4 = rapier4.addOrReplaceChild("tip4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, -14.0F, 1.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -2.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
