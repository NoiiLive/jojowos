package net.mcreator.jojowos.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.init.JojowosModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class StandJumpProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		BlockState test = Blocks.AIR.defaultBlockState();
		String block = "";
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SpecialType).equals("Power")) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).ToggleShiftMove == true) {
				if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSummoned == true) {
					if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandBlocking == false
							&& (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandGuarding == false) {
						if (entity.isShiftKeyDown()) {
							if (!((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.CAVE_AIR)) {
								if (entity.getPersistentData().getDouble("leapPower") < 60) {
									entity.getPersistentData().putDouble("leapPower", (entity.getPersistentData().getDouble("leapPower") + 1));
								} else if (entity.getPersistentData().getDouble("leapPower") >= 60) {
									entity.getPersistentData().putDouble("leapPower", (entity.getPersistentData().getDouble("leapPower") + 1));
									block = world.getBlockState(BlockPos.containing(x, y - 1, z)) + "";
									block = block.replace("Block{", "");
									block = block.replace("}", "");
									{
										Entity _ent = entity;
										if (!_ent.level().isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
													("particle minecraft:block " + (block + " ~ ~ ~ 0.3 0 0.3 0.1 5 force")));
										}
									}
								}
							}
						} else {
							if (entity.getPersistentData().getDouble("leapPower") >= 60) {
								entity.getPersistentData().putDouble("leapPower", 0);
								entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * 2), (entity.getLookAngle().y * 2), (entity.getLookAngle().z * 2)));
								if (entity instanceof Player _player)
									_player.getFoodData().setFoodLevel((int) ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) - 1));
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(JojowosModMobEffects.STAND_JUMP_EFFECT.get(), 60, 0, false, false));
								if (!((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Goku")) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:stand_jump")), SoundSource.PLAYERS, 1, 1);
										} else {
											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:stand_jump")), SoundSource.PLAYERS, 1, 1, false);
										}
									}
								} else {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:goku_jump")), SoundSource.PLAYERS, 1, 1);
										} else {
											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:goku_jump")), SoundSource.PLAYERS, 1, 1, false);
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
