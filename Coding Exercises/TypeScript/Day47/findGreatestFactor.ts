function findGreatestFactor(num: number): number {
  let greatestFactor = 1;

  for (let i = 2; i < num; i++) {
      if (num % i === 0) {
          greatestFactor = i;
      }
  }

  return greatestFactor;
}
