package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.TheFoolEntity;

public class TheFoolModel extends GeoModel<TheFoolEntity> {
	@Override
	public ResourceLocation getAnimationResource(TheFoolEntity entity) {
		return new ResourceLocation("jojowos", "animations/thefool.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TheFoolEntity entity) {
		return new ResourceLocation("jojowos", "geo/thefool.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TheFoolEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
