package net.mcreator.jojowos.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.item.HermitPurpleNeroItem;

public class HermitPurpleNeroItemModel extends GeoModel<HermitPurpleNeroItem> {
	@Override
	public ResourceLocation getAnimationResource(HermitPurpleNeroItem animatable) {
		return new ResourceLocation("jojowos", "animations/hermitpurplenero.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HermitPurpleNeroItem animatable) {
		return new ResourceLocation("jojowos", "geo/hermitpurplenero.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HermitPurpleNeroItem animatable) {
		return new ResourceLocation("jojowos", "textures/item/hermitpurplenerotexture.png");
	}
}
