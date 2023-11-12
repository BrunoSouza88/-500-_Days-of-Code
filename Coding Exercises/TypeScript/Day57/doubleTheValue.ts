function doubleTheValue(value: number): number {
  return value * 2;
}

function quadrupleTheValue(value: number): number {
  const doubledValue: number = doubleTheValue(value);
  return doubleTheValue(doubledValue);
}
