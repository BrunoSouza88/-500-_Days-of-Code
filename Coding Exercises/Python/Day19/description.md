# Palindrome Check - String Verification
## Introduction: A palindrome is a word, number, phrase, or other sequences of characters that reads the same backward as forward, disregarding spaces, punctuation, and capitalization. In this challenge, you are tasked with implementing a function that determines whether a given string is a palindrome.

### Steps:

Define a function isPalindrome that takes a string str as an argument.

Create two pointer variables, start and end. Initialize start to the first index (0) and end to the last index (string length - 1).

If the characters at start and end indexes are not equal, return false.

Increment start by 1 and decrement end by 1.

Repeat steps 3 and 4 until start is greater than or equal to end.

If the function has not returned false during the loop, return true, as the string is a palindrome.

### Requirements:

The function isPalindrome should be defined in the Exercise class.

The function isPalindrome should return a boolean indicating whether the string is a palindrome.

Input: A string str.

Output: A boolean value. True if the string is a palindrome, false otherwise.

#### Examples:

Exercise.isPalindrome("radar"); // Returns true
Exercise.isPalindrome("java"); // Returns false
Exercise.isPalindrome("a"); // Returns true
Constraints:

The string can be empty, contain a single character, or multiple characters.

The string is case-sensitive, "Radar" is not considered a palindrome.

Expected Time Complexity: O(n), where n is the length of the string.

Expected Auxiliary Space: O(1), as the check is done in-place, no extra space is used.

Hint: Use two-pointer technique to traverse from both ends towards the middle of the string. If at any point the characters at both pointers do not match, the string is not a palindrome.

Note: This method is case-sensitive, meaning "Radar" and "radar" would not be considered the same. If you want the method to be case-insensitive, consider converting the entire string to lower case before checking.

Improve proficiency in String operations and understanding of palindromes by writing a method to check if a given string is a palindrome.
