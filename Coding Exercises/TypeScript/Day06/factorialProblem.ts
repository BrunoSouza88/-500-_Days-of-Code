function factorial(n: number): number {
  if (n < 0) {
      throw new Error("Input number cannot be negative");
  } else if (n === 0 || n === 1) {
      return 1;
  } else {
      return n * factorial(n - 1);
  }
}
