package me.will.scythe.item;

import me.will.scythe.Scythe;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Scythe.MODID);
    public static final RegistryObject<CreativeModeTab> scythe_tab =
            CREATIVE_MODE_TABS.register("scythe_tab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.scythe_item.get()))
                    .title(Component.translatable("creativetab.scythe_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.scythe_item.get());
                        pOutput.accept(ModItems.rose_gold.get());
                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
