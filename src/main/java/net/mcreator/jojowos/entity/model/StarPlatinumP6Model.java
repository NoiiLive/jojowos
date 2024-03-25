package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.StarPlatinumP6Entity;

public class StarPlatinumP6Model extends GeoModel<StarPlatinumP6Entity> {
	@Override
	public ResourceLocation getAnimationResource(StarPlatinumP6Entity entity) {
		return new ResourceLocation("jojowos", "animations/starplatinump6.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StarPlatinumP6Entity entity) {
		return new ResourceLocation("jojowos", "geo/starplatinump6.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StarPlatinumP6Entity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
