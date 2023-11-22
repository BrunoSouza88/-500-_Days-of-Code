LCM of Two Numbers - Mathematical Operations
Introduction: The Least Common Multiple (LCM) of two numbers is the smallest number that can be divided by both numbers without leaving a remainder. Finding the LCM is a fundamental mathematical operation with various applications, especially in problems related to fractions, time intervals, or synchronized tasks.

STEPS:

Check if either of the two numbers is zero. If so, return zero as the LCM.

Utilize the relationship between the Greatest Common Divisor (GCD) and LCM: LCM(a,b)=a×bGCD(a,b)LCM(a,b)=GCD(a,b)a×b​.

Implement a helper function to find the GCD of two numbers using the Euclidean algorithm.

Compute the LCM using the formula and the GCD helper function.

Requirements:

Implement the function lcm(int a, int b).

The function should return an integer representing the LCM of two numbers.

The function should handle edge cases like when one or both numbers are zero.

Input:

Two integers, aa and bb.

Output:

An integer representing the LCM of aa and bb.

Examples:

lcm(12, 15) -> 60
lcm(6, 7) -> 42
lcm(10, 10) -> 10
Constraints:

The given integers aa and bb will be between −109−109 and 109109.

Expected Time Complexity:

O(log⁡min⁡(a,b))O(logmin(a,b)).

Expected Auxiliary Space:

O(1)O(1).

Hint:

The relationship between GCD and LCM can simplify the process. Remember the formula: LCM(a,b)=a×bGCD(a,b)LCM(a,b)=GCD(a,b)a×b​.

Note:

Be cautious about the potential for overflow when multiplying two large numbers.