package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.TheWorldImposterEntity;

public class TheWorldImposterModel extends GeoModel<TheWorldImposterEntity> {
	@Override
	public ResourceLocation getAnimationResource(TheWorldImposterEntity entity) {
		return new ResourceLocation("jojowos", "animations/theworldimposter.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TheWorldImposterEntity entity) {
		return new ResourceLocation("jojowos", "geo/theworldimposter.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TheWorldImposterEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
