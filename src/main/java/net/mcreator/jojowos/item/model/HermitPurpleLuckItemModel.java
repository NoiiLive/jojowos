package net.mcreator.jojowos.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.item.HermitPurpleLuckItem;

public class HermitPurpleLuckItemModel extends GeoModel<HermitPurpleLuckItem> {
	@Override
	public ResourceLocation getAnimationResource(HermitPurpleLuckItem animatable) {
		return new ResourceLocation("jojowos", "animations/hermitpurpleluck.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HermitPurpleLuckItem animatable) {
		return new ResourceLocation("jojowos", "geo/hermitpurpleluck.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HermitPurpleLuckItem animatable) {
		return new ResourceLocation("jojowos", "textures/item/hermitpurplelucktexture.png");
	}
}
