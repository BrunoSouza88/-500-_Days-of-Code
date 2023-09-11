function secondLargest(nums: number[]): number {
  if (nums.length < 2) {
      throw new Error("Input array must have at least two elements");
  }

  let firstLargest: number = Number.NEGATIVE_INFINITY;
  let secondLargest: number = Number.NEGATIVE_INFINITY;

  for (const num of nums) {
      if (num > firstLargest) {
          secondLargest = firstLargest;
          firstLargest = num;
      } else if (num < firstLargest && num > secondLargest) {
          secondLargest = num;
      }
  }

  return secondLargest;
}

// function secondLargest(nums: number[]): number {
//   if (nums.length < 2) {
//       throw new Error("Input array must have at least two elements");
//   }

//   const sortedNums = nums.slice().sort((a, b) => b - a);
//   return sortedNums[1];
// }