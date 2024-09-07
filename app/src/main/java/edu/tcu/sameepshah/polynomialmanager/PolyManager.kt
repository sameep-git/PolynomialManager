package edu.tcu.sameepshah.polynomialmanager

class PolyManager {
    // Declaring a list to create a PolyList instance
    private var pList : MutableList<Polynomial> = mutableListOf()
    private var p: PolyList = PolyList(pList)
    // Creating a list for storing names of polynomials
    private var names: MutableList<String> = mutableListOf()
    fun work() {
        // Reading input constantly from the user
        var inputLine: String
        while (true) {
            // Reading a line of input
            inputLine = readln()
            // Splitting the input with ' ' delimiter
            val splitInput = inputLine.split(' ')
            // Checking what the operation is using [0] index of splitInput
            if (splitInput[0] == "INSERT") {
                // Checking if the polynomial name is already used or not
                if (splitInput[1] !in names) {
                    p.insert(splitInput[1], splitInput.slice(2..<splitInput.size))
                    names.add(splitInput[1])
                } else {
                    println("POLYNOMIAL ${splitInput[1]} ALREADY INSERTED")
                }
            } else if (splitInput[0] == "DELETE") {
                // Calling the delete function accordingly
                if (splitInput[1] in names) {
                    println("POLYNOMIAL ${splitInput[1]} SUCCESSFULLY DELETED")
                    names.remove(splitInput[1])
                    p.delete(splitInput[1])
                } else {
                    println("POLYNOMIAL ${splitInput[1]} DOES NOT EXIST")
                }
            } else if (splitInput[0] == "SEARCH") {
                // Calling the search function accordingly
                if (splitInput[1] in names) {
                    p.search(splitInput[1])
                } else {
                    println("POLYNOMIAL ${splitInput[1]} DOES NOT EXIST")
                }
            } else if (splitInput[0] == "QUIT") {
                // Calling the quit function
                p.quit()
            }
        }
    }
}

fun main() {
    // Creating a PolyManager instance
    val myManager = PolyManager()
    // Running the main function work for myManager
    myManager.work()
}