function countDigits(number: number): number {
  if (number < 0) {
      number = -number;
  }

  if (number === 0) {
      return 1;
  }

  const count: number = Math.floor(Math.log10(number)) + 1;

  return count;
}