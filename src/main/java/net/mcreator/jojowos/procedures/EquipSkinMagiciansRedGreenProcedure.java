package net.mcreator.jojowos.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.configuration.ConfigFilesConfiguration;

public class EquipSkinMagiciansRedGreenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SkillPoints >= (double) ConfigFilesConfiguration.SKINCOST.get()) {
			{
				double _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SkillPoints - (double) ConfigFilesConfiguration.SKINCOST.get();
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SkillPoints = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "Green";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.StandSkin = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Stand Skin Set To Green!"), true);
			if (world instanceof Level _level) {
				if (_level.isClientSide()) {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.PLAYERS, (float) 0.8, 1, true);
				}
			}
			StandDespawningProcedure.execute(world, x, y, z, entity);
		} else {
			if (world instanceof Level _level) {
				if (_level.isClientSide()) {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("enchant.thorns.hit")), SoundSource.PLAYERS, (float) 0.8, 1, true);
				}
			}
		}
	}
}
