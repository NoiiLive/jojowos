package net.mcreator.jojowos.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandFunction;
import net.minecraft.client.player.AbstractClientPlayer;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.init.JojowosModEntities;
import net.mcreator.jojowos.entity.StarPlatinumUltraInstinctEntity;
import net.mcreator.jojowos.entity.StarPlatinumP6Entity;
import net.mcreator.jojowos.entity.StarPlatinumP4Entity;
import net.mcreator.jojowos.entity.StarPlatinumP3Entity;
import net.mcreator.jojowos.entity.StarPlatinumOVAEntity;
import net.mcreator.jojowos.entity.StarPlatinumMangaEntity;
import net.mcreator.jojowos.entity.StarPlatinumGreenEntity;
import net.mcreator.jojowos.entity.StarPlatinumBlueEntity;
import net.mcreator.jojowos.JojowosMod;

import java.util.Optional;
import java.util.List;
import java.util.Comparator;

import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationRegistry;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationAccess;
import dev.kosmx.playerAnim.api.layered.ModifierLayer;
import dev.kosmx.playerAnim.api.layered.KeyframeAnimationPlayer;
import dev.kosmx.playerAnim.api.layered.IAnimation;

public class StarPlatinumSummonProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Goku")) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:starplatinum_summon")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:starplatinum_summon")), SoundSource.PLAYERS, 1, 1, false);
				}
			}
			JojowosMod.queueServerWork(10, () -> {
				if (world instanceof ServerLevel _level && _level.getServer() != null) {
					Optional<CommandFunction> _fopt = _level.getServer().getFunctions().get(new ResourceLocation("jojowos:purple_star"));
					if (_fopt.isPresent())
						_level.getServer().getFunctions().execute(_fopt.get(), new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null));
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle jojowos:gold_twinkle ^0 ^1 ^ 2 2 2 0.1 40 force @a");
			});
			if (world.isClientSide()) {
				if (entity instanceof AbstractClientPlayer player) {
					var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("jojowos", "player_animation"));
					if (animation != null && !animation.isActive()) {
						animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("jojowos", "starsummon"))));
					}
				}
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Star Platinum!"), true);
		} else {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:goku_teleports")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:goku_teleports")), SoundSource.PLAYERS, 1, 1, false);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:goku_summon")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:goku_summon")), SoundSource.PLAYERS, 1, 1, false);
				}
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Goku!"), true);
		}
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 15, 9, false, false));
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Base")) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSummoned == true) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:dust 0.67059 0.64314 0.80784 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:dust 0.96863 0.98824 0.57647 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = JojowosModEntities.STAR_PLATINUM_P_3.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof StarPlatinumP3Entity) {
							if ((entityiterator instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) == false) {
								if (entityiterator instanceof TamableAnimal _toTame && entity instanceof Player _owner)
									_toTame.tame(_owner);
								entityiterator.getPersistentData().putString("UserName", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PlayerName));
							}
						}
					}
				}
			}
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Part4")) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSummoned == true) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:dust 0.78039 0.61569 0.94118 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:dust 0.52157 0.92941 1.00000 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = JojowosModEntities.STAR_PLATINUM_P_4.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof StarPlatinumP4Entity) {
							if ((entityiterator instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) == false) {
								if (entityiterator instanceof TamableAnimal _toTame && entity instanceof Player _owner)
									_toTame.tame(_owner);
								entityiterator.getPersistentData().putString("UserName", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PlayerName));
							}
						}
					}
				}
			}
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Part6")) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSummoned == true) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:dust 0.71373 0.54118 0.88235 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:dust 0.86275 0.92157 0.99216 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = JojowosModEntities.STAR_PLATINUM_P_6.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof StarPlatinumP6Entity) {
							if ((entityiterator instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) == false) {
								if (entityiterator instanceof TamableAnimal _toTame && entity instanceof Player _owner)
									_toTame.tame(_owner);
								entityiterator.getPersistentData().putString("UserName", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PlayerName));
							}
						}
					}
				}
			}
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("OVA")) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSummoned == true) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:dust 0.72549 0.77255 0.88235 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:dust 0.27059 0.49412 0.64706 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = JojowosModEntities.STAR_PLATINUM_OVA.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof StarPlatinumOVAEntity) {
							if ((entityiterator instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) == false) {
								if (entityiterator instanceof TamableAnimal _toTame && entity instanceof Player _owner)
									_toTame.tame(_owner);
								entityiterator.getPersistentData().putString("UserName", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PlayerName));
							}
						}
					}
				}
			}
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Manga")) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSummoned == true) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:dust 0.83137 0.48235 0.81569 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:dust 0.99608 0.89804 0.12941 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = JojowosModEntities.STAR_PLATINUM_MANGA.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof StarPlatinumMangaEntity) {
							if ((entityiterator instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) == false) {
								if (entityiterator instanceof TamableAnimal _toTame && entity instanceof Player _owner)
									_toTame.tame(_owner);
								entityiterator.getPersistentData().putString("UserName", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PlayerName));
							}
						}
					}
				}
			}
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Blue")) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSummoned == true) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:dust 0.27451 0.58431 0.69412 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:dust 0.96863 0.98824 0.57647 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = JojowosModEntities.STAR_PLATINUM_BLUE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof StarPlatinumBlueEntity) {
							if ((entityiterator instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) == false) {
								if (entityiterator instanceof TamableAnimal _toTame && entity instanceof Player _owner)
									_toTame.tame(_owner);
								entityiterator.getPersistentData().putString("UserName", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PlayerName));
							}
						}
					}
				}
			}
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Green")) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSummoned == true) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:dust 0.39608 0.70196 0.49412 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:dust 0.96863 0.98824 0.57647 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = JojowosModEntities.STAR_PLATINUM_GREEN.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof StarPlatinumGreenEntity) {
							if ((entityiterator instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) == false) {
								if (entityiterator instanceof TamableAnimal _toTame && entity instanceof Player _owner)
									_toTame.tame(_owner);
								entityiterator.getPersistentData().putString("UserName", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PlayerName));
							}
						}
					}
				}
			}
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Goku")) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSummoned == true) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:dust 0.173 0.451 0.8 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:dust 0.843 0.859 0.894 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = JojowosModEntities.STAR_PLATINUM_ULTRA_INSTINCT.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof StarPlatinumUltraInstinctEntity) {
							if ((entityiterator instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) == false) {
								if (entityiterator instanceof TamableAnimal _toTame && entity instanceof Player _owner)
									_toTame.tame(_owner);
								entityiterator.getPersistentData().putString("UserName", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PlayerName));
							}
						}
					}
				}
			}
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SelectedSkill).equals("[ ]")) {
			{
				String _setval = "Ora Barrage";
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SelectedSkill = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 1;
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SkillNumber = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
