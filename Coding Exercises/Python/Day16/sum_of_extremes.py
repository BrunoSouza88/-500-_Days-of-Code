def sum_of_extremes(arr):
    if not arr:
        raise ValueError("Input list is empty")

    min_val = arr[0]
    max_val = arr[0]

    for num in arr[1:]:
        if num < min_val:
            min_val = num

        if num > max_val:
            max_val = num

    return min_val + max_val
