Harshad Number - Number Properties
Introduction: A Harshad number (or Niven number) is a positive integer that is divisible by the sum of its digits. For example, 18 is a Harshad number because 1 + 8 = 9, and 18 is divisible by 9. This challenge requires you to determine whether a given positive integer is a Harshad number.

STEPS:

Calculate the sum of digits of the number.

Check if the given number is divisible by the calculated sum of digits.

Return true if divisible, otherwise return false.

Requirements:

Implement the function isHarshadNumber(int n).

The function should return a boolean.

The function should return false for non-positive numbers.

Input:

A positive integer, nn.

Output:

A boolean indicating whether nn is a Harshad number.

Examples:

isHarshadNumber(18) -> true
isHarshadNumber(19) -> false
isHarshadNumber(20) -> true
Constraints:

0≤n≤1090≤n≤109.

Expected Time Complexity:

O(d)O(d), where dd is the number of digits in nn.

Expected Auxiliary Space:

O(1)O(1).

Hint:

Use modulo and division operations to extract individual digits from the number.

Note:

Harshad numbers are also known as Niven numbers.

