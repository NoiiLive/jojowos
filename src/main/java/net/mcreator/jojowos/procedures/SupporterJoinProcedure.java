package net.mcreator.jojowos.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.jojowos.network.JojowosModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SupporterJoinProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean TesterVersion = false;
		TesterVersion = true;
		if (TesterVersion == false) {
			if (("dev noiilive leviathdev bearster2948 frogineer maskl dadahi therealbb8fan1yt ginglegorf potatofarmerpaul crimsonharlequin jolyratio thunderpowers filip2356 sadsamuel54 hep_hep kujo1jotaro hosue ariname hijinx007 ariname2 hijinx_007 nimrr_ dukeofshades clozy_3 zen_haru_yuki ilikepie12281 epicbubblegunner codyjuggalo mr_garlicc epicdude1011 king_chuck volumegamer")
					.toLowerCase().contains((entity.getDisplayName().getString()).toLowerCase())) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(""), true);
			} else {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("kick " + entity.getDisplayName().getString()));
			}
		}
		if (("dev noiilive leviathdev bearster2948 frogineer maskl dadahi therealbb8fan1yt ginglegorf potatofarmerpaul crimsonharlequin jolyratio thunderpowers filip2356 sadsamuel54 hep_hep kujo1jotaro hosue ariname hijinx007 ariname2 hijinx_007 nimrr_ dukeofshades clozy_3 zen_haru_yuki ilikepie12281 epicbubblegunner codyjuggalo mr_garlicc epicdude1011 king_chuck volumegamer")
				.toLowerCase().contains((entity.getDisplayName().getString()).toLowerCase())) {
			if (entity instanceof Player _player)
				_player.closeContainer();
			if ("dev noiilive leviathdev".contains((entity.getDisplayName().getString()).toLowerCase())
					&& !((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).UnlockedTitles).contains("Developer")) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7f\u00A7lTitle Unlocked: \u00A7fDeveloper"), true);
				{
					String _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).UnlockedTitles + "Developer ";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.UnlockedTitles = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ("dev noiilive leviathdev".contains((entity.getDisplayName().getString()).toLowerCase())
					&& !((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).UnlockedTitles).contains("Emperor")) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7f\u00A7lTitle Unlocked: \u00A7fEmperor"), true);
				{
					String _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).UnlockedTitles + "Emperor ";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.UnlockedTitles = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
			if ("dev noiilive leviathdev clozy_3 ariname ariname2 hijinx007 hijinx_007 nimrr_ zen_haru_yuki mr_garlicc".contains((entity.getDisplayName().getString()).toLowerCase())
					&& !((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).UnlockedTitles).contains("Royal")) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7f\u00A7lTitle Unlocked: \u00A7fRoyal"), true);
				{
					String _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).UnlockedTitles + "Royal ";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.UnlockedTitles = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ("dev noiilive leviathdev hijinx007 hijinx_007".contains((entity.getDisplayName().getString()).toLowerCase())
					&& !((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).UnlockedTitles)
							.contains("\uD835\uDCEF\uD835\uDCFB\uD835\uDCEE\uD835\uDCEA\uD835\uDCF4\uD835\uDD02")) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7f\u00A7lTitle Unlocked: \u00A7f\uD835\uDCEF\uD835\uDCFB\uD835\uDCEE\uD835\uDCEA\uD835\uDCF4\uD835\uDD02"), true);
				{
					String _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).UnlockedTitles
							+ "\uD835\uDCEF\uD835\uDCFB\uD835\uDCEE\uD835\uDCEA\uD835\uDCF4\uD835\uDD02 ";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.UnlockedTitles = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
			if ("dev noiilive leviathdev bearster2948 frogineer maskl dadahi therealbb8fan1yt ginglegorf potatofarmerpaul crimsonharlequin jolyratio thunderpowers filip2356 sadsamuel54 hep_hep kujo1jotaro hosue dukeofshades ilikepie12281 epicbubblegunner codyjuggalo epicdude1011 king_chuck volumegamer"
					.contains((entity.getDisplayName().getString()).toLowerCase())
					&& !((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).UnlockedTitles).contains("Noble")) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7f\u00A7lTitle Unlocked: \u00A7fNoble"), true);
				{
					String _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).UnlockedTitles + "Noble ";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.UnlockedTitles = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
			if ("dev noiilive leviathdev maskl kujo1jotaro ginglegorf king_chuck epicdude1011".contains((entity.getDisplayName().getString()).toLowerCase())
					&& !((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).UnlockedTitles).contains("Squire")) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7f\u00A7lTitle Unlocked: \u00A7fSquire"), true);
				{
					String _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).UnlockedTitles + "Squire ";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.UnlockedTitles = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
			if ("dev noiilive leviathdev".contains((entity.getDisplayName().getString()).toLowerCase())
					&& !((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).UnlockedTitles).contains("Lord")) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7f\u00A7lTitle Unlocked: \u00A7fLord/Lady"), true);
				{
					String _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).UnlockedTitles + "Lord ";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.UnlockedTitles = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ("dev noiilive leviathdev".contains((entity.getDisplayName().getString()).toLowerCase())
					&& !((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).UnlockedTitles).contains("Lady")) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7f\u00A7lTitle Unlocked: \u00A7fLord/Lady"), true);
				{
					String _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).UnlockedTitles + "Lady ";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.UnlockedTitles = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
			if ("dev noiilive leviathdev".contains((entity.getDisplayName().getString()).toLowerCase())
					&& !((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).UnlockedTitles).contains("Baron")) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7f\u00A7lTitle Unlocked: \u00A7fBaron/Baroness"), true);
				{
					String _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).UnlockedTitles + "Baron ";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.UnlockedTitles = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ("dev noiilive leviathdev".contains((entity.getDisplayName().getString()).toLowerCase())
					&& !((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).UnlockedTitles).contains("Baroness ")) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7f\u00A7lTitle Unlocked: \u00A7fBaron/Baroness"), true);
				{
					String _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).UnlockedTitles + "Baroness ";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.UnlockedTitles = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
			if ("dev noiilive leviathdev".contains((entity.getDisplayName().getString()).toLowerCase())
					&& !((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).UnlockedTitles).contains("Viscount")) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7f\u00A7lTitle Unlocked: \u00A7fViscount/Viscountess"), true);
				{
					String _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).UnlockedTitles + "Viscount ";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.UnlockedTitles = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ("dev noiilive leviathdev".contains((entity.getDisplayName().getString()).toLowerCase())
					&& !((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).UnlockedTitles).contains("Viscountess")) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7f\u00A7lTitle Unlocked: \u00A7fViscount/Viscountess"), true);
				{
					String _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).UnlockedTitles + "Viscountess ";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.UnlockedTitles = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
			if ("dev noiilive leviathdev".contains((entity.getDisplayName().getString()).toLowerCase())
					&& !((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).UnlockedTitles).contains("Earl")) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7f\u00A7lTitle Unlocked: \u00A7fEarl"), true);
				{
					String _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).UnlockedTitles + "Earl ";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.UnlockedTitles = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
			if ("dev noiilive leviathdev".contains((entity.getDisplayName().getString()).toLowerCase())
					&& !((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).UnlockedTitles).contains("Margrave")) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7f\u00A7lTitle Unlocked: \u00A7fMargrave/Margravine"), true);
				{
					String _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).UnlockedTitles + "Margrave ";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.UnlockedTitles = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ("dev noiilive leviathdev".contains((entity.getDisplayName().getString()).toLowerCase())
					&& !((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).UnlockedTitles).contains("Margravine")) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7f\u00A7lTitle Unlocked: \u00A7fMargrave/Margravine"), true);
				{
					String _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).UnlockedTitles + "Margravine ";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.UnlockedTitles = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
			if ("dev noiilive leviathdev".contains((entity.getDisplayName().getString()).toLowerCase())
					&& !((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).UnlockedTitles).contains("Duke")) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7f\u00A7lTitle Unlocked: \u00A7fDuke/Duchess"), true);
				{
					String _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).UnlockedTitles + "Duke ";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.UnlockedTitles = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ("dev noiilive leviathdev".contains((entity.getDisplayName().getString()).toLowerCase())
					&& !((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).UnlockedTitles).contains("Duchess")) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7f\u00A7lTitle Unlocked: \u00A7fDuke/Duchess"), true);
				{
					String _setval = (entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).UnlockedTitles + "Duchess ";
					entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.UnlockedTitles = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
