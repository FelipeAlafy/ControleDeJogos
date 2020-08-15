package com.github.FelipeAlafy.ControleDeJogos

import com.github.FelipeAlafy.ControleDeJogos.Listeners.PlayerListerner
import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.plugin.java.JavaPlugin

@Suppress("unused")
class ControleDeJogosPlugin: JavaPlugin() {
    override fun onEnable() {
        super.onEnable()
        logger.info("Estamos iniciando o plugin!")
        val player = PlayerListerner()
        server.pluginManager.registerEvents(player, this)
    }

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        return false
    }
}