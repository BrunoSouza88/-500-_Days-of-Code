function separateZeroAndOne(arr: number[]): void {
  let countZeros = 0;

  for (let i = 0; i < arr.length; i++) {
      if (arr[i] === 0) {
          countZeros++;
      }
  }

  for (let i = 0; i < countZeros; i++) {
      arr[i] = 0;
  }

  for (let i = countZeros; i < arr.length; i++) {
      arr[i] = 1;
  }
}
