package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.TheWorldMangaEntity;

public class TheWorldMangaModel extends GeoModel<TheWorldMangaEntity> {
	@Override
	public ResourceLocation getAnimationResource(TheWorldMangaEntity entity) {
		return new ResourceLocation("jojowos", "animations/theworld.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TheWorldMangaEntity entity) {
		return new ResourceLocation("jojowos", "geo/theworld.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TheWorldMangaEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
