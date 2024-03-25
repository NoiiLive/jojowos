package net.mcreator.jojowos.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.init.JojowosModParticleTypes;
import net.mcreator.jojowos.init.JojowosModMobEffects;

public class HermitGrappleProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double deltax = 0;
		double deltay = 0;
		double deltaz = 0;
		double mag = 0;
		double distance = 0;
		double dampen = 0;
		if (entity.getPersistentData().getDouble("PassiveCooldown") == 0) {
			if (entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(30)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getType() == HitResult.Type.BLOCK) {
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
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
				if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Automail")) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:automail_grapple")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:automail_grapple")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:hermitpurple_grapple")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:hermitpurple_grapple")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
				}
				entity.getPersistentData().putDouble("PassiveCooldown", 40);
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 40);
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(JojowosModMobEffects.STAND_JUMP_EFFECT.get(), 60, 0, false, false));
				deltax = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(30)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getX() - x;
				deltay = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(30)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getY() - y;
				deltaz = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(30)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ() - z;
				mag = Math.sqrt(deltax * deltax + deltay * deltay + deltaz * deltaz);
				dampen = Math.sqrt(mag) * 2;
				entity.setDeltaMovement(new Vec3((deltax / dampen), (deltay / dampen), (deltaz / dampen)));
				for (int index0 = 0; index0 < (int) mag; index0++) {
					if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Base")) {
						world.addParticle((SimpleParticleType) (JojowosModParticleTypes.HERMIT_VINE.get()), (x + entity.getLookAngle().x * distance), (y + 1.2 + entity.getLookAngle().y * distance), (z + entity.getLookAngle().z * distance), 0, 0, 0);
						distance = distance + 1;
					}
					if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Part4")) {
						world.addParticle((SimpleParticleType) (JojowosModParticleTypes.HERMIT_VINE_PART_4.get()), (x + entity.getLookAngle().x * distance), (y + 1.2 + entity.getLookAngle().y * distance), (z + entity.getLookAngle().z * distance), 0,
								0, 0);
						distance = distance + 1;
					}
					if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Manga")) {
						world.addParticle((SimpleParticleType) (JojowosModParticleTypes.HERMIT_VINE_MANGA.get()), (x + entity.getLookAngle().x * distance), (y + 1.2 + entity.getLookAngle().y * distance), (z + entity.getLookAngle().z * distance), 0,
								0, 0);
						distance = distance + 1;
					}
					if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Red")) {
						world.addParticle((SimpleParticleType) (JojowosModParticleTypes.HERMIT_VINE_RED.get()), (x + entity.getLookAngle().x * distance), (y + 1.2 + entity.getLookAngle().y * distance), (z + entity.getLookAngle().z * distance), 0, 0,
								0);
						distance = distance + 1;
					}
					if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Blue")) {
						world.addParticle((SimpleParticleType) (JojowosModParticleTypes.HERMIT_VINE_BLUE.get()), (x + entity.getLookAngle().x * distance), (y + 1.2 + entity.getLookAngle().y * distance), (z + entity.getLookAngle().z * distance), 0, 0,
								0);
						distance = distance + 1;
					}
					if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Gold")) {
						world.addParticle((SimpleParticleType) (JojowosModParticleTypes.HERMIT_VINE_GOLD.get()), (x + entity.getLookAngle().x * distance), (y + 1.2 + entity.getLookAngle().y * distance), (z + entity.getLookAngle().z * distance), 0, 0,
								0);
						distance = distance + 1;
					}
					if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Automail")) {
						world.addParticle((SimpleParticleType) (JojowosModParticleTypes.HERMIT_VINE_ROPE.get()), (x + entity.getLookAngle().x * distance), (y + 1.2 + entity.getLookAngle().y * distance), (z + entity.getLookAngle().z * distance), 0, 0,
								0);
						distance = distance + 1;
					}
				}
			}
		}
	}
}
