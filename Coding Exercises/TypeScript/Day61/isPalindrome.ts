function isPalindrome(number: number): boolean {
  if (number < 0) {
      return false;
  }

  let originalNumber: number = number;
  let reversedNumber: number = 0;

  while (number > 0) {
      let digit: number = number % 10;
      reversedNumber = reversedNumber * 10 + digit;
      number = Math.floor(number / 10);
  }

  return originalNumber === reversedNumber;
}
