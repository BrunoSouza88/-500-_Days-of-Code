Power of Number - Mathematical Operations


Introduction: Exponentiation is a mathematical operation, written as bnbn, involving two numbers, the base bb and the exponent nn. When nn is a positive integer, exponentiation corresponds to repeated multiplication of the base: that is, bnbn is the product of multiplying nn bases together. This challenge will help you familiarize yourself with implementing this operation in Java, taking into consideration different edge cases.

STEPS:

Handle edge cases, such as when the base is 0 and the exponent is negative.

Use Java's built-in Math.pow function or implement your own logic to compute the power.

Return the result.

Requirements:

Implement the function power(double base, int exponent).

The function should return a double.

The function should handle scenarios where the base is 0 and the exponent is negative by throwing an IllegalArgumentException.

Input:

A double value representing the base, basebase.

An integer value representing the exponent, exponentexponent.

Output:

A double representing the result of raising the base to the exponent.

Examples:

power(2.0, 3) -> 8.0
power(3.0, 2) -> 9.0
power(5.0, 0) -> 1.0
power(2.0, -2) -> 0.25
Constraints:

basebase will be a double value between −105−105 and 105105.

exponentexponent will be an integer between −105−105 and 105105.

Expected Time Complexity:

O(1)O(1) if using the built-in Math.pow function, but can vary if implementing custom logic.

Expected Auxiliary Space:

O(1)O(1).

Hint:

Consider using Java's built-in Math.pow function for a straightforward solution. However, if implementing custom logic, remember the properties of exponentiation, especially when the exponent is negative.

Note:

While the built-in Math.pow function can handle most cases, always ensure to handle edge cases manually for accurate results.