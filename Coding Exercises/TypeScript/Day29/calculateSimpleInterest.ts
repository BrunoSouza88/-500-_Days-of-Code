function calculateSimpleInterest(principal: number, rate: number, time: number): number {
  if (principal === 0.0 || rate === 0.0 || time === 0.0) {
      return 0.0;
  }

  const simpleInterest: number = (principal * rate * time) / 100.0;

  return simpleInterest;
}
