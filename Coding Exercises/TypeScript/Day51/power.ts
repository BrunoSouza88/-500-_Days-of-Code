function power(base: number, exponent: number): number {
  if (base === 0 && exponent < 0) {
      throw new Error("Base cannot be 0 when the exponent is negative.");
  }

  if (exponent >= 0) {
      return Math.pow(base, exponent);
  } else {
      let result = 1.0;
      for (let i = 0; i < Math.abs(exponent); i++) {
          result /= base;
      }
      return result;
  }
}
