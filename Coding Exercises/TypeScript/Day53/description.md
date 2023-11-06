Sum of All Digits - Number Manipulation
Introduction: Every integer is made up of individual digits. For instance, the number 572 consists of the digits 5, 7, and 2. Computing the sum of these digits can be a fundamental task in various mathematical problems and algorithms. This challenge will enhance learners' understanding of number decomposition and arithmetic operations.

STEPS:

Convert the given number to its absolute value to handle negative numbers.

Initialize a sum variable to zero.

Extract the last digit of the number using the modulo operator.

Add this digit to the sum.

Remove the last digit from the number.

Repeat steps 3-5 until the number becomes zero.

Return the sum.

Requirements:

Implement the function sumOfAllDigits(int num).

The function should return an integer.

The function should handle both positive and negative input numbers.

Input:

An integer, num.

Output:

An integer representing the sum of all the digits of num.

Examples:

sumOfAllDigits(123) -> 6
sumOfAllDigits(12345) -> 15
sumOfAllDigits(0) -> 0
sumOfAllDigits(10) -> 1
sumOfAllDigits(-124) -> 7
Constraints:

The input number will be between −109−109 and 109109.

Expected Time Complexity:

O(d)O(d), where dd is the number of digits in the input number.

Expected Auxiliary Space:

O(1)O(1).

Hint:

The modulo operation can be handy to extract the last digit of a number. Division can be used to discard this last digit.

Note:

Negative numbers should be treated the same as positive numbers. For instance, the sum of all digits for -123 and 123 is the same: 6.