Check Leap Year - Date and Time Operations
Introduction: In this challenge, you will be implementing a function named isLeapYear that checks if a given year is a leap year or not. A leap year is exactly divisible by 4 except for century years (years ending with 00). The century year is a leap year only if it is perfectly divisible by 400.

Steps:

Define a function isLeapYear which accepts an integer year as its argument.

Check if the year is not divisible by 4, if true, then it is not a leap year so return false.

If the year is divisible by 100, it is a century year. Check if it's divisible by 400, if not, return false.

If none of the above conditions are met, return true as it's a leap year.

Requirements:

The function isLeapYear should be defined in the Exercise class.

The function isLeapYear should return a boolean indicating if the input year is a leap year.

Input: An integer year.

Output: A boolean that indicates whether the given year is a leap year.

Examples:

Exercise.isLeapYear(2000); // Returns true
Exercise.isLeapYear(2019); // Returns false
Exercise.isLeapYear(2020); // Returns true
Exercise.isLeapYear(2100); // Returns false
Constraints: The year is a positive integer ranging from 1 to 10^6.

Expected Time Complexity: O(1), as we're just performing a fixed number of computations.

Expected Auxiliary Space: O(1), as we're not using any extra space.

Hint: The rules for leap year are as follows: A year is a leap year if it is divisible by 4, except for end-of-century years, which must be divisible by 400. This means that the year 2000 was a leap year, although 1900 was not.

Note: The Gregorian calendar, which is the calendar most widely used today, has a more refined rule for calculation of leap years to keep the calendar year synchronized with the solar year.