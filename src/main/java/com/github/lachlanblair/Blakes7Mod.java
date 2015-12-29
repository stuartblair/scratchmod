package com.github.lachlanblair;

import com.github.lachlanblair.proxy.CommonProxy;
        import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Blakes7Mod.MODID, name = Blakes7Mod.NAME, version = Blakes7Mod.VERSION)
public class Blakes7Mod {
    public static final String MODID = "Blakes7Mod";
    public static final String VERSION = "1.0";
    public static final String NAME = "Blakes7Mod";

    @Mod.Instance
    public static Blakes7Mod instance = new Blakes7Mod();

    @SidedProxy(clientSide="com.github.lachlanblair.proxy.ClientProxy", serverSide="com.github.lachlanblair.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        this.proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        this.proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        this.proxy.postInit(event);
    }


}

