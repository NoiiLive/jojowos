package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.MagiciansGreenEntity;

public class MagiciansGreenModel extends GeoModel<MagiciansGreenEntity> {
	@Override
	public ResourceLocation getAnimationResource(MagiciansGreenEntity entity) {
		return new ResourceLocation("jojowos", "animations/magiciansredanime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MagiciansGreenEntity entity) {
		return new ResourceLocation("jojowos", "geo/magiciansredanime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MagiciansGreenEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
