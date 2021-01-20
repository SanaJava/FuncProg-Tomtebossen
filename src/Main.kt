/**
 * Created by Sana Eneroth Boukchana
 * Date: 2021-01-13
 * Time: 12:59
 * Project: SantasHierarchy
 * Copyright: MIT
 */
fun main(){

    print("Vem söker du? \n")
    val stringInput = readLine()!!
    println("Söker efter: $stringInput")

    val searchChart = ListOfHierarchyChart()
    val hierarchy = searchChart.getSantaChain(stringInput)

    println("Organisation:")
    println("----------")
    println(hierarchy)
}

/*fun test() {
    val chart = ListOfHierarchyChart()
    println("---------------- Test data ----------------")
    println("Räven: " + chart.getSantaChain("Räven"))
    println("Myran: " + chart.getSantaChain("Myran"))
    println("Bladlusen: " + chart.getSantaChain("Bladlusen"))
    println("Tröger: " + chart.getSantaChain("Tröger"))
    println("Blyger: " + chart.getSantaChain("Blyger"))
    println("Skumtomten: " + chart.getSantaChain("Skumtomten"))
    println("Rådjuret: " + chart.getSantaChain("Rådjuret"))
}*/
