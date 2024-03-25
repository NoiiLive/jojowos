
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jojowos.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.jojowos.client.particle.MenacingParticle;
import net.mcreator.jojowos.client.particle.ImpactHitParticle;
import net.mcreator.jojowos.client.particle.HermitVineRopeParticle;
import net.mcreator.jojowos.client.particle.HermitVineRedParticle;
import net.mcreator.jojowos.client.particle.HermitVineParticle;
import net.mcreator.jojowos.client.particle.HermitVinePart4Particle;
import net.mcreator.jojowos.client.particle.HermitVineMangaParticle;
import net.mcreator.jojowos.client.particle.HermitVineGoldParticle;
import net.mcreator.jojowos.client.particle.HermitVineBlueParticle;
import net.mcreator.jojowos.client.particle.HeavyGoldLineParticle;
import net.mcreator.jojowos.client.particle.GoldTwinkleParticle;
import net.mcreator.jojowos.client.particle.FistClashParticle;
import net.mcreator.jojowos.client.particle.EmeraldBarrierParticleParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class JojowosModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(JojowosModParticleTypes.HERMIT_VINE.get(), HermitVineParticle::provider);
		event.registerSpriteSet(JojowosModParticleTypes.HERMIT_VINE_PART_4.get(), HermitVinePart4Particle::provider);
		event.registerSpriteSet(JojowosModParticleTypes.HERMIT_VINE_MANGA.get(), HermitVineMangaParticle::provider);
		event.registerSpriteSet(JojowosModParticleTypes.HERMIT_VINE_RED.get(), HermitVineRedParticle::provider);
		event.registerSpriteSet(JojowosModParticleTypes.HERMIT_VINE_BLUE.get(), HermitVineBlueParticle::provider);
		event.registerSpriteSet(JojowosModParticleTypes.HERMIT_VINE_GOLD.get(), HermitVineGoldParticle::provider);
		event.registerSpriteSet(JojowosModParticleTypes.GOLD_TWINKLE.get(), GoldTwinkleParticle::provider);
		event.registerSpriteSet(JojowosModParticleTypes.IMPACT_HIT.get(), ImpactHitParticle::provider);
		event.registerSpriteSet(JojowosModParticleTypes.MENACING.get(), MenacingParticle::provider);
		event.registerSpriteSet(JojowosModParticleTypes.HEAVY_GOLD_LINE.get(), HeavyGoldLineParticle::provider);
		event.registerSpriteSet(JojowosModParticleTypes.FIST_CLASH.get(), FistClashParticle::provider);
		event.registerSpriteSet(JojowosModParticleTypes.EMERALD_BARRIER_PARTICLE.get(), EmeraldBarrierParticleParticle::provider);
		event.registerSpriteSet(JojowosModParticleTypes.HERMIT_VINE_ROPE.get(), HermitVineRopeParticle::provider);
	}
}
