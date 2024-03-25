package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.SilverChariotOVAArmorlessEntity;

public class SilverChariotOVAArmorlessModel extends GeoModel<SilverChariotOVAArmorlessEntity> {
	@Override
	public ResourceLocation getAnimationResource(SilverChariotOVAArmorlessEntity entity) {
		return new ResourceLocation("jojowos", "animations/silverchariotovaarmorless.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SilverChariotOVAArmorlessEntity entity) {
		return new ResourceLocation("jojowos", "geo/silverchariotovaarmorless.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SilverChariotOVAArmorlessEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
