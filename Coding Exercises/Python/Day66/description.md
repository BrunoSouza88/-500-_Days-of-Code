Find Longer String - String Comparison
Introduction: Strings are among the most widely used data types in programming. Being able to compare them based on certain criteria is crucial. In this challenge, you'll focus on comparing two strings based on their lengths to determine which one is longer.

STEPS:

Check if either of the two strings is null. If yes, throw an IllegalArgumentException.

Compare the lengths of the two strings.

Return the string with the longer length.

If both strings have the same length, return a message indicating that they are of equal length.

Requirements:

Implement the function findLongerString(String str1, String str2).

The function should return a string.

The function should throw an IllegalArgumentException if any of the input strings is null.

Input:

Two strings, str1str1 and str2str2.

Output:

A string representing the longer of the two strings or a message indicating that both strings have the same length.

Examples:

findLongerString("apple", "pie") -> "apple"
findLongerString("banana", "ban") -> "banana"
findLongerString("apple", "peach") -> "Both strings are of equal length"
findLongerString("code", "programming") -> "programming"
Constraints:

The strings will have a length of at least 1 and at most 105105.

Strings might contain spaces, numbers, and special characters.

Expected Time Complexity:

O(1)O(1) (as we are only comparing lengths and not actually traversing the strings).

Expected Auxiliary Space:

O(1)O(1).

Hint:

Use the .length() method provided by the String class in Java to get the length of a string and compare these lengths to determine the longer string.

Note:

Always check for edge cases like null strings before processing the main logic.

