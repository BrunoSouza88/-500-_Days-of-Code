function isSelfDividing(number: number): boolean {
  if (number === 0) {
      return false;
  }

  const numStr: string = number.toString();

  for (let i = 0; i < numStr.length; i++) {
      const digit: number = parseInt(numStr.charAt(i));

      if (digit === 0 || number % digit !== 0) {
          return false;
      }
  }

  return true;
}
