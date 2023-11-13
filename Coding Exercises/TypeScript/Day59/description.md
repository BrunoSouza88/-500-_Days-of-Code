Calculate Simple Interest - Mathematical Operations
Introduction: Simple interest is one of the most fundamental concepts in finance. It represents the amount of interest earned or paid on a principal amount over a specific period. The ability to calculate simple interest is essential for various financial calculations, from savings to loans.

STEPS:

Validate the inputs to ensure they are non-negative. If any of the inputs (principal, rate, or time) is negative, throw an IllegalArgumentException.

Apply the simple interest formula: Simple Interest=Principal×Rate×Time100Simple Interest=100Principal×Rate×Time​.

Return the calculated simple interest.

Requirements:

Implement the function calculateSimpleInterest(double principal, double rate, double time).

The function should return a double.

The function should throw an IllegalArgumentException if any of the inputs are negative.

Input:

A double representing the principal amount.

A double representing the rate of interest (as a percentage).

A double representing the time (in years).

Output:

A double representing the calculated simple interest.

Examples:

calculateSimpleInterest(1000, 5, 3) -> 150.0
calculateSimpleInterest(2000, 3, 4) -> 240.0
calculateSimpleInterest(500, 7, 2) -> 70.0
Constraints:

All inputs will be non-negative.

The rate of interest will be between 0 and 100 inclusive.

Time can be represented as a fraction (for example, 1.5 years).

Expected Time Complexity:

O(1)O(1).

Expected Auxiliary Space:

O(1)O(1).

Hint:

The formula for simple interest is straightforward. Ensure you handle input validations properly to avoid calculations on invalid data.

Note:

Always validate your inputs. In financial calculations, it's especially crucial to ensure data integrity.

