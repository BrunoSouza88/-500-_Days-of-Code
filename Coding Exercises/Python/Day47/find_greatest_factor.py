def find_greatest_factor(num):
    greatestFactor = 1

    for i in range(2, num):
        if num % i == 0:
            greatestFactor = i

    return greatestFactor
