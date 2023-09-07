def find_smallest_element(arr):
    smallest = float('inf')

    for num in arr:
        if num < smallest:
            smallest = num

    return smallest


def find_smallest_element(arr):
    return min(arr)
