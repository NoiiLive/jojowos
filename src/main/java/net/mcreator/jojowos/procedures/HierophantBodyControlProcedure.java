package net.mcreator.jojowos.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.init.JojowosModItems;
import net.mcreator.jojowos.init.JojowosModEntities;
import net.mcreator.jojowos.entity.PlayerControllingEntity;
import net.mcreator.jojowos.entity.PlayerControlEntity;
import net.mcreator.jojowos.JojowosMod;

import java.util.List;
import java.util.Comparator;

public class HierophantBodyControlProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).AbilityCooldown3 == 0) {
			{
				double _setval = 100;
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.AbilityCooldown3 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if ((((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(
					new Vec3((entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
							(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
							(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())),
					4, 4, 4), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf((entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
							(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
							(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())))
					.findFirst().orElse(null)) == entity) == false) {
				((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(
						new Vec3((entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
								(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
								(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())),
						4, 4, 4), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(
								(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
								(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
								(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())))
						.findFirst().orElse(null)).getPersistentData().putBoolean("ControlTarget", true);
			}
			{
				final Vec3 _center = new Vec3(
						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(10)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof Player) {
						if (entityiterator.getPersistentData().getBoolean("ControlTarget") == true) {
							if (entityiterator.getPersistentData().getBoolean("Piloting") == false) {
								entityiterator.getPersistentData().putBoolean("ControlTarget", false);
								if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).NoCooldown == false) {
									{
										double _setval = 2000 + Math.round((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSpeed * (-6.329));
										entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.AbilityCooldown3 = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
								} else {
									{
										double _setval = 320;
										entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.AbilityCooldown3 = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
								}
								{
									double _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).CurrentExp + 60;
									entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.CurrentExp = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
								entity.getPersistentData().putDouble("PilotX", x);
								entity.getPersistentData().putDouble("PilotY", y);
								entity.getPersistentData().putDouble("PilotZ", z);
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"particle minecraft:dust 0.137 0.439 0.29 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
								if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSummoned == true) {
									StandDespawningProcedure.execute(world, x, y, z, entity);
								}
								entityiterator.getPersistentData().putBoolean("Controlled", true);
								if ((entityiterator.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSummoned == true) {
									StandDespawningProcedure.execute(world, x, y, z, entity);
								}
								entityiterator.getPersistentData().putString("ControllerName", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PlayerName));
								entity.getPersistentData().putString("ControlledName", ((entityiterator.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PlayerName));
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = JojowosModEntities.PLAYER_CONTROL.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setDeltaMovement(0, 0, 0);
									}
								}
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = JojowosModEntities.PLAYER_CONTROLLING.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setDeltaMovement(0, 0, 0);
									}
								}
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:stand_summon")), SoundSource.NEUTRAL, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jojowos:stand_summon")), SoundSource.NEUTRAL, 1, 1, false);
									}
								}
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"particle minecraft:dust 0.263 0.278 0.29 1 ^0 ^1 ^ 1 1 1 0.05 40 force @a");
								entity.getPersistentData().putBoolean("Controlling", true);
								entity.getPersistentData().putDouble("ControlTime", 300);
								JojowosMod.queueServerWork(6, () -> {
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
											_player.getInventory().armor.set(2, new ItemStack(JojowosModItems.EMPTY_ARMOR_CHESTPLATE.get()));
											_player.getInventory().setChanged();
										} else if (_entity instanceof LivingEntity _living) {
											_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(JojowosModItems.EMPTY_ARMOR_CHESTPLATE.get()));
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
								});
								JojowosMod.queueServerWork(7, () -> {
									(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).enchant(Enchantments.BINDING_CURSE, 1);
									(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).enchant(Enchantments.BINDING_CURSE, 1);
									(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).enchant(Enchantments.BINDING_CURSE, 1);
									(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).enchant(Enchantments.BINDING_CURSE, 1);
									(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).enchant(Enchantments.VANISHING_CURSE, 1);
									(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).enchant(Enchantments.VANISHING_CURSE, 1);
									(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).enchant(Enchantments.VANISHING_CURSE, 1);
									(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).enchant(Enchantments.VANISHING_CURSE, 1);
								});
							}
						}
					}
				}
			}
			JojowosMod.queueServerWork(4, () -> {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof PlayerControllingEntity) {
							if ((entityiterator instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) == false) {
								entityiterator.getPersistentData().putString("ControllerName", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PlayerName));
								entityiterator.setCustomName(Component.literal((entityiterator.getPersistentData().getString("ControllerName"))));
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
								if (entityiterator instanceof TamableAnimal _toTame && entity instanceof Player _owner)
									_toTame.tame(_owner);
							}
						}
					}
				}
			});
			JojowosMod.queueServerWork(5, () -> {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof PlayerControlEntity) {
							if ((entityiterator instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) == false) {
								if (entityiterator instanceof TamableAnimal _toTame && entity instanceof Player _owner)
									_toTame.tame(_owner);
								entityiterator.getPersistentData().putString("ControllerName", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PlayerName));
								entityiterator.getPersistentData().putString("ControlledName", (entity.getPersistentData().getString("ControlledName")));
								entityiterator.setCustomName(Component.literal((entity.getPersistentData().getString("ControlledName"))));
							}
						}
					}
				}
			});
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Body Control is on Cooldown!"), true);
		}
	}
}
