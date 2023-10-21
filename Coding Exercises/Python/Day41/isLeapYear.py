def isLeapYear(year):
    if year % 4 != 0:
        return False

    if year % 100 == 0:
        if year % 400 == 0:
            return True
        else:
            return False

    return True
