def swap_numbers(a, b):
    a = a + b
    b = a - b
    a = a - b
    result = [a, b]
    return result


x = 5
y = 10

swapped = swap_numbers(x, y)

print(f"Valores trocados: x = {swapped[0]}, y = {swapped[1]}")
