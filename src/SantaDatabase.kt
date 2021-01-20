/**
 * Created by Sana Eneroth Boukchana
 * Date: 2021-01-15
 * Time: 10:19
 * Project: SantasHierarchy
 * Copyright: MIT
 */
class SantaDatabase {

    var santaList: List<Santa> = listOf(
        Santa("Tomten", listOf("Glader", "Butter")),
        Santa("Glader", listOf("Tröger", "Trötter", "Blyger")),
        Santa("Butter", listOf("Rådjuret", "Nyckelpigan", "Haren", "Räven")),
        Santa("Trötter", listOf("Skumtomten")),
        Santa("Skumtomten", listOf("Dammråttan")),
        Santa("Räven", listOf("Gråsuggan", "Myran")),
        Santa("Myran", listOf("Bladlusen")),
        Santa("Tröger", emptyList()),
        Santa("Blyger", emptyList()),
        Santa("Dammråttan", emptyList()),
        Santa("Rådjuret", emptyList()),
        Santa("Nyckelpigan", emptyList()),
        Santa("Haren", emptyList()),
        Santa("Gråsuggan", emptyList()),
        Santa("Bladlusen", emptyList())
    )

    fun getSantaChain(name: String): List<String> {
        val root = santaList[0]
        return getChain(root, name)
    }

    private fun getChain(santa: Santa, searchName: String): MutableList<String> {

        var santaList = mutableListOf<String>()

        if (santa.name == searchName) {
            santaList.add(santa.name)
            return santaList
        }

        santa.subordinates.forEach { child ->
            val childSanta = this.santaList.find { s -> s.name == child }
            childSanta?.let {
                santaList = getChain(it, searchName)
                if (santaList.isNotEmpty()) {
                    santaList.add(0, santa.name)
                    return santaList
                }
            }
        }

        return santaList
    }
}
