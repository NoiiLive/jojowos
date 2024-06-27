package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.SilverChariotKokushiboEntity;

public class SilverChariotKokushiboModel extends GeoModel<SilverChariotKokushiboEntity> {
	@Override
	public ResourceLocation getAnimationResource(SilverChariotKokushiboEntity entity) {
		return new ResourceLocation("jojowos", "animations/silverchariotkokushibo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SilverChariotKokushiboEntity entity) {
		return new ResourceLocation("jojowos", "geo/silverchariotkokushibo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SilverChariotKokushiboEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
