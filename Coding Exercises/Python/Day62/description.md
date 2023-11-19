Check Prime Number - Number Theory
Introduction: A prime number is a whole number greater than 1 whose only factors are 1 and itself. The task here is to check if a given number is prime. Understanding the properties of prime numbers and devising efficient algorithms to identify them is a foundational concept in number theory, which has applications in areas like cryptography.

STEPS:

If the number is less than or equal to 1, return false (not prime).

If the number is less than or equal to 3, return true (prime).

If the number is divisible by 2 or 3, return false.

Start from 5 and check divisibility until the square root of the number. The step would be 6, checking both i and i+2 for divisibility.

If no divisibility found, return true.

Requirements:

Implement the function isPrime(int n).

The function should return a boolean.

The function should efficiently determine whether the input number is prime or not.

Input:

A single integer, nn.

Output:

A boolean value: true if nn is prime, false otherwise.

Examples:

isPrime(2) -> true
isPrime(4) -> false
isPrime(17) -> true
isPrime(25) -> false
Constraints:

1≤n≤1071≤n≤107.

Expected Time Complexity:

O(n)O(n

​) on average.

Expected Auxiliary Space:

O(1)O(1).

Hint:

All primes are of the form 6k±16k±1 except 2 and 3. This is because all integers can be expressed as 6k+i6k+i where i=−1,0,1,2,3,i=−1,0,1,2,3, or 44. Notice that 6k±16k±1 are the only forms that could be prime.

Note:

The algorithm can be further optimized, but this approach offers a good balance between simplicity and performance.

