package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.MagiciansRedRinOkumuraEntity;

public class MagiciansRedRinOkumuraModel extends GeoModel<MagiciansRedRinOkumuraEntity> {
	@Override
	public ResourceLocation getAnimationResource(MagiciansRedRinOkumuraEntity entity) {
		return new ResourceLocation("jojowos", "animations/magiciansredokumura.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MagiciansRedRinOkumuraEntity entity) {
		return new ResourceLocation("jojowos", "geo/magiciansredokumura.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MagiciansRedRinOkumuraEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

}
