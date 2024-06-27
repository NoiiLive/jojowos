package net.mcreator.jojowos.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.item.HermitPurpleVenomItem;

public class HermitPurpleVenomItemModel extends GeoModel<HermitPurpleVenomItem> {
	@Override
	public ResourceLocation getAnimationResource(HermitPurpleVenomItem animatable) {
		return new ResourceLocation("jojowos", "animations/hermitpurplevenom.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HermitPurpleVenomItem animatable) {
		return new ResourceLocation("jojowos", "geo/hermitpurplevenom.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HermitPurpleVenomItem animatable) {
		return new ResourceLocation("jojowos", "textures/item/hermitpurplevenomtexture.png");
	}
}
