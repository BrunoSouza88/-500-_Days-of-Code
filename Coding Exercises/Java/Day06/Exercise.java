package Java.Day06;

public class Exercise {
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input number cannot be negative");
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            return (long)n * factorial(n - 1);
        }
    }
}
