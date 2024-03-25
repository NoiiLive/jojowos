
package net.mcreator.jojowos.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import net.mcreator.jojowos.procedures.ShinyArrowUsedProcedure;

import java.util.List;

public class LegendaryArrowItem extends Item {
	public LegendaryArrowItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A7c\u00A7oAwakens \u00A77\u00A7oyour fighting spirit."));
		list.add(Component.literal("\u00A78\u00A7oHigher Chance for a Legendary Stand Skin."));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ShinyArrowUsedProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, ar.getObject());
		return ar;
	}
}
