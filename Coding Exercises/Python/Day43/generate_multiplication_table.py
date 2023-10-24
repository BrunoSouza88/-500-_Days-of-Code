def generate_multiplication_table(num):
    for index in range(1, 11):
        result = num * index
        print(f"{num} x {index} = {result}")
