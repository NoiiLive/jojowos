package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.SilverChariotArmorlessEntity;

public class SilverChariotArmorlessModel extends GeoModel<SilverChariotArmorlessEntity> {
	@Override
	public ResourceLocation getAnimationResource(SilverChariotArmorlessEntity entity) {
		return new ResourceLocation("jojowos", "animations/silverchariotanimearmorless.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SilverChariotArmorlessEntity entity) {
		return new ResourceLocation("jojowos", "geo/silverchariotanimearmorless.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SilverChariotArmorlessEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
