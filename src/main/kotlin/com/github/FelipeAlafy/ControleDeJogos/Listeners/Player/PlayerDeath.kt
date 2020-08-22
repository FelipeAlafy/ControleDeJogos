package com.github.FelipeAlafy.ControleDeJogos.Listeners.Player

import org.bukkit.ChatColor
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.PlayerDeathEvent

class PlayerDeath : Listener {
    @EventHandler
    fun onPlayerDye(event: PlayerDeathEvent) {
        event.deathMessage = ChatColor.RED.toString() + " O(A) " + event.entity.displayName + " morreu! " +
                " Nas cordenadas da sua morte foram em X: " + event.entity.location.blockX + " Y: " + event.entity.location.blockY +
                " Z: " + event.entity.location.blockZ
        event.keepInventory = true
        event.keepLevel = true
    }
}