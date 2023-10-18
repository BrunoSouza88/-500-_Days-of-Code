Check Eligibility for Voting - Conditional Operations
Introduction: In this challenge, you will implement a function named checkVotingEligibility that determines whether a person is eligible to vote based on their age. In many countries, the legal voting age is 18, so we'll use this as our threshold. The function will return a message indicating the voting eligibility.

Steps:

Define a function checkVotingEligibility which accepts an integer representing a person's age.

Use an if statement to check if the age is less than 0, if so, return "Invalid Age".

Use an else if statement to check if the age is 18 or more, if so, return "Eligible to Vote".

If neither of the above conditions are met, return "Not Eligible to Vote".

Requirements:

The function checkVotingEligibility should be defined in the Exercise class.

The function checkVotingEligibility should return a string indicating the voting eligibility.

Input: An integer age.

Output: A string that represents the voting eligibility: "Eligible to Vote", "Not Eligible to Vote", or "Invalid Age".

Examples:

Exercise.checkVotingEligibility(20); // Returns "Eligible to Vote"
Exercise.checkVotingEligibility(17); // Returns "Not Eligible to Vote"
Exercise.checkVotingEligibility(-5); // Returns "Invalid Age"
Exercise.checkVotingEligibility(18); // Returns "Eligible to Vote"
Constraints: The age input can be any integer, representing the age of a person in years.

Expected Time Complexity: O(1), as we are simply making a few comparisons.

Expected Auxiliary Space: O(1), no additional space is required.

Hint: Consider using if and else if statements to perform different checks on the age.

Note: In this problem, we are assuming that the legal voting age is 18. If the age is less than 0, we return "Invalid Age", as age cannot be negative.