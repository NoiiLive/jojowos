package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.DIOAwakenedEntity;

public class DIOAwakenedModel extends GeoModel<DIOAwakenedEntity> {
	@Override
	public ResourceLocation getAnimationResource(DIOAwakenedEntity entity) {
		return new ResourceLocation("jojowos", "animations/dioshirtless.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DIOAwakenedEntity entity) {
		return new ResourceLocation("jojowos", "geo/dioshirtless.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DIOAwakenedEntity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(DIOAwakenedEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("diohead");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
