def join_strings(str1, str2):
    if str1 is None or str2 is None:
        raise ValueError("Input strings cannot be None")

    result = str1 + str2

    return result
