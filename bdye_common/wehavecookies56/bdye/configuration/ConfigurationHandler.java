package wehavecookies56.bdye.configuration;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import wehavecookies56.bdye.lib.IDs;
import wehavecookies56.bdye.lib.Reference;
import wehavecookies56.bdye.lib.Strings;
import cpw.mods.fml.common.FMLLog;

public class ConfigurationHandler {
    public static Configuration config;

    public static void preConfig(File file){
        config = new Configuration(file);
        
        try{
            config.load();
            
            IDs.WHITE_DYE = config.getItem(Strings.White  + " ID", IDs.WHITE_DYE_DFEAULT).getInt(IDs.WHITE_DYE_DFEAULT);
        }
        catch(Exception e){
            FMLLog.log(Level.SEVERE, e, Reference.MOD_ID + "Has a problem loading the config file");
        }
        finally{
            config.save();
        }
    }
}