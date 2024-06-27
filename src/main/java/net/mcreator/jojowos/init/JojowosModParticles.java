
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jojowos.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.jojowos.client.particle.YellowAuraParticle;
import net.mcreator.jojowos.client.particle.WhiteAuraParticle;
import net.mcreator.jojowos.client.particle.RedAuraParticle;
import net.mcreator.jojowos.client.particle.PurpleAuraParticle;
import net.mcreator.jojowos.client.particle.PinkAuraParticle;
import net.mcreator.jojowos.client.particle.OrangeAuraParticle;
import net.mcreator.jojowos.client.particle.MenacingParticle;
import net.mcreator.jojowos.client.particle.LightBlueAuraParticle;
import net.mcreator.jojowos.client.particle.ImpactParticle;
import net.mcreator.jojowos.client.particle.ImpactHitParticle;
import net.mcreator.jojowos.client.particle.HermitVineVenomParticle;
import net.mcreator.jojowos.client.particle.HermitVineRopeParticle;
import net.mcreator.jojowos.client.particle.HermitVineRedParticle;
import net.mcreator.jojowos.client.particle.HermitVineParticle;
import net.mcreator.jojowos.client.particle.HermitVinePart4Particle;
import net.mcreator.jojowos.client.particle.HermitVineMangaParticle;
import net.mcreator.jojowos.client.particle.HermitVineGoldParticle;
import net.mcreator.jojowos.client.particle.HermitVineEnergyParticle;
import net.mcreator.jojowos.client.particle.HermitVineBlueParticle;
import net.mcreator.jojowos.client.particle.HeavyGoldLineParticle;
import net.mcreator.jojowos.client.particle.GreenAuraParticle;
import net.mcreator.jojowos.client.particle.GoldTwinkleParticle;
import net.mcreator.jojowos.client.particle.FistClashParticle;
import net.mcreator.jojowos.client.particle.EmeraldBarrierTapeParticle;
import net.mcreator.jojowos.client.particle.EmeraldBarrierParticleParticle;
import net.mcreator.jojowos.client.particle.BlueAuraParticle;

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
		event.registerSpriteSet(JojowosModParticleTypes.IMPACT.get(), ImpactParticle::provider);
		event.registerSpriteSet(JojowosModParticleTypes.PURPLE_AURA.get(), PurpleAuraParticle::provider);
		event.registerSpriteSet(JojowosModParticleTypes.WHITE_AURA.get(), WhiteAuraParticle::provider);
		event.registerSpriteSet(JojowosModParticleTypes.RED_AURA.get(), RedAuraParticle::provider);
		event.registerSpriteSet(JojowosModParticleTypes.ORANGE_AURA.get(), OrangeAuraParticle::provider);
		event.registerSpriteSet(JojowosModParticleTypes.YELLOW_AURA.get(), YellowAuraParticle::provider);
		event.registerSpriteSet(JojowosModParticleTypes.GREEN_AURA.get(), GreenAuraParticle::provider);
		event.registerSpriteSet(JojowosModParticleTypes.LIGHT_BLUE_AURA.get(), LightBlueAuraParticle::provider);
		event.registerSpriteSet(JojowosModParticleTypes.BLUE_AURA.get(), BlueAuraParticle::provider);
		event.registerSpriteSet(JojowosModParticleTypes.PINK_AURA.get(), PinkAuraParticle::provider);
		event.registerSpriteSet(JojowosModParticleTypes.HERMIT_VINE_ENERGY.get(), HermitVineEnergyParticle::provider);
		event.registerSpriteSet(JojowosModParticleTypes.HERMIT_VINE_VENOM.get(), HermitVineVenomParticle::provider);
		event.registerSpriteSet(JojowosModParticleTypes.EMERALD_BARRIER_TAPE.get(), EmeraldBarrierTapeParticle::provider);
	}
}
