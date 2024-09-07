package edu.tcu.sameepshah.polynomialmanager

import kotlin.system.exitProcess

class PolyList (private val polynomials: MutableList<Polynomial>) {
    fun insert(name: String, tList: List<String>) {
        // Creating an empty list for terms to create a polynomial
        val termsList: MutableList<Term> = mutableListOf()
        for (element in tList) {
            val tempTerm: Term
            // Splitting the input which looks like "1,2,3,4" to a list to get specific values like coeff, xExponent, etc.
            val splitIndex = element.split(',')
            val tempCoeff = splitIndex[0].toInt()
            val tempX = splitIndex[1].toInt()
            val tempY = splitIndex[2].toInt()
            val tempZ = splitIndex[3].toInt()
            // Creating a term val to add to the termsList
            tempTerm = Term(tempCoeff, tempX, tempY, tempZ)
            termsList.add(tempTerm)
        }
        // Creating the polynomial to be added to the polynomials list
        val tempPoly = Polynomial(name, termsList)
        polynomials.add(tempPoly)
        // Printing the newly created polynomial to the console
        println(tempPoly.print())
    }

    fun delete(name: String) {
        // Deleting a polynomial list value if the name matches the given name
        polynomials.removeIf { it -> it.name == name }
    }

    fun search(name: String) {
        // Printing the polynomial if the name matches the given name (input)
        println(polynomials.find { it -> it.name == name }!!.print())
    }

    fun quit() {
        // Exiting the program with status 0 => Success :)
        exitProcess(0)
    }
}