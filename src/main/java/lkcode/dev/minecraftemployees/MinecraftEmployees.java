package lkcode.dev.minecraftemployees;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MinecraftEmployees.MODID)
public class MinecraftEmployees {
    public static final String MODID = "minecraftemployees";
    private static final Logger LOGGER = LogUtils.getLogger();

    public MinecraftEmployees() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        // Hier kannst du Event-Registrierungen vornehmen und deine NPCs initialisieren.
        System.out.println("Minecraft Employees mod has been loaded!");
    }
}