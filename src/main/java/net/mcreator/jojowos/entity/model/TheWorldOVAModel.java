package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.TheWorldOVAEntity;

public class TheWorldOVAModel extends GeoModel<TheWorldOVAEntity> {
	@Override
	public ResourceLocation getAnimationResource(TheWorldOVAEntity entity) {
		return new ResourceLocation("jojowos", "animations/theworld.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TheWorldOVAEntity entity) {
		return new ResourceLocation("jojowos", "geo/theworld.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TheWorldOVAEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
