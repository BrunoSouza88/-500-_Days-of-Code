Reverse a Number - Number Manipulation
Introduction: Numbers are more than just quantities; they're sequences of digits. In this challenge, learners will delve into the world of number manipulation by reversing the digits of a given integer. This task is fundamental in many algorithmic problems and will enhance the learner's understanding of basic arithmetic operations in programming.

STEPS:

Initialize a variable, reversed, to store the reversed number. Set it to 0.

Loop through the number while it's not zero.

For each iteration, extract the last digit of the number.

Update the reversed number by multiplying it by 10 and adding the extracted digit.

Remove the last digit from the original number.

Return the reversed number after the loop completes.

Requirements:

Implement the function reverseNumber(int num).

The function should return an integer.

The function should be able to handle both positive and negative integers.

Input:

An integer, numnum.

Output:

An integer representing the number obtained by reversing the digits of numnum.

Examples:

reverseNumber(12345) -> 54321
reverseNumber(-12345) -> -54321
reverseNumber(100) -> 1
reverseNumber(-100) -> -1
Constraints:

numnum will be an integer between −109−109 and 109109.

Expected Time Complexity:

O(d)O(d), where dd is the number of digits in the number.

Expected Auxiliary Space:

O(1)O(1).

Hint:

Use modulo and division operations to extract digits from the number and construct the reversed number.

Note:

Be cautious about numbers that end in zero. Reversing such numbers will lead to a different result due to the removal of the trailing zero(s).
