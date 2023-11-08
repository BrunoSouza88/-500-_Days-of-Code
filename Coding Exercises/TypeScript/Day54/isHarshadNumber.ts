function isHarshadNumber(n: number): boolean {
  if (n <= 0) {
      return false;
  }

  let sum = 0;
  let originalN = n;
  while (n > 0) {
      const digit = n % 10;
      sum += digit;
      n = Math.floor(n / 10);
  }

  return originalN % sum === 0;
}
