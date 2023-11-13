function calculateSimpleInterest(principal: number, rate: number, time: number): number {

  if (principal < 0 || rate < 0 || time < 0) {
      throw new Error("Inputs must be non-negative");
  }

  const simpleInterest: number = (principal * rate * time) / 100.0;

  return simpleInterest;
}

