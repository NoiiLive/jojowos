package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.OldJosephJoestarEntity;

public class OldJosephJoestarModel extends GeoModel<OldJosephJoestarEntity> {
	@Override
	public ResourceLocation getAnimationResource(OldJosephJoestarEntity entity) {
		return new ResourceLocation("jojowos", "animations/josephjoestar.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OldJosephJoestarEntity entity) {
		return new ResourceLocation("jojowos", "geo/josephjoestar.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OldJosephJoestarEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(OldJosephJoestarEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
