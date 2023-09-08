package com.feliperfdev.study.entendendoasintaxe

open class Pokemon(val name: String, val power: Int, var hp: Int, var exp: Int) {
    open fun battle(pokemon: Pokemon) {
        pokemon.hp -= power
        var result = pokemon.hp - power

        println()
        println("================= STATUS ==================")
        print("$name: HP: $hp | EXP: $exp\n")
        print("${pokemon.name}: HP: ${pokemon.hp} | EXP: ${pokemon.exp}\n\n")
        var resultEXP = (result / 2).toInt()
        exp += resultEXP
        println("${pokemon.name} perdeu $result de HP!")
        println("$name ganhou $resultEXP de EXP! | Total: $exp")
        println("===========================================")
    }
}

class PokemonMegaEvolved(name: String, power: Int, hp: Int, exp: Int, val megastone: String) : Pokemon(name, power, hp, exp) {
    override fun battle(pokemon: Pokemon) {
        pokemon.hp -= (power * 2)
        var result = pokemon.hp - (power * 2)

        println()
        println("================= STATUS ==================")
        print("$name - $megastone: HP: $hp | EXP: $exp\n")
        print("${pokemon.name}: HP: ${pokemon.hp} | EXP: ${pokemon.exp}\n\n")
        var resultEXP = (result / 2).toInt()
        exp += resultEXP
        println("${pokemon.name} perdeu $result de HP!")
        println("$name ganhou $resultEXP de EXP! | Total: $exp")
        println("===========================================")
    }
}

fun main() {

    var infernape = Pokemon("Infernape", 120, 255, 620)
    var gengar = PokemonMegaEvolved("Gengar", 200, 255, 620, "Gengarite")

    infernape.battle(gengar)

    gengar.battle(infernape)

}