package name.juyue.mods.hambugeritem.until;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;

import static name.juyue.mods.hambugeritem.Hambugeritems.*;

public class itemregs {
    public static final String GENERATED = "item/generated" ;




    public static void register(IEventBus modEventBus) {
        ITEMS.register("chocolate_burger", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().alwaysEat().nutrition(6).saturationMod(8f).build())));
        ITEMS.register("chocolate_burger_bottom", () -> new Item(new Item.Properties()));
        ITEMS.register("chocolate_burger_top", () -> new Item(new Item.Properties()));
        ITEMS.register("has_chocolate_burger", () -> new Item(new Item.Properties()));
        ITEMS.register("chicken_nuggets", () -> new Item(new Item.Properties()));
        ITEMS.register("fried_chicken", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().alwaysEat().nutrition(2).saturationMod(3f).build())));
        ITEMS.register("sweetbarryjiangliao", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().alwaysEat().nutrition(2).saturationMod(3f).build())));//sweetbarryjiangliao
    }


}
