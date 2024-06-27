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
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.entity.SilverChariotOVAEntity;
import net.mcreator.jojowos.entity.SilverChariotOVAArmorlessEntity;
import net.mcreator.jojowos.entity.SilverChariotMangaEntity;
import net.mcreator.jojowos.entity.SilverChariotMangaArmorlessEntity;
import net.mcreator.jojowos.entity.SilverChariotKokushiboEntity;
import net.mcreator.jojowos.entity.SilverChariotKokushiboArmorlessEntity;
import net.mcreator.jojowos.entity.SilverChariotGoldEntity;
import net.mcreator.jojowos.entity.SilverChariotGoldArmorlessEntity;
import net.mcreator.jojowos.entity.SilverChariotEntity;
import net.mcreator.jojowos.entity.SilverChariotArmorlessEntity;
import net.mcreator.jojowos.JojowosMod;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class SilverChariotBasicAttackProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getSource(), event.getEntity(), event.getSource().getDirectEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, DamageSource damagesource, Entity entity, Entity immediatesourceentity, Entity sourceentity) {
		execute(null, world, x, y, z, damagesource, entity, immediatesourceentity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, DamageSource damagesource, Entity entity, Entity immediatesourceentity, Entity sourceentity) {
		if (damagesource == null || entity == null || immediatesourceentity == null || sourceentity == null)
			return;
		boolean gate = false;
		gate = false;
		if (immediatesourceentity instanceof Player) {
			if (damagesource.is(DamageTypes.PLAYER_ATTACK)) {
				if ((immediatesourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSummoned == true
						&& ((immediatesourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("SilverChariot")) {
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
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.toList();
									for (Entity entityiterator : _entfound) {
										if (entityiterator instanceof SilverChariotEntity
												&& (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
											if (entityiterator instanceof SilverChariotEntity) {
												((SilverChariotEntity) entityiterator).setAnimation("attack1");
											}
										}
										if (entityiterator instanceof SilverChariotArmorlessEntity
												&& (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
											if (entityiterator instanceof SilverChariotArmorlessEntity) {
												((SilverChariotArmorlessEntity) entityiterator).setAnimation("attack1");
											}
										}
										if (entityiterator instanceof SilverChariotGoldEntity
												&& (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
											if (entityiterator instanceof SilverChariotGoldEntity) {
												((SilverChariotGoldEntity) entityiterator).setAnimation("attack1");
											}
										}
										if (entityiterator instanceof SilverChariotGoldArmorlessEntity
												&& (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
											if (entityiterator instanceof SilverChariotGoldArmorlessEntity) {
												((SilverChariotGoldArmorlessEntity) entityiterator).setAnimation("attack1");
											}
										}
										if (entityiterator instanceof SilverChariotMangaEntity
												&& (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
											if (entityiterator instanceof SilverChariotMangaEntity) {
												((SilverChariotMangaEntity) entityiterator).setAnimation("attack1");
											}
										}
										if (entityiterator instanceof SilverChariotMangaArmorlessEntity
												&& (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
											if (entityiterator instanceof SilverChariotMangaArmorlessEntity) {
												((SilverChariotMangaArmorlessEntity) entityiterator).setAnimation("attack1");
											}
										}
										if (entityiterator instanceof SilverChariotOVAEntity
												&& (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
											if (entityiterator instanceof SilverChariotOVAEntity) {
												((SilverChariotOVAEntity) entityiterator).setAnimation("attack1");
											}
										}
										if (entityiterator instanceof SilverChariotOVAArmorlessEntity
												&& (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
											if (entityiterator instanceof SilverChariotOVAArmorlessEntity) {
												((SilverChariotOVAArmorlessEntity) entityiterator).setAnimation("attack1");
											}
										}
										if (entityiterator instanceof SilverChariotKokushiboEntity
												&& (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
											if (entityiterator instanceof SilverChariotKokushiboEntity) {
												((SilverChariotKokushiboEntity) entityiterator).setAnimation("attack1");
											}
										}
										if (entityiterator instanceof SilverChariotKokushiboArmorlessEntity
												&& (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
											if (entityiterator instanceof SilverChariotKokushiboArmorlessEntity) {
												((SilverChariotKokushiboArmorlessEntity) entityiterator).setAnimation("attack1");
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
											if (((immediatesourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Kokushibo")) {
												if (world instanceof Level _level) {
													if (!_level.isClientSide()) {
														_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.PLAYERS, 1, 1);
													} else {
														_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.PLAYERS, 1, 1, false);
													}
												}
											} else {
												if (world instanceof Level _level) {
													if (!_level.isClientSide()) {
														_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:silver_chariot_atk_1")), SoundSource.PLAYERS, 1, 1);
													} else {
														_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:silver_chariot_atk_1")), SoundSource.PLAYERS, 1, 1, false);
													}
												}
											}
										});
									}
								}
								gate = true;
							}
							if ((immediatesourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AttackLevel == 2 && gate == false) {
								sourceentity.getPersistentData().putDouble("AttackCooldown", 20);
								{
									double _setval = 3;
									immediatesourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.AttackLevel = _setval;
										capability.syncPlayerVariables(immediatesourceentity);
									});
								}
								immediatesourceentity.getPersistentData().putBoolean("Attack", true);
								{
									final Vec3 _center = new Vec3(x, y, z);
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.toList();
									for (Entity entityiterator : _entfound) {
										if (entityiterator instanceof SilverChariotEntity
												&& (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
											if (entityiterator instanceof SilverChariotEntity) {
												((SilverChariotEntity) entityiterator).setAnimation("attack2");
											}
										}
										if (entityiterator instanceof SilverChariotArmorlessEntity
												&& (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
											if (entityiterator instanceof SilverChariotArmorlessEntity) {
												((SilverChariotArmorlessEntity) entityiterator).setAnimation("attack2");
											}
										}
										if (entityiterator instanceof SilverChariotGoldEntity
												&& (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
											if (entityiterator instanceof SilverChariotGoldEntity) {
												((SilverChariotGoldEntity) entityiterator).setAnimation("attack2");
											}
										}
										if (entityiterator instanceof SilverChariotGoldArmorlessEntity
												&& (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
											if (entityiterator instanceof SilverChariotGoldArmorlessEntity) {
												((SilverChariotGoldArmorlessEntity) entityiterator).setAnimation("attack2");
											}
										}
										if (entityiterator instanceof SilverChariotMangaEntity
												&& (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
											if (entityiterator instanceof SilverChariotMangaEntity) {
												((SilverChariotMangaEntity) entityiterator).setAnimation("attack2");
											}
										}
										if (entityiterator instanceof SilverChariotMangaArmorlessEntity
												&& (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
											if (entityiterator instanceof SilverChariotMangaArmorlessEntity) {
												((SilverChariotMangaArmorlessEntity) entityiterator).setAnimation("attack2");
											}
										}
										if (entityiterator instanceof SilverChariotOVAEntity
												&& (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
											if (entityiterator instanceof SilverChariotOVAEntity) {
												((SilverChariotOVAEntity) entityiterator).setAnimation("attack2");
											}
										}
										if (entityiterator instanceof SilverChariotOVAArmorlessEntity
												&& (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
											if (entityiterator instanceof SilverChariotOVAArmorlessEntity) {
												((SilverChariotOVAArmorlessEntity) entityiterator).setAnimation("attack2");
											}
										}
										if (entityiterator instanceof SilverChariotKokushiboEntity
												&& (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
											if (entityiterator instanceof SilverChariotKokushiboEntity) {
												((SilverChariotKokushiboEntity) entityiterator).setAnimation("attack2");
											}
										}
										if (entityiterator instanceof SilverChariotKokushiboArmorlessEntity
												&& (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
											if (entityiterator instanceof SilverChariotKokushiboArmorlessEntity) {
												((SilverChariotKokushiboArmorlessEntity) entityiterator).setAnimation("attack2");
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
											if (((immediatesourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Kokushibo")) {
												if (world instanceof Level _level) {
													if (!_level.isClientSide()) {
														_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.PLAYERS, 1, 1);
													} else {
														_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.PLAYERS, 1, 1, false);
													}
												}
											} else {
												if (world instanceof Level _level) {
													if (!_level.isClientSide()) {
														_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:silver_chariot_atk_2")), SoundSource.PLAYERS, 1, 1);
													} else {
														_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:silver_chariot_atk_2")), SoundSource.PLAYERS, 1, 1, false);
													}
												}
											}
										});
									}
								}
								gate = true;
							}
							if ((immediatesourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AttackLevel == 3 && gate == false) {
								sourceentity.getPersistentData().putDouble("AttackCooldown", 20);
								{
									double _setval = 4;
									immediatesourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.AttackLevel = _setval;
										capability.syncPlayerVariables(immediatesourceentity);
									});
								}
								immediatesourceentity.getPersistentData().putBoolean("Attack", true);
								{
									final Vec3 _center = new Vec3(x, y, z);
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.toList();
									for (Entity entityiterator : _entfound) {
										if (entityiterator instanceof SilverChariotEntity
												&& (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
											if (entityiterator instanceof SilverChariotEntity) {
												((SilverChariotEntity) entityiterator).setAnimation("attack3");
											}
										}
										if (entityiterator instanceof SilverChariotArmorlessEntity
												&& (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
											if (entityiterator instanceof SilverChariotArmorlessEntity) {
												((SilverChariotArmorlessEntity) entityiterator).setAnimation("attack3");
											}
										}
										if (entityiterator instanceof SilverChariotGoldEntity
												&& (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
											if (entityiterator instanceof SilverChariotGoldEntity) {
												((SilverChariotGoldEntity) entityiterator).setAnimation("attack3");
											}
										}
										if (entityiterator instanceof SilverChariotGoldArmorlessEntity
												&& (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
											if (entityiterator instanceof SilverChariotGoldArmorlessEntity) {
												((SilverChariotGoldArmorlessEntity) entityiterator).setAnimation("attack3");
											}
										}
										if (entityiterator instanceof SilverChariotMangaEntity
												&& (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
											if (entityiterator instanceof SilverChariotMangaEntity) {
												((SilverChariotMangaEntity) entityiterator).setAnimation("attack3");
											}
										}
										if (entityiterator instanceof SilverChariotMangaArmorlessEntity
												&& (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
											if (entityiterator instanceof SilverChariotMangaArmorlessEntity) {
												((SilverChariotMangaArmorlessEntity) entityiterator).setAnimation("attack3");
											}
										}
										if (entityiterator instanceof SilverChariotOVAEntity
												&& (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
											if (entityiterator instanceof SilverChariotOVAEntity) {
												((SilverChariotOVAEntity) entityiterator).setAnimation("attack3");
											}
										}
										if (entityiterator instanceof SilverChariotOVAArmorlessEntity
												&& (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
											if (entityiterator instanceof SilverChariotOVAArmorlessEntity) {
												((SilverChariotOVAArmorlessEntity) entityiterator).setAnimation("attack3");
											}
										}
										if (entityiterator instanceof SilverChariotKokushiboEntity
												&& (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
											if (entityiterator instanceof SilverChariotKokushiboEntity) {
												((SilverChariotKokushiboEntity) entityiterator).setAnimation("attack1");
											}
										}
										if (entityiterator instanceof SilverChariotKokushiboArmorlessEntity
												&& (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
											if (entityiterator instanceof SilverChariotKokushiboArmorlessEntity) {
												((SilverChariotKokushiboArmorlessEntity) entityiterator).setAnimation("attack1");
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
											if (((immediatesourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Kokushibo")) {
												if (world instanceof Level _level) {
													if (!_level.isClientSide()) {
														_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.PLAYERS, 1, 1);
													} else {
														_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.PLAYERS, 1, 1, false);
													}
												}
											} else {
												if (world instanceof Level _level) {
													if (!_level.isClientSide()) {
														_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:silver_chariot_atk_3")), SoundSource.PLAYERS, 1, 1);
													} else {
														_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:silver_chariot_atk_3")), SoundSource.PLAYERS, 1, 1, false);
													}
												}
											}
										});
									}
								}
								gate = true;
							}
							if ((immediatesourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AttackLevel == 4 && gate == false) {
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
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.toList();
									for (Entity entityiterator : _entfound) {
										if (entityiterator instanceof SilverChariotEntity
												&& (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
											if (entityiterator instanceof SilverChariotEntity) {
												((SilverChariotEntity) entityiterator).setAnimation("attack4");
											}
										}
										if (entityiterator instanceof SilverChariotArmorlessEntity
												&& (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
											if (entityiterator instanceof SilverChariotArmorlessEntity) {
												((SilverChariotArmorlessEntity) entityiterator).setAnimation("attack4");
											}
										}
										if (entityiterator instanceof SilverChariotGoldEntity
												&& (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
											if (entityiterator instanceof SilverChariotGoldEntity) {
												((SilverChariotGoldEntity) entityiterator).setAnimation("attack4");
											}
										}
										if (entityiterator instanceof SilverChariotGoldArmorlessEntity
												&& (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
											if (entityiterator instanceof SilverChariotGoldArmorlessEntity) {
												((SilverChariotGoldArmorlessEntity) entityiterator).setAnimation("attack4");
											}
										}
										if (entityiterator instanceof SilverChariotMangaEntity
												&& (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
											if (entityiterator instanceof SilverChariotMangaEntity) {
												((SilverChariotMangaEntity) entityiterator).setAnimation("attack4");
											}
										}
										if (entityiterator instanceof SilverChariotMangaArmorlessEntity
												&& (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
											if (entityiterator instanceof SilverChariotMangaArmorlessEntity) {
												((SilverChariotMangaArmorlessEntity) entityiterator).setAnimation("attack4");
											}
										}
										if (entityiterator instanceof SilverChariotOVAEntity
												&& (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
											if (entityiterator instanceof SilverChariotOVAEntity) {
												((SilverChariotOVAEntity) entityiterator).setAnimation("attack4");
											}
										}
										if (entityiterator instanceof SilverChariotOVAArmorlessEntity
												&& (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
											if (entityiterator instanceof SilverChariotOVAArmorlessEntity) {
												((SilverChariotOVAArmorlessEntity) entityiterator).setAnimation("attack4");
											}
										}
										if (entityiterator instanceof SilverChariotKokushiboEntity
												&& (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
											if (entityiterator instanceof SilverChariotKokushiboEntity) {
												((SilverChariotKokushiboEntity) entityiterator).setAnimation("attack2");
											}
										}
										if (entityiterator instanceof SilverChariotKokushiboArmorlessEntity
												&& (entityiterator instanceof TamableAnimal _tamIsTamedBy && immediatesourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
											if (entityiterator instanceof SilverChariotKokushiboArmorlessEntity) {
												((SilverChariotKokushiboArmorlessEntity) entityiterator).setAnimation("attack2");
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
											if (((immediatesourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Kokushibo")) {
												if (world instanceof Level _level) {
													if (!_level.isClientSide()) {
														_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.PLAYERS, 1, 1);
													} else {
														_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.PLAYERS, 1, 1, false);
													}
												}
											} else {
												if (world instanceof Level _level) {
													if (!_level.isClientSide()) {
														_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:silver_chariot_atk_4")), SoundSource.PLAYERS, 1, 1);
													} else {
														_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:silver_chariot_atk_4")), SoundSource.PLAYERS, 1, 1, false);
													}
												}
											}
										});
									}
								}
								gate = true;
							}
							if (immediatesourceentity.getPersistentData().getDouble("PassiveCooldown") == 0) {
								immediatesourceentity.getPersistentData().putDouble("PassiveCooldown", 300);
								JojowosMod.queueServerWork(20, () -> {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.PLAYERS, 1, 1);
										} else {
											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.PLAYERS, 1, 1, false);
										}
									}
									entity.hurt(
											new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("jojowos:stand"))), immediatesourceentity),
											(float) (1 + (immediatesourceentity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower / 30));
								});
							}
						}
					}
				}
			}
		}
	}
}
