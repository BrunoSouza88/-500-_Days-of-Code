def is_self_dividing(number):
    if number == 0:
        return False

    num_str = str(number)

    for digit_str in num_str:
        digit = int(digit_str)

        if digit == 0 or number % digit != 0:
            return False

    return True
