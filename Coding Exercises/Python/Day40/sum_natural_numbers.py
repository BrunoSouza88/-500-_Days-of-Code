def iterativeSum(n):
    sum = 0

    for i in range(1, n + 1):
        sum += i

    return sum


def recursiveSum(n):
    if n <= 1:
        return n
    else:
        return n + recursiveSum(n - 1)
