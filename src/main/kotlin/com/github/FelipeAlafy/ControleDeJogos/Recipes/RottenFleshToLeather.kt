package com.github.FelipeAlafy.ControleDeJogos.Recipes

import org.bukkit.Bukkit.getServer
import org.bukkit.Material
import org.bukkit.inventory.FurnaceRecipe
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.ShapedRecipe

@Suppress("DEPRECATION")
class RottenFleshToLeather {
    fun RottenFleshToLeather(): FurnaceRecipe {
        val result = ItemStack(Material.LEATHER)
        val recipe = FurnaceRecipe(result, Material.ROTTEN_FLESH)
        recipe.experience = 1.0f
        return recipe
    }
}