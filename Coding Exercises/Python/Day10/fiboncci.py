def nth_fibonacci(n):
    memo = [-1] * (n + 1)

    def fibonacci(n):
        if n == 0:
            return 0
        elif n == 1:
            return 1

        if memo[n] == -1:
            memo[n] = fibonacci(n - 1) + fibonacci(n - 2)

        return memo[n]

    return fibonacci(n)
