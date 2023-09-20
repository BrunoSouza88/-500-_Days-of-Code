def separate_even_odd(arr):
    if arr is None or len(arr) <= 1:
        return arr

    left = 0
    right = len(arr) - 1

    while left < right:
        while arr[left] % 2 == 0 and left < right:
            left += 1

        while arr[right] % 2 != 0 and left < right:
            right -= 1

        arr[left], arr[right] = arr[right], arr[left]
        left += 1
        right -= 1

    return arr
