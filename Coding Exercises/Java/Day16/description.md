# Sum of Largest and Smallest Element in an Array - Array Operations
## Introduction:

In this exercise, you are tasked with finding the sum of the largest and smallest elements in an array. This requires understanding of array traversal and basic operations on integers in Java.

### Steps:

Create a function named sumOfExtremes in the Exercise class, which takes an array of integers as input.

Initialize two integer variables, min and max, to Integer.MAX_VALUE and Integer.MIN_VALUE, respectively. These will hold the smallest and largest elements in the array.

Traverse the array. For each number in the array, check if it's smaller than min. If it is, update min. Do a similar check for max.

Once the array is fully traversed, return the sum of min and max.

### Requirements:

The function sumOfExtremes should be defined inside the Exercise class.

This function should return an integer representing the sum of the smallest and largest element in the array.

#### Input:

An integer array, arr.

#### Output:

An integer, which is the sum of the smallest and largest elements in the array.

Examples:

Exercise.sumOfExtremes(new int[]{1, 3, 5, 7, 9});  // Returns 10
Exercise.sumOfExtremes(new int[]{-1, -3, -5, -7, -9}); // Returns -10
Exercise.sumOfExtremes(new int[]{-5, 0, 5, 10}); // Returns 5
Exercise.sumOfExtremes(new int[]{1}); // Returns 2
Constraints:

The array may contain positive or negative integers, and can be of any length, including empty.

If the array contains only one element, that element is both the smallest and the largest element.

Expected Time Complexity:

O(n), where n is the length of the array.

Expected Auxiliary Space:

O(1), as we only need two additional variables to hold the smallest and largest elements.

Hint:

Use a loop to traverse the array and keep updating min and max.

Note:

The values for min and max are initialized to Integer.MAX_VALUE and Integer.MIN_VALUE so that any integer from the array can replace them.

Understand how to traverse an array and identify the smallest and largest elements in Java.
