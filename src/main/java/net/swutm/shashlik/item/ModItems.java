package net.swutm.shashlik.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.swutm.shashlik.shashlik;

public class ModItems {

    public static final Item MEAT = registerItem("meat21",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.ModFoodComponent.MEAT)));

    public static final Item MEAT1 = registerItem("meat1",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.ModFoodComponent.MEAT1)));

    public static final Item MUSHROOM = registerItem("mushroom",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.ModFoodComponent.MUSHROOM)));

    public static final Item MUSHROOM1 = registerItem("mushroom1",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.ModFoodComponent.MUSHROOM1)));

    public static final Item SKEWERS = registerItem("skewers",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));



    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(shashlik.MOD_ID, name), item);
    }

    public static void registerModItems() {
        shashlik.LOGGER.info("1" + shashlik.MOD_ID);
    }

}
