package net.mcreator.jojowos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.JojowosMod;

public class JotaroChatLevel1Procedure {
    public static void execute(LevelAccessor world, Entity entity) {
        if (entity == null) return;

        JojowosModVariables.PlayerVariables playerVars = entity
                .getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null)
                .orElse(new JojowosModVariables.PlayerVariables());

        double step = playerVars.NPCTextStep1;

        if (step >= 0 && step < 21) {
            String baseMessage = "Oi, Don't lie to me.";
            String outputMessage = baseMessage.substring(0,(int) step);

            playerVars.NPCTextLine1 = outputMessage;
            playerVars.syncPlayerVariables(entity);

            JojowosMod.queueServerWork(1, () -> {
                double newStep = playerVars.NPCTextStep1 + 1;
                playerVars.NPCTextStep1 = newStep;
                playerVars.syncPlayerVariables(entity);
            });
        }
    }
} 