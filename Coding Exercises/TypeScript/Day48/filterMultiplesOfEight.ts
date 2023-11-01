function filterMultiplesOfEight(arr: number[]): number[] {
  const result = arr.filter(num => num % 8 !== 0);
  return result;
}
