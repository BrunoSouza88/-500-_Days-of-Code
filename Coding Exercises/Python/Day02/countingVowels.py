class Exercise:
    @staticmethod
    def count_vowels(string: str) -> int:
        import re
        return len(re.sub(r'[^aeiouAEIOU]', '', string))
