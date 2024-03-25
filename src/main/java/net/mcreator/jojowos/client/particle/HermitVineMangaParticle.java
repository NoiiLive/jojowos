
package net.mcreator.jojowos.client.particle;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.client.particle.TextureSheetParticle;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.client.particle.ParticleRenderType;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.multiplayer.ClientLevel;

@OnlyIn(Dist.CLIENT)
public class HermitVineMangaParticle extends TextureSheetParticle {
	public static HermitVineMangaParticleProvider provider(SpriteSet spriteSet) {
		return new HermitVineMangaParticleProvider(spriteSet);
	}

	public static class HermitVineMangaParticleProvider implements ParticleProvider<SimpleParticleType> {
		private final SpriteSet spriteSet;

		public HermitVineMangaParticleProvider(SpriteSet spriteSet) {
			this.spriteSet = spriteSet;
		}

		public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
			HermitVineMangaParticle particle = new HermitVineMangaParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
			return particle;
		}
	}

	private final SpriteSet spriteSet;
	private float angularVelocity;
	private float angularAcceleration;

	protected HermitVineMangaParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
		super(world, x, y, z);
		this.spriteSet = spriteSet;
		this.setSize(0.2f, 0.2f);
		this.lifetime = 5;
		this.gravity = 0f;
		this.hasPhysics = false;
		this.xd = vx * 0.15;
		this.yd = vy * 0.15;
		this.zd = vz * 0.15;
		this.angularVelocity = 0.1f;
		this.angularAcceleration = 0f;
		this.setSpriteFromAge(spriteSet);
	}

	@Override
	public ParticleRenderType getRenderType() {
		return ParticleRenderType.PARTICLE_SHEET_OPAQUE;
	}

	@Override
	public void tick() {
		super.tick();
		this.oRoll = this.roll;
		this.roll += this.angularVelocity;
		this.angularVelocity += this.angularAcceleration;
		if (!this.removed) {
			this.setSprite(this.spriteSet.get((this.age / 2) % 8 + 1, 8));
		}
	}
}
