Employee Bonus - Class and Object Handling
Introduction: In this challenge, you'll implement a class named Employee with certain attributes and methods. You'll define methods to set and retrieve these attributes, and calculate the bonus for an employee based on the employee's salary and bonus percentage.

Steps:

Create a public class Exercise and define a static class Employee inside it.

Define private attributes: name (String), salary (double), and bonusPercentage (double).

Create a constructor for the Employee class that accepts these three attributes and initializes them.

Define a public method calculateBonus() inside the Employee class that calculates and returns the bonus amount.

Requirements:

The Employee class should be defined inside the Exercise class.

The Employee class should have a constructor to initialize name, salary, and bonusPercentage.

The Employee class should have a method calculateBonus() to calculate and return the bonus.

Input: An Employee object with name (String), salary (double), and bonusPercentage (double).

Output: The calculateBonus() method should return a double representing the bonus amount.

Examples:

Exercise.Employee employee1 = new Exercise.Employee("John Doe", 2000, 10);
employee1.calculateBonus(); // Returns 200.0
 
Exercise.Employee employee2 = new Exercise.Employee("Jane Doe", 5000, 20);
employee2.calculateBonus(); // Returns 1000.0
Constraints:

name is a non-empty string of length up to 100.

salary is a non-negative number.

bonusPercentage is a non-negative number.

Expected Time Complexity: O(1), as calculating bonus is a constant time operation.

Expected Auxiliary Space: O(1), as no additional space is required.

Hint: Encapsulation is one of the fundamental principles of Object-Oriented Programming (OOP). Use private attributes and public methods to implement it.

Note: The bonus is calculated as a percentage of the salary. If the salary or bonus percentage is zero, the bonus amount will also be zero.