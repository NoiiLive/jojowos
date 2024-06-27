package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.SilverChariotKokushiboArmorlessEntity;

public class SilverChariotKokushiboArmorlessModel extends GeoModel<SilverChariotKokushiboArmorlessEntity> {
	@Override
	public ResourceLocation getAnimationResource(SilverChariotKokushiboArmorlessEntity entity) {
		return new ResourceLocation("jojowos", "animations/silverchariotkokushiboarmorless.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SilverChariotKokushiboArmorlessEntity entity) {
		return new ResourceLocation("jojowos", "geo/silverchariotkokushiboarmorless.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SilverChariotKokushiboArmorlessEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
