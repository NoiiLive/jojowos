package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.TheFoolOVAEntity;

public class TheFoolOVAModel extends GeoModel<TheFoolOVAEntity> {
	@Override
	public ResourceLocation getAnimationResource(TheFoolOVAEntity entity) {
		return new ResourceLocation("jojowos", "animations/thefool.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TheFoolOVAEntity entity) {
		return new ResourceLocation("jojowos", "geo/thefool.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TheFoolOVAEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
