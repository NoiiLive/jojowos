package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.HermitMangaTangleEntity;

public class HermitMangaTangleModel extends GeoModel<HermitMangaTangleEntity> {
	@Override
	public ResourceLocation getAnimationResource(HermitMangaTangleEntity entity) {
		return new ResourceLocation("jojowos", "animations/hermittangle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HermitMangaTangleEntity entity) {
		return new ResourceLocation("jojowos", "geo/hermittangle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HermitMangaTangleEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
