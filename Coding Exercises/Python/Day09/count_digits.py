import math


def count_digits(number):
    if number < 0:
        number = -number

    if number == 0:
        return 1

    count = int(math.floor(math.log10(number)) + 1)

    return count
