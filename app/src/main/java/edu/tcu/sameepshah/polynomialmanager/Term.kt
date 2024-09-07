package edu.tcu.sameepshah.polynomialmanager

class Term(val coeff: Int, private val xExponent: Int, private val yExponent: Int, private val zExponent: Int) {

    fun print(): String {
        // Creating a StringBuilder to help create the output for a term
        val output =  StringBuilder()
        // If Coeff < -1 => Then we want to print ex: "- 3"
        if (coeff < -1) {
            output.append("- ${-coeff}")
        } else if ((coeff == -1) and (xExponent == 0) and (yExponent == 0) and (zExponent == 0)) {
            // Edge case where we have coeff = -1 but no exponents, so we need to output the constant -1
            return "-1"
        } else if (coeff == 0){
            // When Coeff = 0 => We need to output nothing
            return ""
        } else if ((coeff == 1) and (xExponent == 0) and (yExponent == 0) and (zExponent == 0)) {
            // Edge case where we have coeff = 1 but no exponents, so we need to output the constant 1
            return "1"
        } else if (coeff > 1){
            // If Coeff > 1 => We need to output ex: "3"
            output.append("$coeff")
        }

        // When exponent = 1 => We do not have to add the exponent in our output
        if (xExponent == 1) {
            output.append("(x)")
        } else if (xExponent != 0 ) {
            output.append("(x^$xExponent)")
        }
        if (yExponent == 1) {
            output.append("(y)")
        } else if (yExponent != 0 ) {
            output.append("(y^$yExponent)")
        }
        if (zExponent == 1) {
            output.append("(z)")
        } else if (zExponent != 0 ) {
            output.append("(z^$zExponent)")
        }
        // Returning the StringBuilder as String
        return output.toString()
    }
}