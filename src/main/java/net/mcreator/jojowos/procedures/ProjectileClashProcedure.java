package net.mcreator.jojowos.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.ThrownEnderpearl;
import net.minecraft.world.entity.projectile.ThrownEgg;
import net.minecraft.world.entity.projectile.SpectralArrow;
import net.minecraft.world.entity.projectile.Snowball;
import net.minecraft.world.entity.projectile.SmallFireball;
import net.minecraft.world.entity.projectile.ShulkerBullet;
import net.minecraft.world.entity.projectile.LlamaSpit;
import net.minecraft.world.entity.projectile.LargeFireball;
import net.minecraft.world.entity.projectile.DragonFireball;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.jojowos.init.JojowosModParticleTypes;
import net.mcreator.jojowos.entity.ThrowingKnifeProjectileEntity;
import net.mcreator.jojowos.entity.SmallCrossfireProjectileEntity;
import net.mcreator.jojowos.entity.RoadRollerProjectileEntity;
import net.mcreator.jojowos.entity.LargeCrossfireProjectileEntity;
import net.mcreator.jojowos.entity.InvisFistProjectileEntity;
import net.mcreator.jojowos.entity.EmeraldSplashItemProjectileEntity;
import net.mcreator.jojowos.entity.ChariotSwordProjectileEntity;
import net.mcreator.jojowos.entity.ChariotSwordGoldProjectileEntity;
import net.mcreator.jojowos.entity.BallBearingProjectileEntity;
import net.mcreator.jojowos.entity.AncientBowProjectileEntity;

import java.util.List;
import java.util.Comparator;

public class ProjectileClashProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1.5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof Arrow || entityiterator instanceof SpectralArrow || entityiterator instanceof Snowball || entityiterator instanceof ThrownEgg || entityiterator instanceof ThrownEnderpearl
						|| entityiterator instanceof LlamaSpit || entityiterator instanceof ShulkerBullet || entityiterator instanceof DragonFireball || entityiterator instanceof SmallFireball || entityiterator instanceof LargeFireball
						|| entityiterator instanceof AncientBowProjectileEntity || entityiterator instanceof BallBearingProjectileEntity || entityiterator instanceof ChariotSwordGoldProjectileEntity
						|| entityiterator instanceof ChariotSwordProjectileEntity || entityiterator instanceof EmeraldSplashItemProjectileEntity || entityiterator instanceof InvisFistProjectileEntity
						|| entityiterator instanceof LargeCrossfireProjectileEntity || entityiterator instanceof RoadRollerProjectileEntity || entityiterator instanceof ThrowingKnifeProjectileEntity
						|| entityiterator instanceof SmallCrossfireProjectileEntity) {
					if ((entityiterator == immediatesourceentity) == false) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (JojowosModParticleTypes.FIST_CLASH.get()), x, y, z, 1, 0.01, 0.01, 0.01, 0.01);
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"particle minecraft:dust 0.5 0.5 0.5 1 ^ ^ ^ 0.5 0.5 0.5 0.15 5 force @a");
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.shield.block")), SoundSource.PLAYERS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.shield.block")), SoundSource.PLAYERS, 1, 1, false);
							}
						}
						if (!entityiterator.level().isClientSide())
							entityiterator.discard();
					}
				}
				if (entityiterator instanceof Arrow || entityiterator instanceof SpectralArrow || entityiterator instanceof AncientBowProjectileEntity) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie.break_wooden_door")), SoundSource.PLAYERS, (float) 0.8, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie.break_wooden_door")), SoundSource.PLAYERS, (float) 0.8, 1, false);
						}
					}
				}
			}
		}
	}
}
