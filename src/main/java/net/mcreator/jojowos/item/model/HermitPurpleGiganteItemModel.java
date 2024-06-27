package net.mcreator.jojowos.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.item.HermitPurpleGiganteItem;

public class HermitPurpleGiganteItemModel extends GeoModel<HermitPurpleGiganteItem> {
	@Override
	public ResourceLocation getAnimationResource(HermitPurpleGiganteItem animatable) {
		return new ResourceLocation("jojowos", "animations/hermitpurplegigante.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HermitPurpleGiganteItem animatable) {
		return new ResourceLocation("jojowos", "geo/hermitpurplegigante.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HermitPurpleGiganteItem animatable) {
		return new ResourceLocation("jojowos", "textures/item/hermitpurplegigante.png");
	}
}
