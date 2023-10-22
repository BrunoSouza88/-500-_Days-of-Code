Repeat a Sentence - String Operations
Introduction: In this challenge, you will create a function named repeatSentence that returns a given sentence repeated three times. You'll learn to use string concatenation and loops to manipulate strings in Java.

Steps:

Define a function repeatSentence that accepts a string sentence as its argument.

Initialize an empty string result.

Use a for loop to append the sentence to the result three times.

Return result after trimming any extra spaces at the end.

Requirements:

The function repeatSentence should be defined in the Exercise class.

The function repeatSentence should return a string which is the sentence repeated three times, separated by spaces.

Input: A string sentence.

Output: A string that represents the sentence repeated three times, separated by spaces.

Examples:

Exercise.repeatSentence("Hello World!"); // Returns "Hello World! Hello World! Hello World!"
Exercise.repeatSentence(""); // Returns ""
Exercise.repeatSentence("Java"); // Returns "Java Java Java"
Exercise.repeatSentence("123"); // Returns "123 123 123"
Constraints:

The string length can be 0 to 10^3.

Expected Time Complexity: O(n), where n is the length of the string.

Expected Auxiliary Space: O(n), as we are creating a new string that can be up to three times the length of the input string.

Hint: Use string concatenation within a loop to repeat the sentence three times.

Note: In Java, "+" operator can be used for string concatenation, and string's trim method can be used to remove leading and trailing spaces.