import math


def area_of_circle(radius):
    if radius < 0:
        raise ValueError("Radius cannot be negative")

    area = math.pi * radius**2
    return area
