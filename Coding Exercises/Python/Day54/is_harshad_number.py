def is_harshad_number(n: int) -> bool:
    if n <= 0:
        return False

    sum = 0
    originalN = n
    while n > 0:
        digit = n % 10
        sum += digit
        n = n // 10

    return originalN % sum == 0
