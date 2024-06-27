package net.mcreator.jojowos.init;

import software.bernie.geckolib.animatable.GeoItem;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.client.renderer.ItemInHandRenderer;
import net.minecraft.client.Minecraft;

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

@Mod.EventBusSubscriber
public class ItemAnimationFactory {
	public static void disableUseAnim(String hand) {
		ItemInHandRenderer renderer = Minecraft.getInstance().gameRenderer.itemInHandRenderer;
		if (renderer != null) {
			if (hand.equals("right")) {
				renderer.mainHandHeight = 1F;
				renderer.oMainHandHeight = 1F;
			}
			if (hand.equals("left")) {
				renderer.offHandHeight = 1F;
				renderer.oOffHandHeight = 1F;
			}
		}
	}

	@SubscribeEvent
	public static void animatedItems(TickEvent.PlayerTickEvent event) {
		String animation = "";
		ItemStack mainhandItem = event.player.getMainHandItem().copy();
		ItemStack offhandItem = event.player.getOffhandItem().copy();
		if (event.phase == TickEvent.Phase.START && (mainhandItem.getItem() instanceof GeoItem || offhandItem.getItem() instanceof GeoItem)) {
			if (mainhandItem.getItem() instanceof HermitPurpleItem animatable) {
				animation = mainhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getMainHandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((HermitPurpleItem) event.player.getMainHandItem().getItem()).animationprocedure = animation;
						disableUseAnim("right");
					}
				}
			}
			if (offhandItem.getItem() instanceof HermitPurpleItem animatable) {
				animation = offhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getOffhandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((HermitPurpleItem) event.player.getOffhandItem().getItem()).animationprocedure = animation;
						disableUseAnim("left");
					}
				}
			}
			if (mainhandItem.getItem() instanceof HermitPurplePart4Item animatable) {
				animation = mainhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getMainHandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((HermitPurplePart4Item) event.player.getMainHandItem().getItem()).animationprocedure = animation;
						disableUseAnim("right");
					}
				}
			}
			if (offhandItem.getItem() instanceof HermitPurplePart4Item animatable) {
				animation = offhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getOffhandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((HermitPurplePart4Item) event.player.getOffhandItem().getItem()).animationprocedure = animation;
						disableUseAnim("left");
					}
				}
			}
			if (mainhandItem.getItem() instanceof HermitPurpleMangaItem animatable) {
				animation = mainhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getMainHandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((HermitPurpleMangaItem) event.player.getMainHandItem().getItem()).animationprocedure = animation;
						disableUseAnim("right");
					}
				}
			}
			if (offhandItem.getItem() instanceof HermitPurpleMangaItem animatable) {
				animation = offhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getOffhandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((HermitPurpleMangaItem) event.player.getOffhandItem().getItem()).animationprocedure = animation;
						disableUseAnim("left");
					}
				}
			}
			if (mainhandItem.getItem() instanceof HermitRedItem animatable) {
				animation = mainhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getMainHandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((HermitRedItem) event.player.getMainHandItem().getItem()).animationprocedure = animation;
						disableUseAnim("right");
					}
				}
			}
			if (offhandItem.getItem() instanceof HermitRedItem animatable) {
				animation = offhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getOffhandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((HermitRedItem) event.player.getOffhandItem().getItem()).animationprocedure = animation;
						disableUseAnim("left");
					}
				}
			}
			if (mainhandItem.getItem() instanceof HermitBlueItem animatable) {
				animation = mainhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getMainHandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((HermitBlueItem) event.player.getMainHandItem().getItem()).animationprocedure = animation;
						disableUseAnim("right");
					}
				}
			}
			if (offhandItem.getItem() instanceof HermitBlueItem animatable) {
				animation = offhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getOffhandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((HermitBlueItem) event.player.getOffhandItem().getItem()).animationprocedure = animation;
						disableUseAnim("left");
					}
				}
			}
			if (mainhandItem.getItem() instanceof HermitGoldItem animatable) {
				animation = mainhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getMainHandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((HermitGoldItem) event.player.getMainHandItem().getItem()).animationprocedure = animation;
						disableUseAnim("right");
					}
				}
			}
			if (offhandItem.getItem() instanceof HermitGoldItem animatable) {
				animation = offhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getOffhandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((HermitGoldItem) event.player.getOffhandItem().getItem()).animationprocedure = animation;
						disableUseAnim("left");
					}
				}
			}
			if (mainhandItem.getItem() instanceof HermitPurpleAutomailItem animatable) {
				animation = mainhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getMainHandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((HermitPurpleAutomailItem) event.player.getMainHandItem().getItem()).animationprocedure = animation;
						disableUseAnim("right");
					}
				}
			}
			if (offhandItem.getItem() instanceof HermitPurpleAutomailItem animatable) {
				animation = offhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getOffhandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((HermitPurpleAutomailItem) event.player.getOffhandItem().getItem()).animationprocedure = animation;
						disableUseAnim("left");
					}
				}
			}
			if (mainhandItem.getItem() instanceof HermitPurpleGiganteItem animatable) {
				animation = mainhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getMainHandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((HermitPurpleGiganteItem) event.player.getMainHandItem().getItem()).animationprocedure = animation;
						disableUseAnim("right");
					}
				}
			}
			if (offhandItem.getItem() instanceof HermitPurpleGiganteItem animatable) {
				animation = offhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getOffhandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((HermitPurpleGiganteItem) event.player.getOffhandItem().getItem()).animationprocedure = animation;
						disableUseAnim("left");
					}
				}
			}
			if (mainhandItem.getItem() instanceof HermitPurpleVenomItem animatable) {
				animation = mainhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getMainHandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((HermitPurpleVenomItem) event.player.getMainHandItem().getItem()).animationprocedure = animation;
						disableUseAnim("right");
					}
				}
			}
			if (offhandItem.getItem() instanceof HermitPurpleVenomItem animatable) {
				animation = offhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getOffhandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((HermitPurpleVenomItem) event.player.getOffhandItem().getItem()).animationprocedure = animation;
						disableUseAnim("left");
					}
				}
			}
			if (mainhandItem.getItem() instanceof HermitPurpleLinkItem animatable) {
				animation = mainhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getMainHandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((HermitPurpleLinkItem) event.player.getMainHandItem().getItem()).animationprocedure = animation;
						disableUseAnim("right");
					}
				}
			}
			if (offhandItem.getItem() instanceof HermitPurpleLinkItem animatable) {
				animation = offhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getOffhandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((HermitPurpleLinkItem) event.player.getOffhandItem().getItem()).animationprocedure = animation;
						disableUseAnim("left");
					}
				}
			}
			if (mainhandItem.getItem() instanceof HermitPurpleNeroItem animatable) {
				animation = mainhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getMainHandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((HermitPurpleNeroItem) event.player.getMainHandItem().getItem()).animationprocedure = animation;
						disableUseAnim("right");
					}
				}
			}
			if (offhandItem.getItem() instanceof HermitPurpleNeroItem animatable) {
				animation = offhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getOffhandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((HermitPurpleNeroItem) event.player.getOffhandItem().getItem()).animationprocedure = animation;
						disableUseAnim("left");
					}
				}
			}
			if (mainhandItem.getItem() instanceof HermitPurpleLuckItem animatable) {
				animation = mainhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getMainHandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((HermitPurpleLuckItem) event.player.getMainHandItem().getItem()).animationprocedure = animation;
						disableUseAnim("right");
					}
				}
			}
			if (offhandItem.getItem() instanceof HermitPurpleLuckItem animatable) {
				animation = offhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getOffhandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((HermitPurpleLuckItem) event.player.getOffhandItem().getItem()).animationprocedure = animation;
						disableUseAnim("left");
					}
				}
			}
		}
	}
}
