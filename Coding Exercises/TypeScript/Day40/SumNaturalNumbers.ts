function iterativeSum(n: number): number {
  let sum = 0;

  for (let i = 1; i <= n; i++) {
      sum += i;
  }

  return sum;
}

function recursiveSum(n: number): number {
  if (n <= 1) {
      return n;
  } else {
      return n + recursiveSum(n - 1);
  }
}
