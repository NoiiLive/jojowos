package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.StarPlatinumBlueEntity;

public class StarPlatinumBlueModel extends GeoModel<StarPlatinumBlueEntity> {
	@Override
	public ResourceLocation getAnimationResource(StarPlatinumBlueEntity entity) {
		return new ResourceLocation("jojowos", "animations/starplatinummanga.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StarPlatinumBlueEntity entity) {
		return new ResourceLocation("jojowos", "geo/starplatinummanga.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StarPlatinumBlueEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
