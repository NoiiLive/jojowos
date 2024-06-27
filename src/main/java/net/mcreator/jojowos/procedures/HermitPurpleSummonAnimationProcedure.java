package net.mcreator.jojowos.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.player.AbstractClientPlayer;

import net.mcreator.jojowos.network.JojowosModVariables;
import net.mcreator.jojowos.item.HermitRedItem;
import net.mcreator.jojowos.item.HermitPurpleVenomItem;
import net.mcreator.jojowos.item.HermitPurplePart4Item;
import net.mcreator.jojowos.item.HermitPurpleNeroItem;
import net.mcreator.jojowos.item.HermitPurpleMangaItem;
import net.mcreator.jojowos.item.HermitPurpleLuckItem;
import net.mcreator.jojowos.item.HermitPurpleLinkItem;
import net.mcreator.jojowos.item.HermitPurpleItem;
import net.mcreator.jojowos.item.HermitPurpleGiganteItem;
import net.mcreator.jojowos.item.HermitPurpleAutomailItem;
import net.mcreator.jojowos.item.HermitGoldItem;
import net.mcreator.jojowos.item.HermitBlueItem;

import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationRegistry;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationAccess;
import dev.kosmx.playerAnim.api.layered.ModifierLayer;
import dev.kosmx.playerAnim.api.layered.KeyframeAnimationPlayer;
import dev.kosmx.playerAnim.api.layered.IAnimation;

public class HermitPurpleSummonAnimationProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).ItemStandSummoned == false) {
			{
				boolean _setval = true;
				entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ItemStandSummoned = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (!((entity.getCapability(JojowosModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JojowosModVariables.PlayerVariables())).StandSkin).equals("Automail")) {
				if (world.isClientSide()) {
					if (entity instanceof AbstractClientPlayer player) {
						var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("jojowos", "player_animation"));
						if (animation != null && !animation.isActive()) {
							animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("jojowos", "hermitsummon"))));
						}
					}
				}
			}
			if (itemstack.getItem() instanceof HermitPurpleItem)
				itemstack.getOrCreateTag().putString("geckoAnim", "summon");
			if (itemstack.getItem() instanceof HermitPurplePart4Item)
				itemstack.getOrCreateTag().putString("geckoAnim", "summon");
			if (itemstack.getItem() instanceof HermitPurpleMangaItem)
				itemstack.getOrCreateTag().putString("geckoAnim", "summon");
			if (itemstack.getItem() instanceof HermitRedItem)
				itemstack.getOrCreateTag().putString("geckoAnim", "summon");
			if (itemstack.getItem() instanceof HermitBlueItem)
				itemstack.getOrCreateTag().putString("geckoAnim", "summon");
			if (itemstack.getItem() instanceof HermitGoldItem)
				itemstack.getOrCreateTag().putString("geckoAnim", "summon");
			if (itemstack.getItem() instanceof HermitPurpleAutomailItem)
				itemstack.getOrCreateTag().putString("geckoAnim", "summon");
			if (itemstack.getItem() instanceof HermitPurpleGiganteItem)
				itemstack.getOrCreateTag().putString("geckoAnim", "summon");
			if (itemstack.getItem() instanceof HermitPurpleVenomItem)
				itemstack.getOrCreateTag().putString("geckoAnim", "summon");
			if (itemstack.getItem() instanceof HermitPurpleLinkItem)
				itemstack.getOrCreateTag().putString("geckoAnim", "summon");
			if (itemstack.getItem() instanceof HermitPurpleNeroItem)
				itemstack.getOrCreateTag().putString("geckoAnim", "summon");
			if (itemstack.getItem() instanceof HermitPurpleLuckItem)
				itemstack.getOrCreateTag().putString("geckoAnim", "summon");
		}
	}
}
