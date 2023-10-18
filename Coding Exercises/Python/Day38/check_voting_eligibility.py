def check_voting_eligibility(age):
    if age < 0:
        return "Invalid Age"
    elif age >= 18:
        return "Eligible to Vote"
    else:
        return "Not Eligible to Vote"
