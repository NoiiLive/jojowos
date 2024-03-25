package net.mcreator.jojowos.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.jojowos.entity.JotaroKujoPart3Entity;

public class JotaroKujoPart3Model extends GeoModel<JotaroKujoPart3Entity> {
	@Override
	public ResourceLocation getAnimationResource(JotaroKujoPart3Entity entity) {
		return new ResourceLocation("jojowos", "animations/jotarokujo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JotaroKujoPart3Entity entity) {
		return new ResourceLocation("jojowos", "geo/jotarokujo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JotaroKujoPart3Entity entity) {
		return new ResourceLocation("jojowos", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(JotaroKujoPart3Entity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("johead");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
