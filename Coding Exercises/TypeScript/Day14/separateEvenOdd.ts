function separateEvenOdd(arr: number[]): number[] {
  if (arr === null || arr.length <= 1) {
      return arr;
  }

  let left = 0;
  let right = arr.length - 1;

  while (left < right) {
      while (arr[left] % 2 === 0 && left < right) {
          left++;
      }

      while (arr[right] % 2 !== 0 && left < right) {
          right--;
      }

      [arr[left], arr[right]] = [arr[right], arr[left]];
      left++;
      right--;
  }

  return arr;
}
