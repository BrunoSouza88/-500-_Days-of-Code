function nthFibonacci(n: number): number {
  const memo: number[] = [];

  function fibonacci(n: number): number {
      if (n === 0) {
          return 0;
      } else if (n === 1) {
          return 1;
      }

      if (typeof memo[n] === 'undefined') {
          memo[n] = fibonacci(n - 1) + fibonacci(n - 2);
      }

      return memo[n];
  }

  return fibonacci(n);
}