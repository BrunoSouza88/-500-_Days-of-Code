# Body Mass Index Calculation - Arithmetic Operations
## Introduction:

The Body Mass Index (BMI) is a person's weight in kilograms divided by the square of height in meters. It is a simple tool that is often used to estimate the total amount of body fat. In this challenge, you are to write a function that will accept two parameters, weight and height, and compute the BMI.

## Steps:

Input validation: Check if the height and weight are greater than 0. If not, throw an IllegalArgumentException with a relevant error message.

Calculate the BMI: Use the formula weight / (height * height) to calculate the BMI.

Return the result: Return the calculated BMI.

## Requirements:

Function name: calculateBMI

### Parameters: Two double types, weight and height.

### Return: A double type representing the calculated BMI.

#### Input:

Two double values representing weight (in kilograms) and height (in meters).

#### Output:

A single double value representing the calculated BMI.

#### Examples:

Exercise.calculateBMI(70, 1.75); // should return 22.857142857142858
Exercise.calculateBMI(95, 1.75); // should return 31.020408163265305
Exercise.calculateBMI(50, 1.6);  // should return 19.531249999999996
#### Constraints:

The weight must be greater than 0.

The height must be greater than 0.

The weight and height are given as double values.

#### Expected Time Complexity:

O(1) as the calculation takes constant time irrespective of the input values.

#### Expected Auxiliary Space:

O(1) as no extra data structures are used.

#### Hint:

The BMI is calculated by dividing the weight in kilograms by the square of the height in meters. Consider using error handling to ensure valid inputs.

#### Note:

The precision of the output can vary due to the inherent imprecision of floating-point calculations. Your result should be correct up to one decimal place.