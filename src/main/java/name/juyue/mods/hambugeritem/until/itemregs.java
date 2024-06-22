package name.juyue.mods.hambugeritem.until;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static name.juyue.mods.hambugeritem.Hambugeritems.*;

public class itemregs {
    public static final String GENERATED = "item/ generated" ;



    public static final RegistryObject<Item> registerItems(IEventBus modEventBus) {
            ITEMS.register("chocolate_burger", () -> new Item(new Item.Properties()));
            ITEMS.register("chocolate_burger_bottom", () -> new Item(new Item.Properties()));
            ITEMS.register("chocolate_burger_top", () -> new Item(new Item.Properties()));

        return null;
    }

}
