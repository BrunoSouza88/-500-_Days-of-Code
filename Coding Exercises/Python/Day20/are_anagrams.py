def are_anagrams(str1, str2):
    str1 = str1.replace(" ", "").lower()
    str2 = str2.replace(" ", "").lower()

    if len(str1) != len(str2):
        return False

    char_list1 = list(str1)
    char_list2 = list(str2)

    char_list1.sort()
    char_list2.sort()

    return char_list1 == char_list2
