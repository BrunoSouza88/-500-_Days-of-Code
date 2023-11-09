def is_abundant(num):
    if num <= 0:
        raise ValueError("Input number must be a positive integer")

    sum_of_divisors = 1

    for i in range(2, int(num**0.5) + 1):
        if num % i == 0:
            sum_of_divisors += i
            if i != num // i:
                sum_of_divisors += num // i

    return sum_of_divisors > num
