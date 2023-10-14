Divide Chocolates Among Children - Array Operations
Introduction: In this challenge, you will implement a function named distributeChocolates that evenly distributes a given number of chocolates among a certain number of children. This is a great way to practice array operations and control flow statements in Java.

Steps:

Define a function distributeChocolates that accepts an integer array representing chocolates and an integer representing the number of children.

Calculate the number of chocolates per child by dividing the total number of chocolates by the number of children.

Initialize an array to store the distribution of chocolates. Each element of this array should be the number of chocolates each child will receive.

Iterate over the children, and for each child, assign the number of chocolates they will receive.

After the iteration, return the distribution array.

Requirements:

The function distributeChocolates should be defined in the Exercise class.

The function distributeChocolates should return an integer array representing the distribution of chocolates.

Input:

An integer array chocolates (1 <= chocolates.length <= 10^6)

An integer numChildren representing the number of children (1 <= numChildren <= 10^6)

Output: An integer array representing the distribution of chocolates among the children. Each element in the array indicates how many chocolates each child received.

Examples:

Exercise.distributeChocolates(new int[]{1, 2, 3, 4}, 2); // Returns [2, 2]
Exercise.distributeChocolates(new int[]{1, 2, 3}, 3); // Returns [1, 1, 1]
Exercise.distributeChocolates(new int[]{}, 4); // Returns [0, 0, 0, 0]
Exercise.distributeChocolates(new int[]{1, 2, 3, 4}, 1); // Returns [4]
Constraints:

All chocolates are identical. It is not necessary to distribute the exact same chocolates given in the input array, but only an equal number of chocolates to each child.

If there are not enough chocolates for each child to get at least one, the children get zero chocolates.

Expected Time Complexity: O(n), where n is the number of children.

Expected Auxiliary Space: O(n), where n is the number of children.

Hint: You can distribute the chocolates equally by calculating the total number of chocolates and dividing it by the total number of children.

Note: The solution assumes that all chocolates are identical, so you don't need to distribute the exact same chocolates that you received as input. Instead, you need to ensure that an equal number of chocolates is distributed to each child.

