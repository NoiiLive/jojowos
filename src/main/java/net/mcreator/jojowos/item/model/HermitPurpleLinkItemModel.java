package net.mcreator.jojowos.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.item.HermitPurpleLinkItem;

public class HermitPurpleLinkItemModel extends GeoModel<HermitPurpleLinkItem> {
	@Override
	public ResourceLocation getAnimationResource(HermitPurpleLinkItem animatable) {
		return new ResourceLocation("jojowos", "animations/hermitpurplelink.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HermitPurpleLinkItem animatable) {
		return new ResourceLocation("jojowos", "geo/hermitpurplelink.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HermitPurpleLinkItem animatable) {
		return new ResourceLocation("jojowos", "textures/item/hermitpurplelinktexture.png");
	}
}
