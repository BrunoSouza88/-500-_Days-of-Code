Check if Two Arguments are Equal - Equality Check
Introduction: In programming, comparing two values or variables is a common task. But, as simple as it sounds, there are intricacies when dealing with different data types or null values. This challenge will guide you through creating a universal equality checker, which can handle various data types and edge cases.

STEPS:

Check if both arguments are null. If true, they're considered equal.

Check if one of the arguments is null and the other is not. If true, they're not equal.

Use the .equals() method to check the equality of two non-null arguments.

Return the result.

Requirements:

Implement the function areEqual(Object arg1, Object arg2).

The function should return a boolean value.

The function should be able to handle various data types like integers, strings, and other objects.

Input:

Two arguments of type Object, arg1arg1 and arg2arg2.

Output:

A boolean value indicating whether the two arguments are equal.

Examples:

areEqual(5, 5) -> true
areEqual("hello", "hello") -> true
areEqual(null, 5) -> false
areEqual(5, "5") -> false
Constraints:

Arguments can be of any data type.

Arguments can be null.

Expected Time Complexity:

O(1)O(1).

Expected Auxiliary Space:

O(1)O(1).

Hint:

Consider using the .equals() method for comparing non-null objects. It's a reliable method provided by the Object class in Java.

Note:

Remember that the == operator checks if two references point to the same memory location, while the .equals() method checks if two objects are meaningfully equivalent.