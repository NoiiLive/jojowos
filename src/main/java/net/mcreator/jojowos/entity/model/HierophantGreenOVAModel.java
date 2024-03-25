package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.HierophantGreenOVAEntity;

public class HierophantGreenOVAModel extends GeoModel<HierophantGreenOVAEntity> {
	@Override
	public ResourceLocation getAnimationResource(HierophantGreenOVAEntity entity) {
		return new ResourceLocation("jojowos", "animations/hierophantgreenova.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HierophantGreenOVAEntity entity) {
		return new ResourceLocation("jojowos", "geo/hierophantgreenova.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HierophantGreenOVAEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
