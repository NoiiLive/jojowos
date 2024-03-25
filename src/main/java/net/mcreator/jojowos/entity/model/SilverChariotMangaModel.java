package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.SilverChariotMangaEntity;

public class SilverChariotMangaModel extends GeoModel<SilverChariotMangaEntity> {
	@Override
	public ResourceLocation getAnimationResource(SilverChariotMangaEntity entity) {
		return new ResourceLocation("jojowos", "animations/silverchariotanime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SilverChariotMangaEntity entity) {
		return new ResourceLocation("jojowos", "geo/silverchariotanime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SilverChariotMangaEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
