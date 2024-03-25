package net.mcreator.jojowos.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.jojowos.init.JojowosModMobEffects;
import net.mcreator.jojowos.entity.IggyEntity;
import net.mcreator.jojowos.JojowosMod;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class IggyAttacksProcedure {
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
		double randomnumber = 0;
		double randomnumber2 = 0;
		double randomnumber3 = 0;
		if (immediatesourceentity instanceof IggyEntity) {
			randomnumber = Mth.nextInt(RandomSource.create(), 1, 10);
			if (immediatesourceentity.getPersistentData().getDouble("AttackCooldown") == 0) {
				if (randomnumber >= 1 && randomnumber <= 9) {
					if (Math.random() >= 0.5) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:iggy_atk_1")), SoundSource.HOSTILE, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:iggy_atk_1")), SoundSource.HOSTILE, 1, 1, false);
							}
						}
					} else {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:iggy_atk_2")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:iggy_atk_2")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					}
					if (immediatesourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 15, 9, false, false));
					JojowosMod.queueServerWork(10, () -> {
						if (Math.random() >= 0.5) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:the_fool_atk")), SoundSource.HOSTILE, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:the_fool_atk")), SoundSource.HOSTILE, 1, 1, false);
								}
							}
						} else {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:the_fool_atk_2")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:the_fool_atk_2")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
						}
						if (entity instanceof LivingEntity _entity)
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
							}, 4);
					});
					if (immediatesourceentity instanceof IggyEntity) {
						((IggyEntity) immediatesourceentity).setAnimation("attack");
					}
					immediatesourceentity.getPersistentData().putDouble("AttackCooldown", 30);
				}
				if (randomnumber >= 6 && randomnumber <= 9) {
					if (immediatesourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 65, 9, false, false));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:iggy_growl")), SoundSource.BLOCKS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:iggy_growl")), SoundSource.BLOCKS, 1, 1, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.sand.place")), SoundSource.BLOCKS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.sand.place")), SoundSource.BLOCKS, 1, 1, false);
						}
					}
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if ((entityiterator == immediatesourceentity) == false) {
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(JojowosModMobEffects.SAND_TRAPPED.get(), 100, 0, false, false));
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 100, 4, false, false));
							}
						}
					}
					immediatesourceentity.getPersistentData().putDouble("AttackCooldown", 150);
				}
			}
			if (immediatesourceentity.getPersistentData().getDouble("Ability1Cooldown") == 0) {
				if (randomnumber == 10) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:iggy_dome")), SoundSource.BLOCKS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:iggy_dome")), SoundSource.BLOCKS, 1, 1, false);
						}
					}
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if ((entityiterator == immediatesourceentity) == false) {
								entityiterator.setDeltaMovement(new Vec3((entityiterator.getX() - immediatesourceentity.getX()), (entityiterator.getY() - immediatesourceentity.getY()), (entityiterator.getZ() - immediatesourceentity.getZ())));
								entityiterator.getPersistentData().putDouble("Inhale1x", (entityiterator.getX() - immediatesourceentity.getX()));
								entityiterator.getPersistentData().putDouble("Inhale1z", (entityiterator.getZ() - immediatesourceentity.getZ()));
								entityiterator.getPersistentData().putBoolean("Inhaled1", true);
								JojowosMod.queueServerWork(1, () -> {
									entityiterator.getPersistentData().putBoolean("Inhaled1", false);
								});
							}
						}
					}
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"execute at @p run function jojowos:sand_circle");
					JojowosMod.queueServerWork(10, () -> {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.sand.place")), SoundSource.BLOCKS, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.sand.place")), SoundSource.BLOCKS, 1, 1, false);
							}
						}
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"particle minecraft:block minecraft:sand ~ ~ ~ 2 2 2 0.1 300");
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("jojowos", "sand_dome"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y, z - 3), BlockPos.containing(x - 3, y, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
					immediatesourceentity.getPersistentData().putDouble("Ability1Cooldown", 300);
				}
			}
		}
		if (entity instanceof IggyEntity) {
			randomnumber2 = Mth.nextInt(RandomSource.create(), 1, 20);
			randomnumber3 = Mth.nextInt(RandomSource.create(), 1, 100);
			if (entity.getPersistentData().getDouble("PassiveCooldown") == 0) {
				if (randomnumber2 >= 19 && randomnumber2 <= 20) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:iggy_sniff")), SoundSource.HOSTILE, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:iggy_sniff")), SoundSource.HOSTILE, 1, 1, false);
						}
					}
					if (entity instanceof IggyEntity) {
						((IggyEntity) entity).setAnimation("burrow");
					}
					JojowosMod.queueServerWork(19, () -> {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.sand.break")), SoundSource.HOSTILE, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.sand.break")), SoundSource.HOSTILE, 1, 1, false);
							}
						}
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(JojowosModMobEffects.BURROWED_EFFECT.get(), 100, 0, false, false));
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 100, 0, false, false));
					});
					JojowosMod.queueServerWork(10, () -> {
						entity.getPersistentData().putDouble("PassiveCooldown", 200);
					});
				}
			}
			if (randomnumber3 >= 80 && randomnumber3 <= 85) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:iggy_hurt_1")), SoundSource.HOSTILE, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:iggy_hurt_1")), SoundSource.HOSTILE, 1, 1, false);
					}
				}
			}
			if (randomnumber3 >= 86 && randomnumber3 <= 90) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:iggy_hurt_2")), SoundSource.HOSTILE, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:iggy_hurt_2")), SoundSource.HOSTILE, 1, 1, false);
					}
				}
			}
			if (randomnumber3 >= 91 && randomnumber3 <= 95) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:iggy_hurt_3")), SoundSource.HOSTILE, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:iggy_hurt_3")), SoundSource.HOSTILE, 1, 1, false);
					}
				}
			}
			if (randomnumber3 >= 96 && randomnumber3 <= 100) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:iggy_hurt_4")), SoundSource.HOSTILE, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:iggy_hurt_4")), SoundSource.HOSTILE, 1, 1, false);
					}
				}
			}
		}
	}
}
