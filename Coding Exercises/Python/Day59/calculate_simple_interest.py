def calculate_simple_interest(principal, rate, time):

    if principal < 0 or rate < 0 or time < 0:
        raise ValueError("Inputs must be non-negative")

    simple_interest = (principal * rate * time) / 100.0

    return simple_interest
