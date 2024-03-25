package net.mcreator.jojowos.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

public class PlayerDummyReturnProcedure {
	public static void execute(double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = (entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null);
			_ent.teleportTo(x, y, z);
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport(x, y, z, _ent.getYRot(), _ent.getXRot());
		}
		{
			Entity _entity = (entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null);
			if (_entity instanceof Player _player) {
				_player.getInventory().armor.set(0, ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).copy()));
				_player.getInventory().setChanged();
			} else if (_entity instanceof LivingEntity _living) {
				_living.setItemSlot(EquipmentSlot.FEET, ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).copy()));
			}
		}
		{
			Entity _entity = (entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null);
			if (_entity instanceof Player _player) {
				_player.getInventory().armor.set(1, ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).copy()));
				_player.getInventory().setChanged();
			} else if (_entity instanceof LivingEntity _living) {
				_living.setItemSlot(EquipmentSlot.LEGS, ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).copy()));
			}
		}
		{
			Entity _entity = (entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null);
			if (_entity instanceof Player _player) {
				_player.getInventory().armor.set(2, ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).copy()));
				_player.getInventory().setChanged();
			} else if (_entity instanceof LivingEntity _living) {
				_living.setItemSlot(EquipmentSlot.CHEST, ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).copy()));
			}
		}
		{
			Entity _entity = (entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null);
			if (_entity instanceof Player _player) {
				_player.getInventory().armor.set(3, ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).copy()));
				_player.getInventory().setChanged();
			} else if (_entity instanceof LivingEntity _living) {
				_living.setItemSlot(EquipmentSlot.HEAD, ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).copy()));
			}
		}
		(entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getPersistentData().putBoolean("Piloting", false);
		if (!entity.level().isClientSide())
			entity.discard();
	}
}
