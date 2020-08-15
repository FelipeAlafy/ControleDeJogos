package com.github.FelipeAlafy.ControleDeJogos.Listeners

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
class PlayerListerner : Listener {
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

    @EventHandler
    fun onPlayerDye(event: PlayerDeathEvent) {
        event.deathMessage = ChatColor.RED.toString() + " O(A) " + event.entity.displayName + " morreu de novo VISH KK 3" +
                " As cordenadas da sua morte foram em X: " + event.entity.location.blockX + " Y: " + event.entity.location.blockY +
                " Z: " + event.entity.location.blockZ
    }
}