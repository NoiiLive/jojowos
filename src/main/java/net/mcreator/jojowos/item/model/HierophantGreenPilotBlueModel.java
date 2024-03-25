package net.mcreator.jojowos.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.item.HierophantGreenPilotBlueItem;

public class HierophantGreenPilotBlueModel extends GeoModel<HierophantGreenPilotBlueItem> {
	@Override
	public ResourceLocation getAnimationResource(HierophantGreenPilotBlueItem object) {
		return new ResourceLocation("jojowos", "animations/hierophantplayermanga.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HierophantGreenPilotBlueItem object) {
		return new ResourceLocation("jojowos", "geo/hierophantplayermanga.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HierophantGreenPilotBlueItem object) {
		return new ResourceLocation("jojowos", "textures/item/hierophantbluetexture.png");
	}
}
