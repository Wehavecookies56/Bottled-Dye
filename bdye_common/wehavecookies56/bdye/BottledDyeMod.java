package wehavecookies56.bdye;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;
import wehavecookies56.bdye.item.AddedItems;
import wehavecookies56.bdye.lib.Reference;
import wehavecookies56.bdye.creativetab.BDYETAB;

@Mod(name = Reference.MOD_NAME, modid = Reference.MOD_ID, version = Reference.MOD_VER) 

@NetworkMod(clientSideRequired = true, serverSideRequired = false)



public class BottledDyeMod {
    
    public static CreativeTabs BDYETAB = new BDYETAB(CreativeTabs.getNextID(), "BDYETAB");
    
    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
        AddedItems.initItems();
        LanguageRegistry.instance().addStringLocalization("itemGroup.BDYETAB", "en_US", Reference.MOD_NAME);
    }
    
    @Init
    public void init(FMLInitializationEvent event) {
        
    }

    @PostInit
    public void postInit(FMLPostInitializationEvent event) {
        
    }

    
    
    
}
