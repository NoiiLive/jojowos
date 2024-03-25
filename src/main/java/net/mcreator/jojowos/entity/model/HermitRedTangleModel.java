package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.HermitRedTangleEntity;

public class HermitRedTangleModel extends GeoModel<HermitRedTangleEntity> {
	@Override
	public ResourceLocation getAnimationResource(HermitRedTangleEntity entity) {
		return new ResourceLocation("jojowos", "animations/hermittangle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HermitRedTangleEntity entity) {
		return new ResourceLocation("jojowos", "geo/hermittangle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HermitRedTangleEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
