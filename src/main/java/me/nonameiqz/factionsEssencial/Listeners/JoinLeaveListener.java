package me.nonameiqz.factionsEssencial.Listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;


public class JoinLeaveListener implements Listener {

    @EventHandler //join event
    public void onPlayerJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();
        e.setJoinMessage(ChatColor.GREEN + "" + ChatColor.BOLD + p.getDisplayName() + "entrou no servidor, bem-vindo!");
    }

    @EventHandler //leave event
    public void onPlayerLeave(PlayerQuitEvent e){
        Player p = e.getPlayer();
        e.setQuitMessage(ChatColor.RED + "" + ChatColor.BOLD + p.getDisplayName() + "saiu do servidor, adeus!");
    }
}
