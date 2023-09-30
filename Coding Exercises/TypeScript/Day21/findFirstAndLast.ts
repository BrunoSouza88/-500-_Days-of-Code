function findFirstAndLast(arr: number[], target: number): number[] {
  let result: number[] = [-1, -1];
  for (let i = 0; i < arr.length; i++) {
      if (arr[i] === target) {
          result[0] = i;
          break;
      }
  }
  for (let i = arr.length - 1; i >= 0; i--) {
      if (arr[i] === target) {
          result[1] = i;
          break;
      }
  }
  return result;
}
