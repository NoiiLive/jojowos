package net.mcreator.jojowos.init;

import software.bernie.geckolib.animatable.GeoItem;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.client.renderer.ItemInHandRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.jojowos.item.HermitRedItem;
import net.mcreator.jojowos.item.HermitPurplePart4Item;
import net.mcreator.jojowos.item.HermitPurpleMangaItem;
import net.mcreator.jojowos.item.HermitPurpleItem;
import net.mcreator.jojowos.item.HermitPurpleAutomailItem;
import net.mcreator.jojowos.item.HermitGoldItem;
import net.mcreator.jojowos.item.HermitBlueItem;

@Mod.EventBusSubscriber
public class ItemAnimationFactory {
	public static void disableUseAnim() {
		try {
			ItemInHandRenderer renderer = Minecraft.getInstance().gameRenderer.itemInHandRenderer;
			if (renderer != null) {
				renderer.mainHandHeight = 1F;
				renderer.oMainHandHeight = 1F;
				renderer.offHandHeight = 1F;
				renderer.oOffHandHeight = 1F;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SubscribeEvent
	public static void animatedItems(TickEvent.PlayerTickEvent event) {
		String animation = "";
		if (event.phase == TickEvent.Phase.START && (event.player.getMainHandItem().getItem() instanceof GeoItem || event.player.getOffhandItem().getItem() instanceof GeoItem)) {
			if (!event.player.getMainHandItem().getOrCreateTag().getString("geckoAnim").equals("") && !(event.player.getMainHandItem().getItem() instanceof ArmorItem)) {
				animation = event.player.getMainHandItem().getOrCreateTag().getString("geckoAnim");
				event.player.getMainHandItem().getOrCreateTag().putString("geckoAnim", "");
				if (event.player.getMainHandItem().getItem() instanceof HermitPurpleItem animatable)
					if (event.player.level().isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getMainHandItem().getItem() instanceof HermitPurplePart4Item animatable)
					if (event.player.level().isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getMainHandItem().getItem() instanceof HermitPurpleMangaItem animatable)
					if (event.player.level().isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getMainHandItem().getItem() instanceof HermitRedItem animatable)
					if (event.player.level().isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getMainHandItem().getItem() instanceof HermitBlueItem animatable)
					if (event.player.level().isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getMainHandItem().getItem() instanceof HermitGoldItem animatable)
					if (event.player.level().isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getMainHandItem().getItem() instanceof HermitPurpleAutomailItem animatable)
					if (event.player.level().isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
			}
			if (!event.player.getOffhandItem().getOrCreateTag().getString("geckoAnim").equals("") && !(event.player.getOffhandItem().getItem() instanceof ArmorItem)) {
				animation = event.player.getOffhandItem().getOrCreateTag().getString("geckoAnim");
				event.player.getOffhandItem().getOrCreateTag().putString("geckoAnim", "");
				if (event.player.getOffhandItem().getItem() instanceof HermitPurpleItem animatable)
					if (event.player.level().isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getOffhandItem().getItem() instanceof HermitPurplePart4Item animatable)
					if (event.player.level().isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getOffhandItem().getItem() instanceof HermitPurpleMangaItem animatable)
					if (event.player.level().isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getOffhandItem().getItem() instanceof HermitRedItem animatable)
					if (event.player.level().isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getOffhandItem().getItem() instanceof HermitBlueItem animatable)
					if (event.player.level().isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getOffhandItem().getItem() instanceof HermitGoldItem animatable)
					if (event.player.level().isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
				if (event.player.getOffhandItem().getItem() instanceof HermitPurpleAutomailItem animatable)
					if (event.player.level().isClientSide()) {
						animatable.animationprocedure = animation;
						disableUseAnim();
					}
			}
		}
	}
}
