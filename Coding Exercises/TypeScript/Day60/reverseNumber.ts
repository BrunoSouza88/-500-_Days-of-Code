function reverseNumber(num: number): number {
  let reversedNum: number = 0;
  const sign: number = (num >= 0) ? 1 : -1;
  num = Math.abs(num);

  while (num !== 0) {
      const lastDigit: number = num % 10;
      reversedNum = reversedNum * 10 + lastDigit;
      num = Math.floor(num / 10);
  }

  return reversedNum * sign;
}
