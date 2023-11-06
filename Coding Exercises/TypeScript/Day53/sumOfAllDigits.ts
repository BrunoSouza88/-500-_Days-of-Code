function sumOfAllDigits(num: number): number {
  num = Math.abs(num);
  let totalSum = 0;

  while (num > 0) {
      const digit = num % 10;
      totalSum += digit;
      num = Math.floor(num / 10);
  }

  return totalSum;
}
