Numbers Except Multiple of 8 - Control Structures and Loops
Introduction: In this challenge, you will implement a function named filterMultiplesOfEight that filters out all the multiples of 8 from a given integer array. You will use the stream operations and lambda functions provided in Java to achieve this.

Steps:

Define a function filterMultiplesOfEight which accepts an integer array as its argument.

Use the stream method to convert the array into a Stream.

Use the filter method with a lambda function to filter out numbers that are not multiples of 8.

Use the toArray method to collect the filtered elements back into an array.

Return the resulting array.

Requirements:

The function filterMultiplesOfEight should be defined in the Exercise class.

The function filterMultiplesOfEight should return an array of integers representing the elements from the original array that are not multiples of 8.

Input: An integer array arr.

Output: An integer array that contains the elements from the original array which are not multiples of 8.

Examples:

Exercise.filterMultiplesOfEight(new int[]{8, 16, 5, 24, 3, 7}); // Returns [5, 3, 7]
Exercise.filterMultiplesOfEight(new int[]{1, 2, 3}); // Returns [1, 2, 3]
Exercise.filterMultiplesOfEight(new int[]{8, 16, 24, 32}); // Returns []
Exercise.filterMultiplesOfEight(new int[]{}); // Returns []
Constraints:

The array length can be 0 to 10^6.

Each array element is an integer which can be negative, zero, or positive.

Expected Time Complexity: O(n), where n is the length of the array.

Expected Auxiliary Space: O(n), an additional space for the resultant array is used.

Hint: Make use of Java Streams and lambda functions to filter out multiples of 8 in the array.

Note: In Java, you can determine if a number is a multiple of another by using the modulus operator. If num % 8 is 0, then num is a multiple of 8.