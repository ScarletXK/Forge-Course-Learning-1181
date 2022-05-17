package com.shadow.zero.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab COURSE_TAB = new CreativeModeTab("coursemodtab") {
        @Override
        public ItemStack makeIcon() {
            //display image for the tab
            return new ItemStack(ModItems.COBALT_INGOT.get());
        }
    };
}
