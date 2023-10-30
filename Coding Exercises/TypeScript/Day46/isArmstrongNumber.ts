function isArmstrongNumber(num: number): boolean {
  let originalNumber: number = num;
  let result: number = 0;
  let n: number = 0;

  while (originalNumber !== 0) {
      originalNumber = Math.floor(originalNumber / 10);
      n++;
  }

  originalNumber = num;

  while (originalNumber !== 0) {
      const remainder: number = originalNumber % 10;
      result += Math.pow(remainder, n);
      originalNumber = Math.floor(originalNumber / 10);
  }

  return result === num;
}
