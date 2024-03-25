package net.mcreator.jojowos.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.entity.SilverChariotOVAEntity;
import net.mcreator.jojowos.entity.SilverChariotOVAArmorlessEntity;
import net.mcreator.jojowos.entity.SilverChariotMangaEntity;
import net.mcreator.jojowos.entity.SilverChariotMangaArmorlessEntity;
import net.mcreator.jojowos.entity.SilverChariotGoldEntity;
import net.mcreator.jojowos.entity.SilverChariotGoldArmorlessEntity;
import net.mcreator.jojowos.entity.SilverChariotEntity;
import net.mcreator.jojowos.entity.SilverChariotArmorlessEntity;
import net.mcreator.jojowos.JojowosMod;

import java.util.List;
import java.util.Comparator;

public class SilverChariotCycloneProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("Ability4Cooldown") == 0) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NoCooldown == false) {
				entity.getPersistentData().putDouble("Ability4Cooldown", (400 + Math.round((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSpeed * (-2.02))));
			} else {
				entity.getPersistentData().putDouble("Ability4Cooldown", 30);
			}
			{
				double _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).CurrentExp + 10
						+ (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPotential / 5;
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CurrentExp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 9, false, false));
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if ((entityiterator == entity) == false) {
						if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("jojowos:stand_mob"))) == false) {
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.SWEEP_ATTACK, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 3, 1, 1, 1, 0.5);
							{
								Entity _ent = entityiterator;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null,
											4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "particle minecraft:block minecraft:redstone_block ~ ~1 ~ 0.3 0 0.3 0.1 10 force");
								}
							}
							if (entityiterator instanceof LivingEntity _entity)
								_entity.hurt(new DamageSource(_entity.level().registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)) {
									@Override
									public Component getLocalizedDeathMessage(LivingEntity _msgEntity) {
										String _translatekey = "death.attack." + "stand";
										if (this.getEntity() == null && this.getDirectEntity() == null) {
											return _msgEntity.getKillCredit() != null
													? Component.translatable(_translatekey + ".player", _msgEntity.getDisplayName(), _msgEntity.getKillCredit().getDisplayName())
													: Component.translatable(_translatekey, _msgEntity.getDisplayName());
										} else {
											Component _component = this.getEntity() == null ? this.getDirectEntity().getDisplayName() : this.getEntity().getDisplayName();
											ItemStack _itemstack = ItemStack.EMPTY;
											if (this.getEntity() instanceof LivingEntity _livingentity)
												_itemstack = _livingentity.getMainHandItem();
											return !_itemstack.isEmpty() && _itemstack.hasCustomHoverName()
													? Component.translatable(_translatekey + ".item", _msgEntity.getDisplayName(), _component, _itemstack.getDisplayName())
													: Component.translatable(_translatekey, _msgEntity.getDisplayName(), _component);
										}
									}
								}, (float) (3.5 + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower / 50));
							JojowosMod.queueServerWork(10, () -> {
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.SWEEP_ATTACK, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 3, 1, 1, 1, 0.5);
								{
									Entity _ent = entityiterator;
									if (!_ent.level().isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
												_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
												"particle minecraft:block minecraft:redstone_block ~ ~1 ~ 0.3 0 0.3 0.1 10 force");
									}
								}
								if (entityiterator instanceof LivingEntity _entity)
									_entity.hurt(new DamageSource(_entity.level().registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)) {
										@Override
										public Component getLocalizedDeathMessage(LivingEntity _msgEntity) {
											String _translatekey = "death.attack." + "stand";
											if (this.getEntity() == null && this.getDirectEntity() == null) {
												return _msgEntity.getKillCredit() != null
														? Component.translatable(_translatekey + ".player", _msgEntity.getDisplayName(), _msgEntity.getKillCredit().getDisplayName())
														: Component.translatable(_translatekey, _msgEntity.getDisplayName());
											} else {
												Component _component = this.getEntity() == null ? this.getDirectEntity().getDisplayName() : this.getEntity().getDisplayName();
												ItemStack _itemstack = ItemStack.EMPTY;
												if (this.getEntity() instanceof LivingEntity _livingentity)
													_itemstack = _livingentity.getMainHandItem();
												return !_itemstack.isEmpty() && _itemstack.hasCustomHoverName()
														? Component.translatable(_translatekey + ".item", _msgEntity.getDisplayName(), _component, _itemstack.getDisplayName())
														: Component.translatable(_translatekey, _msgEntity.getDisplayName(), _component);
											}
										}
									}, (float) (2 + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower / 50));
								JojowosMod.queueServerWork(10, () -> {
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.SWEEP_ATTACK, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 3, 1, 1, 1, 0.5);
									{
										Entity _ent = entityiterator;
										if (!_ent.level().isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
													"particle minecraft:block minecraft:redstone_block ~ ~1 ~ 0.3 0 0.3 0.1 10 force");
										}
									}
									if (entityiterator instanceof LivingEntity _entity)
										_entity.hurt(new DamageSource(_entity.level().registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)) {
											@Override
											public Component getLocalizedDeathMessage(LivingEntity _msgEntity) {
												String _translatekey = "death.attack." + "stand";
												if (this.getEntity() == null && this.getDirectEntity() == null) {
													return _msgEntity.getKillCredit() != null
															? Component.translatable(_translatekey + ".player", _msgEntity.getDisplayName(), _msgEntity.getKillCredit().getDisplayName())
															: Component.translatable(_translatekey, _msgEntity.getDisplayName());
												} else {
													Component _component = this.getEntity() == null ? this.getDirectEntity().getDisplayName() : this.getEntity().getDisplayName();
													ItemStack _itemstack = ItemStack.EMPTY;
													if (this.getEntity() instanceof LivingEntity _livingentity)
														_itemstack = _livingentity.getMainHandItem();
													return !_itemstack.isEmpty() && _itemstack.hasCustomHoverName()
															? Component.translatable(_translatekey + ".item", _msgEntity.getDisplayName(), _component, _itemstack.getDisplayName())
															: Component.translatable(_translatekey, _msgEntity.getDisplayName(), _component);
												}
											}
										}, (float) (1.5 + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower / 50));
									JojowosMod.queueServerWork(10, () -> {
										if (world instanceof ServerLevel _level)
											_level.sendParticles(ParticleTypes.SWEEP_ATTACK, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 3, 1, 1, 1, 0.5);
										{
											Entity _ent = entityiterator;
											if (!_ent.level().isClientSide() && _ent.getServer() != null) {
												_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
														_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
														"particle minecraft:block minecraft:redstone_block ~ ~1 ~ 0.3 0 0.3 0.1 10 force");
											}
										}
										if (entityiterator instanceof LivingEntity _entity)
											_entity.hurt(new DamageSource(_entity.level().registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)) {
												@Override
												public Component getLocalizedDeathMessage(LivingEntity _msgEntity) {
													String _translatekey = "death.attack." + "stand";
													if (this.getEntity() == null && this.getDirectEntity() == null) {
														return _msgEntity.getKillCredit() != null
																? Component.translatable(_translatekey + ".player", _msgEntity.getDisplayName(), _msgEntity.getKillCredit().getDisplayName())
																: Component.translatable(_translatekey, _msgEntity.getDisplayName());
													} else {
														Component _component = this.getEntity() == null ? this.getDirectEntity().getDisplayName() : this.getEntity().getDisplayName();
														ItemStack _itemstack = ItemStack.EMPTY;
														if (this.getEntity() instanceof LivingEntity _livingentity)
															_itemstack = _livingentity.getMainHandItem();
														return !_itemstack.isEmpty() && _itemstack.hasCustomHoverName()
																? Component.translatable(_translatekey + ".item", _msgEntity.getDisplayName(), _component, _itemstack.getDisplayName())
																: Component.translatable(_translatekey, _msgEntity.getDisplayName(), _component);
													}
												}
											}, (float) (1 + (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandPower / 50));
									});
								});
							});
						}
						if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("jojowos:stand_mob"))) == true
								&& (entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) == true) {
							if (entityiterator instanceof SilverChariotEntity) {
								((SilverChariotEntity) entityiterator).setAnimation("attack1");
							}
							if (entityiterator instanceof SilverChariotArmorlessEntity) {
								((SilverChariotArmorlessEntity) entityiterator).setAnimation("attack1");
							}
							if (entityiterator instanceof SilverChariotGoldEntity) {
								((SilverChariotGoldEntity) entityiterator).setAnimation("attack1");
							}
							if (entityiterator instanceof SilverChariotGoldArmorlessEntity) {
								((SilverChariotGoldArmorlessEntity) entityiterator).setAnimation("attack1");
							}
							if (entityiterator instanceof SilverChariotMangaEntity) {
								((SilverChariotMangaEntity) entityiterator).setAnimation("attack1");
							}
							if (entityiterator instanceof SilverChariotMangaArmorlessEntity) {
								((SilverChariotMangaArmorlessEntity) entityiterator).setAnimation("attack1");
							}
							if (entityiterator instanceof SilverChariotOVAEntity) {
								((SilverChariotOVAEntity) entityiterator).setAnimation("attack1");
							}
							if (entityiterator instanceof SilverChariotOVAArmorlessEntity) {
								((SilverChariotOVAArmorlessEntity) entityiterator).setAnimation("attack1");
							}
							JojowosMod.queueServerWork(20, () -> {
								if (entityiterator instanceof SilverChariotEntity) {
									((SilverChariotEntity) entityiterator).setAnimation("attack2");
								}
								if (entityiterator instanceof SilverChariotArmorlessEntity) {
									((SilverChariotArmorlessEntity) entityiterator).setAnimation("attack2");
								}
								if (entityiterator instanceof SilverChariotGoldEntity) {
									((SilverChariotGoldEntity) entityiterator).setAnimation("attack2");
								}
								if (entityiterator instanceof SilverChariotGoldArmorlessEntity) {
									((SilverChariotGoldArmorlessEntity) entityiterator).setAnimation("attack2");
								}
								if (entityiterator instanceof SilverChariotMangaEntity) {
									((SilverChariotMangaEntity) entityiterator).setAnimation("attack2");
								}
								if (entityiterator instanceof SilverChariotMangaArmorlessEntity) {
									((SilverChariotMangaArmorlessEntity) entityiterator).setAnimation("attack2");
								}
								if (entityiterator instanceof SilverChariotOVAEntity) {
									((SilverChariotOVAEntity) entityiterator).setAnimation("attack2");
								}
								if (entityiterator instanceof SilverChariotOVAArmorlessEntity) {
									((SilverChariotOVAArmorlessEntity) entityiterator).setAnimation("attack2");
								}
							});
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:silver_chariot_atk_1")), SoundSource.PLAYERS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:silver_chariot_atk_1")), SoundSource.PLAYERS, 1, 1, false);
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.PLAYERS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.PLAYERS, 1, 1, false);
							}
						}
						JojowosMod.queueServerWork(10, () -> {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:silver_chariot_atk_2")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:silver_chariot_atk_2")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
							JojowosMod.queueServerWork(10, () -> {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:silver_chariot_atk_3")), SoundSource.PLAYERS, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:silver_chariot_atk_3")), SoundSource.PLAYERS, 1, 1, false);
									}
								}
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.PLAYERS, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.PLAYERS, 1, 1, false);
									}
								}
								JojowosMod.queueServerWork(10, () -> {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:silver_chariot_atk_4")), SoundSource.PLAYERS, 1, 1);
										} else {
											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:silver_chariot_atk_4")), SoundSource.PLAYERS, 1, 1, false);
										}
									}
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.PLAYERS, 1, 1);
										} else {
											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.PLAYERS, 1, 1, false);
										}
									}
								});
							});
						});
					}
				}
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Sword Cyclone is on Cooldown!"), true);
		}
	}
}
