package net.mcreator.jojowos.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.jojowos.init.JojowosModBlocks;
import net.mcreator.jojowos.configuration.ConfigFilesConfiguration;

public class BarrageFistBreakProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (ConfigFilesConfiguration.STANDBLOCKBREAKING.get() == true) {
			if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BEDROCK) == false) {
				if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.OBSIDIAN) == false) {
					if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.REINFORCED_DEEPSLATE) == false) {
						if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.END_PORTAL_FRAME) == false) {
							if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.END_PORTAL) == false) {
								if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.END_GATEWAY) == false) {
									if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.NETHER_PORTAL) == false) {
										if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == JojowosModBlocks.HARDENED_SAND.get()) == false) {
											if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BARRIER) == false) {
												if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STRUCTURE_BLOCK) == false) {
													if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STRUCTURE_VOID) == false) {
														if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.JIGSAW) == false) {
															world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId((world.getBlockState(BlockPos.containing(x, y, z)))));
															{
																BlockPos _pos = BlockPos.containing(x, y, z);
																Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
																world.destroyBlock(_pos, false);
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
