package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.SilverChariotEntity;

public class SilverChariotModel extends GeoModel<SilverChariotEntity> {
	@Override
	public ResourceLocation getAnimationResource(SilverChariotEntity entity) {
		return new ResourceLocation("jojowos", "animations/silverchariotanime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SilverChariotEntity entity) {
		return new ResourceLocation("jojowos", "geo/silverchariotanime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SilverChariotEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
