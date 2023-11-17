def isPalindrome(number):
    if number < 0:
        return False

    originalNumber = number
    reversedNumber = 0
    while number > 0:
        digit = number % 10
        reversedNumber = reversedNumber * 10 + digit
        number //= 10

    return originalNumber == reversedNumber
