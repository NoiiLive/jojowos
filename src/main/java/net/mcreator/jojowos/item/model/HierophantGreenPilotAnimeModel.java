package net.mcreator.jojowos.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.item.HierophantGreenPilotAnimeItem;

public class HierophantGreenPilotAnimeModel extends GeoModel<HierophantGreenPilotAnimeItem> {
	@Override
	public ResourceLocation getAnimationResource(HierophantGreenPilotAnimeItem object) {
		return new ResourceLocation("jojowos", "animations/hierophantplayeranime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HierophantGreenPilotAnimeItem object) {
		return new ResourceLocation("jojowos", "geo/hierophantplayeranime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HierophantGreenPilotAnimeItem object) {
		return new ResourceLocation("jojowos", "textures/item/hierophantgreenanimetexture.png");
	}
}
