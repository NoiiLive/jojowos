package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.StarPlatinumOVAEntity;

public class StarPlatinumOVAModel extends GeoModel<StarPlatinumOVAEntity> {
	@Override
	public ResourceLocation getAnimationResource(StarPlatinumOVAEntity entity) {
		return new ResourceLocation("jojowos", "animations/starplatinumova.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StarPlatinumOVAEntity entity) {
		return new ResourceLocation("jojowos", "geo/starplatinumova.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StarPlatinumOVAEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
