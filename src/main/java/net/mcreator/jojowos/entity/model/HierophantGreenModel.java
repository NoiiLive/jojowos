package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.HierophantGreenEntity;

public class HierophantGreenModel extends GeoModel<HierophantGreenEntity> {
	@Override
	public ResourceLocation getAnimationResource(HierophantGreenEntity entity) {
		return new ResourceLocation("jojowos", "animations/hierophantgreenanime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HierophantGreenEntity entity) {
		return new ResourceLocation("jojowos", "geo/hierophantgreenanime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HierophantGreenEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
