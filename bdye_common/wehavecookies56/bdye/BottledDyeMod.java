package wehavecookies56.bdye;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import wehavecookies56.bdye.item.AddedItems;
import wehavecookies56.bdye.lib.Reference;

@Mod(name = Reference.MOD_NAME, modid = Reference.MOD_ID, version = Reference.MOD_VER) 

@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class BottledDyeMod {
    
    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
        AddedItems.initItems();
    }
    
    @Init
    public void init(FMLInitializationEvent event) {
        
    }

    @PostInit
    public void postInit(FMLPostInitializationEvent event) {
        
    }

    
    
    
}
