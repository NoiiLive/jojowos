package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.SilverChariotOVAEntity;

public class SilverChariotOVAModel extends GeoModel<SilverChariotOVAEntity> {
	@Override
	public ResourceLocation getAnimationResource(SilverChariotOVAEntity entity) {
		return new ResourceLocation("jojowos", "animations/silverchariotova.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SilverChariotOVAEntity entity) {
		return new ResourceLocation("jojowos", "geo/silverchariotova.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SilverChariotOVAEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
