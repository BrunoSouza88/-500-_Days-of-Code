def recursive_exponentiation(x, n):
    if n == 0:
        return 1

    if n > 0:
        return x * recursive_exponentiation(x, n - 1)

    return 1 / (x * recursive_exponentiation(x, -n - 1))
