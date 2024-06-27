
package net.mcreator.jojowos.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CameraItem extends Item {
	public CameraItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}
