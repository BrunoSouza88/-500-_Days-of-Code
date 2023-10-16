Convert Pound to Kilogram - Data Type and Conversion Operations
Introduction: In this challenge, you'll implement a function named poundToKg that converts weight in pounds to kilograms. The function takes a value in pounds and returns its equivalent in kilograms using the formula 1 pound = 0.45359237 kilograms.

Steps:

Define a function poundToKg which accepts a double representing weight in pounds.

Multiply the input value by 0.45359237 (the conversion factor from pounds to kilograms).

Return the resulting value.

Requirements:

The function poundToKg should be defined in the Exercise class.

The function poundToKg should return a double representing the equivalent weight in kilograms.

Input: A double pounds representing the weight in pounds.

Output: A double that represents the equivalent weight in kilograms.

Examples:

Exercise.poundToKg(0); // Returns 0.0
Exercise.poundToKg(1); // Returns 0.45359237
Exercise.poundToKg(10); // Returns 4.5359237
Exercise.poundToKg(100000); // Returns 45359.237
Constraints:

The input value will be a non-negative double.

Expected Time Complexity: O(1), as the conversion is a simple mathematical operation which takes constant time.

Expected Auxiliary Space: O(1), as we're not using extra space proportional to the input size.

Hint: Use the formula to convert pounds to kilograms: 1 pound = 0.45359237 kilograms.

Note: In this exercise, we're assuming that the input will always be a non-negative number. It's always important to check the validity of inputs in real-world applications.