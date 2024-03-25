package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.MagiciansRedASBEntity;

public class MagiciansRedASBModel extends GeoModel<MagiciansRedASBEntity> {
	@Override
	public ResourceLocation getAnimationResource(MagiciansRedASBEntity entity) {
		return new ResourceLocation("jojowos", "animations/magiciansredasb.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MagiciansRedASBEntity entity) {
		return new ResourceLocation("jojowos", "geo/magiciansredasb.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MagiciansRedASBEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
