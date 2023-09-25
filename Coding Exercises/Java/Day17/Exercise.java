package Java.Day17;

public class Exercise {
    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        }

        if (n > 0) {
            return x * power(x, n - 1);
        }
        
        return 1 / (x * power(x, -n - 1));
    }
}
