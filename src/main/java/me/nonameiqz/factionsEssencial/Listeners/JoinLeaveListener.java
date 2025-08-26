package me.nonameiqz.factionsEssencial.Listeners;

import me.nonameiqz.factionsEssencial.FactionsEssencial;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;


public class JoinLeaveListener implements Listener {

    private final FactionsEssencial plugin;

    public JoinLeaveListener(FactionsEssencial plugin) {
        this.plugin = plugin;
    }


    @EventHandler //join event
    public void onPlayerJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();

        String joinMessage = plugin.getConfig().getString("join-message");
        if(joinMessage != null){
            joinMessage = joinMessage.replace("%player%",p.getDisplayName());
            e.setJoinMessage(ChatColor.translateAlternateColorCodes('&',joinMessage));
        }
    }

    @EventHandler //leave event
    public void onPlayerLeave(PlayerQuitEvent e){
        Player p = e.getPlayer();

        String leaveMessage = plugin.getConfig().getString("leave-message");
        if(leaveMessage != null){
            leaveMessage = leaveMessage.replace("%player%",p.getDisplayName());
            e.setQuitMessage(ChatColor.translateAlternateColorCodes('&',leaveMessage));
        }
    }
}
