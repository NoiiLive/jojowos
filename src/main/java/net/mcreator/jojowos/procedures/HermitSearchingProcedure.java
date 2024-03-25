package net.mcreator.jojowos.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.client.gui.components.EditBox;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.init.JojowosModItems;
import net.mcreator.jojowos.JojowosMod;

import java.util.HashMap;
import java.util.ArrayList;

public class HermitSearchingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		double Hx = 0;
		double Hy = 0;
		double Hz = 0;
		if (entity instanceof Player _player)
			_player.closeContainer();
		{
			String _setval = guistate.containsKey("text:PlayerName") ? ((EditBox) guistate.get("text:PlayerName")).getValue() : "";
			entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.HermitSearch = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		for (Entity entityiterator : new ArrayList<>(world.players())) {
			if (((entityiterator.getDisplayName().getString()).toLowerCase()).equals(((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).HermitSearch).toLowerCase())) {
				Hx = Math.round(entityiterator.getX());
				Hy = Math.round(entityiterator.getY());
				Hz = Math.round(entityiterator.getZ());
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(JojowosModItems.CAMERA.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				world.levelEvent(2001, BlockPos.containing(x, y + 1, z), Block.getId(Blocks.GRAY_CONCRETE.defaultBlockState()));
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.deepslate.break")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.deepslate.break")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Automail")) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:automail_camera")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:automail_camera")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:camera_activate")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:camera_activate")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				{
					String _setval = "give @p jojowos:polaroid{display:{Name:\"{\\\"text\\\":\\\"Polaroid of " + "" + (entityiterator.getDisplayName().getString() + "" + ("\\\"}\",Lore:[\"\\\"\\\\u00A78\\\\u00A7oLast Seen Near... " + ""
							+ (new java.text.DecimalFormat("##").format(Hx) + "" + (", " + (new java.text.DecimalFormat("##").format(Hy) + "" + (", " + (new java.text.DecimalFormat("##").format(Hz) + "" + "\\\"\"]}} 1")))))));
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.PolaroidGeneration = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				JojowosMod.queueServerWork(20, () -> {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PolaroidGeneration));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:camer_print")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:camer_print")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				});
				if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).HamonUser == true) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle minecraft:dust 1 0.996 0.745 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:hamon_shock")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:hamon_shock")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Player not found!"), true);
			}
		}
	}
}
