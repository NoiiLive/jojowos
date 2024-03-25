package net.mcreator.jojowos.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.item.HermitRedItem;

public class HermitRedItemModel extends GeoModel<HermitRedItem> {
	@Override
	public ResourceLocation getAnimationResource(HermitRedItem animatable) {
		return new ResourceLocation("jojowos", "animations/hermitpurple.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HermitRedItem animatable) {
		return new ResourceLocation("jojowos", "geo/hermitpurple.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HermitRedItem animatable) {
		return new ResourceLocation("jojowos", "textures/item/hermitred.png");
	}
}
