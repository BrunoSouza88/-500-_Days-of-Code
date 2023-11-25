Join Two Strings - String Manipulation
Introduction: String manipulation is a fundamental aspect of many programming tasks. In this challenge, you will practice one of the basic string operations: concatenation. The objective is to combine two given strings into one continuous string.

STEPS:

Check for null inputs. If either of the strings is null, throw an IllegalArgumentException.

Use the + operator, a built-in feature in Java, to concatenate the two strings.

Return the concatenated result.

Requirements:

Implement the function joinStrings(String str1, String str2).

The function should return a single string.

The function should throw an IllegalArgumentException if either of the input strings is null.

Input:

Two strings, str1 and str2.

Output:

A single string resulting from the concatenation of str1 and str2.

Examples:

joinStrings("Hello, ", "World!") -> "Hello, World!"
joinStrings("Java", "Script") -> "JavaScript"
joinStrings("Open", "AI") -> "OpenAI"
joinStrings("A", "") -> "A"
joinStrings("", "B") -> "B"
Constraints:

Each string will have a length of at least 0 and at most 105105.

The combined length of the two strings will not exceed 105105.

Expected Time Complexity:

O(n)O(n), where nn is the combined length of the two strings.

Expected Auxiliary Space:

O(1)O(1).

Hint:

Java provides a straightforward way to concatenate strings using the + operator. Ensure to handle edge cases such as null inputs.

Note:

Remember that string concatenation in Java creates a new string, as strings are immutable in Java.