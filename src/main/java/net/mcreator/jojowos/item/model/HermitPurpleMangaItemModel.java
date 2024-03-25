package net.mcreator.jojowos.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.item.HermitPurpleMangaItem;

public class HermitPurpleMangaItemModel extends GeoModel<HermitPurpleMangaItem> {
	@Override
	public ResourceLocation getAnimationResource(HermitPurpleMangaItem animatable) {
		return new ResourceLocation("jojowos", "animations/hermitpurple.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HermitPurpleMangaItem animatable) {
		return new ResourceLocation("jojowos", "geo/hermitpurple.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HermitPurpleMangaItem animatable) {
		return new ResourceLocation("jojowos", "textures/item/hermitmanga.png");
	}
}
