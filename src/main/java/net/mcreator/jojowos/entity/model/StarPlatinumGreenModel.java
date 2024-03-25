package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.StarPlatinumGreenEntity;

public class StarPlatinumGreenModel extends GeoModel<StarPlatinumGreenEntity> {
	@Override
	public ResourceLocation getAnimationResource(StarPlatinumGreenEntity entity) {
		return new ResourceLocation("jojowos", "animations/starplatinummanga.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StarPlatinumGreenEntity entity) {
		return new ResourceLocation("jojowos", "geo/starplatinummanga.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StarPlatinumGreenEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
