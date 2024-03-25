package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.SilverChariotMangaArmorlessEntity;

public class SilverChariotMangaArmorlessModel extends GeoModel<SilverChariotMangaArmorlessEntity> {
	@Override
	public ResourceLocation getAnimationResource(SilverChariotMangaArmorlessEntity entity) {
		return new ResourceLocation("jojowos", "animations/silverchariotanimearmorless.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SilverChariotMangaArmorlessEntity entity) {
		return new ResourceLocation("jojowos", "geo/silverchariotanimearmorless.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SilverChariotMangaArmorlessEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
