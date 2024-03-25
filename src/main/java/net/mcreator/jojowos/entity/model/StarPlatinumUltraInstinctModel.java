package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.StarPlatinumUltraInstinctEntity;

public class StarPlatinumUltraInstinctModel extends GeoModel<StarPlatinumUltraInstinctEntity> {
	@Override
	public ResourceLocation getAnimationResource(StarPlatinumUltraInstinctEntity entity) {
		return new ResourceLocation("jojowos", "animations/starplatinumultrainstinct.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StarPlatinumUltraInstinctEntity entity) {
		return new ResourceLocation("jojowos", "geo/starplatinumultrainstinct.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StarPlatinumUltraInstinctEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
