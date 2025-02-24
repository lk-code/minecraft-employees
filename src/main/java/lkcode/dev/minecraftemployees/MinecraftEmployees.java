package lkcode.dev.minecraftemployees;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(MinecraftEmployees.MODID)
public class MinecraftEmployees {
    public static final String MODID = "minecraftemployees";
    private static final Logger LOGGER = LogUtils.getLogger();

    public MinecraftEmployees(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();

        LOGGER.info("Minecraft Employees mod has been loaded!");
    }
}