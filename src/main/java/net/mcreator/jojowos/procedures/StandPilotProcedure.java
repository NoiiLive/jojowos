package net.mcreator.jojowos.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.init.JojowosModItems;
import net.mcreator.jojowos.init.JojowosModEntities;
import net.mcreator.jojowos.entity.PlayerDummyEntity;
import net.mcreator.jojowos.JojowosMod;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class StandPilotProcedure {
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
		String block = "";
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SpecialType).equals("Pilot")) {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).ToggleShiftMove == true) {
				if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandBlocking == false
						&& (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandGuarding == false) {
					if (entity.isShiftKeyDown()) {
						if (entity.getPersistentData().getBoolean("Piloting") == false) {
							if (!((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.CAVE_AIR)) {
								if (entity.getPersistentData().getDouble("leapPower") < 60) {
									entity.getPersistentData().putDouble("leapPower", (entity.getPersistentData().getDouble("leapPower") + 1));
								} else if (entity.getPersistentData().getDouble("leapPower") >= 60) {
									entity.getPersistentData().putDouble("leapPower", (entity.getPersistentData().getDouble("leapPower") + 1));
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												"particle minecraft:dust 0.263 0.278 0.29 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
								}
							}
						}
						if (entity.getPersistentData().getBoolean("Piloting") == true) {
							if (entity.getPersistentData().getDouble("leapPower") < 30) {
								entity.getPersistentData().putDouble("leapPower", (entity.getPersistentData().getDouble("leapPower") + 1));
							} else if (entity.getPersistentData().getDouble("leapPower") >= 30) {
								entity.getPersistentData().putDouble("leapPower", (entity.getPersistentData().getDouble("leapPower") + 1));
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"particle minecraft:dust 0.263 0.278 0.29 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
							}
						}
					} else {
						if (entity.getPersistentData().getBoolean("Piloting") == false) {
							if (entity.getPersistentData().getDouble("leapPower") >= 60) {
								if (entity instanceof Player _player)
									_player.getFoodData().setFoodLevel((int) ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) - 2));
								entity.getPersistentData().putDouble("leapPower", 0);
								entity.getPersistentData().putDouble("PilotX", x);
								entity.getPersistentData().putDouble("PilotY", y);
								entity.getPersistentData().putDouble("PilotZ", z);
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = JojowosModEntities.PLAYER_DUMMY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setDeltaMovement(0, 0, 0);
									}
								}
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:stand_summon")), SoundSource.PLAYERS, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:stand_summon")), SoundSource.PLAYERS, 1, 1, false);
									}
								}
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"particle minecraft:dust 0.263 0.278 0.29 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
								{
									final Vec3 _center = new Vec3(x, y, z);
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.toList();
									for (Entity entityiterator : _entfound) {
										if (entityiterator instanceof PlayerDummyEntity) {
											if ((entityiterator instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) == false) {
												if (entityiterator instanceof TamableAnimal _toTame && entity instanceof Player _owner)
													_toTame.tame(_owner);
												if ((entityiterator instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) == entity) {
													{
														Entity _entity = entityiterator;
														if (_entity instanceof Player _player) {
															_player.getInventory().armor.set(0, ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).copy()));
															_player.getInventory().setChanged();
														} else if (_entity instanceof LivingEntity _living) {
															_living.setItemSlot(EquipmentSlot.FEET, ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).copy()));
														}
													}
													{
														Entity _entity = entityiterator;
														if (_entity instanceof Player _player) {
															_player.getInventory().armor.set(1, ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).copy()));
															_player.getInventory().setChanged();
														} else if (_entity instanceof LivingEntity _living) {
															_living.setItemSlot(EquipmentSlot.LEGS, ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).copy()));
														}
													}
													{
														Entity _entity = entityiterator;
														if (_entity instanceof Player _player) {
															_player.getInventory().armor.set(2, ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).copy()));
															_player.getInventory().setChanged();
														} else if (_entity instanceof LivingEntity _living) {
															_living.setItemSlot(EquipmentSlot.CHEST, ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).copy()));
														}
													}
													{
														Entity _entity = entityiterator;
														if (_entity instanceof Player _player) {
															_player.getInventory().armor.set(3, ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).copy()));
															_player.getInventory().setChanged();
														} else if (_entity instanceof LivingEntity _living) {
															_living.setItemSlot(EquipmentSlot.HEAD, ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).copy()));
														}
													}
													if (entityiterator instanceof LivingEntity _entity) {
														ItemStack _setstack = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).copy();
														_setstack.setCount(1);
														_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
														if (_entity instanceof Player _player)
															_player.getInventory().setChanged();
													}
													if (entityiterator instanceof LivingEntity _entity) {
														ItemStack _setstack = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).copy();
														_setstack.setCount(1);
														_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
														if (_entity instanceof Player _player)
															_player.getInventory().setChanged();
													}
													entityiterator.setCustomName(Component.literal((entity.getDisplayName().getString())));
													if (entityiterator instanceof PlayerDummyEntity _datEntSetS)
														_datEntSetS.getEntityData().set(PlayerDummyEntity.DATA_OwnerUUID, (entity.getStringUUID()));
													{
														Entity _ent = entityiterator;
														_ent.setYRot(entity.getYRot());
														_ent.setXRot(entity.getXRot());
														_ent.setYBodyRot(_ent.getYRot());
														_ent.setYHeadRot(_ent.getYRot());
														_ent.yRotO = _ent.getYRot();
														_ent.xRotO = _ent.getXRot();
														if (_ent instanceof LivingEntity _entity) {
															_entity.yBodyRotO = _entity.getYRot();
															_entity.yHeadRotO = _entity.getYRot();
														}
													}
												}
											}
										}
									}
								}
								JojowosMod.queueServerWork(1, () -> {
									{
										Entity _entity = entity;
										if (_entity instanceof Player _player) {
											_player.getInventory().armor.set(0, new ItemStack(JojowosModItems.EMPTY_ARMOR_BOOTS.get()));
											_player.getInventory().setChanged();
										} else if (_entity instanceof LivingEntity _living) {
											_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(JojowosModItems.EMPTY_ARMOR_BOOTS.get()));
										}
									}
									{
										Entity _entity = entity;
										if (_entity instanceof Player _player) {
											_player.getInventory().armor.set(1, new ItemStack(JojowosModItems.EMPTY_ARMOR_LEGGINGS.get()));
											_player.getInventory().setChanged();
										} else if (_entity instanceof LivingEntity _living) {
											_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(JojowosModItems.EMPTY_ARMOR_LEGGINGS.get()));
										}
									}
									{
										Entity _entity = entity;
										if (_entity instanceof Player _player) {
											_player.getInventory().armor.set(3, new ItemStack(JojowosModItems.EMPTY_ARMOR_HELMET.get()));
											_player.getInventory().setChanged();
										} else if (_entity instanceof LivingEntity _living) {
											_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(JojowosModItems.EMPTY_ARMOR_HELMET.get()));
										}
									}
									if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("HierophantGreen")) {
										if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Base")) {
											{
												Entity _entity = entity;
												if (_entity instanceof Player _player) {
													_player.getInventory().armor.set(2, new ItemStack(JojowosModItems.HIEROPHANT_GREEN_PILOT_ANIME_CHESTPLATE.get()));
													_player.getInventory().setChanged();
												} else if (_entity instanceof LivingEntity _living) {
													_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(JojowosModItems.HIEROPHANT_GREEN_PILOT_ANIME_CHESTPLATE.get()));
												}
											}
										}
										if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Manga")) {
											{
												Entity _entity = entity;
												if (_entity instanceof Player _player) {
													_player.getInventory().armor.set(2, new ItemStack(JojowosModItems.HIEROPHANT_GREEN_PILOT_MANGA_CHESTPLATE.get()));
													_player.getInventory().setChanged();
												} else if (_entity instanceof LivingEntity _living) {
													_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(JojowosModItems.HIEROPHANT_GREEN_PILOT_MANGA_CHESTPLATE.get()));
												}
											}
										}
										if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("OVA")) {
											{
												Entity _entity = entity;
												if (_entity instanceof Player _player) {
													_player.getInventory().armor.set(2, new ItemStack(JojowosModItems.HIEROPHANT_GREEN_PILOT_OVA_CHESTPLATE.get()));
													_player.getInventory().setChanged();
												} else if (_entity instanceof LivingEntity _living) {
													_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(JojowosModItems.HIEROPHANT_GREEN_PILOT_OVA_CHESTPLATE.get()));
												}
											}
										}
										if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Blue")) {
											{
												Entity _entity = entity;
												if (_entity instanceof Player _player) {
													_player.getInventory().armor.set(2, new ItemStack(JojowosModItems.HIEROPHANT_GREEN_PILOT_BLUE_CHESTPLATE.get()));
													_player.getInventory().setChanged();
												} else if (_entity instanceof LivingEntity _living) {
													_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(JojowosModItems.HIEROPHANT_GREEN_PILOT_BLUE_CHESTPLATE.get()));
												}
											}
										}
										if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Sero")) {
											{
												Entity _entity = entity;
												if (_entity instanceof Player _player) {
													_player.getInventory().armor.set(2, new ItemStack(JojowosModItems.HIEROPHANT_SERO_PLAYER_CHESTPLATE.get()));
													_player.getInventory().setChanged();
												} else if (_entity instanceof LivingEntity _living) {
													_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(JojowosModItems.HIEROPHANT_SERO_PLAYER_CHESTPLATE.get()));
												}
											}
										}
									}
								});
								JojowosMod.queueServerWork(2, () -> {
									(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).enchant(Enchantments.BINDING_CURSE, 1);
									(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).enchant(Enchantments.BINDING_CURSE, 1);
									(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).enchant(Enchantments.BINDING_CURSE, 1);
									(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).enchant(Enchantments.BINDING_CURSE, 1);
									(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).enchant(Enchantments.VANISHING_CURSE, 1);
									(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).enchant(Enchantments.VANISHING_CURSE, 1);
									(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).enchant(Enchantments.VANISHING_CURSE, 1);
									(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).enchant(Enchantments.VANISHING_CURSE, 1);
								});
								if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSummoned == true) {
									StandDespawningProcedure.execute(world, x, y, z, entity);
								}
								if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("HierophantGreen")) {
									{
										double _setval = 1;
										entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.SkillNumber = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
									{
										String _setval = "Emerald Splash";
										entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.SelectedSkill = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
								}
								entity.getPersistentData().putBoolean("Piloting", true);
							}
						}
						if (entity.getPersistentData().getBoolean("Piloting") == true) {
							if (entity.getPersistentData().getDouble("leapPower") >= 30) {
								entity.getPersistentData().putDouble("leapPower", 0);
								{
									Entity _ent = entity;
									_ent.teleportTo((entity.getPersistentData().getDouble("PilotX")), (entity.getPersistentData().getDouble("PilotY")), (entity.getPersistentData().getDouble("PilotZ")));
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport((entity.getPersistentData().getDouble("PilotX")), (entity.getPersistentData().getDouble("PilotY")), (entity.getPersistentData().getDouble("PilotZ")), _ent.getYRot(),
												_ent.getXRot());
								}
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(entity.getPersistentData().getDouble("PilotX"), entity.getPersistentData().getDouble("PilotY"), entity.getPersistentData().getDouble("PilotZ")),
												ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:stand_unsummon")), SoundSource.NEUTRAL, 1, 1);
									} else {
										_level.playLocalSound((entity.getPersistentData().getDouble("PilotX")), (entity.getPersistentData().getDouble("PilotY")), (entity.getPersistentData().getDouble("PilotZ")),
												ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:stand_unsummon")), SoundSource.NEUTRAL, 1, 1, false);
									}
								}
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"particle minecraft:dust 0.263 0.278 0.29 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
								if (entity instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal("Punch your body to return to it"), true);
							}
						}
					}
				}
			}
		}
	}
}
