package net.mcreator.jojowos.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.init.JojowosModItems;
import net.mcreator.jojowos.JojowosMod;

public class HermitPurpleNotInHandProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("HermitPurple")) {
			if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == JojowosModItems.HERMIT_PURPLE.get()) == false
					&& ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Base")) {
				{
					boolean _setval = false;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ItemStandSummoned = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == JojowosModItems.HERMIT_PURPLE_PART_4.get()) == false
					&& ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Part4")) {
				{
					boolean _setval = false;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ItemStandSummoned = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == JojowosModItems.HERMIT_PURPLE_MANGA.get()) == false
					&& ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Manga")) {
				{
					boolean _setval = false;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ItemStandSummoned = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == JojowosModItems.HERMIT_RED.get()) == false
					&& ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Red")) {
				{
					boolean _setval = false;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ItemStandSummoned = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == JojowosModItems.HERMIT_BLUE.get()) == false
					&& ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Blue")) {
				{
					boolean _setval = false;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ItemStandSummoned = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == JojowosModItems.HERMIT_GOLD.get()) == false
					&& ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Gold")) {
				{
					boolean _setval = false;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ItemStandSummoned = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == JojowosModItems.HERMIT_GOLD.get()) == false
					&& ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Gold")) {
				{
					boolean _setval = false;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ItemStandSummoned = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == JojowosModItems.HERMIT_PURPLE_AUTOMAIL.get()) == false
					&& ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Automail")) {
				{
					boolean _setval = false;
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ItemStandSummoned = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if ((itemstack.getOrCreateTag().getString("UserName")).equals("")) {
			itemstack.getOrCreateTag().putString("UserName", ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PlayerName));
			JojowosMod.LOGGER.info(itemstack.getOrCreateTag().getString("UserName"));
		} else {
			if ((itemstack.getOrCreateTag().getString("UserName")).equals((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).PlayerName) == false
					|| ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).Stand).equals("HermitPurple") == false) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(JojowosModItems.HERMIT_PURPLE.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 100, _player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(JojowosModItems.HERMIT_PURPLE_PART_4.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 100, _player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(JojowosModItems.HERMIT_PURPLE_MANGA.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 100, _player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(JojowosModItems.HERMIT_RED.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 100, _player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(JojowosModItems.HERMIT_BLUE.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 100, _player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(JojowosModItems.HERMIT_GOLD.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 100, _player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(JojowosModItems.HERMIT_PURPLE_AUTOMAIL.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 100, _player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("This is not your stand!"), true);
			}
		}
	}
}
