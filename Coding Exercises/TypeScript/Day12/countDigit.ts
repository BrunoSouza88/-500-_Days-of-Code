class Exercise {
  static countDigitFrequency(number: number, digit: number): number {
      let count: number = 0;

      while (number !== 0) {
          const lastDigit: number = number % 10;

          if (lastDigit === digit) {
              count++;
          }

          number = Math.floor(number / 10);
      }

      return count;
  }
}