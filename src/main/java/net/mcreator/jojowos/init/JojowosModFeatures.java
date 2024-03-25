
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jojowos.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.jojowos.world.features.MeteorFeatureFeature;
import net.mcreator.jojowos.world.features.LargeMeteorFeatureFeature;
import net.mcreator.jojowos.JojowosMod;

@Mod.EventBusSubscriber
public class JojowosModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, JojowosMod.MODID);
	public static final RegistryObject<Feature<?>> METEOR_FEATURE = REGISTRY.register("meteor_feature", MeteorFeatureFeature::new);
	public static final RegistryObject<Feature<?>> LARGE_METEOR_FEATURE = REGISTRY.register("large_meteor_feature", LargeMeteorFeatureFeature::new);
}
