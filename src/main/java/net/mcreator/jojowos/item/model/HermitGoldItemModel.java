package net.mcreator.jojowos.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.item.HermitGoldItem;

public class HermitGoldItemModel extends GeoModel<HermitGoldItem> {
	@Override
	public ResourceLocation getAnimationResource(HermitGoldItem animatable) {
		return new ResourceLocation("jojowos", "animations/hermitpurple.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HermitGoldItem animatable) {
		return new ResourceLocation("jojowos", "geo/hermitpurple.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HermitGoldItem animatable) {
		return new ResourceLocation("jojowos", "textures/item/hermitgold.png");
	}
}
