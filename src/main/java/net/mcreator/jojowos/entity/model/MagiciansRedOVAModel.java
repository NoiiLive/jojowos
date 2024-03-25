package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.MagiciansRedOVAEntity;

public class MagiciansRedOVAModel extends GeoModel<MagiciansRedOVAEntity> {
	@Override
	public ResourceLocation getAnimationResource(MagiciansRedOVAEntity entity) {
		return new ResourceLocation("jojowos", "animations/magiciansredova.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MagiciansRedOVAEntity entity) {
		return new ResourceLocation("jojowos", "geo/magiciansredova.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MagiciansRedOVAEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
