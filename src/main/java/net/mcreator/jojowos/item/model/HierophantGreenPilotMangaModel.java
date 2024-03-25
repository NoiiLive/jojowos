package net.mcreator.jojowos.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.item.HierophantGreenPilotMangaItem;

public class HierophantGreenPilotMangaModel extends GeoModel<HierophantGreenPilotMangaItem> {
	@Override
	public ResourceLocation getAnimationResource(HierophantGreenPilotMangaItem object) {
		return new ResourceLocation("jojowos", "animations/hierophantplayermanga.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HierophantGreenPilotMangaItem object) {
		return new ResourceLocation("jojowos", "geo/hierophantplayermanga.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HierophantGreenPilotMangaItem object) {
		return new ResourceLocation("jojowos", "textures/item/hierophantgreenmangatexture.png");
	}
}
