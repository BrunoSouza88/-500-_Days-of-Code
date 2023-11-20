Self-Dividing Number - Number Manipulation
Introduction: A self-dividing number is a number that is divisible by every digit it contains. For instance, 128 is a self-dividing number because 128 is divisible by 1, 2, and 8. The challenge is to identify whether a given number is a self-dividing number or not.

STEPS:

Check if the number is 0. If so, return false since 0 is not a self-dividing number.

Loop through each digit of the number.

For each digit, check if it is 0 or if the number is not divisible by this digit. If either is true, return false.

If none of the digits violates the self-dividing property, return true after the loop.

Requirements:

Implement the function isSelfDividing(int number).

The function should return a boolean value.

Input:

An integer, number.

Output:

A boolean indicating whether the number is a self-dividing number.

Examples:

isSelfDividing(128) -> true
isSelfDividing(22) -> true
isSelfDividing(102) -> false
isSelfDividing(0) -> false
Constraints:

The number will be between −109−109 and 109109.

Expected Time Complexity:

O(d)O(d), where dd is the number of digits in the number.

Expected Auxiliary Space:

O(1)O(1).

Hint:

Consider using the modulo operation to extract digits from the number.

Note:

A self-dividing number should not contain the digit 0.