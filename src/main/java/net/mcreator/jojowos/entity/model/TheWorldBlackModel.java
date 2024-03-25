package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.TheWorldBlackEntity;

public class TheWorldBlackModel extends GeoModel<TheWorldBlackEntity> {
	@Override
	public ResourceLocation getAnimationResource(TheWorldBlackEntity entity) {
		return new ResourceLocation("jojowos", "animations/theworld.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TheWorldBlackEntity entity) {
		return new ResourceLocation("jojowos", "geo/theworld.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TheWorldBlackEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
