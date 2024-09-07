# Polynomial Manager

This is a program which manages polynomials in three variables with non-zero integer
coefficients, and non-negative integer exponents.

There are 4 polynomial management operations in this program: 

 1. **INSERT**: Insert a new polynomial into the list. If the insert operation is successful, output the polynomial. The insert operation can fail if there is already a polynomial in the list with the same name. In the case of an insertion failure, display the message "POLYNOMIAL *name* ALREADY INSERTED".
 2. **DELETE**: Delete an existing named polynomial from the list. If the delete operation is successful, display the message "POLYNOMIAL *name* SUCCESSFULLY DELETED". If the named polynomial does not exist, display the message "POLYNOMIAL *name* DOES NOT EXIST".
 3. **SEARCH**: Search for a named polynomial in the list. If it is found in the list, output the polynomial. If the polynomial does not exist, display the message "POLYNOMIAL *name* DOES NOT EXIST".
 4. **QUIT**: This command makes the program exit.

The program consists of four classes:

 1. Term
 2. Polynomial
 3. PolyList
 4. PolyManager
