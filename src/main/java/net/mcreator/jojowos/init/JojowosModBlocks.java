
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jojowos.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.jojowos.block.MeteoriteOreBlock;
import net.mcreator.jojowos.block.HardenedSandBlock;
import net.mcreator.jojowos.JojowosMod;

public class JojowosModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, JojowosMod.MODID);
	public static final RegistryObject<Block> METEORITE_ORE = REGISTRY.register("meteorite_ore", () -> new MeteoriteOreBlock());
	public static final RegistryObject<Block> HARDENED_SAND = REGISTRY.register("hardened_sand", () -> new HardenedSandBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
