package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.MagiciansRedEntity;

public class MagiciansRedModel extends GeoModel<MagiciansRedEntity> {
	@Override
	public ResourceLocation getAnimationResource(MagiciansRedEntity entity) {
		return new ResourceLocation("jojowos", "animations/magiciansredanime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MagiciansRedEntity entity) {
		return new ResourceLocation("jojowos", "geo/magiciansredanime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MagiciansRedEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
