class Exercise {
  static swapNumbers(a: number, b: number): number[] {
      a = a + b;
      b = a - b;
      a = a - b;
      return [a, b];
  }
}