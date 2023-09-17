def toggle_case(s):
    toggled_string = ""

    for char in s:
        if char.isupper():
            toggled_string += char.lower()
        elif char.islower():
            toggled_string += char.upper()
        else:
            toggled_string += char

    return toggled_string
