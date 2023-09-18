class Exercise:
    @staticmethod
    def count_digit_frequency(number, digit):
        count = 0

        while number != 0:
            last_digit = number % 10

            if last_digit == digit:
                count += 1

            number //= 10

        return count
