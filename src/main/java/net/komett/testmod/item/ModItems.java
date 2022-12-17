package net.komett.testmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.komett.testmod.TestMod;
import net.komett.testmod.item.custom.DieItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    // Items to Register
    public static final Item RAW_UMBRANITE = registerItem("raw_umbranite",
            new Item(new Item.Settings()),
            ModItemGroup.UMBRANITE
    );
    public static final Item UMBRANITE = registerItem("umbranite",
            new Item(new Item.Settings()),
            ModItemGroup.UMBRANITE
    );
    public static final Item DIE = registerItem("die",
            new DieItem(new Item.Settings().maxCount(1)),
            ModItemGroup.UMBRANITE
    );

    // Register Items
    private static Item registerItem(String name, Item item, ItemGroup group) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return Registry.register(Registries.ITEM, new Identifier(TestMod.MOD_ID, name), item);
    }
    public static void registerModItems()
    {
        TestMod.LOGGER.debug("Registering Mod Items for " + TestMod.MOD_ID);
    }
}
