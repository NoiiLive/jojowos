package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.CrazyDiamondEntity;

public class CrazyDiamondModel extends GeoModel<CrazyDiamondEntity> {
	@Override
	public ResourceLocation getAnimationResource(CrazyDiamondEntity entity) {
		return new ResourceLocation("jojowos", "animations/crazydiamond.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CrazyDiamondEntity entity) {
		return new ResourceLocation("jojowos", "geo/crazydiamond.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CrazyDiamondEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
