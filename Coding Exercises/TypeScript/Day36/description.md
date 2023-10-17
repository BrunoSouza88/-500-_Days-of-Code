Grade Evaluation - Conditional Logic
Introduction: In this challenge, you will implement a function called evaluateGrade that takes an integer score as input and returns a string based on the following rules:

If the score is less than 0 or more than 100, return "Invalid".

If the score is less than 40, return "Fail".

If the score is 40 or more, return "Pass".

You will apply your understanding of conditional logic in Java to solve this challenge.

Steps:

Define a function evaluateGrade which accepts an integer score as its argument.

Use conditional (if-else) statements to categorize the input score.

Return the respective string based on the score category.

Requirements:

The function evaluateGrade should be defined in the Exercise class.

The function evaluateGrade should return a string: "Pass", "Fail", or "Invalid".

Input: An integer marks.

Output: A string that represents the grade category ("Pass", "Fail", or "Invalid").

Examples:

Exercise.evaluateGrade(70); // Returns "Pass"
Exercise.evaluateGrade(35); // Returns "Fail"
Exercise.evaluateGrade(101); // Returns "Invalid"
Exercise.evaluateGrade(-1); // Returns "Invalid"
Exercise.evaluateGrade(100); // Returns "Pass"
Exercise.evaluateGrade(0); // Returns "Fail"
Constraints:

The input marks can range from -10^3 to 10^3.

Expected Time Complexity: O(1), constant time complexity as there is no iteration or recursion.

Expected Auxiliary Space: O(1), constant space complexity as there is no use of space that grows with the input size.

Hint: Use the if-else conditional statements to check for each category.

Note: The grade categories are mutually exclusive, i.e., a grade cannot be both "Pass" and "Fail", or "Pass" and "Invalid", or "Fail" and "Invalid". This is why if-else statements can be used to check the conditions in sequence.