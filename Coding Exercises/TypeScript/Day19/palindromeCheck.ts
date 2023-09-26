function isPalindrome(string: string): boolean {
  let start: number = 0;
  let end: number = string.length - 1;

  while (start < end) {
      if (string.charAt(start) != string.charAt(end)) {
          return false;
      }
      start += 1;
      end -= 1;
  }

  return true;
}
