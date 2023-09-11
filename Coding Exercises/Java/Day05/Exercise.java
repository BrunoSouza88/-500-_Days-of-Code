package Java.Day05;

public class Exercise {
    public static int secondLargest(int[] nums) {
        if (nums.length < 2) {
            throw new IllegalArgumentException("Input array must have at least two elements");
        }

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num < firstLargest && num > secondLargest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }
}