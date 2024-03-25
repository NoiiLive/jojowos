package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.TheWorldSilverEntity;

public class TheWorldSilverModel extends GeoModel<TheWorldSilverEntity> {
	@Override
	public ResourceLocation getAnimationResource(TheWorldSilverEntity entity) {
		return new ResourceLocation("jojowos", "animations/theworld.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TheWorldSilverEntity entity) {
		return new ResourceLocation("jojowos", "geo/theworld.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TheWorldSilverEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
