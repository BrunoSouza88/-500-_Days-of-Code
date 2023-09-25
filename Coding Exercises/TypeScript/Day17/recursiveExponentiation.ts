function recursiveExponentiation(x: number, n: number): number {
  if (n == 0) {
      return 1;
  }

  if (n > 0) {
      return x * recursiveExponentiation(x, n - 1);
  }

  return 1 / (x * recursiveExponentiation(x, -n - 1));
}
