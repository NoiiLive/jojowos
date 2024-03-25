package net.mcreator.jojowos.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class EmeraldBarrierTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double mag = 0;
		double deltaz = 0;
		double distance = 0;
		double deltax = 0;
		double deltay = 0;
		double dampen = 0;
		double particleX = 0;
		double particleY = 0;
		double particleZ = 0;
		entity.makeStuckInBlock(Blocks.AIR.defaultBlockState(), new Vec3(0.25, 0.05, 0.25));
		if (entity.getPersistentData().getDouble("TickLag") == 0) {
			EmeraldBarrierLineProcedure.execute(world, x, y, z, entity);
			entity.getPersistentData().putDouble("TickLag", 2);
		}
		if (entity.getPersistentData().getDouble("TickLag") > 0) {
			entity.getPersistentData().putDouble("TickLag", (entity.getPersistentData().getDouble("TickLag") - 1));
		}
		if (entity.getPersistentData().getDouble("DespawnTimer") > 1) {
			entity.getPersistentData().putDouble("DespawnTimer", (entity.getPersistentData().getDouble("DespawnTimer") - 1));
		}
		if (entity.getPersistentData().getDouble("DespawnTimer") == 1) {
			if (!entity.level().isClientSide())
				entity.discard();
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:stand_unsummon")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:stand_unsummon")), SoundSource.PLAYERS, 1, 1, false);
				}
			}
		}
	}
}
