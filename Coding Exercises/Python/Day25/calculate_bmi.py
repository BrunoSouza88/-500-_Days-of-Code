def calculate_bmi(weight, height):
    if weight <= 0 or height <= 0:
        raise ValueError("height and weight should be greater than 0")

    bmi_calculated = weight / (height * height)

    return bmi_calculated
