package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.TheWorldShadowEntity;

public class TheWorldShadowModel extends GeoModel<TheWorldShadowEntity> {
	@Override
	public ResourceLocation getAnimationResource(TheWorldShadowEntity entity) {
		return new ResourceLocation("jojowos", "animations/shadowtheworld.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TheWorldShadowEntity entity) {
		return new ResourceLocation("jojowos", "geo/shadowtheworld.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TheWorldShadowEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
