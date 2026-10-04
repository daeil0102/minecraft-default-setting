package net.teujaem.minecraftdefaultsetting;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    private static Main instance;

    @Override
    public void onEnable() {
        instance = this;
        getLogger().info("minecraft-default-setting enabled");
    }

    @Override
    public void onDisable() {
        instance = null;
    }

    public static Main getInstance() { return instance; }
}
