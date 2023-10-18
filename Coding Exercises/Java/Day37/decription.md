Grade Students - Control Flow Statements
Introduction: In this challenge, you will be implementing a grading system for students based on their scores. You will use control flow statements in Java (if-else) to determine the grade and return it.

Steps:

Define a function gradeStudent which accepts an integer score as its argument.

Use an if-else ladder to decide the grade:

If score is 90 or above, return 'A'

If score is 80 or above (but less than 90), return 'B'

If score is 70 or above (but less than 80), return 'C'

If score is 60 or above (but less than 70), return 'D'

Else, return 'F'

Requirements:

The function gradeStudent should be defined in the Exercise class.

The function gradeStudent should return a character representing the grade of the student.

Input: An integer score representing the score of a student.

Output: A character that represents the grade of the student.

Examples:

Exercise.gradeStudent(95); // Returns 'A'
Exercise.gradeStudent(85); // Returns 'B'
Exercise.gradeStudent(75); // Returns 'C'
Exercise.gradeStudent(65); // Returns 'D'
Exercise.gradeStudent(50); // Returns 'F'
Constraints:

The score will be between 0 and 100, inclusive.

Expected Time Complexity: O(1), as we are just making a few comparisons.

Expected Auxiliary Space: O(1), constant space complexity is expected as we're not using extra space proportional to input size.

Hint: Use an if-else ladder to compare the score with the grading thresholds and return the appropriate grade.

Note: The if-else ladder is a common construct in programming languages to handle multiple conditions. It executes different code blocks based on the first condition that is true.