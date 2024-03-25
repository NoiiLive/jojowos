
package net.mcreator.jojowos.world.features;

import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;

import net.mcreator.jojowos.world.features.configurations.StructureFeatureConfiguration;
import net.mcreator.jojowos.procedures.MeteoriteSpawnReturnProcedure;

public class LargeMeteorFeatureFeature extends StructureFeature {
	public LargeMeteorFeatureFeature() {
		super(StructureFeatureConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<StructureFeatureConfiguration> context) {
		WorldGenLevel world = context.level();
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!MeteoriteSpawnReturnProcedure.execute())
			return false;
		return super.place(context);
	}
}
