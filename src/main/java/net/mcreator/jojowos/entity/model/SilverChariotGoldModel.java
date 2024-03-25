package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.SilverChariotGoldEntity;

public class SilverChariotGoldModel extends GeoModel<SilverChariotGoldEntity> {
	@Override
	public ResourceLocation getAnimationResource(SilverChariotGoldEntity entity) {
		return new ResourceLocation("jojowos", "animations/silverchariotanime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SilverChariotGoldEntity entity) {
		return new ResourceLocation("jojowos", "geo/silverchariotanime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SilverChariotGoldEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
