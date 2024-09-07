package edu.tcu.sameepshah.polynomialmanager

class Polynomial (val name: String, private val terms: List<Term>){

    fun print(): String {
        // Using a StringBuilder to build our output string
        val output = StringBuilder()
        // Adding ex: "A =" to our output
        output.append("$name =")
        // Looping through all the terms in the list
        for (i in terms.indices) {
            // Adding a ' ' right before every term
            output.append(" ")
            if (i == 0){
                // If it is the first term do not add the "+" sign
                output.append(terms[i].print())
            } else {
                // Add plus sign if the coeff > 0
                if (terms[i].coeff > 0) output.append("+ ")
                output.append(terms[i].print())
            }
        }
        // Returning the StringBuilder as String output
        return output.toString().trim()
    }
}