Use Same Method Twice - Method Invocation
Introduction: In programming, one of the core principles is DRY (Don't Repeat Yourself). Reusing methods allows for cleaner, more maintainable code. In this challenge, you'll harness the power of method reusability by invoking a method multiple times to achieve a specific task.

STEPS:

Define a method that doubles the value of a given integer.

Define another method that uses the previously defined method twice to quadruple the value of the integer.

Return the result.

Requirements:

Implement the method doubleTheValue(int value).

Implement the method quadrupleTheValue(int value).

The methods should return integers.

Input:

An integer value, value.

Output:

An integer representing the doubled or quadrupled value.

Examples:

doubleTheValue(2) -> 4
doubleTheValue(0) -> 0
doubleTheValue(-3) -> -6
quadrupleTheValue(2) -> 8
quadrupleTheValue(0) -> 0
quadrupleTheValue(-3) -> -12
Constraints:

The input integer will be between −105−105 and 105105.

Expected Time Complexity:

O(1)O(1) for both methods.

Expected Auxiliary Space:

O(1)O(1) for both methods.

Hint:

Focus on the reusability principle. You can achieve the quadrupling effect by doubling the value twice.

Note:

Method reusability enhances code readability and maintainability, reducing the risk of errors.