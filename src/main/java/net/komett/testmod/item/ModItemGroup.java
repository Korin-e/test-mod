package net.komett.testmod.item;

import net.komett.testmod.TestMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.item.ItemGroup;

public class ModItemGroup {
    public static final ItemGroup UMBRANITE = FabricItemGroup.builder(new Identifier(TestMod.MOD_ID))
            .displayName(Text.literal("Umbranite"))
            .icon(() -> new ItemStack(ModItems.UMBRANITE))
            .build();
}