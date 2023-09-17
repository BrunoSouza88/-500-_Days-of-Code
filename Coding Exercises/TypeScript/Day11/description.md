# Toggle Case of Characters - String Operations
## Introduction: In this challenge, you are required to create a function toggleCase that will toggle the case of each character in the provided string. This exercise enhances your understanding of string manipulation methods in Java.

### Steps:

Define the function toggleCase that takes a string s as input.

Create a new StringBuilder object, toggledString.

Iterate through each character in the string s.

Check if the current character is lowercase using Character.isLowerCase(), if it is, append the uppercase version of the character to toggledString using Character.toUpperCase().

If the character is not lowercase, it means it's either an uppercase letter or a non-alphabetic character, in that case, append the lowercase version of the character to toggledString using Character.toLowerCase().

After iterating through all the characters, return the string representation of toggledString.

### Requirements:

The function toggleCase should be defined in the Exercise class.

The function toggleCase should return a String, the input string with the case of each character toggled.

Input: A string s (0 ≤ s.length ≤ 1000).

Output: A string, the input string s with the case of each character toggled.

### Examples:

Exercise.toggleCase("hello"); // Returns "HELLO"
Exercise.toggleCase("WORLD"); // Returns "world"
Exercise.toggleCase("Hello World"); // Returns "hELLO wORLD"
Exercise.toggleCase(""); // Returns ""
Constraints: The input string s will contain only ASCII characters and its length will be in the range from 0 to 1000.

Expected Time Complexity: O(n), where n is the length of the input string.

Expected Auxiliary Space: O(n), where n is the length of the input string.

#### Hint: Utilize the Character.isLowerCase(), Character.toUpperCase(), and Character.toLowerCase() methods in Java for this task.

#### Note: In the case of non-alphabetic characters, the Character.toLowerCase() method will return the character itself.
Understand and implement string manipulation methods in Java to toggle the case of each character in a string.