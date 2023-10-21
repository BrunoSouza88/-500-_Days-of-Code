Sum of Natural Numbers - Iteration and Recursion
Introduction: In this challenge, you will implement two methods to calculate the sum of natural numbers up to a given number. One method iterativeSum will use iteration (a for loop), while the other method recursiveSum will use recursion.

Steps:

For the iterativeSum method:

Initialize a variable sum to 0.

Create a for loop that runs from 1 to n (inclusive).

In each iteration, add the loop variable to sum.

Return sum after the loop ends.

For the recursiveSum method:

If n is less than or equal to 1, return n as the base case.

Otherwise, return the sum of n and the result of recursiveSum(n-1).

Requirements:

The methods iterativeSum and recursiveSum should be defined in the Exercise class.

Both methods should accept a single integer n as input and return an integer as output.

Input: An integer n (1 <= n <= 10^6).

Output: An integer that represents the sum of natural numbers up to n.

Examples:

Exercise.iterativeSum(4); // Returns 10
Exercise.iterativeSum(10); // Returns 55
Exercise.recursiveSum(4); // Returns 10
Exercise.recursiveSum(10); // Returns 55
Constraints: n is a natural number and ranges from 1 to 10^6.

Expected Time Complexity: O(n) for both methods, where n is the input number.

Expected Auxiliary Space: O(1) for the iterativeSum method, as it uses a constant amount of space. O(n) for the recursiveSum method, due to the recursive stack space.

Hint: In the iterative method, simply use a for loop to sum all natural numbers up to n. In the recursive method, remember that the sum of first n natural numbers can be calculated as n + sum(n-1).

Note: The recursive method can cause a StackOverflowError for large inputs due to exceeding the stack limit.

