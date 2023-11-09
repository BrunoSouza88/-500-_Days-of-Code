function isAbundant(num: number): boolean {
  if (num <= 0) {
      throw new Error("Input number must be a positive integer");
  }

  let sumOfDivisors = 1;

  for (let i = 2; i * i <= num; i++) {
      if (num % i === 0) {
          sumOfDivisors += i;
          if (i !== num / i) {
              sumOfDivisors += num / i;
          }
      }
  }

  return sumOfDivisors > num;
}
