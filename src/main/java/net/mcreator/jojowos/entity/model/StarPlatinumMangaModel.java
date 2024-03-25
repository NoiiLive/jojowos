package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.StarPlatinumMangaEntity;

public class StarPlatinumMangaModel extends GeoModel<StarPlatinumMangaEntity> {
	@Override
	public ResourceLocation getAnimationResource(StarPlatinumMangaEntity entity) {
		return new ResourceLocation("jojowos", "animations/starplatinummanga.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StarPlatinumMangaEntity entity) {
		return new ResourceLocation("jojowos", "geo/starplatinummanga.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StarPlatinumMangaEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
