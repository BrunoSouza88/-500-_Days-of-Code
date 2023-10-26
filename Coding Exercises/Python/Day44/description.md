Factorial of a Number - Recursion
Introduction: In this challenge, you are tasked with implementing a function named factorial that computes the factorial of a given integer. The factorial of a non-negative integer n is the product of all positive integers less than or equal to n. It is denoted by n!.

Steps:

Define a function factorial that takes an integer n as its argument.

Use a conditional statement to check if n is equal to 0, in which case return 1 because the factorial of 0 is 1.

For all other cases, return n multiplied by the result of the recursive call of factorial function with n-1.

Requirements:

The function factorial should be defined in the Exercise class.

The function factorial should return a long integer representing the factorial of the input number.

Input: A non-negative integer n.

Output: A long integer that represents the factorial of n.

Examples:

Exercise.factorial(0); // Returns 1
Exercise.factorial(5); // Returns 120
Exercise.factorial(10); // Returns 3628800
Constraints:

The input integer n can range from 0 to 20. The factorial of numbers greater than 20 can exceed the limit of a long integer in Java.

Expected Time Complexity: O(n), where n is the input number.

Expected Auxiliary Space: O(n), because of the stack space during recursive calls.

Hint: Use a recursive function to calculate the factorial. A recursive function is a function that calls itself.

Note: The factorial function has a special case: the factorial of 0 is 1.