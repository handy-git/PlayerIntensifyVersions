package com.handy.playerintensify;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * 主类
 *
 * @author handy
 **/
public class PlayerIntensify extends JavaPlugin {
    private static PlayerIntensify INSTANCE;

    @Override
    public void onEnable() {
        INSTANCE = this;
    }

    @Override
    public void onDisable() {
    }

    public static PlayerIntensify getInstance() {
        return INSTANCE;
    }

}