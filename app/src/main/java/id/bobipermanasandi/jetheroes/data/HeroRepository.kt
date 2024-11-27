package id.bobipermanasandi.jetheroes.data

import id.bobipermanasandi.jetheroes.model.Hero
import id.bobipermanasandi.jetheroes.model.HeroesData

class HeroRepository {
    fun getHeroes(): List<Hero> {
        return HeroesData.heroes
    }
    fun searchHeroes(query: String): List<Hero>{
        return HeroesData.heroes.filter {
            it.name.contains(query, ignoreCase = true)
        }
    }
}