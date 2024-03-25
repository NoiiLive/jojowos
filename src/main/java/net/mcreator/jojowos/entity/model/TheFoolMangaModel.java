package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.TheFoolMangaEntity;

public class TheFoolMangaModel extends GeoModel<TheFoolMangaEntity> {
	@Override
	public ResourceLocation getAnimationResource(TheFoolMangaEntity entity) {
		return new ResourceLocation("jojowos", "animations/thefool.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TheFoolMangaEntity entity) {
		return new ResourceLocation("jojowos", "geo/thefool.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TheFoolMangaEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
