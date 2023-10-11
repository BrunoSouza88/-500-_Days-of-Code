def calculate_simple_interest(principal, rate, time):
    if principal == 0.0 or rate == 0.0 or time == 0.0:
        return 0.0

    simple_interest = (principal * rate * time) / 100.0

    return simple_interest
