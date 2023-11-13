Area of Circle - Geometry Basics
Introduction: A circle is a simple shape in Euclidean geometry. Calculating its area is a fundamental concept in geometry. This challenge focuses on implementing a method to compute the area of a circle given its radius.

STEPS:

Validate the input to ensure the radius is non-negative.

Apply the formula Area=πr2Area=πr2 to calculate the area of the circle, where rr is the radius.

Return the computed area.

Requirements:

Implement the function areaOfCircle(double radius).

The function should return a double.

The function should throw an IllegalArgumentException if the input radius is negative.

Input:

A double value representing the radius of the circle.

Output:

A double value representing the area of the circle.

Examples:

areaOfCircle(5.0) -> 78.54 (rounded to two decimal places)
areaOfCircle(3.0) -> 28.27 (rounded to two decimal places)
areaOfCircle(0.0) -> 0.0
Constraints:

The radius will be between 0 and 106106.

Expected Time Complexity:

O(1)O(1).

Expected Auxiliary Space:

O(1)O(1).

Hint:

Use Java's Math.PI for the value of ππ.

Note:

Area cannot be negative, so ensure the radius is validated.