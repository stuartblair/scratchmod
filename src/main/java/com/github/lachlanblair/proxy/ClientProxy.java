package com.github.lachlanblair.proxy;

import com.github.lachlanblair.Blakes7Mod;
import com.github.lachlanblair.entity.EntityMummy;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.LanguageRegistry;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
        EntityRegistry.registerGlobalEntityID(EntityMummy.class, "Mummy", EntityRegistry.findGlobalUniqueEntityId(), 230, 78);
        EntityRegistry.addSpawn(EntityMummy.class, 1, 1, 1000, EnumCreatureType.CREATURE, BiomeGenBase.desert);
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }
}
