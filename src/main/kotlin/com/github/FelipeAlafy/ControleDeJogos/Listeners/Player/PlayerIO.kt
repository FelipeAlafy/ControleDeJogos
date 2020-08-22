package com.github.FelipeAlafy.ControleDeJogos.Listeners.Player

import com.github.FelipeAlafy.ControleDeJogos.ControleDeJogosPlugin
import org.bukkit.Bukkit
import org.bukkit.ChatColor
import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.Action
import org.bukkit.event.entity.PlayerDeathEvent
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.player.PlayerQuitEvent


@Suppress(names = ["unused"])
class PlayerIO : Listener {
    @EventHandler
    fun onPlayerJoinServer(event: PlayerJoinEvent) {
        event.joinMessage = ChatColor.AQUA.toString() + "Seja Bem-Vindo(a) " + ChatColor.RED + "" +
                ChatColor.BOLD + event.player.displayName + ChatColor.RESET + "" + ChatColor.AQUA + "" + " <3"
    }

    @EventHandler
    fun onPlayerLeftServer(event: PlayerQuitEvent) {
        event.quitMessage = ChatColor.RED.toString() + " O(A) " + ChatColor.BOLD +
        event.player.displayName + ChatColor.RESET + "" + ChatColor.RED +  " nos deixou que pena </3"
    }
}