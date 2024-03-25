package net.mcreator.jojowos.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.item.HermitBlueItem;

public class HermitBlueItemModel extends GeoModel<HermitBlueItem> {
	@Override
	public ResourceLocation getAnimationResource(HermitBlueItem animatable) {
		return new ResourceLocation("jojowos", "animations/hermitpurple.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HermitBlueItem animatable) {
		return new ResourceLocation("jojowos", "geo/hermitpurple.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HermitBlueItem animatable) {
		return new ResourceLocation("jojowos", "textures/item/hermitblue.png");
	}
}
