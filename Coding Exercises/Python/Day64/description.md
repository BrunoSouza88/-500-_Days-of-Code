
GCD of Two Numbers - Mathematical Operations
Introduction: The Greatest Common Divisor (GCD) of two numbers is the largest number that divides both of them without leaving a remainder. The Euclidean algorithm, which is based on the principle that the GCD of two numbers also divides their difference, is the most common method used to compute the GCD.

STEPS:

If bb becomes zero, then aa becomes the GCD of the original numbers.

Swap the values of aa and bb and repeat step 1 until bb becomes zero.

Requirements:

Implement the function gcd(int a, int b).

The function should return an integer.

The function should handle cases where one or both input numbers are zero.

Input:

Two integers, aa and bb.

Output:

An integer representing the greatest common divisor of aa and bb.

Examples:

gcd(56, 98) -> 14
gcd(15, 5) -> 5
gcd(17, 19) -> 1
gcd(18, 24) -> 6
Constraints:

−109≤a,b≤109−109≤a,b≤109.

Expected Time Complexity:

O(log⁡(min⁡(a,b)))O(log(min(a,b))).

Expected Auxiliary Space:

O(1)O(1).

Hint:

Use the property that gcd(a,b)=gcd(b,amod b)gcd(a,b)=gcd(b,amodb).

Note:

gcd(a,0)=agcd(a,0)=a and gcd(0,b)=bgcd(0,b)=b.

gcd(0,0)gcd(0,0) is undefined, but for the purposes of this exercise, you can return 0.