package com.github.FelipeAlafy.ControleDeJogos

import com.github.FelipeAlafy.ControleDeJogos.Listeners.Player.PlayerIO
import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.event.player.PlayerEvent
import org.bukkit.plugin.java.JavaPlugin
import com.github.FelipeAlafy.ControleDeJogos.Listeners.Player.PlayerDeath
import com.github.FelipeAlafy.ControleDeJogos.Recipes.RottenFleshToLeather

@Suppress("unused")
class ControleDeJogosPlugin: JavaPlugin() {
    override fun onEnable() {
        super.onEnable()
        logger.info("Estamos iniciando o plugin!")
        logger.info("Carregando eventos de player.")
        server.pluginManager.registerEvents(PlayerIO(), this)
        server.pluginManager.registerEvents(PlayerDeath(), this)
        logger.info("Carregando recipes modificadas")
        val rottenFleshToLeather = RottenFleshToLeather()
        server.addRecipe(rottenFleshToLeather.RottenFleshToLeather())
    }

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        return false
    }
}