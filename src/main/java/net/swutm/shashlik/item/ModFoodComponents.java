package net.swutm.shashlik.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    public class ModFoodComponent {
        public static final FoodComponent MEAT = new FoodComponent.Builder().hunger(4).saturationModifier(0.1f).build();
        public static final FoodComponent MEAT1 = new FoodComponent.Builder().hunger(8).saturationModifier(0.4f).build();
        public static final FoodComponent MUSHROOM = new FoodComponent.Builder().hunger(4).saturationModifier(0.1f).build();
        public static final FoodComponent MUSHROOM1 = new FoodComponent.Builder().hunger(8).saturationModifier(0.4f).build();
    }
}
