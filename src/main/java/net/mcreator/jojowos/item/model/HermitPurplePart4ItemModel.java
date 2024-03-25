package net.mcreator.jojowos.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.item.HermitPurplePart4Item;

public class HermitPurplePart4ItemModel extends GeoModel<HermitPurplePart4Item> {
	@Override
	public ResourceLocation getAnimationResource(HermitPurplePart4Item animatable) {
		return new ResourceLocation("jojowos", "animations/hermitpurple.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HermitPurplePart4Item animatable) {
		return new ResourceLocation("jojowos", "geo/hermitpurple.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HermitPurplePart4Item animatable) {
		return new ResourceLocation("jojowos", "textures/item/hermitpart4.png");
	}
}
