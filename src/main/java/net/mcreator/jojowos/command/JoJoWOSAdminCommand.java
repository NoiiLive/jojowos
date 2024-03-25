
package net.mcreator.jojowos.command;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.common.util.FakePlayerFactory;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.Commands;

import net.mcreator.jojowos.procedures.TimeStopLengthCommandProcedure;
import net.mcreator.jojowos.procedures.SetSkinCommandProcedure;
import net.mcreator.jojowos.procedures.SetKarmaCMDProcedure;
import net.mcreator.jojowos.procedures.NoCooldownCMDProcedure;
import net.mcreator.jojowos.procedures.LocateUserTheWorldProcedure;
import net.mcreator.jojowos.procedures.LocateUserTheFoolProcedure;
import net.mcreator.jojowos.procedures.LocateUserStarPlatinumProcedure;
import net.mcreator.jojowos.procedures.LocateUserSilverChariotProcedure;
import net.mcreator.jojowos.procedures.LocateUserMagiciansRedProcedure;
import net.mcreator.jojowos.procedures.LocateUserHierophantGreenProcedure;
import net.mcreator.jojowos.procedures.LocateUserHermitPurpleProcedure;
import net.mcreator.jojowos.procedures.ClearStandSkinCommandProcedure;
import net.mcreator.jojowos.procedures.ClearStandCommandProcedure;
import net.mcreator.jojowos.procedures.AddExpCommandProcedure;

import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.BoolArgumentType;

@Mod.EventBusSubscriber
public class JoJoWOSAdminCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("jojowosop").requires(s -> s.hasPermission(2)).then(Commands.literal("stand").then(Commands.literal("clear").then(Commands.argument("name", EntityArgument.player()).executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ClearStandCommandProcedure.execute(world, x, y, z, arguments, entity);
			return 0;
		})).then(Commands.literal("skins").then(Commands.argument("name", EntityArgument.player()).executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ClearStandSkinCommandProcedure.execute(world, x, y, z, arguments, entity);
			return 0;
		})))).then(Commands.literal("skin").then(Commands.argument("name", EntityArgument.player()).then(Commands.argument("skin", StringArgumentType.word()).executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			SetSkinCommandProcedure.execute(arguments, entity);
			return 0;
		})))).then(Commands.literal("exp").then(Commands.argument("name", EntityArgument.player()).then(Commands.argument("exp", DoubleArgumentType.doubleArg(0, 999999)).executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			AddExpCommandProcedure.execute(arguments, entity);
			return 0;
		})))).then(Commands.literal("worthiness").then(Commands.argument("name", EntityArgument.player()).then(Commands.argument("logic", BoolArgumentType.bool()).executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			TimeStopLengthCommandProcedure.execute(arguments, entity);
			return 0;
		})))).then(Commands.literal("timestop").then(Commands.argument("name", EntityArgument.player()).then(Commands.argument("Length", DoubleArgumentType.doubleArg(0, 12000)).executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			TimeStopLengthCommandProcedure.execute(arguments, entity);
			return 0;
		})))).then(Commands.literal("user").then(Commands.literal("StarPlatinum").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			LocateUserStarPlatinumProcedure.execute(world, entity);
			return 0;
		})).then(Commands.literal("HierophantGreen").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			LocateUserHierophantGreenProcedure.execute(world, entity);
			return 0;
		})).then(Commands.literal("MagiciansRed").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			LocateUserMagiciansRedProcedure.execute(world, entity);
			return 0;
		})).then(Commands.literal("HermitPurple").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			LocateUserHermitPurpleProcedure.execute(world, entity);
			return 0;
		})).then(Commands.literal("SilverChariot").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			LocateUserSilverChariotProcedure.execute(world, entity);
			return 0;
		})).then(Commands.literal("TheFool").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			LocateUserTheFoolProcedure.execute(world, entity);
			return 0;
		})).then(Commands.literal("TheWorld").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			LocateUserTheWorldProcedure.execute(world, entity);
			return 0;
		})))).then(Commands.literal("cooldown").then(Commands.argument("name", EntityArgument.player()).then(Commands.argument("logic", BoolArgumentType.bool()).executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			NoCooldownCMDProcedure.execute(arguments);
			return 0;
		})))).then(Commands.literal("karma").then(Commands.argument("name", EntityArgument.player()).then(Commands.argument("number", DoubleArgumentType.doubleArg(0, 999999)).executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			SetKarmaCMDProcedure.execute(arguments, entity);
			return 0;
		})))));
	}
}
