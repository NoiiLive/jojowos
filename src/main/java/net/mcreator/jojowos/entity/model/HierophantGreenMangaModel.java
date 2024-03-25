package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.HierophantGreenMangaEntity;

public class HierophantGreenMangaModel extends GeoModel<HierophantGreenMangaEntity> {
	@Override
	public ResourceLocation getAnimationResource(HierophantGreenMangaEntity entity) {
		return new ResourceLocation("jojowos", "animations/hierophantgreenmanga.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HierophantGreenMangaEntity entity) {
		return new ResourceLocation("jojowos", "geo/hierophantgreenmanga.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HierophantGreenMangaEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
