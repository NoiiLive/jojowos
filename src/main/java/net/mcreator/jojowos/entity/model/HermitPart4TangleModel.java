package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.HermitPart4TangleEntity;

public class HermitPart4TangleModel extends GeoModel<HermitPart4TangleEntity> {
	@Override
	public ResourceLocation getAnimationResource(HermitPart4TangleEntity entity) {
		return new ResourceLocation("jojowos", "animations/hermittangle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HermitPart4TangleEntity entity) {
		return new ResourceLocation("jojowos", "geo/hermittangle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HermitPart4TangleEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
