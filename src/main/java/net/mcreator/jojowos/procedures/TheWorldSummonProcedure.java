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
import net.mcreator.jojowos.entity.TheWorldSilverEntity;
import net.mcreator.jojowos.entity.TheWorldOVAEntity;
import net.mcreator.jojowos.entity.TheWorldMangaEntity;
import net.mcreator.jojowos.entity.TheWorldImposterEntity;
import net.mcreator.jojowos.entity.TheWorldEntity;
import net.mcreator.jojowos.entity.TheWorldBlackEntity;
import net.mcreator.jojowos.JojowosMod;

import java.util.Optional;
import java.util.List;
import java.util.Comparator;

import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationRegistry;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationAccess;
import dev.kosmx.playerAnim.api.layered.ModifierLayer;
import dev.kosmx.playerAnim.api.layered.KeyframeAnimationPlayer;
import dev.kosmx.playerAnim.api.layered.IAnimation;

public class TheWorldSummonProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Imposter")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Imposter!"), true);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:imposter_summon")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:imposter_summon")), SoundSource.PLAYERS, 1, 1, false);
				}
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("The World!"), true);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:theworld_summon")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:theworld_summon")), SoundSource.PLAYERS, 1, 1, false);
				}
			}
			if (world.isClientSide()) {
				if (entity instanceof AbstractClientPlayer player) {
					var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("jojowos", "player_animation"));
					if (animation != null && !animation.isActive()) {
						animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("jojowos", "worldsummon"))));
					}
				}
			}
			JojowosMod.queueServerWork(12, () -> {
				if (world instanceof ServerLevel _level && _level.getServer() != null) {
					Optional<CommandFunction> _fopt = _level.getServer().getFunctions().get(new ResourceLocation("jojowos:world_clock"));
					if (_fopt.isPresent())
						_level.getServer().getFunctions().execute(_fopt.get(), new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null));
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle jojowos:menacing ^0 ^1 ^ 3 0.25 3 0.05 50 force @a");
			});
			JojowosMod.queueServerWork(5, () -> {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle jojowos:menacing ^0 ^1 ^ 1 3 1 0.5 20 force @a");
			});
		}
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 9, false, false));
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Base")) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSummoned == true) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = JojowosModEntities.THE_WORLD.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof TheWorldEntity) {
							if ((entityiterator instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) == false) {
								if (entityiterator instanceof TamableAnimal _toTame && entity instanceof Player _owner)
									_toTame.tame(_owner);
								entityiterator.getPersistentData().putString("UserName", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PlayerName));
							}
						}
					}
				}
				JojowosMod.queueServerWork(14, () -> {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle minecraft:dust 0.89 0.859 0.275 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle minecraft:dust 0.408 0.835 0.282 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
				});
			}
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Black")) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSummoned == true) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = JojowosModEntities.THE_WORLD_BLACK.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof TheWorldBlackEntity) {
							if ((entityiterator instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) == false) {
								if (entityiterator instanceof TamableAnimal _toTame && entity instanceof Player _owner)
									_toTame.tame(_owner);
								entityiterator.getPersistentData().putString("UserName", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PlayerName));
							}
						}
					}
				}
				JojowosMod.queueServerWork(14, () -> {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle minecraft:dust 0.263 0.278 0.29 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle minecraft:dust 0.863 0.757 0.525 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
				});
			}
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Manga")) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSummoned == true) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = JojowosModEntities.THE_WORLD_MANGA.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof TheWorldMangaEntity) {
							if ((entityiterator instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) == false) {
								if (entityiterator instanceof TamableAnimal _toTame && entity instanceof Player _owner)
									_toTame.tame(_owner);
								entityiterator.getPersistentData().putString("UserName", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PlayerName));
							}
						}
					}
				}
				JojowosMod.queueServerWork(14, () -> {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle minecraft:dust 0.996 0.925 0.145 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle minecraft:dust 1 0.953 0.722 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
				});
			}
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("OVA")) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSummoned == true) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = JojowosModEntities.THE_WORLD_OVA.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof TheWorldOVAEntity) {
							if ((entityiterator instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) == false) {
								if (entityiterator instanceof TamableAnimal _toTame && entity instanceof Player _owner)
									_toTame.tame(_owner);
								entityiterator.getPersistentData().putString("UserName", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PlayerName));
							}
						}
					}
				}
				JojowosMod.queueServerWork(14, () -> {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle minecraft:dust 0.898 0.859 0.749 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle minecraft:dust 0.486 0.533 0.447 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
				});
			}
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Dark")) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSummoned == true) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = JojowosModEntities.THE_WORLD_SILVER.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof TheWorldSilverEntity) {
							if ((entityiterator instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) == false) {
								if (entityiterator instanceof TamableAnimal _toTame && entity instanceof Player _owner)
									_toTame.tame(_owner);
								entityiterator.getPersistentData().putString("UserName", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PlayerName));
							}
						}
					}
				}
				JojowosMod.queueServerWork(14, () -> {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle minecraft:dust 0.529 0.416 0.82 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle minecraft:dust 0.271 0.247 0.263 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
				});
			}
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Imposter")) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSummoned == true) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = JojowosModEntities.THE_WORLD_IMPOSTER.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof TheWorldImposterEntity) {
							if ((entityiterator instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) == false) {
								if (entityiterator instanceof TamableAnimal _toTame && entity instanceof Player _owner)
									_toTame.tame(_owner);
								entityiterator.getPersistentData().putString("UserName", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PlayerName));
							}
						}
					}
				}
				JojowosMod.queueServerWork(14, () -> {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle minecraft:dust 0.78 0.067 0.067 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle minecraft:dust 0.588 0.792 0.867 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
				});
			}
		}
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SelectedSkill).equals("[ ]")) {
			{
				String _setval = "Muda Barrage";
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
