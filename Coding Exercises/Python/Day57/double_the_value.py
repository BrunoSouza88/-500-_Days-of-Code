def double_the_value(value):
    return value * 2


def quadruple_the_value(value):
    doubled_value = double_the_value(value)
    return double_the_value(doubled_value)
