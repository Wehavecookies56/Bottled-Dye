package wehavecookies56.bdye.creativetab;

import wehavecookies56.bdye.item.AddedItems;
import wehavecookies56.bdye.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;

public class BDYETAB extends CreativeTabs {
    
    public BDYETAB(int par1, String par2Str) {
        super(par1, par2Str);
        
        
    }
    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex()
    {
        return AddedItems.WhiteDye.itemID;
    }
    public String GetTranslatedTabNameLabel(){
        return Reference.MOD_NAME;
    }

}
