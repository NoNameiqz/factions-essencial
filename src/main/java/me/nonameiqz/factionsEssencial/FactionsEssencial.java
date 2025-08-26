package me.nonameiqz.factionsEssencial;

import me.nonameiqz.factionsEssencial.Listeners.JoinLeaveListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class FactionsEssencial extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("**---------------------------------**");
        System.out.println("\u001B[32mFactions Essencial\u001B[0m");
        System.out.println("\u001B[32mVersion 1.0 SNAPSHOT\u001B[0m");
        System.out.println("**---------------------------------**");

        //listeners
        getServer().getPluginManager().registerEvents(new JoinLeaveListener(this),this);

        //config
        saveDefaultConfig();
        getConfig().options().copyDefaults(true);
        saveConfig();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("\u001B[32m[FE] Factions Essencial encerrado com sucesso! \u001B[0m");
    }
}
