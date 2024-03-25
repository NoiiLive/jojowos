package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.HermitGoldTangleEntity;

public class HermitGoldTangleModel extends GeoModel<HermitGoldTangleEntity> {
	@Override
	public ResourceLocation getAnimationResource(HermitGoldTangleEntity entity) {
		return new ResourceLocation("jojowos", "animations/hermittangle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HermitGoldTangleEntity entity) {
		return new ResourceLocation("jojowos", "geo/hermittangle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HermitGoldTangleEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
