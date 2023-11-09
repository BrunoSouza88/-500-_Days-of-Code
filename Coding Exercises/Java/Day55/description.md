Identifying Abundant Numbers - Number Theory
Introduction: An abundant number (or excessive number) is a positive integer that is smaller than the sum of its proper divisors, excluding itself. The integer 12 is the first abundant number. Its proper divisors are 1, 2, 3, 4, and 6. Their sum is 16, which is greater than 12. Understanding and identifying such numbers is a fundamental concept in number theory.

STEPS:

Initialize the sum of divisors with 1 since 1 is always a divisor for any positive number.

Traverse through numbers from 2 to the square root of the number, checking for divisors.

If a divisor is found, add both the divisor and its pair (number/divisor) to the sum.

After the loop, compare the sum of divisors to the original number.

Requirements:

Implement the function isAbundant(int num).

The function should return a boolean indicating whether the number is abundant.

The function should throw an IllegalArgumentException if the input number is non-positive.

Input:

A positive integer, numnum.

Output:

A boolean indicating whether the number is an abundant number.

Examples:

isAbundant(12) -> true
isAbundant(15) -> false
isAbundant(18) -> true
isAbundant(28) -> false  // This is a perfect number.
Constraints:

The input number will be between 1 and 105105.

Expected Time Complexity:

O(n)O(n

​), where nn is the input number. This is because we only need to iterate up to the square root of the number to find its divisors.

Expected Auxiliary Space:

O(1)O(1).

Hint:

An efficient way to find divisors of a number is to iterate up to its square root. For every divisor found, there's a paired divisor that can be found by dividing the number by the discovered divisor.

Note:

Be cautious with perfect square numbers. For them, the divisor resulting from the number divided by its square root should be added only once.