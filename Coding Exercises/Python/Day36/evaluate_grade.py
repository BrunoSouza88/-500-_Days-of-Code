def evaluate_grade(marks):
    if marks < 0 or marks > 100:
        return "Invalid"
    elif marks < 40:
        return "Fail"
    else:
        return "Pass"
