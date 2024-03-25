package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.SilverChariotGoldArmorlessEntity;

public class SilverChariotGoldArmorlessModel extends GeoModel<SilverChariotGoldArmorlessEntity> {
	@Override
	public ResourceLocation getAnimationResource(SilverChariotGoldArmorlessEntity entity) {
		return new ResourceLocation("jojowos", "animations/silverchariotanimearmorless.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SilverChariotGoldArmorlessEntity entity) {
		return new ResourceLocation("jojowos", "geo/silverchariotanimearmorless.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SilverChariotGoldArmorlessEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
