package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.HeavensDoorEntity;

public class HeavensDoorModel extends GeoModel<HeavensDoorEntity> {
	@Override
	public ResourceLocation getAnimationResource(HeavensDoorEntity entity) {
		return new ResourceLocation("jojowos", "animations/heavensdoor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HeavensDoorEntity entity) {
		return new ResourceLocation("jojowos", "geo/heavensdoor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HeavensDoorEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
