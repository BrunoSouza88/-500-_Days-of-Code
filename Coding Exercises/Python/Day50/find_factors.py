import math


def find_factors(num):
    factors = []

    if num <= 0:
        return factors

    limit = int(math.sqrt(num))

    for i in range(1, limit + 1):
        if num % i == 0:
            factors.append(i)
            if i != num // i:
                factors.append(num // i)

    factors.sort()

    return factors
