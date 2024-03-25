package net.mcreator.jojowos.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.ItemTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.init.JojowosModEntities;
import net.mcreator.jojowos.entity.HermitRopeTangleEntity;
import net.mcreator.jojowos.entity.HermitRedTangleEntity;
import net.mcreator.jojowos.entity.HermitPurpleTangleEntity;
import net.mcreator.jojowos.entity.HermitPart4TangleEntity;
import net.mcreator.jojowos.entity.HermitMangaTangleEntity;
import net.mcreator.jojowos.entity.HermitGoldTangleEntity;
import net.mcreator.jojowos.entity.HermitBlueTangleEntity;
import net.mcreator.jojowos.JojowosMod;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class HermitTangleAttackProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(), event.getSource().getDirectEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		execute(null, world, x, y, z, entity, immediatesourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		boolean gate = false;
		gate = false;
		if (immediatesourceentity instanceof Player) {
			if ((immediatesourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).TangleUnlocked == true) {
				if (((immediatesourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("HermitPurple")
						&& (immediatesourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("jojowos:hermit_purple_tag"))) && gate == false) {
					if (immediatesourceentity.getPersistentData().getDouble("AttackCooldown") == 0) {
						immediatesourceentity.getPersistentData().putDouble("AttackCooldown", 400);
						gate = true;
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 9, false, false));
						if (entity instanceof Player) {
							if (((immediatesourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Base")) {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = JojowosModEntities.HERMIT_PURPLE_TANGLE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setDeltaMovement(0, 0, 0);
									}
								}
								JojowosMod.queueServerWork(5, () -> {
									{
										final Vec3 _center = new Vec3(x, y, z);
										List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
												.toList();
										for (Entity entityiterator : _entfound) {
											if (entityiterator instanceof HermitPurpleTangleEntity) {
												if (entityiterator instanceof TamableAnimal _toTame && entity instanceof Player _owner)
													_toTame.tame(_owner);
											}
										}
									}
								});
							}
							if (((immediatesourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Part4")) {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = JojowosModEntities.HERMIT_PART_4_TANGLE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setDeltaMovement(0, 0, 0);
									}
								}
								JojowosMod.queueServerWork(5, () -> {
									{
										final Vec3 _center = new Vec3(x, y, z);
										List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
												.toList();
										for (Entity entityiterator : _entfound) {
											if (entityiterator instanceof HermitPart4TangleEntity) {
												if (entityiterator instanceof TamableAnimal _toTame && entity instanceof Player _owner)
													_toTame.tame(_owner);
											}
										}
									}
								});
							}
							if (((immediatesourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Manga")) {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = JojowosModEntities.HERMIT_MANGA_TANGLE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setDeltaMovement(0, 0, 0);
									}
								}
								JojowosMod.queueServerWork(5, () -> {
									{
										final Vec3 _center = new Vec3(x, y, z);
										List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
												.toList();
										for (Entity entityiterator : _entfound) {
											if (entityiterator instanceof HermitMangaTangleEntity) {
												if (entityiterator instanceof TamableAnimal _toTame && entity instanceof Player _owner)
													_toTame.tame(_owner);
											}
										}
									}
								});
							}
							if (((immediatesourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Red")) {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = JojowosModEntities.HERMIT_RED_TANGLE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setDeltaMovement(0, 0, 0);
									}
								}
								JojowosMod.queueServerWork(5, () -> {
									{
										final Vec3 _center = new Vec3(x, y, z);
										List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
												.toList();
										for (Entity entityiterator : _entfound) {
											if (entityiterator instanceof HermitRedTangleEntity) {
												if (entityiterator instanceof TamableAnimal _toTame && entity instanceof Player _owner)
													_toTame.tame(_owner);
											}
										}
									}
								});
							}
							if (((immediatesourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Blue")) {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = JojowosModEntities.HERMIT_BLUE_TANGLE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setDeltaMovement(0, 0, 0);
									}
								}
								JojowosMod.queueServerWork(5, () -> {
									{
										final Vec3 _center = new Vec3(x, y, z);
										List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
												.toList();
										for (Entity entityiterator : _entfound) {
											if (entityiterator instanceof HermitBlueTangleEntity) {
												if (entityiterator instanceof TamableAnimal _toTame && entity instanceof Player _owner)
													_toTame.tame(_owner);
											}
										}
									}
								});
							}
							if (((immediatesourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Gold")) {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = JojowosModEntities.HERMIT_GOLD_TANGLE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setDeltaMovement(0, 0, 0);
									}
								}
								JojowosMod.queueServerWork(5, () -> {
									{
										final Vec3 _center = new Vec3(x, y, z);
										List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
												.toList();
										for (Entity entityiterator : _entfound) {
											if (entityiterator instanceof HermitGoldTangleEntity) {
												if (entityiterator instanceof TamableAnimal _toTame && entity instanceof Player _owner)
													_toTame.tame(_owner);
											}
										}
									}
								});
							}
							if (((immediatesourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Automail")) {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = JojowosModEntities.HERMIT_GOLD_TANGLE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setDeltaMovement(0, 0, 0);
									}
								}
								JojowosMod.queueServerWork(5, () -> {
									{
										final Vec3 _center = new Vec3(x, y, z);
										List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
												.toList();
										for (Entity entityiterator : _entfound) {
											if (entityiterator instanceof HermitRopeTangleEntity) {
												if (entityiterator instanceof TamableAnimal _toTame && entity instanceof Player _owner)
													_toTame.tame(_owner);
											}
										}
									}
								});
							}
						}
						if ((immediatesourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).HamonUser == true) {
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
						if (((immediatesourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Automail")) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:automail_tangle")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:automail_tangle")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
						} else {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:hermitpurple_tangle")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:hermitpurple_tangle")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
						}
					}
				}
			}
		}
	}
}
