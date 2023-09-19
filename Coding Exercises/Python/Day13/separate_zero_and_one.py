def separate_zero_and_one(arr):
    count_zeros = 0

    for i in range(len(arr)):
        if arr[i] == 0:
            count_zeros += 1

    for i in range(count_zeros):
        arr[i] = 0

    for i in range(count_zeros, len(arr)):
        arr[i] = 1
