package net.mcreator.jojowos.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.entity.TheWorldSilverEntity;
import net.mcreator.jojowos.entity.TheWorldOVAEntity;
import net.mcreator.jojowos.entity.TheWorldMangaEntity;
import net.mcreator.jojowos.entity.TheWorldImposterEntity;
import net.mcreator.jojowos.entity.TheWorldEntity;
import net.mcreator.jojowos.entity.TheWorldBlackEntity;
import net.mcreator.jojowos.JojowosMod;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class TheWorldBasicAttackProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(), event.getSource().getDirectEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity, Entity sourceentity) {
		execute(null, world, x, y, z, entity, immediatesourceentity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity, Entity sourceentity) {
		if (entity == null || immediatesourceentity == null || sourceentity == null)
			return;
		boolean gate = false;
		gate = false;
		if (immediatesourceentity instanceof Player) {
			if ((immediatesourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSummoned == true
					&& ((immediatesourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("TheWorld")) {
				if ((immediatesourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandBlocking == false) {
					if (immediatesourceentity.getPersistentData().getDouble("AttackCooldown") == 0) {
						if ((immediatesourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AttackLevel == 1 && gate == false) {
							immediatesourceentity.getPersistentData().putBoolean("Attack", true);
							immediatesourceentity.getPersistentData().putDouble("AttackCooldown", 20);
							{
								double _setval = 2;
								immediatesourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.AttackLevel = _setval;
									capability.syncPlayerVariables(immediatesourceentity);
								});
							}
							{
								final Vec3 _center = new Vec3(x, y, z);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
								for (Entity entityiterator : _entfound) {
									if (entityiterator instanceof TheWorldEntity && (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
										if (entityiterator instanceof TheWorldEntity) {
											((TheWorldEntity) entityiterator).setAnimation("attack1");
										}
									}
									if (entityiterator instanceof TheWorldSilverEntity && (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
										if (entityiterator instanceof TheWorldSilverEntity) {
											((TheWorldSilverEntity) entityiterator).setAnimation("attack1");
										}
									}
									if (entityiterator instanceof TheWorldBlackEntity && (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
										if (entityiterator instanceof TheWorldBlackEntity) {
											((TheWorldBlackEntity) entityiterator).setAnimation("attack4");
										}
									}
									if (entityiterator instanceof TheWorldMangaEntity && (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
										if (entityiterator instanceof TheWorldMangaEntity) {
											((TheWorldMangaEntity) entityiterator).setAnimation("attack1");
										}
									}
									if (entityiterator instanceof TheWorldOVAEntity && (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
										if (entityiterator instanceof TheWorldOVAEntity) {
											((TheWorldOVAEntity) entityiterator).setAnimation("attack4");
										}
									}
									if (entityiterator instanceof TheWorldImposterEntity && (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
										if (entityiterator instanceof TheWorldImposterEntity) {
											((TheWorldImposterEntity) entityiterator).setAnimation("attack1");
										}
									}
									JojowosMod.queueServerWork(10, () -> {
										entity.hurt(
												new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("jojowos:stand"))),
														immediatesourceentity),
												(float) (1 + (immediatesourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower / 25));
										immediatesourceentity.getPersistentData().putBoolean("Attack", false);
										{
											Entity _ent = entity;
											if (!_ent.level().isClientSide() && _ent.getServer() != null) {
												_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
														_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
														"particle minecraft:block minecraft:redstone_block ~ ~1 ~ 0.3 0 0.3 0.1 10 force");
											}
										}
									});
								}
							}
							gate = true;
							if (((immediatesourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Imposter")) {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:imposter_attack")), SoundSource.PLAYERS, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:imposter_attack")), SoundSource.PLAYERS, 1, 1, false);
									}
								}
							} else {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:the_world_atk_1")), SoundSource.PLAYERS, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:the_world_atk_1")), SoundSource.PLAYERS, 1, 1, false);
									}
								}
							}
						}
						if ((immediatesourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AttackLevel == 2 && gate == false) {
							sourceentity.getPersistentData().putDouble("AttackCooldown", 20);
							immediatesourceentity.getPersistentData().putBoolean("Attack", true);
							if (Mth.nextInt(RandomSource.create(), 1, 2) == 1) {
								{
									double _setval = 1;
									immediatesourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.AttackLevel = _setval;
										capability.syncPlayerVariables(immediatesourceentity);
									});
								}
							} else {
								{
									double _setval = 3;
									immediatesourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.AttackLevel = _setval;
										capability.syncPlayerVariables(immediatesourceentity);
									});
								}
							}
							{
								final Vec3 _center = new Vec3(x, y, z);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
								for (Entity entityiterator : _entfound) {
									if (entityiterator instanceof TheWorldEntity && (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
										if (entityiterator instanceof TheWorldEntity) {
											((TheWorldEntity) entityiterator).setAnimation("attack2");
										}
									}
									if (entityiterator instanceof TheWorldSilverEntity && (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
										if (entityiterator instanceof TheWorldSilverEntity) {
											((TheWorldSilverEntity) entityiterator).setAnimation("attack2");
										}
									}
									if (entityiterator instanceof TheWorldBlackEntity && (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
										if (entityiterator instanceof TheWorldBlackEntity) {
											((TheWorldBlackEntity) entityiterator).setAnimation("attack5");
										}
									}
									if (entityiterator instanceof TheWorldMangaEntity && (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
										if (entityiterator instanceof TheWorldMangaEntity) {
											((TheWorldMangaEntity) entityiterator).setAnimation("attack2");
										}
									}
									if (entityiterator instanceof TheWorldOVAEntity && (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
										if (entityiterator instanceof TheWorldOVAEntity) {
											((TheWorldOVAEntity) entityiterator).setAnimation("attack5");
										}
									}
									if (entityiterator instanceof TheWorldImposterEntity && (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
										if (entityiterator instanceof TheWorldImposterEntity) {
											((TheWorldImposterEntity) entityiterator).setAnimation("attack2");
										}
									}
									JojowosMod.queueServerWork(10, () -> {
										entity.hurt(
												new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("jojowos:stand"))),
														immediatesourceentity),
												(float) (1 + (immediatesourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower / 25));
										immediatesourceentity.getPersistentData().putBoolean("Attack", false);
										{
											Entity _ent = entity;
											if (!_ent.level().isClientSide() && _ent.getServer() != null) {
												_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
														_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
														"particle minecraft:block minecraft:redstone_block ~ ~1 ~ 0.3 0 0.3 0.1 10 force");
											}
										}
									});
								}
							}
							gate = true;
							if (((immediatesourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Imposter")) {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:imposter_attack")), SoundSource.PLAYERS, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:imposter_attack")), SoundSource.PLAYERS, 1, 1, false);
									}
								}
							} else {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:the_world_atk_2")), SoundSource.PLAYERS, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:the_world_atk_2")), SoundSource.PLAYERS, 1, 1, false);
									}
								}
							}
						}
						if ((immediatesourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AttackLevel == 3 && gate == false) {
							sourceentity.getPersistentData().putDouble("AttackCooldown", 40);
							{
								double _setval = 1;
								immediatesourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.AttackLevel = _setval;
									capability.syncPlayerVariables(immediatesourceentity);
								});
							}
							immediatesourceentity.getPersistentData().putBoolean("Attack", true);
							{
								final Vec3 _center = new Vec3(x, y, z);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
								for (Entity entityiterator : _entfound) {
									if (entityiterator instanceof TheWorldEntity && (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
										if (entityiterator instanceof TheWorldEntity) {
											((TheWorldEntity) entityiterator).setAnimation("attack3");
										}
									}
									if (entityiterator instanceof TheWorldSilverEntity && (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
										if (entityiterator instanceof TheWorldSilverEntity) {
											((TheWorldSilverEntity) entityiterator).setAnimation("attack3");
										}
									}
									if (entityiterator instanceof TheWorldBlackEntity && (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
										if (entityiterator instanceof TheWorldBlackEntity) {
											((TheWorldBlackEntity) entityiterator).setAnimation("attack6");
										}
									}
									if (entityiterator instanceof TheWorldMangaEntity && (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
										if (entityiterator instanceof TheWorldMangaEntity) {
											((TheWorldMangaEntity) entityiterator).setAnimation("attack3");
										}
									}
									if (entityiterator instanceof TheWorldOVAEntity && (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
										if (entityiterator instanceof TheWorldOVAEntity) {
											((TheWorldOVAEntity) entityiterator).setAnimation("attack6");
										}
									}
									if (entityiterator instanceof TheWorldImposterEntity && (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
										if (entityiterator instanceof TheWorldImposterEntity) {
											((TheWorldImposterEntity) entityiterator).setAnimation("attack3");
										}
									}
									JojowosMod.queueServerWork(10, () -> {
										entity.hurt(
												new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("jojowos:stand"))),
														immediatesourceentity),
												(float) (1 + (immediatesourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower / 25));
										immediatesourceentity.getPersistentData().putBoolean("Attack", false);
										{
											Entity _ent = entity;
											if (!_ent.level().isClientSide() && _ent.getServer() != null) {
												_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
														_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
														"particle minecraft:block minecraft:redstone_block ~ ~1 ~ 0.3 0 0.3 0.1 10 force");
											}
										}
									});
								}
							}
							gate = true;
							if (((immediatesourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Imposter")) {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:imposter_attack")), SoundSource.PLAYERS, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:imposter_attack")), SoundSource.PLAYERS, 1, 1, false);
									}
								}
							} else {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:the_world_atk_3")), SoundSource.PLAYERS, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:the_world_atk_3")), SoundSource.PLAYERS, 1, 1, false);
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
