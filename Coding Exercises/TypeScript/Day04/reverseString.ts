class Exercise {
  static reverseString(str: string): string {
    const stringOne = str.split('').reverse().join('');
    return stringOne;
  }
}