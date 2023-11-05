def power(base: float, exponent: int) -> float:
    if base == 0 and exponent < 0:
        raise ValueError("Base cannot be 0 when the exponent is negative.")

    if exponent >= 0:
        return pow(base, exponent)
    else:
        result = 1.0
        for i in range(abs(exponent)):
            result /= base
        return result


print(power(2.0, 3))
print(power(3.0, 2))
print(power(5.0, 0))
print(power(2.0, -2))
