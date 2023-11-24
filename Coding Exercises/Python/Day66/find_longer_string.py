def find_longer_string(str1, str2):
    if str1 is None or str2 is None:
        raise ValueError("Input strings cannot be None")

    length1 = len(str1)
    length2 = len(str2)

    if length1 > length2:
        return str1
    elif length2 > length1:
        return str2
    else:
        return "Both strings are of equal length"
