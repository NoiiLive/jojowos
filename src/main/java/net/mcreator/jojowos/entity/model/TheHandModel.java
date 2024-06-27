package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.TheHandEntity;

public class TheHandModel extends GeoModel<TheHandEntity> {
	@Override
	public ResourceLocation getAnimationResource(TheHandEntity entity) {
		return new ResourceLocation("jojowos", "animations/thehand.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TheHandEntity entity) {
		return new ResourceLocation("jojowos", "geo/thehand.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TheHandEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
