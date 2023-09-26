# Reverse an Array - Without Using the reverse() Method
## Introduction: In this challenge, you are tasked with implementing a function that reverses an array of integers. The trick? You cannot use the built-in reverse() method. This exercise will help reinforce your understanding of arrays and the techniques used to manipulate them.

### Steps:

Define a function reverseArray that takes an integer array arr as an argument.

Create two pointer variables, start and end. Initialize start to the first index (0) and end to the last index (array length - 1).

Swap the elements at start and end indexes.

Increment start by 1 and decrement end by 1.

Repeat steps 3 and 4 until start is greater than or equal to end.

Return the reversed array.

### Requirements:

The function reverseArray should be defined in the Exercise class.

The function reverseArray should return the array after reversing it.

#### Input: An integer array arr.

#### Output: The reversed integer array.

Examples:

Exercise.reverseArray(new int[]{1, 2, 3, 4, 5}); // Returns [5, 4, 3, 2, 1]
Exercise.reverseArray(new int[]{99}); // Returns [99]
Exercise.reverseArray(new int[]{}); // Returns []
Constraints:

The array can be empty, contain a single element, or multiple elements.

Expected Time Complexity: O(n), where n is the length of the array.

Expected Auxiliary Space: O(1), as the reversing is done in-place, no extra space is used.

#### Hint: The key to solving this challenge is understanding how to use two pointers (one starting at the beginning of the array and the other at the end) to swap elements in place.

#### Note: This method modifies the original array. If you want to keep the original array intact, you would need to create a copy before performing the reverse operation.

Enhance understanding of array manipulation techniques in Java, specifically how to reverse an array without using built-in methods.