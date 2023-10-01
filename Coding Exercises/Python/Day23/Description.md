# Convert Kilometers to Miles - Basic Operations
## Introduction: In this challenge, you are tasked with converting kilometers to miles. You will implement a static method that performs this conversion using a given constant conversion factor. This challenge will help you practice basic arithmetic operations, working with constants, and implementing methods in Java.

### Steps:

Declare a private static final variable MILES_IN_A_KILOMETER and set its value to the conversion factor 0.621371.

Implement a public static method kilometersToMiles that takes a double representing the number of kilometers as an argument.

In the kilometersToMiles method, multiply the input kilometers by MILES_IN_A_KILOMETER and return the result.

### Requirements:

The Exercise class should contain a private static final variable MILES_IN_A_KILOMETER.

The Exercise class should contain a public static method kilometersToMiles.

The kilometersToMiles method should take a double as an argument and return a double.

#### Input: A double representing the number of kilometers.

#### Output: A double representing the equivalent number of miles.

Examples:

Exercise.kilometersToMiles(10); // Returns 6.21371
Constraints: The input can be any double, including negative values and zero.

Expected Time Complexity: O(1), as we are performing a single multiplication operation.

Expected Auxiliary Space: O(1), as we are not using any additional space for this operation.

Hint: To solve this problem, define a constant for the conversion factor and a method that uses this constant to convert kilometers to miles.

Note: This exercise assumes that 1 kilometer is equal to 0.621371 miles.