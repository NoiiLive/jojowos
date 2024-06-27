package net.mcreator.jojowos.init;

import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.mcreator.jojowos.configuration.SDCConfigFilesConfiguration;
import net.mcreator.jojowos.configuration.MoveDirectoryConfiguration;
import net.mcreator.jojowos.configuration.DIUConfigFilesConfiguration;
import net.mcreator.jojowos.configuration.ConfigFilesConfiguration;
import net.mcreator.jojowos.JojowosMod;

@Mod.EventBusSubscriber(modid = JojowosMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class JojowosModConfigs {
	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, SDCConfigFilesConfiguration.SPEC, "jojowos_stands_sdc.toml");
			ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ConfigFilesConfiguration.SPEC, "jojowos_main.toml");
			ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, DIUConfigFilesConfiguration.SPEC, "jojowos_stands_diu.toml");
			ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MoveDirectoryConfiguration.SPEC, "jojowos_moves.toml");
		});
	}
}
