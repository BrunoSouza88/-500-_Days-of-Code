def reverse_number(num):
    reversed_num = 0
    sign = 1 if num >= 0 else -1
    num = abs(num)

    while num != 0:
        last_digit = num % 10
        reversed_num = reversed_num * 10 + last_digit
        num = num // 10

    return reversed_num * sign
