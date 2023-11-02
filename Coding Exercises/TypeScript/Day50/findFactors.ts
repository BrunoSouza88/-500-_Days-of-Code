function findFactors(num: number): number[] {
  let factors: number[] = [];

  if (num <= 0) {
      return factors;
  }

  let limit = Math.floor(Math.sqrt(num));

  for (let i = 1; i <= limit; i++) {
      if (num % i === 0) {
          factors.push(i);
          if (i !== num / i) {
              factors.push(num / i);
          }
      }
  }

  factors.sort((a, b) => a - b);

  return factors;
}
