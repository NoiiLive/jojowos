
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jojowos.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.jojowos.client.model.Modelknife;
import net.mcreator.jojowos.client.model.Modelemptyarmor;
import net.mcreator.jojowos.client.model.ModelTheFoolDisplay;
import net.mcreator.jojowos.client.model.ModelStandArrowEntity;
import net.mcreator.jojowos.client.model.ModelSmallCrossfire;
import net.mcreator.jojowos.client.model.ModelSilverChariotOVADisplay;
import net.mcreator.jojowos.client.model.ModelSilverChariotAnimeDisplay;
import net.mcreator.jojowos.client.model.ModelRoadRoller;
import net.mcreator.jojowos.client.model.ModelRedCape;
import net.mcreator.jojowos.client.model.ModelPolnareffTop;
import net.mcreator.jojowos.client.model.ModelPolnareffPants;
import net.mcreator.jojowos.client.model.ModelPolnareffEarrings;
import net.mcreator.jojowos.client.model.ModelPolnareffBoots;
import net.mcreator.jojowos.client.model.ModelLifeDetector;
import net.mcreator.jojowos.client.model.ModelLargeCrossfire;
import net.mcreator.jojowos.client.model.ModelKakyoinShoes;
import net.mcreator.jojowos.client.model.ModelKakyoinPants;
import net.mcreator.jojowos.client.model.ModelKakyoinEarrings;
import net.mcreator.jojowos.client.model.ModelKakyoinCoat;
import net.mcreator.jojowos.client.model.ModelJotaroKujoP3Shoes;
import net.mcreator.jojowos.client.model.ModelJotaroKujoP3Pants;
import net.mcreator.jojowos.client.model.ModelJotaroKujoP3Hat;
import net.mcreator.jojowos.client.model.ModelJotaroKujoP3Coat;
import net.mcreator.jojowos.client.model.ModelJotaroHatHairless;
import net.mcreator.jojowos.client.model.ModelJosephJoestarShoes;
import net.mcreator.jojowos.client.model.ModelJosephJoestarShirt;
import net.mcreator.jojowos.client.model.ModelJosephJoestarPants;
import net.mcreator.jojowos.client.model.ModelJosephJoestarHat;
import net.mcreator.jojowos.client.model.ModelIggySit;
import net.mcreator.jojowos.client.model.ModelHierophantTentacle3;
import net.mcreator.jojowos.client.model.ModelHermitPurpleDisplay;
import net.mcreator.jojowos.client.model.ModelEmeraldSplash;
import net.mcreator.jojowos.client.model.ModelDioTop;
import net.mcreator.jojowos.client.model.ModelDioShoes;
import net.mcreator.jojowos.client.model.ModelDioPants;
import net.mcreator.jojowos.client.model.ModelDioJacket;
import net.mcreator.jojowos.client.model.ModelDioHeadband;
import net.mcreator.jojowos.client.model.ModelDioCape;
import net.mcreator.jojowos.client.model.ModelChariotSword;
import net.mcreator.jojowos.client.model.ModelBearing;
import net.mcreator.jojowos.client.model.ModelAvdolPants;
import net.mcreator.jojowos.client.model.ModelAvdolHeadwrap;
import net.mcreator.jojowos.client.model.ModelAvdolCoat;
import net.mcreator.jojowos.client.model.ModelAvdolBoots;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class JojowosModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelSilverChariotAnimeDisplay.LAYER_LOCATION, ModelSilverChariotAnimeDisplay::createBodyLayer);
		event.registerLayerDefinition(ModelEmeraldSplash.LAYER_LOCATION, ModelEmeraldSplash::createBodyLayer);
		event.registerLayerDefinition(ModelDioPants.LAYER_LOCATION, ModelDioPants::createBodyLayer);
		event.registerLayerDefinition(ModelKakyoinCoat.LAYER_LOCATION, ModelKakyoinCoat::createBodyLayer);
		event.registerLayerDefinition(ModelKakyoinPants.LAYER_LOCATION, ModelKakyoinPants::createBodyLayer);
		event.registerLayerDefinition(ModelLifeDetector.LAYER_LOCATION, ModelLifeDetector::createBodyLayer);
		event.registerLayerDefinition(ModelDioTop.LAYER_LOCATION, ModelDioTop::createBodyLayer);
		event.registerLayerDefinition(ModelAvdolPants.LAYER_LOCATION, ModelAvdolPants::createBodyLayer);
		event.registerLayerDefinition(ModelHermitPurpleDisplay.LAYER_LOCATION, ModelHermitPurpleDisplay::createBodyLayer);
		event.registerLayerDefinition(ModelDioCape.LAYER_LOCATION, ModelDioCape::createBodyLayer);
		event.registerLayerDefinition(ModelTheFoolDisplay.LAYER_LOCATION, ModelTheFoolDisplay::createBodyLayer);
		event.registerLayerDefinition(Modelemptyarmor.LAYER_LOCATION, Modelemptyarmor::createBodyLayer);
		event.registerLayerDefinition(ModelAvdolHeadwrap.LAYER_LOCATION, ModelAvdolHeadwrap::createBodyLayer);
		event.registerLayerDefinition(ModelJosephJoestarShoes.LAYER_LOCATION, ModelJosephJoestarShoes::createBodyLayer);
		event.registerLayerDefinition(ModelKakyoinShoes.LAYER_LOCATION, ModelKakyoinShoes::createBodyLayer);
		event.registerLayerDefinition(ModelJotaroHatHairless.LAYER_LOCATION, ModelJotaroHatHairless::createBodyLayer);
		event.registerLayerDefinition(ModelDioHeadband.LAYER_LOCATION, ModelDioHeadband::createBodyLayer);
		event.registerLayerDefinition(ModelHierophantTentacle3.LAYER_LOCATION, ModelHierophantTentacle3::createBodyLayer);
		event.registerLayerDefinition(ModelKakyoinEarrings.LAYER_LOCATION, ModelKakyoinEarrings::createBodyLayer);
		event.registerLayerDefinition(ModelJotaroKujoP3Pants.LAYER_LOCATION, ModelJotaroKujoP3Pants::createBodyLayer);
		event.registerLayerDefinition(ModelSmallCrossfire.LAYER_LOCATION, ModelSmallCrossfire::createBodyLayer);
		event.registerLayerDefinition(ModelStandArrowEntity.LAYER_LOCATION, ModelStandArrowEntity::createBodyLayer);
		event.registerLayerDefinition(ModelRoadRoller.LAYER_LOCATION, ModelRoadRoller::createBodyLayer);
		event.registerLayerDefinition(ModelDioShoes.LAYER_LOCATION, ModelDioShoes::createBodyLayer);
		event.registerLayerDefinition(ModelPolnareffTop.LAYER_LOCATION, ModelPolnareffTop::createBodyLayer);
		event.registerLayerDefinition(ModelJotaroKujoP3Hat.LAYER_LOCATION, ModelJotaroKujoP3Hat::createBodyLayer);
		event.registerLayerDefinition(ModelJosephJoestarShirt.LAYER_LOCATION, ModelJosephJoestarShirt::createBodyLayer);
		event.registerLayerDefinition(ModelPolnareffBoots.LAYER_LOCATION, ModelPolnareffBoots::createBodyLayer);
		event.registerLayerDefinition(ModelBearing.LAYER_LOCATION, ModelBearing::createBodyLayer);
		event.registerLayerDefinition(ModelIggySit.LAYER_LOCATION, ModelIggySit::createBodyLayer);
		event.registerLayerDefinition(ModelJotaroKujoP3Shoes.LAYER_LOCATION, ModelJotaroKujoP3Shoes::createBodyLayer);
		event.registerLayerDefinition(ModelDioJacket.LAYER_LOCATION, ModelDioJacket::createBodyLayer);
		event.registerLayerDefinition(ModelAvdolCoat.LAYER_LOCATION, ModelAvdolCoat::createBodyLayer);
		event.registerLayerDefinition(ModelPolnareffPants.LAYER_LOCATION, ModelPolnareffPants::createBodyLayer);
		event.registerLayerDefinition(ModelRedCape.LAYER_LOCATION, ModelRedCape::createBodyLayer);
		event.registerLayerDefinition(ModelJotaroKujoP3Coat.LAYER_LOCATION, ModelJotaroKujoP3Coat::createBodyLayer);
		event.registerLayerDefinition(ModelJosephJoestarHat.LAYER_LOCATION, ModelJosephJoestarHat::createBodyLayer);
		event.registerLayerDefinition(ModelSilverChariotOVADisplay.LAYER_LOCATION, ModelSilverChariotOVADisplay::createBodyLayer);
		event.registerLayerDefinition(ModelLargeCrossfire.LAYER_LOCATION, ModelLargeCrossfire::createBodyLayer);
		event.registerLayerDefinition(ModelJosephJoestarPants.LAYER_LOCATION, ModelJosephJoestarPants::createBodyLayer);
		event.registerLayerDefinition(Modelknife.LAYER_LOCATION, Modelknife::createBodyLayer);
		event.registerLayerDefinition(ModelPolnareffEarrings.LAYER_LOCATION, ModelPolnareffEarrings::createBodyLayer);
		event.registerLayerDefinition(ModelAvdolBoots.LAYER_LOCATION, ModelAvdolBoots::createBodyLayer);
		event.registerLayerDefinition(ModelChariotSword.LAYER_LOCATION, ModelChariotSword::createBodyLayer);
	}
}
