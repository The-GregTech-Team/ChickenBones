package codechicken.nei.guihook;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Slot;

public interface IContainerSlotClickHandler
{
    void beforeSlotClick(GuiContainer gui, int slotIndex, int button, Slot slot, int modifier);
    boolean handleSlotClick(GuiContainer gui, int slotIndex, int button, Slot slot, int modifier, boolean eventconsumed);
    void afterSlotClick(GuiContainer gui, int slotIndex, int button, Slot slot, int modifier);
}
