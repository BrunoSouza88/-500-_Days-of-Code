package Java.Day48;

import java.util.Arrays;

public class Exercise {
    public static int[] filterMultiplesOfEight(int[] arr) {
        int[] result = Arrays.stream(arr)
            .filter(num -> num % 8 != 0)
            .toArray();
        
        return result;
    }
}
