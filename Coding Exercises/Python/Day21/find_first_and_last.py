def find_first_and_last(arr, target):
    result = [-1, -1]
    for i in range(len(arr)):
        if arr[i] == target:
            result[0] = i
            break
    for i in range(len(arr)-1, -1, -1):
        if arr[i] == target:
            result[1] = i
            break
    return result
