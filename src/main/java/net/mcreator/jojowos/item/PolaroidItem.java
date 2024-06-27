
package net.mcreator.jojowos.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PolaroidItem extends Item {
	public PolaroidItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}
