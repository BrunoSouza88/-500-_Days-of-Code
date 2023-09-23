function sumOfExtremes(arr: number[]): number {
  if (!arr || arr.length === 0) {
      throw new Error("Input array is empty");
  }

  let min = arr[0];
  let max = arr[0];

  for (let i = 1; i < arr.length; i++) {
      if (arr[i] < min) {
          min = arr[i];
      }

      if (arr[i] > max) {
          max = arr[i];
      }
  }

  return min + max;
}
