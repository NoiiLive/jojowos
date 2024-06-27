package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.HierophantGreenSeroEntity;

public class HierophantGreenSeroModel extends GeoModel<HierophantGreenSeroEntity> {
	@Override
	public ResourceLocation getAnimationResource(HierophantGreenSeroEntity entity) {
		return new ResourceLocation("jojowos", "animations/hierophantsero.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HierophantGreenSeroEntity entity) {
		return new ResourceLocation("jojowos", "geo/hierophantsero.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HierophantGreenSeroEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
