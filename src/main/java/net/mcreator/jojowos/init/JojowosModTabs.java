
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jojowos.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.jojowos.JojowosMod;

public class JojowosModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, JojowosMod.MODID);
	public static final RegistryObject<CreativeModeTab> JO_JO_ITEMS = REGISTRY.register("jo_jo_items",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.jojowos.jo_jo_items")).icon(() -> new ItemStack(JojowosModItems.STAND_ARROW.get())).displayItems((parameters, tabData) -> {
				tabData.accept(JojowosModBlocks.METEORITE_ORE.get().asItem());
				tabData.accept(JojowosModItems.METEORITE_BAR.get());
				tabData.accept(JojowosModItems.STAND_ARROW.get());
				tabData.accept(JojowosModItems.SHINY_ARROW.get());
				tabData.accept(JojowosModItems.CAMERA.get());
				tabData.accept(JojowosModItems.COFFEE_GUM.get());
				tabData.accept(JojowosModItems.ANCIENT_BOW.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> JO_JO_STANDS = REGISTRY.register("jo_jo_stands",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.jojowos.jo_jo_stands")).icon(() -> new ItemStack(JojowosModItems.EMPTY_STAND_DISC.get())).displayItems((parameters, tabData) -> {
				tabData.accept(JojowosModItems.EMPTY_STAND_DISC.get());
				tabData.accept(JojowosModItems.STAR_PLATINUM_DISC.get());
				tabData.accept(JojowosModItems.HIEROPHANT_GREEN_DISC.get());
				tabData.accept(JojowosModItems.MAGICIANS_RED_DISC.get());
				tabData.accept(JojowosModItems.SILVER_CHARIOT_DISC.get());
				tabData.accept(JojowosModItems.HERMIT_PURPLE_DISC.get());
				tabData.accept(JojowosModItems.THE_WORLD_DISC.get());
				tabData.accept(JojowosModItems.THE_FOOL_DISC.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> JO_JO_ARMOR = REGISTRY.register("jo_jo_armor",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.jojowos.jo_jo_armor")).icon(() -> new ItemStack(JojowosModItems.JOTARO_KUJO_P_3_CLOTHES_HELMET.get())).displayItems((parameters, tabData) -> {
				tabData.accept(JojowosModItems.JOTARO_KUJO_P_3_CLOTHES_HELMET.get());
				tabData.accept(JojowosModItems.JOTARO_KUJO_P_3_CLOTHES_CHESTPLATE.get());
				tabData.accept(JojowosModItems.JOTARO_KUJO_P_3_CLOTHES_LEGGINGS.get());
				tabData.accept(JojowosModItems.JOTARO_KUJO_P_3_CLOTHES_BOOTS.get());
				tabData.accept(JojowosModItems.DIO_CLOTHES_HELMET.get());
				tabData.accept(JojowosModItems.DIO_CLOTHES_CHESTPLATE.get());
				tabData.accept(JojowosModItems.DIO_CLOTHES_LEGGINGS.get());
				tabData.accept(JojowosModItems.DIO_CLOTHES_BOOTS.get());
				tabData.accept(JojowosModItems.DIO_CAPE_CHESTPLATE.get());
				tabData.accept(JojowosModItems.RED_CAPE_CHESTPLATE.get());
				tabData.accept(JojowosModItems.DIO_TOP_CHESTPLATE.get());
				tabData.accept(JojowosModItems.OLD_JOSEPH_CLOTHES_HELMET.get());
				tabData.accept(JojowosModItems.OLD_JOSEPH_CLOTHES_CHESTPLATE.get());
				tabData.accept(JojowosModItems.OLD_JOSEPH_CLOTHES_LEGGINGS.get());
				tabData.accept(JojowosModItems.OLD_JOSEPH_CLOTHES_BOOTS.get());
				tabData.accept(JojowosModItems.POLNAREFF_CLOTHES_HELMET.get());
				tabData.accept(JojowosModItems.POLNAREFF_CLOTHES_CHESTPLATE.get());
				tabData.accept(JojowosModItems.POLNAREFF_CLOTHES_LEGGINGS.get());
				tabData.accept(JojowosModItems.POLNAREFF_CLOTHES_BOOTS.get());
				tabData.accept(JojowosModItems.KAKYOIN_CLOTHES_HELMET.get());
				tabData.accept(JojowosModItems.KAKYOIN_CLOTHES_CHESTPLATE.get());
				tabData.accept(JojowosModItems.KAKYOIN_CLOTHES_LEGGINGS.get());
				tabData.accept(JojowosModItems.KAKYOIN_CLOTHES_BOOTS.get());
				tabData.accept(JojowosModItems.AVDOL_CLOTHES_HELMET.get());
				tabData.accept(JojowosModItems.AVDOL_CLOTHES_CHESTPLATE.get());
				tabData.accept(JojowosModItems.AVDOL_CLOTHES_LEGGINGS.get());
				tabData.accept(JojowosModItems.AVDOL_CLOTHES_BOOTS.get());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> JO_JO_MOBS = REGISTRY.register("jo_jo_mobs",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.jojowos.jo_jo_mobs")).icon(() -> new ItemStack(JojowosModItems.JOTARO_KUJO_PART_3_SPAWN_EGG.get())).displayItems((parameters, tabData) -> {
				tabData.accept(JojowosModItems.JOTARO_KUJO_PART_3_SPAWN_EGG.get());
				tabData.accept(JojowosModItems.DIO_CAPED_SPAWN_EGG.get());
				tabData.accept(JojowosModItems.DIO_SPAWN_EGG.get());
				tabData.accept(JojowosModItems.DIO_AWAKENED_SPAWN_EGG.get());
				tabData.accept(JojowosModItems.IGGY_SPAWN_EGG.get());
				tabData.accept(JojowosModItems.OLD_JOSEPH_JOESTAR_SPAWN_EGG.get());
				tabData.accept(JojowosModItems.JEAN_PIERRE_POLNAREFF_SPAWN_EGG.get());
				tabData.accept(JojowosModItems.NORIAKI_KAKYOIN_SPAWN_EGG.get());
				tabData.accept(JojowosModItems.MUHAMMED_AVDOL_SPAWN_EGG.get());
			})

					.build());
}
