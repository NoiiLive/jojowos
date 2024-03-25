package net.mcreator.jojowos.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.init.JojowosModMobEffects;

public class StandBlockingProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		boolean gate = false;
		gate = false;
		if (((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).SpecialType).equals("Item")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Cannot Block With This Stand"), true);
		} else {
			if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSummoned == true
					&& (entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(JojowosModMobEffects.TIME_STOPPED.get())) == false
					&& (entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(JojowosModMobEffects.NO_ARMOR_CHARIOT.get())) == false
					&& (entity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(JojowosModMobEffects.BURROWED_EFFECT.get())) == false
					&& (entity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(JojowosModMobEffects.RED_BINDED.get())) == false
					&& (entity instanceof LivingEntity _livEnt5 && _livEnt5.hasEffect(JojowosModMobEffects.SAND_TRAPPED.get())) == false) {
				if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).BlockingCooldown == 0) {
					if (entity.isShiftKeyDown()) {
						{
							boolean _setval = true;
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.StandBlocking = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("\u00A76\u00A7lBlocking"), true);
					} else {
						{
							boolean _setval = true;
							entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.StandGuarding = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("\u00A7e\u00A7lGuarding"), true);
					}
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(("Block Is On Cooldown : "
								+ new java.text.DecimalFormat("##").format(Math.round((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).BlockingCooldown / 20)) + "/s")),
								true);
				}
			}
		}
	}
}
