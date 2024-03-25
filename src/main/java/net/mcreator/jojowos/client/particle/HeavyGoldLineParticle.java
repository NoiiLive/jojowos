
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
public class HeavyGoldLineParticle extends TextureSheetParticle {
	public static HeavyGoldLineParticleProvider provider(SpriteSet spriteSet) {
		return new HeavyGoldLineParticleProvider(spriteSet);
	}

	public static class HeavyGoldLineParticleProvider implements ParticleProvider<SimpleParticleType> {
		private final SpriteSet spriteSet;

		public HeavyGoldLineParticleProvider(SpriteSet spriteSet) {
			this.spriteSet = spriteSet;
		}

		public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
			HeavyGoldLineParticle particle = new HeavyGoldLineParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
			return particle;
		}
	}

	private final SpriteSet spriteSet;

	protected HeavyGoldLineParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
		super(world, x, y, z);
		this.spriteSet = spriteSet;
		this.setSize(0.2f, 0.2f);
		this.quadSize *= 2f;
		this.lifetime = (int) Math.max(1, 10 + (this.random.nextInt(6) - 3));
		this.gravity = 0f;
		this.hasPhysics = true;
		this.xd = vx * 0;
		this.yd = vy * 0;
		this.zd = vz * 0;
		this.setSpriteFromAge(spriteSet);
	}

	@Override
	public ParticleRenderType getRenderType() {
		return ParticleRenderType.PARTICLE_SHEET_OPAQUE;
	}

	@Override
	public void tick() {
		super.tick();
		if (!this.removed) {
			this.setSprite(this.spriteSet.get((this.age / 1) % 6 + 1, 6));
		}
	}
}
