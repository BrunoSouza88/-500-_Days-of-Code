def secondLargest(nums):
    if len(nums) < 2:
        raise ValueError("Input list must have at least two elements")

    firstLargest = float('-inf')
    secondLargest = float('-inf')

    for num in nums:
        if num > firstLargest:
            secondLargest = firstLargest
            firstLargest = num
        elif num < firstLargest and num > secondLargest:
            secondLargest = num

    return secondLargest

# def secondLargest(nums):
#     if len(nums) < 2:
#         raise ValueError("Input list must have at least two elements")

#     sorted_nums = sorted(nums, reverse=True)
#     return sorted_nums[1]
