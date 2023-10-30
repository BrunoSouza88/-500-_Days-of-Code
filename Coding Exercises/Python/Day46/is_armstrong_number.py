def is_armstrong_number(num):
    original_number, result, n = num, 0, 0

    while original_number != 0:
        original_number //= 10
        n += 1

    original_number = num

    while original_number != 0:
        remainder = original_number % 10
        result += remainder ** n
        original_number //= 10

    return result == num
