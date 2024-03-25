package net.mcreator.jojowos.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.item.HermitPurpleAutomailItem;

public class HermitPurpleAutomailItemModel extends GeoModel<HermitPurpleAutomailItem> {
	@Override
	public ResourceLocation getAnimationResource(HermitPurpleAutomailItem animatable) {
		return new ResourceLocation("jojowos", "animations/hermitpurpleautomail.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HermitPurpleAutomailItem animatable) {
		return new ResourceLocation("jojowos", "geo/hermitpurpleautomail.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HermitPurpleAutomailItem animatable) {
		return new ResourceLocation("jojowos", "textures/item/hermitpurpleautomailtexture.png");
	}
}
