Generating Multiplication Table - Control Flow and Loops
Introduction: In this challenge, you will implement a function named generateMultiplicationTable that prints the multiplication table for a given number up to 10. Understanding control flow and mastering loops are critical for any programmer, and this exercise helps reinforce these concepts.

Steps:

Define a function generateMultiplicationTable which accepts an integer as its argument.

Using a for loop, iterate from 1 to 10.

In each iteration, print the multiplication of the given number and the current iteration index.

Print the output in the format "num x i = result".

Requirements:

The function generateMultiplicationTable should be defined in the Exercise class.

The function generateMultiplicationTable should print the multiplication table up to 10 for the given integer.

Input: A single integer num for which the multiplication table should be generated.

Output: Print statements for the multiplication table up to 10 for the given integer, in the format "num x i = result".

Examples:

Exercise.generateMultiplicationTable(2); 
// Prints:
// 2 x 1 = 2
// 2 x 2 = 4
// 2 x 3 = 6
// 2 x 4 = 8
// 2 x 5 = 10
// 2 x 6 = 12
// 2 x 7 = 14
// 2 x 8 = 16
// 2 x 9 = 18
// 2 x 10 = 20
Constraints:

The input number will be a positive integer.

Hint: Use a for loop to iterate from 1 to 10. In each iteration, print the multiplication of the given number and the current iteration index.

Note: Remember that in Java, print statements can be executed with System.out.println(). You'll use this method to print the multiplication table.