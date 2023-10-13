# Maximum Possible Handshakes - Combinatorics
## Introduction: In this challenge, you will implement a function named maxHandshakes that calculates the maximum possible number of handshakes in a group of n people. The concept of handshake problem is a common example of a combinatory problem.

### Steps:

Define a function maxHandshakes which accepts an integer n as its argument.

The formula for the maximum number of handshakes in a group of n people is given by n * (n - 1) / 2.

### Requirements:

The function maxHandshakes should be defined in the Exercise class.

The function maxHandshakes should return the maximum number of handshakes.

#### Input: An integer n representing the number of people in the group.

#### Output: Return the maximum number of handshakes.

Examples:

System.out.println(Exercise.maxHandshakes(5));  // Output: 10
System.out.println(Exercise.maxHandshakes(1));  // Output: 0
System.out.println(Exercise.maxHandshakes(10)); // Output: 45
System.out.println(Exercise.maxHandshakes(100)); // Output: 4950
Constraints:

n will be between 1 and 10^5, inclusive.

Expected Time Complexity: O(1), as the calculation is constant time regardless of the input size.

Expected Auxiliary Space: O(1), no extra space is used.

Hint: The solution to this problem involves the concept of combinatorics. Specifically, you are asked to calculate the number of ways n people can shake hands, which is a problem of combinations.

Note: This problem is an example of a combinatorial problem, which involves counting the number of ways in which a particular event can happen.