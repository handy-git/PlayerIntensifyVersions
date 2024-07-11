package cn.handyplus.intensify;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * 主类
 *
 * @author handy
 **/
public class PlayerIntensify extends JavaPlugin {
    public static PlayerIntensify INSTANCE;

    @Override
    public void onEnable() {
        INSTANCE = this;
    }

}