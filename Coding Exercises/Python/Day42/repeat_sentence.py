def repeat_sentence(sentence):
    result = ""

    for index in range(3):
        result += sentence
        if index < 2:
            result += " "

    return result.strip()
