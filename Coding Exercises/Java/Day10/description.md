# Compute Nth Fibonacci Number - Recursion and Memoization
## Introduction: In this challenge, you are tasked with creating a function nthFibonacci that will compute the nth number in the Fibonacci sequence. This challenge introduces the concepts of recursion and memoization in Java, a useful technique for optimizing recursive computations.

### Steps:

Define the function nthFibonacci that takes an integer n as an input.

Initialize a long array memo of size n+1.

Return the result of the helper function fibonacci(n, memo).

In the helper function fibonacci, if n is 0 or 1, return n.

If memo[n] is not yet set (i.e., equals 0), calculate it as the sum of fibonacci(n - 1, memo) and fibonacci(n - 2, memo).

Return memo[n].

Requirements:

The function nthFibonacci should be defined in the Exercise class.

The function nthFibonacci should return a long, the nth Fibonacci number.

Input: An integer n (0 ≤ n ≤ 50).

Output: A long representing the nth Fibonacci number.

### Examples:

Exercise.nthFibonacci(1); // Returns 1
Exercise.nthFibonacci(2); // Returns 1
Exercise.nthFibonacci(8); // Returns 21
Exercise.nthFibonacci(12); // Returns 144
Exercise.nthFibonacci(34); // Returns 5702887
Constraints: The input number n is in the range from 0 to 50.

Expected Time Complexity: O(n), linear time complexity.

Expected Auxiliary Space: O(n), linear space complexity.

#### Hint: Use a helper function fibonacci that employs memoization to store and re-use previously computed values of the Fibonacci sequence.

#### Note: The Fibonacci sequence starts with 0 and 1, and each subsequent number is the sum of the previous two.

Understand and apply the concepts of recursion and memoization to compute the Nth number in the Fibonacci sequence.
