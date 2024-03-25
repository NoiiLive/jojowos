package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.StarPlatinumP3Entity;

public class StarPlatinumP3Model extends GeoModel<StarPlatinumP3Entity> {
	@Override
	public ResourceLocation getAnimationResource(StarPlatinumP3Entity entity) {
		return new ResourceLocation("jojowos", "animations/starplatinump3.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StarPlatinumP3Entity entity) {
		return new ResourceLocation("jojowos", "geo/starplatinump3.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StarPlatinumP3Entity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
