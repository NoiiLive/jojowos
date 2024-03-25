package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.StarPlatinumP4Entity;

public class StarPlatinumP4Model extends GeoModel<StarPlatinumP4Entity> {
	@Override
	public ResourceLocation getAnimationResource(StarPlatinumP4Entity entity) {
		return new ResourceLocation("jojowos", "animations/starplatinump4.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StarPlatinumP4Entity entity) {
		return new ResourceLocation("jojowos", "geo/starplatinump4.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StarPlatinumP4Entity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
