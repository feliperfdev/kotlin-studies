package com.feliperfdev.study.entendendoasintaxe

// If a class can be inherited, we use de key-word 'open' before it
open class Pokemon(val name: String, val power: Int, var hp: Int, var exp: Int) {
    // if a class method can be overrided, we use ´open´ before it
    open fun battle(pokemon: Pokemon) {
        pokemon.hp -= power
        var result = pokemon.hp - power

        println()
        println("================= STATUS ==================")
        print("$name: HP: $hp | EXP: $exp\n")
        print("${pokemon.name}: HP: ${pokemon.hp} | EXP: ${pokemon.exp}\n\n")
        var resultEXP: Int = (result / 2)
        exp += resultEXP
        println("${pokemon.name} perdeu $result de HP!")
        println("$name ganhou $resultEXP de EXP! | Total: $exp")
        println("===========================================")
    }
}

// To inherit some class, we use the notation: class <FirstClass> : <SecondClass(...constructor)>
class PokemonMegaEvolved(name: String, power: Int, hp: Int, exp: Int, private val megastone: String) : Pokemon(name, power, hp, exp) {

    // overrided class methods use the 'override' key-word before
    override fun battle(pokemon: Pokemon) {
        pokemon.hp -= (power * 2)
        var result = pokemon.hp - (power * 2)

        println()
        println("================= STATUS ==================")
        print("$name - $megastone: HP: $hp | EXP: $exp\n")
        print("${pokemon.name}: HP: ${pokemon.hp} | EXP: ${pokemon.exp}\n\n")
        var resultEXP: Int = (result / 2)
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