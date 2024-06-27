
package net.mcreator.jojowos.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MeteoriteBarItem extends Item {
	public MeteoriteBarItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
