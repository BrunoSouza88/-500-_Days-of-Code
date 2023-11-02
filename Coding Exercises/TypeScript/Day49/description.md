Count Number of Digits - Mathematical Operations
Introduction: In this challenge, you are asked to implement a function named countNumberOfDigits that accepts an integer and returns the count of digits in that integer. This involves understanding mathematical operations and string conversions.

Steps:

Define a function named countNumberOfDigits that takes an integer as an argument.

If the number is zero, return 1 because zero is considered a digit.

Initialize a counter variable to 0. This will hold the count of digits in the number.

Set up a while loop that runs as long as the number is not zero.

In each iteration, divide the number by 10 (removing the last digit) and increment the counter.

After the loop ends, return the counter as the result.

Requirements:

The function countNumberOfDigits should be defined inside the Exercise class.

The function countNumberOfDigits should take an integer as an argument and return an integer representing the count of digits.

Input: An integer num.

Output: An integer representing the count of digits in the given number.

Examples:

Exercise.countNumberOfDigits(3); // Returns 1
Exercise.countNumberOfDigits(13); // Returns 2
Exercise.countNumberOfDigits(12345); // Returns 5
Exercise.countNumberOfDigits(0); // Returns 1
Constraints:

The number can range from 0 to 10^9.

Expected Time Complexity: O(log(n)), where n is the number. Since we're dividing the number by 10 in each step, it's a logarithmic operation.

Expected Auxiliary Space: O(1), as we're not using extra space proportional to the input size.

Hint: Use a while loop to keep dividing the number by 10 until it becomes zero. Keep a count of the number of times you perform this operation.

Note: In the case of 0, even though there's no digit to the left or right, 0 is considered a single digit number.