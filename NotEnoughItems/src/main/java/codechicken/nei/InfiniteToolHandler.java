package codechicken.nei;

import codechicken.nei.api.IInfiniteItemHandler;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;

public class InfiniteToolHandler implements IInfiniteItemHandler
{
    @Override
    public void onPickup(ItemStack heldItem) {
        heldItem.setMetadata(0);
    }

    @Override
    public void onPlaceInfinite(ItemStack heldItem) {
        heldItem.setMetadata(-32000);
    }

    @Override
    public void replenishInfiniteStack(InventoryPlayer inv, int slotNo) {
        inv.getStackInSlot(slotNo).setMetadata(-32000);
    }

    @Override
    public boolean canHandleItem(ItemStack stack) {
        return stack.getItem().isDamageable() && stack.getMaxStackSize() == 1;
    }

    @Override
    public boolean isItemInfinite(ItemStack stack) {
        return stack.getMetadata() < -30000;
    }

    @Override
    public ItemStack getInfiniteItem(ItemStack typeStack) {
        return new ItemStack(typeStack.getItem(), 1, -32000);
    }
}
