function checkVotingEligibility(age: number): string {
  if (age < 0) {
      return "Invalid Age";
  } else if (age >= 18) {
      return "Eligible to Vote";
  } else {
      return "Not Eligible to Vote";
  }
}
