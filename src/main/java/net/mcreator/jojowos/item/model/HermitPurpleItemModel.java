package net.mcreator.jojowos.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.item.HermitPurpleItem;

public class HermitPurpleItemModel extends GeoModel<HermitPurpleItem> {
	@Override
	public ResourceLocation getAnimationResource(HermitPurpleItem animatable) {
		return new ResourceLocation("jojowos", "animations/hermitpurple.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HermitPurpleItem animatable) {
		return new ResourceLocation("jojowos", "geo/hermitpurple.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HermitPurpleItem animatable) {
		return new ResourceLocation("jojowos", "textures/item/hermitpurple.png");
	}
}
