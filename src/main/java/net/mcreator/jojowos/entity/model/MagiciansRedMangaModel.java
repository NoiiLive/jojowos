package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.MagiciansRedMangaEntity;

public class MagiciansRedMangaModel extends GeoModel<MagiciansRedMangaEntity> {
	@Override
	public ResourceLocation getAnimationResource(MagiciansRedMangaEntity entity) {
		return new ResourceLocation("jojowos", "animations/magiciansredmanga.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MagiciansRedMangaEntity entity) {
		return new ResourceLocation("jojowos", "geo/magiciansredmanga.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MagiciansRedMangaEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
