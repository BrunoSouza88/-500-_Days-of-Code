Palindrome Number - Number Operations
Introduction: A palindrome is a word, phrase, number, or other sequences of characters that reads the same forward and backward (ignoring spaces, punctuation, and capitalization). In this challenge, we focus on palindrome numbers. A palindrome number is a number that remains the same when its digits are reversed.

STEPS:

Check if the number is negative. Negative numbers are not considered palindromes.

Store the original number to compare later.

Reverse the number by iterating through its digits.

Compare the reversed number with the original. If they match, it's a palindrome.

Requirements:

Implement the function isPalindrome(int number).

The function should return a boolean value (true if the number is a palindrome, false otherwise).

Input:

An integer, number.

Output:

A boolean value indicating if the given number is a palindrome.

Examples:

isPalindrome(121) -> true
isPalindrome(-121) -> false
isPalindrome(10) -> false
isPalindrome(1221) -> true
Constraints:

−231≤number≤231−1−231≤number≤231−1

Expected Time Complexity:

O(d)O(d), where dd is the number of digits in the number.

Expected Auxiliary Space:

O(1)O(1).

Hint:

Consider reversing the digits of the number and then comparing with the original number.

Note:

Negative numbers are not considered palindromes due to the negative sign.