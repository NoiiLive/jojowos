package net.mcreator.jojowos.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.item.HierophantGreenPilotOVAItem;

public class HierophantGreenPilotOVAModel extends GeoModel<HierophantGreenPilotOVAItem> {
	@Override
	public ResourceLocation getAnimationResource(HierophantGreenPilotOVAItem object) {
		return new ResourceLocation("jojowos", "animations/hierophantplayerova.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HierophantGreenPilotOVAItem object) {
		return new ResourceLocation("jojowos", "geo/hierophantplayerova.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HierophantGreenPilotOVAItem object) {
		return new ResourceLocation("jojowos", "textures/item/hierophantgreenovatexture.png");
	}
}
