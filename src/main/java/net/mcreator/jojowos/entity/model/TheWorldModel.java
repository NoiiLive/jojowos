package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.TheWorldEntity;

public class TheWorldModel extends GeoModel<TheWorldEntity> {
	@Override
	public ResourceLocation getAnimationResource(TheWorldEntity entity) {
		return new ResourceLocation("jojowos", "animations/theworld.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TheWorldEntity entity) {
		return new ResourceLocation("jojowos", "geo/theworld.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TheWorldEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
