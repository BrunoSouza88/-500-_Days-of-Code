def sum_of_all_digits(num):
    num = abs(num)
    total_sum = 0

    while num > 0:
        digit = num % 10
        total_sum += digit
        num //= 10

    return total_sum
