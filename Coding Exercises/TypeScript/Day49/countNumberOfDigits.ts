function countNumberOfDigits(num: number): number {
  if (num === 0) {
      return 1;
  }

  let count = 0;

  if (num < 0) {
      num = -num;
  }

  while (num > 0) {
      num = Math.floor(num / 10);
      count++;
  }

  return count;
}
