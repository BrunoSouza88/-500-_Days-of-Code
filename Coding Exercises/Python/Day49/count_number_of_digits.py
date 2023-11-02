def count_number_of_digits(num):
    if num == 0:
        return 1

    count = 0

    if num < 0:
        num = -num

    while num > 0:
        num = num // 10
        count += 1

    return count
