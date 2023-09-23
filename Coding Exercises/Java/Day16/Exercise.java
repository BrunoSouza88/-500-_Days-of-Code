package Java.Day16;

public class Exercise {
    public static int sumOfExtremes(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Input array is empty");
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return min + max;
    }

}
