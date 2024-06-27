package net.mcreator.jojowos.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.item.HierophantSeroPlayerItem;

public class HierophantSeroPlayerModel extends GeoModel<HierophantSeroPlayerItem> {
	@Override
	public ResourceLocation getAnimationResource(HierophantSeroPlayerItem object) {
		return new ResourceLocation("jojowos", "animations/hierophantseroplayer.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HierophantSeroPlayerItem object) {
		return new ResourceLocation("jojowos", "geo/hierophantseroplayer.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HierophantSeroPlayerItem object) {
		return new ResourceLocation("jojowos", "textures/item/hierophantserotexture.png");
	}
}
