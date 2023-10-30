Armstrong Number - Number Manipulations
Introduction: In this challenge, you will implement a function named isArmstrongNumber to check if a given number is an Armstrong number. An Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

Steps:

Define a function isArmstrongNumber which accepts an integer as its argument.

Count the number of digits in the number.

Create a loop to calculate the sum of the cubes of its digits.

Compare the sum with the original number.

If they are the same, the number is an Armstrong number and return true. Otherwise, return false.

Requirements:

The function isArmstrongNumber should be defined in the Exercise class.

The function isArmstrongNumber should return a boolean value depending on whether the input number is an Armstrong number or not.

Input: An integer num.

Output: A boolean value. Returns true if the number is an Armstrong number, false otherwise.

Examples:

Exercise.isArmstrongNumber(153); // Returns true
Exercise.isArmstrongNumber(370); // Returns true
Exercise.isArmstrongNumber(123); // Returns false
Exercise.isArmstrongNumber(0);   // Returns true
Constraints:

num is a non-negative integer (0 ≤ num ≤ 10^6).

Expected Time Complexity: O(d), where d is the number of digits in the number.

Expected Auxiliary Space: O(1), constant space complexity is expected as we're not using extra space proportional to input size.

Hint: Use a loop to extract all digits of the number and calculate the sum of the digits raised to the power of the number of digits.

Note: Even though the number 0 is not usually considered an Armstrong number, for the purpose of this exercise, we will consider it as such because 0 is the sum of the cubes of its own digits (which is 0).

