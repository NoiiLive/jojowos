package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.HierophantGreenBlueEntity;

public class HierophantGreenBlueModel extends GeoModel<HierophantGreenBlueEntity> {
	@Override
	public ResourceLocation getAnimationResource(HierophantGreenBlueEntity entity) {
		return new ResourceLocation("jojowos", "animations/hierophantgreenmanga.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HierophantGreenBlueEntity entity) {
		return new ResourceLocation("jojowos", "geo/hierophantgreenmanga.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HierophantGreenBlueEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
