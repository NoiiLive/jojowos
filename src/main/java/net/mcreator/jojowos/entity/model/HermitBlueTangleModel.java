package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.HermitBlueTangleEntity;

public class HermitBlueTangleModel extends GeoModel<HermitBlueTangleEntity> {
	@Override
	public ResourceLocation getAnimationResource(HermitBlueTangleEntity entity) {
		return new ResourceLocation("jojowos", "animations/hermittangle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HermitBlueTangleEntity entity) {
		return new ResourceLocation("jojowos", "geo/hermittangle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HermitBlueTangleEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
